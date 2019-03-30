<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-29
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
<form:form method="post" modelAttribute="product" action="../add">
    Name: <form:input path="name"/><br>
    Description: <form:input path="description"/><br>
    Price: <form:input path="price"/><br>
    Stock: <form:input path="stock"/><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
