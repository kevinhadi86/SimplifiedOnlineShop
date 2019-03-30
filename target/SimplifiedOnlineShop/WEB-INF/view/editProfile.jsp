<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-28
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UPDATE PROFILE</title>
</head>
<body>
<h2>UPDATE PROFILE</h2>
<form:form modelAttribute="user" method="post" action="edit/process">
    ID: <form:input path="id" disabled="true"/><br>
    Name: <form:input path="name"/><br>
    Email: <form:input path="email"/><br>
    Password: <form:password path="password"/><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
