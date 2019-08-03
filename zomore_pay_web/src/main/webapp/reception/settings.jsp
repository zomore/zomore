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
		<title>系统设置</title>
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
		<!-- 引入时间选择插件 -->
		<link href="${basePath}css/bootstrap-datepicker.min.css" rel="stylesheet" />
		<!-- toggle -->
		<link href="${basePath}css/toggles.css" rel="stylesheet"/>
		<!-- 引入加减 -->
		<link href="${basePath}css/jquery.bootstrap-touchspin.min.css"  rel="stylesheet"/>
		<!-- 引入select2 -->
		<link href="${basePath}js/select2/dist/css/select2.css" rel="stylesheet"/>
		<link href="${basePath}js/select2/dist/css/select2-bootstrap.css" rel="stylesheet"/>
		<!-- 引入jquery的JS -->
		<script src="${basePath}js/jquery.min.js"></script>
		 <script src="${basePath}js/bootstrap.min.js"></script>
		 <!-- 引入时间的JS -->
		 <script src="${basePath}js/bootstrap-datepicker.js"></script>
		 <script src="${basePath}js/bootstrap-datepicker.zh-cn.js"></script>
		 <!-- 引用表格的JS -->
		 <script src="${basePath}js/bootstrap-table.min.js"></script>
		 <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
		 <!-- to -->
		 <script src="${basePath}js/toggles.min.js"></script>
		 <!-- 引入 -->
		 <script src="${basePath}js/jquery.bootstrap-touchspin.min.js"></script>
		 <!-- 引入SELECT -->
		 <script src="${basePath}js/select2/dist/js/select2.min.js"></script>
		 <script src="${basePath}js/alert.js"></script>
	</head>
	<body>
		<header class="header com-bj">
			<a href="#" onclick="javascript :history.back(-1);">
			<div class="close">
				<i class="fa  fa-mail-reply"></i>
			</div>
			</a>
			<div class="title" >系统设置
			
			</div>
			
			<div class="logo">
				<img src="${basePath}img/logo.png" />
			</div>
		</header>
		<div class="xsdj-main">
			<div class="xsdj-left col-lg-2 col-md-3 col-sm-3">
				<div class="xsdj-left-title" style="text-align: center;">
					系统设置
				</div>
				<div class="set-menu">
					<ul  class="nav  tabs-vertical">
						<li class="active">
							<a href="#menu1" data-toggle="tab">通用设置</a>
						</li>
						<li><a href="#menu2" data-toggle="tab">小票打印设置</a></li>
						<%--<li><a href="#menu3" data-toggle="tab">标签打印设置</a></li>--%>
						
						<li><a href="#menu5" data-toggle="tab">功能设置</a></li>
						<li><a href="#menu6" data-toggle="tab">广告设置</a></li>
						<!--<li><a href="#menu7" data-toggle="tab">电子秤管理</a></li>-->
						<li><a href="#menu8" data-toggle="tab">账号管理</a></li>
						<li><a href="#menu9" data-toggle="tab">关于</a></li>
					</ul>
				</div>
			</div>
			<div class="xsdj-right col-lg-10 col-md-9 set-cont col-sm-9">
				<div  class="tab-content">
					<div class="tab-pane fade in active" id="menu1">
						<div class="set-content">
							<ul class="list-group">
    <li class="list-group-item">商店名称: <div class="rtxt">${sessionScope.shopName}</div></li>
    <li class="list-group-item">商店地址: <div class="rtxt">${sessionScope.shopAddress}<i class="fa  fa-map-marker"></i></div></li>
    <li class="list-group-item">客服电话: <div class="rtxt"><%--<input  class="form-control" value="${sessionScope.cashierPhone}"/>--%>17728066459</div></li>
    <li class="list-group-item">开启备用金:<div class="rtxt"><div class="toggle toggle-primary" id="standbyfund"></div></div></li>
