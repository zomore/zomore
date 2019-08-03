<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>退款</title>
	<link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
	<link href="${basePath}css/bootstrap.min.css" rel="stylesheet"/>
	<link href="${basePath}css/icon.css" rel="stylesheet"/>
	<link href="${basePath}css/commons.css" rel="stylesheet"/>
	<!-- 引用阿里图标样式 -->
	<link href="${basePath}css/iconfont.css" rel="stylesheet"/>
	<!-- 引用按钮样式 -->
	<link href="${basePath}css/components.css" rel="stylesheet"/>
	<!-- 引入表格的样式  -->
	<link href="${basePath}css/bootstrap-table.min.css" rel="stylesheet"/>

	<!-- 引入jquery的JS -->
	<script src="${basePath}js/jquery.min.js"></script>
	<script src="${basePath}js/bootstrap.min.js"></script>
	<!-- 引用表格的JS -->
	<script src="${basePath}js/bootstrap-table.min.js"></script>
	<script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
	<!-- 引用表格后键菜单的JS -->
	<script src="${basePath}js/BootstrapMenu.min.js"></script>
	<!-- 引入系统信息警告的JS -->
	<script src="${basePath}js/alert.js"></script>


	<!-- toggle -->
	<link href="../css/toggles.css" rel="stylesheet"/>

	<!-- 引入加减 -->
	<link href="../css/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>
	<!-- to -->
	<script src="../js/toggles.min.js"></script>
	<!-- 引入 -->
	<script src="../js/jquery.bootstrap-touchspin.min.js"></script>
	<!-- x-editable (bootstrap version) -->

	<link href="${basePath}x-editable-develop/dist/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet"/>
	<script src="${basePath}x-editable-develop/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
	<style type="text/css">
		.th-inner {
			font-weight: normal;
		}

		#table > tbody > tr:nth-of-type(odd) {
			background-color: #f7f0df;
		}
	</style>
</head>
<body>
<header class="header com-bj">
	<a href="#" onclick="javascript :history.back(-1);">
	<div class="close">
		<i class="fa  fa-mail-reply"></i>
	</div>
</a>
	<div class="title" style="color:#e13f3c;">
		退款模式
	</div>
	<div class="logo">
		<img src="${basePath}img/logo.png"/>
	</div>
</header>
<!-- 主界面内容 -->
<div class="index-main">
	<table id="table" data-resizable="true">
		<thead>
		<tr>
			<th data-field="id">商品条码</th>
			<th data-field="name">商品名称</th>
			<th data-field="oldprivice">原价</th>
			<th data-field="discount">折扣</th>
			<th data-field="num">数量</th>
			<th data-field="newprivice">现价</th>
			<th data-field="money">小计</th>
		</tr>
		</thead>
	</table>
</div>


<!-- 主界面底部 -->
<div class="index-footer">
	<div class="f-top f-top-bj">
		<div class="col-lg-3 col-md-3 col-xs-3 f-top-left">
			共计 <a id="allShopNum">0</a> 件商品
		</div>
		<div class="col-lg-9 col-md-9 col-xs-9 f-top-right">
			<button class="btn btn-danger " onclick="Deleted()"> <i class="fa fa-cloud"></i> <span>删除</span> </button>
		</div>
	</div>
	<div class="f-bottom f-bottom-bj">
		<div class="col-sm-4 col-lg-3">
			<div class="panel pan1">
				<div class="input-group m-t-10">
					<input type="text" id="searchByCode" name="code" class="form-control" placeholder="请输入条码" autocomplete="off" style="height: 100px;"/>
					<span class="input-group-addon"><i class="iconfont icon-jisuanqi modal1"></i></span>
				</div>
				<%--<div class="input-group m-top-10">
					<input type="text" id="WM" name="WM" class="form-control"
						   placeholder="无码收银"/>
					<span class="input-group-addon"><i class="iconfont icon-jisuanqi modal3"></i></span>
				</div>--%>
			</div>
		</div>
		<div class="col-sm-4 col-lg-3 ">
			<div class="panel pan2">
				<div class="input-group ">
					<input type="text" id="zomoreMemberNum" name="num" class="form-control" placeholder="会员号/手机号" autocomplete="off"/>
					<span class="input-group-addon"><i class="iconfont icon-icon_addperson modal4"></i></span>
				</div>
				<div style="height: 1px; background-color: #9edde3;">
					<div class="col-lg-4 col-sm-4 col-md-4 talign"
						 style="border-right: solid 1px #9edde3; margin-top: 5px;">
						<p id="name">会员</p> 姓名
						<span class="label label-warning " id="showUser">查看</span>
					</div>
					<div class="col-lg-4 col-sm-4 col-md-4 talign"
						 style="border-right: solid 1px #9edde3; margin-top: 5px;">
						<p id="money">0</p> 余额
						<span class="label label-warning" id="cz">充值</span>
					</div>
					<div class="col-lg-4 col-sm-4 col-md-4 talign">
						<p id="integral">0</p> 积分
						<span class="label label-warning" id="jifenduihuan">兑换</span>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-4 col-lg-3" style="float: right;">
			<div class="panel p-red">
				<a href="javascript:void(0)" name="${basePath}reception/sk.jsp" id="getmoney">
					<div class="left" style="width: 100%; background: #469547 !important">
						<div class="p-left">
							<p class="p-red-h1">退款</p>
							<p class="p-red-txt">[空格键]</p>
						</div>
						<div class="p-right" id="allmoney" style="font-size: 30px">
							￥:0.00
						</div>
					</div>
				</a>
			</div>
		</div>
		<%--<div class="col-sm-4 col-lg-3" style="float: right;">
			<div class="panel p-red">
				<a href="sk.html">
					<div class="left" style="width: 100%; background: #469547 !important">
						<div class="p-left">
							<p class="p-red-h1">收款</p>
							<p class="p-red-txt">[空格键]</p>
						</div>
						<div class="p-right">
							￥:-182.50
						</div>
					</div>
				</a>
			</div>
		</div>--%>
	</div>
</div>


