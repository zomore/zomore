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
		<link rel="stylesheet" type="text/css" href="${basePath}css/iconfont.css">
	</head>
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
		#container {
			width: 400px;
			height: 300px;
			overflow: hidden;
		}

		#photo {
			width: 1200px;
			animation: switch 5s ease-out infinite;
		}

		#photo > img {
			float: left;
			width: 400px;
			height: 300px;
		}

		@keyframes switch {
			0%, 25% {
				margin-left: 0;
			}
			35%, 60% {
				margin-left: -400px;
			}
			70%, 100% {
				margin-left: -800px;
			}
		}
	</style>
	<script src="${basePath}js/mui.min.js"></script>
	<script type="text/javascript">
        function sy() {
            window.location.href = "${basePath}loginController/select.do";
        }

        function xiaosou() {
            /*alert("${basePath}saleController/select.do");*/
            window.location.href = "${basePath}saleController/check.do";
        }

        function kcyj() {
            window.location.href = "${basePath}pages/kcyj.jsp";
        }

        function spzl() {
            window.location.href = "${basePath}pages/spzl.jsp";
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
			<a class="mui-tab-item" href="javascript:void (0)" onclick="sy()">
				<span class="mui-icon mui-icon-home"></span>
				<span class="mui-tab-label">首页</span>
			</a>
			<a class="mui-tab-item" href="javascript:void (0)" onclick="xiaosou()">
				<span class="mui-icon mui-icon-contact"></span>
				<span class="mui-tab-label">销售</span>
			</a>
			<a class="mui-tab-item mui-active" href="javascript:void(0)" onclick="yuangong()">
				<span class="mui-icon mui-icon-contact"></span>
				<span class="mui-tab-label">员工</span>
			</a>
			<a class="mui-tab-item" href="javascript:void (0)" onclick="shezhi()">
				<span class="mui-icon mui-icon-gear"></span>
				<span class="mui-tab-label">门店</span>
			</a>
		</nav>
		<div class="mui-content" style="background: #ffffff;">
			<div id="tabbar" class="mui-control-content mui-active">
				<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<c:forEach items="${requestScope.mapList}" var="mapList">
					<li class="mui-table-view-cell">
						<div class="mui-slider-cell">
							<div class="oa-contact-cell mui-table">
								<div class="oa-contact-avatar mui-table-cell">
									<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
								</div>
								<div class="oa-contact-content mui-table-cell">
									<div class="mui-clearfix">
										<h4 class="oa-contact-name">${mapList.guide.shoppingGuideName}</h4>
										<span class="oa-contact-position mui-h6">编号：${mapList.guide.shoppingGuideId}</span>
										<span class="oa-contact-position mui-h6">&nbsp &nbsp 提成：${mapList.guide.shoppingGuideSale}%</span>
									</div>
									<p class="oa-contact-email mui-h6">
										联系电话：${mapList.guide.shoppingGuidePhone}
									</p>
									<p class="oa-contact-email mui-h6">
										提成金额：￥ ${mapList.ticheng}
									</p>
								</div>
							</div>
						</div>
					</li>
				</c:forEach>
			</ul>
				    
			   </div>
		</div>
	</body>
	<script src="${basePath}js/mui.min.js"></script>
	<!--引用Echarts样式-->
	<script src="${basePath}js/echarts-all.js"></script>
		<script>
			var getOption = function(chartType) {
				var chartOption = chartType == 'pie' ? {
					calculable: false,
					series: [{
						name: '访问来源',
						type: 'pie',
						radius: '65%',
						center: ['50%', '50%'],
						data: [{
							value: 335,
							name: '直接访问'
						}, {
							value: 310,
							name: '邮件营销'
						}, {
							value: 234,
							name: '联盟广告'
						}, {
							value: 135,
							name: '视频广告'
						}, {
							value: 1548,
							name: '搜索引擎'
						}]
					}]
				} : {
					legend: {
						data: ['零售', '会员']
					},
					grid: {
						x: 35,
						x2: 10,
						y: 30,
						y2: 25
					},
					toolbox: {
						show: false,
						feature: {
							mark: {
								show: true
							},
							dataView: {
								show: true,
								readOnly: false
							},
							magicType: {
								show: true,
								type: ['line', 'bar']
							},
							restore: {
								show: true
							},
							saveAsImage: {
								show: true
							}
						}
					},
					calculable: false,
					xAxis: [{
						type: 'category',
						data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
					}],
					yAxis: [{
						type: 'value',
						splitArea: {
							show: true
						}
					}],
					series: [{
						name: '零售',
						type: chartType,
						data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
					}, {
						name: '会员',
						type: chartType,
						data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
					}]
				};
				return chartOption;
			};
			var byId = function(id) {
				return document.getElementById(id);
			};
			var lineChart = echarts.init(byId('lineChart'));
			lineChart.setOption(getOption('line'));
			byId("echarts").addEventListener('tap',function(){
				var url = this.getAttribute('data-url');
				plus.runtime.openURL(url);
			},false);
		</script>
</html>