<%--    <li class="list-group-item">是否合并商品？<div class="rtxt"><div class="toggle toggle-primary id="merge"></div></div></li>--%>
	<li class="list-group-item">在主页显示新增商品？<div class="rtxt"><div class="toggle toggle-primary" id="newlyadded"></div></div></li>
	<li class="list-group-item">是否开店导购号提醒?<div class="rtxt"><div class="toggle toggle-primary" id="shoppingguide"></div></div></li>
	<li class="list-group-item">未处理订单重复提醒?<div class="rtxt"><div class="toggle toggle-primary" id="setrepeat"></div></div></li>
	<li class="list-group-item" style="text-align: right;">
		<div class="col-sm-12" style="padding: 0;text-align: left;">
			<%--<div class="checkbox " style="margin: 0;">
			                                    <input id="checkbox1" type="checkbox">
			                                    <label for="checkbox1">
			                                        开机启动
			                                    </label>
			                                </div>--%>
		</div>
		
		<button class="btn btn-pink" onclick="updataSetting()">手动同步数据</button>
		<!--<button class="btn btn-info" style="margin-right: 15px;">系统快捷</button>-->
		
		</li>
		<%--<li class="list-group-item">未处理订单重复提醒?<div class="rtxt"><div class="toggle toggle-primary"></div></div></li>--%>
	<%--<li class="list-group-item">是否开启系统弹窗提示？<div class="rtxt"><div class="toggle toggle-primary"></div></div></li>--%>
</ul>
						</div>
					</div>
					<div class="tab-pane fade in active" id="menu2">
						<div class="set-content">
							<ul class="list-group">
								<li class="list-group-item">
									小票打印机IP：<div class="rtxt"><button class="btn btn-info">测试</button></div>
								</li>
								<li class="list-group-item">
									小票打印规格：<div class="rtxt"><div class="toggle toggle-primary toxb"></div></div>
								</li>
								<li class="list-group-item">
									<div class="col-sm-6">
										小票打印张数数量：
										<div style="width: 150px;float: right;" class="jj">
											<input class="vertical-spin" type="text" id="printnumber" value="${requestScope.cashierPrintSetting.printnumber}" name="vertical-spin" data-bts-button-down-class="btn btn-primary" data-bts-button-up-class="btn btn-primary">
										</div>
										
									</div>
								</li>
