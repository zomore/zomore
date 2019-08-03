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
    <title>更新收银员资料</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="${basePath}zomoreCashier/add.do" method="post">
    <table align="center" >
        <tr>
            <td style="text-align: right">收银员编号</td>
            <td><input type="text" name="cashierNumber" ></td>
        </tr>

      <tr>
            <td style="text-align: right">收银员姓名</td>
            <td><input type="text" name="cashierName"  ></td>
        </tr>
        <tr>
            <td style="text-align: right">密码</td>
            <td><input type="password" name="cashierPassword"  ></td>
        </tr>
        <tr>
            <td style="text-align: right">联系电话</td>
            <td><input type="text" name="cashierPhone" ></td>
        </tr>
        <tr>
            <td style="text-align: right">角色名称</td>
            <td>

               <select>
                   <option value="0">请选择</option>
                   <c:forEach items="${requestScope.employeeRole}" var="role">
                      <option value="${role.employeeRoleRolename}"> ${role.employeeRoleRolename}</option>
                   </c:forEach>
               </select>
            </td>
        </tr>
        <tr>
            <td style="text-align: right">状态是否启用</td>
            <td>
                <input type="radio" name="cashierState" value="0" checked>否&nbsp;
                <input type="radio" name="cashierState" value="1">是
            </td>
        </tr>
        <tr>
            <td style="text-align: right">所属门店</td>
            <td><input type="text" name="cashierStore"></td>
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
