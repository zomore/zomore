<%--
  Created by IntelliJ IDEA.
  User: hao
  Date: 2019/3/27
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file/upload.do" method="post" enctype="multipart/form-data">

    <label>上传图片：</label><input type="file" name="file"><br>
    <input type="submit">
</form>

</div>

</body>
</html>