<%--								<li class="list-group-item">
									<div class="col-sm-12 group-item-left" style="padding-left: 0;">
										挂单打压桌单：
										<div class="menu2-an"><i class="fa  fa-check"></i></div>
									</div>
									<!--<div class="col-sm-6">
										小票走纸数量：
										<div class="menu2-an"><i class="fa  fa-check"></i></div>
										
									</div>-->
								</li>--%>
							<%--	<li class="list-group-item" style="height: 160px;">
									<span style="line-height: 160px;float: left;display: block;padding: 0;" class="col-sm-2">小票LOGO：</span>
									<textarea style="height: 120px;margin-top: 20px;border: #0094D9 solid 1px;" class="col-sm-6"></textarea>
									<div class="col-sm-4">
										<p style="color: #FF0000; line-height: 25px;">小票LOGO建议使用300*200的jpg,bmp等格式的黑白图片</p>
										<p><button class="btn btn-info">上传图片</button></p>
									</div>
								</li>
								<li class="list-group-item">
									开启反馈通道：<div class="rtxt"><div class="toggle toggle-primary toxb"></div></div>
								</li>
								<li class="list-group-item">
									小票隐藏流水号：<div class="rtxt"><div class="toggle toggle-primary toxb"></div></div>
								</li>--%>
								
								<li class="list-group-item" style="height:100px; line-height: 30px;">
									<span style="width: 100%;"><a>查看故障问题排除视频</a></span>
									<div class="" style="width: 100%;">
										<font color="#FF0000">大部分小票机即插即用，不用安装驱动，无需设置</font> <select style="width: 100px;"><option>无</option><option>1</option><option>1</option></select>
										<button class="btn btn-primary">测试打印</button>
										<button class="btn btn-info">驱动打印</button>
									</div>
									
									
								</li>
								
							</ul>

							
						</div>
					</div>
					<div class="tab-pane fade in active" id="menu3">
						<div class="set-content">
							<ul class="list-group">
								<li class="list-group-item">
									网口标签打印机：<div class="rtxt"><input  class="form-control" value=""/></div>
								</li>
							<li class="list-group-item" >
								USB标签打印机：
								<div class="rtxt" id="select">
									<select class="select2 form-control" data-placeholder="Choose a Country...">
								     <option>xxx</option>
									 <option>1</option>
									 <option>1</option>
									</select>
								</div>
								
							</li>
							
								<li class="list-group-item" style="height: 70px;">
									销售标签套规格：
									<div class="rtxt" id="select">
										<select class="select2 form-control" data-placeholder="Choose a Country...">
									     <option>系统默认模板(40*30)</option>
										 <option>1</option>
										 <option>1</option>
										</select>
									</div>
									<p class="menu-info">注：如需修改或者新增模板，请到云端平台进行处理</p>
								</li>
								<li class="list-group-item" style="height: 70px;">
									商品标签模板：
									<div class="rtxt" id="select">
										<select class="select2 form-control" data-placeholder="Choose a Country...">
									     <option>系统默认模板(40*30)</option>
										 <option>1</option>
										 <option>1</option>
										</select>
									</div>
									<p class="menu-info">注：如需修改或者新增模板，请到云端平台进行处理</p>
								</li>
							<li class="list-group-item">
								合并打标签：<div class="rtxt"><div class="toggle toggle-primary "></div></div>
							</li>
							<li class="list-group-item">
								堂食打标签：<div class="rtxt"><div class="toggle toggle-primary "></div></div>
							</li>
							<li class="list-group-item" style="height: 160px;">
								<span style="line-height: 160px;float: left;display: block;padding: 0;" class="col-sm-2">标签尾注：</span>
								<textarea style="height: 120px;margin-top: 20px;border: #0094D9 solid 1px;" class="col-sm-6"></textarea>
								<div class="col-sm-4">
									<p style="color: #FF0000; line-height: 25px;">注：xxxxxx</p>
									
								</div>
							</li>
							<li class="list-group-item">
								开启多标签打印：<div class="rtxt"><div class="toggle toggle-primary " style="float: left;margin-right: 150px;"></div><button class="btn btn-success">驱动打印</button></div>
							</li>
							</ul>	
							
						</div>
					</div>
					
					<div class="tab-pane fade in active" id="menu5">
						<div class="set-content">
							<ul class="list-group">
							<li class="list-group-item">使用IC会员卡:<div class="rtxt"><div class="toggle toggle-primary"id="icmemberKar"></div></div></li>
							<li class="list-group-item">会员生日提醒:<div class="rtxt"><div class="toggle toggle-primary" id="memberBirthday"></div></div></li>
							<li class="list-group-item">是否客显:<div class="rtxt"><div class="toggle toggle-primary"id="guestShow"></div></div></li>
							<li class="list-group-item">
								客显地址:
								<div class="t-right">
									<div class="t-right-20">
										<select class="select2 form-control" style="font-size: 16px;" >
										 <option>COM1</option>
										 <option>1</option>
										 <option>1</option>
										</select>
									</div>
									<div class="t-right-30" >
										<span>波特率：</span><b>2400</b>
									</div>
									<div class="t-right-50">
										<span>清除</span>
										<span>单价：8.88</span>
										<span>总价：66.66</span>
										<span>找零：9.99</span>
									</div>
								</div>
							
								</li>
								<li class="list-group-item">主分机:
								<div class="t-right">
									<div class="t-right-20">本机ip:</div>
									<div class="t-right-30"><input value="<%=getIpAddr(request)%>" class="form-control" /></div>
									<div class="t-right-20" style="text-align: right;"><button class="btn btn-success">自动分配</button></div>
									<%--<div class="t-right-30" style="text-align: right;"><div class="toggle toggle-primary" style="margin-right: 15px;float: right;"></div></div>--%>
								</div>
								</li>
								<!--<li class="list-group-item">自动锁屏:<div class="rtxt"><div class="toggle toggle-primary"></div></div></li>-->
								<%--<li class="list-group-item">显示货号:<div class="rtxt"><div class="toggle toggle-primary" id="itemNum"></div></div></li>
								<li class="list-group-item">单据备注是否可填:<div class="rtxt"><div class="toggle toggle-primary"id="remarks"></div></div></li>
								<li class="list-group-item">会员检索:<div class="rtxt"><div class="toggle toggle-primary"id="retrieval"></div></div></li>--%>
								<!--<li class="list-group-item">启用安全模式:<div class="rtxt"><div class="toggle toggle-primary"></div></div></li>-->
						    </ul>
						</div>
					</div>
					<div class="tab-pane fade in active" id="menu6">
						<div class="set-content">
							<ul class="list-group">
							<li class="list-group-item">播放等待时间(秒):<div class="groupleft" style="float: right; width: 210px;"><a class="active">1</a><a>5</a><a>10</a></div></li>	
							<li class="list-group-item">图片切换时间(秒):<div class="groupleft" style="float: right; width: 210px;"><a class="active">2</a><a>5</a><a>10</a><a>15</a></div></li>	
							<li class="list-group-item">是否开启双屏:<div class="rtxt"><div class="toggle toggle-primary"></div></div></li>
							<!--<li class="list-group-item">图片文化夹:<div class="rtxt"><button type="file" class="btn btn-info">选择目录</button></div></li>
							<li class="list-group-item">声音文件:<div class="rtxt"><button type="file" class="btn btn-info">选择文件</button></div></li>-->
							<%-- <li class="list-group-item-list">
								 <p>1:注意1的事项</p>
								 <p>2:注意2的事项</p>
								 <p>3:注意3的事项</p>
								 <p>4:注意4的事项</p>
							 </li>--%>
							</ul>
							
						</div>
					</div>
					<div class="tab-pane fade in active" id="menu7">
						<div class="set-content">
							<div class="title">通讯秤 <button type="button" class="btn btn-info" style="float: right;">下载并配置通用秤</button></div>
						<div class="menu7-list">
							<div class="col-sm-6 col-lg-6 col-md-6">
								<label style="float: left;">通讯秤</label><div class="toggle toggle-primary" style="float: right;"></div>
							</div>
							<div class="col-sm-6 col-lg-6 col-md-6">
								<label style="float: left;">类型</label>
								<select class="select2 form-control" style="font-size: 16px;float: right;width: 70%;" >
										 <option>COM1</option>
										 <option>1</option>
										 <option>1</option>
										</select>
							</div>
						</div>
						<div class="menu7-list">
							<div class="col-sm-6 col-lg-6 col-md-6">
								<label style="float: left;">串号号</label>
								<select class="select2 form-control" style="font-size: 16px;float: right;width: 70%;" >
										 <option>COM1</option>
										 <option>1</option>
										 <option>1</option>
										</select>
							</div>
							<div class="col-sm-6 col-lg-6 col-md-6">
								<label style="float: left;">波特率</label>
								<select class="select2 form-control" style="font-size: 16px;float: right;width: 70%;" >
										 <option>COM1</option>
										 <option>1</option>
										 <option>1</option>
										</select>
							</div>
						</div>
						
						<div class="title">条码秤 <span style="float: right; margin-right: 15px;"><a>传称设置></a></span></div>
						<div class="menu7-list">
						<label style="float: left;padding-left: 15px; line-height: 50px;">条码设置：</label>
						<select class="select2 form-control" style="font-size: 16px;float: left;width: 70%;" >
								 <option>COM1</option>
								 <option>1</option>
								 <option>1</option>
								</select>
								<span style="float: right; margin-right: 15px;font-size: 16px;font-weight: bold;"><a>说明》</a></span>
						</div>
						<div class="menu7-list">
							<label style="float: left;padding-left: 15px; line-height: 50px;">预包装打印：</label>
							<span style="float: right; margin-right: 15px;"><button type="button" class="btn btn-info">模板选择</button></span>
						</div>
						<div class="menu7-list" style="height: 80px;">
						<label style="float: left;padding-left: 15px; line-height: 50px;">设置PLU：</label>
						<select class="select2 form-control" style="font-size: 16px;float: left;width: 70%;" >
								 <option>COM1</option>
								 <option>1</option>
								 <option>1</option>
								</select>
								<span style="float: right; margin-right: 15px;"><button type="button" class="btn btn-info">导出</button></span>
						 <div style="width: 100%;float: left;line-height: 20px;text-indent: 15px;font-size: 16px;font-weight: bold;"><a>操作说明》</a></div>
						</div>
						
							</div>
					</div>
					<%!public String getIpAddr(HttpServletRequest request) {
						String ip = request.getHeader("x-forwarded-for");
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
							ip = request.getHeader("Proxy-Client-IP");
						}
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
							ip = request.getHeader("WL-Proxy-Client-IP");
						}
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
							ip = request.getRemoteAddr();
						}
						return ip;
					}%>
					<div class="tab-pane fade in active" id="menu8">
						<div class="set-content">
							<div class="menu8-p">
								<p>当前账号：${sessionScope.shopAccount}</p>
								<p><button type="button" class="btn btn-info" onclick="logout()">注销账号</button><button type="button" class="btn btn-info">恢复默认配置</button></p>
							    <p>本机IP:<%=getIpAddr(request)%></p>
							</div>
						</div>
					</div>
					<div class="tab-pane fade in active" id="menu9">
						<div class="set-content">
							<div class="menu8-p">
								
								<p><b>广州创玖科技有限公司</b></p>
								<p>电话：020-31213805</p>
								<p>版本号：V1.0.16</p>
							</div>
						</div>
					</div>
				</div>	
				
				
			</div>
		</div>

		<script>
