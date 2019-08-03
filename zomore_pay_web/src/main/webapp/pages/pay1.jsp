<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/21
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ;
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pay/aa.do" method="post">
    <input type="hidden" name="money" value="${requestScope.money}">
    <input type="hidden" name="id" value="${requestScope.id}">
    <input type="hidden" name="actualmoney" value="${requestScope.actualmoney}">
    授权码：<input type="text" name="authCode" style="width: 200px;height: 50px">
    <input type="submit" value="提交">
</form>
</body>
</html>
