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
<form:form method="POST" action="login/process" modelAttribute="user">
    Email: <form:input path="email"/><br>
    Password: <form:input path="password"/>
    <input type="submit" value="submit"/>
</form:form>
</body>
</html>
