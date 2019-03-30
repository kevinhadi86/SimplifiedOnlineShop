<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-29
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Product</title>
</head>
<body>
<div>
    <h2>My Product</h2>
    <a href="product/add/form">
        <button>Add Product</button>
    </a>
    <table>
        <thead>
        <tr>
            <th>No</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:set var="count" value="${0}"/>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${count=count+1}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>
                    <a href="product/${product.id}">
                        <button>View</button>
                    </a>
                    <a href="product/update/form/${product.id}">
                        <button>Update</button>
                    </a>
                    <a href="product/delete/${product.id}">
                        <button>Delete</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
