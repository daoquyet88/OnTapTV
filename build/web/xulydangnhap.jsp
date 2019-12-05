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
            String use=request.getParameter("txtTen");
            String pass=request.getParameter("txtPass");
            List<NguoiDung> user=NguoiDungDB.layMotNguoi(use, pass);
            int l= user.size();
            if(l>0){
                for(NguoiDung nd : user){
                    String id=nd.getId();
                    String useName=nd.getUseName();
                    if(id.equals("1")){

                        request.getRequestDispatcher("admin/home.jsp").forward(request, response);
                    }else if(id.equals("2")){                         
                               request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                
                }
            }else{       
                
                 request.getRequestDispatcher("dangnhap.jsp").forward(request, response);
            }
            
            
            
        %>        
     
    </body>
</html>
