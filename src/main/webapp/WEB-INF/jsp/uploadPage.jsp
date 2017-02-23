<%--
  Created by IntelliJ IDEA.
  User: wb-zhangkenan
  Date: 2017/2/23
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js"></script>
</head>
<body>
路径：${pageContext.request.contextPath}
    <form method="post" name="upload" action="/file/uploadFileAction.do" enctype="multipart/form-data">
        上传文件：<input type="file" name="uploadFile" value="浏览"/> <input type="button" value="上传" onclick="doSubmitFile()"/>
    </form>
<script type="text/javascript">
    function doSubmitFile() {
        $('form[name="upload"]').submit();
    }
</script>
</body>
</html>
