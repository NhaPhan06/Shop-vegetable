<%-- 
    Document   : create
    Created on : Feb 22, 2022, 9:08:53 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create new user Page</title>
    </head>
    <body>
        <h1>Create new user</h1>
        <form action="MainController" method="POST">
            UserID <input type="text" name="userID" required=""/></br>
            Full Name <input type="text" name="fullName" required=""/></br>
            Role ID <input type="text" name="roleID" value="US" readonly=""/></br>
            Password <input type="password" name="password" required=""/></br>
            Confirm <input type="password" name="confirm" required=""/></br>
            <input type="submit" name="action" value="create"/>
            <input type="reset" value="Reset"/>
    </body>
</html>
