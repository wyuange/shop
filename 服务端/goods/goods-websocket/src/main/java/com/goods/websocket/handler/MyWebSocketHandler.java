package com.goods.websocket.handler;

import static org.hamcrest.CoreMatchers.endsWith;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.goods.manager.pojo.TbMessage;
import com.goods.message.service.WebSocketService;
import com.goods.mina.session.SessionManager;
import com.goods.tools.common.util.JsonUtils;

public class MyWebSocketHandler extends TextWebSocketHandler {
	@Autowired
	private WebSocketService webSocketService;

	public static final Map<String, WebSocketSession> userSocketSessionMap;

	static {
		userSocketSessionMap = new HashMap<String, WebSocketSession>();
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		super.handleTextMessage(session, message);
		// Long userId = Long.parseLong(message.getPayload());// 用户id
		System.out.println(message.getPayload());
		// 向客服端发送消息
		String[] meStrings = message.getPayload().split(",");
		String mString = null;
		if (meStrings[1].equals("回复")) {
			mString = "互动消息";
		} else {
			mString = "交易消息" + "," + meStrings[1];
		}
		SessionManager.getInstance().writeToClient(mString, Long.parseLong(meStrings[0]));
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {

		if (session.getAttributes().get("userId") != null) {
			// 获取用户key
			String key = (String) session.getAttributes().get("userId");
			if (userSocketSessionMap.get(key) == null) {
				userSocketSessionMap.put(key, session);
				TbMessage message = webSocketService.get(Long.parseLong(key));
				// 首次访问看看是否是有数据保存在数据库中
				if (message != null) {
					// 发送数据
					// 封装成json格式的数据在发送
					String json = JsonUtils.objectToJson(message);
					session.sendMessage(new TextMessage(json));
					// 删除记录
					webSocketService.delete(Long.parseLong(key));
				}
			}
		}
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		System.out.println("错误:"+exception.getMessage());
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		// 移除Socket会话
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				System.out.println("Socket会话已经移除:用户ID" + entry.getKey());
				break;
			}
		}
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("Websocket:" + session.getId() + "已经关闭");
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();
		// 移除Socket会话
		while (it.hasNext()) {
			Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().getId().equals(session.getId())) {
				userSocketSessionMap.remove(entry.getKey());
				System.out.println("Socket会话已经移除:用户ID" + entry.getKey());
				break;
			}
		}
	}

	@Override
	public boolean supportsPartialMessages() {
		return false;
	}

	// 单发
	public void broadcaseTopersonal(final TextMessage message, final String userId) throws IOException {
		if (userSocketSessionMap.get(userId) != null) {
			final WebSocketSession session = userSocketSessionMap.get(userId);
			if (session.isOpen()) {
				new Thread(new Runnable() {

					public void run() {
						// 向该用户发送消息
						try {
							session.sendMessage(message);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		} else {
			// 用户没有进行连接
			// 将信息存进数据库中，以便连接时返回数据
			TbMessage tbm = webSocketService.get(Long.parseLong(userId));
			if (tbm != null) {
				// 更新
				tbm.setCount(tbm.getCount() + 1);
				if (message.getPayload().equals("订单")) {
					// 设置订单
					if (tbm.getOrdernum() == null) {
						tbm.setOrdernum(1);
					} else {
						tbm.setOrdernum(tbm.getOrdernum() + 1);
					}
				} else if (message.getPayload().equals("评论")) {
					// 设置评论
					if (tbm.getCommentsnum() == null) {
						tbm.setCommentsnum(1);
					} else {
						tbm.setCommentsnum(tbm.getCommentsnum() + 1);
					}
				} else {
					// 设置回复
					if (tbm.getReplynum() == null) {
						tbm.setReplynum(1);
					} else {
						tbm.setReplynum(tbm.getReplynum() + 1);
					}
				}
				webSocketService.update(tbm);
			} else {
				// 新增
				TbMessage tbMessage = new TbMessage();
				tbMessage.setMuserid(Long.parseLong(userId));
				if (tbMessage.getCount() == null) {
					tbMessage.setCount(1);
				} else {
					tbMessage.setCount(tbMessage.getCount() + 1);// 设置总数量
				}
				if (message.getPayload().equals("订单")) {
					// 设置订单
					tbMessage.setOrdernum(1);
				} else if (message.getPayload().equals("评论")) {
					// 设置评论
					tbMessage.setCommentsnum(1);
				} else {
					// 设置回复
					tbMessage.setReplynum(1);
				}
				webSocketService.save(tbMessage);// 保存到数据库中，方便连接时显示
			}

		}
	}

	// 群发
	public void broadcast(final TextMessage message) throws IOException {
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();

		// 多线程群发
		while (it.hasNext()) {

			final Entry<String, WebSocketSession> entry = it.next();

			if (entry.getValue().isOpen()) {
				new Thread(new Runnable() {

					public void run() {
						try {
							if (entry.getValue().isOpen()) {
								entry.getValue().sendMessage(message);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}).start();
			}

		}
	}

	/**
	 * 给所有在线用户的实时工程检测页面发送消息
	 * 
	 * @param message
	 * @throws IOException
	 */
	public void sendMessageToJsp(final TextMessage message, String type) throws IOException {
		Iterator<Entry<String, WebSocketSession>> it = userSocketSessionMap.entrySet().iterator();

		// 多线程群发
		while (it.hasNext()) {

			final Entry<String, WebSocketSession> entry = it.next();
			if (entry.getValue().isOpen() && entry.getKey().contains(type)) {
				new Thread(new Runnable() {

					public void run() {
						try {
							if (entry.getValue().isOpen()) {
								entry.getValue().sendMessage(message);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

				}).start();
			}

		}
	}
}
