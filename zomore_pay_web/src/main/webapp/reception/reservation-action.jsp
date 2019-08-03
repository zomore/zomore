<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>顾客预约</title>
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/css/icon.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/css/commons.css" rel="stylesheet" />
	<!-- 引用阿里图标样式 -->
	<link href="${pageContext.request.contextPath}/css/iconfont.css" rel="stylesheet" />
	<!-- 引用按钮样式 -->
	<link href="${pageContext.request.contextPath}/css/components.css" rel="stylesheet" />
	<!-- 引入表格的样式  -->
	<link href="${pageContext.request.contextPath}/css/bootstrap-table.min.css" rel="stylesheet"/>
	<!-- 引入时间选择插件 -->
	<link href="${pageContext.request.contextPath}/css/bootstrap-datepicker.min.css" rel="stylesheet" />
	<!-- 引入jquery的JS -->
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!-- 引入时间的JS -->
	<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap-datepicker.zh-cn.js"></script>
	<!-- 引用表格的JS -->
	<script src="${pageContext.request.contextPath}/js/bootstrap-table.min.js"></script>
	<script src="${pageContext.request.contextPath}/${pageContext.request.contextPath}/js/bootstrap-table-zh-CN.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/alert.js"></script>
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
<form:form action="${pageContext.request.contextPath}/pay/saveReservation.do" method="post">
<header class="header com-bj">
	<a href="#" onclick="javascript :history.back(-1);">
		<div class="close">
			<i class="fa  fa-mail-reply"></i>
		</div>
	</a>
	<div class="title" >预约
		<a class="btn btn-default btn-user btns">新增</a>
	</div>
	<div class="titles">

		<div class="xsdj-search-bottom col-lg-11 col-md-12 col-sm-12">
			<div class="form-group">
				<label for="stime" class="control-label col-lg-1 col-sm-1 col-md-1">开始日期:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="mm/dd/yyyy" id="date1" name="createTime">
						<span class="input-group-addon"><i class="fa  fa-calendar"></i></span>
					</div>

				</div>
				<label for="etime" class="control-label col-sm-1 col-md-1 col-lg-1">结束日期:</label>
				<div class="col-sm-2 col-lg-2 col-md-2">
					<div class="input-group">
						<input type="text" class="form-control" placeholder="mm/dd/yyyy" id="date2" name="dueTime">
						<span class="input-group-addon"><i class="fa  fa-calendar"></i></span>
					</div>
				</div>
				<div class="col-sm-3 col-lg-3 col-md-3">
					<select class="select2 form-control" data-placeholder="Choose a Country..." name="serverItem">
						<option>服务项</option>
						<option value="沐足">沐足</option>
						<option value="按摩">按摩</option>
						<option value="K歌">K歌</option>
						<option value="针灸">针灸</option>
						<option value="推拿">推拿</option>
					</select>
				</div>
				<div class="col-sm-3 col-lg-3 col-md-3">
					<select class="select2 form-control" data-placeholder="Choose a Country..." name="serverer">
						<option>技师</option>
						<option value="技师一号">技师一号</option>
						<option value="技师二号">技师二号</option>
						<option value="技师三号">技师三号</option>
					</select>
				</div>
			</div>

		</div>
		<div class="xsdj-search-bottom col-lg-11 col-md-12 col-sm-12">
			<div class="form-group">
				<div class="col-sm-2 col-lg-2 col-md-2">
					<input type="text"  name="member" class="form-control" placeholder="会员">
				</div>
				<div class="col-sm-3 col-lg-3 col-md-3">
					<div class="input-group">
						<input type="text"  name="phone" class="form-control" placeholder="手机号">
					</div>
				</div>
				<div class="col-sm-2 col-lg-2 col-md-2">
					<input type="text"  name="repay" class="form-control" placeholder="定金">
				</div>
				<div class="col-sm-3 col-lg-3 col-md-3">
					<input type="text"  name="remark" class="form-control" placeholder="备注"><div class="search">

				</div>
				</div>
				<div class="col-sm-2 col-lg-2 col-md-2">
					<button class="btn btn-danger btn-lg " id="tf" type="submit">提交</button>
				</div>
			</div>

		</div>

	</div>
	<div class="logo">
		<i class="fa  fa-gears"></i>设置
	</div>
</form:form>
</header>
<!-- 中间区域 -->
<div class="xsdj-main">
	<div class="xsdj-table">
		<table id="table" data-resizable="true">
			<thead>
			<tr>
				<th data-field="id">时间</th>
				<th data-field="price">服务项</th>
				<th data-field="price">技师</th>
				<th data-field="id">会员</th>
				<th data-field="id">联系方式</th>
				<th data-field="id">订金</th>
				<th data-field="id">备注</th>
			</tr>
			</thead>
		</table>
	</div>
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
              //  $('.info').removeClass('info');
               // $($element).addClass('info');
                //modelPrint('请选择XX商品进行补打发票或者退货的操作','退货',test1,test2);
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
