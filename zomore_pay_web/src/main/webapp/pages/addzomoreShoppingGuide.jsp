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
    <title>添加导购员</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreShoppingGuide/add.do" method="post" enctype="multipart/form-data">
    <table align="center" >
        <tr>
            <td style="text-align: right">导购员编号</td>
            <td><input type="text" name="shoppingGuideId"></td>
        </tr>
        <tr>
            <td style="text-align: right">导购员姓名</td>
            <td><input type="text" name="shoppingGuideName" ></td>
        </tr>
        <tr>
            <td style="text-align: right">手机号码</td>
            <td><input type="text" name="shoppingGuidePhone" ></td>
        </tr>
        <tr>
            <td style="text-align: right">头像</td>
            <td><input type="file" name="file"></td>
        </tr>
        <tr>
            <td style="text-align: right">销售提成</td>
            <td><input type="text" name="shoppingGuideSale" value="0" ></td>
        </tr>
        <tr>
            <td style="text-align: right">指定提成</td>
            <td><input type="text" name="shoppingGuideAppoint" value="0"></td>
        </tr>
        <tr>
            <td style="text-align: right">充值提成</td>
            <td><input type="text" name="shoppingGuideRecharge"value="0" ></td>
        </tr>
        <tr>
            <td style="text-align: right">次卡提成</td>
            <td><input type="text" name="shoppingGuideSubcard" value="0"></td>
        </tr>
        <tr>
            <td style="text-align: right">购物卡提成</td>
            <td><input type="text" name="shoppingGuideShoppingcar" value="0"></td>
        </tr>
        <tr>
            <td style="text-align: right">标签</td>
            <td><input type="text" name="shoppingGuideLab" ></td>
        </tr>

      <tr>
            <td style="text-align: right">是否允许领取公海会员</td>
            <td>
                <input type="radio" name="shoppingGuideIsmember" value="1" checked>允许&nbsp;
                <input type="radio" name="shoppingGuideIsmember" value="0">不允许
            </td>
        </tr>
        <tr>
            <td style="text-align: right">备注</td>
            <td><input type="text" name="shoppingGuideMeno"></td>
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
