<%--
  Created by IntelliJ IDEA.
  User: hao
  Date: 2019/3/8
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div style="text-align: center;margin-top: 500px">
    <img id="load" src="img/5-121204193936.gif" >
</div>


<script>
    var load = document.getElementById("load");
    load.onload=function () {
        window.location.href="${pageContext.request.contextPath}/headShop/login.do"
    }



</script>
</body>
</html>