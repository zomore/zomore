<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
	String money1 = request.getParameter("money");
	String id = request.getParameter("id");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>进货</title>
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
			<div class="title">进货</div>
			<div class="logo">
			</div>
	</header>
		<form action="${basePath}zomoreCommodity/insertIntogoodsHistory.do" method="post">
		<div class="user-main">
			<div  style="width: 60%;  margin-left: 20%; margin-top: 20px;">
								<div class="input-group xj">
									<span class="input-group-addon">进货支付:</span>
									<input type="hidden" name="id" value="<%=id%>">
									<input autofocus="autofocus" placeholder="输入已支付金额" onchange="changerPrice(this)" type="text" id="money" name="money" value="<%=money1%>" class="form-control" >
							  </div></br>
							   <font style="font-size: 22px;">备注：</font>
					             <div class="bz-content">
				                <textarea name="meno" placeholder="请输入"></textarea>
			                </div>
                        </div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
			<input type="submit" class="btn btn-danger btn-lg " id="tf" style="margin-top: 20px;">确定</input>
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
