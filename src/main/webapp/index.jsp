<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/display-discount" method="post">
    <input type="text" name="description" placeholder="Description:"/><br><br>
    <input type="text" name="price" placeholder="List Price:"/><br><br>
    <input type="text" name="percent" placeholder="Discount Percent:"/>%<br><br>
    <input type="submit" id="submit" value="Calculate"/>
</form>
</body>
</html>