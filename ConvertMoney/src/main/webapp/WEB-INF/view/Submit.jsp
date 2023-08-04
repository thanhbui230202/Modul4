
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
</head>
<body>
<h1>Total</h1>
<fmt:formatNumber value="${results}" type = "currency"></fmt:formatNumber>
<%--<h1>${results}</h1>--%>
</body>
</html>
