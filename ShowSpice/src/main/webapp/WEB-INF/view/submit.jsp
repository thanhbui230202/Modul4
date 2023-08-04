<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách gia vị đã chọn</h1>
<c:forEach items="${saves}" var="c">
    <c:out value="${c}"></c:out>
</c:forEach>
</body>
</html>
