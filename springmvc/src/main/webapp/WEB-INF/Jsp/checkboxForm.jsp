
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>checkboxForm</title>
</head>
<body>
<form:form modelAttribute="user" method="post" action="checkboxForm">
    <table>
        <tr>
            <td>选择课程:</td>
            <td>
                <form:checkbox path="courses" value="JAVAEE" label="JAVAEE"/>&nbsp;
                <form:checkbox path="courses" value="Mybatis" label="Mybatis"/>&nbsp;
                <form:checkbox path="courses" value="Spring" label="Spring"/>&nbsp;
            </td>
        </tr>
    </table>
    <form:checkbox path="reader" value="true"/> 已经阅读相关协议
</form:form>
</body>
</html>