var genralId=${requestScope.cashierGenralSetting.id}

var functionId=${requestScope.cashierFunctionSetting.id}

var printId=${requestScope.cashierPrintSetting.id}
 //备用金
$('#standbyfund').toggles({on: ${requestScope.cashierGenralSetting.standbyfund}, text: {
		on: '是', // text for the ON position
		off: '否' // and off
	},width: 100, // width used if not set in css
	height: 30,animate: 250, easing: 'swing' });

  $('#standbyfund').on('toggle', function(e, active) {
      var num;
      if(active){
          num=1;
	  }
	  else {num=0}
      $.ajax({
          type:"post",
          url:"${basePath}setting/updataGenral.do",
          data:{
              "standbyfund":num,
			  "id":genralId
          },
		  error:function () {
			  alert("失败");
          }
      });

});
 //在主页显示新增商品
 $('#newlyadded').toggles({on:${requestScope.cashierGenralSetting.newlyadded}, text: {
		 on: '是', // text for the ON position
		 off: '否' // and off
	 },width: 100, // width used if not set in css
	 height: 30,animate: 250, easing: 'swing' });

$('#newlyadded').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;
    }
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataGenral.do",
        data:{
            "newlyadded":num,
            "id":genralId
        },
        error:function () {
            alert("失败");
        }
    });

});

 //是否开店导购号提醒?
 $('#shoppingguide').toggles({on: ${requestScope.cashierGenralSetting.shoppingguide}, text: {
         on: '是', // text for the ON position
         off: '否' // and off
     },width: 100, // width used if not set in css
     height: 30,animate: 250, easing: 'swing' });

 $('#shoppingguide').on('toggle', function(e, active) {
     var num;
     if(active){
         num=1;
     }
     else {num=0}
     $.ajax({
         type:"post",
         url:"${basePath}setting/updataGenral.do",
         data:{
             "shoppingguide":num,
             "id":genralId
         },
         error:function () {
             alert("失败");
         }
     });
 });

 //未处理订单重复提醒?
 $('#setrepeat').toggles({on: ${requestScope.cashierGenralSetting.setrepeat}, text: {
         on: '是', // text for the ON position
         off: '否' // and off
     },width: 100, // width used if not set in css
     height: 30,animate: 250, easing: 'swing' });

 $('#setrepeat').on('toggle', function(e, active) {
     var num;
     if(active){
         num=1;
     }
     else {num=0}
     $.ajax({
         type:"post",
         url:"${basePath}setting/updataGenral.do",
         data:{
             "setrepeat":num,
             "id":genralId
         },
         error:function () {
             alert("失败");
         }
     });
 });

