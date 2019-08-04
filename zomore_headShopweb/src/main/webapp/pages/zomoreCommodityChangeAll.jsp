<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html ng-app="app" lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">

    <title>商品变动明细列表</title>

    <link href="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="${basePath}assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/responsive.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet"/>
    <link href="${basePath}assets/plugins/select2/select2.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <!--时间选择器-->
    <link href="${basePath}assets/css/wui.min.css" rel="stylesheet" type="text/css">
    <link href="${basePath}assets/css/style.css" rel="stylesheet" type="text/css">

    <script src="${basePath}assets/js/modernizr.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/angular.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/wui-date.js" charset="utf-8"></script>
    <style type="text/css">
        .gd {
            width: 1024px;
            margin-left: 17%;
        }
    </style>

</head>

<body class="fixed-left">
<!-- Begin page -->
<div id="wrapper" class="forced enlarged">
    <!-- 头部开始 -->
    <div class="topbar">

        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="#" class="logo"><img src="${basePath}assets/images/alogo.png"></a>
            </div>
        </div>


        <!-- 头部内容 -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <div class="pull-left">
                        <p style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f">商品变动明细列表</p>
                    </div>
                    <span style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f"
                          id="tonerInfowarning"></span>
                    <ul class="nav navbar-nav navbar-right pull-right" style="padding: 0px;">
                        <li class="dropdown hidden-xs  ">
                            <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light"
                               data-toggle="dropdown" aria-expanded="true">
                                <i class="icon-bell"></i> <span
                                    class="badge badge-xs badge-danger">${sessionScope.warmming.totalCount}</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-lg jiange">
                                <li class="notifi-title">
                                    <span style="margin-left: 10px"> 新消息提醒</span>
                                    <span class="label label-default pull-right">${sessionScope.warmming.totalCount}</span>
                                </li>
                                <li class="list-group nicescroll notification-list">
                                    <c:forEach items="${sessionScope.warmming.items}" var="warmming">
                                        <a href="javascript:void(0);" class="list-group-item">
                                            <div class="media">
                                                <div class="card-body">
                                                    <h5 class="media-heading">库存预警</h5>
                                                </div>
                                                <div>
                                                    您的"${warmming.zomoreCommodityName}"商品
                                                    <br>
                                                    库存已经低于${warmming.zomoreCommodityDownlimit}，请及时补充
                                                </div>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </li>
                                <li>
                                    <a href="${basePath}zomoreCommodityStoreWarning/list.do"
                                       class="list-group-item text-right">
                                        <small class="font-600">查看所有通知</small>
                                    </a>
                                </li>
                            </ul>
                        </li >


                        <li class="hidden-xs" style="margin-top: 10px; margin-left: 20px;">
                            <h4>${sessionScope.shopName}</h4>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><i
                                    class="ti-power-off m-r-5"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="${basePath}pages/zomoreAccount.jsp"><i class="ti-settings m-r-5"></i> 设置</a></li>
                                <li><a href="${basePath}headShop/logout.do"><i class="ti-power-off m-r-5"></i> 退出</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <!-- 头部内容栏结束 -->
    </br>
    <!-- ========== 左侧栏内容 ========== -->
    <c:if test="${sessionScope.role eq 1}">
        <%@include file="../multiplePages/multipleLeftMenu.jsp" %>
    </c:if>
    <c:if test="${sessionScope.role ne 1}">
        <%@include file="leftMenu.jsp" %>
    </c:if>

</div>
<!-- 左侧导航栏结束 -->

<!-- ============================================================== -->
<!-- 右侧内容开始 -->
<!-- ============================================================== -->

<div class="gd" style="height: 100%; margin-top: 80px;">
    <div class="row">
        <div class="col-sm-12">
            <div class="card-box">
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12" style="text-align: center;">
                            <h4>变动明细详情</h4>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="col-sm-3 col-sm-3">
                                <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                        onclick="fanhui()">返回
                                </button>
                            </div>
                        </div>
                    </div>
                    <div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
                    <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered " style="width: 1880px;">
                        <thead>
                        <tr>
                            <th data-field="xh" data-align="center">序号</th>
                            <th data-field="sj" data-align="center">时 间</th>
                            <th data-field="tm" data-align="center">商品条码</th>
                            <th data-field="mc" data-align="center">商品名称</th>
                            <th data-field="lx" data-align="center">类 型</th>
                            <th data-field="sy" data-align="center">收银台</th>
                            <th data-field="hy" data-align="center">会 员</th>
                            <th data-field="sl" data-align="center">商品数量</th>
                            <th data-field="jg" data-align="center">零售价</th>
                            <th data-field="ss" data-align="center">实收金额</th>
                            <th data-field="zr" data-align="center">折让金额</th>
                            <th data-field="js" data-align="center">技师导购</th>
                            <th data-field="fk" data-align="center">付款方式</th>
                        </tr>
                        </thead>

                        <tbody>

                        <c:forEach items="${requestScope.result}" var="result" varStatus="step">
                            <tr>
                                <td>${step.count}</td>
                                <td>
                                    <fmt:formatDate value="${result.time}"
                                                    pattern="yyyy-MM-dd"></fmt:formatDate>
                                </td>
                                <td>${result.code}</td>
                                <td>${result.name}</td>
                                <td>${result.type}</td>
                                <td>${result.syt}</td>
                                <td>${result.member}</td>
                                <td>${result.num}</td>
                                <td>${result.sale}</td>
                                <td>${result.shishou}</td>
                                <td>${result.zherang}</td>
                                <td>${result.daogou}</td>
                                <td>${result.paytype}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>


