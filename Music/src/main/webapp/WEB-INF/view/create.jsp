<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form"	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new music</h1>
<form:form method="post" action="doCreate" modelAttribute="music">
<table>
    <tr>
        <td>Name</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Single</td>
        <td><form:input path="single" /></td>
    </tr>
    <tr>
        <td>Category</td>
        <td><form:checkboxes path="category" items="${category}"/></td>
    </tr>
    <tr>
        <td>Upload Music</td>
        <td><form:input path="pathMusic"/></td>
        <c:if test="${flags == false}">
            File upload is not correct format
        </c:if>
    </tr>
</table>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
