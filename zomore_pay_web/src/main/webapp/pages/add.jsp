<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <title>添加会员资料</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreMember/insertZomoreMember.do" method="post">
    <table align="center">
        <tr>
            <td style="text-align: right">会员号</td>
            <td><input type="text" name="memberNumber" value=""></td>
        </tr>

        <tr>
            <td style="text-align: right">姓名</td>
            <td><input type="text" name="memberMemberidname" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">电话</td>
            <td><input type="text" name="memberPhonenumber" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">会员等级</td>
            <td>
                <select name="memberGrade" >
                    <c:forEach items="${requestScope.gradeType}" var="gradeType">
                        <option value="${gradeType.membershiplevelName}"
                                <c:if test="${gradeType.membershiplevelName==requestScope.defult.membershiplevelName}">
                                    selected
                                </c:if>
                        >${gradeType.membershiplevelName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td style="text-align: right">余额</td>
            <td><input type="text" name="memberBalance" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">积分</td>
            <td><input type="text" name="memberIntegral" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">次卡</td>
            <td><input type="text" name="memberSubcard" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">优惠券</td>
            <td><input type="text" name="memberCoupon" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">密码</td>
            <td><input type="password" name="memberPassword" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">开卡日期</td>
            <td><input type="text" name="memberDateofopeningcard" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">到期日期</td>
            <td><input type="text" name="memberDuedate" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">生日</td>
            <td><input type="text" name="memberBirthday" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">地址</td>
            <td><input type="text" name="memberAddress" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">QQ</td>
            <td><input type="text" name="memberQq" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">邮箱</td>
            <td><input type="text" name="memberEmail" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">是否允许赊账</td>
            <td><input type="text" name="memberOncredit" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">赊账额度</td>
            <td><input type="text" name="memberCreditlimit" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">状态</td>
            <td><input type="text" name="memberState" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">导购员</td>
            <td><input type="text" name="memberGuide" value=""></td>
        </tr>
        <tr>
            <td style="text-align: right">备注</td>
            <td><input type="text" name="memberNote" value=""></td>
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
