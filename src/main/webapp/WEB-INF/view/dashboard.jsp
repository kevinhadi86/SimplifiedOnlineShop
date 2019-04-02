<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-26
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div>
            <a href="dashboard"><button class="btn btn-default">Dashboard</button></a>
            <a href="user/edit"><button class="btn btn-info">Edit Profile</button></a>
            <a href="myProduct"><button class="btn btn-primary">My Product</button></a>
            <a href="history"><button class="btn btn-success">My History</button></a>
            <a href="cart"><button class="btn btn-success">Cart</button></a>
            <a href="logout"><button class="btn btn-danger">Logout</button></a>
        </div>
        <hr>
        <div>
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
                        <th>Quantity</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:set var="count" value="${0}"/>
                    <c:forEach items="${products}" var="product">
                        <tr>
                            <form:form action="addItemToCart/${product.id}">
                                <td>${count=count+1}</td>
                                <td>${product.name}</td>
                                <td>${product.description}</td>
                                <td>${product.price}</td>
                                <td>${product.stock}</td>
                                <td><input name="quantity" required></td>
                                <td>
                                    <input type="submit" value="Add To Cart" class="btn btn-primary">
                                    <a href="product/${product.id}"><div class="btn btn-info">View</div></a>
                                </td>
                            </form:form>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</body>
</html>
