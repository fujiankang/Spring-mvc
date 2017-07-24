
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user" method="post" action="registers">
<table>
    <tr>
        <td><form:hidden path="ids"/></td>
    </tr>
    <tr>
        <td>姓名</td>
        <td><form:input path="username"/></td>
    </tr>
    <tr>
        <td>性别:</td>
        <td><form:input path="sex"/></td>
    </tr>
    <tr>
        <td>年龄:</td>
        <td><form:input path="age"/></td>
    </tr>
    <tr>
        <td>密码:</td>
        <td><form:password showPassword="true"  path="password"/></td>
    </tr>
    <tr>
        <td>多行输入textarea:</td>
        <td><form:textarea  path="remark" rows="5" cols="30"/></td>
    </tr>
</table>
</form:form>
</body>
</html>
