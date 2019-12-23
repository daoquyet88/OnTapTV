<%-- 
    Document   : home
    Created on : Dec 3, 2019, 10:11:46 AM
    Author     : daoquyet
--%>

<%@page import="database.NguoiDungDB"%>
<%@page import="model.NguoiDung"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/styleHome.css" rel="stylesheet" type="text/css"/>
       <link href="css/styleHome.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        <div id="container">
             <!--header-->
            <jsp:include page="page/header.jsp"/>
            <!--end header-->
            
            <!--begin menu-->
            <jsp:include page="page/menu.jsp"/>
            <!--end begin-->
            
                <div id="content">
                    <div style="font-size: 30px;font-family: monospace;padding-left: 100px"> Danh Sách Người Dùng </div>
                    <br>
                    <%
                        if(request.getParameter("txtHidden")!=null){
                            String useName=request.getParameter("txtHidden");
                            NguoiDungDB ndDB=new  NguoiDungDB();
                            ndDB.delete(useName);
                        }
                        
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
                    
                        
                    %>
                  
                    <!--begin form cap nhap-->
                    <form action="quanlynguoidung.jsp" method="GET">
                        

                        <table id="myDIV"  > 
                             <tr>
                                <td >user id</td>
                                <td ><input type="text" id="txtUse" name="txtUN"> </td>
                            </tr>    
                            <tr>
                                <td >PassWord</td>
                                <td ><input type="text" id="txtPass" name="txtPW"></td>
                            </tr> 
                            <tr>
                                <td >ID</td>
                                <td > <input type="text" id="txtID" name="txtID"></td>
                            </tr> 
                            <tr>
                                <td >Họ Tên</td>
                                <td ><input type="text" id="txtHT" name="txtHT"></td>
                            </tr> 
                            <tr>
                                <td >Dịa Chỉ</td>
                                <td ><input type="text" id="txtDC" name="txtDC"></td>
                            </tr> 
                            <tr>
                                <td >Ngày Sinh</td>
                                <td  ><input type="text" id="txtNS" name="txtNS"></td>
                            </tr> 
                            <tr>
                                <td >Giới Tính </td> <td ><input type="text" id="txtGT" name="txtGT"></td>
                            </tr> 
                            <tr>
                                <td >Email  </td><td ><input type="text"id="txtEM" name="txtEM"></td>
                            </tr> 
                           <tr>
                               <td  colspan="2"><input type="submit"  value="CapNhap" ></td>
                               
                            </tr> 
                        </table>
                    </form>
                    <!--end form cap nhap-->
                    <hr>
                    <br>
                    
                    <table border="1" style="margin-left: 20px;" >
                       
                        <tr style="background-color: #C3EEE5">
                            <td class="space">user name</td>
                            <td class="space">pass word</td>
                            <td class="space"> id</td>
                            <td class="space"> ho ten</td>
                            <td class="space">dia chi</td>
                            <td class="space">gioi tinh</td>
                            <td class="space">ngay sinh</td>
                            <td class="space"> pail</td>
                            <td class="space">Cập Nhập</td>
                            <td class="space">Xóa</td>
                        </tr>
                   
                         
                   
                    <%
                        int i=1;
                        List<NguoiDung> list=NguoiDungDB.loadAll();
                        for(NguoiDung nd :list){
                     %>
                      <tr>
                        <td>
                            <p class="<%= i%>"> <%=nd.getUseName() %></p> 
                        </td>
                        <td>
                            <p class="<%= i%>"> <%=nd.getPassWord() %></p> 
                        </td>
                        <td>
                            <p class="<%= i%>"><%= nd.getId() %></p>
                        </td>
                        <td>
                            <p class="<%= i%>"> <%=nd.getHoTen() %></p>
                        </td>
                        <td>
                            <p class="<%= i%>"><%=nd.getDiaChi() %></p>
                        </td>
                        <td>
                            <p class="<%= i%>"> <%=nd.getNgaySinh() %></p>
                        </td>
                        <td>
                            <p class="<%= i%>">   <%=nd.getGioiTinh() %></p>
                        </td>
                        <td>
                            <p class="<%= i%>"> <%=nd.getEmail() %></p>
                        </td>
                        <td> <input type="button" value="Cap Nhap" onclick="xuLyCapNhap(<%=i %>)" > </td>
                        <td><form action="quanlynguoidung.jsp">
                                <input type="hidden" name="txtHidden" value="<%= nd.getUseName() %>" />
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
            <!-- end noi dung-->
            <div id="clear">

            </div>
            <!--header-->
            <jsp:include page="page/footer.jsp"/>
            <!--end header-->
        </div>
         <script src="jquery/XuLyQLNguoiDung.js" type="text/javascript"></script>
    </body>
</html>
