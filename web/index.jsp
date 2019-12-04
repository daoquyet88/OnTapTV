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
      <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
          <div>
            <div style="float: left;">
                <img src="images/logo.png" />
                Ôn Tập Tiếng Việt 6-7-8-9

            </div>
            <div style="float: right;padding-top:50px; padding-bottom: 0px;">
                <button type="button" class="btn btn-info">Đăng Nhập</button>
            
                <button type="button" class="btn btn-danger">Đăng Ký</button>
            </div>
            
            
            
            
          </div>
          
        </div>
      </div>
       <!--end header-->
        <!--menu-->
      <div class="row" style="background-color: bisque;">
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <div class="container">
                <ul class="nav nav-tabs" >  
                    <li role="presentation" class="dropdown">
                      <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                        Lớp Học<span class="caret"></span>
                      </a>
                      <ul class="dropdown-menu">
                          <li class="nav-item">
                              <a class="nav-link active" href="Controller?x=lop6.jsp" target="_blank">Lớp 6</a>
                            </li>
                      
                          <li class="nav-item">
                              <a href="#" class="nav-link active">Lớp 7</a>
                            </li>
                      
                          <li class="nav-item">
                              <a href="#" class="nav-link active">Lớp 8</a>
                            </li>
                      
                          <li class="nav-item">
                              <a href="#" class="nav-link active">Lớp 9</a>
                            </li>
                      </ul>              
                     </li>
                     <!--end lop hoc begin kiem tra-->      
                     <li role="presentation" class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                          Kiểm Tra<span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="nav-item">
                                <a href="#" class="nav-link active">Giữ HK I</a>
                              </li>
                        
                            <li class="nav-item">
                                <a href="#" class="nav-link active">Cuối HK I</a>
                              </li>
                        
                            <li class="nav-item">
                                <a href="#" class="nav-link active"> Giữa HK II </a>
                              </li>
                       
                            <li class="nav-item">
                                <a href="#" class="nav-link active">Cuối HK II</a>
                              </li>
                        </ul>              
                       </li>
                     <!-- end kiem tra-->
                    <li class="nav-item">
                      <a href="#" class="nav-link active">Thi Đấu</a>
                    </li>       
                    <li class="nav-item">
                      <a href="#" class="nav-link">Giói Thiệu</a>
                    </li>
                    <li class="nav-item">
                      <a href="#" class="nav-link disabled">Giói Thiệu</a>
                    </li>
                 </ul>
             
                </div>
        </div>
      </div>
       <!--end menu-->
        
    
    <!--begin content-->
      
      <section>
        
            <div class="row">
            
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                
                <a href="Controller?l=lop6.jsp" target="_blank"><img src="images/lop6.png" alt="Tieng viet lop 6"></a>
            </div>
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                    <h3>Tiếng Việt Lớp 6</h3>
                    Theo chương trình SGK 
                </div>
                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        <a href="Controller?l=lop7.jsp" target="_blank"><img src="images/lop7.png" alt="Tieng viet lop 7"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                        <h3>Tiếng Việt Lớp 7</h3>
                        Theo chương trình SGK 
                    </div>
                
            
            </div>
            <div class="row">
            
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                         <a href="Controller?l=lop8.jsp" target="_blank"><img src="images/lop8.png" alt="Tieng viet lop 8"></a>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                            <h3>Tiếng Việt Lớp 6</h3>
                            Theo chương trình SGK 
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                                 <a href="Controller?l=lop9.jsp" target="_blank"><img src="images/lop9.png" alt="Tieng viet lop 9"></a>
                            </div>
                            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3   ">
                                <h3>Tiếng Việt Lớp 9</h3>
                                Theo chương trình SGK 
                            </div>
                        
                    
                    </div>
            
      </section> 
      <footer  style="background-color:darkkhaki">
          
            
              
              <div class="row">
                  <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                      Tiếng việt Lớp 6
                  </div>
                  <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        Tiếng việt Lớp 7
                 </div>
                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        Tiếng việt Lớp 8
                </div>
                
                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        Tiếng việt Lớp 9
                </div>
                    
                     
              
              
              
          </div>
          <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                    Bản Quyền : Nhóm 6 -Phiên bản 1.0
                </div>
            </div>
      </footer>    
    
    <!--end container-->
    </div>
  
    <!-- jQuery -->
    <script src="jquery/jquery.min.js"></script>
    <!-- Bootstrap JavaScript -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>

