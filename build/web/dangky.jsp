<%-- 
    Document   : dangky.jsp
    Created on : Dec 3, 2019, 7:46:01 AM
    Author     : daoquyet
--%>

<%@page import="database.NguoiDungDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang đăng ký thành viên</title>
    </head>
    <body>
        <% 
            String use=request.getParameter("txtTen");
            String pass=request.getParameter("txtPass");
            String id="2";
            String hoten=request.getParameter("txtHoTen");
            String diachi=request.getParameter("txtDiaChi");
            String gioitinh=request.getParameter("txtGioiTinh");
            String email=request.getParameter("txtEmail");
            String ngaysinh=request.getParameter("txtNgaySinh");
            if(use!=null){
                NguoiDungDB nd=new NguoiDungDB();
                nd.themNguoiDangKy(use, pass, id, hoten, diachi, gioitinh, email, ngaysinh);
                
            }
        %>
        <table >
        <form action="dangky.jsp" method="get">
            <tr>
                <td colspan="2"> Đăng ký thông tin thành viên website ontaptv6789.com </td>
                
            </tr>
            <tr >
                <td > Tên Đăng Nhập : </td>
                <td><input type="text" name="txtTen" ></td>
            </tr>
            <tr>
                <td> Mật Khẩu : </td>
                <td><input type="password" name="txtPass" ></td>
            </tr>
            <tr>
                <td>Nhập Lại Mật Khẩu : </td>
                <td><input type="password" name="txtPass" ></td>
            </tr>
            <tr>
                <td> Họ Tên : </td>
                <td><input type="text" name="txtHoTen" ></td>
            </tr>
            <tr>
                <td> Địa Chỉ : </td>
                <td><input type="text" name="txtDiaChi" ></td>
            </tr>
            <tr>
                <td> Ngày Sinh : </td>
                <td><input type="text" name="txtNgaySinh" ></td>
            </tr>
            <tr>
                <td> Giới Tính : </td>
                <td><input type="text" name="txtGioiTinh" ></td>
            </tr>
            <tr>
                <td> Tên Đăng Nhập : </td>
                <td><input type="text" name="txtEmail" > </td>
            </tr>
            <tr>
                
                <td colspan="2"><input type="submit" name="btnDangKy" value="Đăng Ký" > </td>
            </tr>
        </form>
        </table>
    </body>
</html>
