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
		<title>订货</title>
		<link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
		<link href="${basePath}css/icon.css" rel="stylesheet" />
		<link href="${basePath}css/commons.css" rel="stylesheet" />
		<!-- 引用阿里图标样式 -->
		<link href="${basePath}css/iconfont.css" rel="stylesheet" />
		<!-- 引用按钮样式 -->
		<link href="${basePath}css/components.css" rel="stylesheet" />
		<!-- 引入表格的样式  -->
		<link href="${basePath}css/bootstrap-table.min.css" rel="stylesheet"/>
		<!-- 引入时间选择插件 -->
		<link href="${basePath}css/bootstrap-datepicker.min.css" rel="stylesheet" />
		<!-- 引入jquery的JS -->
		<script src="${basePath}js/jquery.min.js"></script>
		 <script src="${basePath}js/bootstrap.min.js"></script>
		 <!-- 引入时间的JS -->
		 <script src="${basePath}js/bootstrap-datepicker.js"></script>
		 <script src="${basePath}js/bootstrap-datepicker.zh-cn.js"></script>
		 <!-- 引用表格的JS -->
		 <script src="${basePath}js/bootstrap-table.min.js"></script>
		 <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
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
			.title .btn-user{margin-right: 100px; }
			
			
		</style>
		
	</head>
	<body>
				<header class="header com-bj">
			<a href="index.html">
			<div class="close">
				<i class="fa  fa-mail-reply"></i>
			</div>
			</a>
			<div class="title" >订货
			<a class="btn btn-default btn-user btns">新建订单</a>
			</div>
			<div class="titles">
				
				<div class="xsdj-search">
					<div class="xsdj-search-top">
						
						<div class="input-group ">
						 
						 </div>
					</div>
				</div>
			</div>
			<div class="logo">
				<i class="fa  fa-gears"></i>设置
			</div>
		</header>
		<!-- 中间区域 -->
		<div class="xsdj-main">
			<!-- 左边部分 -->
			<div class="xsdj-left col-lg-2 col-md-3">
				<div class="xsdj-left-title">
					订单列表 
				</div>
				<div class="media">
                  <div class="media-left media-middle">
	              <i class="fa  fa-money media-object" ></i>
    
                </div>
  <div class="media-body">
	  <p>214561324654987 <span class="price">--</span></p>
   
    <p>牌号：1001 <span style="float: right;">03-17  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11:31</span></p>
  </div>
</div>

<div class="media active">
  <div class="media-left media-middle">
	  <i class="fa  fa-money media-object" ></i>
    
  </div>
  <div class="media-body">
	  <p>214561324654987 <span class="price">--</span></p>
   
    <p>牌号：1001 <span style="float: right;">03-17  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11:31</span></p>
  </div>
</div>

				
			</div>
			<!-- 左边部分结束 -->
			<!-- 右边部分 -->
			<div class="xsdj-right col-lg-10 col-md-9">
				<!-- 右边table -->
				<div class="xsdj-table">
					<table id="table" data-resizable="true">
					  <thead>
					    <tr>
					       <th data-field="id">商品条码</th> 
					      <th data-field="price">商品名称</th> 
					      <th data-field="id">货号</th> 
						  <th data-field="price">订价</th> 
					      <th data-field="price">数量</th>					      
					    </tr>
					  </thead>
					</table>
				</div>
				<!-- 右边Table结束 -->
				<!-- 右边地址栏 -->
				<div class="xsdj-right-f2">
					<div class="col-sm-6 col-lg-6 col-md-6 ">
						<ul class="list-group">
							<li class="list-group-item">
								备注：无
							</li>
							<li class="list-group-item">
								货流信息：
							</li>
						</ul>
					</div>
					<div class="col-sm-6 col-lg-6 col-md-6 ">
						<ul class="list-group">
							<li class="list-group-item">
								共调货<a>100</a>件
							</li>
							
						</ul>
					</div>
				</div>
				<!-- 右边底部 -->
				<div class="xsdj-right-footer">
					
						<button class="btn btn-warning btn-lg">作废</button>
						<button class="btn btn-success btn-lg" id="dy">打印</button>
						<button class="btn btn-success btn-lg" id="dy">复用订单</button>
						<button class="btn btn-success btn-lg" id="dy">再次下单</button>
					
					
				</div>
			</div>
			<!-- 右边部分结束 -->
		</div>
		
		
		<!-- 中间区域结束 -->
		
		<!-- 右边的设置 -->
		<div class="right-menu">
			<div class="right-menu-close">
				<i class="iconfont icon-x "></i>
			</div>
			<div class="right-menu-body">
				一些文字提示内容，看你怎么去弄，或者去处理
			</div>
		</div>
		
		<script>
			var curDate = new Date();
			var nextDate = new Date(curDate.getTime() + 24*60*60*1000); 
			$('#date1').datepicker({
        language:  "zh-CN",
		format: "yyyy-mm-dd",
        todayHighlight: true,
         });
		$('#date1').datepicker('setDate', new Date());
		$('#date2').datepicker({
		language:  "zh-CN",
		format: "yyyy-mm-dd",
		});
		$('#date2').datepicker('setDate',nextDate);
		$('.btns').on('click',function(){
			$('.title').hide();
			$('.titles').show();
		})
		$('#xsdj-close').on('click',function(){
			$('.title').show();
			$('.titles').hide();
		})
		// 右边设置
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
		$(function() {
		    $('#table').bootstrapTable({
				url:'json/data1.json',
				method: "get",
				onClickRow:function (row,$element) {
		                    $('.info').removeClass('info');
		                    $($element).addClass('info');
							modelPrint('请选择XX商品进行补打发票或者退货的操作','退货',test1,test2);
		                },
		onLoadSuccess: function(data){   
			
			$("#table tbody tr").addClass("DynamicAdd");
		         
			
		    
		}
		
			})
		  });
		  $('#tf').on('click',function(){
			  modelalert('请选中右边的商品在进行操作');
		  })
		  $('#dy').on('click',function(){
			  modelPrint('确认打印订单!','打印',test1,test2);
		  });
		  function test1(){
			  
		  }
		  function test2(){
		  			  
		  }
		</script>
	</body>
</html>
