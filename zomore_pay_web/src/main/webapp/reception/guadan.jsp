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
	<title>挂单</title>
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
	<%--<a href="${basePath}reception/index.jsp">--%>
		<a href="#" onclick="javascript :history.back(-1);">
		<div class="close">
			<i class="fa  fa-mail-reply"></i>
		</div>
	</a>
	<div class="title" >挂单
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
	<div class="xsdj-left col-lg-2 col-md-3" style="overflow-y: auto">
		<div class="xsdj-left-title">
			订单列表
		</div>
		<c:forEach items="${requestScope.result}" var="result">
			<div class="media" name="${result.zomoreCommoditySaleId}"  >
				<div class="media-left media-middle">
					<i class="fa  fa-money media-object"></i>

				</div>
				<div class="media-body">
					<p>${result.zomoreCommoditySaleId}<span class="price">${result.zomoreCommoditySaleInmoney}</span></p>
					<p>牌号：${result.zomoreCommodityGuadannum} <span style="float: right;"><fmt:formatDate value="${result.zomoreCommoditySaleTime}" pattern="MM-dd"></fmt:formatDate> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${result.zomoreCommoditySaleTime}" pattern="HH:mm"></fmt:formatDate></span></p>
				</div>
			</div>
		</c:forEach>

	</div>
	<!-- 左边部分结束 -->
	<!-- 右边部分 -->
	<div class="xsdj-right col-lg-10 col-md-9">
		<!-- 右边table -->
		<div class="xsdj-table">
			<table id="table" data-resizable="true">
				<thead>
				<tr>
					<th data-field="code">商品条码</th>
					<th data-field="name">商品名称</th>
					<th data-field="huohao">货号</th>
					<th data-field="cutprice">订价</th>
					<th data-field="num">数量</th>
				</tr>
				</thead>
			</table>
		</div>
		<!-- 右边Table结束 -->
		<!-- 右边地址栏 -->
		<div class="xsdj-right-f2">
			<div class="col-sm-6 col-lg-6 col-md-6 ">
				<ul class="list-group">
					<li class="list-group-item fontcred" id="allnum">
						件数：0
					</li>
					<li class="list-group-item fontcred" id="daogou">
						导购：
					</li>
				</ul>
			</div>
			<div class="col-sm-6 col-lg-6 col-md-6 ">
				<ul class="list-group">
					<li class="list-group-item fontcred" id="allmoney">
						总额：0
					</li>
					<li class="list-group-item fontcred" id="bz">
						备注：0
					</li>
				</ul>
			</div>
		</div>
		<!-- 右边底部 -->
		<div class="xsdj-right-footer">

			<button class="btn btn-warning btn-lg" id="zf">作废</button>
			<button class="btn btn-success btn-lg" id="dy">打印</button>
			<button class="btn btn-success btn-lg" id="zj">追加</button>
			<button class="btn btn-success btn-lg" id="sy">收银</button>


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
<%--保存选择的销售订单号--%>
<input type="hidden" id="saleId" value="">
<input type="hidden" id="money" value="">

<script>
    $('.media').click(function () {
        /*将订单号保存在隐藏域中*/
        $('#saleId').val($(this).attr("name"));
        /*先移除其他的选择状态*/
        $("div[class='media active']").attr("class","media");
        /* 变成选择状态*/
        $(this).attr("class","media active");
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/showAllCommodit.do",
            data: {"id":$(this).attr("name")},
            success: function(msg){
                //alert(JSON.stringify(msg));
                $("#table").bootstrapTable('removeAll');
                //后面追加
                $("#table").bootstrapTable('append',msg);
                $('#allnum').text("件数："+msg[0].alllnum);
                $('#allmoney').text("总额："+msg[0].alllmoney);
                $('#daogou').text("导购员："+msg[0].guide);
                $('#bz').text("备注："+msg[0].meno);
                $('#money').val(msg[0].alllmoney);
            }
        });
    });
    //整个销售订单收银
    $('#sy').on('click', function () {

        var danId = $('#saleId').val();
        if(danId==null||danId==""){
            alert("请选择挂单单据！");
            return false;
		}
        window.location.href = "${basePath}reception/sk.jsp?money="+$('#money').val()+"&id="+ $('#saleId').val();
       /* $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/updateCommoditSale.do",
            data:{"zomoreCommoditySaleId": $('#saleId').val(),zomoreCommodityState:1},
            success: function (msg) {
                //跳转到收银页面

                window.location.href = "${basePath}zomoreCommoditySale/list2.do";
            }
        });*/
    });

    //整个销售订单作废
    $('#zf').on('click', function () {
        var deleteguadan = ${sessionScope.zomoreCashierBeforeRight.deleteguadan}+"";
        if (deleteguadan=='0'){
            alert("该收银台没有作废挂单单据的权限");
            return false;
        }
        if($('#saleId').val()==""){
            alert("请选择挂单单据！");
            return false;
		}
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/deletedCommoditSaleall1.do",
            data:{"id": $('#saleId').val()},
            success: function (msg) {
                window.location.href = "${basePath}zomoreCommoditySale/list2.do";
            }
        });
    });
    //单据追加商品
	$('#zj').on('click',function () {
	    var danId = $('#saleId').val();
	    if(danId==""){
	        alert("请选择挂单单据");
	        return false;
		}
	    window.location.href="${basePath}zomoreCommoditySale/selectQianYuan.do?id="+danId;


    });


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
