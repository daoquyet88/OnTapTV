package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DapAnDB;
import model.DapAn;
import java.util.List;
import model.De;
import database.DeDB;
import model.DapAn;

public final class lop6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Title Page</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/website.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">     \n");
      out.write("      <!--header-->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("            <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                \n");
      out.write("                <a href=\"index.jsp\"><img src=\"images/logo.png\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\" style=\"padding-top:40px \">\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\" style=\"padding-top:60px;padding-left:160px  \">\n");
      out.write("                <a href=\"dangky.jsp\"><button type=\"button\" class=\"btn btn-info\">Đăng Ký</button></a>\n");
      out.write("                \n");
      out.write("                <a href=\"dangnhap.jsp\"><button type=\"button\" class=\"btn btn-danger\">Đăng Nhập</button></a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("       <!--end header-->\n");
      out.write("        <!--menu-->\n");
      out.write("      <div class=\"row\" style=\"background-color: bisque;\">\n");
      out.write("        <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul class=\"nav nav-tabs\" >  \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a href=\"index.jsp\" class=\"nav-link active\">Trang Chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                      <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        Lớp Học<span class=\"caret\"></span>\n");
      out.write("                      </a>\n");
      out.write("                      <ul class=\"dropdown-menu\">\n");
      out.write("                          <li class=\"nav-item\">\n");
      out.write("                              <a href=\"#\" class=\"nav-link active\">Lớp 6</a>\n");
      out.write("                            </li>\n");
      out.write("                      \n");
      out.write("                          <li class=\"nav-item\">\n");
      out.write("                              <a href=\"#\" class=\"nav-link active\">Lớp 7</a>\n");
      out.write("                            </li>\n");
      out.write("                      \n");
      out.write("                          <li class=\"nav-item\">\n");
      out.write("                              <a href=\"#\" class=\"nav-link active\">Lớp 8</a>\n");
      out.write("                            </li>\n");
      out.write("                      \n");
      out.write("                          <li class=\"nav-item\">\n");
      out.write("                              <a href=\"#\" class=\"nav-link active\">Lớp 9</a>\n");
      out.write("                            </li>\n");
      out.write("                      </ul>              \n");
      out.write("                     </li>\n");
      out.write("                     <!--end lop hoc begin kiem tra-->      \n");
      out.write("                     <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                          Kiểm Tra<span class=\"caret\"></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">Giữ HK I</a>\n");
      out.write("                              </li>\n");
      out.write("                        \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">Cuối HK I</a>\n");
      out.write("                              </li>\n");
      out.write("                        \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\"> Giữa HK II </a>\n");
      out.write("                              </li>\n");
      out.write("                       \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link active\">Cuối HK II</a>\n");
      out.write("                              </li>\n");
      out.write("                        </ul>              \n");
      out.write("                       </li>\n");
      out.write("                     <!-- end kiem tra-->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a href=\"#\" class=\"nav-link active\">Thi Đấu</a>\n");
      out.write("                    </li>       \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a href=\"#\" class=\"nav-link\">Giói Thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a href=\"#\" class=\"nav-link disabled\">Giói Thiệu</a>\n");
      out.write("                    </li>\n");
      out.write("                 </ul>\n");
      out.write("             \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("       <!--end menu-->\n");
      out.write("        \n");
      out.write("    \n");
      out.write("    <!--begin content-->\n");
      out.write("      \n");
      out.write("      <section>\n");
      out.write("          \n");
      out.write("           ");

         
                List<De> list = DeDB.getAll();
                for(De sp:list){
            
      out.write("    \n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                        <h3 style=\"margin-left:200px \" >  \n");
      out.write("                         ");
      out.print( sp.getTieuDe() );
      out.write("\n");
      out.write("                        </h3>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"  >\n");
      out.write("                        <h3 style=\"padding-top:90px;padding-left: 60px\">");
      out.print( sp.getMaDe() );
      out.write(" </h3>  \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-8 col-sm-8 col-md-8 col-lg-8\" >\n");
      out.write("                        <h3> ");
      out.print( sp.getNoiDung() );
      out.write("</h3>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" >\n");
      out.write("                        <b style=\"margin-left: 700px\"> ");
      out.print( sp.getTacGia() );
      out.write("</b>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                     <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-8 col-sm-8 col-md-8 col-lg-8\" >\n");
      out.write("                        <b >");
      out.print( sp.getChuThich() );
      out.write("</b>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("            \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("            ");
         
                }
            
      out.write("     \n");
      out.write("      </section> \n");
      out.write("      <!-- cau tra loi-->\n");
      out.write("      <section>\n");
      out.write("          <div >   \n");
      out.write("              <hr >\n");
      out.write("              <input type=\"button\" value=\"Bat dau lam\" onclick=\"demNguoc()\">\n");
      out.write("              <em id=\"dongHo\" style=\"font-family: fantasy; font-family: cursive;font-size:70px;color: red \"></em>\n");
      out.write("              <em id=\"htg\" style=\"color: #ff6600\"></em>\n");
      out.write("              <em id=\"kq\" style=\"color: red\"></em>\n");
      out.write("          </div>\n");
      out.write("           ");

         
                List<DapAn> lt = DapAnDB.getAll();
                int i=1;
                int z=100;
                int id=1;
                String tl1;
                String tl2;
                String tl3;
                String []data1;
                String []data2;
                String []data3;
                for(DapAn da:lt){
                    data1=da.getTraLoi1().split("\\.");
                    tl1=data1[0];
                    
                    data2=da.getTraLoi2().split("\\.");
                    tl2=data2[0];
                    
                    data3=da.getTraLoi3().split("\\.");
                    tl3=data3[0];
            
      out.write("    \n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">                        \n");
      out.write("                        <h3 style=\"margin-left:270px\" />  \n");
      out.write("                         ");
      out.print( i+"/" );
      out.write("\n");
      out.write("                         ");
      out.print( da.getCauHoi() );
      out.write("\n");
      out.write("                        \n");
      out.write("                        </h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                        <h4 style=\"margin-left:350px \" > \n");
      out.write("                            <input  onclick=\"hamdautien('");
      out.print( id );
      out.write("','");
      out.print( z );
      out.write("','");
      out.print( i );
      out.write("')\" type=\"radio\" value=\"");
      out.print( "A,"+da.getDapAn() );
      out.write("\" name=\"");
      out.print( i );
      out.write("\"  id=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                         ");
 id++; 
      out.write("\n");
      out.write("                            \n");
      out.write("                            ");
      out.print( da.getTraLoi1() );
      out.write("\n");
      out.write("                            \n");
      out.write("                        </h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                        <h4 style=\"margin-left:350px \" > \n");
      out.write("                            <input onclick=\"hamdautien('");
      out.print( id );
      out.write("','");
      out.print( z );
      out.write("','");
      out.print( i );
      out.write("')\" type=\"radio\" value=\"");
      out.print( "B,"+da.getDapAn() );
      out.write("\" name=\"");
      out.print( i );
      out.write("\"  id=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                            ");
 id++; 
      out.write("\n");
      out.write("                            ");
      out.print( da.getTraLoi2() );
      out.write("\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                        <h4 style=\"margin-left:350px \" > \n");
      out.write("                            <input onclick=\"hamdautien('");
      out.print( id );
      out.write("','");
      out.print( z );
      out.write("','");
      out.print( i );
      out.write("')\" type=\"radio\" value=\"");
      out.print( "C,"+da.getDapAn() );
      out.write("\" name=\"");
      out.print( i );
      out.write("\"  id=\"");
      out.print( id );
      out.write("\">\n");
      out.write("                            ");
 id++; 
      out.write("\n");
      out.write("                            ");
      out.print( da.getTraLoi3() );
      out.write("\n");
      out.write("                        </h4>\n");
      out.write("                        <em id=\"");
      out.print( z );
      out.write("\" style=\"margin-left:300px ; color: red\"> </em>\n");
      out.write("                         ");
 z++; 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                                                  \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("            ");
   
                i++;
                }
            
      out.write("   \n");
      out.write("            <div >\n");
      out.write("                <input type=\"text\"  id=\"vd1\" name=\"xxx\" value=\"okok\"  >\n");
      out.write("                <input type=\"button\" onclick=\"xyly_An()\">\n");
      out.write("            </div>\n");
      out.write("      </section>\n");
      out.write("    <!--end content-->\n");
      out.write("      <footer  style=\"background-color:darkkhaki\">\n");
      out.write("          \n");
      out.write("            \n");
      out.write("              \n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                      Tiếng việt Lớp 6\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        Tiếng việt Lớp 7\n");
      out.write("                 </div>\n");
      out.write("                <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        Tiếng việt Lớp 8\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        Tiếng việt Lớp 9\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                    Bản Quyền : Nhóm 6 -Phiên bản 1.0\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          <br>\n");
      out.write("      </footer>    \n");
      out.write("   \n");
      out.write("    <!--end container-->\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JavaScript -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery/XuLyTinhDiem.js\"></script>\n");
      out.write("  </body>\n");
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