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
</head>
<body>
    <div>
        <h1>${product.name}</h1>
        <h5>${product.description}</h5>
        <div>
            Price: ${product.price}
            Stock: ${product.stock}
            Owner: ${product.owner}
        </div>
    </div>
</body>
</html>
