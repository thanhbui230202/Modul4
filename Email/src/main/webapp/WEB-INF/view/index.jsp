<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>List Email</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Languages</th>
        <th>Page size</th>
        <th>Spams filter</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${emails}" var="e">
        <tr>
            <td>${e.id}</td>
            <td>${e.language}</td>
            <td>${e.pageSize}</td>
            <td>
                <c:if test="${e.spamFillter == true}">Spam filter</c:if>
                <c:if test="${e.spamFillter == false}">No Spam filter</c:if>
            </td>
            <td>${e.signature}</td>
            <td><a href="/edit?id=${e.id}">Update</a></td>
        </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>