<%--
  Created by IntelliJ IDEA.
  User: wb263970
  Date: 2017/7/13
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@Controller注解</title>
</head>
<body>

<%
    String attr = (String) request.getAttribute("message");
    response.getWriter().print(attr);
%>
</body>
</html>
