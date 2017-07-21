<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="application/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script type="application/javascript">
    $(document).ready(function () {
        testRequestBody();
    });


    function testRequestBody() {
        $.post(
            "${pageContext.request.contextPath}/retjson/testRequestBody", null,
            function (data) {
                //发送请求的url字符串
                $.each(data, function () {
                    var tr = $("<tr align='center'/>");
                    $("<td/>").html(this.id).appendTo(tr);
                    $("<td/>").html(this.name).appendTo(tr);
                    $("<td/>").html(this.author).appendTo(tr);
                    $("#booktable").append(tr);
               })
            }, 'json'
        );
    }
</script>
<head>
    <title>JsonTest</title>
</head>
<body>
    <table id="booktable" border="1" style="border-collapse: collapse;">
            <tr align="center">
                <th>编号</th>
                <th>书名</th>
                <th>作者</th>
            </tr>
    </table>
</body>
</html>
