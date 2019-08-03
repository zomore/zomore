<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="index-main">
    <table id="table" data-resizable="true">
        <thead>
        <tr>
            <th data-field="id">商品条码</th>
            <th data-field="name">商品名称</th>
            <th data-field="oldprivice">原价</th>
            <th data-field="discount">折扣</th>
            <th data-field="num" style="width: 10px">数量</th>
            <th data-field="newprivice">现价</th>
            <th data-field="money">小计</th>
        </tr>
        <c:forEach items="${qianyuanList}" var="list">
            <td>${list.zomreComoditycode}</td>
            <td>${list.zomoreCommodityName}</td>
            <td>${list.zomoreCommodityMoney/list.zomoreCommodityNum}</td>
            <td>${list.zomoreCommodityDiscount}</td>
            <td>${list.zomoreCommodityNum}</td>
            <td>${list.zomoreCommodutyInMoney}</td>
            <td>${list.zomoreCommodityCountMoney}</td>
        </c:forEach>
        </thead>
    </table>
</div>
</body>
</html>
