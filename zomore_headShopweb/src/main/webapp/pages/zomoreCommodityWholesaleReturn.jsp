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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">

    <title>批发退货</title>

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
    <!--[if lt IE 9]>
    <![endif]-->
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <script src="${basePath}assets/js/modernizr.min.js"></script>
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
                        <p style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f">批发退货</p>
                    </div>

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
                                <li><a href="${basePath}headShop/logout.do"><i class="ti-power-off m-r-5"></i> 退出</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    </br>
    <!-- 头部内容栏结束 -->


    <!-- ========== 左侧栏内容 ========== -->

    <div class="left side-menu">
        <%@include file="leftMenu.jsp" %>
    </div>
</div>
<!-- 左侧导航栏结束 -->

<!-- ============================================================== -->
<!-- Start right Content here -->
<!-- ============================================================== -->
</div>
<div class="gd" style="height: 1088px; margin-top: 67px;">
    <div class="row">
        <div class="col-sm-12">
            <div class="card-box">
                <div class="col-sm-5">
                    <div class="button-list">
                        <!-- Full width modal -->
                    </div>
                </div>
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="col-sm-7 col-sm-7">
                                <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                        data-target="#zomore-call">新增
                                </button>
                                <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                        data-target="#zomore">保存
                                </button>
                                <button type="button" class="btn btn-white waves-effect print-link no-print"
                                        onclick="jQuery('#ele3').print()">打印
                                </button>
                            </div>
                        </div>

                    </div>
                    <div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
                    <div class="row" id="ele3" class="example example-3">
                        <div class="row">
                            <div class="col-lg-12 col-sm-12" style="text-align: center;">
                                <h3 class="m-t-0 header-title">
                                    <b>NO(退货单号):<u>${requestScope.wholesale.zomoreCommodityWholesaleId}</u></b>
                                </h3>
                            </div>
                        </div>
                        </br>


                        <div class="row">
                            <div class="col-lg-12 col-sm-12">
                                <b style="margin-left: 3%;">制单日期：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleDatetime!=null}">
                                        <u><fmt:formatDate
                                                value="${requestScope.wholesale.zomoreCommodityWholesaleDatetime}"
                                                pattern="yyyy年MM月dd日"></fmt:formatDate></u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleDatetime==null}">
                                        ______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 5%;">发货仓库：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleAddress!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesaleAddress}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleAddress==null}">
                                        ______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 10%;">制 单
                                    人：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePeople1!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesalePeople1}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePeople1==null}">
                                        _______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 5%;">审 核
                                    员：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePeople2!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesalePeople2}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePeople2==null}">
                                        ______________________
                                    </c:if>
                                </b>
                            </div>
                        </div>
                        </br>

                        <div class="row">
                            <div class="col-lg-12 col-sm-12">
                                <b style="margin-left: 3%;">客户名称：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCustomer!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesaleCustomer}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCustomer==null}">
                                        ______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 5%;">联系电话：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePhone!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesalePhone}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesalePhone==null}">
                                        ______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 10%;">合计金额：
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleAllprivice!=null}">
                                        <u>${requestScope.wholesale.zomoreCommodityWholesaleAllprivice}</u>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleAllprivice==null}">
                                        ______________________
                                    </c:if>
                                </b>
                                <b style="margin-left: 5%;">大写金额：<u><span id="recovermoney"></span></u></b>
                            </div>
                        </div>
                        </br>

                        <div class="row">
                            <div class="col-lg-12 col-sm-12">
                                <b style="float: right;margin-right: 3%;">制表日期:
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleDatetime!=null}">
                                        <fmt:formatDate
                                                value="${requestScope.wholesale.zomoreCommodityWholesaleDatetime}"
                                                pattern="yyyy年MM月dd日"></fmt:formatDate>
                                    </c:if>
                                    <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleDatetime==null}">
                                        ______________________
                                    </c:if>
                                </b>
                            </div>
                        </div>

                        <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered"
                               style="width: 98%; margin-left:1%; margin-right: 1%; font-size: 10px;font-family: inherit;">
                            <thead>
                            <thead>
                            <tr>
                                <th class="no-print" data-field="xuhao" data-sortable="true">序号</th>
                                <th data-field="tiaoma" data-sortable="true">商品条码</th>
                                <th data-field="name" data-sortable="true">商品名称</th>
                                <th data-field="guige" data-align="center">规格</th>
                                <th data-field="danwei" data-align="center">单位</th>
                                <th data-field="shuliang" data-sortable="true">数量</th>
                                <th data-field="zengsong" data-sortable="true">赠送数量</th>
                                <th data-field="jiecun" data-sortable="true">结存数量</th>
                                <th data-field="danjia" data-align="center">单价</th>
                                <th data-field="lingshou" data-align="center">零售价</th>
                                <th data-field="xiaoji" data-align="center">金额小计</th>
                                <th data-field="beizhu" data-align="center">备注</th>
                            </tr>
                            </thead>

                            <tbody style="height: 100%;">
                            <c:forEach items="${requestScope.wholesaleCommodity}" var="wholesaleCommodity"
                                       varStatus="stept">
                                <tr>
                                    <td class="no-print">${stept.count}</td>
                                    <td>${wholesaleCommodity.zomoreCommodityCode}</td>
                                    <td>${wholesaleCommodity.zomoreCommodityName}</td>
                                    <td>${wholesaleCommodity.zomoreCommoditySpecifications}</td>
                                    <td>${wholesaleCommodity.zomoreCommodityMain}</td>
                                    <td name="a1">
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState=='0'}">
                                            <a style="color: #0ab5d4" onclick="change()"
                                               name="${wholesaleCommodity.zomoreCommodityId}">${wholesaleCommodity.zomoreCommodityWholesaleCommodityNum}</a><input
                                                style="width: 80px;height: 25px" type="hidden" name="a1">
                                        </c:if>
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState!='0'}">
                                            <a name="aa"> ${wholesaleCommodity.zomoreCommodityWholesaleCommodityNum}</a>
                                        </c:if>

                                    </td>
                                    <td name="a3">
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState=='0'}">
                                            <a style="color: #0ab5d4" onclick="change1()"
                                               name="${wholesaleCommodity.zomoreCommodityId}">${wholesaleCommodity.zomoreCommodityWholesaleCommodityGivenum}</a><input
                                                style="width: 80px;height: 25px" type="hidden" name="a3">
                                        </c:if>
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState!='0'}">
                                            <a name="aa"> ${wholesaleCommodity.zomoreCommodityWholesaleCommodityGivenum}</a>
                                        </c:if>
                                    </td>
                                    <td>${wholesaleCommodity.zomoreCommodityStore}</td>
                                    <td>
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState=='0'}">
                                            <a style="color: #0ab5d4" onclick="change1()"
                                               name="${wholesaleCommodity.zomoreCommodityId}">${wholesaleCommodity.zomoreCommodityWholesaleCommodityOneprice}</a><input
                                                style="width: 80px;height: 25px" type="hidden" name="a2">
                                        </c:if>
                                        <c:if test="${requestScope.wholesale.zomoreCommodityWholesaleCommodityState!='0'}">
                                            ${wholesaleCommodity.zomoreCommodityWholesaleCommodityOneprice}
                                        </c:if>
                                    </td>
                                    <td>${wholesaleCommodity.zomoreCommodityOut}</td>
                                    <td>${wholesaleCommodity.zomoreCommodityWholesaleCommodityAllprice}</td>
                                    <td>${wholesaleCommodity.zomoreCommodityWholesaleCommodityMeno}</td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><span id="a1"></span></td>
                                <td><span id="a3"></span></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--Custom Toolbar-->
