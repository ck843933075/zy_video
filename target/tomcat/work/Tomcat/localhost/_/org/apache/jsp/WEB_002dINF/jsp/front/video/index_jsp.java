/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-10 08:36:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.front.video;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/front/video/../include/style.html", Long.valueOf(1500379621452L));
    _jspx_dependants.put("/WEB-INF/jsp/front/video/../include/script.html", Long.valueOf(1500946136841L));
    _jspx_dependants.put("/WEB-INF/jsp/front/video/../include/footer.jsp", Long.valueOf(1500456584225L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BaseContext}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Web前端视频教程,大数据视频教程,HTML5视频教程,UI视频教程,PHP视频教程,java视频教程,python基础教程\">\r\n");
      out.write("    <meta name=\"description\" content=\"智游教育在线课程视频,为您提供java,python,HTML5,UI,PHP,大数据等学科经典视频教程在线浏览学习,精细化知识点解析,深入浅出,想学不会都难,智游教育,学习成就梦想！\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/base.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/css.css\">");
      out.write("\r\n");
      out.write("    <link href=\"static/css/video-js.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <title>在线公开课-智游教育|java|大数据|HTML5|python|UI|PHP视频教程</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"w100\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("    <!--面包屑导航-->\r\n");
      out.write("    <div class=\"container mian-nav\">公开课 / ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subject.subjectName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("    <input type=\"hidden\" id=\"videoId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${videoId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!--页脚-->\r\n");
      out.write("<footer>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<img src=\"static/img/footer_logo.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"mt25\">\r\n");
      out.write("\t\t\t<h3>各校区地址</h3>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>总部地址<br>中国-郑州经济技术开发区河南省通信产业园六层</li>\r\n");
      out.write("\t\t\t\t<li>郑州校区一<br>中国-郑州经济技术开发区第一大街与经北一路</li>\r\n");
      out.write("\t\t\t\t<li>郑州校区二<br>中国-郑州经济技术开发区第四大街经开人才市场七楼</li>\r\n");
      out.write("\t\t\t\t<li>郑州校区三<br>中国-郑州经济技术开发区第八大街河南省留学生创业园九层、十层</li>\r\n");
      out.write("\t\t\t\t<li>西安分校<br>中国-西安莲湖区&#X3000;联系人：梁老师 13201570801</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li class=\"mt25\">\r\n");
      out.write("\t\t\t<h3>联系我们</h3>\r\n");
      out.write("\t\t\t<ul id=\"foo_icon\">\r\n");
      out.write("\t\t\t\t<li>中国-郑州经济技术开发区经北三路河南通信产业园六层</li>\r\n");
      out.write("\t\t\t\t<li>e-mail:zy@zhiyou100.com</li>\r\n");
      out.write("\t\t\t\t<li>电话:4006-371-555 0371-88888598</li>\r\n");
      out.write("\t\t\t\t<li class=\"erwei\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<img class=\"weixin\" src=\"static/img/微信公众号.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"weibo\" src=\"static/img/微博公众号.png\" alt=\"\" draggable=\"false\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div class=\"record\">智游教育 &copy; 豫ICP备17000832号-1 &#X3000;河南智游臻龙教育科技有限公司</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--登录注册弹出框-->\r\n");
      out.write("<div class=\"mask hidden\" id=\"loginDiv\">\r\n");
      out.write("\t<div class=\"mask_content\">\r\n");
      out.write("\t\t<div class=\"mask_content_header\">\r\n");
      out.write("\t\t\t<img src=\"static/img/logo.png\" alt=\"\" class=\"ma\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mask_content_body\">\r\n");
      out.write("\t\t\t<form id=\"loginForm\" action=\"front/user/login.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<h3>快速登录</h3>\r\n");
      out.write("\t\t\t\t<input type=\"email\" id=\"loginEmail\" placeholder=\"请输入邮箱\" name=\"email\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"loginPassword\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("\t\t\t\t<div id=\"forget\">\r\n");
      out.write("\t\t\t\t\t<a href=\"forgetpwd.do\">忘记密码？</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"登&#x3000;录\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mask_content_footer\">\r\n");
      out.write("\t\t\t<span id=\"login_close\">关&#x3000;闭</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"mask hidden\" id=\"regDiv\">\r\n");
      out.write("\t<div class=\"mask_content\">\r\n");
      out.write("\t\t<div class=\"mask_content_header\">\r\n");
      out.write("\t\t\t<img src=\"static/img/logo.png\" alt=\"\" class=\"ma\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mask_content_body\">\r\n");
      out.write("\t\t\t<form id=\"regForm\" action=\"front/user/regist.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<h3>新用户注册</h3>\r\n");
      out.write("\t\t\t\t<input type=\"email\" id=\"regEmail\" placeholder=\"请输入邮箱\" name=\"email\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"regPsw\" placeholder=\"请输入密码\" name=\"password\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"regPswAgain\" placeholder=\"请再次输入密码\" name=\"pswAgain\">\r\n");
      out.write("\t\t\t\t<!-- <div id=\"yzm\" class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"yzm\" style=\"width: 45%; display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t<div id=\"v_container\" style=\"width: 45%;height: 40px;float:right;\"></div>\r\n");
      out.write("\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"注&#x3000;册\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mask_content_footer\">\r\n");
      out.write("\t\t\t<span id=\"reg_close\">关&#x3000;闭</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<script src=\"static/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script src=\"static/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"static/js/jquery-confirm.min.js\"></script>\r\n");
      out.write("<script src=\"static/js/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"static/js/video.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("        \tvar id = $('#videoId').val();\r\n");
      out.write("           $('#content').load('front/video/videoData.do?videoId='+id);\r\n");
      out.write("           \r\n");
      out.write("           //播放量统计,不需要返回结果处理\r\n");
      out.write("           $.get('front/video/state.do?videoId='+id);\r\n");
      out.write("\t\t});\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}
