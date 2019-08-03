<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>调货</title>
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
		<!-- 引用表格后键菜单的JS -->
		<script src="${basePath}js/BootstrapMenu.min.js"></script>
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
			.title .btn-user{margin-right: 100px; }
		</style>
	</head>
	<body>
		<header class="header com-bj">
		<%--	<a href="${basePath}reception/list.do">--%>
			<a href="#" onclick="javascript :history.back(-1);">
			<div class="close">
				<i class="fa  fa-mail-reply"></i>
			</div>
			</a>
			<div class="title" >调货
			<a class="btn btn-default btn-user btns">打印条码</a>
			</div>
			<div class="titles">
				
				<div class="xsdj-search">
					<div class="xsdj-search-top">
						
						<div class="input-group ">
						 <input type="email"  name="group2" class="form-control" placeholder="输入单据号/牌号/会员号进行搜索">
						     <span class="input-group-btn">
						     <button type="button" class="btn  btn-warning">搜索</button>
						     </span>
						 </div>
					</div>
				</div>
			</div>
			<div class="logo">
				<i class="fa  fa-gears"></i>设置
			</div>
		</header>
		<!-- 主界面内容 -->
		<div class="index-main">
			<table id="table" data-resizable="true">
			  <thead>
			    <tr>
			       <th data-field="id">商品条码</th> 
			      <th data-field="name">商品名称</th> 
			      <th data-field="id">货号</th> 
			      <th data-field="price">分类</th> 
			      <th data-field="price">进货价</th>
			      <th data-field="price">零售价</th>
			      <th data-field="price">供货商</th>
			      <th data-field="price">进货数量</th>
			      <th data-field="price">小计</th> 
			    </tr>
			  </thead>
			</table>
		</div>
		<!-- 主界面底部 -->
		<div class="index-footer"> 
		 <div class="f-top f-top-bj">
		 </div> 
		 <div class="f-bottom f-bottom-bj"> 
		  <div class="col-sm-4 col-lg-3"> 
		   <div class="panel pan2"> 
		    <div class="input-group m-t-10" style="width: 100%"> 
		     <input type="email" id="example-input2-group1" name="example-input2-group1" class="form-control"  style="width: 90%;height: 100px;"placeholder="条码/拼音码/名称" /> <h4>扫码模式</h4>
		    </div>
		   </div> 
		  </div> 
		  <div class="col-sm-4 col-lg-3 "> 
		   <div class="panel pan2"> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4>0</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4>0</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4>清空</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <h4>总入库</h4> 
		    </div> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <h4>总进价</h4> 
		    </div> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <a><h4>删除</h4> </a>
		    </div> 
		   </div> 
		  </div> 
		  <div class="col-sm-4 col-lg-3" style="float: right;" > 
		   <div class="panel p-red"> 
		   <a href="sk.html">
		    <div class="left" style="width: 100%; background: #469547 !important"> 
		     <div class="p-right" style="width: 80%">
		       <h5 style="font-size: 60px;text-align: center;margin-left: 30%;">提 交</h5>
		     </div> 
		    </div> 
			</a>
		   </div> 
		  </div> 
		 </div> 
		</div> 
		<!-- 这里是商品关键字搜索结果，没有封装，考虑后端数据的读取 -->
		<div class="modal fade  " id="GoodSearch" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> 
		 <div class="modal-dialog"> 
		  <div class="modal-content"> 
		   <div class="modal-header com-bj"> 
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> 
		    <h4 class="modal-title" id="myModalLabel"> 选择商品 </h4> 
		   </div> 
		   <div class="modal-body"> 
		    <div class="search"> 
		     <div class="input-group m-t-10 p-10"> 
		      <span class="input-group-btn"> <span class="btn  btn-primary search-icon"><i class="fa fa-search"></i></span> </span> 
		      <input type="email" id="example-input2-group2" name="example-input2-group2" class="form-control" placeholder="按条形码/拼音码/品名搜索" /> 
		      <span class="input-group-btn"> <button type="button" class="btn btn-info">搜索</button> </span> 
		     </div> 
		    </div> 
		    <div class="table-fex"> 
			
		     <table id="datatable-buttons" class="table  table-bordered "> 
		      <thead> 
		       <tr> 
		        <th>商品条码</th> 
		        <th>商品名称</th> 
		        <th>规格</th> 
		        <th>价格</th> 
		        <th>货号</th> 
		       </tr> 
		      </thead> 
		      <tbody class="search-list"> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		       <tr> 
		        <td>432432412679812</td> 
		        <td>商品名称</td> 
		        <td></td> 
		        <td>0.01</td> 
		        <td>4561</td> 
		       </tr> 
		      </tbody> 
		     </table> 
		    </div> 
		   </div> 
		   <div class="modal-footer"> 
		    <div class="col-lg-8">
		      没有找到配对的件，请重新输入关键字 
		    </div> 
		    <div class="col-lg-4"> 
		     <button type="button" class="btn btn-pink  " data-dismiss="modal">取消 </button> 
		     <button type="button" class="btn btn-success "> 加入 </button> 
		    </div> 
		   </div> 
		  </div> 
		 </div> 
		</div> 
		
		<!-- 这里是会员关键字搜索结果，没有封装，考虑后端数据的读取 -->
		
		<div class="modal fade  " id="UserSearch" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> 
		 <div class="modal-dialog"> 
		  <div class="modal-content"> 
		   <div class="modal-header com-bj"> 
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> 
		    <h4 class="modal-title" id="myModalLabel"> 会员查询 </h4> 
		   </div> 
		   <div class="modal-body"> 
		    <div class="search"> 
		     <div class="input-group m-t-10 p-10"> 
		   
		      <input type="email" id="example-input2-group2" name="example-input2-group2" class="form-control" placeholder="输入卡号/手机号/会员账号" /> 
		      <span class="input-group-btn"> <button type="button" class="btn btn-info">搜索</button> </span> 
		     </div> 
		    </div> 
		    <div class="table-fex"> 
			
		     <table id="datatable-buttons" class="table  table-bordered "> 
		      <thead> 
		       <tr> 
		        <th>卡号</th> 
		        <th>姓名</th> 
		        <th>手机</th> 
		        <th>积分</th> 
		        <th>余额</th>
		         <th>折扣</th> 
		       </tr> 
		      </thead> 
		      <tbody class="search-list"> 
		       <tr> 
		        <td>2321</td> 
		       <td>测试</td> 
		       <td>1338898897</td> 
		       <td>2453</td> 
		       <td>450.2</td> 
		       <td>3折</td> 
		       </tr> 
		       <tr> 
		        <td>2321</td> 
		       <td>测试</td> 
		       <td>1338898897</td> 
		       <td>2453</td> 
		       <td>450.2</td> 
		       <td>3折</td> 
		       </tr> 
		       <tr> 
		        <td>2321</td> 
		       <td>测试</td> 
		       <td>1338898897</td> 
		       <td>2453</td> 
		       <td>450.2</td> 
		       <td>3折</td> 
		       </tr> 
		      </tbody> 
		     </table> 
		    </div> 
		   </div> 
		   <div class="modal-footer"> 
		    <div class="col-lg-8">
		      没有找到配对的件，请重新输入关键字 
		    </div> 
		    <div class="col-lg-4"> 
		     <button type="button" class="btn btn-pink  " data-dismiss="modal">取消 </button> 
		     <button type="button" class="btn btn-success "> 加入 </button> 
		    </div> 
		   </div> 
		  </div> 
		 </div> 
		</div>
		<!-- 交接班部分 -->
		
		<div class="modal fade  " id="closeWork" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel6" aria-hidden="true"> 
		 <div class="modal-dialog "> 
		  <div class="modal-content"> 
		   <div class="modal-header com-bj "> 
		    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> 
		    <h4 class="modal-title" id="myModalLabel6"> 请输入现金 
		     </h4> 
		   </div> 
		   <div class="modal-body"> 
		   <div class="input-group " style="width: 100%;"> 
		    <input type="text" id="example-input2-group1" name="example-input2-group1" class="form-control " autofocus="autofocus"  /> 
		    
		   </div> 
		    <div class="numbers " style="display: block;"> 
		    <ul> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4 ">1</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">2</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">3</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">4</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">5</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">6</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">7</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">8</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">9</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">.</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">0</li> 
		     <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 numback4"><i class="fa  fa-mail-reply"></i></li> 
		    </ul> 
		   </div> 
		   </div> 
		   <div class="modal-footer"> 
			 <button type="button" class="btn btn-success btn-block btn-lg" data-dismiss="modal">确定 </button>
		   
		   </div> 
		  </div> 
		 </div> 
		</div>
		
		<script src="${basePath}js/modal-one.js"></script>
		<script>
			
			$('.modal3').on('click',function(){
				modelalert('你没有无码收银的权限');
			})
			$('.modal1').on('click',function(){
				modalOne('商品关键字','输入关键字',sureback);
			})
			$('.modal4').on('click',function(){
				modalOne('会员关键字','输入会员/手机号',userback);
			})
			$('.jqb').on('click',function(){
				modelJjb('确认交班',closework);
				
			})
			
			// 交接班
			function closework(){
				console.log("我要交接班");
				$('#closeWork').modal('show');
			}
			function sureback(id){
				
				if(id==''||id==undefined){
					modelalert('请输入值');
				}else{
					console.log("执行下一个");
					// 这里可以用AJAX取值,将取到的值给新窗口过去
					modalclose();
					$('#GoodSearch').modal('show');
				}
			};
			
			function userback(id){
				
				if(id==''||id==undefined){
					modelalert('请输入会员/手机号');
				}else{
					console.log("执行下一个");
					// 这里可以用AJAX取值,将取到的值给新窗口过去
					modalclose();
					$('#UserSearch').modal('show');
				}
			};
			// 些处新增会页面
			$('.adduser').on('click',function(){
				modalOne('会员关键字','输入会员/手机号',adduser);
			})
			function adduser(id){
				window.location.href="adduser.html";
			}
			
			$(function() {
			    $('#table').bootstrapTable({
					url:'json/data1.json',
					method: "get",
					onClickRow:function (row,$element) {
			                    $('.info').removeClass('info');
			                    $($element).addClass('info');
			                },
			onLoadSuccess: function(data){   
				
				$("#table tbody tr").addClass("DynamicAdd");
			         
				
			    
			}
			
				})
			  });
			  $(document).ready(function(){
			          var menu=new BootstrapMenu('.DynamicAdd',{       
			              fetchElementData:function($rowElem){    
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
			                      onClick: function(row) { 
			  						alert(row);//添加右击事件
			                          
			                          //定义你自己的添加事件
			                      },
			                      isEnabled: function(row) {
			                         return row.isEditable;
			                      }
			                  },
			                  editDescription: {
			                        name: '<font size=3>删除</font>',
			                        iconClass: 'fa-trash',
			                        onClick: function(row) {   //修改右击事件
			                             alert(row);
			                             //定义你自己的修改事件
			                        },
			                        isEnabled: function(row) {  
			                            return row.isEditable;
			                        }
			                 },
			  
			                 deleteRow: {
			                     name: '<font size=3>清空</font>',
			                     iconClass: 'fa-trash',
			                     onClick: function(row) {  //删除右击事件
			                         alert(row);
			                         //定义你自己的删除事件
			                     },
			                     isEnabled: function(row) {
			                          return row.isEditable && row.isRemovable;
			                     }
			                 }
			              }
			          });
			  });
			  
		</script>
	</body>
</html>
