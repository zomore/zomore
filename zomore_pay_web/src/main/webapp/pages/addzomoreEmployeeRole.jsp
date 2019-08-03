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
    <title>添加员工角色</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreEmployeeRole/add.do" method="post">
    <table align="center" >
        <tr>
            <td style="text-align: right">角色名称</td>
            <td><input type="text" name="employeeRoleRolename" ></td>
        </tr>

      <tr>
            <td style="text-align: right">状态</td>
            <td>
                <input type="radio" name="employeeRoleState" value="1" checked>启用&nbsp;
                <input type="radio" name="employeeRoleState" value="0">禁用

            </td>
        </tr>
        <tr>
            <td style="text-align: right">所属门店</td>
            <td><input type="text" name="employeeRoleCashierStore"  ></td>
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
