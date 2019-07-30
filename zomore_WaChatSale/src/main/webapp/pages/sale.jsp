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
			<h1 class="mui-title" style="color: #ffffff;">${sessionScope.shopName}</h1>
		</header>
        <nav class="mui-bar mui-bar-tab">
            <a class="mui-tab-item" href="#tabbar" onclick="sy()">
                <span class="mui-icon mui-icon-home"></span>
                <span class="mui-tab-label">首页</span>
            </a>
            <a class="mui-tab-item mui-active" href="#" onclick="xs()">
                <span class="mui-icon mui-icon-contact"></span>
                <span class="mui-tab-label">销售</span>
            </a>
            <a class="mui-tab-item" href="#"onclick="pm()">
                <span class="mui-icon mui-icon-contact"></span>
                <span class="mui-tab-label">排名</span>
            </a>
            <a class="mui-tab-item" href="#tabbar-with-map" onclick="sz()">
                <span class="mui-icon mui-icon-gear"></span>
                <span class="mui-tab-label">设置</span>
            </a>
        </nav>

        <!--员工-->

		<div class="mui-content" style="background: #ffffff;">
			<div id="tabbar" class="mui-control-content mui-active">
				<!--零售-->
				<div class="mui-collapse-content">
					<ul class="mui-table-view" style="color: #FFFFFF;">
					    <li class="mui-table-view-cell" style="color: #2b2b2b;">
					    	销售业绩
					    </li>
				    </ul>
				<ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
				<li class="mui-table-view-cell">
					<div class="mui-slider-cell">
						<div class="oa-contact-cell mui-table">
						    <ul class="mui-table-view mui-grid-view">
		                            <li class="mui-table-view-cell mui-media mui-col-xs-12">
		                            <a href="#">
		                            <div class="mui-media-body">今日业绩</div></a>
		                        </li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-12">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                        <div class="mui-media-body">￥ <fmt:formatNumber value="${requestScope.commodityroyal}" pattern="0.00" type="number"/></div></a></li>
		                    </ul>
					        </div>
					</div>
				        </li>
			        </ul>
			    <div class="chart" id="pieChart"></div>
			              <ul class="mui-table-view mui-grid-view">
		                            <li class="mui-table-view-cell mui-media mui-col-xs-6">
		                            <a href="#">
		                            <div class="mui-media-body">今日销售单数</div></a>
		                        </li>
		                            <li class="mui-table-view-cell mui-media mui-col-xs-6">
		                            <a href="#">
		                        <div class="mui-media-body">今日新增会员数</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-6">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                        <div class="mui-media-body">${requestScope.saleNum}</div></a></li>
		                        <li class="mui-table-view-cell mui-media mui-col-xs-6">
		                            <a href="#" style="font-size: 20px; font-weight: 700;">
		                             <c:if test=" ${requestScope.dou1 eq null}">
                                         <div class="mui-media-body">
                                             0
                                         </div>
                                     </c:if>
                                      <c:if test="${requestScope.dou1 ne null}">
                                          <div class="mui-media-body">
                                              ${requestScope.dou1}
                                          </div>
                                       </c:if>
                                    </a></li>
		                        </ul> 
					        </div>
			        <div style="height: 1px;background: #c9c9c9;"></div>
			        <ul class="mui-table-view" style="color: #FFFFFF;">
					    <li class="mui-table-view-cell" style="color: #2b2b2b;">
							具体业绩提成
					    </li>
				   </ul>
                <c:if test="${requestScope.commodityNum eq 0}">
                    <ul class="mui-table-view">
                        <li class="mui-table-view-cell">
                            今天还没有数据喔！
                        </li>
                    </ul>
                </c:if>
				<ul class="mui-table-view" style="color: #FFFFFF;">
					<li class="mui-table-view-cell" style="color: #2b2b2b;">
						商品
					</li>
				</ul>
                <c:if test="${requestScope.commodityNum ne 0}">
                    <c:forEach items="${requestScope.commodity}"  var="commodity">
                        <ul class="mui-table-view">
                            <li class="mui-table-view-cell">
                                ${commodity.commodityName}<font style="float: right;">实收￥${commodity.realMoney}</font>
                                <br>
                                <p>销售${commodity.commodutyNum}件  提成￥${commodity.royalty}</p>
                            </li>
                        </ul>
                    </c:forEach>
					<ul class="mui-table-view" style="color: #FFFFFF;">
						<li class="mui-table-view-cell" style="color: #2b2b2b;">
							项目
						</li>
					</ul>
                    <c:forEach items="${requestScope.ServiceCommodity}"  var="ServiceCommodity">

                        <ul class="mui-table-view">
                            <li class="mui-table-view-cell">
                                    ${ServiceCommodity.commodityName}<font style="float: right;">实收￥${ServiceCommodity.realMoney}</font>
                                <br>
                                <p>销售${ServiceCommodity.commodutyNum}件  提成￥${ServiceCommodity.royalty}</p>
                            </li>
                        </ul>
                    </c:forEach>

                </c:if>

			    </div>

           <%-- <div id="tabbar-with-contact" class="mui-control-content">
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
            </div>
            <div id="tabbar-with-map" class="mui-control-content">
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
                <ul class="mui-table-view" style="margin-top: 25px;">
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
                </ul>
            </div>
			</div>
		</div>
--%>


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
			var getOption = function(chartType) {
				var chartOption = chartType == 'pie' ? {
					calculable: false,
					series: [{
						name: '访问来源',
						type: 'pie',
						radius: '65%',
						center: ['50%', '50%'],
						data: [{
							value: ${requestScope.commodityRoyal1},
							name: '商品提成：￥${requestScope.commodityRoyal1}'
						}, {
							value: ${requestScope.commodityServiceRoyal},
							name: '服务提成：￥${requestScope.commodityServiceRoyal}'
						} /*{
							value: 234,
							name: '次卡提成'
						}, {
							value: 135,
							name: '任务提成'
						}, {
							value: 1548,
							name: '充值提成'
						}*/]
					}]
				} : {
					legend: {
						data: ['蒸发量', '降水量']
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
						name: '蒸发量',
						type: chartType,
						data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
					}, {
						name: '降水量',
						type: chartType,
						data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
					}]
				};
				return chartOption;
			};
			var byId = function(id) {
				return document.getElementById(id);
			};
			var pieChart = echarts.init(byId('pieChart'));
			pieChart.setOption(getOption('pie'));
			byId("echarts").addEventListener('tap',function(){
				var url = this.getAttribute('data-url');
				plus.runtime.openURL(url);
			},false);
		</script>
</html>