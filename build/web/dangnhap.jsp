<%-- 
    Document   : dangnhap
    Created on : Dec 2, 2019, 8:12:56 AM
    Author     : daoquyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <form action="xulydangnhap.jsp" method="get">
            Tên Đăng Nhập :<input type="text" name="txtTen"><br>
            Mật Khẩu : <input type="password" name="txtPass"><br>
            <input type="submit" value="login" name="login" >
        </form>
        
    </body>
</html>
