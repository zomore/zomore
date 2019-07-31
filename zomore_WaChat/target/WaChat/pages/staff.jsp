<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>择沐管理助手</title>
		<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<!--标准mui.css-->
		<link rel="stylesheet" href="${basePath}css/mui.min.css">
		<!--App自定义的css-->
		<link rel="stylesheet" type="text/css" href="${basePath}css/app.css"/>
		<style>
			
			.title{
				margin: 20px 15px 10px;
				color: #6d6d72;
				font-size: 15px;
			}
			
			.oa-contact-cell.mui-table .mui-table-cell {
				padding: 11px 0;
				vertical-align: middle;
			}
			
			.oa-contact-cell {
				position: relative;
				margin: -11px 0;
			}
	
			.oa-contact-avatar {
				width: 75px;
			}
			.oa-contact-avatar img {
				border-radius: 50%;
			}
			.oa-contact-content {
				width: 100%;
			}
			.oa-contact-name {
				margin-right: 20px;
			}
			.oa-contact-name, oa-contact-position {
				float: left;
			}
			.chart {
				height: 200px;
				margin: 0px;
				padding: 0px;
			}
			h5 {
				margin-top: 30px;
				font-weight: bold;
			}
			h5:first-child {
				margin-top: 15px;
			}
			.mui-control-content {
				background-color: white;
				min-height: 215px;
			}
			.mui-control-content .mui-loading {
				margin-top: 50px;
			}
		</style>
		<script src="${basePath}js/mui.min.js"></script>
	</head>
	<script type="text/javascript">
        function sy() {
            window.location.href = "${basePath}loginController/select.do";
        }

        function xiaosou() {
            /*alert("${basePath}saleController/select.do");*/
            window.location.href = "${basePath}saleController/check.do";
        }

        function kcyj() {
            window.location.href = "${basePath}kcyjController/list.do";
        }

        function spzl() {
            window.location.href = "${basePath}spzlController/list.do";
        }
        function yuangong() {
            window.location.href = "${basePath}shopGuide/getGuide.do";
        }
        function shezhi() {
            window.location.href = "${basePath}staffController/select.do";
        }

	</script>
	<body>
	<header class="mui-bar mui-bar-nav" style="background:#099c0b;">
		<h1 class="mui-title" style="color: #ffffff;">${sessionScope.shopName}</h1>
	</header>
	<nav class="mui-bar mui-bar-tab">
		<a class="mui-tab-item"href="javascript:void (0)" onclick="sy()">
			<span class="mui-icon mui-icon-home"></span>
			<span class="mui-tab-label">首页</span>
		</a>
		<a class="mui-tab-item" href="javascript:void (0)" onclick="xiaosou()">
			<span class="mui-icon mui-icon-contact"></span>
			<span class="mui-tab-label">销售</span>
		</a>
		<a class="mui-tab-item" href="javascript:void(0)" onclick="yuangong()">
			<span class="mui-icon mui-icon-contact"></span>
			<span class="mui-tab-label">员工</span>
		</a>
		<a class="mui-tab-item mui-active" href="javascript:void (0)" onclick="shezhi()">
			<span class="mui-icon mui-icon-gear"></span>
			<span class="mui-tab-label">门店</span>
		</a>
	</nav>
				<div class="mui-content" style="background-color: #ffffff;">
					<ul class="mui-table-view" style="margin-top: 25px;">
						<li class="mui-table-view-cell">
							<a class="mui-navigate-right" onclick="spzl()" >
								库存查询
							</a>
						</li>
						<li class="mui-table-view-cell">
							<a class="mui-navigate-right" onclick="kcyj()">
								库存预警
							</a>
						</li>
						<%--<li class="mui-table-view-cell">
							<a class="mui-navigate-right">
								关于择沐
							</a>
						</li>--%>
					</ul>
					<div class="mui-table-view" style="margin-top: 25px;">
						<div class="mui-content-padded">
							<button class="mui-btn mui-btn-block mui-btn-primary" style="background-color: #099c0b;border: 1px solid #099c0b;" onclick="Quite()">
								退出登录
							</button>
						</li>
					</div>
			</div>
	<script type="text/javascript">
        function Quite(){
            window.location.href = "${basePath}logout.do";
		}
	</script>
	</body>
	<script src="${basePath}js/mui.min.js"></script>
	<!--引用Echarts样式-->
	<script src="${basePath}js/echarts-all.js"></script>
		<script>
			mui.init({
				swipeBack: false
			});
			(function($) {
				$('.mui-scroll-wrapper').scroll({
					indicators: true //是否显示滚动条
				});
				var html2 = '<ul class="mui-table-view"><li class="mui-table-view-cell">第二个选项卡子项-1</li><li class="mui-table-view-cell">第二个选项卡子项-2</li><li class="mui-table-view-cell">第二个选项卡子项-3</li><li class="mui-table-view-cell">第二个选项卡子项-4</li><li class="mui-table-view-cell">第二个选项卡子项-5</li></ul>';
				var html3 = '<ul class="mui-table-view"><li class="mui-table-view-cell">第三个选项卡子项-1</li><li class="mui-table-view-cell">第三个选项卡子项-2</li><li class="mui-table-view-cell">第三个选项卡子项-3</li><li class="mui-table-view-cell">第三个选项卡子项-4</li><li class="mui-table-view-cell">第三个选项卡子项-5</li></ul>';
				var item2 = document.getElementById('item2mobile');
				var item3 = document.getElementById('item3mobile');
				document.getElementById('slider').addEventListener('slide', function(e) {
					if (e.detail.slideNumber === 1) {
						if (item2.querySelector('.mui-loading')) {
							setTimeout(function() {
								item2.querySelector('.mui-scroll').innerHTML = html2;
							}, 500);
						}
					} else if (e.detail.slideNumber === 2) {
						if (item3.querySelector('.mui-loading')) {
							setTimeout(function() {
								item3.querySelector('.mui-scroll').innerHTML = html3;
							}, 500);
						}
					}
				});
				var sliderSegmentedControl = document.getElementById('sliderSegmentedControl');
				$('.mui-input-group').on('change', 'input', function() {
					if (this.checked) {
						sliderSegmentedControl.className = 'mui-slider-indicator mui-segmented-control mui-segmented-control-inverted mui-segmented-control-' + this.value;
						//force repaint
						sliderProgressBar.setAttribute('style', sliderProgressBar.getAttribute('style'));
					}
				});
			})(mui);
		</script>
</html>