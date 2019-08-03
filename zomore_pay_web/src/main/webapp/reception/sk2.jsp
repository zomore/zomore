<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");

%>
<!DOCTYPE html>
<%--从后院跳转到的收款--%>
<html>
<head>
    <meta charset="utf-8">
    <title>收款</title>
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
    <!-- 引入系统信息警告的JS -->
    <script src="${basePath}js/alert.js"></script>
    <style>
        .header .title {
            position: relative;
        }


    </style>
</head>
<body>

<%--保存商品订单号的隐藏域--%>
<input type="hidden" id="id" name="id" value="${requestScope.result1.zomoreCommoditySaleId}">
<%--总金额--%>
<input type="hidden" id="money" name="money" value="${requestScope.result.zomoreCommoditySaleInmoney+requestScope.result1.zomoreCommoditySaleMoney}">
<%--保存原始的金额 resourcemoney，前台金额，resourcemoney1,后院金额--%>
<input type="hidden" id="resourcemoney" name="money" value="${requestScope.result.zomoreCommoditySaleInmoney}">
<input type="hidden" id="resourcemoney1" name="money" value="${requestScope.result1.zomoreCommoditySaleMoney}">
<%--保存导购员名称--%>
<input type="hidden" id="Guide" name="Guide" value="">
<%--隐藏域保存会员名称,余额,会员号--%>
<input type="hidden" id="huiyuan" value="${requestScope.member.memberMemberidname}">
<input type="hidden" id="yuer" value="${requestScope.member.memberBalance}">
<input type="hidden" id="memberNum" value="${requestScope.member.memberNumber}">
<header class="header com-bj">
    <%--  <a href="${basePath}zomoreServiceCommodity/list1.do?id="${sessionScope.Aa_servieceorderid}>--%>
      <%--  onclick="javascript :history.back(-1);"--%>
        <%--ske2222222222222222--%>
    <a href="${basePath}zomoreServiceCommodity/list1.do?id=${sessionScope.Aa_servieceorderid}&zomoreMemberNum=${requestScope.member.memberNumber}">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">
        <a class="btn btn-default btn-tg btns daogo">导购:</a>
        收款
        <a class="btn btn-default btn-user btns">收银台:${sessionScope.cashierNumber}</a>
        <!-- <span><i class="fa  fa-gears"></i>设置</span> -->
    </div>

