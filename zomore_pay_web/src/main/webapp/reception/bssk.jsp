<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
	String id = request.getParameter("id");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>商品报损</title>
		<link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
		<link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
		<link href="${basePath}css/icon.css" rel="stylesheet" />
		<link href="${basePath}css/commons.css" rel="stylesheet" />
		<!-- 引用阿里图标样式 -->
		<link href="${basePath}css/iconfont.css" rel="stylesheet" />
		<!-- 引用按钮样式 -->
		<link href="${basePath}css/components.css" rel="stylesheet" />
		<!-- 引入表格的样式  -->
		<link href="${basePath}css/bootstrap-table.min.css" rel="stylesheet"/>
		<!-- 引用键盘 -->
		
		<link href="${basePath}css/keyword/keyboard.css" rel="stylesheet" />
		<!-- 引入jquery的JS -->
		<script src="${basePath}js/jquery.min.js"></script>
		 <script src="${basePath}js/bootstrap.min.js"></script>
		<!-- 引用表格的JS -->
		<script src="${basePath}js/bootstrap-table.min.js"></script>
		<script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
		<!-- 引用键盘的JS -->
		<script src="${basePath}js/keyword/jquery.slimscroll.min.js"></script>
		<script src="${basePath}js/keyword/chinese-pynsimpl.js"></script>
		<!-- 引入系统信息警告的JS -->
		<script src="${basePath}js/alert.js"></script>
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
			.login-footer .btn{float: right; margin-right: 20px;}
			.login-footer{background: #FFFFFF;}
			.user-main{position: fixed; top: 100px; height: calc(100% - 180px );}
		</style>
	</head>
	<body>
		<header class="header com-bj">
			<a href="#" onclick="javascript :history.back(-1);">
				<div class="close">
					<i class="fa  fa-mail-reply"></i>
				</div>
			</a>
			<div class="title">商品报损</div>
			<div class="logo">
			</div>
	</header>
		<form action="${basePath}zomoreCommodity/lossCommodtyHistory.do" method="post">
		<div class="user-main" style="width: 100%; padding-left: 28%;">
			<div  style="width: 600px; margin-top: 20px;">
				<input type="hidden" name="zomoreCommodityId" value="<%=id%>">
								<font style="font-size: 20px;">您正在进行报损商品</font></br>
								<font style="font-size: 16px; color: #c6c6c6;"><a style="color: #ed3030; margin-right: 5px;">*</a>确认要报损商品单据吗？如果报损请说明下原因吧！</font></br>
							   <font style="font-size: 20px;">备注：</font>
					             <div class="bz-content">
				                <textarea name="zomoreCommodityShopname" placeholder="在此处输入报损备注信息！"></textarea>
			                </div>
                        </div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
			<input type="submit" class="btn btn-info" style="margin-top: 20px; height: 45px; width: 65px; font-size: 18px;">确定</input>
			<button class="btn btn-danger btn-lg " id="tf" style="margin-top: 20px;">取消</button>
		</div>
		</form>
		<script>
			var mathField;	//要使用健盘这个必须定义
			//此处必须定义，定义过后才能取得焦点		
			$('.form-control').focus(function(){
				mathField=$(this);
			});
			//这里是为了显示健盘的事件
			$('.fa-keyboard-o').on('click',function(){
				keyword();
			})
			$('.logo').on('click',function(){
				if($('.right-menu').is(':hidden')){//如果当前隐藏  
				   $('.right-menu').show();//那么就显示div 
				  
				  }else{//否则  
				  $('.right-menu').hide(200);//就隐藏div 
				   
				  } 
			})
			$('.right-menu-close').on('click',function(){
				$('.right-menu').hide(300);
			})
			// 选择折扣
			$('.usersale').on('click',function(){
				$('#UserSale').modal('show');
			})
			$(".list .list-group-item").on("click", function(){
			    $(".list .list-group-item").removeClass("active");
			    $(this).addClass("active")
			})
			
			// 选择导购
			$('.daogo').on('click',function(){
				$('#SelectService').modal('show');
			})
			 $('#table').bootstrapTable({
					url:'json/data1.json',
					method: "get",
					checkbox: true,  
					onClickRow:function (row,$element) {
			                    $('.info').removeClass('info');
			                    $($element).addClass('info');
			                },
			
			
				})
				
				$('.tags').on('click',function(){
					$('#myModalfull').modal('show');
				})
				$(".select-tags").on("click", function(){
					if($(this).is('.active')){
						$(this).removeClass("active");
					}else{
						$(this).addClass("active");
					}
				    
				    
					
				})
		</script>
		<script src="${basePath}js/keyword.js"></script>
		<script src="${basePath}js/bootstrap-inputmask.min.js"></script>
	</body>
</html>
