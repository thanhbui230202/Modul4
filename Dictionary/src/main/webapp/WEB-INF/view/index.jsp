<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/convert">
    <table>
        <tr>
            <td><label>English</label></td>
            <td><input type="text" name="eng"></td>
            <td><input type="submit" value="Translate"></td>
        </tr>
    </table>
</form>
</body>
</html>