<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>收银台登录</title>
    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
    <link href="${basePath}css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${basePath}css/icon.css" rel="stylesheet"/>
    <link href="${basePath}css/commons.css" rel="stylesheet"/>
    <!-- 引用阿里图标样式 -->
    <link href="${basePath}css/iconfont.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="${basePath}css/components.css" rel="stylesheet"/>
    <!-- 引用键盘 -->
    <link href="${basePath}css/keyword/keyboard.css" rel="stylesheet"/>
    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
		
	</head>
	<body>
		<header class="header com-bj">
			<div class="close" onclick="off()">
				<i class="fa fa-close"></i>
			</div>
			<div class="title">
				账号登录
			</div>
			<div class="logo">
				<img src="${pageContext.request.contextPath}/img/logo.png"/>
			</div>
		</header>
		<div class="msg">

			<%
				String errorMsg=(String) session.getAttribute("errorMsg");
				if(errorMsg ==null){
				    errorMsg= "请输入用户名和密码";
				}
			%>
		<span class="errorMsg"><%=errorMsg%></span>
		</div>
		<form action="${pageContext.request.contextPath}/pay/payLogin.do" method="post">
		<div class="main">
			<div class="col-lg-5 col-xs-12 col-md-8 col-sm-7">
				<div class="panel">
					<div class="panel-body">
						<div class="form-group">
						    <label for="firstname" class="col-sm-3 control-label">当前账号:</label>
						    <div class="col-sm-9">
						      <h4>${sessionScope.shopAccount}</h4>
								<font color="red">${errorMsg}</font>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="firstname" class="col-sm-3 control-label">收银台:</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" autofocus="autofocus" id="firstname" placeholder="请输入账号" name="cashierNumber">
						    </div>
						  </div>
						<div class="form-group">
						    <label for="lastname" class="col-sm-3 control-label">密码:</label>
						    <div class="col-sm-9">
						      <input type="password" name="cashierPassword" class="form-control" id="lastname" placeholder="请输入密码">
						    </div>
						</div>
					</div>
					<div class="panel-footer">
						<button type="submit" id="btn_sub" class="btn btn-success">登录</button>
						<a class="btn btn-info tags">免费注册</a>
						<p><a style="float: left;" href="http://11652659.s21d-11.faiusrd.com/0/ABUIABBLGAAgt6KR6gUorp-ovAY?f=%E6%8B%A9%E6%B2%90%E7%AE%A1%E7%90%86%E5%90%8E%E5%8F%B0.exe&v=1564758327">添加管理后台快捷方式到桌面</a><a class="tags">联系客服</a></p></div>
					</div>
				</form>
				</div>
			</div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
		</div>
<!-- 联系客服 -->
<div class="modal fade  " id="myModalfull" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabelfull"> 联系客服 </h4>
            </div>
            <div class="modal-body" style="text-align: center;">
                <div class="col-lg-4 col-md-5 col-sm-5 col-xs-12">
                    <i class="fa fa-tty" style="font-size:50px; color:#4caf50"></i> 
                    <div class="">客服热线： 020-31213805</div>
                </div>
                <div class="col-lg-4 col-md-5 col-sm-5 col-xs-12">
                    <i class="fa fa-qq" style="font-size:50px; color:#4caf50"></i>
                    <div class="">售后QQ： 2573455929 </div>
                </div>
                <div class="col-lg-4 col-md-5 col-sm-5 col-xs-12">
                    <i class="fa fa-qq" style="font-size:50px; color:#4caf50"></i>
                    <div class="">售后QQ： 2517549475</div>
                </div>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                <%--<div class="select-tags">--%>
            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6" style="text-align: left;">
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-pink  btn-lg" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 全屏结束 -->

		<script src="${pageContext.request.contextPath}/js/page/login.js"></script>
		<!-- 封装键盘插件必须在最下面 -->
		<script src="${pageContext.request.contextPath}/js/keyword.js"></script>
		<script src="${basePath}js/bootstrap-inputmask.min.js"></script>
	<script type="text/javascript">
		function off() {
			window.location.href="${basePath}pages/login.jsp";
        }

        function label() {
        //联系客服
        var laber = "";
        $("div[class='select-tags active']").each(function () {
            laber += $(this).text()
        });
        $('#memberNote').val(laber);
        $("#myModalfull").modal('hide');
    }
        $('.tags').on('click', function () {
        $('#myModalfull').modal('show');
    })
    $(".select-tags").on("click", function () {
        if ($(this).is('.active')) {
            $(this).removeClass("active");
        } else {
            $(this).addClass("active");
        }


    })
	</script>
	</body>
</html>
