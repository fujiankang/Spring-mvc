
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script type="application/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="application/javascript">
    $(document).ready(function () {
        testRequestBody();
    });
    function testRequestBody() {
        $.ajax(
            "${pageContext.request.contextPath}/fastjson/testRequestBody",
            //发送请求的url字符串
            {
                dataType: "json",//预期服务器返回的数据类型
                type: "post",//请求方式POST或GET
                contentType: "application/json",//发送信息至服务器时的内容编码格式
                data: JSON.stringify({id: 1, name: "Spring MVC企业应用实战", author: "老子"}),//发送到服务器的数据
                asyn: true,//默认设置下,所有请求均为异步请求.,如果设置为false,则发送同步请求.
                //请求成功的回调函数
                success: function (data) {
                    console.log(data);
                    $("#id").html(data.id);
                    $("#name").html(data.name);
                    $("#author").html(data.author);
                },
                //请求出错调用的函数
                error: function () {
                    alert("数据发送失败");
                }
            }
        );
    }
</script>
<head>
    <title>JsonTest</title>
</head>
<body>
编号:<span id="id"></span><br>
书名:<span id="name"></span><br>
作者:<span id="author"></span><br>
</body>
</html>
