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
    <title>更新会员等级</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreMembershiplevel/updateZomoreMember.do" method="post">
    <input type="hidden" value="${requestScope.result.membershiplevelId}" name="membershiplevelId">
    <table align="center">
        <tr>
            <td style="text-align: right">等级名称</td>
            <td><input type="text" name="membershiplevelName" value="${requestScope.result.membershiplevelName}"></td>
        </tr>
        <tr>
            <td style="text-align: right">优惠折扣</td>
            <td><input type="text" name="membershiplevelDiscount"
                       value="${requestScope.result.membershiplevelDiscount}"></td>
        </tr>
        <tr>
            <td style="text-align: right">临近升级积分</td>
            <td><input type="text" name="membershiplevelNearupgrade"  value="${requestScope.result.membershiplevelNearupgrade}"></td>
        </tr>
        <tr>
            <td style="text-align: right">是否积分</td>
            <td>
                <c:if test="${requestScope.result.membershiplevelIntegral=='0'}">
                <input type="radio" name="membershiplevelIntegral" value="0" checked>否&nbsp;
                <input type="radio" name="membershiplevelIntegral" value="1">是&nbsp;
                </c:if>
                <c:if test="${requestScope.result.membershiplevelIntegral=='1'}">
                <input type="radio" name="membershiplevelIntegral" value="0">否&nbsp;
                <input type="radio" name="membershiplevelIntegral" value="1" checked>是&nbsp;
                </c:if>
        </tr>
        <tr>
            <td style="text-align: right">是否为默认会员</td>
            <td>
                <c:if test="${requestScope.result.membershiplevelDefault=='0'}">
                    <input type="radio" name="membershiplevelDefault" value="0" checked>否&nbsp;
                    <input type="radio" name="membershiplevelDefault" value="1">是&nbsp;
                </c:if>
                <c:if test="${requestScope.result.membershiplevelDefault=='1'}">
                    <input type="radio" name="membershiplevelDefault" value="0">否&nbsp;
                    <input type="radio" name="membershiplevelDefault" value="1" checked>是&nbsp;
                </c:if>

            </td>
        </tr>
        <tr>
            <td style="text-align: right">是否自动升级</td>
            <td>
                <c:if test="${requestScope.result.membershiplevelUpgradetype=='0'}">
                    <input type="radio" name="membershiplevelUpgradetype" value="0" checked>否&nbsp;
                    <input type="radio" name="membershiplevelUpgradetype" value="1">是&nbsp;
                </c:if>
                <c:if test="${requestScope.result.membershiplevelUpgradetype=='1'}">
                    <input type="radio" name="membershiplevelUpgradetype" value="0">否&nbsp;
                    <input type="radio" name="membershiplevelUpgradetype" value="1" checked>是&nbsp;
                </c:if>
            </td>
        </tr>
        <tr>
            <td style="text-align: right">升级规则</td>
            <td><input type="text" name="membershiplevelRule" value="${requestScope.result.membershiplevelRule}"></td>
        </tr>
        <tr>
            <td style="text-align: right">是否付费升级</td>
            <td>
                <c:if test="${requestScope.result.membershiplevelUpgradepayment=='0'}">
                    <input type="radio" name="membershiplevelUpgradepayment" value="0" checked>否&nbsp;
                    <input type="radio" name="membershiplevelUpgradepayment" value="1">是&nbsp;
                </c:if>
                <c:if test="${requestScope.result.membershiplevelUpgradepayment=='1'}">
                    <input type="radio" name="membershiplevelUpgradepayment" value="0">否&nbsp;
                    <input type="radio" name="membershiplevelUpgradepayment" value="1" checked>是&nbsp;
                </c:if>
            </td>
        </tr>
        <tr>
            <td style="text-align: right">等级有效时间</td>
            <td>
                <c:if test="${requestScope.result.membershiplevelEffective!='1'}">
                    <input type="text" name="membershiplevelTime"
                           value="<fmt:formatDate value='${requestScope.result.membershiplevelTime}' pattern='yyyy-MM-dd'/>">
                    <input type="radio" name="membershiplevelEffective" value="1">永久有效
                </c:if>
                <c:if test="${requestScope.result.membershiplevelEffective=='1'}">
                    <input type="radio" name="membershiplevelEffective" value="1" checked>永久有效
                    <input type="radio" name="membershiplevelEffective" value="0">取消永久有效
                    <input type="text" name="membershiplevelTime"
                           value="<fmt:formatDate value='${requestScope.result.membershiplevelTime}' pattern='yyyy-MM-dd'/>">
                </c:if>
            </td>
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
