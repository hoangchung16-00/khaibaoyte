<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>KHAI BÁO Y TẾ</title>
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,800,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=BenchNine:300,400,700' rel='stylesheet' type='text/css'>
    <script src="/js/modernizr.js"></script>
    <!--[if lt IE 9]>
    <script src="/js/html5shiv.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<!-- ====================================================
header section -->
<header class="top-header">
    <div class="container">
        <div class="row">

            <div class="col-xs-7 header-logo ">
                <br>
                <a href="/"><img src="/img/logo_byt.png" alt="" class="img-responsive logo"></a>
            </div>

            <div class="col-md-12">
                <nav class="navbar navbar-default">
                    <div class="container-fluid nav-bar">

                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                            <ul class="nav navbar-nav navbar-right">
                                <li><a class="menu active menu--menuvie" href="/" >Trang Chủ</a></li>
                                <li><a class="menu menu--menuvie" href="/khaibaoytetoandan">Khai báo y tế toàn dân</a></li>
                                <li><a class="menu menu--menuvie" href="/khaibaodichuyennoidia">Khai báo di chuyển nội địa </a></li>
                                <li><a class="menu menu--menuvie" href="/thongkelichsukhaibao">Thống kê lịch sử khai báo</a></li>
                            </ul>
                        </div><!-- /navbar-collapse -->
                    </div><!-- / .container-fluid -->
                </nav>
            </div>
        </div>
    </div>
</header> <!-- end of header area -->

<section class="slider" id="home">
    <div class="container-fluid">
        <div class="row">
            <div id="carouselHacked" class="carousel slide carousel-fade" data-ride="carousel">
                <div class="header-backup"></div>
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active item--fixed">
                        <img src="/img/test.jpg" alt="">
                        <div class="carousel-caption">
                            <h1 style="font-family :sans-serif;font-size: 7rem;">Xét nghiệm</h1>
                            <p style="font-family:serif;font-size: 3rem;">xét nghiệm RT-PRC </p>
                            <button>Xem thêm</button>
                        </div>
                    </div>
                    <div class="item item--fixed">
                        <img src="img/test (3).jpg" alt="">
                        <div class="carousel-caption">
                            <h1 style="font-family :sans-serif;font-size: 7rem;">Tiêm chủng</h1>
                            <p style="font-family:serif;font-size: 3rem;">Đăng kí tiêm chủng </p>
                            <button>xem thêm</button>
                        </div>
                    </div>

                </div>
                <!-- Controls -->
                <a class="left carousel-control" href="#carouselHacked" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carouselHacked" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
    </div>
</section><!-- end of slider section -->



<!-- script tags
============================================================= -->
<script src="/js/jquery-2.1.1.js"></script>
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script src="/js/gmaps.js"></script>
<script src="/js/smoothscroll.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/custom.js"></script>
</body>
</html>