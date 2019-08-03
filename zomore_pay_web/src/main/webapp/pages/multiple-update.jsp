<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/superAdmin/updateMultipleById.do?multipleId=${requestScope.multiple.multipleId}" method="post">
    <table>
        <tr>
            <td class="td_left"><label for="username">用户名</label></td>
            <td class="td_right"><input type="text" name="username" id="username" value="${requestScope.multiple.username}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="password">密码</label></td>
            <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码" ></td>
        </tr>

        <tr>
            <td class="td_left"><label for="mail">Email</label></td>
            <td class="td_right"><input type="text" name="mail" id="mail" value="${requestScope.multiple.mail}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="name">姓名</label></td>
            <td class="td_right"><input type="text" name="name" id="name" value="${requestScope.multiple.name}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="shopName">店铺名称</label></td>
            <td class="td_right"><input type="text" name="shopName" id="shopName" value="${requestScope.multiple.shopName}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="phoneNumber">手机号</label></td>
            <td class="td_right"><input type="text" name="phoneNumber" id="phoneNumber" value="${requestScope.multiple.phoneNumber}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="registrationTime">注册日期</label></td>
            <td class="td_right"><div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                <input type="date" name="registrationTime" id="registrationTime" value="${requestScope.multiple.registrationTime}"></td>
        </tr>
        <tr>
            <td class="td_left"><label for="dueTime">到期日期</label></td>
            <td class="td_right"><div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                <input type="date" name="dueTime" id="dueTime" value="${requestScope.multiple.dueTime}"></td>
        </tr>
        <tr>
            <td class="td_left"><label for="address">地址</label></td>
            <td class="td_right"><input type="text" name="address" id="address" value="${requestScope.multiple.address}"></td>
        </tr>
        <tr>
            <td class="td_left"><label for="industry">所属行业</label></td>
            <td class="td_right"><input type="text" name="industry" id="industry" value="${requestScope.multiple.industry}"></td>
        </tr>
        <tr>
            <td class="td_left"><label>角色名称</label></td>
            <td class="td_right">
                <select name="role">
                    <option value="1" <c:if test="${1==requestScope.multiple.role}">selected="selected"</c:if>>连锁店</option>
                    <option value="2" <c:if test="${2==requestScope.multiple.role}">selected="selected"</c:if>>直营店</option>
                    <option value="3" <c:if test="${3==requestScope.multiple.role}">selected="selected"</c:if>>加盟店</option>
                    <option value="4" <c:if test="${4==requestScope.multiple.role}">selected="selected"</c:if>>单店</option>
                </select>
            </td>
        </tr>




        <tr>
            <td colspan="2" align="center"><input type="submit" id="btn_sub" value="修改"></td>
        </tr>
    </table>
</form>
</body>
</html>
