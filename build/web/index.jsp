<%-- 
    Document   : index.jsp
    Created on : Nov 28, 2019, 6:16:20 AM
    Author     : daoquyet
--%>

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

        <div class="container">     
            <!--header-->
            <jsp:include page="pages/Header.jsp"/>
            <!--end header-->
            <!--menu-->
            <jsp:include page="pages/MenuTop.jsp"/>
            <!--end menu-->
             <!--begin content-->
             <section>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" > 
                        <br><br>
                        <h3 style="padding-left: 50px">Danh Sách Lớp Học</h3>
                    </div>

                </div>
                <div class="row">

                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">

                        <a href="Controller?x=lop6.jsp" target="_blank"><img src="images/lop6.png" alt="Tieng viet lop 6"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                        <h3>Tiếng Việt Lớp 6</h3>
                        Theo chương trình SGK 
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        <a href="Controller?x=lop6.jsp" target="_blank"><img src="images/lop7.png" alt="Tieng viet lop 7"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                        <h3>Tiếng Việt Lớp 7</h3>
                        Theo chương trình SGK 
                    </div>


                </div>
                 <br><br>
                <div class="row">

                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        <a href="Controller?x=lop6.jsp" target="_blank"><img src="images/lop8.png" alt="Tieng viet lop 8"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                        <h3>Tiếng Việt Lớp 6</h3>
                        Theo chương trình SGK 
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        <a href="lop6.jsp" target="_blank"><img src="images/lop9.png" alt="Tieng viet lop 9"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                        <h3>Tiếng Việt Lớp 9</h3>
                        Theo chương trình SGK 
                    </div>


                </div>

            </section>
            <section>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12" > 
                        <br><br>
                        <h3 style="padding-left: 50px">Bảng Xếp Hạng Kết Quả Thi Đầu</h3>
                    </div>

                </div>
                <br><br>
                <div class="row">

                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="text-align: center"> 
                        <img src="images/so2.png" alt=""/>
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="text-align: center"> 
                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>
                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>
                        <div>Điểm Danh Hiệu :<em style="color: gold">9999 </em></div>
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="align-content: center"> 
                        <img src="images/so2.png" alt=""/>
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="text-align: center"> 
                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>
                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>
                        <div>Điểm Danh Hiệu :<em style="color: gold">8888 </em></div>
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="align-content: center"> 
                        <img src="images/so3.png" alt=""/>
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" style="text-align: center"> 
                        <div><br>Họ Tên :Nguyễn Hoàng Sơn</div>
                        <div>Địa Chỉ : Đăng thúc vinh tphcm</div>
                        <div>Điểm Danh Hiệu :<em style="color: gold">7777 </em></div>
                    </div>
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
    </body>
</html>

