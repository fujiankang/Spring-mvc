
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@ModelAttribute(value="")</title>
</head>
<body>
<h3>测试@ModelAttribute(value="")注册返回具体类的方法</h3>
<form action="login1" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
