
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>radiobutton</title>
</head>
<body>
<form:form modelAttribute="sex" method="post" action="checkboxForm">
    <table>
        <tr>
            <td>选择性别:</td>
            <td>
                <form:radiobutton path="sex" value="男" />男&nbsp;
                <form:radiobutton path="sex" value="女" />女&nbsp;

            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

</body>
</html>
