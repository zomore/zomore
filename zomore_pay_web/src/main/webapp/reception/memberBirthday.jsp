<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>

<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>择沐前台</title>
	<link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
	<link href="${basePath}css/icon.css" rel="stylesheet" />
	<link href="${basePath}css/commons.css" rel="stylesheet" />
	<!-- 引用阿里图标样式 -->
	<link href="${basePath}css/iconfont.css" rel="stylesheet" />
	<!-- 引用按钮样式 -->
	<link href="${basePath}css/components.css" rel="stylesheet" />
	<!-- 引入表格的样式  -->
	<link href="${basePath}css/bootstrap-table.min.css" rel="stylesheet"/>

	<!-- 引入jquery的JS -->
	<script src="${basePath}js/jquery.min.js"></script>
	<script src="${basePath}js/bootstrap.min.js"></script>
	<!-- 引用表格的JS -->
	<script src="${basePath}js/bootstrap-table.min.js"></script>
	<script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
	<style>
		.header .logo{
			text-align: center;
			font-size: 20px;
			color: #FFFFFF;
			line-height: 100px;
		}
		.header .logo i{
			margin-right: 10px;
		}
		.title .btn-user{margin-right: 100px; }
	</style>
</head>
<body>
<header class="header com-bj">
	<a href="${basePath}reception/list.do">
		<div class="close">
			<i class="fa fa-mail-reply"></i>
		</div>
	</a>
	<div class="title" >生日会员</div>
</header>
<!-- 主界面内容 -->
<div class="index-main" style="height: 100%">
	<table id="table" data-resizable="true">
		<thead>
		<tr>
			<th data-field="id">序号</th>
			<th data-field="car">会员卡号</th>
			<th data-field="name">会员姓名</th>
			<th data-field="id">联系电话</th>
			<th data-field="price">余额</th>
			<th data-field="price">会员生日</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.memberList}" var="member" varStatus="stataus">
			<tr>
			<td>${stataus.count}</td>
			<td>${member.memberNumber}</td>
			<td>${member.memberMemberidname}</td>
			<td>${member.memberPhonenumber}</td>
			<td>${member.memberBalance}</td>
			<td><fmt:formatDate value="${member.memberBirthday}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
		</c:forEach>
			</tr>
		</tbody>
	</table>
</div>
<script src="${basePath}js/modal-one.js"></script>
<script>
    /*$(function() {
        $('#table').bootstrapTable({
            url:'json/data1.json',
            method: "get",
            onClickRow:function (row,$element) {
                $('.info').removeClass('info');
                $($element).addClass('info');
            },
            onLoadSuccess: function(data){

                $("#table tbody tr").addClass("DynamicAdd");
            }
        })
    });*/
</script>
</body>
</html>
