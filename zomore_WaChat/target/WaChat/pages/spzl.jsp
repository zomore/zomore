<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
        <script type="text/javascript" src="${basePath}js/jquery.min.js"></script>
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
	<script type="text/javascript">
        function sy() {
            window.location.href = "${basePath}loginController/select.do";
        }

        function xiaosou() {
            <%--alert("${basePath}saleController/select.do");--%>
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
		<a class="mui-tab-item" href="javascript:void(0)" onclick="yuangong()">
			<span class="mui-icon mui-icon-contact"></span>
			<span class="mui-tab-label">员工</span>
		</a>
		<a class="mui-tab-item mui-active" href="javascript:void (0)" onclick="shezhi()">
			<span class="mui-icon mui-icon-gear"></span>
			<span class="mui-tab-label">门店</span>
		</a>
	</nav>
		<div class="mui-content" style="background: #ffffff;">
			<div id="tabbar" class="mui-control-content mui-active">
				<div class="mui-input-row mui-search" style="margin-top: 10px;" >
					<input type="search" id="code" class="mui-input-clear" placeholder="商品条码/商品名称" onblur="search()"  style="margin-bottom: 0px; padding: 0px 0px;margin-bottom: 0px;"value="${requestScope.code}">
				</div>
				<div class="mui-content">
			    <div class="mui-content-padded">
				 <%--   <select class="mui-btn mui-btn-block" style="background: #e0e0e0; padding: 2px;" id="selectBytype">
					    <option value="item-1" value="">全部分类</option>
                        <c:forEach items="${requestScope.result.items}" var="result" varStatus="status">
					    <option value="item-2"><td>${result.zomoreCommodityType}</td></option>
                        </c:forEach>
					    &lt;%&ndash;<option value="item-3">商品分类3</option>
					    <option value="item-4">商品分类4</option>
					    <option value="item-5">商品分类5</option>&ndash;%&gt;
				    </select>--%>
                     <select  class="mui-btn mui-btn-block" style="background: #e0e0e0; padding: 2px;" onchange="show_sub()" id="selectBytype" >
                         <option name="item-1" value="1" id="changevalue" >全部分类</option>
                       <c:forEach items="${requestScope.commodityType}" var="Type">
                             <c:if test="${Type.zomoreCommodityCategoryParentid=='0'}">
                                 <option name="item-1" value="${Type.zomoreCommodityCategoryName}"
                                         <c:if test="${requestScope.type==Type.zomoreCommodityCategoryName}">selected</c:if>>
                                         ${Type.zomoreCommodityCategoryName}</option>
                               <%--  <c:forEach items="${requestScope.commodityType}" var="Type1">
                                     <c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
                                         <option name="item-1"
                                                 value="${Type1.zomoreCommodityCategoryName}"
                                                 <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
                                             ${Type1.zomoreCommodityCategoryName}</option>
                                     </c:if>
                                 </c:forEach>--%>
                             </c:if>
                         </c:forEach>
				<%--		 <c:forEach items="${requestScope.result}" var="result">

								 <option name="item-1"
										 value="${result.type}"
										 <c:if test="${requestScope.type==result.type}">selected</c:if>>
										 ${result.type}</option>
							&lt;%&ndash;	 <c:forEach items="${requestScope.commodityType}" var="Type1">
									 <c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
										 <option name="item-1"
												 value="${Type1.zomoreCommodityCategoryName}"
												 <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
												 ${Type1.zomoreCommodityCategoryName}</option>
									 </c:if>
								 </c:forEach>&ndash;%&gt;

						 </c:forEach>--%>
                     </select>
				    </div>
			    </div>
				
				    <!--热卖商品-->
					<ul class="mui-table-view" style="color: #FFFFFF;">
					    <li class="mui-table-view-cell" style="background: #099c0b;">
							商品库存
					    </li>
				   </ul>
                <c:forEach items="${requestScope.result}" var="result">
					<c:choose>
						<c:when test="${fn:length(result)>0}">
							<ul class="mui-table-view">
								<li class="mui-table-view-cell">
										${result.name}<font style="float: right;">库存：${result.store}</font>
									<br>
									<p>条码：${result.code}</p>
								</li>
							</ul>
						</c:when>
						<c:otherwise>
							<ul class="mui-table-view">
								<li class="mui-table-view-cell">
									该商品分类没有商品
									<p align="center">该商品分类没有商品</p>
								</li>
							</ul>
						</c:otherwise>
					</c:choose>
                </c:forEach>
			
			<div id="tabbar-with-map" class="mui-control-content">
				<!--
					<ul class="mui-table-view">
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						新消息通知
					</a>
				</li>
			</ul>-->
			<ul class="mui-table-view" style="margin-top: 25px;">
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						商品库存
					</a>
				</li>
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						会员资料
					</a>
				</li>
				<li class="mui-table-view-cell">
					<a class="mui-navigate-right">
						关于择沐
					</a>
				</li>
			</ul>
			<ul class="mui-table-view" style="margin-top: 25px;">
				<li class="mui-table-view-cell">
					<a style="text-align: center;color: #FF3B30;">
						退出登录
					</a>
				</li>
			</ul>
			</div>
		</div>

		</div>
	</body>
	<script type="text/javascript">
        function search() {
           /* alert("11111111");*/
           var code = $("#code").val();
          var reg = /(^[\-0-9][0-9]*(.[0-9]+)?)$/
			/*if(new RegExp(code)== true){
			    alert("1111");
			}*/
        var pattern = new RegExp(reg)
			if(code !=""||code !==null){
                if(pattern.test(code)==true){
                    //输入的是条码
                    window.location.href ="${basePath}spzlController/selectNum.do?code=" + code;
				}else{
                    //输入的是名称
                    window.location.href ="${basePath}spzlController/selectWord.do?code=" + code;
				}
			}else{
                window.location.href ="${basePath}spzlController/list.do"
			}
			/*else if(code ==false){
			   return code =$("#code").val();
			}else if(pattern.test(code)==true){
                alert(code);
                //输入的是条码
                window.location.href ="${basePath}spzlController/selectNum.do?code=" + code;
			}
			else{
                alert(code);
			    //输入的是名称
                window.location.href ="${basePath}spzlController/selectWord.do?code=" + code;
			}
*/
            /*alert(code);*/
           /* alert("22222");*/
           /* var selectBytype = $("#selectBytype").find("option:selected").val();*/
        	<%--window.location.href = "${basePath}zomoreCommodityStore/selectBytype.do?type=" + selectBytype + "&search=" + search;/!* + "&suplier=" + suplier + "&pageNum=" + 1*!/--%>
			<%--window.location.href ="${basePath}spzlController/selectBytype.do?code=" + code;--%>
        }

        function show_sub(){
            /*alert($("#selectBytype").find("option:selected").attr("value"));//原生*/
          	var selectBytype = $("#selectBytype").find("option:selected").val(); //加入jq库
			if (selectBytype == "1") {
				window.location.href = "${basePath}spzlController/list.do";
				return;
			}
			//selectBytype = encodeURI(selectBytype);
			//var selectBytype = $("#selectBytype option:selected").val();
            window.location.href ="${basePath}spzlController/selectBytype.do?selectBytype=" + selectBytype;
        }




    </script>

   <%-- <script type="text/javascript">
        var page = new Paging();
        var url = "${basePath}spzlController/listAjax.do";
        //jquery插件的写法
        $('#pageToolbar').Paging({
            //每页显示多少条

            changePagesize: function (size, pagecount, count) {
                //判断是否带有条件
                var type = $("#selectBytype").find("option:selected").val();
                var suplier = $("#selectBysupplier").find("option:selected").val();
                var code = $('#code').val();
                if (type != "" || suplier != "" || code != "") {
                    url="${basePath}spzlController/selectBytypeAjax.do?type="+type+"&suplier="+suplier+"&code="+code;
                }

            }, callback: function (pagecount, size, count) {
                //判断是否带有条件
                var type = $("#selectBytype").find("option:selected").val();
                var suplier = $("#selectBysupplier").find("option:selected").val();
                var code = $('#code').val();
                if (type != "" || suplier != "" || code != "") {
                    url="${basePath}spzlController/selectBytypeAjax.do?type="+type+"&suplier="+suplier+"&code="+code;
                }
                $.ajax({
                    type: "POST",
                    url: url,
                    data: {"pageNum": pagecount, "pageSize": size},
                    success: function (msg) {
                        //点击下一页触发

                    }

        });
            }
        });
    </script>--%>



	<script src="${basePath}js/mui.min.js"></script>
	<!--引用Echarts样式-->
	<script src="${basePath}js/echarts-all.js"></script>
		<script>
            function sy() {
                window.location.href="${basePath}pages/index.jsp";
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