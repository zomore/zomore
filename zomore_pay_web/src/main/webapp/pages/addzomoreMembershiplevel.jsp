<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ;
%>
<html>
<head>
    <title>添加会员等级</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreMembershiplevel/insertZomoreMember.do" method="post">
    <table align="center" >
        <tr>
            <td style="text-align: right">等级名称</td>
            <td><input type="text" name="membershiplevelName" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">优惠折扣</td>
            <td><input type="text" name="membershiplevelDiscount"  value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">临近升级积分</td>
            <td><input type="text" name="membershiplevelNearupgrade"  value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">是否积分</td>
            <td>
                <input type="radio" name="membershiplevelIntegral" value="0" checked>否&nbsp;
                <input type="radio" name="membershiplevelIntegral" value="1">是&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: right">是否为默认会员</td>
            <td>
                <input type="radio" name="membershiplevelDefault" value="0" checked>否&nbsp;
                <input type="radio" name="membershiplevelDefault" value="1">是&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: right">是否自动升级</td>
            <td>
                    <input type="radio" name="membershiplevelUpgradetype" value="0" checked>否&nbsp;
                    <input type="radio" name="membershiplevelUpgradetype" value="1">是&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: right">升级规则</td>
            <td><input type="text" name="membershiplevelRule"  value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">是否付费升级</td>
            <td>
                    <input type="radio" name="membershiplevelUpgradepayment" value="0" checked>否&nbsp;
                    <input type="radio" name="membershiplevelUpgradepayment" value="1">是&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: right">等级有效时间</td>
            <td>
                <input type="text" name="membershiplevelTime" value="" placeholder="格式例如：2019-03-11">
                <input type="radio" name="membershiplevelEffective" value="1">永久有效
            </td>
        </tr>

        <tr>
            <td style="text-align: right">
                <input type="submit" value="提交">
            </td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>

</form>

</body>
</html>
