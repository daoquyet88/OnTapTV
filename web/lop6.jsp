<%-- 
    Document   : index.jsp
    Created on : Nov 28, 2019, 6:16:20 AM
    Author     : daoquyet
--%>

<%@page import="database.DapAnDB"%>
<%@page import="model.DapAn"%>
<%@page import="java.util.List"%>
<%@page import="model.De" %>
<%@page import="database.DeDB" %>
<%@page import="model.DapAn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Title Page</title>

        <!-- Bootstrap CSS -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/website.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>

             
            <!--header-->
            <jsp:include page="pages/Header.jsp"/>
            <!--end header-->
            <!--menu-->
            <jsp:include page="pages/MenuTop.jsp"/>
            <!--end menu-->
            <!--begin content-->
            <!--begin content-->
            <section>
                
            </section>
            <section>

                <%

                    List<De> list = DeDB.getAll();
                    for (De sp : list) {
                %>    
                <div class="row" >
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <h3 style="margin-left:200px " >  
                            <%= sp.getTieuDe()%>
                        </h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"  >
                        <h3 style="padding-top:90px;padding-left: 60px"><%= sp.getMaDe()%> </h3>  
                    </div>
                    <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8" >
                        <h3> <%= sp.getNoiDung()%></h3>

                    </div>

                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">

                    </div>

                </div>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" >
                        <b style="margin-left: 700px"> <%= sp.getTacGia()%></b>

                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">

                    </div>
                    <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8" >
                        <b ><%= sp.getChuThich()%></b>

                    </div>

                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">

                    </div>

                </div>
                <%
                    }
                %>     
            </section> 
            <!-- cau tra loi-->
            <section>
                <div >   
                    <hr >
                    <input type="button" value="Bat dau lam" onclick="demNguoc()">
                    <em id="dongHo" style="font-family: fantasy; font-family: cursive;font-size:70px;color: red "></em>
                    <em id="htg" style="color: #ff6600"></em>
                    <em id="kq" style="color: red"></em>
                </div>
                <%
                    List<DapAn> lt = DapAnDB.getAll();
                    int i = 1;
                    int z = 100;
                    int id = 1;
                    String tl1;
                    String tl2;
                    String tl3;
                    String[] data1;
                    String[] data2;
                    String[] data3;
                    for (DapAn da : lt) {
                        data1 = da.getTraLoi1().split("\\.");
                        tl1 = data1[0];

                        data2 = da.getTraLoi2().split("\\.");
                        tl2 = data2[0];

                        data3 = da.getTraLoi3().split("\\.");
                        tl3 = data3[0];
                %>    
                <div class="row" >


                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">                        
                        <h3 style="margin-left:270px" />  
                        <%= i + "/"%>
                        <%= da.getCauHoi()%>

                        </h3>
                    </div>
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                        <h4 style="margin-left:350px " > 
                            <input  onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "A," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                            <% id++;%>

                            <%= da.getTraLoi1()%>

                            </h3>
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <h4 style="margin-left:350px " > 
                                    <input onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "B," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                                    <% id++;%>
                                    <%= da.getTraLoi2()%>
                                </h4>
                            </div>
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                                <h4 style="margin-left:350px " > 
                                    <input onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "C," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                                    <% id++;%>
                                    <%= da.getTraLoi3()%>
                                </h4>
                                <em id="<%= z%>" style="margin-left:300px ; color: red"> </em>
                                <% z++; %>
                            </div>
                    </div>

                    <%
                            i++;
                        }
                    %>   

            </section>
            <!--end content-->
            
            <!--begin footer-->
            <jsp:include page="pages/Footer.jsp"/>
            <!--end footer-->
        
        <!--end container-->
        <!-- jQuery -->
        <script src="jquery/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="jquery/XuLyTinhDiem.js"></script>
    </body>
</html>

