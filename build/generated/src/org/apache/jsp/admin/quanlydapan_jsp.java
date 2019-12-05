package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.DapAnDB;
import model.DapAn;
import model.De;
import java.util.List;
import database.DeDB;
import com.sun.javafx.sg.prism.NGNode;

public final class quanlydapan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/styleHome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div style=\"height: 150px; background-color:  #1b6d85\">\n");
      out.write("                <div colspan=\"2\"> Trang admin</div>\n");
      out.write("            </div>\n");
      out.write("            <!-- begin noi dung-->\n");
      out.write("            <div>\n");
      out.write("                <div id=\"menu\" style=\" background-color: #419641\">\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"quanlynguoidung.jsp\">Quản Lý Người Dùng</a>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"quanlydebai.jsp\">Quản Lý Đề Bài</a>                        \n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Đáp Án</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Bài Làm</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div>\n");
      out.write("                        <input value=\"Thêm Đáp Án\" type=\"button\" id=\"btnThemDT\" onclick=\"xuly_ThemDeTai()\">\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"font-size: 30px;font-family: monospace;padding-left: 100px\"> Danh Sách Đáp Án </div>\n");
      out.write("                    <br>\n");
      out.write("                    ");

                        if (request.getParameter("action") != null) {

                            String chuoi = request.getParameter("action");
                            if (chuoi.trim().equalsIgnoreCase("Add")) {
                                String maDe = request.getParameter("txtMD").trim();

                                int maDapAn= Integer.parseInt(request.getParameter("txtMDA").trim());
                                String cauHoi = request.getParameter("txtCH").trim();
                                String tl1 = request.getParameter("txtTL1").trim();
                                String tl2 = request.getParameter("txtTL2").trim();
                                 String tl3 = request.getParameter("txtTL3").trim();
                                String dapAn = request.getParameter("txtDA");

                                DapAnDB db = new DapAnDB();
                                db.insert(maDe,maDapAn,cauHoi, tl1, tl2, tl3,dapAn);
                                out.print("Them thanh cong");
                            }
                            if (chuoi.trim().equalsIgnoreCase("Xoa")) {
                                String maDe = request.getParameter("txtMaDe");
                                int maDapAn = Integer.parseInt(request.getParameter("txtMaDapAn"));
                                DapAnDB daDB = new DapAnDB();
                                daDB.delete(maDe,maDapAn);
                            }
                            
                            if (chuoi.trim().equalsIgnoreCase("CapNhap")) {
                                String maDe = request.getParameter("txtMD").trim();

                                int maDapAn= Integer.parseInt(request.getParameter("txtMDA").trim());
                                String cauHoi = request.getParameter("txtCH").trim();
                                String tl1 = request.getParameter("txtTL1").trim();
                                String tl2 = request.getParameter("txtTL2").trim();
                                 String tl3 = request.getParameter("txtTL3").trim();
                                String dapAn = request.getParameter("txtDA");

                                DapAnDB daDB=new DapAnDB();
                                daDB.update(maDe,maDapAn,cauHoi, tl1, tl2, tl3,dapAn);
                                out.print("cap nhap thanh conhg");
                            }

                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <!--begin form cap nhap-->\n");
      out.write("                    <form action=\"quanlydapan.jsp\" method=\"GET\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <table id=\"myDIV\" style=\"margin: 0px;padding: 0px\" > \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Mã Đề</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtMD\" name=\"txtMD\" > </td>\n");
      out.write("                            </tr>    \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Mã Đáp Án</td>\n");
      out.write("                                <td >\n");
      out.write("                                    <textarea  rows=\"1\" cols=\"50\" id=\"txtMDA\" name=\"txtMDA\" ></textarea>\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Câu Hỏi</td>\n");
      out.write("                                <td > \n");
      out.write("                                    <textarea  rows=\"4\" cols=\"70\" id=\"txtCH\" name=\"txtCH\" ></textarea>\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Trả Lời 1</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtTL1\" size=\"100\" name=\"txtTL1\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Trả Lời 2</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtTL2\" size=\"100\" name=\"txtTL2\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Trả Lời 3</td>\n");
      out.write("                                <td  ><input type=\"text\" size=\"100\" id=\"txtTL3\" name=\"txtTL3\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Đáp Án</td>\n");
      out.write("                                <td  ><input type=\"text\" size=\"100\" id=\"txtDA\" name=\"txtDA\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td id=\"myCapNhap\" ><input  type=\"submit\"  value=\"CapNhap\" name=\"action\" ></td>\n");
      out.write("                                <td  id=\"myThem\" >\n");
      out.write("\n");
      out.write("                                    <input  type=\"submit\"  value=\"Add\" name=\"action\"  >\n");
      out.write("                                </td>\n");
      out.write("                            </tr> \n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    <!--end form cap nhap-->\n");
      out.write("                    <hr>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <table border=\"1\" style=\"margin-left: 20px;\" >\n");
      out.write("\n");
      out.write("                        <tr style=\"background-color: #C3EEE5\">\n");
      out.write("                            <td class=\"space\">Mã Để</td>\n");
      out.write("                            <td class=\"space\">Mã Đáp Án</td>\n");
      out.write("                            <td class=\"space\">Câu Hỏi</td>\n");
      out.write("                            <td class=\"space\">Trả Lời 1</td>\n");
      out.write("                            <td class=\"space\">Trả Lời 2</td>\n");
      out.write("                            <td class=\"space\">Trả Lời 3</td>     \n");
      out.write("                            <td class=\"space\">Đáp Án</td>  \n");
      out.write("                            <td class=\"space\">Cập Nhập</td>\n");
      out.write("                            <td class=\"space\">Xóa</td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
                        int i = 1;
                            List<DapAn> list = DapAnDB.getAll();
                            for (DapAn d : list) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(d.getMaDe());
      out.write("</p> \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print( d.getMaDapAn() );
      out.write("</p> \n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( d.getCauHoi() );
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print( d.getTraLoi1() );
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( d.getTraLoi2());
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print( d.getTraLoi3() );
      out.write("</p>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print( d.getDapAn() );
      out.write("</p> \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td> <input type=\"button\" value=\"Cap Nhap\" onclick=\"xuLy_DapAn(");
      out.print(i);
      out.write(")\" > </td>\n");
      out.write("                            <td><form action=\"quanlydapan.jsp\">\n");
      out.write("                                    <input type=\"hidden\" name=\"txtMaDe\" value=\"");
      out.print( d.getMaDe());
      out.write("\" />\n");
      out.write("                                    <input type=\"hidden\" name=\"txtMaDapAn\" value=\"");
      out.print( d.getMaDapAn());
      out.write("\" />\n");
      out.write("                                    <input type=\"submit\" value=\"Xoa\" name=\"action\"/>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                                i++;
                            }
                        
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end noi dung-->\n");
      out.write("            <div id=\"clear\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\" style=\"height: 100px;background-color: #1b6d85\">\n");
      out.write("                <div > footer</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("          <script src=\"../jquery/xuly_dapan.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
