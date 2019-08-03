<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath()+"/") ;
%>
<html>
<head>
    <title>更新会员资料</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreMember/updateZomoreMember.do" method="post">
    <input type="hidden" value="${requestScope.result.memberMemberid}" name="memberMemberid">
    <table align="center" >
        <tr>
            <td style="text-align: right">会员号</td>
            <td><input type="text" name="memberNumber" value="${requestScope.result.memberNumber}"></td>
        </tr>

      <tr>
            <td style="text-align: right">姓名</td>
            <td><input type="text" name="memberMemberidname"  value="${requestScope.result.memberMemberidname}"></td>
        </tr>
        <tr>
            <td style="text-align: right">电话</td>
            <td><input type="text" name="memberPhonenumber"  value="${requestScope.result.memberPhonenumber}"></td>
        </tr>
        <tr>
            <td style="text-align: right">会员等级</td>
            <td><input type="text" name="memberGrade"  value="${requestScope.result.memberGrade}"></td>
        </tr>
        <tr>
            <td style="text-align: right">余额</td>
            <td><input type="text" name="memberBalance"  value="${requestScope.result.memberBalance}"></td>
        </tr>
        <tr>
            <td style="text-align: right">积分</td>
            <td><input type="text" name="memberIntegral"  value="${requestScope.result.memberIntegral}"></td>
        </tr>
        <tr>
            <td style="text-align: right">次卡</td>
            <td><input type="text" name="memberSubcard"  value="${requestScope.result.memberSubcard}"></td>
        </tr>
        <tr>
            <td style="text-align: right">优惠券</td>
            <td><input type="text" name="memberCoupon"  value="${requestScope.result.memberCoupon}"></td>
        </tr>
        <tr>
            <td style="text-align: right">密码</td>
            <td><input type="password" name="memberPassword"  value="${requestScope.result.memberPassword}"></td>
            </tr>
               <tr>
                 <td style="text-align: right">开卡日期</td>
                 <td><input type="text" name="memberDateofopeningcard" value="<fmt:formatDate value='${requestScope.result.memberDateofopeningcard}' pattern='yyyy-MM-dd'/>"></td>
             </tr>
             <tr>
                 <td style="text-align: right">到期日期</td>
                 <td><input type="text" name="memberDuedate"  value="<fmt:formatDate value='${requestScope.result.memberDuedate}' pattern='yyyy-MM-dd'/>"></td>
             </tr>
             <tr>
                 <td style="text-align: right">生日</td>
                 <td><input type="text" name="memberBirthday"  value="<fmt:formatDate value='${requestScope.result.memberBirthday}' pattern='yyyy-MM-dd'/>"></td>
             </tr>
             <tr>
                 <td style="text-align: right">地址</td>
                 <td><input type="text" name="memberAddress"  value="${requestScope.result.memberAddress}"></td>
             </tr>
        <tr>
            <td style="text-align: right">QQ</td>
            <td><input type="text" name="memberQq" value="${requestScope.result.memberQq}"></td>
        </tr>
        <tr>
            <td style="text-align: right">邮箱</td>
            <td><input type="text" name="memberEmail" value="${requestScope.result.memberEmail}"></td>
        </tr>
             <tr>
                 <td style="text-align: right">是否允许赊账</td>
                 <td><input type="text" name="memberOncredit"  value="${requestScope.result.memberOncredit}"></td>
             </tr>
             <tr>
                 <td style="text-align: right">赊账额度</td>
                 <td><input type="text" name="memberCreditlimit"  value="${requestScope.result.memberCreditlimit}"></td>
             </tr>
             <tr>
                 <td style="text-align: right">状态</td>
                 <td><input type="text" name="memberState"  value="${requestScope.result.memberState}"></td>
             </tr>
             <tr>
                 <td style="text-align: right">导购员</td>
                 <td><input type="text" name="memberGuide"  value="${requestScope.result.memberGuide}"></td>
             </tr>
             <tr>
                 <td style="text-align: right">备注</td>
                 <td><input type="text" name="memberNote"  value="${requestScope.result.memberNote}"></td>
             </tr>
        <tr>
            <td style="text-align: right">
                <input type="submit" value="更新">
            </td>
            <td> <input type="button"  onclick="javascript:history.go(-1)" value="返回" /></td>
        </tr>
    </table>

</form>

</body>
</html>
