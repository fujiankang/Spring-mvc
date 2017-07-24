<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>radiobuttos</title>
</head>
<body>
<form:form modelAttribute="sex" method="post" action="radiosMapbuttonForm">
    <table>
        <tr>
            <td>Map选择性别:</td>
            <td>
             <form:radiobuttons path="sex" items="${sexMap}"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
