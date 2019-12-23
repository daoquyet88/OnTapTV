<%-- 
    Document   : index.jsp
    Created on : Nov 28, 2019, 6:16:20 AM
    Author     : daoquyet
--%>

<%@page import="database.DapAnDB"%>
<%@page import="model.DapAn"%>
<%@page import="model.DapAn"%>
<%@page import="java.util.List"%>
<%@page import="database.DeDB"%>
<%@page import="model.De"%>
<%@page import="model.De"%>
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
    <body onload="tatClick()">

        <div class="container">     
            <!--header-->
            <jsp:include page="pages/Header.jsp"/>
            <!--end header-->
            <!--menu-->
            <jsp:include page="pages/MenuTop.jsp"/>
            <!--end menu-->
            <!--begin content-->
            <!-- thong tin cac lop-->
            <section>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" > 
                        <nav class="navbar navbar-light" style="background-color: #C3EEE5;">
                            <a class="navbar-brand" href="#">Đề kiểm tra giữu kỳ 1</a>
                            <ul class="nav navbar-nav">
                                <li >
                                    <a href="Controller?x=Lop 6">Lớp 6</a>
                                </li>
                                <li >
                                    <a href="Controller?x=Lop 7">Lớp 7</a>
                                </li>
                                <li >
                                    <a href="Controller?x=Lop 8">Lớp 8</a>
                                </li>
                                <li >
                                    <a href="Controller?x=Lop 9">Lớp 9</a>
                                </li>
                            </ul>
                        </nav>   
                    </div>

                </div>

            </section>
            <!--end  thong tin cac lop-->
            <section>
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" style="padding-left:150px;">
                    <ul style="list-style-type: none"  >

                        <%
                            String lop = "" + request.getAttribute("lop");
                            //String lopx=request.getParameter("txtLop");
                            if ((lop != null)) {
                               
                                List<De> ls = DeDB.layDeTheoMaLop(lop);
                                for (De d : ls) {
                        %>    

                        <li style="float: left;padding-left: 10px;padding-right: 10px;">                       
                            <form action="GiuaKyI.jsp" method="Get">  
                                <input  type="hidden" name="txtMaDe" value="<%= d.getMaDe()%>" />
                                <input  type="hidden" name="txtLop" value="<%= d.getLop()%>" />
                                <input  type="submit" value="<%= d.getMaDe()%>" name="action"/>
                            </form>
                        </li>

                        <% }
                        }                   %>  
                    </ul>
                </div>
            </section>
            <section style=" height: 600px">
                <%
                    String _maDe = request.getParameter("txtMaDe");
                    String _lop = request.getParameter("txtLop");
                    if ((_maDe != null) && (_lop != null)) {

                        List<De> list = DeDB.layDeTheoMaLopMaDe(_maDe,_lop);
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
                    }
                %>     


            </section>
            <!-- cau tra loi-->
        <section >
            <div class="row">
                
                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <br>
                    <hr style="background-color: #fff;border-top: 2px dashed #8c8b8b;">
                    <br>
                </div>
            </div>
            <div class="row">
                
                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                    <input type="button" value="Bắt đầu làm :" onclick="demNguoc()"><br>
                    <em id="dongHo" style="font-family: fantasy; font-family: cursive;font-size:30px;color: red "></em>
                </div>
                <div class="col-xs-10 col-sm-10 col-md-10col-lg-10">    
                    <h4>Thời Gian Làm Bài 60s :</h4> 
                    <h4>Đáp Án Bài Làm :</h4> 
                    <em id="htg" style="color: #ff6600"></em>
                    <em id="kq" style="color: red;font-size:20px"></em>
                    <br>
                </div>
            </div>
            <%
                List<DapAn> lt = DapAnDB.getOne(_maDe);
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

                <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"> 
                </div>
                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">                        
                    <h4  />  
                    <%= i + "/"%>
                    <%= da.getCauHoi()%>

                    </h4>
                </div>
                    <!-- begin tra loi 1-->
                 <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"> 
                </div>
                <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <h4 style="padding-left: 40px" > 
                        <% 
                            String t1=da.getTraLoi1();
                            if(t1.equals("x")){
                               
                        %> 
                        <textarea  rows="5" cols="80" id="txtTD" name="txtTD" ></textarea>
                        <%
                            }else{
                        %>
                        <input  onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "A," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                        
                        <% id++;%>

                        <%= da.getTraLoi1()%>
                        <%
                            }
                        %>
                      
                        </h3>
                        
                        </div>
                          <!-- begin tra loi 2-->
                           <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"> 
                            </div>
                        <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                            <h4 style="padding-left: 40px" > 
                                <% 
                            String t2=da.getTraLoi2();
                            if(t2.equals("o")){
                               String x="okokokoko"; 
                            }
                            else 
                            if(t2.equals("x")){
                               
                        %> 
                        <textarea  rows="5" cols="80" id="txtTD" name="txtTD" ></textarea>
                        <%
                            }else{
                        %>
                                <input onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "B," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                                <% id++;%>
                                <%= da.getTraLoi2()%>
                                <%
                            }
                        %>
                            </h4>
                        </div>
                             <!-- begin tra loi 3-->
                              <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"> 
                </div>
                        <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                            <h4 style="padding-left: 40px" > 
                                <% 
                            String t3=da.getTraLoi3();
                            if(t3.equals("o")){
                               String x="okokokoko"; 
                            }
                            else if(t3.equals("x")){
                               
                        %> 
                        <textarea  rows="5" cols="80" id="txtTD" name="txtTD" ></textarea>
                        <%
                            }else{
                        %>
                                <input onclick="hamdautien('<%= id%>', '<%= z%>', '<%= i%>')" type="radio" value="<%= "C," + da.getDapAn()%>" name="<%= i%>"  id="<%= id%>">
                                <% id++;%>
                                <%= da.getTraLoi3()%>
                                 <%
                            }
                        %>
                            </h4>
                            <em id="<%= z%>" style=" color: red"> </em>
                            <% z++; %>
                        </div>
                </div>

                <%
                        i++;
                    }
                %>   
                <div class="row">
                    <br>
                    <br>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                    </div>
                    <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
                         <form action="GiuaKyI.jsp" method="Get">  
                            <input style="text-decoration: none" type="hidden" name="txtMaDe" value="<%= _maDe %>" />
                            <input style="text-decoration: none" type="hidden" name="txtLop" value="<%= _lop %>" />
                            <input style="text-decoration: none" type="submit" value="Làm Lại" name="action"/>
                        </form>
                        
                    </div>
                    <%
                        if(session.getAttribute("ten")!=null){
                    
                       
                    %>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        <form action="xuLyLuuBaiLam.jsp">
                            <input type="submit" value="Luu ket qua">
                        </form>
                        
                    </div>
                    <%
                                
                        }
                    
                    %>
                </div>
        </section>
            <!--end content-->
            <!--begin footer-->
            <jsp:include page="pages/Footer.jsp"/>
            <!--end footer-->
        </div>
        <!-- jQuery -->
        <script src="jquery/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="jquery/XuLyTinhDiem.js"></script>
    </body>
</html>

