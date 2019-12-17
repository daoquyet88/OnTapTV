package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Title Page</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/website.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">     \n");
      out.write("            <!--header-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/Header.jsp", out, false);
      out.write("\n");
      out.write("            <!--end header-->\n");
      out.write("            <!--menu-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/MenuTop.jsp", out, false);
      out.write("\n");
      out.write("            <!--end menu-->\n");
      out.write("             <!--begin content-->\n");
      out.write("             <section>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" > \n");
      out.write("                        <br><br>\n");
      out.write("                        <h3 style=\"padding-left: 50px\">Danh Sách Lớp Học</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("\n");
      out.write("                        <a href=\"Controller?x=lop6.jsp\" target=\"_blank\"><img src=\"images/lop6.png\" alt=\"Tieng viet lop 6\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3   \">\n");
      out.write("                        <h3>Tiếng Việt Lớp 6</h3>\n");
      out.write("                        Theo chương trình SGK \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        <a href=\"Controller?x=lop6.jsp\" target=\"_blank\"><img src=\"images/lop7.png\" alt=\"Tieng viet lop 7\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3   \">\n");
      out.write("                        <h3>Tiếng Việt Lớp 7</h3>\n");
      out.write("                        Theo chương trình SGK \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        <a href=\"Controller?x=lop6.jsp\" target=\"_blank\"><img src=\"images/lop8.png\" alt=\"Tieng viet lop 8\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3   \">\n");
      out.write("                        <h3>Tiếng Việt Lớp 6</h3>\n");
      out.write("                        Theo chương trình SGK \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        <a href=\"Controller?x=lop6.jsp\" target=\"_blank\"><img src=\"images/lop9.png\" alt=\"Tieng viet lop 9\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3   \">\n");
      out.write("                        <h3>Tiếng Việt Lớp 9</h3>\n");
      out.write("                        Theo chương trình SGK \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <section>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" > \n");
      out.write("                        <br><br>\n");
      out.write("                        <h3 style=\"padding-left: 50px\">Bảng Xếp Hạng Kết Quả Thi Đầu</h3>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"text-align: center\"> \n");
      out.write("                        <img src=\"images/so2.png\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"text-align: center\"> \n");
      out.write("                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>\n");
      out.write("                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>\n");
      out.write("                        <div>Điểm Danh Hiệu :<em style=\"color: gold\">9999 </em></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"align-content: center\"> \n");
      out.write("                        <img src=\"images/so2.png\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"text-align: center\"> \n");
      out.write("                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>\n");
      out.write("                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>\n");
      out.write("                        <div>Điểm Danh Hiệu :<em style=\"color: gold\">8888 </em></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"align-content: center\"> \n");
      out.write("                        <img src=\"images/so3.png\" alt=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\" style=\"text-align: center\"> \n");
      out.write("                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>\n");
      out.write("                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>\n");
      out.write("                        <div>Điểm Danh Hiệu :<em style=\"color: gold\">7777 </em></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("             <!--end content-->\n");
      out.write("            <!--begin footer-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/Footer.jsp", out, false);
      out.write("\n");
      out.write("            <!--end footer-->\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"jquery/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