<!-- 这里是商品关键字搜索结果，没有封装，考虑后端数据的读取 -->
<div class="modal fade  " id="GoodSearch" data-backdrop="static" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header com-bj">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
				<h4 class="modal-title"> 选择商品 </h4>
			</div>
			<div class="modal-body">
				<div class="search">
					<div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <span class="btn  btn-primary search-icon"><i
								class="fa fa-search"></i></span> </span>
						<input type="email" id="searchLikeCode" name="searchLikeCode" class="form-control"
							   placeholder="按条形码/拼音码/品名搜索" />
						<span class="input-group-btn"> <button type="button" id="searchLikeCode1" class="btn btn-info">搜索</button> </span>
					</div>
				</div>
				<div class="table-fex">

					<table id="searchLikeCodeTable" data-resizable="true" class="table  table-bordered ">
						<thead>
						<tr>
							<th data-field="CommodityCode">商品条码</th>
							<th data-field="CommodityName">商品名称</th>
							<th data-field="Specifications">规格</th>
							<th data-field="CommodityOut">价格</th>
							<th data-field="CommodityNum">货号</th>
						</tr>
						</thead>
						<tbody class="search-list">
						<c:forEach items="${requestScope.CommodityList}" var="commodity">
							<tr>
								<td>${commodity.zomoreCommodityCode}</td>
								<td>${commodity.zomoreCommodityName}</td>
								<td>${commodity.zomoreCommoditySpecifications}</td>
								<td>${commodity.zomoreCommodityOut}</td>
								<td>${commodity.zomoreCommodityNum}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="modal-footer">
				<div class="col-lg-8">
					没有找到配对的件，请重新输入关键字
				</div>
				<div class="col-lg-4">
					<button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-success" id="inputCommodity"> 加入</button>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- 这里是会员关键字搜索结果，没有封装，考虑后端数据的读取 -->
<div class="modal fade  " id="UserSearch" data-backdrop="static" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header com-bj">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
				<h4 class="modal-title" id="myModalLabel"> 会员查询 </h4>
			</div>
			<div class="modal-body">
				<div class="search">
					<div class="input-group m-t-10 p-10">

						<input type="text" id="serchUser" name="serchUser" class="form-control"
							   placeholder="输入卡号/手机号/会员账号"/>
						<span class="input-group-btn"> <button type="button" class="btn btn-info"
															   id="serchUser1">搜索</button> </span>
					</div>
				</div>
				<div class="table-fex">

					<table id="usertable" class="table  table-bordered ">
						<thead>
						<tr>
							<th data-field="memberNumber">卡号</th>
							<th data-field="memberMemberidname">姓名</th>
							<th data-field="memberPhonenumber">手机</th>
							<th data-field="memberIntegral">积分</th>
							<th data-field="memberBalance">余额</th>
							<th data-field="memberDiscount">折扣</th>
						</tr>
						</thead>
						<tbody class="search-list">
						<c:forEach items="${requestScope.userList}" var="users">
							<tr>
								<td>${users.memberNumber}</td>
								<td>${users.memberMemberidname}</td>
								<td>${users.memberPhonenumber}</td>
								<td>${users.memberIntegral}</td>
								<td>${users.memberBalance}</td>
								<td>${users.memberDiscount}</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="modal-footer">
				<div class="col-lg-8">
					没有找到配对的件，请重新输入关键字
				</div>
				<div class="col-lg-4">
					<button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-success " onclick="inputUser()"> 加入</button>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- 退款 -->
<div class="modal fade  " id="closeWork" data-backdrop="static" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel6" aria-hidden="true">
	<div class="modal-dialog ">
		<div class="modal-content">
			<div class="modal-header com-bj ">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
				<h4 class="modal-title" id="myModalLabel6"> 退款确认
				</h4>
			</div>
			<form action="${basePath}zomoreCommoditySale/upateCommoditSaleType2.do" method="post">
			<div class="modal-body">
				<div class="input-group " style="width: 100%;">
					<input type="text" id="tuikuan" name="money" class="form-control "
						   autofocus="autofocus" readonly/>
				</div>
				<input type="hidden" id="zomoreCommoditySaleId" name="zomoreCommoditySaleId" >
				<input type="hidden" name="zomoreCommodityState" value="3">
				<input type="hidden" id="memberNum" name="memberNum">
			</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-pink " data-dismiss="modal">取消</button>
				<button type="submit" class="btn btn-success " >确定</button>
			</div>
			</form>
		</div>
	</div>
