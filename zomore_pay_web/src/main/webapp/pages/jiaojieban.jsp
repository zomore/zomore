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
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>择沐收银台</title>
		<link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
		<link href="${basePath}css/icon.css" rel="stylesheet" />
		<link href="${basePath}css/commons.css" rel="stylesheet" />
		<!-- 引用按钮样式 -->
		<link href="${basePath}css/components.css" rel="stylesheet" />
		<!-- 引用键盘 -->
		
		<link href="${basePath}css/keyword/keyboard.css" rel="stylesheet" />
		<!-- 引用全局JS -->
        <script src="${basePath}js/jquery.min.js"></script>
        <script src="${basePath}js/bootstrap.min.js"></script>
		<!-- 引用键盘的JS -->
        <script src="${basePath}js/keyword/jquery.slimscroll.min.js"></script>
        <script src="${basePath}js/keyword/chinese-pynsimpl.js"></script>
        <!-- 引用系统提示插件 -->
		<script src="${basePath}js/alert.js"></script>
		
	</head>
	<body>
		<header class="header com-bj">
			<div class="close" onclick="window.close()">
				<i class="fa fa-close"></i>
			</div>
			<div class="title">
				${sessionScope.shopName}交接班
			</div>
		</header>
		<div class="main">
			<div class="col-lg-6 col-xs-12 col-md-8 col-sm-7">
				<div class="panel">
					<form class="form-horizontal" role="form">
					<div class="panel-body">
						<div class="row">
							<div class="col-sm-2">
						      <h4>收银台:</h4>
						    </div>
							<div class="col-sm-10">
						      <h4>${sessionScope.cashierNumber}</h4>
						    </div>
						</div>
						<div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
						<div class="row">
							<div class="col-sm-3">
						      <h4>交接班时间:</h4>
						    </div>
							<div class="col-sm-9">
						      <h4>${requestScope.map.startTime}/${requestScope.map.endTime}</h4>
						    </div>
						</div>
						<div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
						<div class="row">
							<div class="col-sm-3">
						      <h4>交接班地址:</h4>
						    </div>
							<div class="col-sm-9">
						      <h4>${requestScope.map.address}</h4>
						    </div>
						</div>
						<div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
						<div class="row">
							<div class="col-sm-6">
						      <div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>应有现金:</th> 
		      			        <th><a>￥${requestScope.map.cash}</a></th>
		      			       </tr> 
		      			       <tr> 
		      			        <th>店内订单现金收款:</th> 
		       			       <th><a>￥${requestScope.map.cashSum}</a></th>
		       			      </tr>
		      			      </thead> 
		    			       </table> 
		   			       </div> 
		   			      </div> 
		   			      <div class="col-sm-6">
								<div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>总销售额:</th> 
		      			        <th><a>￥${requestScope.map.sum}</a></th>
		      			       </tr> 
		      			       <tr> 
		      			        <th>收银台销售额:</th> 
		       			       <th><a>￥${requestScope.map.cashierSum}</a></th>
		       			      </tr>
		      			      </thead> 
		    			       </table> 
		   			      </div> 
						    </div>
						</div>
												<div class="row">
							<div class="col-sm-6">
						      <div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>会员充值:</th> 
		      			        <th><a>￥${requestScope.map.memberSum}</a></th>
		      			       </tr> 
		      			       <tr> 
		      			        <th>现金充值:</th> 
		       			       <th><a>￥${requestScope.map.memberCash}</a></th>
		       			      </tr>
		      			      </thead> 
		    			       </table> 
		   			       </div> 
		   			      </div> 
		   			      <div class="col-sm-6">
								<div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>总单据数:</th> 
		      			        <th><a>${requestScope.map.count}</a></th>
		      			       </tr> 
		      			       <tr> 
		      			        <th>正常单数:</th> 
		       			       <th><a>${requestScope.map.rightCount}</a></th>
		       			      </tr>
		      			      </thead> 
		    			       </table> 
		   			      </div> 
						    </div>
						</div>
						<div class="row">
							<div class="col-sm-6">
						      <div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>挂单统计:</th> 
		      			        <th><a>${requestScope.map.gudanNum}笔单据</a></th>
		      			       </tr> 
		      			       <tr> 
		      			        <th>未收银单据</th> 
		       			       <th><a>${requestScope.map.nopayCount}笔单据</a></th>
		       			      </tr>
		      			      </thead> 
		    			       </table> 
		   			       </div> 
		   			      </div> 
		   			      <div class="col-sm-6">
								<div class="table-fex"> 
		     			      <table id="datatable-buttons" class="table  table-bordered table-striped"> 
		     			       <thead> 
		     			        <tr> 
		      			        <th>促销统计:</th> 
		      			        <th><a>0</a></th>
		      			       </tr> 
		      			      </thead> 
		    			       </table> 
		   			      </div> 
						    </div>
						</div>
					</div>
					
					<div class="panel-footer">
						<a  class="btn btn-info" href="${basePath}zomoreTurnover/changePeople.do" style="width: 100%;">交接班并登出</a></br>
					</div>
					</form>		
				</div>

			</div>
		</div>
		<div class="login-footer">
			<i class="fa  fa-keyboard-o"></i>
		</div>
		<script src="js/page/login.js"></script>
		<!-- 封装键盘插件必须在最下面 -->
		<script src="js/keyword.js"></script>
	</body>
</html>
