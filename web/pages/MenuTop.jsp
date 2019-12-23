<%-- 
    Document   : Menu
    Created on : Dec 16, 2019, 6:31:21 AM
    Author     : daoquyet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row" style="background-color: #f5e79e;">
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
                
                <li role="presentation" class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                        Kiểm Tra<span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="nav-item">
                            <a href="Controller?x=GiuaKyI.jsp" class="nav-link active">Giữ HK I</a>
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