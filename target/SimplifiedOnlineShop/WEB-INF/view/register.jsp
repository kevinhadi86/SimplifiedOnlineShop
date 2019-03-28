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
</head>
<body>
    <h1>Register Form</h1>
    <form:form method="POST" action="register/process" modelAttribute="user">
        Name: <form:input path="name"/><br>
        Email: <form:input path="email"/><br>
        Password: <form:password path="password"/><br>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