<!--===================================================-->

</div> <!-- content -->

</div>
<!-- ============================================================== -->
<!-- End Right content here -->
<!-- ============================================================== -->

</div>
</div>
<!-- END wrapper -->


<!-- 填写单据并选择批发退货商品 -->
<form action="${basePath}zomoreCommodityWholesale/insert.do" method="post">
    <input type="hidden" name="zomoreCommodityWholesaleCommodityType" value="1">
    <div id="zomore-call" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
         aria-hidden="true" style="width: 1024px;margin-left: 15%; display: none;">
        <div class="modal-dialog modal-full">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="full-width-modalLabel1">选择商品</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="row">
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px; color: black;">制单日期</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <input type="text" id="zomoreCommodityWholesaleDatetime" class="form-control" name="zomoreCommodityWholesaleDatetime">
                                </div>
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px;color: black;">发货仓库</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <input type="text"  class="form-control"
                                           name="zomoreCommodityWholesaleAddress" 
                                           readonly
                                           value="${sessionScope.shopName}">
                                </div>
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px;float: right;color: black;">制单员</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <%--<input class="form-control" id="zomoreCommodityWholesalePeople1"
                                           name="zomoreCommodityWholesalePeople1" type="text">--%>
                                    <select class="form-control" name="zomoreCommodityWholesalePeople1">
                                        <option value="">请选择</option>
                                        <c:forEach items="${requestScope.memberGuideList}" var="memberGuideList">
                                            <option value="${memberGuideList.shoppingGuideName}"
                                                    <c:if test="${memberGuideList.shoppingGuideName==requestScope.guide}">
                                                        selected
                                                    </c:if>

                                            >${memberGuideList.shoppingGuideName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px;color: black;">审核员：</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <input class="form-control" id="zomoreCommodityWholesalePeople2"
                                           name="zomoreCommodityWholesalePeople2" type="text">
                                </div>
                            </div>
                            </br>

                            <div class="row" style="margin-bottom: 10px;">
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px;color: black;">客户名称</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <%--<input class="form-control" id="zomoreCommodityWholesaleCustomer"
                                           name="zomoreCommodityWholesaleCustomer" type="text">--%>
                                    <select class="form-control" name="zomoreCommodityWholesaleCustomer">
                                        <option value="">请选择</option>
                                        <c:forEach items="${requestScope.customerList}" var="customer">
                                            <option value="${customer.name}">${customer.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="col-sm-1 col-sm-1"><p
                                        style="margin-top: 9px; margin-bottom: 0px;color: black;">联系电话</p>
                                </div>
                                <div class="col-sm-2 col-sm-2">
                                    <input class="form-control" id="zomoreCommodityWholesalePhone"
                                           name="zomoreCommodityWholesalePhone" type="text">
                                </div>
                            </div>
                        </div>
                        </br>

                        <div class="row" style="margin-bottom: 10px;">
                            <div class="col-sm-7 col-sm-7"></div>
                            <div class="col-sm-2 col-sm-2">
                                <%--    <select class="form-control select2" id="selectBytype">
                                        <option value="">商品分类</option>
                                        <c:forEach items="${requestScope.commodityCategoryresult}"
                                                   var="commodityCategoryresult">
                                            <option value="${commodityCategoryresult.zomoreCommodityCategoryName}">${commodityCategoryresult.zomoreCommodityCategoryName}</option>
                                        </c:forEach>
                                    </select>
    --%>

                                <select class="form-control select2" name="zomoreCommodityType" id="selectBytype">
                                    <option value="">商品分类</option>
                                    <c:forEach items="${requestScope.commodityCategoryresult}" var="Type">
                                        <c:if test="${Type.zomoreCommodityCategoryParentid=='0'}">
                                            <option value="${Type.zomoreCommodityCategoryName}"
                                                    <c:if test="${requestScope.type==Type.zomoreCommodityCategoryName}">selected</c:if>>
                                                    ${Type.zomoreCommodityCategoryName}</option>
                                            <c:forEach items="${requestScope.commodityCategoryresult}" var="Type1">
                                                <c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
                                                    <option value="${Type1.zomoreCommodityCategoryName}"
                                                            <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
                                                        &nbsp;&nbsp; ${Type1.zomoreCommodityCategoryName}</option>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="col-sm-3 col-sm-3">
                                <div class="input-group">
                                    <input type="text" id="code" name="code" class="form-control"
                                           placeholder="条码/名称/拼音码">
                                    <span class="input-group-btn">
                                    <button type="button" class="btn btn-white waves-effect"
                                            style="padding: 7px 12px;
                                            onclick="search()">查询</button>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div style="height: 300px; overflow-y: auto;">
                        <table id="demo-custom-toolbar1" data-toggle="table" class="table-bordered ">
                            <thead>
                            <tr>
                                <th><input type="checkbox" id="selAll" onclick="doSelectAll()"/></th>
                                <th data-field="tiaoma" data-sortable="true">商品条码</th>
                                <th data-field="name" data-sortable="true">商品名称</th>
                                <th data-field="kucun" data-sortable="true">库存</th>
                                <th data-field="pifa" data-sortable="true">批发价</th>
                                <th data-field="lingshou" data-sortable="true">零售价</th>
                                <th data-field="guige" data-sortable="true">商品规格</th>
                                <th data-field="danwei" data-align="center">商品单位</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach items="${requestScope.commodityresult}" var="result">
                                <tr>
                                    <td><input type="checkbox" name="ids" value="${result.zomoreCommodityId}"/></td>
                                    <td>${result.zomoreCommodityCode}</td>
                                    <td>${result.zomoreCommodityName}</td>
                                    <td>${result.zomoreCommodityStore}</td>
                                    <td>${result.zomoreCommodityOutall}</td>
                                    <td>${result.zomoreCommodityOut}</td>
                                    <td>${result.zomoreCommoditySpecifications}</td>
                                    <td>${result.zomoreCommodityMain}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        </div>
                    </div>
                    </br>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关 闭</button>
                        <button type="submit" class="btn btn-white waves-effect"> 确 定</button>

                    </div><!-- /.modal-content -->
                </div><!-- /.modal --><!-- /.modal -->
            </div><!-- /.modal --><!-- /.modal -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal --><!-- /.modal -->
</form>
<!-- 审核批发单据 -->
<form action="${basePath}zomoreCommodityWholesale/insertWholesale.do" method="get">
    <div id="zomore" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
         aria-hidden="true" style="width: 1024px;margin-left: 15%; display: none;">
        <div class="modal-dialog modal-full">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="full-width-modalLabel">审核批发单据</h4>
                </div>
                <input type="hidden" name="id" value="${sessionScope.wholesaleOrderId}">
                <div class="modal-body">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="row">
                                <div class="col-sm-12 col-sm-12"><p
                                        style="margin-top: 9px; margin-bottom: 0px; color: black">
                                    请核对改批发单据数据无误后再进行确认！</p></div>
                            </div>
                        </div>
                    </div>
                    </br>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关 闭</button>
                        <button type="submit" class="btn btn-white waves-effect"> 确 定</button>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal --><!-- /.modal -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal --><!-- /.modal -->
    </div>
</form>
<input type="hidden" id="money" value="${requestScope.wholesale.zomoreCommodityWholesaleAllprivice}">
<script type="text/javascript">
    var app = angular.module('app', ["wui.date"]);
</script>
<script>
    var resizefunc = [];
</script>
<!-- jQuery  -->
<script src="${basePath}assets/js/jquery.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<script src="${basePath}assets/js/jquery.core.js"></script>

<!--bootstrapSelect-->
<script src="${basePath}assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"
        type="text/javascript"></script>

<!--bootstrap Example-->

<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${basePath}assets/pages/jquery.bs-table.js"></script>
<script src="${basePath}assets/js/jQuery.print.js"></script>

<!--新的时间选择-->
<script src="${basePath}assets/laydate/laydate.js"></script>
<script>
    //获取当前时间戳
    var now = new Date();
    var timeYear=now.getFullYear();
    var timeMonth = now.getMonth() + 1;
    var timeDay = now.getDate();
    var nowTime1=timeYear + '-' + addZero(timeMonth) + '-' + addZero(timeDay);
    //时间选择器
    var timeChoose; //用户选择的时间
    laydate.render({
        elem: '#zomoreCommodityWholesaleDatetime',
        value: new Date(nowTime1), //参数即为：当前的时间戳
        type: 'date',
        done: function(value, date, endDate){
            var value3 = document.getElementById('zomoreCommodityWholesaleDatetime').value; //
            console.log(value3)
            timeChoose = value3;
        }
    });

    //补零操作
    function addZero(num) {
        if (parseInt(num) < 10) {
            num = '0' + num;
        }
        return num;
    }
</script>

<script>
    $("tbody td[name='a1'] a").each(function () {
        $('#a1').text($('#a1').text() * 1 + $(this).text() * 1);
    });
    $("tbody td[name='a3'] a").each(function () {
        $('#a3').text($('#a3').text() * 1 + $(this).text() * 1);
    });
    $(document).ready(function () {
        //修改规则
        $("a").click(function () {
            if ($(this).attr("name") != 'aa') {
                var Waring = $(this);
                Waring.siblings('input').attr("type", "text");
                Waring.siblings('input').attr("value", Waring.text());
                Waring.siblings('input').focus();
                Waring.siblings('input').focusout(function () {
                    Waring.text(Waring.siblings('input').val());
                    Waring.siblings('input').attr("type", "hidden")
                });
                $(this).text("");
                Waring.siblings('input').change(function () {
                    if ($(this).attr("name") == 'a1') {
                        $.ajax({
                            type: "POST",
                            url: "${basePath}zomoreCommodityWholesale/updateWholesale.do",
                            data: {"commodityid": Waring.attr("name"), "num": Waring.siblings('input').val()},
                            success: function (msg) {
                                if (msg != 'success') {
                                    alert("修改数量失败");
                                } else {
                                    window.location.reload();
                                }

                            },
                            error: function () {
                                alert("修改数量失败");
                                window.location.reload();
                            }
                        });
                    } else if ($(this).attr("name") == 'a2') {
                        $.ajax({
                            type: "POST",
                            url: "${basePath}zomoreCommodityWholesale/updateWholesaleprice.do",
                            data: {"commodityid": Waring.attr("name"), "price": Waring.siblings('input').val()},
                            success: function (msg) {
                                if (msg != 'success') {
                                    alert("修改单价失败");
                                } else {
                                    window.location.reload();
                                }

                            },
                            error: function () {
                                alert("修改单价失败");
                                window.location.reload();
                            }


                        });
                    } else if ($(this).attr("name") == 'a3') {
                        $.ajax({
                            type: "POST",
                            url: "${basePath}zomoreCommodityWholesale/updateWholesalegivenum.do",
                            data: {"commodityid": Waring.attr("name"), "num": Waring.siblings('input').val()},
                            success: function (msg) {
                                if (msg != 'success') {
                                    alert("修改赠送数量失败");
                                } else {
                                    window.location.reload();
                                }

                            },
                            error: function () {
                                alert("修改赠送数量失败");
                                window.location.reload();
                            }

                        });
                    }
                });
            }
        });
    });
</script>
<script type='text/javascript'>
    //全选、全反选
    function doSelectAll() {
        $("input[name=ids]").prop("checked", $("#selAll").is(":checked"));
    }

    function search() {
        //商品分类
        var checkText = $("#selectBytype").find("option:selected").val();
        var code = $("#code").val();
        /*
                $('#demo-custom-toolbar1 td').remove();*/
        var tr;
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/selectBytypeAndCode.do",
            data: {"type": checkText, "code": code},
            success: function (msg) {
                $('#demo-custom-toolbar1 td').remove();
                /*alert(JSON.stringify(msg));*/
                for (var i = 0; i < msg.length; i++) {
                    tr = "<tr>\n" +
                        "<td><input type=\"checkbox\" name=\"ids\" value=\"" + msg[i].zomoreCommodityId + "\"/></td>\n" +
                        "<td>" + msg[i].zomoreCommodityCode + "</td>\n" +
                        "<td>" + msg[i].zomoreCommodityName + "</td>\n" +
                        "<td>" + msg[i].zomoreCommodityStore + "</td>\n" +
                        "<td>" + msg[i].zomoreCommodityOutall + "</td>\n" +
                        "<td>" + msg[i].zomoreCommodityOut + "</td>\n" +
                        "<td>" + msg[i].zomoreCommoditySpecifications + "</td>\n" +
                        "<td>" + msg[i].zomoreCommodityMain + "</td>\n" +
                        "</tr>";
                    $('#demo-custom-toolbar1').append(tr);
                }
            }
        });


    }

    var money = $('#money').val();
    if (money != "") {
        $('#recovermoney').text(convertCurrency(money));
    }else {
        $('#recovermoney').text("______________________");
    }

    //数字转繁体中文
    function convertCurrency(money) {
        //汉字的数字
        var cnNums = new Array('零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖');
        //基本单位
        var cnIntRadice = new Array('', '拾', '佰', '仟');
        //对应整数部分扩展单位
        var cnIntUnits = new Array('', '万', '亿', '兆');
        //对应小数部分单位
        var cnDecUnits = new Array('角', '分', '毫', '厘');
        //整数金额时后面跟的字符
        var cnInteger = '整';
        //整型完以后的单位
        var cnIntLast = '元';
        //最大处理的数字
        var maxNum = 999999999999999.9999;
        //金额整数部分
        var integerNum;
        //金额小数部分
        var decimalNum;
        //输出的中文金额字符串
        var chineseStr = '';
        //分离金额后用的数组，预定义
        var parts;
        if (money == '') {
            return '';
        }
        money = parseFloat(money);
        if (money >= maxNum) {
            //超出最大处理数字
            return '';
        }
        if (money == 0) {
            chineseStr = cnNums[0] + cnIntLast + cnInteger;
            return chineseStr;
        }
        //转换为字符串
        money = money.toString();
        if (money.indexOf('.') == -1) {
            integerNum = money;
            decimalNum = '';
        } else {
            parts = money.split('.');
            integerNum = parts[0];
            decimalNum = parts[1].substr(0, 4);
        }
        //获取整型部分转换
        if (parseInt(integerNum, 10) > 0) {
            var zeroCount = 0;
            var IntLen = integerNum.length;
            for (var i = 0; i < IntLen; i++) {
                var n = integerNum.substr(i, 1);
                var p = IntLen - i - 1;
                var q = p / 4;
                var m = p % 4;
                if (n == '0') {
                    zeroCount++;
                } else {
                    if (zeroCount > 0) {
                        chineseStr += cnNums[0];
                    }
                    //归零
                    zeroCount = 0;
                    chineseStr += cnNums[parseInt(n)] + cnIntRadice[m];
                }
                if (m == 0 && zeroCount < 4) {
                    chineseStr += cnIntUnits[q];
                }
            }
            chineseStr += cnIntLast;
        }
        //小数部分
        if (decimalNum != '') {
            var decLen = decimalNum.length;
            for (var i = 0; i < decLen; i++) {
                var n = decimalNum.substr(i, 1);
                if (n != '0') {
                    chineseStr += cnNums[Number(n)] + cnDecUnits[i];
                }
            }
        }
        if (chineseStr == '') {
            chineseStr += cnNums[0] + cnIntLast + cnInteger;
        } else if (decimalNum == '') {
            chineseStr += cnInteger;
        }
        return chineseStr;
    }

    //<![CDATA[
    $(function () {
        $("#ele2").find('.print-link').on('click', function () {
            //Print ele2 with default options
            $.print("#ele2");
        });
        $("#ele4").find('button').on('click', function () {
            //Print ele4 with custom options
            $("#ele4").print({
                //Use Global styles
                globalStyles: false,
                //Add link with attrbute media=print
                mediaPrint: false,
                //Custom stylesheet
                //stylesheet : "http://fonts.useso.com/css?family=Inconsolata",
                //Print in a hidden iframe
                iframe: false,
                //Don't print this
                noPrintSelector: ".avoid-this",
                //Add this at top
                //prepend : "Hello World!!!<br/>",
                //Add this on bottom
                append: "<br/>Buh Bye!"
            });
        });
        // Fork https://github.com/sathvikp/jQuery.print for the full list of options
    });
    //]]>


</script>

</body>
</html>