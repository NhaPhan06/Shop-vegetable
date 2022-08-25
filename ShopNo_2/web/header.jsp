<%-- 
    Document   : header
    Created on : Mar 8, 2022, 10:55:25 PM
    Author     : PhongNha
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="main-top">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                <c:if test="${sessionScope.log != null}">
                    <p style="color: white">${User.fullName}</p>
                </c:if>

            </div>
            <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
                <div class="login-box">
                    <c:if test="${sessionScope.log != null}">
                        <form action="MainController" method="POST">
                            <input class="fa fa-user s_color" type="submit" name="action" value="Logout" />
                        </form>
                    </c:if>
                    <c:if test="${sessionScope.log == null}">
                        <form action="MainController" method="POST">
                            <input class="fa fa-user s_color" type="submit" name="action" value="Login"/>
                        </form>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Main Top -->

<!-- Start Main Top -->
<header class="main-header">
    <!-- Start Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
        <div class="container">
            <!-- Start Header Navigation -->
            <div class="navbar-header">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="login.html"><img src="images/logo.png" class="logo" alt=""></a>
            </div>
            <!-- End Header Navigation -->

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-menu">
                <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                    <li class="dropdown">
                        <a href="ShopController" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">SHOP</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->

            <!-- Start Atribute Navigation -->
            <div class="attr-nav">
                <ul>
                    <li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
                    <li class="side-menu">
                        <a href="CartController">
                            <i class="fa fa-shopping-bag"></i>
                            <span class="badge">${cart.count}</span>
                            <p>My Cart</p>
                        </a>
                    </li>
                </ul>
            </div>
            <!-- End Atribute Navigation -->
        </div>
        <!-- Start Side Menu -->
        <!-- End Side Menu -->
    </nav>
    <!-- End Navigation -->
</header>
