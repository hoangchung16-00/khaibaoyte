<%@ taglib  prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with a Dashboard for Bootstrap 4.">
    <meta name="author" content="Creative Tim">
    <title>KHAI BÁO Y TẾ</title>
    <!-- Favicon -->
    <link rel="icon" href="/img/brand/favicon.png" type="image/png">
    <!-- Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700">
    <!-- Icons -->
    <link rel="stylesheet" href="/vendor/nucleo/css/nucleo.css" type="text/css">
    <link rel="stylesheet" href="/vendor/@fortawesome/fontawesome-free/css/all.min.css" type="text/css">
    <!-- Argon CSS -->
    <link rel="stylesheet" href="/css/argon.css?v=1.2.0" type="text/css">
</head>
    <body>
        <!-- Main content -->
        <div class="main-content" id="panel">
            <%--header--%>
            <tiles:insertAttribute name="header"/>
            <!-- Header -->
            <div class="header pb-6 d-flex align-items-center" style="min-height: 100px;">
                <!-- Mask -->
            </div>
            <div class="container-fluid mt--6">
                <%--body--%>
                <tiles:insertAttribute name="body"/>
                <%--footer--%>
                <tiles:insertAttribute name="footer"/>
            </div>
        </div>
        <!-- Argon Scripts -->
        <!-- Core -->
        <script src="/vendor/jquery/dist/jquery.min.js"></script>
        <script src="/vendor/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
        <script src="/vendor/js-cookie/js.cookie.js"></script>
        <script src="/vendor/jquery.scrollbar/jquery.scrollbar.min.js"></script>
        <script src="/vendor/jquery-scroll-lock/dist/jquery-scrollLock.min.js"></script>
        <!-- Argon JS -->
        <script src="/js/argon.js?v=1.2.0"></script>
        <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <!-- Javascript -->
        <script>
            $(function() {
                $( "#datepicker-1" ).datepicker();
            });
            $(function() {
                $( "#datepicker-2" ).datepicker();
            });
        </script>
    </body>
</html>