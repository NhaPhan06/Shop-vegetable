<%-- 
    Document   : edit
    Created on : Mar 11, 2022, 8:36:38 PM
    Author     : PhongNha
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <title>CodePen - Form thu 2(source from bootsnipp)</title>
        <link rel="stylesheet" href="form-thu-2-source-from-bootsnipp/dist/style.css">

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <!--important link source from "https://bootsnipp.com/snippets/A36DP"-->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <section class="get-in-touch">
            <h1 class="title">Edit Product</h1>
            <form class="contact-form row" action="UpdateUserController" method="POST">
                <div class="form-field col-lg-12">
                    <p class="label">ID</p>
                    <input value="${detail.userID}" id="name" name="pID"class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Name</p>
                    <input value="${detail.fullName}" id="name" name="pN"class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Password</p>
                    <input value="${detail.password}" id="name"  name="pP"class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Role ID</p>
                    <input value="${detail.roleID}" id="name" name="pR" class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Address</p>
                    <input value="${detail.address}" id="name" name="pA"class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Phone</p>
                    <input value="${detail.phone}" id="name" name="pPH" class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <p class="label">Birthday</p>
                    <input value="${detail.birthday}" id="name" name="pB" class="input-text js-input" type="text" required>
                </div>
                <div class="form-field col-lg-12">
                    <input class="submit-btn" type="submit" value="Submit">
                </div>
            </form>
        </section>
        <!-- partial -->

    </body>
</html>

