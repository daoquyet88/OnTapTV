<%-- 
    Document   : index.jsp
    Created on : Nov 28, 2019, 6:16:20 AM
    Author     : daoquyet
--%>

<%@page import="database.NguoiDungDB"%>
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
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">

                        <a href="index.jsp"><img src="images/logo.png" /></a>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" style="padding-top:40px ">

                        <h1 style="font-family: fantasy ;font-size:45px; padding-left:100px"> Ôn Tập Tiếng Việt 6-7-8-9</h1>

                    </div>
                    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="padding-top:60px;padding-left: 160px">
                        <a href="dangky.jsp"><button type="button" class="btn btn-info">Đăng Ký</button></a>

                        <a href="dangnhap.jsp"><button type="button" class="btn btn-danger">Đăng Nhập</button></a>

                    </div>



                </div>
            </div>
            <!--end header-->
            <!--menu-->
            <div class="row" style="background-color: bisque;">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                    <div class="container">
                        <ul class="nav nav-tabs" > 
                            <li class="nav-item">
                                <a href="index.jsp" class="nav-link active">Trang Chủ</a>
                            </li>
                            <li role="presentation" class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                    Lớp Học<span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="nav-item">
                                        <a class="nav-link active" href="Controller?x=lop6.jsp" target="_blank">Lớp 6</a>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link active" href="Controller?x=lop6.jsp" target="_blank">Lớp 7</a>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link active" href="Controller?x=lop6.jsp" target="_blank">Lớp 8</a>
                                    </li>

                                    <li class="nav-item">
                                        <a class="nav-link active" href="Controller?x=lop6.jsp" target="_blank">Lớp 9</a>
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
                                        <a href="Controller?x=lop6.jsp" class="nav-link active">Giữ HK I</a>
                                    </li>

                                    <li class="nav-item">
                                        <a href="Controller?x=lop6.jsp" class="nav-link active">Cuối HK I</a>
                                    </li>

                                    <li class="nav-item">
                                        <a href="Controller?x=lop6.jsp" class="nav-link active"> Giữa HK II </a>
                                    </li>

                                    <li class="nav-item">
                                        <a href="Controller?x=lop6.jsp" class="nav-link active">Cuối HK II</a>
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
                
                <form class="form-horizontal" action="dangky.jsp" method="get">
                    <h3>Form Đăng Ký Tài Khoản :</h3><br>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Tên Đăng Nhập:</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="txtTen"  placeholder="Điền Tên Đăng Nhập">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
                        <div class="col-sm-6"> 
                            <input type="password" class="form-control" name="txtPass"  placeholder="Điền mật khẩu">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="pwd">Nhập Lại Mật khẩu:</label>
                        <div class="col-sm-6"> 
                            <input type="password" class="form-control" name="txtPass"  placeholder="Điền Lại mật khẩu">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Họ Tên:</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="txtHoTen"  placeholder="Điền Họ Tên">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Địa Chỉ:</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="txtDiaChi"  placeholder="Điền Địa Chỉ">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Ngày Sinh:</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="txtNgaySinh"  placeholder="Điền Ngày Tháng Năm Sinh">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Giới Tính:</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="txtGioiTinh"  placeholder="Điền Giới Tính">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Email:</label>
                        <div class="col-sm-6">
                            <input type="email" class="form-control" id="email" name="txtEmail" placeholder="Điền email">
                        </div>
                      </div>
                    
                    
                    <div class="form-group"> 
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">Đăng Ký</button>
                        </div>
                    </div>
                </form>
            </section>
            <section>
                <%
                    String use = request.getParameter("txtTen");
                    String pass = request.getParameter("txtPass");
                    String id = "2";
                    String hoten = request.getParameter("txtHoTen");
                    String diachi = request.getParameter("txtDiaChi");
                    String gioitinh = request.getParameter("txtGioiTinh");
                    String email = request.getParameter("txtEmail");
                    String ngaysinh = request.getParameter("txtNgaySinh");
                    if (use != null) {
                        try {
                                NguoiDungDB nd = new NguoiDungDB();
                                nd.themNguoiDangKy(use, pass, id, hoten, diachi, gioitinh, email, ngaysinh);
                                 out.print("Đăng Ký Thành Công");
                            } catch (Exception e) {
                                out.print("Đăng Ký Thất Bại");
                            }
                        
                    }
                  
                %>
               <!-- <table style="margin-left: 250px;" >
                    <form action="dangky.jsp" method="get">
                        <tr>
                            <td colspan="2" ><h4 style="font-family: cursive"> Đăng ký thông tin thành viên website ontaptv6789.com</h4> </td>

                        </tr>
                        <tr >
                            <td > Tên Đăng Nhập : </td>
                            <td><input type="text" name="txtTen" ></td>
                        </tr>
                        <tr>
                        <br>
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
                </table>-->
            </section>
            <!--end content-->
            <footer  style="background-color:darkkhaki">



                <div class="row">
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        <a href="index.jsp">Trang Chủ</a>
                    </div>                 

                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        Tiếng việt Lớp 6
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        Tiếng việt Lớp 7
                    </div>
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        Tiếng việt Lớp 8
                    </div>

                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        Tiếng việt Lớp 9
                    </div>
                    <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
                        Góp Ý
                    </div>
                    <div class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
                        Liên Hệ
                    </div>                   




                </div><br><br>
                <div class="row">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" style="text-align: center"> 
                        Bản Quyền : Nhóm 6 -Phiên bản 1.0
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" style="align-content: center"> 

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

