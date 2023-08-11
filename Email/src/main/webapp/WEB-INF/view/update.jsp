<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Email</h1>
<form:form action="update" method="post" modelAttribute="email">
    <table>
        <tr>
            <td>ID</td>
            <td>
              <p><form:hidden path="id"></form:hidden>${email.id}</p>
            </td>
        </tr>
        <tr>
            <td>Language</td>
            <td><form:input path="language"></form:input></td>
        </tr>
        <tr>
            <td>Page size</td>
            <td><form:input path="pageSize"></form:input></td>
        </tr>
        <tr>
            <td>Spams filter</td>
            <td>
                <form:checkbox path="spamFillter"></form:checkbox>Spam filter
            </td>
        </tr>
        <tr>
            <td>Signature</td>
            <td><form:textarea path="signature"></form:textarea></td>
        </tr>
    </table>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
