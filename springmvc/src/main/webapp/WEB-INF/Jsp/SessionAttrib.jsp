<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/17
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginForm页面</title>
</head>
<body>
<h3>测试@SessionAttributes注解</h3>
<br>
<form action="loginatt" method="post">
    <table>
        <tr>
            <td><label>登录名:</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" id="password" name="password"></td>
        </tr>

            <td><input id="submit" type="submit" value="登陆"></td>
        </tr>
    </table>
</form>
</body>
</html>

