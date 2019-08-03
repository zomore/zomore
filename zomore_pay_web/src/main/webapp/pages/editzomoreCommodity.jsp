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
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ;
%>
<html>
<head>
    <title>添加商品资料</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreCommodity/edit.do" method="post" enctype="multipart/form-data">
    <input type="hidden" name="zomoreCommodityId" value="${requestScope.result.zomoreCommodityId}">
    <input type="hidden" name="zomoreCommodityStoreid" value="${requestScope.store.zomoreCommodityStoreid}">
    <table align="center">
        <tr>
            <td style="text-align: right">商品名称</td>
            <td><input type="text" name="zomoreCommodityName" value="${requestScope.result.zomoreCommodityName}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品图片</td>
            <td>
                <input type="file" name="file">
            </td>
        </tr>
        <tr>
            <td style="text-align: right">商品条码</td>
            <td>
                <input type="text" name="zomoreCommodityCode" value="${requestScope.result.zomoreCommodityCode}"></td>
        </tr>
        <tr>
            <td style="text-align: right">商品货号</td>
            <td><input type="text" name="zomoreCommodityNum" value="${requestScope.result.zomoreCommodityNum}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品规格</td>
            <td><input type="text" name="zomoreCommoditySpecifications" value="${requestScope.result.zomoreCommoditySpecifications}"></td>
        </tr>
        <tr>
            <td style="text-align: right">拼音码</td>
            <td><input type="text" name="zomoreCommodityPingyin" value="${requestScope.result.zomoreCommodityPingyin}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品分类</td>
            <td><input type="text" name="zomoreCommodityType" value="${requestScope.result.zomoreCommodityType}"></td>
        </tr>
        <tr>
            <td style="text-align: right">商品库存</td>
            <td><input type="text" name="zomoreCommodityStore" value="${requestScope.store.zomoreCommodityStore}"></td>
        </tr>
        <tr>
            <td style="text-align: right">主单位</td>
            <td><input type="text" name="zomoreCommodityMain" value="${requestScope.result.zomoreCommodityMain}"></td>
        </tr>
        <tr>
            <td style="text-align: right">描述</td>
            <td><input type="text" name="zomoreCommodityMeno" value="${requestScope.result.zomoreCommodityMeno}"></td>
        </tr>
        <tr>
            <td style="text-align: right">
                <input type="submit" value="更新">
            </td>
            <td><input type="button" onclick="javascript:history.go(-1)" value="返回"/></td>
        </tr>
    </table>

</form>

</body>
</html>