</div>
<!-- 新增商品资料弹窗 -->
<form id="submit" action="${basePath}zomoreCommodity/add1.do" method="post">
	<div class="modal fade in " id="AddGood" data-backdrop="static" tabindex="-1" role="dialog"
		 aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header com-bj">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
					<h4 class="modal-title" id="myModalLabel1"> 商品资料 </h4>
				</div>
				<div class="modal-body">
					<div class="table-fexs">
						<div class="row">
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="form-group">
									<div class="input-group m-t-10">
										<span class="input-group-addon">条码：</span>
										<input type="text" id="zomoreCommodityCode" name="zomoreCommodityCode"
											   class="form-control"/>
										<span class="input-group-btn"> <button type="button"
																			   class="btn waves-effect waves-light btn-info"
																			   id="createId">生成</button> </span>
									</div>
								</div>
							</div>
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="form-group">
									<div class="input-group m-t-10">
										<span class="input-group-addon">零售价：</span>
										<input type="text" class="form-control" id="zomoreCommodityOut"
											   name="zomoreCommodityOut"/>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="form-group">
									<div class="input-group">
										<span class="input-group-addon">品名：</span>
										<input type="text" class="form-control" id="zomoreCommodityName"
											   name="zomoreCommodityName" />
									</div>
								</div>
							</div>
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="input-group">
									<span class="input-group-addon">进货价：</span>
									<input type="text" class="form-control" id="zomoreCommodityIn"
										   name="zomoreCommodityIn" />
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="form-group">
									<div class="input-group m-t-10">
										<span class="input-group-addon">分类：</span>
										<select class="select2 form-control" name="zomoreCommodityType">
											<option value="默认分类">默认分类</option>
											<c:forEach items="${requestScope.commodityType}" var="Type">
												<c:if test="${Type.zomoreCommodityCategoryParentid=='0'}">
													<option value="${Type.zomoreCommodityCategoryName}" <c:if test="${requestScope.type==Type.zomoreCommodityCategoryName}">selected</c:if>>
															${Type.zomoreCommodityCategoryName}</option>
													<c:forEach items="${requestScope.commodityType}" var="Type1">
														<c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
															<option value="${Type1.zomoreCommodityCategoryName}" <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
																&nbsp;&nbsp; ${Type1.zomoreCommodityCategoryName}</option>
														</c:if>
													</c:forEach>
												</c:if>
											</c:forEach>
										</select>
										<span class="input-group-btn"> <button type="button"
																			   class="btn  btn-info">推荐</button> </span>
									</div>
								</div>
							</div>
							<div class="col-md-6 col-lg-6 col-sm-6">
								<div class="input-group">
									<span class="input-group-addon">库存：</span>
									<input type="text" class="form-control" id="zomoreCommodityStore"
										   name="zomoreCommodityStore"/>
								</div>
							</div>
						</div>
						<div class="fben">屏开更多</div>
						<div class="addgoodshide">
							<div class="row">
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon">拼音码：</span>
											<input type="text" class="form-control" id="zomoreCommodityPingyin"
												   name="zomoreCommodityPingyin"/>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="input-group">
										<span class="input-group-addon">库存上限：</span>
										<input class="vertical-spin form-control" type="text" value=""
											   id="zomoreCommodityUplimit" name="zomoreCommodityUplimit"
											   data-bts-button-down-class="btn btn-info"
											   data-bts-button-up-class="btn btn-info">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon">供货商：</span>
											<input type="text" class="form-control" id="zomoreCommodityProvide"
												   name="zomoreCommodityProvide"/>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="input-group">
										<span class="input-group-addon">库存下限：</span>
										<input class="vertical-spin form-control" type="text" value=""
											   id="zomoreCommodityDownlimit" name="zomoreCommodityDownlimit"
											   data-bts-button-down-class="btn btn-info"
											   data-bts-button-up-class="btn btn-info">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon">生产日期：</span>
											<input type="text" class="form-control" id="zomoreCommodityProductdate"
												   name="zomoreCommodityProductdate" placeholder="2018-08-08"/>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="input-group">
										<span class="input-group-addon">保质期：</span>
										<input class="vertical-spin form-control" type="text" value=""
											   id="zomoreCommodityTime" name="zomoreCommodityTime"
											   data-bts-button-down-class="btn btn-info"
											   data-bts-button-up-class="btn btn-info">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="form-group">
										<div class="input-group">
											<span class="input-group-addon">商品状态：</span>
											<div class="toggle toggle-primary togglezt" style="float: right;"></div>
										</div>
									</div>
								</div>
								<div class="col-md-6 col-lg-6 col-sm-6">
									<div class="form-group">
										<div class="input-group">
											<div class="toggle toggle-primary toggleprice" style="float: left;"></div>
											<input style="float: left;width: 100px; margin-left: 10px;"
												   class="form-control tps" name="zomoreCommodityMemberprice"
												   id="zomoreCommodityMemberprice"/>
										</div>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12 col-lg-12 col-sm-12">
									<div class="input-group">
										<span class="input-group-addon">商品备注：</span>
										<textarea class="form-control" name="zomoreCommodityMeno"
												  style="min-height: 100px;"></textarea>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-success " id="addCommody"> 确认</button>
				</div>
			</div>
		</div>
	</div>
</form>
<%--挂单弹窗--%>
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel5" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header com-bj">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
				<h4 class="modal-title" id="myModalLabel5">挂单</h4>
			</div>
			<div class="modal-body">
				<div class="search">
					<div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="paihao"
															   class="btn btn-info">牌号</button> </span>
						<input type="email" id="band" name="paihao" class="form-control" placeholder="牌号"/>

					</div>
				</div>
				<div class="search">
					<div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="daogou"
															   class="btn btn-info">导购员</button></span>
						<%--<input type="email" id="guide" name="daogou" class="form-control" placeholder="导购员"/>--%>
						<select id="guide" name="daogou" class="form-control">
						</select>
					</div>
				</div>
				<div class="search">
					<div class="input-group m-t-10 p-10">
						<span class="input-group-btn"> <button type="button" id="beizu" class="btn btn-info">备注</button> </span>
						<input type="email" id="meno" name="meno" class="form-control" placeholder="备注"/>
					</div>
				</div>

			</div>
			<div class="modal-footer">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
					<button type="button" class="btn btn-info btn-block btn-lg sure8" id="selectGuide"
							onclick="guadan()"> 挂单
					</button>
				</div>
			</div>
		</div>
	</div>
</div>
<%--快捷键弹窗--%>
<div class="modal fade  " id="kuaijiejian" data-backdrop="static" tabindex="-1" role="dialog"
	 aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header com-bj">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
				<h4 class="modal-title" id="myModalLabe"> 快捷键 </h4>
			</div>
			<div class="modal-body">
				<div class="search">
					<div class="input-group m-t-10 p-10">


					</div>
				</div>
				<div class="table-fex" style="height: 200px; overflow-x: hidden;">
					<table id="kuaijiejianTable"  class="table  table-bordered">
						<thead>
						<tr>
							<th data-field="memberNumber">名称</th>
							<th data-field="memberMemberidname">快捷键</th>
						</tr>
						</thead>
						<tbody class="search-list" style="overflow-y: auto;">
						<tr><td>系统设置</td><td>Ctrl+A</td></tr>
						<tr><td>补打小票</td><td>Ctrl+B</td></tr>
						<tr><td>单品删除</td><td>Ctrl+D</td></tr>
						<tr><td>导购员</td><td>Ctrl+E</td></tr>
						<tr><td>挂单</td><td>Ctrl+G</td></tr>
						<tr><td>取单</td><td>Ctrl+Q</td></tr>
						<tr><td>进货</td><td>Ctrl+L</td></tr>
						<tr><td>积分兑换</td><td>Ctrl+J</td></tr>
						<tr><td>盘点</td><td>Ctrl+K</td></tr>
						<tr><td>单品加1</td><td>+</td></tr>
						<tr><td>单品减1</td><td>-</td></tr>
						<tr><td>商品报损</td><td>Ctrl+R</td></tr>
						<tr><td>订货</td><td>Ctrl+S</td></tr>
						<tr><td>退货</td><td>Ctrl+T</td></tr>
						<tr><td>调货</td><td>Ctrl+Y</td></tr>
						<tr><td>查看通知</td><td>F3</td></tr>
						<tr><td>交接班</td><td>F6</td></tr>
						<tr><td>弹钱箱</td><td>F7</td></tr>
						<tr><td>新增会员</td><td>F8</td></tr>
						<tr><td>查看会员资料</td><td>F9</td></tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="modal-footer">
				<div class="col-lg-8">

				</div>
				<div class="col-lg-4">
					<button type="button" class="btn btn-pink  " data-dismiss="modal">关闭</button>
				</div>
			</div>
		</div>
	</div>
</div>

<input type="hidden" id="cashierName" value="${sessionScope.cashierName}">
<input type="hidden" id="items" value="${requestScope.result.items}">
<input type="hidden" id="itemssize" value="${requestScope.result.items.size()}">

