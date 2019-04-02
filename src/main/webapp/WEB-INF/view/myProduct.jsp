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
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div>
        <a href="dashboard"><button class="btn btn-default">Dashboard</button></a>
        <a href="cart"><button class="btn btn-success">Cart</button></a>
        <a href="logout"><button class="btn btn-danger">Logout</button></a>
    </div>
    <hr>
    <div>
        <h1>My Product</h1>
        <a href="product/add/form"><button class="btn btn-primary">Add Product</button></a>
        <div class="table-responsive">
            <table class="table table-hover">
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
                                <button class="btn btn-info">View</button>
                            </a>
                            <a href="product/update/form/${product.id}">
                                <button class="btn btn-success">Update</button>
                            </a>
                            <a href="product/delete/${product.id}">
                                <button class="btn btn-danger">Delete</button>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