//小票设置
$('.toxb').toggles({on:true,text:{on:'58MM',off:'80MM'},width:100,height:30});
$('#menu3 .toggle').toggles({on: true, text: {
    on: '是', // text for the ON position
    off: '否' // and off
  },width: 100, // width used if not set in css
  height: 30, });
  $('#menu5 .toggle').toggles({on: true, text: {
      on: '是', // text for the ON position
      off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30, });
	 $('#menu6 .toggle').toggles({on: true, text: {
	    on: '是', // text for the ON position
	    off: '否' // and off
	  },width: 100, // width used if not set in css
	  height: 30, });
	  $('#menu7 .toggle').toggles({on: true, text: {
	     on: '是', // text for the ON position
	     off: '否' // and off
	   },width: 100, // width used if not set in css
	   height: 30, });

$("#printnumber").change(function(){
   var num= $("#printnumber").val();

    $.ajax({
        type:"post",
        url:"${basePath}setting/updataPrint.do",
        data:{
            "printnumber":num,
            "id":printId
        },
        error:function () {
            alert("失败");
        }
    });

});


//功能设置
//使用会员ic卡提醒?
$('#icmemberKar').toggles({on: ${requestScope.cashierFunctionSetting.icmemberKar}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#icmemberKar').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;

}
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "icmemberKar":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
        }
    });
});

