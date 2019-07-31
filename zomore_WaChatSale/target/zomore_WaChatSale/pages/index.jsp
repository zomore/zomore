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
		<title>择沐导购助手</title>
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
	</head>

	<body>
		<header class="mui-bar mui-bar-nav" style="background: #099c0b;">
			<h1 class="mui-title" style="color: #ffffff;">${user.shoppingGuideName}</h1>
		</header>
		<nav class="mui-bar mui-bar-tab">
			<a class="mui-tab-item mui-active" href="#tabbar" onclick="sy()">
				<span class="mui-icon mui-icon-home"></span>
				<span class="mui-tab-label">首页</span>
			</a>
			<a class="mui-tab-item" href="#" onclick="xs()">
				<span class="mui-icon mui-icon-contact"></span>
				<span class="mui-tab-label">销售</span>
			</a>
			<a class="mui-tab-item" href="#"onclick="pm()">
				<span class="mui-icon mui-icon-contact"></span>
				<span class="mui-tab-label">排名</span>
			</a>
			<a class="mui-tab-item" href="#" onclick="sz()">
				<span class="mui-icon mui-icon-gear"></span>
				<span class="mui-tab-label">设置</span>
			</a>
		</nav>
		<div class="mui-content" style="background: #ffffff;">
			<div id="tabbar" class="mui-control-content mui-active">
				<div class="mui-collapse-content">
							<div id="slider" class="mui-slider" data-slidershowtimer="3">
								<div class="mui-slider-group mui-slider-loop">
									<!-- 额外增加的一个节点(循环轮播：第一个节点是最后一张轮播) -->
									<div class="mui-slider-item mui-slider-item-duplicate">
										<a href="#">
											<img src="${basePath}images/yuantiao.jpg">
										</a>
									</div>
									<!-- 第一张 -->
									<div class="mui-slider-item">
										<a href="#">
											<img src="${basePath}images/b1.jpg">
										</a>
									</div>
									<!-- 第二张 -->
									<div class="mui-slider-item">
										<a href="#">
											<img src="${basePath}images/b2.jpg">
										</a>
									</div>
									
									<!-- 额外增加的一个节点(循环轮播：最后一个节点是第一张轮播) -->

								</div>
								<div class="mui-slider-indicator">
									<div class="mui-indicator mui-active"></div>
									<div class="mui-indicator"></div>
									<div class="mui-indicator"></div>
									<div class="mui-indicator"></div>
								</div>
							</div>
						</div>
		        <ul class="mui-table-view" style="color: #2b2b2b;">
					    <li class="mui-table-view-cell"  style="background: #ffffff; font-size: 15px; font-weight:600">
							销售提成
					    </li>
				    </ul>
				<div class="chart" id="lineChart"></div>
				    <div style="height: 1px;background: #c9c9c9;"></div>
				    <!--热卖商品-->
					<ul class="mui-table-view" style="color: #2b2b2b;">
					    <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600">
							商品销售
					    </li>
				   </ul>
				    <ul class="mui-table-view">
						<c:forEach items="${requestScope.guideCommodityList}" var="commodity">
							<li class="mui-table-view-cell">
								${commodity.commodityName}<font style="float: right;">￥${commodity.commodityOutprice}</font>
								<br>
								<p>销量${commodity.commodutyNum}件  提成：￥${commodity.royalty}</p>
							</li>
						</c:forEach>
			        </ul>
				<ul class="mui-table-view" style="color: #2b2b2b;">
					<li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600">
						项目销售
					</li>
				</ul>
				<ul class="mui-table-view">
					<c:forEach items="${requestScope.guideServiceCommodityList}" var="commodity">
						<li class="mui-table-view-cell">
								${commodity.commodityName}<font style="float: right;">￥${commodity.commodityOutprice}</font>
							<br>
							<p>销量${commodity.commodutyNum}件  提成：￥${commodity.royalty}</p>
						</li>
					</c:forEach>
				</ul>
			        
			        <!--门店会员-->
			        <div style="height: 1px;background: #c9c9c9;"></div>
			        <ul class="mui-table-view" style="color: #2b2b2b;">
					    <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600">
							门店会员
					    </li>
				   </ul>
				    <ul class="mui-table-view">
				       <li class="mui-table-view-cell">
				       	今日新增会员<font style="float: right;">
						   <c:if test="${requestScope.dou1 eq null}">
							   <p>0名</p>
						   </c:if>
						   <c:if test="${requestScope.dou1 ne null}">
							   <p>${requestScope.dou1}名</p>
						   </c:if>
					   </font>
							<br>

				       </li>
						<c:if test="${requestScope.guideNum eq null}">
							<li class="mui-table-view-cell">
								今日店内业绩排名<font style="float: right;">尚没有数据</font>
							</li>
						</c:if>
						<c:if test="${requestScope.guideNum ne null}">
							<li class="mui-table-view-cell">
								今日店内业绩排名<font style="float: right;">${requestScope.guideNum}</font>
							</li>
						</c:if>


			        </ul>
			        <div style="height: 1px;background: #c9c9c9;"></div>
			      <%-- <ul class="mui-table-view" style="color: #2b2b2b;">
					    <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600">
							具体提成
					    </li>
				   </ul>
				    <ul class="mui-table-view">
				       <li class="mui-table-view-cell">
				       	果木果然瓷亮保湿霜<font style="float: right;">￥88</font>
							<br>
							<p>卖出1件  提成￥1</p>
				       </li>
			        </ul>--%>
			</div>
			
				
			<!--销售-->
			<%--<div id="tabbar-with-chat" class="mui-control-content">
				<div class="title">销售</div>
				<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
								<ul class="mui-table-view mui-grid-view">
		                            <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#">
		                            <div class="mui-media-body">零售</div></a>
		                        </li>
		                            <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#">
		                        <div class="mui-media-body">利润</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#">
		                        <div class="mui-media-body">订单数</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                        <div class="mui-media-body">￥888888</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                        <div class="mui-media-body">￥88888</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-4">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                        <div class="mui-media-body">18</div></a></li>
		                        </ul>
					</div>
				</li>
			  </ul>
			</div>
			<!--员工-->
			<div id="tabbar-with-contact" class="mui-control-content">
				<div class="title">员工业绩排行</div>
				<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
							<div class="oa-contact-avatar mui-table-cell">
								<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
							</div>
							<div class="oa-contact-content mui-table-cell">
								<div class="mui-clearfix">
									<h4 class="oa-contact-name">叶文洁</h4>
									<span class="oa-contact-position mui-h6">董事长</span>
								</div>
								<p class="oa-contact-email mui-h6">
									yewenjie@sina.com
								</p>
							</div>
						</div>
					</div>
				</li>
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
							<div class="oa-contact-avatar mui-table-cell">
								<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
							</div>
							<div class="oa-contact-content mui-table-cell">
								<div class="mui-clearfix">
									<h4 class="oa-contact-name">艾AA</h4>
									<span class="oa-contact-position mui-h6">总经理</span>
								</div>
								<p class="oa-contact-email mui-h6">
									aaa@163.com
								</p>
							</div>
						</div>
					</div>
				</li>
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
							<div class="oa-contact-avatar mui-table-cell">
								<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
							</div>
							<div class="oa-contact-content mui-table-cell">
								<div class="mui-clearfix">
									<h4 class="oa-contact-name">罗辑</h4>
									<span class="oa-contact-position mui-h6">员工</span>
								</div>
								<p class="oa-contact-email mui-h6">
									luoji@126.com
								</p>
							</div>
						</div>
					</div>
				</li>
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
							<div class="oa-contact-avatar mui-table-cell">
								<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
							</div>
							<div class="oa-contact-content mui-table-cell">
								<div class="mui-clearfix">
									<h4 class="oa-contact-name">云天明</h4>
									<span class="oa-contact-position mui-h6">员工</span>
								</div>
								<p class="oa-contact-email mui-h6">
									ytm@163.com
								</p>
							</div>
						</div>
					</div>
				</li>
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
							<div class="oa-contact-avatar mui-table-cell">
								<img src="${basePath}images/user-photo.png" style="width: 60px;height: 60px" />
							</div>
							<div class="oa-contact-content mui-table-cell">
								<div class="mui-clearfix">
									<h4 class="oa-contact-name">花花</h4>
									<span class="oa-contact-position mui-h6">员工</span>
								</div>
								<p class="oa-contact-email mui-h6">
									shiqiang@gmail.com
								</p>
							</div>
						</div>
					</div>
				</li>
			</ul>
			</div>--%>
			<%--<div id="tabbar-with-map" class="mui-control-content">--%>
				<!--
					<ul class="mui-table-view">
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						新消息通知
					</a>
				</li>
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						隐私
					</a>
				</li>
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						通用
					</a>
				</li>
			</ul>
			
				-->
			<%--<ul class="mui-table-view" style="margin-top: 25px;">
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						关于择沐
					</a>
				</li>
			</ul>
			<div style="height: 1px;background: #c9c9c9;"></div>
			<ul class="mui-table-view">
				<li class="mui-table-view-cell">
					<a style="text-align: center;color: #FF3B30;">
						退出登录
					</a>
				</li>
			</ul>--%>
			</div>
		</div>
	</body>
	<script src="${basePath}js/mui.min.js"></script>
	<!--引用Echarts样式-->
	<script src="${basePath}js/echarts-all.js"></script>

	<script type="text/javascript">
		function sy() {
			window.location.href="${basePath}guidCommodity/guideTic.do";
        }
		function xs() {
			window.location.href="${basePath}guidCommodity/guideSale.do";
        }
        function pm() {
            window.location.href="${basePath}guidCommodity/guideRank.do";
        }
        function sz() {
            window.location.href="${basePath}guidCommodity/steup.do";
        }
	</script>

		<script>
			//获取七天的日期
            var dates = {
			//获取日期
                FunGetDateStr: function (p_count) {
                    var dd = new Date();
                    dd.setDate(dd.getDate() + p_count);//获取p_count天后的日期
                    var y = dd.getFullYear();
                    var m = dd.getMonth() + 1;//获取当前月份的日期
                    var d = dd.getDate();
                    return m + "月" + d + "日";
                },
                //获取当前时间
                FunGetDate: function () {
                    var date = new Date(); //日期对象
                    var now = "";
                    now = date.getFullYear() + "-";
                    now = now + (date.getMonth() + 1) + "-";//取月的时候取的是当前月-1如果想取当前月+1就可以了
                    now = now + date.getDate() + " ";
                    now = now + date.getHours() + ":";
                    now = now + date.getMinutes() + ":";
                    now = now + date.getSeconds() + "";
                    return now;
                },

            }

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
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data: ['前店', '后院']
                    },
                    toolbox: {
                        show: true,
                        feature: {
                            dataZoom: {
                                yAxisIndex: 'none'
                            },
                            dataView: {readOnly: false},
                            magicType: {type: ['line', 'bar']},
                            restore: {},
                            saveAsImage: {}
                        }
                    },
                    xAxis:  {
                        type: 'category',
                        boundaryGap: false,
                        data: [dates.FunGetDateStr(-6), dates.FunGetDateStr(-5), dates.FunGetDateStr(-4), dates.FunGetDateStr(-3), dates.FunGetDateStr(-2), dates.FunGetDateStr(-1), dates.FunGetDateStr(0)]
                    },
                    yAxis: {
                        type: 'value',
                        axisLabel: {
                            formatter: '{value}'
                        }
                    },
                    series: [
                        {
                            name: '前店',
                            type:'line',
                            data:[${requestScope.mapGuideSale.xcount[0]}, ${requestScope.mapGuideSale.xcount[1]}, ${requestScope.mapGuideSale.xcount[2]}, ${requestScope.mapGuideSale.xcount[3]}, ${requestScope.mapGuideSale.xcount[4]}, ${requestScope.mapGuideSale.xcount[5]}, ${requestScope.mapGuideSale.xcount[6]}],
                            markLine: {
                                data: [
                                    {type: 'average', name: '平均值'}
                                ]
                            }
                        },
                        {
                            name: '后院',
                            type:'line',
                            data:[${requestScope.mapGuideServiceSale.xcount[0]}, ${requestScope.mapGuideServiceSale.xcount[1]}, ${requestScope.mapGuideServiceSale.xcount[2]}, ${requestScope.mapGuideServiceSale.xcount[3]}, ${requestScope.mapGuideServiceSale.xcount[4]}, ${requestScope.mapGuideServiceSale.xcount[5]}, ${requestScope.mapGuideServiceSale.xcount[6]}],
                            markLine: {
                                data: [
                                    {type: 'average', name: '平均值'},
                                    [{
                                        symbol: 'none',
                                        x: '90%',
                                        yAxis: 'max'
                                    }, {
                                        symbol: 'circle',
                                        label: {
                                            normal: {
                                                position: 'start',
                                                formatter: '最大值'
                                            }
                                        },
                                        type: 'max',
                                        name: '最高点'
                                    }]
                                ]
                            }
                        }
                    ]
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
			
			
		mui.init({
			swipeBack:false //启用右滑关闭功能
		});
		var slider = mui("#slider");
		document.getElementById("switch").addEventListener('toggle', function(e) {
			if (e.detail.isActive) {
				slider.slider({
					interval: 5000
				});
			} else {
				slider.slider({
					interval: 0
				});
			}
		});
	
		</script>
</html>