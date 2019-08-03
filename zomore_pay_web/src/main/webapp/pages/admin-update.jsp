<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/superAdmin/updateAdminById.do?adminId=${requestScope.admin.adminId}" method="post">
    <table>
        <tr>
            <td class="td_left"><label for="username">用户名</label></td>
            <td class="td_right"><input type="text" name="username" id="username" value="${requestScope.admin.username}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="password">密码</label></td>
            <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码" ></td>
        </tr>

        <tr>
            <td class="td_left"><label for="mail">Email</label></td>
            <td class="td_right"><input type="text" name="mail" id="mail" value="${requestScope.admin.mail}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="name">姓名</label></td>
            <td class="td_right"><input type="text" name="name" id="name" value="${requestScope.admin.name}"></td>
        </tr>



        <tr>
            <td class="td_left"><label for="phoneNumber">手机号</label></td>
            <td class="td_right"><input type="text" name="phoneNumber" id="phoneNumber" value="${requestScope.admin.phoneNumber}"></td>
        </tr>

        <tr>
            <td class="td_left"><label for="createTime">注册日期</label></td>
            <td class="td_right"><div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                <input type="date" name="createTime" id="createTime" value="${requestScope.admin.createTime}"></td>
        </tr>
        <tr>
            <td class="td_left"><label for="address">地址</label></td>
            <td class="td_right"><input type="text" name="address" id="address" value="${requestScope.admin.address}"></td>
        </tr>
        <tr>
            <td class="td_left"><label>管理员等级</label></td>
            <td class="td_right">
                <select name="level">
                    <option value="3" <c:if test="${3==requestScope.admin.level}">selected="selected"</c:if>>三级管理员</option>
                    <option value="4" <c:if test="${4==requestScope.admin.level}">selected="selected"</c:if>>四级管理员</option>
                    <option value="5" <c:if test="${5==requestScope.admin.level}">selected="selected"</c:if>>五级管理员</option>

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
