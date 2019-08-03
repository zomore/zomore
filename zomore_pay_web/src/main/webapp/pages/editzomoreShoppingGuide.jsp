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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ;
%>
<html>
<head>
    <title>修改导购员</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreShoppingGuide/edit.do" method="post" enctype="multipart/form-data">
    <table align="center" >
        <tr>
            <td style="text-align: right">导购员编号</td>
            <td>${requestScope.result.shoppingGuideId}
            <input type="hidden" name="shoppingGuideId" value="${requestScope.result.shoppingGuideId}">
            </td>
        </tr>
        <tr>
            <td style="text-align: right">导购员姓名</td>
            <td><input type="text" name="shoppingGuideName"  value="${requestScope.result.shoppingGuideName}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">手机号码</td>
            <td><input type="text" name="shoppingGuidePhone"  value="${requestScope.result.shoppingGuidePhone}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">头像</td>
            <td>
                <input type="hidden" name="shoppingGuideImage"  value="${requestScope.result.shoppingGuideImage}" >
                <input type="file" name="file"  value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">销售提成</td>
            <td><input type="text" name="shoppingGuideSale"  value="${requestScope.result.shoppingGuideSale}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">指定提成</td>
            <td><input type="text" name="shoppingGuideAppoint"  value="${requestScope.result.shoppingGuideAppoint}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">充值提成</td>
            <td><input type="text" name="shoppingGuideRecharge"  value="${requestScope.result.shoppingGuideRecharge}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">次卡提成</td>
            <td><input type="text" name="shoppingGuideSubcard"  value="${requestScope.result.shoppingGuideSubcard}" ></td>
        </tr>
        <tr>
            <td style="text-align: right">购物卡提成</td>
            <td><input type="text" name="shoppingGuideShoppingcar"   value="${requestScope.result.shoppingGuideShoppingcar}"></td>
        </tr>
        <tr>
            <td style="text-align: right">标签</td>
            <td><input type="text" name="shoppingGuideLab"   value="${requestScope.result.shoppingGuideLab}"></td>
        </tr>

      <tr>
            <td style="text-align: right">是否允许领取公海会员</td>
            <td>
                <input type="radio" name="shoppingGuideIsmember" value="1"
                <c:if test="${requestScope.result.shoppingGuideIsmember=='1'}"> checked</c:if>
                >允许&nbsp;
                <input type="radio" name="shoppingGuideIsmember"
                <c:if test="${requestScope.result.shoppingGuideIsmember!='1'}"> checked</c:if>
                       value="0">不允许
            </td>
        </tr>
        <tr>
            <td style="text-align: right">备注</td>
            <td><input type="text" name="shoppingGuideMeno"  value="${requestScope.result.shoppingGuideMeno}"></td>
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