//会员生日提醒?
$('#memberBirthday').toggles({on: ${requestScope.cashierFunctionSetting.memberBirthday}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#memberBirthday').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;

    }
    else {num=0}
   $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "memberBirthday":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
        }
    });
});
//是否开始客显提醒?
$('#guestShow').toggles({on: ${requestScope.cashierFunctionSetting.guestShow}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#guestShow').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;

    }
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "guestShow":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
        }
    });
});

//是否显示货号提醒?
$('#itemNum').toggles({on:  ${requestScope.cashierFunctionSetting.itemNum}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#itemNum').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;

    }
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "itemNum":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
        }
    });
});

//是否开启单据备注提醒?
$('#remarks').toggles({on:  ${requestScope.cashierFunctionSetting.remarks}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#remarks').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;
    }
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "remarks":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
        }
    });
});

//是否开启会员检索提醒?
$('#retrieval').toggles({on: ${requestScope.cashierFunctionSetting.retrieval}, text: {
        on: '是', // text for the ON position
        off: '否' // and off
    },width: 100, // width used if not set in css
    height: 30,animate: 250, easing: 'swing' });

$('#retrieval').on('toggle', function(e, active) {
    var num;
    if(active){
        num=1;

    }
    else {num=0}
    $.ajax({
        type:"post",
        url:"${basePath}setting/updataFunction.do",
        data:{
            "retrieval":num,
            "id":functionId
        },
        error:function () {
            alert("失败");
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
				// 
				$('.menu2-an').on('click',function(){
					if($(this).hasClass('active')){
						$(this).removeClass('active');
						console.log(1)
					}else{
						$(this).addClass('active')
						//$(this).removeClass('active');
						console.log(2)
					}
					//console.log(tt);
				})
				 jQuery(".select2").select2({
                    width: '100%'
                });

$('.groupleft a').on('click',function(){
	$(this).addClass('active');
	$(this).siblings().removeClass('active');
});
	function logout() {

        var calcellaccount = ${sessionScope.zomoreCashierBeforeRight.calcellaccount}+"";
        if (calcellaccount=='0'){
            alert("该收银台没有注销账号的权限");
            return false;
        }

	    $.ajax({
			url:"${basePath}pay/payLogout.do",
			success:function (data2) {
				window.location.href="${pageContext.request.contextPath}/logout.do";
            },
			error:function (data) {
				alert("错误");
            }
		});


            }
		</script>

	<script>
		function updataSetting() {
		    $.ajax({
				type:"post",
				url:"${basePath}setting/updataSession.do",
				success:function () {
				    alert("同步成功");
                }
			});

        }
	</script>
	</body>
</html>
