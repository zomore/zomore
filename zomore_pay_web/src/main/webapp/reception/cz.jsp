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
    <title>择沐前台</title>
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
<header class="header com-bj">
    <%--<a href="${basePath}reception/index.jsp">--%>
   <a href="#" onclick="javascript :history.back(-1);">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">
        <a class="btn btn-default btn-tg btns daogo">导购:</a>
        会员充值
        <a class="btn btn-default btn-user btns">收银台:${sessionScope.cashierName}</a>
        <!-- <span><i class="fa  fa-gears"></i>设置</span> -->
    </div>
</header>
<div class="sk-main">
    <form id="FormSubmit">
        <%--会员名称--%>
        <input type="hidden" name="memberName" value="${requestScope.member.memberMemberidname}">
        <%--会员号--%>
        <input type="hidden" name="memberNum" value="${requestScope.member.memberNumber}">
        <%--门店--%>
        <input type="hidden" name="shop" value="${sessionScope.shopName}">
        <%--收银台--%>
        <input type="hidden" name="cashier" value="${sessionScope.cashierName}">
        <%--导购员--%>
        <input type="hidden" name="guide" id="guide" value="">
        <%--充值项目名称--%>
        <input type="hidden" id="project" name="project" value="">
        <%--支付类型--%>
        <input type="hidden" name="type" value="现金">
        <div class="sk-p-20">
            <div class="col-lg-12 col-md-12 col-sm-12 stab">
                <ul id="myTab" class="nav  tabs-vertical">
                    <li class="active"><a href="#home" data-toggle="tab">会员充值</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="home">
                        <div style="width: 100%; ">
                            <div class="input-group qd">
                                <span class="input-group-addon">充值金额:</span>
                                <input type="text" id="inputmoney" name="inputmoney" value="0"
                                       class="form-control">
                            </div>
                            <div class="input-group xj">
                                <span class="input-group-addon">赠送金额:</span>
                                <input autofocus="autofocus" placeholder="" onchange="changerPrice(this)" type="text"
                                       id="givemoney" name="givemoney" class="form-control" value="0">
                            </div>
                        </div>
                    </div>
                    <div class="list" style="width: 100%; margin-top: 10px; height: 265px; overflow-y: auto;">
                        <c:forEach items="${requestScope.result}" var="result">
                            <a href="#" class="list-group-item" style="text-align: left;"
                               title="${result.zomoreMemberInputruleName}"
                               onclick="selcct('${result.zomoreMemberInputruleInmoney}','${result.zomoreMemberInputruleGivemoney}','${result.zomoreMemberInputruleName}')">
                                充${result.zomoreMemberInputruleInmoney}元送${result.zomoreMemberInputruleGivemoney}元 </a>
                        </c:forEach>
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
    </form>


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
                充值
            </div>
        </div>
    </div>
</div>
<%--导购弹窗--%>
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel5"> 选择导购员 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <input type="email" id="GuideId" name="GuideId" class="form-control" placeholder="按工员/姓名/手机号码"/>
                        <span class="input-group-btn"> <button type="button" id="searchGuide"
                                                               class="btn btn-info">搜索</button> </span>
                    </div>
                </div>
                <div class="table-fex">
                    <div class="list">
                        <table id="table" data-resizable="true">
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
                    <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-block btn-lg sure8" id="selectGuide"> 选择</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
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

    };
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

    });
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
        zl.val(dePrice.val() - lt);
    }

    function changerPrice(event) {
        //console.log(event);
        var lt = $(event).parents('.tab-pane').find('.qd').find('.form-control').val();
        var zl = $(event).parents('.tab-pane').find('.zl').find('.form-control');
        zl.val($(event).val() - lt);
    }

    //这里是总额切换的JS
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
    $('.pay-type').on('click', function () {

        if (Checkzh == 0) {
            $(this).addClass('active');
            $(this).siblings().removeClass('active');
            $('.xj').find('.input-group-addon').text($(this).find('.pay-select').text() + ":");
        } else {
            var index = $(this).index();
            //$(this).addClass('active');
            //var t = $('.payfs').find('.active').length;
            //这里获取到了当前选中的个数;
            //if(t>2){
            //	$('.payfs').removeClass('active');
            //}
            //var t=$('.pay-type').hasClass('active').length;
            console.log(index);
        }

    });
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
    });


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
    });

    $(function () {
        var num=${sessionScope.shoppingguide}+"";
        if(num==1){
            $('#SelectService').modal('show');
        }

    });

    //选择导购员
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

    });
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
        $('#guide').val($('#table>tbody>tr>td:eq(0)').text());

        $('.daogo').text("导购:" + $('#table>tbody>tr>td:eq(0)').text());
        $('#SelectService').modal('hide');
    });

    //选择充值规则
    function selcct(money1, money2, project) {
        $('#inputmoney').val(money1);
        $('#givemoney').val(money2);
        $('#project').val(project);
    }

    //点击充值
    function submit() {
        var inputmoney = $("#inputmoney").val();
        if(inputmoney==0){
            alert("充值金额不能为0");
            return false;
        }
        var memberinput = ${sessionScope.zomoreCashierBeforeRight.memberinput}+"";
        if (memberinput=='0'){
            alert("该收银台没有会员充值的权限");
            return false;
        }
        if(inputmoney<0){
            var negativeinput = ${sessionScope.zomoreCashierBeforeRight.negativeinput}+"";
            if (negativeinput=='0'){
                alert("该收银台没有负数反向充值的权限");
                return false;
            }
        }

        $.ajax({
            type: "POST",
            url: "${basePath}zomoreMemberInputrule/cz1.do",
            data: $('#FormSubmit').serialize(),
            success: function (msg) {
                if (msg == "success") {
                    alert("充值成功");
                    window.location.href = "${basePath}reception/list.do";

                } else {
                    alert("充值失败");
                }
            },
            error: function () {
                alert("充值失败");
            }
        });
    }
</script>
</body>
</html>
