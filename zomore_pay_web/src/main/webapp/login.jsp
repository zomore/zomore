<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>登录</title>
		<link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
		<link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
		<link href="${basePath}css/icon.css" rel="stylesheet" />
		<link href="${basePath}css/commons.css" rel="stylesheet" />
		<!-- 引用按钮样式 -->
		<link href="${basePath}css/components.css" rel="stylesheet" />
		<!-- 引用键盘 -->
		
		<link href="${basePath}css/keyword/keyboard.css" rel="stylesheet" />
		<!-- 引用全局JS -->
        <script src="${basePath}js/jquery.min.js"></script>
        <script src="${basePath}js/bootstrap.min.js"></script>
		<!-- 引用键盘的JS -->
        <script src="${basePath}js/keyword/jquery.slimscroll.min.js"></script>
        <script src="${basePath}js/keyword/chinese-pynsimpl.js"></script>
        <!-- 引用系统提示插件 -->
		<script src="${basePath}js/alert.js"></script>
		
	</head>
	<form class="form-horizontal m-t-20" action="/login.do" method="post">
	<body>
		<header class="header com-bj">
			<div class="close">
				<i class="fa fa-close"></i>
			</div>
			<div class="title">
				账号登录
			</div>
			<div class="logo">
				<img src="img/logo.png"/>
			</div>
		</header>
		<div class="main">
			<div class="col-lg-5 col-xs-12 col-md-8 col-sm-7">
				<div class="panel">
					<form class="form-horizontal" role="form">
					<div class="panel-body">
						
						  <div class="form-group">
						    <label for="firstname" class="col-sm-2 control-label">账号:</label>
						    <div class="col-sm-10">
						      <input  type="text" name="username" class="form-control" autofocus="autofocus" id="firstname" placeholder="请输入账号">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="lastname" class="col-sm-2 control-label">密码:</label>
						    <div class="col-sm-10">
						      <input type="password" name="password" class="form-control" id="lastname" placeholder="请输入密码">
						    </div>
						  </div>
						  
						  
						
					</div>
					<div class="panel-footer">
						<button type="submit" class="btn btn-success">登录</button>
						<a  class="btn btn-info" href="index.html">免费注册</a>
						<p>联系客服</p>
					</div>
					</form>		
				</div>

			</div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
		</div>
		<script src="${basePath}js/page/login.js"></script>
		<!-- 封装键盘插件必须在最下面 -->
		<script src="${basePath}js/keyword.js"></script>
	</body>
</html>
