<%--
  Created by IntelliJ IDEA.
  User: kevinhadinata
  Date: 2019-03-28
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Detail</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div>
        <a href="../dashboard"><button class="btn btn-default">Dashboard</button></a>
        <a href="../myProduct"><button class="btn btn-primary">My Product</button></a>
        <a href="../cart"><button class="btn btn-success">Cart</button></a>
        <a href="../logout"><button class="btn btn-danger">Logout</button></a>
    </div>
    <div>
        <h1>${product.name}</h1>
        <h3>${product.description}</h3>
    </div>
    <div>
        Price: ${product.price}<br>
        Stock: ${product.stock}<br>
        Owner: ${productOwner}
    </div>
</div>
</body>
</html>
