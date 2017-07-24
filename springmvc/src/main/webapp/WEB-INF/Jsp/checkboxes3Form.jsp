
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>checkBoxes测试</title>
</head>
<body>
    <form:form modelAttribute="employee" method="post" action="checkboxesForm">
        <table>
            <tr>
                <td>选择课程:</td>
                <td><form:checkboxes items="${deptList}" path="depts" itemLabel="name" itemValue="id"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
