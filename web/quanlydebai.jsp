<%-- 
    Document   : home
    Created on : Dec 3, 2019, 10:11:46 AM
    Author     : daoquyet
--%>

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
        <link href="css/styleHome.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <div id="container">
            <!--header-->
            <jsp:include page="page/header.jsp"/>
            <!--end header-->
            
            <!--begin menu-->
            <jsp:include page="page/menu.jsp"/>
            <!--end menu-->
                <div id="content">
                    <div>
                        <input value="Thêm Đề bài" type="button" id="btnThemDT" onclick="xuly_ThemDeTai()">
                    </div>
                    <div style="font-size: 30px;font-family: monospace;padding-left: 100px"> Danh Sách Đề Bài </div>
                    <br>
                    <%
                        if (request.getParameter("action") != null) {

                            String chuoi = request.getParameter("action");
                            if (chuoi.trim().equalsIgnoreCase("Add")) {
                                String maDe = request.getParameter("txtMD").trim();

                                String tieuDe = request.getParameter("txtTD").trim();
                                String noiDung = request.getParameter("txtND").trim();
                                String tacGia = request.getParameter("txtTG").trim();
                                String lop = request.getParameter("txtL").trim();
                                String chuThich = request.getParameter("txtCT");

                                DeDB db = new DeDB();
                                db.insert(maDe, tieuDe, noiDung, tacGia, chuThich, lop);
                               
                            }
                            if (chuoi.trim().equalsIgnoreCase("Delete")) {
                                String maDe = request.getParameter("txtHidden");
                                DeDB ndDB = new DeDB();
                                ndDB.delete(maDe);
                            }
                            if (chuoi.trim().equalsIgnoreCase("Xoa")) {
                                String maDe = request.getParameter("txtMaDe");
                                DeDB ndDB = new DeDB();
                                ndDB.delete(maDe);
                            }

                            if (chuoi.trim().equalsIgnoreCase("CapNhap")) {
                                String maDe = request.getParameter("txtMD").trim();

                                String tieuDe = request.getParameter("txtTD").trim();
                                String noiDung = request.getParameter("txtND").trim();
                                String tacGia = request.getParameter("txtTG").trim();
                                String lop = request.getParameter("txtL").trim();
                                String chuThich = request.getParameter("txtCT");

                                DeDB.update(maDe, tieuDe, noiDung, tacGia, lop, chuThich);
                                out.print("cap nhap thanh conhg");
                            }

                        }

                    %>

                    <!--begin form cap nhap-->
                    <form action="quanlydebai.jsp" method="GET">


                        <table id="myDIV" style="margin: 0px;padding: 0px" > 
                            <tr>
                                <td >Mã Đề</td>
                                <td ><input type="text" id="txtMD" name="txtMD" > </td>
                            </tr>    
                            <tr>
                                <td >Tiêu Đề</td>
                                <td >
                                    <textarea  rows="3" cols="130" id="txtTD" name="txtTD" ></textarea>
                                </td>
                            </tr> 
                            <tr>
                                <td >Nội Dung</td>
                                <td > 
                                    <textarea  rows="15" cols="130" id="txtND" name="txtND" ></textarea>
                                </td>
                            </tr> 
                            <tr>
                                <td >Tác Giả</td>
                                <td ><input type="text" id="txtTG" size="100" name="txtTG"></td>
                            </tr> 
                            <tr>
                                <td >Lớp</td>
                                <td ><input type="text" id="txtL" name="txtL"></td>
                            </tr> 
                            <tr>
                                <td >Chú Thich</td>
                                <td  ><input type="text" size="100" id="txtCT" name="txtCT"></td>
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
                            <td class="space">Tiêu Đề</td>
                            <td class="space">Nội Dung</td>
                            <td class="space">Tác Giả</td>
                            <td class="space">Lớp</td>
                            <td class="space">Chú Thích</td>                            
                            <td class="space">Cập Nhập</td>
                            <td class="space">Xóa</td>
                        </tr>



                        <%                        int i = 1;
                            List<De> list = DeDB.getAll();
                            for (De d : list) {
                        %>
                        <tr>
                            <td>
                                <p class="<%= i%>"> <%=d.getMaDe()%></p> 
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getTieuDe()%></p> 
                            </td>
                            <td>
                                <p class="<%= i%>"><%= d.getNoiDung()%></p>
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getTacGia()%></p>
                            </td>
                            <td>
                                <p class="<%= i%>"><%= d.getLop()%></p>
                            </td>
                            <td>
                                <p class="<%= i%>"> <%= d.getChuThich()%></p>
                            </td>

                            <td> <input type="button" value="Cap Nhap" onclick="xuLyDeBai(<%=i%>)" > </td>
                            <td><form action="quanlydebai.jsp">
                                    <input type="hidden" name="txtMaDe" value="<%= d.getMaDe()%>" />
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
        <script src="jquery/xylydebai.js" type="text/javascript"></script>
    </body>
</html>
