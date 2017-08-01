<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ConversionService</title>
</head>
<body>
<form action="/initbinder" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"> </td>
        </tr>
        <tr>
            <td><label>生日:</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><input type="submit" id="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
