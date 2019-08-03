<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>搜索会员</title>
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
		<!-- 引入jquery的JS -->
		<script src="${basePath}js/jquery.min.js"></script>
		 <script src="${basePath}js/bootstrap.min.js"></script>
		<!-- 引用表格的JS -->
		<script src="${basePath}js/bootstrap-table.min.js"></script>
		<script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
		
		<!-- 引入系统信息警告的JS -->
		<script src="${basePath}js/alert.js"></script>
		<style>
			.header .title{
				position: relative;
			}
		</style>
	</head>
	<body>
		<header class="header com-bj">
			<%--<a href="${basePath}reception/list.do">--%>
				<a href="#" onclick="javascript :history.back(-1);">
				<div class="close">
					<i class="fa  fa-mail-reply"></i>
				</div>
			</a>
			<div class="title">
				搜索会员
				<!-- <span><i class="fa  fa-gears"></i>设置</span> -->
			</div>
		</header>
		<div class="sk-main">
			<div class="sk-p-20">
				<div class="col-lg-12 col-md-12 col-sm-12 stab">	
				    <div id="myTabContent" class="tab-content">
					    <div class="tab-pane fade in active" id="home">
						    <div>
								<form id="submit" action="${basePath}zomoreMember/searchMember.do" method="get">
           				        <div class="input-group qd" style="margin-left: 20%; width: 60%;">
            				        <input type="text" name="condity" class="form-control" placeholder="输入会员号/姓名/手机号进行搜索">
									<span id="submit1" class="input-group-addon">查 询</span>
        				        </div>
								</form>
            				</div>
						</div>
    				</div>
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 stab" style="margin-top: 10px;">
					    <div class="list" style="width: 100%; height: 600px; overflow-y: auto;">
							<a href="#" class="list-group-item" style="text-align: left; height: 40px;">
								<div class="col-lg-3 col-md-3 col-sm-3">会员号</div>
								<div class="col-lg-3 col-md-3 col-sm-3">会员名称</div>
								<div class="col-lg-3 col-md-3 col-sm-3">联系电话</div>
								<div class="col-lg-3 col-md-3 col-sm-3">剩余金额</div>
							</a>
							<c:forEach items="${requestScope.result}" var="result">
								<a name="message" id="${result.memberNumber}" href="#" class="list-group-item" style="text-align: left; height: 40px;">
									<div class="col-lg-3 col-md-3 col-sm-3">${result.memberNumber}</div>
									<div class="col-lg-3 col-md-3 col-sm-3">${result.memberMemberidname}</div>
									<div class="col-lg-3 col-md-3 col-sm-3">${result.memberPhonenumber}</div>
									<div class="col-lg-3 col-md-3 col-sm-3">￥${result.memberBalance}</div>
								</a>
							</c:forEach>
		    	        </div>
                    </div>
				</div>
		    </div>

		<script>
			$('#submit1').click(function () {
				$("#submit").submit();
            });
            //双击选择会员
           $("a[name='message']").on('dblclick',function () {
               window.location.href="${basePath}zomoreMember/searchMemberId.do?id="+$(this).attr("id");
           });
			stg();
			function stg(){
			var	windwhegiht = $(window).height();
				if(windwhegiht<800){
					$('.select-tags').addClass('select-tagst');
					
				}else{
					$('.select-tags').removeClass('select-tagst');
					
				}
				$('.sk-main').height($(window).height()-$('.sk-footer').height()-100);
				
			}
			window.onresize=function(){
			  stg();
			  
			}
			// 输取焦点
			var Checkzh=0;//定义当前是否组合,默认是没有选中组合
			//定义一个值默认焦点的值;
			var dePrice;
			$('.form-control').focus(function(){
				dePrice=$(this);
				//将当前焦点给这个输入框对像
			});
			//点击数字的时候处理
			$('.num').on('click',function(){
				if(dePrice.val()==''){
				dePrice.val($(this).attr('data-html'));
				}else{
					dePrice.val(dePrice.val()+$(this).attr('data-html'));
				}
				price();
				
			})
			$('.delnums').on('click',function(){
				if(dePrice.val() ==''){
					
					return false;
				}else{
					s=dePrice.val().substring(0,dePrice.val().length-1);
					dePrice.val(s);
				}
				price();
			});
			function price(){
				var lt=dePrice.parents('.tab-pane').find('.qd').find('.form-control').val();
				var zl=dePrice.parents('.tab-pane').find('.zl').find('.form-control');
				zl.val(dePrice.val()-lt);
			}
			function changerPrice(event){
				//console.log(event);
				var lt=$(event).parents('.tab-pane').find('.qd').find('.form-control').val();
				var zl=$(event).parents('.tab-pane').find('.zl').find('.form-control');
				zl.val($(event).val()-lt);
			}
			//这里是总额切换的JS
			$('.nav').on('click',function(){
				console.log("1");
				//数据交互在这里实现
			})
			$('#CheckBoxZhs').on('click',function(){
				if($(this).is(':checked')){
					Checkzh=1;
					　
				}else{
					
					Checkzh=0;
				}
  	         console.log(Checkzh);
			})
			//付款的选择
			$('.pay-type').on('click',function(){
				
				if(Checkzh==0){
					$(this).addClass('active');
					$(this).siblings().removeClass('active');
					$('.xj').find('.input-group-addon').text($(this).find('.pay-select').text()+":");
				}else{
					var index = $(this).index();
					//$(this).addClass('active');
					//var t = $('.payfs').find('.active').length;
					//这里获取到了当前选中的个数;
					//if(t>2){
					//	$('.payfs').removeClass('active');
					//}
					//var t=$('.pay-type').hasClass('active').length;
					console.log(index);
				}
				
			})
			$('.zq').on('click',function(){
				$('.zqs').show(200);
			})
			$('.zq-info').on('click',function(){
				$('.zqs').hide(200);
			})
			$('.bz').on('click',function(){
				$('.bzlist').show(200);
			})
			$('.zq-info').on('click',function(){
				$('.bzlist').hide(200);
			})
		</script>
	</body>
</html>