<script src="${basePath}js/modal-one.js"></script>
<script>
    //快捷键弹窗
    $("a[class='kuaijiejian']").click(function () {
        $('#kuaijiejian').modal('show');
    });

    $('#searchByCode').focus();
    //商品打折后价
    var endmoney = 0;
    //商品原总价
    var allmoney = 0;

    //点击后院,跳转
    function houyuan() {
        if (parseFloat(endmoney).toFixed(2) > 0) {
            //要做的事情
            var hf = $("#getmoney").attr("name") + "?money=" + parseFloat(endmoney).toFixed(2);
            //拼接销售单据
            //1.会员
            var huiyuan = $("#name").text();
            hf = hf + "&huiyuan=" + huiyuan;
            //2.商品原总价
            //alert(allmoney);
            // hf=hf+"&allmoney="+allmoney;
            //3.单个商品名称  数组(aa,bb,cc)
            var condityname = "";
            var index1 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index1 == 1) {
                    condityname = condityname + $(this).text() + ","
                }
                index1++;
                if (index1 == 7) {
                    index1 = 0;
                }
            });
            condityname = condityname.substring(0, condityname.length - 1);
            // hf=hf+"&condityname="+condityname;
            //4.商品数量 数组（1,1,1）
            var conditynum = "";
            var index2 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index2 == 4) {
                    conditynum = conditynum + $(this).text() + ","
                }
                index2++;
                if (index2 == 7) {
                    index2 = 0;
                }
            });
            conditynum = conditynum.substring(0, conditynum.length - 1);
            //hf=hf+"&conditynum="+conditynum;
            //$(this).attr("href",hf);
            //保存销售单据
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/add.do",
                data: {
                    "zomoreCommoditySaleName": "收银员",
                    "zomoreCommoditySaleInmoney": parseFloat(endmoney).toFixed(2),
                    "zomoreCommoditySaleMember": huiyuan,
                    "zomoreCommoditySaleMoney": allmoney,
                    "commoditNum": conditynum,
                    "commoditName": condityname
                },
                success: function (msg) {
                    window.location.href = "${basePath}zomoreServiceCommodity/list1.do";
                }
            });
        } else {
            window.location.href = "${basePath}zomoreServiceCommodity/list1.do?state=1";
        }

    }

    var r = 0;
    var allShopNum = 0;
    //扫码添加商品
    $('#searchByCode').keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            huiche();
        }
    });
    //添加无码商品0000000000001
    $("#WM").keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            var momey = $("#WM").val();
            //修改无码商品的金额
            $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreCommodity/update.do",
                    data: {"id": '0000000000001', "price": momey},
                    success: function (msg) {
                        if (msg == 'success') {
                            $('#searchByCode').val('0000000000001');
                            huiche();
                        }
                        if (msg == 'error') {
                            aler("无码商品添加失败");
                        }
                    },
                    error: function () {
                        aler("无码商品添加失败");
                    }
                }
            );
        }
    });
    var zekou=100;
    function huiche() {
        var code = $('#searchByCode').val();
        //向后台动态获取商品信息，回到前台显示，需要前台做重复处理
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/searchByCode.do",
            data: {"code": code},
            success: function (msg) {
                msg[0].num = Number(-Number( msg[0].num));
                msg[0].money = Number(-Number( msg[0].money)).toFixed(2);
                // alert(JSON.stringify(msg));
                //判断是否存在该商品 ，如果存在则修改数量和小计
                var index3 = 0
                //判断是否存在商品的标准
                var flag = 0;
                //判断是否存在商品
                var flag1 = 0;
                $('#table>tbody>tr>td').each(function () {
                    if (index3 == 0 && msg[0].id == $(this).text()) {
                        //如果存在商品
                        flag = 1;
                    }
                    if (index3 == 3 && flag == 1) {
                        zekou= $(this).text();
                    }
                    //修改数量
                    if (index3 == 4 && flag == 1) {
                        r = $(this).parent().attr("data-index");
                        flag1 = 1;
                        msg[0].num = Number($(this).text()) +Number( msg[0].num);
                        //$(this).text(msg[0].num);
                    }
                    //修改小计
                    if (index3 == 6 && flag == 1) {
                        msg[0].money = (Number($(this).text())*100/zekou +Number( msg[0].money)).toFixed(2);
                        // $(this).text(msg[0].money);
                    }
                    index3++;
                    if (index3 == 7) {
                        index3 = 0;
                        flag = 0;
                    }
                });
                /*      $("#table").bootstrapTable('append',msg);
                      $("#table tbody tr").addClass("DynamicAdd");*/
                if(code=='0000000000001'){
                    //后面追加(无码商品不叠加)
                    $("#table").bootstrapTable('append', msg);
                    $("#table tbody tr").addClass("DynamicAdd");
                }else if (flag1 != 0) {
                    //更新数量和小计
                    var _data = {
                        "num": msg[0].num, //要更新列的field
                        "money": msg[0].money //要更新列的数据
                    }//更新表格数据
                    $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                    $("#table tbody tr").addClass("DynamicAdd");
                } else {
                    //后面追加
                    $("#table").bootstrapTable('append', msg);
                    $("#table tbody tr").addClass("DynamicAdd");
                }
                allmoney = (Number(allmoney)+ Number(msg[0].newprivice)).toFixed(2);
                endmoney = allmoney;
                //把金额写进收款中(保留两位小数)
                $('#allmoney').text("￥:-" + parseFloat(allmoney).toFixed(2));
                //前面追加
                /*$("#table").bootstrapTable('prepend',msg);*/
                Member = 0;
                allShopNum = allShopNum + 1;
                $('#allShopNum').text(allShopNum);
                $('#searchByCode').val("");
            },
            error: function () {
                /*   //添加商品

                     if (confirm("该商品不存在，需要新增")) {
                         $('#submit input').each(function () {
                             $(this).val('');
                         });
                         $('#AddGood').modal('show');
                     }*/

                //查询商品
                $('#searchLikeCode').val(code);
                $('#searchLikeCodeTable').bootstrapTable('destroy');
                $('#searchLikeCodeTable').bootstrapTable({
                    url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + code,
                    method: "POST",
                    onClickRow: function (row, $element) {
                        //响应点击事件
                        $('.info').removeClass('info');
                        $($element).addClass('info');
                        $('#searchByCode').val(row.CommodityCode);
                    },
                    onLoadSuccess: function (data) {
                        $("#table tbody tr").addClass("DynamicAdd");
                    }
                })
                $('#GoodSearch').modal('show');

            }
        });
    }

    //修改数量
    $(function () {
        $('#table').bootstrapTable({
            onClickRow: function (row, $element) {
                $('.info').removeClass('info');
                $($element).addClass('info');
                var aa = $element.children().eq(6);
                //现价
                var xj = $element.children().eq(5);
                //原来的小计
                var yxiaojie = aa.text();
                //原来数量
                var ylsl = $element.children().eq(4).text();
                r = $element.attr("data-index");
                $element.children().eq(4).editable({
                    type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
                    title: "num",              //编辑框的标题
                    disabled: false,             //是否禁用编辑
                    emptytext: "1",          //空值的默认文本
                    mode: "inline",              //编辑框的模式：支持popup和inline两种模式，默认是popup
                    showbuttons: false,
                    onblur:'submit',
                    validate: function (value) { //字段验证
                        if (!$.trim(value)) {
                            return '不能为空';
                        }
                        if ($.trim(value)) {
                            //修改小计和收款
                            var xiaojie = Number(Number(value) * Number(xj.text())).toFixed(2);
                            //aa.text(xiaojie);
                            var cy = xiaojie - Number(yxiaojie);
                            endmoney = Number(endmoney) + Number(cy);
                            allmoney = endmoney;
                            $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                            //修改总件数
                            allShopNum = Number(allShopNum) + Number(value) - Number(ylsl);
                            $('#allShopNum').text(allShopNum);

                            //更新数量和小计
                            var _data = {
                                "num": value, //要更新列的field
                                "money": xiaojie //要更新列的数据
                            }//更新表格数据
                            $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                            $("#table tbody tr").addClass("DynamicAdd");
                        }
                    }
                });

            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })
    });

    //标记相同会员只能输入一次会员
    var Member = 0;
    //上一个会员的折扣
    var old = 1;
    //添加会员
    $('#zomoreMemberNum').keydown(function (e) {
        var num = $("#zomoreMemberNum").val();
        var Member1 = num;
        if (e.keyCode == 13 && Member != Member1) {
            huicheUser();
        }
    });
    //添加会员方法
    function  huicheUser() {
        var num = $("#zomoreMemberNum").val();
        $("#memberNum").val(num);
        var Member1 = num;
        Member = Member1;
        //向后台动态获取会员信息，回到前台显示，
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreMember/searchByNum.do",
            data: {"num": num},
            success: function (msg) {
                if(msg!=null&&msg != ''){
                    //alert(JSON.stringify(msg));
                    //后面追加
                    //$("#table").bootstrapTable('append',msg);
                    $("#name").text(msg.memberMemberidname);
                    $("#money").text(msg.memberBalance);
                    $("#integral").text(msg.memberIntegral);
                    //根据会员的折扣，修改商品的折扣,现价，小计，收款
                    var index = 0;
                    $('#table>tbody>tr>td').each(function () {
                        //折扣
                        if (index == 3) {
                          //  $(this).text(old * 100);
                            $(this).text(msg.memberDiscount);
                        }
                        //现价
                        if (index == 5) {
                           // $(this).text($(this).text() / old);
                            var nm = $(this).text() * (msg.memberDiscount / 100);
                            $(this).text(nm.toFixed(2));
                        }
                        //小计
                        if (index == 6) {
                            //$(this).text($(this).text() / old);
                            var nm = $(this).text() * (msg.memberDiscount / 100);
                            $(this).text(nm.toFixed(2));
                        }
                        index++;
                        if (index == 7) {
                            index = 0;
                        }
                    });
                    old = (msg.memberDiscount / 100);
                    //修改付款金额
                    var test = parseFloat(allmoney * (msg.memberDiscount / 100)).toFixed(2);
                    $('#allmoney').text("￥:-" + test);
                    endmoney = test;
                }else {
                    $('#serchUser').val(num);
                    userback(num);
                }
            },
            error: function () {
                //modelJjb('确认交班', adduser);
                /* modalOne('该会员不存在，是否确认添加会员吗？', '输入会员/手机号', adduser);*/
                $('#serchUser').val(num);
                userback(num);
            }
        });
    }


    /*   键盘快捷键响应*/
    document.onkeydown = function (event) {
        var e = event || window.event || arguments.callee.caller.arguments[0];
        //按空格键触发(spaces)
        if (e && e.keyCode == 32) { // 按 空格键
            if (parseFloat(endmoney).toFixed(2) > 0) {

                var beforereturngoods = ${sessionScope.zomoreCashierBeforeRight.beforereturngoods}+"";
                if (beforereturngoods=='0'){
                    alert("该收银台没有退货的权限");
                    return false;
                }

                var conditynum = "";
                var condityname = "";
                //实收
                var condrealprice="";
                //折扣
                var discount="";
                //要做的事情
                var hf = $("#getmoney").attr("name") + "?money=-" + parseFloat(endmoney).toFixed(2);
                //1.会员
                var huiyuan = $("#name").text();
                //会员余额
                var yuer = $('#money').text();
                //会员号
                var memberNum = $("#zomoreMemberNum").val();
                hf = hf + "&huiyuan=" + huiyuan + "&yuer=" + yuer + "&memberNum=" + memberNum;

                //拼接销售单据
                //2.商品原总价
                //alert(allmoney);
                // hf=hf+"&allmoney="+allmoney;
                //3.单个商品名称  数组(aa,bb,cc)
                var index1 = 0;
                $('#table>tbody>tr>td').each(function () {
                    if (index1 == 1) {
                        condityname = condityname + $(this).text() + ","
                    }
                    index1++;
                    if (index1 == 7) {
                        index1 = 0;
                    }
                });
                condityname = condityname.substring(0, condityname.length - 1);
                // hf=hf+"&condityname="+condityname;
                //4.商品数量 数组（1,1,1）
                var index2 = 0;
                $('#table>tbody>tr>td').each(function () {
                    if (index2 == 4) {
                        conditynum = conditynum + $(this).text() + ","
                    }
                    index2++;
                    if (index2 == 7) {
                        index2 = 0;
                    }
                });
                conditynum = conditynum.substring(0, conditynum.length - 1);

                //4.商品实收 数组（1,1,1）
                var index3 = 0;
                $('#table>tbody>tr>td').each(function () {
                    if (index3 == 5) {
                        condrealprice = condrealprice + $(this).text() + ","
                    }
                    index3++;
                    if (index3 == 7) {
                        index3 = 0;
                    }
                });
                condrealprice = condrealprice.substring(0, condrealprice.length - 1);
                //  hf=hf+"&condityname="+condityname;

                //4.商品折扣 数组（1,1,1）
                var index4 = 0;
                $('#table>tbody>tr>td').each(function () {
                    if (index4 == 3) {
                        discount = discount + $(this).text() + ","
                    }
                    index4++;
                    if (index4 == 7) {
                        index4 = 0;
                    }
                });
                discount = discount.substring(0, discount.length - 1);

                //hf=hf+"&conditynum="+conditynum;
                //$(this).attr("href",hf);
                //保存销售单据
                $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreCommoditySale/add.do",
                    data: {
                        "zomoreCommoditySaleName": $('#cashierName').val()<%--"收银员"${sessionScope.cashierName}--%>,
                        "zomoreCommoditySaleInmoney": parseFloat(-endmoney).toFixed(2),
                        "zomoreCommoditySaleMember": huiyuan,
                        "zomoreCommoditySaleMoney": -allmoney,
                        "commoditNum": conditynum,
                        "commoditName": condityname,
                        "condrealprice":condrealprice,
                        "discount":discount
                    },
                    success: function (msg) {

                        $("#tuikuan").val(parseFloat(-endmoney).toFixed(2));
                        $("#zomoreCommoditySaleId").val(msg);
                        $('#closeWork').modal('show');
                        /*window.location.href = hf + "&id=" + msg+"&tk=1";*/
                    }
                });
            }
        }
        //挂单(Ctrl+G)
        if (e.keyCode == 71 && e.ctrlKey) {
            if (parseFloat(endmoney).toFixed(2) > 0) {
                //查询所有导购员，写入下拉列表
                $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreShoppingGuide/listAll.do",
                    success: function (msg) {
                        for (var i = 0; i < msg.length; i++) {
                            var aa = "<option value=" + msg[i].shoppingGuideId + ">" + msg[i].shoppingGuideName + "</option>";
                            $('#guide').append(aa);
                        }
                    },
                    error: function () {
                        alert("查找导购员失败");
                    }
                });
                $('#SelectService').modal('show');
                $('#guide>option').remove();
            } else {
                alert("您还没有选择商品");
            }
        }

        //查看挂单（Ctrl+Q）
        if (e.keyCode == 81 && e.ctrlKey) {
            window.location.href = "${basePath}zomoreCommoditySale/list2.do"
        }

    };

    //点击挂单时使用
  /*  function guadan() {
        //要做的事情
        var hf = $("#getmoney").attr("title") + "?money=" + parseFloat(-endmoney).toFixed(2);
        //拼接挂单单据
        //1.会员
        var huiyuan = $("#name").text();
        hf = hf + "&huiyuan=" + huiyuan;
        //2.商品原总价
        //alert(allmoney);
        // hf=hf+"&allmoney="+allmoney;
        //3.单个商品名称  数组(aa,bb,cc)
        var index1 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index1 == 1) {
                condityname = condityname + $(this).text() + ","
            }
            index1++;
            if (index1 == 7) {
                index1 = 0;
            }
        });
        condityname = condityname.substring(0, condityname.length - 1);
        // hf=hf+"&condityname="+condityname;
        //4.商品数量 数组（1,1,1）
        var index2 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index2 == 4) {
                conditynum = conditynum + $(this).text() + ","
            }
            index2++;
            if (index2 == 7) {
                index2 = 0;
            }
        });
        conditynum = conditynum.substring(0, conditynum.length - 1);
        //hf=hf+"&conditynum="+conditynum;
        //$(this).attr("href",hf);
        //保存挂单单据
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/add.do",
            data: {
                "zomoreCommoditySaleName": $('#cashierName').val()<%--"收银员"${sessionScope.cashierName}--%>,
                "zomoreCommoditySaleInmoney": parseFloat(-endmoney).toFixed(2),
                "zomoreCommoditySaleMember": huiyuan,
                "zomoreCommoditySaleMoney": -allmoney,
                "commoditNum": conditynum,
                "commoditName": condityname,
                "state": 2,
                "zomoreCommoditySaleGuide": $("#guide option:checked").text(),
                "zomoreCommodityMeno": $('#meno').val(),
                "zomoreCommodityGuadannum": $('#band').val()
            },
            success: function (msg) {
                window.location.href = "${basePath}reception/index.jsp"
            },
            error: function () {
                alert("挂单失败");
            }
        });
    }*/

    //点击退款
    $('#getmoney').click(function () {
        if (parseFloat(endmoney).toFixed(2) > 0) {

            var beforereturngoods = ${sessionScope.zomoreCashierBeforeRight.beforereturngoods}+"";
            if (beforereturngoods=='0'){
                alert("该收银台没有退货的权限");
                return false;
            }

            var conditynum = "";
            var condityname = "";
            //实收
            var condrealprice="";
            //折扣
            var discount="";
            //要做的事情
            var hf = $("#getmoney").attr("name") + "?money=-" + parseFloat(endmoney).toFixed(2);
            //1.会员
            var huiyuan = $("#name").text();
            //会员余额
            var yuer = $('#money').text();
            //会员号
            var memberNum = $("#zomoreMemberNum").val();
            hf = hf + "&huiyuan=" + huiyuan + "&yuer=" + yuer + "&memberNum=" + memberNum;

            //拼接销售单据
            //2.商品原总价
            //alert(allmoney);
            // hf=hf+"&allmoney="+allmoney;
            //3.单个商品名称  数组(aa,bb,cc)
            var index1 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index1 == 1) {
                    condityname = condityname + $(this).text() + ","
                }
                index1++;
                if (index1 == 7) {
                    index1 = 0;
                }
            });
            condityname = condityname.substring(0, condityname.length - 1);
            // hf=hf+"&condityname="+condityname;
            //4.商品数量 数组（1,1,1）
            var index2 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index2 == 4) {
                    conditynum = conditynum + $(this).text() + ","
                }
                index2++;
                if (index2 == 7) {
                    index2 = 0;
                }
            });
            conditynum = conditynum.substring(0, conditynum.length - 1);

            //4.商品实收 数组（1,1,1）
            var index3 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index3 == 5) {
                    condrealprice = condrealprice + $(this).text() + ","
                }
                index3++;
                if (index3 == 7) {
                    index3 = 0;
                }
            });
            condrealprice = condrealprice.substring(0, condrealprice.length - 1);
            //  hf=hf+"&condityname="+condityname;

            //4.商品折扣 数组（1,1,1）
            var index4 = 0;
            $('#table>tbody>tr>td').each(function () {
                if (index4 == 3) {
                    discount = discount + $(this).text() + ","
                }
                index4++;
                if (index4 == 7) {
                    index4 = 0;
                }
            });
            discount = discount.substring(0, discount.length - 1);

            //hf=hf+"&conditynum="+conditynum;
            //$(this).attr("href",hf);
            //保存销售单据
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/add.do",
                data: {
                    "zomoreCommoditySaleName": $('#cashierName').val()<%--"收银员"${sessionScope.cashierName}--%>,
                    "zomoreCommoditySaleInmoney": parseFloat(-endmoney).toFixed(2),
                    "zomoreCommoditySaleMember": huiyuan,
                    "zomoreCommoditySaleMoney": -allmoney,
                    "commoditNum": conditynum,
                    "commoditName": condityname,
                    "condrealprice":condrealprice,
                    "discount":discount
                },
                success: function (msg) {

                    $("#tuikuan").val(parseFloat(-endmoney).toFixed(2));
					$("#zomoreCommoditySaleId").val(msg);
                    $('#closeWork').modal('show');
                    /*window.location.href = hf + "&id=" + msg+"&tk=1";*/
                }
            });
        }
        //$(this).attr("href",hf);
    });

    $('.modal3').on('click', function () {
        modelalert('你没有无码收银的权限');
    })
    $('.modal1').on('click', function () {
        modalOne('商品关键字', '输入关键字', sureback);
    })




    $('.modal4').on('click', function () {
        window.location.href = "${basePath}zomoreMember/insertMember.do"
    })

    /*  $('.modal4').on('click', function () {
          modalOne('会员关键字', '输入会员/手机号', userback);
      })*/
    function sureback(id) {
        if (id == '' || id == undefined) {
            modelalert('请输入值');
        } else {
            console.log("执行下一个");
            $('#searchLikeCode').val(id);
            $('#searchLikeCodeTable').bootstrapTable('destroy');
            $('#searchLikeCodeTable').bootstrapTable({
                url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + id,
                method: "POST",
                onClickRow: function (row, $element) {
                    //响应点击事件
                    $('.info').removeClass('info');
                    $($element).addClass('info');
                    $('#searchByCode').val(row.CommodityCode);
                },
                onLoadSuccess: function (data) {
                    $("#searchLikeCodeTable tbody tr").addClass("DynamicAdd");
                }
            })
            modalclose(id);
            $('#GoodSearch').modal('show');
        }
    };
    //会员模糊查询
    function userback(id) {
        if (id == '' || id == undefined) {
            modelalert('请输入会员/手机号');
        } else {
            //console.log("执行下一个");
            // 这里可以用AJAX取值,将取到的值给新窗口过去
            //模糊查询会员信息
            $('#usertable').bootstrapTable('destroy');
            $('#usertable').bootstrapTable({
                url: "${basePath}zomoreMember/searchLikeMember.do?Member=" + id,
                method: "POST",
                onClickRow: function (row, $element) {
                    //响应点击事件
                    /*alert(row);*/
                    $('.info').removeClass('info');
                    $($element).addClass('info');
                    $('#zomoreMemberNum').val(row.memberNumber);
                    $("#memberNum").val(row.memberNumber);
                },
                onLoadSuccess: function (data) {
                    //不选会员直接确认的，默认第一个
                    if(data!=null&&data.length>0){
                        $('#zomoreMemberNum').val(data[0].memberNumber);
                        $("#memberNum").val(data[0].memberNumber);
                        huicheUser
                    }
                    $("#usertable tbody tr").addClass("DynamicAdd");
                }
            });
            // modalclose(id);
            $('#UserSearch').modal('show');
        }
    };
    // 些处新增会员页面
    $('.adduser').on('click', function () {
        modalOne('会员关键字', '输入会员/手机号', adduser);
    })

    function adduser(id) {
        window.location.href = "${basePath}reception/adduser.jsp?num=" + id;
    }

    $(function () {
        $('#table').bootstrapTable({
            // method:"get",
            // url:"xxx",//这里你把添加的数据用JSON返回的地址，明白意思不？
            // striped:true,
            // columns:[
            //     {
            //         filed:"",
            //         title:""
            //     }
            // ],
            onClickRow: function (row, $element) {
                $('.info').removeClass('info');
                $($element).addClass('info');

                //在这里修改数量
                /* alert(row.num);*/

            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })
    });

    //整单删除
    function DeletedAll() {
        $("#table").bootstrapTable('removeAll');
        endmoney = 0;
        allmoney = 0;
        conditynum = "";
        condityname = "";
        $('#allShopNum').text(0);
        allShopNum = 0
        //修改显示的收款金额
        $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
    }
    //删除
    function Deleted() {
        var rows = $('.info').attr("data-index");
        var aaa = "data-index='" + rows + "'";

        //获取选择行的id
        var id = $('tr[' + aaa + ']');
        var ids = [];//定义一个数组
        ids.push($(id).children("td:first-child").html());//将要删除的id存入数组

        allShopNum = $('#allShopNum').text() * 1 + $(id).children("td:eq(4)").text() * 1;
        $('#allShopNum').text(allShopNum);
        $("#table").bootstrapTable('remove', {field: 'id', values: ids});//field:根据field的值来判断要删除的行  values：删除行所对应的值
        //定义你自己的修改事件
        //修改金额
        var lessmoney = $(id).children("td:eq(6)").text();
        endmoney =  Number(endmoney) + Number(lessmoney);
        allmoney = Number(allmoney) + Number(lessmoney);
        //修改显示的收款金额
        $('#allmoney').text("￥:-" + parseFloat(endmoney).toFixed(2));
        //修改订单商品(*未完成)
        //conditynum
        //condityname
        conditynum.del(row);
        condityname.del(row);

        $("#table tbody tr").addClass("DynamicAdd");

    }


    $(document).ready(function () {
        var menu = new BootstrapMenu('.DynamicAdd', {
            fetchElementData: function ($rowElem) {
                var data = $($rowElem).attr('data-index');

                return data;
            },

            actionsGroups: [

                ['editDescription'],
                ['deleteRow']

            ],

            actions: {
                addDescription: {
                    name: '<font size=3>详细</font>',
                    iconClass: 'fa-plus',
                    onClick: function (row) {
                        alert(row);//添加右击事件

                        //定义你自己的添加事件
                    },
                    isEnabled: function (row) {
                        return row.isEditable;
                    }
                },
                editDescription: {
                    name: '<font size=3>删除</font>',
                    iconClass: 'fa-trash',
                    onClick: function (row) {   //修改右击事件
                        //alert(row);
                        var aaa = "data-index='" + row + "'";
                        //获取选择行的id
                        var id = $('tr[' + aaa + ']');
                        var ids = [];//定义一个数组
                        ids.push($(id).children("td:first-child").text());//将要删除的id存入数组
                        allShopNum = $('#allShopNum').text() * 1 - $(id).children("td:eq(4)").text() * 1;
                        $('#allShopNum').text(allShopNum);
                        /*$('#allShopNum').text( $('#allShopNum').text()*1-$(id).children("td:eq(4)").text()*1);
                        */
                        $("#table").bootstrapTable('remove', {field: 'id', values: ids});//field:根据field的值来判断要删除的行  values：删除行所对应的值
                        //定义你自己的修改事件
                        //修改金额
                        var lessmoney = $(id).children("td:eq(6)").text();
                        endmoney = endmoney - lessmoney;
                        allmoney = allmoney - lessmoney;
                        //修改显示的收款金额
                        $('#allmoney').text("￥:" + parseFloat(endmoney).toFixed(2));
                        //修改订单商品(*未完成)
                        //conditynum
                        // condityname
                        conditynum.del(row);
                        condityname.del(row);
                        $("#table tbody tr").addClass("DynamicAdd");
                    },
                    isEnabled: function (row) {
                        return row.isEditable;
                    }
                },

                deleteRow: {
                    name: '<font size=3>清空</font>',
                    iconClass: 'fa-trash',
                    onClick: function (row) {  //删除右击事件
                        // alert(row);
                        //定义你自己的删除事件
                        $("#table").bootstrapTable('removeAll');
                        endmoney = 0;
                        allmoney = 0;
                        conditynum = "";
                        condityname = "";
                        $('#allShopNum').text(0);
                        allShopNum = 0;
                        //修改显示的收款金额
                        $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                    },
                    isEnabled: function (row) {
                        return row.isEditable && row.isRemovable;
                    }
                }
            }
        });
    });
    //点击添加商品
    $('.add').on('click', function () {
        $('#AddGood').modal('show');
    })
    //确定添加商品
    $('#addCommody').click(function () {
        var data = $('#submit').serializeArray();
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/add1.do",
            data: data,
            success: function (msg) {
                $('#AddGood').modal('hide');
                $('#submit input').val("");
            }
        });
    });
    //生成编号
    $('#createId').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/getId.do",
            success: function (msg) {
                $('#zomoreCommodityCode').val(msg);
            }
        });
    });

    $(".vertical-spin").TouchSpin({
        verticalbuttons: true,
        verticalupclass: 'fa  fa-plus',
        verticaldownclass: 'fa  fa-minus'
    });
    var vspinTrue = $(".vertical-spin").TouchSpin({
        verticalbuttons: true
    });
    if (vspinTrue) {
        $('.vertical-spin').prev('.bootstrap-touchspin-prefix').remove();
    }


    $('#AddGood .togglezt').toggles({
        on: true, text: {
            on: '启用', // text for the ON position
            off: '禁用' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });
    $('#AddGood .toggleprice').toggles({
        on: true, text: {
            on: '会员折扣', // text for the ON position
            off: '会员价' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });

    $('#AddGood .toggleprice').on('toggle', function (e, active) {
        if (active) {
            $('.tps').hide()
        } else {
            $('.tps').show()
        }
    });
    //展开更多操作
    $('.fben').on('click', function () {
        if ($('.addgoodshide').is(':hidden')) {

            $('.addgoodshide').show();
            $(this).html('收起');

            var m_top = ($(window).height() - $('#AddGood .modal-dialog').height()) / 2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});

        } else {
            $('.addgoodshide').hide();
            $(this).html('展开更多');
            var m_top = ($(window).height() - $('#AddGood .modal-dialog').height()) / 2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});
        }
    })
    //查询商品
    $('#searchLikeCode1').click(function () {
        searchCondity();
    });
    //回车查询商品
    $('#searchLikeCode').keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            searchCondity()
        }
    });
    function searchCondity() {
        var likecode = $('#searchLikeCode').val();
        $('#searchLikeCodeTable').bootstrapTable('destroy');
        $('#searchLikeCodeTable').bootstrapTable({
            url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + likecode,
            method: "POST",
            onClickRow: function (row, $element) {
                //响应点击事件
                $('.info').removeClass('info');
                $($element).addClass('info');
                $('#searchByCode').val(row.CommodityCode);
            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })

    }

    //点击搜索，模糊查找会员
    $('#serchUser1').click(function () {
        var user = $('#serchUser').val();
        $('#usertable').bootstrapTable('destroy');
        $('#usertable').bootstrapTable({
            url: "${basePath}zomoreMember/searchLikeMember.do?Member=" + user,
            method: "POST",
            onClickRow: function (row, $element) {
                /*    //响应点击事件
                    alert(row);*/
                $('.info').removeClass('info');
                $($element).addClass('info');
                $('#zomoreMemberNum').val(row.memberNumber);
                $('#memberNum').val(row.memberNumber);
            },
            onLoadSuccess: function (data) {
                if(data!=null&&data!=''){
                    $('#zomoreMemberNum').val(data[0].memberNumber);
                    $('#memberNum').val(data[0].memberNumber);
                }
                $("#usertable tbody tr").addClass("DynamicAdd");

            }
        })
    });
    //加入会员
    function inputUser() {
        huicheUser();
        $('#UserSearch').modal('hide');
    }
    //加入商品
    $('#inputCommodity').click(function () {
        huiche();
        $('#GoodSearch').modal('hide');
    });
    setTimeout("StoreWarmming()", 100);

    //库存预警
    function StoreWarmming() {
        if ($('#items').val() != '') {
            var msg = "您有" + $('#itemssize').val() + "件商品库存不足，马上订货？";
            if (window.confirm(msg)) {
                // window.location.href = "${basePath}reception/dinghuo.jsp";
            }
        }
    }

    //点击会员充值
    $("#cz").click(function () {
        if ($("#name").text() != '会员') {
            window.location.href = "${basePath}zomoreMemberInputrule/cz.do?memberNum=" + $("#zomoreMemberNum").val();
        } else {
            alert("请输入会员号!^-^!");
        }

    });
    //点击查看会员
    $("#showUser").click(function () {
        if ($("#name").text() != '会员') {
            window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
        } else {
            alert("请输入会员号!^-^!");
        }
    });
    //点击积分兑换
    $("#jifenduihuan").click(function () {
        if ($("#name").text() != '会员') {
            window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
        } else {
            alert("请输入会员号!^-^!");
        }
    });

</script>
</body>
</html>
