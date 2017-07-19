<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/19
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@ModelAttribute和@RequestMapping同时注释一个方法</title>
</head>
<body>
    <h3>@ModelAttribute和@RequestMapping同时注释一个方法</h3>
<form action="login4" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>密码:</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>
