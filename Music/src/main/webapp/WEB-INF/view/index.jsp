<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>List students</h1>
<a href="/create">Create new music</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Single</th>
        <th>Category</th>
        <th>Music</th>
    </tr>
    <c:forEach items="${musics}" var="m">
        <tr>
            <td>${m.name}</td>
            <td>${m.single}</td>
            <td>${m.displayMusic()}</td>
            <td>${m.pathMusic}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>