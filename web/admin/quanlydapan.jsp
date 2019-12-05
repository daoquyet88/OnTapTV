<%-- 
    Document   : home
    Created on : Dec 3, 2019, 10:11:46 AM
    Author     : daoquyet
--%>

<%@page import="database.DapAnDB"%>
<%@page import="model.DapAn"%>
<%@page import="model.De"%>
<%@page import="java.util.List"%>
<%@page import="database.DeDB"%>
<%@page import="com.sun.javafx.sg.prism.NGNode"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/styleHome.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div id="container">
            <div style="height: 150px; background-color:  #1b6d85">
                <div colspan="2"> Trang admin</div>
            </div>
            <!-- begin noi dung-->
            <div>
                <div id="menu" style=" background-color: #419641">
                    <div>
                        <a href="quanlynguoidung.jsp">Quản Lý Người Dùng</a>

                    </div>
                    <div>
                        <a href="quanlydebai.jsp">Quản Lý Đề Bài</a>                        
                    </div>
                    <div>
                        <a href="#" >Quản Lý Đáp Án</a>
                    </div>
                    <div>
                        <a href="#" >Quản Lý Bài Làm</a>
                    </div>
                </div>
                <div id="content">
                    <div>
                        <input value="Thêm Đáp Án" type="button" id="btnThemDT" onclick="xuly_ThemDeTai()">
                    </div>
                    <div style="font-size: 30px;font-family: monospace;padding-left: 100px"> Danh Sách Đáp Án </div>
                    <br>
                    <%
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

                    %>

                    <!--begin form cap nhap-->
                    <form action="quanlydapan.jsp" method="GET">


                        <table id="myDIV" style="margin: 0px;padding: 0px" > 
                            <tr>
                                <td >Mã Đề</td>
                                <td ><input type="text" id="txtMD" name="txtMD" > </td>
                            </tr>    
                            <tr>
                                <td >Mã Đáp Án</td>
                                <td >
                                    <textarea  rows="1" cols="50" id="txtMDA" name="txtMDA" ></textarea>
                                </td>
                            </tr> 
                            <tr>
                                <td >Câu Hỏi</td>
                                <td > 
                                    <textarea  rows="4" cols="70" id="txtCH" name="txtCH" ></textarea>
                                </td>
                            </tr> 
                            <tr>
                                <td >Trả Lời 1</td>
                                <td ><input type="text" id="txtTL1" size="100" name="txtTL1"></td>
                            </tr> 
                            <tr>
                                <td >Trả Lời 2</td>
                                <td ><input type="text" id="txtTL2" size="100" name="txtTL2"></td>
                            </tr> 
                            <tr>
                                <td >Trả Lời 3</td>
                                <td  ><input type="text" size="100" id="txtTL3" name="txtTL3"></td>
                            </tr> 
                            <tr>
                                <td >Đáp Án</td>
                                <td  ><input type="text" size="100" id="txtDA" name="txtDA"></td>
                            </tr> 
                            <tr>
                                <td id="myCapNhap" ><input  type="submit"  value="CapNhap" name="action" ></td>
                                <td  id="myThem" >

                                    <input  type="submit"  value="Add" name="action"  >
                                </td>
                            </tr> 
                        </table>
                    </form>
                    <!--end form cap nhap-->
                    <hr>
                    <br>

                    <table border="1" style="margin-left: 20px;" >

                        <tr style="background-color: #C3EEE5">
                            <td class="space">Mã Để</td>
                            <td class="space">Mã Đáp Án</td>
                            <td class="space">Câu Hỏi</td>
                            <td class="space">Trả Lời 1</td>
                            <td class="space">Trả Lời 2</td>
                            <td class="space">Trả Lời 3</td>     
                            <td class="space">Đáp Án</td>  
                            <td class="space">Cập Nhập</td>
                            <td class="space">Xóa</td>
                        </tr>



                        <%                        int i = 1;
                            List<DapAn> list = DapAnDB.getAll();
                            for (DapAn d : list) {
                        %>
                        <tr>
                            <td>
                                <p class="<%= i%>"> <%=d.getMaDe()%></p> 
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getMaDapAn() %></p> 
                            </td>
                            <td>
                                <p class="<%= i%>"><%= d.getCauHoi() %></p>
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getTraLoi1() %></p>
                            </td>
                            <td>
                                <p class="<%= i%>"><%= d.getTraLoi2()%></p>
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getTraLoi3() %></p>
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getDapAn() %></p> 
                            </td>

                            <td> <input type="button" value="Cap Nhap" onclick="xuLy_DapAn(<%=i%>)" > </td>
                            <td><form action="quanlydapan.jsp">
                                    <input type="hidden" name="txtMaDe" value="<%= d.getMaDe()%>" />
                                    <input type="hidden" name="txtMaDapAn" value="<%= d.getMaDapAn()%>" />
                                    <input type="submit" value="Xoa" name="action"/>
                                </form>
                            </td>

                        </tr>
                        <%
                                i++;
                            }
                        %>

                    </table>
                </div>
            </div>
            <!-- end noi dung-->
            <div id="clear">

            </div>
            <div id="footer" style="height: 100px;background-color: #1b6d85">
                <div > footer</div>
            </div>
        </div>
          <script src="../jquery/xuly_dapan.js" type="text/javascript"></script>
    </body>
</html>
