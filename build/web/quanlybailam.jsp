<%-- 
    Document   : home
    Created on : Dec 3, 2019, 10:11:46 AM
    Author     : daoquyet
--%>

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
            
                <div id="content" style=" background-color: #ebebeb">
                    content
                </div>
            </div>
            <!-- end noi dung-->
            <div id="clear">
                
            </div>
            <div id="footer" style="height: 100px;background-color: #1b6d85">
                <div > footer</div>
            </div>
        </div>
    </body>
</html>
