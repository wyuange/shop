/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-10 11:47:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>后台管理系统 - 主页</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("<link href=\"css/bootstrap.min14ed.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/font-awesome.min93e3.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.min862f.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\"\r\n");
      out.write("\tstyle=\"overflow: hidden\">\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<!--左侧导航开始-->\r\n");
      out.write("\t\t<nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"nav-close\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-times-circle\"></i>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"sidebar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-header\">\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown profile-element\">\r\n");
      out.write("\t\t\t\t\t\t<span><img alt=\"image\" class=\"img-circle\"\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\twidth=50px height=50px /></span> <a data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-toggle\" href=\"#\"> <span class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block m-t-xs\"><strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</strong></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-muted text-xs block\">");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("<b class=\"caret\"></b></span>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu animated fadeInRight m-t-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"login.html\">安全退出</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"logo-element\">宝+</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!--卖家显示-->\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<!--如果是管理员，增加几个功能-->\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!--左侧导航结束-->\r\n");
      out.write("\t\t<!--右侧部分开始-->\r\n");
      out.write("\t\t<div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("\t\t\t<div class=\"row border-bottom\">\r\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-static-top\" role=\"navigation\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-bottom: 0\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \"\r\n");
      out.write("\t\t\t\t\t\thref=\"#\"><i class=\"fa fa-bars\"></i> </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle count-info\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-bell\"></i> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"label label-primary\" id=\"news\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/page/order\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"J_menuItem message neworder\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t新订单<span class=\"label label-primary\" id=\"neworder\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/page/show/comments\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"J_menuItem message newcomments\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t新评论<span class=\"label label-primary\" id=\"newcomments\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/page/show/comments\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"J_menuItem message newreply\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t新回复<span class=\"label label-primary\" id=\"newreply\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row content-tabs\">\r\n");
      out.write("\t\t\t\t<button class=\"roll-nav roll-left J_tabLeft\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-backward\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<nav class=\"page-tabs J_menuTabs\">\r\n");
      out.write("\t\t\t\t<div class=\"page-tabs-content\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" class=\"active J_menuTab\"\r\n");
      out.write("\t\t\t\t\t\tdata-id=\"index_v1.html\">首页</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t<button class=\"roll-nav roll-right J_tabRight\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-forward\"></i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<div class=\"btn-group roll-nav roll-right\">\r\n");
      out.write("\t\t\t\t\t<button class=\"dropdown J_tabClose\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t关闭操作<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<ul role=\"menu\" class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"J_tabShowActive\"><a>定位当前选项卡</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"J_tabCloseAll\"><a>关闭全部选项卡</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"J_tabCloseOther\"><a>关闭其他选项卡</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"login.html\" class=\"roll-nav roll-right J_tabExit\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa fa-sign-out\"></i>退出</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row J_mainContent\" id=\"content-main\">\r\n");
      out.write("\t\t\t\t<iframe class=\"J_iframe\" name=\"iframe0\" width=\"100%\" height=\"100%\"\r\n");
      out.write("\t\t\t\t\tsrc=\"/index/showdatas\" frameborder=\"0\" data-id=\"index_v1.html\"\r\n");
      out.write("\t\t\t\t\tseamless></iframe>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--右侧部分结束-->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("\t\t<script src=\"js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/plugins/layer/layer.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/hplus.min.js?v=4.1.0\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/contabs.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"http://cdn.sockjs.org/sockjs-0.3.min.js\"></script>\r\n");
      out.write("\t\t<!--websocket-->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction setContent() {\r\n");
      out.write("\t\t\t\tif ($(\"#news\").html() == \"\") {\r\n");
      out.write("\t\t\t\t\t$(\"#news\").html(\"1\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tvar value = parseInt($(\"#news\").html()) + 1;\r\n");
      out.write("\t\t\t\t\t$(\"#news\").html(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#news\").html(value);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar ws;\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\tws = new WebSocket(\"ws://localhost:8087/dwr/websocket\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t/* 连接打开 */\r\n");
      out.write("\t\t\t\tws.onopen = function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t/* 回调 */\r\n");
      out.write("\t\t\t\tws.onmessage = function(event) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (event.data == \"订单\") {\r\n");
      out.write("\t\t\t\t\t\t//收到新订单\r\n");
      out.write("\t\t\t\t\t\tsetContent();\r\n");
      out.write("\t\t\t\t\t\tif ($(\"#neworder\").html() == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#neworder\").html(\"1\");\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tvar value = parseInt($(\"#neworder\").html()) + 1;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#neworder\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#neworder\").html(value);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else if (event.data == \"评论\") {\r\n");
      out.write("\t\t\t\t\t\t//收到新评论\r\n");
      out.write("\t\t\t\t\t\tsetContent();\r\n");
      out.write("\t\t\t\t\t\tif ($(\"#newcomments\").html() == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newcomments\").html(\"1\");\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tvar value = parseInt($(\"#newcomments\").html()) + 1;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newcomments\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newcomments\").html(value);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else if (event.data == \"回复\") {\r\n");
      out.write("\t\t\t\t\t\t//收到新回复\r\n");
      out.write("\t\t\t\t\t\tsetContent();\r\n");
      out.write("\t\t\t\t\t\tif ($(\"#newreply\").html() == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newreply\").html(\"1\");\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tvar value = parseInt($(\"#newreply\").html()) + 1;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newreply\").html(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#newreply\").html(value);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//关闭状态有消息，连接服务器返回保存的数据\r\n");
      out.write("\t\t\t\t\t\tvar jsonobj = eval('(' + event.data + ')');\r\n");
      out.write("\t\t\t\t\t\t$(\"#news\").html(jsonobj.count);//设置总数量\r\n");
      out.write("\t\t\t\t\t\t$(\"#neworder\").html(jsonobj.ordernum);//设置订单数量\r\n");
      out.write("\t\t\t\t\t\t$(\"#newcomments\").html(jsonobj.commentsnum);//设置评论数量\r\n");
      out.write("\t\t\t\t\t\t$(\"#newreply\").html(jsonobj.replynum);//设置回复数量\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\t/* 连接关闭 */\r\n");
      out.write("\t\t\t\tws.onclose = function(event) {\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//监听a标签的点击事件\r\n");
      out.write("\t\t\t\t$(\"a.message\").click(function() {\r\n");
      out.write("\t\t\t\t\t//消除消息的数量\r\n");
      out.write("\t\t\t\t\t$(\"#news\").html(\"\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\".neworder\").click(function() {\r\n");
      out.write("\t\t\t\t\t$(\"#neworder\").html(\"\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\".newcomments\").click(function() {\r\n");
      out.write("\t\t\t\t\t$(\"#newcomments\").html(\"\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\".newreply\").click(function() {\r\n");
      out.write("\t\t\t\t\t$(\"#newreply\").html(\"\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<!--websocket结束-->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/index.jsp(31,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.img==null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("src=\"img/hu.jpg\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/index.jsp(32,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.img!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write('"');
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/index.jsp(36,47) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.seller==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('卖');
        out.write('家');
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/index.jsp(37,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.seller==2}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("超级管理员");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /WEB-INF/jsp/index.jsp(49,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.seller==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-desktop\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">商品管理</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"static/add.html\">增加商品</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"static/showgoods.jsp\">货物仓库</a>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-flask\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">交易管理</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"/page/show/finish\">已卖出的货物</a>\r\n");
        out.write("\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"/page/show/comments\">评价管理</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-flask\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">订单管理</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"/page/order\">订单详情</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-flask\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">物流管理</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"/send/logistics\">物流跟踪</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /WEB-INF/jsp/index.jsp(77,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.seller==2}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-flask\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">页面</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"static/startpage.html\">启动页</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"static/homepageAD.html\">首页轮播页</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-flask\"></i> <span\r\n");
        out.write("\t\t\t\t\t\t\tclass=\"nav-label\">版本</span><span class=\"fa arrow\"></span></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
        out.write("\t\t\t\t\t\t\t<li><a class=\"J_menuItem\" href=\"static/appupdate.html\">app版本更新</a></li>\r\n");
        out.write("\t\t\t\t\t\t</ul></li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }
}