</header>
<div class="sk-main">
    <div class="sk-p-20">
        <div class="col-lg-8 col-md-8 col-sm-8 stab">
            <ul id="myTab" class="nav  tabs-vertical">
                <li>
                    <a href="#home" data-toggle="tab">
                        前店
                    </a>
                </li>
                <li  <c:if test="${requestScope.result.zomoreCommoditySaleInmoney eq null}">class="active"</c:if>
                ><a href="#ios" data-toggle="tab">后院</a></li>

                <li  <c:if test="${requestScope.result.zomoreCommoditySaleInmoney ne null}">class="active"</c:if>
                ><a href="#ejb" data-toggle="tab">总计</a></li>

            </ul>
            <div id="myTabContent2" class="tab-content">
                <div class="tab-pane fade " id="home">

                    <div style="width: 100%; ">
                        <div class="input-group qd">
                            <span class="input-group-addon">前店总额:</span>
                            <input type="text" readonly="readonly" id="money1" name="example-input1-group1"
                                   value="${requestScope.result.zomoreCommoditySaleInmoney}" class="form-control">
                        </div>
                        <div class="input-group xj">
                            <span class="input-group-addon" >现金:</span>
                            <input autofocus="autofocus"id="money11" placeholder="" onchange="changerPrice(this)" type="text"
                                   name="example-input1-group1" class="form-control" value="${requestScope.result.zomoreCommoditySaleInmoney}">
                        </div>
                        <div class="input-group zl">
                            <span class="input-group-addon">找零:</span>
                            <input type="text" readonly="readonly" id="money111"
                                   name="example-input1-group1" class="form-control">
                        </div>
                    </div>
                    <div class="row" style="margin-top: 10px;">
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">总计:<font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney+requestScope.result1.zomoreCommoditySaleMoney}</font></span>

                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">前店总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney}</font>
                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">后院总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result1.zomoreCommoditySaleMoney}</font>
                        </div>
                    </div>

                </div>
                <div  <c:if test="${requestScope.result.zomoreCommoditySaleInmoney eq null}">class="tab-pane fade in active"</c:if>
                      <c:if test="${requestScope.result.zomoreCommoditySaleInmoney ne null}">class="tab-pane fade "</c:if>
                     id="ios">

                    <div style="width: 100%; ">
                        <div class="input-group qd">
                            <span class="input-group-addon">后院总额:</span>
                            <input type="text" id="money2"
                                   <c:if test="${requestScope.result.zomoreCommoditySaleInmoney ne null}">readonly="readonly"</c:if>
                                   name="example-input1-group1"
                                   onchange="changeMoney2(this)"
                                   class="form-control" value="${requestScope.result1.zomoreCommoditySaleMoney}">
                        </div>
                        <div class="input-group xj">
                            <span class="input-group-addon">现金:</span>
                            <input type="text" id="money22" name="example-input1-group1" onchange="changerPrice(this)"
                                   class="form-control" value="${requestScope.result1.zomoreCommoditySaleMoney}">
                        </div>
                        <div class="input-group zl">
                            <span class="input-group-addon">找零:</span>
                            <input type="text" id="money222" name="example-input1-group1" readonly="readonly"
                                   class="form-control" value="0">
                        </div>
                    </div>
                    <div class="row" style="margin-top: 10px;">
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">总计:<font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney+requestScope.result1.zomoreCommoditySaleMoney}</font></span>

                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">前店总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney}</font>
                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">后院总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result1.zomoreCommoditySaleMoney}</font>
                        </div>
                    </div>
                </div>

                <div <c:if test="${requestScope.result.zomoreCommoditySaleInmoney ne null}">class="tab-pane fade in active"</c:if>
                     <c:if test="${requestScope.result.zomoreCommoditySaleInmoney eq null}">class="tab-pane fade"</c:if>
                     id="ejb">

                    <div style="width: 100%; ">
                        <div class="input-group zl">
                            <span class="input-group-addon">前店总额:</span>
                            <input type="text" id="money3" name="example-input1-group1" readonly="readonly"
                                   class="form-control" value="${requestScope.result.zomoreCommoditySaleInmoney}">
                        </div>
                        <div class="input-group zl">
                            <span class="input-group-addon">后院总额:</span>
                            <input type="text" id="money33" name="example-input1-group1" readonly="readonly"
                                   class="form-control" value="${requestScope.result1.zomoreCommoditySaleMoney}">
                        </div>
                        <div class="input-group xj">
                            <span class="input-group-addon">总额:</span>
                            <input type="text" id="money333" name="example-input1-group1" onchange="TotalChange(this)"
                                    <c:if test="${requestScope.result.zomoreCommoditySaleInmoney eq null}">readonly="readonly"</c:if>
                                   class="form-control" value="${requestScope.result.zomoreCommoditySaleInmoney+requestScope.result1.zomoreCommoditySaleMoney}">
                        </div>
                    </div>
                    <div class="row" style="margin-top: 10px;">
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">总计:<font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney+requestScope.result1.zomoreCommoditySaleMoney}</font></span>

                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">前店总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result.zomoreCommoditySaleInmoney}</font>
                        </div>
                        <div class="col-lg-4 col-sm-4">
                            <span style="font-size: 20px;">后院总额:</span>
                            <font style="font-size: 22px; color: #FF5555;">￥${requestScope.result1.zomoreCommoditySaleMoney}</font>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-4 col-md-4 col-sm-4 payfs">
            <div style="max-height: 240px; height: auto; overflow-y: auto;">
                <div class="col-xs-6 col-sm-6 pay-type active" id="xianjin">
                    <div class="pay-select ">现金</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">储值卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">微信</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">银联卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">支付宝</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">预售卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">优惠券</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">其他</div>
                </div>
            </div>

            <div class="col-sm-12" style="padding: 0 10px; margin-top: 10px;">
                <div class="btn btn-danger btn-block  btn-lg">
                    <div class="checkbox checkbox-success checkbox-circle">
                        <input type="checkbox" id="CheckBoxZhs" value="1">
                        <label for="CheckBoxZhs"> 组合付款 </label>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="sk-footer">
    <div class="col-lg-10 col-sm-10 col-md-10">
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="1">
                1
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="2">
                2
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="3">
                3
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="4">
                4
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="5">
                5
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="6">
                6
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="7">
                7
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="8">
                8
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="9">
                9
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="0">
                0
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags num" data-html="00">
                00
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags redbj num" data-html="50">
                50
            </div>
        </div>
        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags redbj num" data-html="100">
                100
            </div>
        </div>


        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
            <div class="select-tags redbj delnums">
                删除
            </div>
        </div>
    </div>


    <div class="col-lg-2 col-md-2 col-sm-2 col-xs-12" style="padding-left:0 ;">

        <div class="price-sure" onclick="submit()">
            确定
        </div>
    </div>
