<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<label>Calculator</label>
<form action="/index/calculator" method="post">
    <input type="number" name="a">
    <input type="number" name="b">
    <br>
    <input type="submit" name="cal" value="Addtion">
    <input type="submit" name="cal" value="Subtraction">
    <input type="submit" name="cal" value="Multiplication">
    <input type="submit" name="cal" value="Division">
    <br>
    <label>Result ${cals}: ${results}</label>
</form>
</body>
</html>