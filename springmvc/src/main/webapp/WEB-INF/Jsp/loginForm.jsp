<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/18
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <h1>登陆页面</h1>
<br/>
    <form action="login" method="post">
        <table>
            <tr>
                <td><label>登录名:</label></td>
                <td><input type="text" id="loginname" name="loginname"></td>
            </tr>
            <tr>
            <td><label>密码:</label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>

        </table>
        <tr>
            <td><input id="submit" type="submit" value="登陆"></td>
        </tr>
    </form>
<hr/>
</body>
</html>