</div>
<!-- 折扣和备注 -->
<div class="zqbz">
    <div class="zq1 zq">
        折扣
    </div>
    <%--    <div class="zq1 bz">
            备注
        </div>--%>
</div>
<!-- 折扣页面 -->
<div class="zq-list zqs col-lg-3 col-sm-3 col-md-3">
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#tab1" data-toggle="tab">
                整单折扣
            </a>
        </li>
        <li><a href="#tab2" data-toggle="tab">优惠卷</a></li>

    </ul>
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="tab1">
            <div class="input-group ">
                <input type="email" id="changeDiscount" name="changeDiscount" class="form-control">
                <span class="input-group-addon">%</span>
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="95">
                95折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="90">
                9折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="85">
                85折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="80">
                8折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="75">
                75折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="70">
                7折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="60">
                6折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="50">
                5折
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="0">
                免单
            </div>
            <div name="col-sm-6" class=" col-sm-6 " title="200">
                去零
            </div>

        </div>
        <div class="tab-pane fade" id="tab2">
            <div class="input-group ">
                <input type="email" id="example-input2-group1" name="example-input2-group1" class="form-control"
                       placeholder="请输入优惠卷">
                <span class="input-group-addon"></span>
            </div>
        </div>

    </div>
    <div class="zq-footer">
        <button class="btn btn-info zq-info " id="changeDiscount1">确定</button>
    </div>

</div>
<!-- 备注 -->
<div class="zq-list bzlist col-lg-3 col-sm-3 col-md-3">
    <div class="input-group ">
        <span class="input-group-addon">预计几天回访</span>
        <input type="email" id="example-input2-group1" name="example-input2-group1" class="form-control"
               placeholder="请输入回访天数">

    </div>
    <div class="bz-content">
        <textarea>请输入</textarea>
    </div>
    <div class="zq-footer">
        <button class="btn btn-info zq-info ">确定</button>
    </div>
