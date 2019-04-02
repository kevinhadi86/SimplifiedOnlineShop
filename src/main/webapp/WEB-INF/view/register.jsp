<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-25
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>Register</h1>
    <form:form method="POST" action="register/process" modelAttribute="user">
        <div class="form-group">
            Name: <form:input class="form-control" path="name"/>
        </div>
        <div class="form-group">
            Email: <form:input class="form-control" path="email"/>
        </div>
        <div class="form-group">
            Password: <form:password class="form-control" path="password"/>
        </div>
        <input class="btn btn-primary" type="submit" value="submit"/>
    </form:form>
</div>
</body>
</html>
