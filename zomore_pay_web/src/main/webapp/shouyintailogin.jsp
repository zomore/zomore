<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>收银台登录</title>
		<link href="css/bootstrap.min.css" rel="stylesheet" />
		<link href="css/icon.css" rel="stylesheet" />
		<link href="css/commons.css" rel="stylesheet" />
		<!-- 引用按钮样式 -->
		<link href="css/components.css" rel="stylesheet" />
		<!-- 引用键盘 -->
		
		<link href="css/keyword/keyboard.css" rel="stylesheet" />
		<!-- 引用全局JS -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
		<!-- 引用键盘的JS -->
        <script src="js/keyword/jquery.slimscroll.min.js"></script>
        <script src="js/keyword/chinese-pynsimpl.js"></script>
        <!-- 引用系统提示插件 -->
		<script src="js/alert.js"></script>
		
	</head>
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
						    <label for="firstname" class="col-sm-3 control-label">当前账号:</label>
						    <div class="col-sm-9">
						      <h4>${sessionScope.shopName}</h4>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="firstname" class="col-sm-3 control-label">收银台号:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" autofocus="autofocus" id="firstname" placeholder="请输入账号">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="lastname" class="col-sm-3 control-label">密码:</label>
						    <div class="col-sm-9">
						      <input type="password" class="form-control" id="lastname" placeholder="请输入密码">
						    </div>
						  </div>
						  
						  
						
					</div>
					<div class="panel-footer">
						<button type="button" class="btn btn-success">登录</button>
						<a  class="btn btn-info" href="index.html">免费注册</a>
						<p><a href="#" style="float: left;">添加管理后台快捷方式到桌面</a><a href="#"">联系客服</a></p>
					</div>
					</form>		
				</div>

			</div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
		</div>
		<script src="js/page/login.js"></script>
		<!-- 封装键盘插件必须在最下面 -->
		<script src="js/keyword.js"></script>
	</body>
</html>