</div>
<%--导购弹窗--%>
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
                <h4 class="modal-title" id="myModalLabel5"> 选择导购员 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">

                        <input type="email" id="GuideId" name="GuideId" class="form-control" placeholder="按工员/姓名/手机号码" />
                        <span class="input-group-btn"> <button type="button" class="btn btn-info" id="searchGuide">搜索</button> </span>
                    </div>
                </div>
                <div class="table-fex">
                    <div class="list">
                        <table id="table" data-resizable="true" >
                            <thead>
                            <tr>
                                <th data-field="name">名称</th>
                                <th data-field="id">工号</th>
                                <th data-field="phone">手机号码</th>
                            </tr>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消 </button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-block btn-lg sure8" id="selectGuide"> 选择 </button>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    //默认得到所有导购信息
    $(function(){
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreShoppingGuide/selectAllAjax.do",
            success: function (msg) {
                $("#table").bootstrapTable('removeAll');
                $("#table").bootstrapTable('append', msg);
            }
        });
    })

    $(function () {
        var num=${sessionScope.shoppingguide}+"";
        if(num==1){
            $('#SelectService').modal('show');
        }

    })

    // 选择导购
    $('.daogo').on('click', function () {
        $('#SelectService').modal('show');
    })
    $('#table').bootstrapTable({
        url: 'json/data1.json',
        method: "get",
        checkbox: true,
        onClickRow: function (row, $element) {
            $('.info').removeClass('info');
            $($element).addClass('info');
        },


    })
    //点击导购时触发
    $('#searchGuide').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreShoppingGuide/selectByidAjax.do",
            data: {"GuideId": $('#GuideId').val()},
            success: function (msg) {
                $("#table").bootstrapTable('removeAll');
                $("#table").bootstrapTable('append', msg);
            }
        });
    });

    //回车导购时触发
    $('#GuideId').bind('keypress', function (event) {
        if (event.keyCode == "13") {
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreShoppingGuide/selectByidAjax.do",
                data: {"GuideId": $('#GuideId').val()},
                success: function (msg) {
                    $("#table").bootstrapTable('removeAll');
                    $("#table").bootstrapTable('append', msg);
                }
            });

        }
    });

    $('#selectGuide').click(function () {
        $('#Guide').val($("#table>tbody>tr[class='info']>td:eq(0)").text());
        $('.daogo').text("导购:" + $("#table>tbody>tr[class='info']>td:eq(0)").text());
        $('#SelectService').modal('hide');
    });

    //记录支付方式
    var paytype = 0;
    var Guidename=null;
    function submit() {
        if ($('#Guide').val() != '' && $('#Guide').val() != '没有找到匹配的记录') {
            Guidename = $('#Guide').val();
        }
        //微信和支付宝
        if (paytype == 2 || paytype == 4) {
            //修改销售单据(保存支付方式)
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/upateCommoditSaleType.do",
                data: {
                    "type": paytype,
                    "id": $('#id').val(),
                    "state": 0,
                    "Guidename": Guidename,
                    "money": $('#money').val(),
                    "memberNum": $("#memberNum").val(),
                    "ishouyuan":1
                },
                success: function (msg) {
                    window.location.href = "${basePath}pay/money.do?id=" + $('#id').val() + "&money=" + $('#money').val() + "&actualmoney=" + $('#money333').val();
                }
            });
        } else {
            //当选择储值卡时判断是否有会员或者是否余额是否充值
            if (paytype.toString().search("1") != -1) {
                if ($("#huiyuan").val() == '') {
                    alert("当前不是会员购买商品");
                } else if (Number($("#yuer").val()) < Number($('#money333').val())) {
                    alert("会员储值卡余额不足");
                } else {
                    shoukuan();
                }
            } else {
                shoukuan();
            }
        }
        clean();

    }

    //客显总额
    function TotalChange(obj){
        var allchangeprice = ${sessionScope.zomoreCashierBeforeRight.allchangeprice}+"";
        if (allchangeprice=='0'){
            var allmoney =$("#money").val();
            $(obj).val(allmoney);
            alert("该收银台没有整单改价的权限");
        }else{

            var total= $("#money333").val();
            $.ajax({
                type:"POST",
                url: "${basePath}zomoreCommoditySale/searchByreq.do",
                data:{"req":total},
                success:function(msg){
                    /*alert("发送成功");*/
                }

            });

        }


    }

    //客显清零
    function clean(){

        $.ajax({
            type:"POST",
            url: "${basePath}zomoreCommoditySale/clean.do",

            success:function(msg){
                /*alert("发送成功");*/
            }

        });

    }

    /*ske222222222222222*/
    //不用扫码的收款
    function shoukuan() {
        var ishouyuan =1;
        var memberNum=$("#memberNum").val();
        $.ajax({

            type: "POST",
            url: "${basePath}zomoreCommoditySale/upateCommoditSaleType.do",
            data: {
                "type": paytype,
                "id": $('#id').val(),
                "state": 1,
                "guideName":Guidename,
                "money": $('#money').val(),
                "memberNum": memberNum,
                "ishouyuan": 1
            },
            success: function (msg) {
                //打印凭条
                $.ajax({
                    type: "POST",
                    url: "${basePath}pay/noMoney.do?integral="+msg,
                    data: {
                        "id": $('#id').val(),
                        "money": $('#money').val(),
                        "actualmoney": $('#money333').val(),
                        "guideName": Guidename,
                        "memberNum": memberNum,
                        "ishouyuan": ishouyuan,
                        "changeMoney":$('#money222').val()
                    }, success: function (msg) {
                        window.location.href="${basePath}zomoreServiceCommodity/list1.do";
                    }
                });
            },
            error:function () {
                alert("失败");
            }
        });
    }
    stg();


    function stg() {
        var windwhegiht = $(window).height();
        if (windwhegiht < 800) {
            $('.select-tags').addClass('select-tagst');

        } else {
            $('.select-tags').removeClass('select-tagst');

        }
        $('.sk-main').height($(window).height() - $('.sk-footer').height() - 100);

    }

    window.onresize = function () {
        stg();

    }
    // 输取焦点
    var Checkzh = 0;//定义当前是否组合,默认是没有选中组合
    //定义一个值默认焦点的值;
    var dePrice;
    $('.form-control').focus(function () {
        dePrice = $(this);
        //将当前焦点给这个输入框对像
    });
    //点击数字的时候处理
    $('.num').on('click', function () {
        if (dePrice.val() == '') {
            dePrice.val($(this).attr('data-html'));
        } else {
            dePrice.val(dePrice.val() + $(this).attr('data-html'));
        }
        price();

    })
    $('.delnums').on('click', function () {
        if (dePrice.val() == '') {

            return false;
        } else {
            s = dePrice.val().substring(0, dePrice.val().length - 1);
            dePrice.val(s);
        }
        price();
    });

    function price() {
        var lt = dePrice.parents('.tab-pane').find('.qd').find('.form-control').val();
        var zl = dePrice.parents('.tab-pane').find('.zl').find('.form-control');
        zl.val(parseFloat(dePrice.val() - lt).toFixed(2));
    }

    function changerPrice(event) {
        //console.log(event);
        var lt = $(event).parents('.tab-pane').find('.qd').find('.form-control').val();
        var zl = $(event).parents('.tab-pane').find('.zl').find('.form-control');
        //保留两位小数
        zl.val(parseFloat($(event).val() - lt).toFixed(2));
    }

    //这里是前店后院总额切换的JS
    $('.nav').on('click', function () {
        console.log("1");
        //数据交互在这里实现


    })
    $('#CheckBoxZhs').on('click', function () {
        if ($(this).is(':checked')) {
            Checkzh = 1;

        } else {

            Checkzh = 0;
        }
        console.log(Checkzh);
    })
    //付款的选择
    //第一个
    var before = $("#xianjin");
    //第二个
    var before2;
    //记录是否是刚刚开始组合
    var a = 0;
    //记录选择的付款项目
    var b1, b2;
    $('.pay-type').on('click', function () {
        if (Checkzh == 0) {
            $(this).addClass('active');
            $(this).siblings().removeClass('active');
            $('.xj').find('.input-group-addon').text($(this).find('.pay-select').text() + ":");
            //记录支付方式
            paytype = $(this).index();
            a = 0;
        } else {
            if (a == 0) {
                $(this).siblings().removeClass('active');
                before = $(this);
                b1 = $(this).index();
                a = 1;
            }
            var index = $(this).index();
            $(this).addClass('active');
            var t = $('.payfs').find('.active').length;
            //这里获取到了当前选中的个数;
            if (t > 2) {
                if (before != null) {
                    before.removeClass('active');
                    before = before2;
                    b1 = b2;
                }
                $('.payfs').removeClass('active');
            }
            var t = $('.pay-type').hasClass('active').length;
            before2 = $(this);
            b2 = $(this).index();
            if(b1!=b2){
                paytype=b1+","+b2;
            }
            console.log(index);


        }

    })
    $('.zq').on('click', function () {
        $('.zqs').show(200);
    })
    $('.zq-info').on('click', function () {
        $('.zqs').hide(200);
    })
    $('.bz').on('click', function () {
        $('.bzlist').show(200);
    })
    $('.zq-info').on('click', function () {
        $('.bzlist').hide(200);
    })
    //点击确定打折
    $('#changeDiscount1').click(function () {
        //修改商品折扣
        if ($('#changeDiscount').val() == '') {
            var discounnt = 100;
        } else {
            var discounnt = $('#changeDiscount').val();
        }
        //修改前店金额
        var money1 = $('#resourcemoney').val();
        money1 = money1 * 1 * (discounnt * 1 / 100);
        money1=Number(money1).toFixed(2);
        $('#money1').val(money1);
        //修改收款金额
        $('#money11').val(money1);
        //修改隐藏域的数据
        $('#money').val(money1);
        //修改后院金额
        var money2 = $('#resourcemoney1').val();
        money2 = money2 * 1 * (discounnt * 1 / 100);
        money2=Number(money2).toFixed(2);
        $('#money2').val(money2);
        //修改收款金额
        $('#money22').val(money2);
        //修改总金额
        $('#money3').val(money1);
        $('#money33').val(money2);
        $('#money333').val(Number(Number(money1)+Number(money2)).toFixed(2));
    });
    $("div[name='col-sm-6']").click(function () {//点击打折
        $('.zqs').hide(200);
        if ($(this).attr("title") != '200') {
            //修改商品折扣
            var discounnt = $(this).attr("title");
            //修改前店金额
            var money1 = $('#resourcemoney').val();
            money1 = money1 * 1 * (discounnt * 1 / 100);
            money1=Number(money1).toFixed(2);
            $('#money1').val(money1);
            //修改收款金额
            $('#money11').val(money1);
            //修改隐藏域的数据
            $('#money').val(money1);
            //修改后院金额
            var money2 = $('#resourcemoney1').val();
            money2 = money2 * 1 * (discounnt * 1 / 100);
            money2=Number(money2).toFixed(2);
            $('#money2').val(money2);
            //修改收款金额
            $('#money22').val(money2);
            $('#money222').val(money2);
            //修改总金额
            $('#money3').val(money1);
            $('#money33').val(money2);
            $('#money333').val(Number(Number(money1)+Number(money2)).toFixed(2));
        } else {//去零()
            var money1=$('#money1').val().split(".");
            var money2=$('#money2').val().split(".");
            var money3=$('#money333').val().split(".");
            //修改收款金额
            $('#money1').val(money1[0]);
            $('#money11').val(money1[0]);
            $('#money2').val(money2[0]);
            $('#money22').val(money2[0]);
            $('#money3').val(money1[0]);
            $('#money33').val(money2[0]);
            $('#money333').val(money3[0]);
            //修改隐藏域的数据
            $('#money').val(money1[0]);
        }
    });
</script>

<script>
    document.onkeydown = function (event) {
        var e = event || window.event || arguments.callee.caller.arguments[0];
        //导购员(ctrl+E)
        if (e.keyCode == 69 && e.ctrlKey) {
            $('#SelectService').modal('show');
        }
    };

    function changeMoney2(obj){
        var allchangeprice = ${sessionScope.zomoreCashierBeforeRight.allchangeprice}+"";
        if (allchangeprice=='0'){
            var resourcemoney1 =$("#resourcemoney1").val();
            $(obj).val(resourcemoney1);
            alert("该收银台没有整单改价的权限");
            return false;
        }
        var changeMoney = $(obj).val();

        //后院现价
        $('#money22').val(changeMoney);
        //后院总额
        $('#money33').val(changeMoney);
        //总额
        $('#money333').val(changeMoney);
        //后院总额源
        $("#resourcemoney1").val(changeMoney);
        //修改隐藏域的数据
        $('#money').val(changeMoney);

    }

</script>
</body>
</html>
