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
<form action="${basePath}zomoreCommodity/add.do" method="post" enctype="multipart/form-data">
    <table align="center" >
        <tr>
            <td style="text-align: right">商品名称</td>
            <td><input type="text" name="zomoreCommodityName" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品图片</td>
            <td>
                <input type="file" name="file" >
            </td>
        </tr>
        <tr>
            <td style="text-align: right">商品条码</td>
            <td>
                <input type="text" name="zomoreCommodityCode"></td>
        </tr>
        <tr>
            <td style="text-align: right">商品货号</td>
            <td><input type="text" name="zomoreCommodityNum" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品规格</td>
            <td><input type="text" name="zomoreCommoditySpecifications"></td>
        </tr>
        <tr>
            <td style="text-align: right">拼音码</td>
            <td><input type="text" name="zomoreCommodityPingyin" ></td>
        </tr>
        <tr>
            <td style="text-align: right">商品分类</td>
            <td><input type="text" name="zomoreCommodityType"></td>
        </tr>
        <tr>
            <td style="text-align: right">商品库存</td>
            <td><input type="text" name="zomoreCommodityStore" ></td>
        </tr>
        <tr>
            <td style="text-align: right">主单位</td>
            <td><input type="text" name="zomoreCommodityMain" ></td>
        </tr>
        <tr>
            <td style="text-align: right">
                <input type="submit" value="添加">
            </td>
            <td> <input type="reset" value="重置" /></td>
        </tr>
    </table>

</form>

</body>
</html>
