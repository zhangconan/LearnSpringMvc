<%--
  Created by IntelliJ IDEA.
  User: zkn
  Date: 2016/12/3
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="resources/js/jquery-2.1.4.min.js" type="text/javascript"></script>
</head>
<body>
<input type="button" value="测试jsonp请求" onclick="testJsonp()" />
<input type="button" value="测试JSON数据" onclick="testJSON()" />
<script type="text/javascript">
    function testJsonp() {
        $.ajax({
            type:'get',
            url:'http://localhost:8003/jsonp/testJsonp',
            dataType:'jsonp',
            jsonp:"callback",
            success:function (data) {
                alert(data.userName+"  "+data.passWord);
            },
            error:function (err) {
                alert('出现错误了!!!');
            }
        });
    }
    
    function testJSON() {
        $.ajax({
            type: "POST",
            url: "/testJson",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify({"name":"张三"}),
            success: function (jsonResult) {
                alert(jsonResult);
            }
        });
    }
</script>
</body>
</html>
