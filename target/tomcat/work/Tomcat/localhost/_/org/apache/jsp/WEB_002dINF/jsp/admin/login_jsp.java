/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-10 08:22:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BaseContext }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"> \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>后台登录页面</title>\r\n");
      out.write("<link href=\"static/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- <script src=\"static/js/bootstrap.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.login_form{\r\n");
      out.write("\t\tmargin-top: 20%;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"col-lg-4 col-lg-offset-4 login_form\">\r\n");
      out.write("<div class=\"row\"><img src=\"static/img/logo.png\"></div>\r\n");
      out.write("<form class=\"form-horizontal\" action=\"admin/login.do\" method=\"post\" id=\"loginForm\">\r\n");
      out.write("  <div class=\"form-group has-success\">\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control  input-lg\" name=\"loginName\" id=\"loginName\" placeholder=\"用户名\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group has-success\">\r\n");
      out.write("    <div class=\"col-sm-10\">\r\n");
      out.write("      <input type=\"password\" class=\"form-control input-lg\" name=\"loginPwd\" id=\"loginPwd\" placeholder=\"登录密码\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <div class=\"col-xs-10\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-success col-xs-12\">登录</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- jquery必须放在第一个加载 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t//js的方式进行校验\r\n");
      out.write("\t\t$('#loginForm').validate({\r\n");
      out.write("\t\t\trules:{//写校验规则的\r\n");
      out.write("\t\t\t\tloginName:{//loginName是input的name属性，不是id\r\n");
      out.write("\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\tminlength:3\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tloginPwd:{\r\n");
      out.write("\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\tminlength:5,\r\n");
      out.write("\t\t\t\t\tmaxlength:10\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages:{//写提示信息的\r\n");
      out.write("\t\t\t\tloginName:{//loginName是input的name属性，不是id\r\n");
      out.write("\t\t\t\t\trequired:'用户名是必须的',\r\n");
      out.write("\t\t\t\t\tminlength:'用户名最少3个字符'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tloginPwd:'密码是必须填写的，至少5个字符，最多10个字符'\r\n");
      out.write("\t\t\t\t//如果不需要给每个校验规则都写提示信息，就只写一个字符串\r\n");
      out.write("\t\t\t\t/* {\r\n");
      out.write("\t\t\t\t\trequired:'密码是必须填写的',\r\n");
      out.write("\t\t\t\t\tminlength:'密码最少5个字符',\r\n");
      out.write("\t\t\t\t\tmaxlength:'密码最多10个字符'\r\n");
      out.write("\t\t\t\t} */\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
