package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DapAnDB;
import model.DapAn;
import model.DapAn;
import java.util.List;
import database.DeDB;
import model.De;
import model.De;

public final class GiuaKyI_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body onload=\"tatClick()\">\n");
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
      out.write("            <!--begin content-->\n");
      out.write("            <!-- thong tin cac lop-->\n");
      out.write("            <section>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" > \n");
      out.write("                        <nav class=\"navbar navbar-light\" style=\"background-color: #C3EEE5;\">\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\">Đề kiểm tra giữu kỳ 1</a>\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li >\n");
      out.write("                                    <a href=\"Controller?x=Lop 6\">Lớp 6</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li >\n");
      out.write("                                    <a href=\"Controller?x=Lop 7\">Lớp 7</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li >\n");
      out.write("                                    <a href=\"Controller?x=Lop 8\">Lớp 8</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li >\n");
      out.write("                                    <a href=\"Controller?x=Lop 9\">Lớp 9</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>   \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!--end  thong tin cac lop-->\n");
      out.write("            <section>\n");
      out.write("                <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" style=\"padding-left:150px;\">\n");
      out.write("                    <ul style=\"list-style-type: none\"  >\n");
      out.write("\n");
      out.write("                        ");

                            String lop = "" + request.getAttribute("lop");
                            //String lopx=request.getParameter("txtLop");
                            if ((lop != null)) {
                               
                                List<De> ls = DeDB.layDeTheoMaLop(lop);
                                for (De d : ls) {
                        
      out.write("    \n");
      out.write("\n");
      out.write("                        <li style=\"float: left;padding-left: 10px;padding-right: 10px;\">                       \n");
      out.write("                            <form action=\"GiuaKyI.jsp\" method=\"Get\">  \n");
      out.write("                                <input  type=\"hidden\" name=\"txtMaDe\" value=\"");
      out.print( d.getMaDe());
      out.write("\" />\n");
      out.write("                                <input  type=\"hidden\" name=\"txtLop\" value=\"");
      out.print( d.getLop());
      out.write("\" />\n");
      out.write("                                <input  type=\"submit\" value=\"");
      out.print( d.getMaDe());
      out.write("\" name=\"action\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        ");
 }
                        }                   
      out.write("  \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section style=\" height: 600px\">\n");
      out.write("                ");

                    String _maDe = request.getParameter("txtMaDe");
                    String _lop = request.getParameter("txtLop");
                    if ((_maDe != null) && (_lop != null)) {

                        List<De> list = DeDB.layDeTheoMaLopMaDe(_maDe,_lop);
                        for (De sp : list) {
                
      out.write("    \n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\">\n");
      out.write("                        <h3 style=\"margin-left:200px \" >  \n");
      out.write("                            ");
      out.print( sp.getTieuDe());
      out.write("\n");
      out.write("                        </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"  >\n");
      out.write("                        <h3 style=\"padding-top:90px;padding-left: 60px\">");
      out.print( sp.getMaDe());
      out.write(" </h3>  \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-8 col-sm-8 col-md-8 col-lg-8\" >\n");
      out.write("                        <h3> ");
      out.print( sp.getNoiDung());
      out.write("</h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" >\n");
      out.write("                        <b style=\"margin-left: 700px\"> ");
      out.print( sp.getTacGia());
      out.write("</b>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-8 col-sm-8 col-md-8 col-lg-8\" >\n");
      out.write("                        <b >");
      out.print( sp.getChuThich());
      out.write("</b>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");

                    }    
                    }
                
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <!-- cau tra loi-->\n");
      out.write("        <section >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("                    <br>\n");
      out.write("                    <hr style=\"background-color: #fff;border-top: 2px dashed #8c8b8b;\">\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                    <input type=\"button\" value=\"Bắt đầu làm :\" onclick=\"demNguoc()\"><br>\n");
      out.write("                    <em id=\"dongHo\" style=\"font-family: fantasy; font-family: cursive;font-size:30px;color: red \"></em>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-10 col-sm-10 col-md-10col-lg-10\">    \n");
      out.write("                    <h4>Thời Gian Làm Bài 60s :</h4> \n");
      out.write("                    <h4>Đáp Án Bài Làm :</h4> \n");
      out.write("                    <em id=\"htg\" style=\"color: #ff6600\"></em>\n");
      out.write("                    <em id=\"kq\" style=\"color: red;font-size:20px\"></em>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                List<DapAn> lt = DapAnDB.getOne(_maDe);
                int i = 1;
                int z = 100;
                int id = 1;
                String tl1;
                String tl2;
                String tl3;
                String[] data1;
                String[] data2;
                String[] data3;
                for (DapAn da : lt) {
                    data1 = da.getTraLoi1().split("\\.");
                    tl1 = data1[0];

                    data2 = da.getTraLoi2().split("\\.");
                    tl2 = data2[0];

                    data3 = da.getTraLoi3().split("\\.");
                    tl3 = data3[0];
            
      out.write("    \n");
      out.write("            <div class=\"row\" >\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">                        \n");
      out.write("                    <h4  />  \n");
      out.write("                    ");
      out.print( i + "/");
      out.write("\n");
      out.write("                    ");
      out.print( da.getCauHoi());
      out.write("\n");
      out.write("\n");
      out.write("                    </h4>\n");
      out.write("                </div>\n");
      out.write("                    <!-- begin tra loi 1-->\n");
      out.write("                 <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("                    <h4 style=\"padding-left: 40px\" > \n");
      out.write("                        ");
 
                            String t1=da.getTraLoi1();
                            if(t1.equals("x")){
                               
                        
      out.write(" \n");
      out.write("                        <textarea  rows=\"5\" cols=\"80\" id=\"txtTD\" name=\"txtTD\" ></textarea>\n");
      out.write("                        ");

                            }else{
                        
      out.write("\n");
      out.write("                        <input  onclick=\"hamdautien('");
      out.print( id);
      out.write("', '");
      out.print( z);
      out.write("', '");
      out.print( i);
      out.write("')\" type=\"radio\" value=\"");
      out.print( "A," + da.getDapAn());
      out.write("\" name=\"");
      out.print( i);
      out.write("\"  id=\"");
      out.print( id);
      out.write("\">\n");
      out.write("                        \n");
      out.write("                        ");
 id++;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      out.print( da.getTraLoi1());
      out.write("\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                      \n");
      out.write("                        </h3>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                          <!-- begin tra loi 2-->\n");
      out.write("                           <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"> \n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("                            <h4 style=\"padding-left: 40px\" > \n");
      out.write("                                ");
 
                            String t2=da.getTraLoi2();
                            if(t2.equals("o")){
                               String x="okokokoko"; 
                            }
                            else 
                            if(t2.equals("x")){
                               
                        
      out.write(" \n");
      out.write("                        <textarea  rows=\"5\" cols=\"80\" id=\"txtTD\" name=\"txtTD\" ></textarea>\n");
      out.write("                        ");

                            }else{
                        
      out.write("\n");
      out.write("                                <input onclick=\"hamdautien('");
      out.print( id);
      out.write("', '");
      out.print( z);
      out.write("', '");
      out.print( i);
      out.write("')\" type=\"radio\" value=\"");
      out.print( "B," + da.getDapAn());
      out.write("\" name=\"");
      out.print( i);
      out.write("\"  id=\"");
      out.print( id);
      out.write("\">\n");
      out.write("                                ");
 id++;
      out.write("\n");
      out.write("                                ");
      out.print( da.getTraLoi2());
      out.write("\n");
      out.write("                                ");

                            }
                        
      out.write("\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                             <!-- begin tra loi 3-->\n");
      out.write("                              <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\"> \n");
      out.write("                </div>\n");
      out.write("                        <div class=\"col-xs-10 col-sm-10 col-md-10 col-lg-10\">\n");
      out.write("                            <h4 style=\"padding-left: 40px\" > \n");
      out.write("                                ");
 
                            String t3=da.getTraLoi3();
                            if(t3.equals("o")){
                               String x="okokokoko"; 
                            }
                            else if(t3.equals("x")){
                               
                        
      out.write(" \n");
      out.write("                        <textarea  rows=\"5\" cols=\"80\" id=\"txtTD\" name=\"txtTD\" ></textarea>\n");
      out.write("                        ");

                            }else{
                        
      out.write("\n");
      out.write("                                <input onclick=\"hamdautien('");
      out.print( id);
      out.write("', '");
      out.print( z);
      out.write("', '");
      out.print( i);
      out.write("')\" type=\"radio\" value=\"");
      out.print( "C," + da.getDapAn());
      out.write("\" name=\"");
      out.print( i);
      out.write("\"  id=\"");
      out.print( id);
      out.write("\">\n");
      out.write("                                ");
 id++;
      out.write("\n");
      out.write("                                ");
      out.print( da.getTraLoi3());
      out.write("\n");
      out.write("                                 ");

                            }
                        
      out.write("\n");
      out.write("                            </h4>\n");
      out.write("                            <em id=\"");
      out.print( z);
      out.write("\" style=\" color: red\"> </em>\n");
      out.write("                            ");
 z++; 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                        i++;
                    }
                
      out.write("   \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-1 col-sm-1 col-md-1 col-lg-1\">\n");
      out.write("                         <form action=\"GiuaKyI.jsp\" method=\"Get\">  \n");
      out.write("                            <input style=\"text-decoration: none\" type=\"hidden\" name=\"txtMaDe\" value=\"");
      out.print( _maDe );
      out.write("\" />\n");
      out.write("                            <input style=\"text-decoration: none\" type=\"submit\" value=\"Làm Lại\" name=\"action\"/>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    ");

                        if(session.getAttribute("ten")!=null){
                    
                       
                    
      out.write("\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <form action=\"xuLyLuuBaiLam.jsp\">\n");
      out.write("                            <input type=\"submit\" value=\"Luu ket qua\">\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    ");

                                
                        }
                    
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </section>\n");
      out.write("            <!--end content-->\n");
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
      out.write("        <script type=\"text/javascript\" src=\"jquery/XuLyTinhDiem.js\"></script>\n");
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
