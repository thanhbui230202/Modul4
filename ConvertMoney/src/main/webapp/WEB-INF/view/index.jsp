<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hi</title>
</head>
<body>
<form method="post" action="/usd">
    <label>USD</label>
    <input type="text" name="usd" placeholder="$" value="0">
    <label>Rate</label>
    <input type="text" name="rate" placeholder="rate" value="22000">
    <input type="submit" value="Converter" >
</form>
</body>
</html>