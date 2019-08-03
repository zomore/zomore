<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <title>添加收银员业绩表</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreCashierPerformance/edit.do" method="post">
    <table align="center">
        <input type="hidden" name="zomoreCashierPerformanceId"
                value="${requestScope.result.zomoreCashierPerformanceId}">
        <tr>
            <td style="text-align: right">日期</td>
            <td><input type="text" name="zomoreCashierPerformanceDate" value="<fmt:formatDate value='${requestScope.result.zomoreCashierPerformanceDate}' pattern='yyyy-MM-dd HH:mm:ss'/>"></td>
        </tr>
        <tr>
            <td style="text-align: right">收银员的名称</td>
            <td>
                <%--收银员的id 使用jquary动态设置--%>
                <input type="hidden" name="zomoreCashierPerformanceCashierid"
                       value="${requestScope.result.zomoreCashierPerformanceCashierid}">
                <input type="text" name="zomoreCashierPerformanceCashiername"
                       value="${requestScope.result.zomoreCashierPerformanceCashiername}">
            </td>
        </tr>
        <tr>
            <td style="text-align: right">商品名称</td>
            <td>
                <%--商品的id，使用jquary动态设置--%>
                <input type="hidden" name="zomoreCashierPerformanceCommodityid"
                       value="${requestScope.result.zomoreCashierPerformanceCommodityid}">
                <input type="text" name="zomoreCashierPerformanceCommodityname"
                       value="${requestScope.result.zomoreCashierPerformanceCommodityname}"></td>
        </tr>
        <tr>
            <td style="text-align: right">销售价</td>
            <td><input type="text" name="zomoreCashierPerformanceMoney"
                       value="${requestScope.result.zomoreCashierPerformanceMoney}"></td>
        </tr>
        <tr>
            <td style="text-align: right">数量</td>
            <td><input type="text" name="zomoreCashierPerformanceNum"
                       value="${requestScope.result.zomoreCashierPerformanceNum}"></td>
        </tr>
        <tr>
            <td style="text-align: right">总价</td>
            <td><input type="text" name="zomoreCashierPerformanceMoneyall"
                       value="${requestScope.result.zomoreCashierPerformanceMoneyall}"></td>
        </tr>
        <tr>
            <td style="text-align: right">实收金额</td>
            <td><input type="text" name="zomoreCashierPerformanceMoneyactual"
                       value="${requestScope.result.zomoreCashierPerformanceMoneyactual}"></td>
        </tr>
        <tr>
            <td style="text-align: right">利润</td>
            <td><input type="text" name="zomoreCashierPerformanceMoneysave"
                       value="${requestScope.result.zomoreCashierPerformanceMoneysave}"></td>
        </tr>
        <tr>
            <td style="text-align: right">类型</td>
            <td><input type="text" name="zomoreCashierPerformanceType"
                       value="${requestScope.result.zomoreCashierPerformanceType}"></td>
        </tr>
        <tr>
            <td style="text-align: right">
                <input type="submit" value="更新">
            </td>
            <td><input type="button"  onclick="javascript:history.go(-1)" value="返回" /></td>
        </tr>
    </table>

</form>

</body>
</html>
