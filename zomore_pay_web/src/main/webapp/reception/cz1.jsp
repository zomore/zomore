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
    <title>充值</title>
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
    <a href="${basePath}reception/index.jsp">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">
        <a class="btn btn-default btn-tg btns">导购:</a>
        会员充值
        <a class="btn btn-default btn-user btns">收银台:1001</a>
        <!-- <span><i class="fa  fa-gears"></i>设置</span> -->
    </div>

</header>
<div class="sk-main">
    <div class="sk-p-20">
        <div class="col-lg-8 col-md-8 col-sm-8 stab">
            <ul id="myTab" class="nav  tabs-vertical">
                <li class="active">
                    <a href="#home" data-toggle="tab">
                        会员充值
                    </a>
                </li>

            </ul>
            <%--充值提交表单		--%>
            <form action="" method="post">
                <%--会员名称--%>
                <input type="hidden" name="memberName" value="${requestScope.member.memberMemberidname}">
                <%--会员号--%>
                <input type="hidden" name="memberNum" value="${requestScope.member.memberNumber}">
                <%--门店--%>
                <input type="hidden" name="shop" value="${sessionScope.shopName}">
                <%--收银台--%>
                <input type="hidden" name="cashier" value="${sessionScope.cashierName}">
                <%--导购员--%>
                <input type="hidden" name="guide" value="">
                <%--充值项目名称--%>
                <input type="hidden" name="project" value="">
                <%--支付类型--%>
                <input type="hidden" name="type" value="">

                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="home">
                        <div style="width: 100%; ">
                            <div class="input-group qd">
                                <span class="input-group-addon">充值金额:</span>
                                <input type="text" readonly="readonly" name="inputmoney" value=""
                                       class="form-control">
                            </div>
                            <div class="input-group xj">
                                <span class="input-group-addon">赠送金额:</span>
                                <input autofocus="autofocus" placeholder="" onchange="changerPrice(this)" type="text"
                                       name="givemoney" class="form-control">
                            </div>

                        </div>
                    </div>
                </div>
            </form>

        </div>
        <div class="col-lg-4 col-md-4 col-sm-4 payfs">
            <div style="max-height: 240px; height: auto; overflow-y: auto;">
                <div class="col-xs-6 col-sm-6 pay-type active">
                    <div class="pay-select ">现金</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">支付宝</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">刷卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">储值卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">微信</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">刷卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">储值卡</div>
                </div>
                <div class="col-xs-6 col-sm-6 pay-type">
                    <div class="pay-select">微信</div>
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
    <div class="tab-content">
        <div style="width: 100%; ">

            <c:forEach items="${requestScope.result}" var="result">
                <div class="col-lg-4 col-md-4 col-sm-4 stab">
                    <ul class="nav  tabs-vertical" style="width: 300px;">
                        <li class="active">
                            <a data-toggle="tab" title="${result.zomoreMemberInputruleName}">
                                充${result.zomoreMemberInputruleInmoney}元送${result.zomoreMemberInputruleGivemoney}元 </a>
                        </li>
                    </ul>
                </div>
            </c:forEach>
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

        <div class="price-sure">
            充值
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
</script>
</body>
</html>
