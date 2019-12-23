<%-- 
    Document   : xulydangnhap
    Created on : Dec 2, 2019, 8:22:48 AM
    Author     : daoquyet
--%>
<%@page import="database.NguoiDungDB"%>
<%@page import="model.NguoiDung"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! xu ly dang nhap</h1>
        <% 
           session.removeAttribute("ten");
           request.getRequestDispatcher("index.jsp").forward(request, response);
        %>        
     
    </body>
</html>