<script>
    var resizefunc = [];
</script>

<script type="text/javascript">
    var app = angular.module('app', ["wui.date"]);
</script>


<!-- jQuery  -->
<script src="${basePath}assets/js/jquery.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<script src="${basePath}assets/js/detect.js"></script>
<script src="${basePath}assets/js/fastclick.js"></script>
<script src="${basePath}assets/js/jquery.slimscroll.js"></script>
<script src="${basePath}assets/js/jquery.blockUI.js"></script>
<script src="${basePath}assets/js/waves.js"></script>
<script src="${basePath}assets/js/wow.min.js"></script>
<script src="${basePath}assets/js/jquery.nicescroll.js"></script>
<script src="${basePath}assets/js/jquery.scrollTo.min.js"></script>


<!--bootstrapSelect-->
<script src="${basePath}assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"
        type="text/javascript"></script>

<!--bootstrap Example-->

<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>

<script src="${basePath}assets/pages/jquery.bs-table.js"></script>

<script src="${basePath}assets/plugins/bootstrap-tagsinput/dist/bootstrap-tagsinput.min.js"></script>
<script src="${basePath}assets/plugins/switchery/dist/switchery.min.js"></script>
<script type="text/javascript" src="${basePath}assets/plugins/multiselect/js/jquery.multi-select.js"></script>

<script src="${basePath}assets/js/jquery.core.js"></script>
<script src="${basePath}assets/js/jquery.app.js"></script>
<script type="text/javascript">
    function fanhui() {
        var role=${sessionScope.role}+"";
        if(role=='1'){
            window.location.href="${basePath}multipleCommodityStore/selectCommodityChange.do";
        }
        else {
            window.location.href="${basePath}zomoreCommodityChange/list.do";
        }


    }
</script>

<script>
    jQuery(document).ready(function () {

        //advance multiselect start
        $('#my_multi_select3').multiSelect({
            selectableHeader: "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
            selectionHeader: "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
            afterInit: function (ms) {
                var that = this,
                    $selectableSearch = that.$selectableUl.prev(),
                    $selectionSearch = that.$selectionUl.prev(),
                    selectableSearchString = '#' + that.$container.attr('id') + ' .ms-elem-selectable:not(.ms-selected)',
                    selectionSearchString = '#' + that.$container.attr('id') + ' .ms-elem-selection.ms-selected';

                that.qs1 = $selectableSearch.quicksearch(selectableSearchString)
                    .on('keydown', function (e) {
                        if (e.which === 40) {
                            that.$selectableUl.focus();
                            return false;
                        }
                    });

                that.qs2 = $selectionSearch.quicksearch(selectionSearchString)
                    .on('keydown', function (e) {
                        if (e.which == 40) {
                            that.$selectionUl.focus();
                            return false;
                        }
                    });
            },
            afterSelect: function () {
                this.qs1.cache();
                this.qs2.cache();
            },
            afterDeselect: function () {
                this.qs1.cache();
                this.qs2.cache();
            }
        });

        // Select2
        $(".select2").select2();

        $(".select2-limiting").select2({
            maximumSelectionLength: 2
        });

        $('.selectpicker').selectpicker();
        $(":file").filestyle({input: false});
    });

    //Bootstrap-TouchSpin
    $(".vertical-spin").TouchSpin({
        verticalbuttons: true,
        verticalupclass: 'ion-plus-round',
        verticaldownclass: 'ion-minus-round'
    });
    var vspinTrue = $(".vertical-spin").TouchSpin({
        verticalbuttons: true
    });
    if (vspinTrue) {
        $('.vertical-spin').prev('.bootstrap-touchspin-prefix').remove();
    }

    $("input[name='demo1']").TouchSpin({
        min: 0,
        max: 100,
        step: 0.1,
        decimals: 2,
        boostat: 5,
        maxboostedstep: 10,
        postfix: '%'
    });
    $("input[name='demo2']").TouchSpin({
        min: -1000000000,
        max: 1000000000,
        stepinterval: 50,
        maxboostedstep: 10000000,
        prefix: '$'
    });
    $("input[name='demo3']").TouchSpin();
    $("input[name='demo3_21']").TouchSpin({
        initval: 40
    });
    $("input[name='demo3_22']").TouchSpin({
        initval: 40
    });

    $("input[name='demo5']").TouchSpin({
        prefix: "pre",
        postfix: "post"
    });
    $("input[name='demo0']").TouchSpin({});


    //Bootstrap-MaxLength
    $('input#defaultconfig').maxlength()

    $('input#thresholdconfig').maxlength({
        threshold: 20
    });

    $('input#moreoptions').maxlength({
        alwaysShow: true,
        warningClass: "label label-success",
        limitReachedClass: "label label-danger"
    });

    $('input#alloptions').maxlength({
        alwaysShow: true,
        warningClass: "label label-success",
        limitReachedClass: "label label-danger",
        separator: ' out of ',
        preText: 'You typed ',
        postText: ' chars available.',
        validate: true
    });

    $('textarea#textarea').maxlength({
        alwaysShow: true
    });

    $('input#placement').maxlength({
        alwaysShow: true,
        placement: 'top-left'
    });
</script>

</body>
</html>