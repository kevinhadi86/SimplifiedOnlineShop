<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-04-01
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transaction History</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div>
        <a href="dashboard"><button class="btn btn-default">Dashboard</button></a>
        <a href="logout"><button class="btn btn-danger">Logout</button></a>
    </div>
    <c:forEach items="${transactions}" var="transaction">
        <div>
            <h1>ID: ${transaction.id}</h1>
            <h2>GRAND TOTAL: ${transaction.totalPrice}</h2>
        </div>
        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total Price</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${transaction.items}" var="item">
                        <tr>
                            <td>${item.product.name}</td>
                            <td>${item.product.price}</td>
                            <td>${item.quantity}</td>
                            <td>${item.productPrice}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

    </c:forEach>

</div>

</body>
</html>
