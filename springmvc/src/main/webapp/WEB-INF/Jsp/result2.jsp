<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/17
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Model And ModelMap</title>
</head>
<body>
    Reuslt：${user.logginname}
    <h3>测试@ModelAttribute注释void返回值的方法</h3>
    访问request作用域中loginname对象:${requestScope.loginname}<br>
    访问request作用域中password对象:${requestScope.password}<br>

</body>
</html>
