<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SessionAttributes 注解</title>
</head>
<body>
request中names:${requestScope.names}
<br/>
request中age:${requestScope.age}
<br/>
<hr/>
session中names:${sessionScope.names }
<br/>
session中age:${sessionScope.age }
<br/>
</body>
</html>
