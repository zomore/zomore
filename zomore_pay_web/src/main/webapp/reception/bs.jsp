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
		<title>商品报损</title>
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
		<!-- x-editable (bootstrap version) -->
		<link href="${basePath}x-editable-develop/dist/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet"/>
		<script src="${basePath}x-editable-develop/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>

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
			<a href="#" onclick="javascript :history.back(-1);">
			<div class="close">
				<i class="fa  fa-mail-reply"></i>
			</div>
			</a>
			<div class="title" >商品报损
			<%--<a class="btn btn-default btn-user btns">打印条码</a>--%>
			</div>
			<div class="logo">
				<%--<i class="fa  fa-gears"></i>设置--%>
			</div>
		</header>
		<!-- 主界面内容 -->
		<div class="index-main">
			<table id="table" data-resizable="true">
			  <thead>
			    <tr>
                  <th data-field="tm">商品条码</th>
			      <th data-field="mc">商品名称</th>
			      <th data-field="hh">货号</th>
			      <th data-field="fl">分类</th>
			      <th data-field="jhj">进货价</th>
			      <th data-field="lsj">零售价</th>
			      <th data-field="gys">供货商</th>
			      <th data-field="jhsl">报损数量</th>
			      <th data-field="xj">小计</th>
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
		     <input type="input" id="searchByCode" name="example-input2-group1" class="form-control"  style="width: 90%;height: 100px;"placeholder="条码/拼音码/名称" /> <h4>扫码模式</h4>
		    </div>
		   </div> 
		  </div> 
		  <div class="col-sm-4 col-lg-3 "> 
		   <div class="panel pan2"> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4 id="allnum">0</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4 id="allin">0</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		     <a><h4 id="allsale">0</h4></a>
		    </div>
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <h4>总报损</h4>
		    </div> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <h4>总进价</h4> 
		    </div> 
		    <div class="col-lg-4 col-sm-4 col-md-4 talign"> 
		      <h4>总售价</h4> 
		    </div> 
		   </div> 
		  </div> 
		  <div class="col-sm-4 col-lg-3" style="float: right;" > 
		   <div class="panel p-red"> 
		   <a href="javascript:void(0)" name="${basePath}reception/bssk.jsp" id="getmoney">
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

        <script type="text/javascript">
            //进货总价
            var allin = 0;
            //销售总价
            var allsale = 0;
            //总数量
            var allnum=0;
            //扫码添加商品
            $('#searchByCode').keydown(function (e) {
                if (e.keyCode == 13) {//处理回车事件
                    huiche();
                }
            });
            function huiche() {
                var code = $('#searchByCode').val();
                //向后台动态获取商品信息，回到前台显示，需要前台做重复处理
                $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreCommodity/searchByCode3.do",
                    data: {"code": code},
                    success: function (msg) {
                        allnum+=1;
                        // alert(JSON.stringify(msg));
                        //判断是否存在该商品 ，如果存在则修改数量和小计
                        var index3 = 0
                        //判断是否存在商品的标准
                        var flag = 0;
                        //判断是否存在商品
                        var flag1 = 0;
                        $('#table>tbody>tr>td').each(function () {
                            if (index3 == 0 && msg[0].tm == $(this).text()) {
                                //如果存在商品
                                flag = 1;
                            }
                            //修改数量
                            if (index3 == 7 && flag == 1) {
                                r = $(this).parent().attr("data-index");
                                flag1 = 1;
                                msg[0].jhsl = $(this).text() * 1 + msg[0].jhsl;
                                //$(this).text(msg[0].num);
                            }
                            //修改小计
                            if (index3 == 8 && flag == 1) {
                                msg[0].xj = (Number($(this).text())+Number(msg[0].xj)).toFixed(2);
                                // $(this).text(msg[0].money);
                            }
                            index3++;
                            if (index3 == 9) {
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
                        }else  if (flag1 == 0) {
                            //后面追加
                            $("#table").bootstrapTable('append', msg);
                            $("#table tbody tr").addClass("DynamicAdd");
                        } else {
                            //更新数量和小计
                            var _data = {
                                "jhsl": msg[0].jhsl, //要更新列的field
                                "xj": msg[0].xj //要更新列的数据
                            }//更新表格数据
                            $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                            $("#table tbody tr").addClass("DynamicAdd");
                        }
                        //把金额写进收款中(保留两位小数)
                        //$('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                        //前面追加
                        /*$("#table").bootstrapTable('prepend',msg);*/
                        /*Member = 0;
                        allShopNum = allShopNum + 1;
                        $('#allShopNum').text(allShopNum);*/
                        allin= (Number(allin)+Number(msg[0].jhj)).toFixed(2);
                        allsale= (Number(allsale)+Number(msg[0].lsj)).toFixed(2);
                        $('#allnum').text(allnum);
                        $('#allin').text(allin);
                        $('#allsale').text(allsale);
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
                        //原来的数量
                        var aa = $element.children().eq(7).text();
                        //进货价
                        var jhj = $element.children().eq(4).text();
                        //售价
                        var sj = $element.children().eq(5).text();
                        r = $element.attr("data-index");
                        $element.children().eq(7).editable({
                            type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
                            title: "jhsl",              //编辑框的标题
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

                                    allin=Number(allin)+Number(value)*Number(jhj)-Number(aa)*Number(jhj);
                                    allsale=Number(allsale)+Number(value)*Number(sj)-Number(aa)*Number(sj);
                                    allnum=Number(allnum)+Number(value)-Number(aa);
                                    $('#allnum').text(allnum);
                                    $('#allin').text(Number(allin).toFixed(2));
                                    $('#allsale').text(Number(allsale).toFixed(2));
                                    //更新数量和小计
                                    var _data = {
                                        "jhsl": value, //要更新列的field
                                        "xj":Number(value)*Number(jhj)  //要更新列的数据
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
            //加入商品
            $('#inputCommodity').click(function () {
                huiche();
                $('#GoodSearch').modal('hide');
            });
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
            //商品 条码
            var conditycode = "";
            //商品数量
            var conditynum = "";
            //商品名称
            var condityname = "";
            //商品进货价
            var condityprice="";
            var hf="";
            //提交
            $('#getmoney').click(function (){
                if (parseFloat(allin).toFixed(2) > 0) {
                    hf = $(this).attr("name") + "?money=" + parseFloat(allin).toFixed(2);
                    //拼接销售单据
                    //商品条码
                    var index = 0;
                    $('#table>tbody>tr>td').each(function () {
                        if (index == 0) {
                            conditycode = conditycode + $(this).text() + ","
                        }
                        index++;
                        if (index == 9) {
                            index = 0;
                        }
                    });
                    conditycode = conditycode.substring(0, conditycode.length - 1);
                    //3.单个商品名称  数组(aa,bb,cc)
                    var index1 = 0;
                    $('#table>tbody>tr>td').each(function () {
                        if (index1 == 1) {
                            condityname = condityname + $(this).text() + ","
                        }
                        index1++;
                        if (index1 == 9) {
                            index1 = 0;
                        }
                    });

                    condityname = condityname.substring(0, condityname.length - 1);
                    //  hf=hf+"&condityname="+condityname;

                    //4.商品数量 数组（1,1,1）
                    var index2 = 0;
                    $('#table>tbody>tr>td').each(function () {
                        if (index2 == 7) {
                            conditynum = conditynum + $(this).text() + ","
                        }
                        index2++;
                        if (index2 == 9) {
                            index2 = 0;
                        }
                    });
                    conditynum = conditynum.substring(0, conditynum.length - 1);
                    //4.商品小计 数组（1,1,1）
                    var index3 = 0;
                    $('#table>tbody>tr>td').each(function () {
                        if (index3 == 4) {
                            condityprice = condityprice + $(this).text() + ","
                        }
                        index3++;
                        if (index3 == 9) {
                            index3 = 0;
                        }
                    });
                    condityprice = condityprice.substring(0, condityprice.length - 1);

                    //保存报损商品
                    $.ajax({
                        type: "POST",
                        url: "${basePath}zomoreCommodity/lossCommodty.do",
                        data: {
                            "name": condityname,
                            "code": conditycode,
                            "num": conditynum,
                            "price":condityprice,
                        },
                        success: function (msg) {
                           // modalOne('会员关键字', '输入会员/手机号', adduser);
                            window.location.href = hf + "&id=" + msg;
                        }
                    });
                }
                //$(this).attr("href",hf);
            });
        </script>
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
                                        var aaa = "data-index='" + row + "'";
                                        //获取选择行的id
                                        var id = $('tr[' + aaa + ']');
                                        var ids = [];//定义一个数组
                                        ids.push($(id).children("td:first-child").text());//将要删除的id存入数组
                                       var num=Number($(id).children("td:eq(7)").text());
                                       var p1=Number($(id).children("td:eq(4)").text());
                                       var p2=Number($(id).children("td:eq(5)").text());
                                        allnum=Number($('#allnum').text())-num;
                                        allin=(Number($('#allin').text())-num*p1).toFixed(2);
                                        allsale=(Number($('#allsale').text())-Number(num)*Number(p2)).toFixed(2);
                                        $('#allnum').text(allnum);
                                        $('#allin').text(allin);
                                        $('#allsale').text(allsale);
                                        $("#table").bootstrapTable('remove', {field: 'tm', values: ids});//field:根据field的值来判断要删除的行  values：删除行所对应的值
                                        $("#table tbody tr").addClass("DynamicAdd");


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
