<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/18
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<h1>欢迎[${requestScope.user.username}]</h1>

<h1>访问request作用范围域中的user对象:[${requestScope.user.username}]</h1>
<h1>访问session作用范围域中的user对象:[${sessionScope.user.loginname}]</h1>
</body>
</html>
