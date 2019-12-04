package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import database.NguoiDungDB;
import model.NguoiDung;
import java.util.List;
import java.util.List;

public final class quanlynguoidung_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       <link href=\"../css/styleHome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div style=\"height: 150px; background-color:  #1b6d85\">\n");
      out.write("                <div colspan=\"2\"> Trang admin</div>\n");
      out.write("            </div>\n");
      out.write("            <!-- begin noi dung-->\n");
      out.write("            <div>\n");
      out.write("                <div id=\"menu\" >\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Người Dùng Quản Lý Người Dùng</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Đề Bài</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Đáp Án</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" >Quản Lý Bài Làm</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div style=\"font-size: 30px;font-family: monospace;padding-left: 100px\"> Danh Sách Người Dùng </div>\n");
      out.write("                    <br>\n");
      out.write("                    ");

                        
                      try {     
                                if(request.getParameter("txtUN")!=null){
                                String useName=request.getParameter("txtUN").trim();                                
                                
                                String passWord=request.getParameter("txtPW");
                                String id=request.getParameter("txtID");
                                String hoTen=request.getParameter("txtHT");
                                String diaChi=request.getParameter("txtDC");
                                String ngaySinh=request.getParameter("txtNS");
                                String gioiTinh=request.getParameter("txtGT");
                                String email=request.getParameter("txtEM");
                                NguoiDungDB.updateTaiKhoan(useName, passWord, id, hoTen, diaChi, ngaySinh, gioiTinh, email);
                                out.print("cap nhap thanh conhg");
                                }
                                
                            } catch (Exception e) {
                               out.print("du lieu null=");
                            }
                    
                        
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                    <!--begin form cap nhap-->\n");
      out.write("                    <form action=\"quanlynguoidung.jsp\" method=\"GET\">\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <table style=\"margin-left: 150px;\"> \n");
      out.write("                             <tr>\n");
      out.write("                                <td >user id</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtUse\" name=\"txtUN\"> </td>\n");
      out.write("                            </tr>    \n");
      out.write("                            <tr>\n");
      out.write("                                <td >PassWord</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtPass\" name=\"txtPW\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >ID</td>\n");
      out.write("                                <td > <input type=\"text\" id=\"txtID\" name=\"txtID\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Họ Tên</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtHT\" name=\"txtHT\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Dịa Chỉ</td>\n");
      out.write("                                <td ><input type=\"text\" id=\"txtDC\" name=\"txtDC\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Ngày Sinh</td>\n");
      out.write("                                <td  ><input type=\"text\" id=\"txtNS\" name=\"txtNS\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Giới Tính </td> <td ><input type=\"text\" id=\"txtGT\" name=\"txtGT\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                            <tr>\n");
      out.write("                                <td >Email  </td><td ><input type=\"text\"id=\"txtEM\" name=\"txtEM\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                           <tr>\n");
      out.write("                               <td  ><input type=\"submit\"  value=\"CapNhap\" ></td>\n");
      out.write("                               <td > <input type=\"button\" value=\"Reset\"></td>\n");
      out.write("                            </tr> \n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    <!--end form cap nhap-->\n");
      out.write("                    <hr>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <table border=\"1\" style=\"margin-left: 20px;\" >\n");
      out.write("                       \n");
      out.write("                        <tr style=\"background-color: #C3EEE5\">\n");
      out.write("                            <td class=\"space\">user name</td>\n");
      out.write("                            <td class=\"space\">pass word</td>\n");
      out.write("                            <td class=\"space\"> id</td>\n");
      out.write("                            <td class=\"space\"> ho ten</td>\n");
      out.write("                            <td class=\"space\">dia chi</td>\n");
      out.write("                            <td class=\"space\">gioi tinh</td>\n");
      out.write("                            <td class=\"space\">ngay sinh</td>\n");
      out.write("                            <td class=\"space\"> pail</td>\n");
      out.write("                            <td class=\"space\">Cập Nhập</td>\n");
      out.write("                            <td class=\"space\">Xóa</td>\n");
      out.write("                        </tr>\n");
      out.write("                   \n");
      out.write("                         \n");
      out.write("                   \n");
      out.write("                    ");

                        int i=1;
                        List<NguoiDung> list=NguoiDungDB.loadAll();
                        for(NguoiDung nd :list){
                     
      out.write("\n");
      out.write("                      <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(nd.getUseName() );
      out.write("</p> \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(nd.getPassWord() );
      out.write("</p> \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( nd.getId() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(nd.getHoTen() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print(nd.getDiaChi() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(nd.getNgaySinh() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\">   ");
      out.print(nd.getGioiTinh() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <p class=\"");
      out.print( i);
      out.write("\"> ");
      out.print(nd.getEmail() );
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td> <input type=\"button\" value=\"Cap Nhap\" onclick=\"xuLyCapNhap(");
      out.print(i );
      out.write(")\" > </td>\n");
      out.write("                        <td> <input type=\"button\" onclick=\"xuLyXoa(");
      out.print(i );
      out.write(")\" ></td>\n");
      out.write("                     \n");
      out.write("                    </tr>\n");
      out.write("                     ");

                         i++;
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                 </table>\n");
      out.write("            </div>\n");
      out.write("            <!-- end noi dung-->\n");
      out.write("            <div id=\"clear\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\" style=\"height: 100px;background-color: #1b6d85\">\n");
      out.write("                <div > footer</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <script src=\"../jquery/XuLyQLNguoiDung.js\" type=\"text/javascript\"></script>\n");
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
