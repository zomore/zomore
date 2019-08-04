<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="../assets/images/favicon_1.ico">

    <title>日结记录</title>

    <link href="../assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css"/>

    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/responsive.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet"/>

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <link href="../assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="../assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="../assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="../assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="../assets/css/menu.css" rel="stylesheet" type="text/css">
    <script src="../assets/js/modernizr.min.js"></script>


</head>

<body class="fixed-left">

<!-- Begin page -->
<div id="wrapper" class="forced enlarged">

    <!-- Top Bar Start -->
    <div class="topbar">

        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="../index.html" class="logo"><i class="icon-magnet icon-c-logo"></i><span>Ub<i
                        class="md md-album"></i>ld</span></a>
            </div>
        </div>

        <!-- Button mobile view to collapse sidebar menu -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <div class="pull-left">
                        <button class="button-menu-mobile open-left">
                            <i class="ion-navicon"></i>
                        </button>
                        <span class="clearfix"></span>
                    </div>

                    <form role="search" class="navbar-left app-search pull-left hidden-xs">
                        <input type="text" placeholder="搜索..." class="form-control">
                        <a href=""><i class="fa fa-search"></i></a>
                    </form>


                    <ul class="nav navbar-nav navbar-right pull-right">
                        <li class="dropdown hidden-xs">
                            <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light"
                               data-toggle="dropdown" aria-expanded="true">
                                <i class="icon-bell"></i> <span class="badge badge-xs badge-danger">3</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-lg">
                                <li class="notifi-title"><span class="label label-default pull-right">New 3</span>Notification
                                </li>
                                <li class="list-group nicescroll notification-list">
                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-diamond fa-2x text-primary"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">A new order has been placed A new order has
                                                    been placed</h5>
                                                <p class="m-0">
                                                    <small>There are new settings available</small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>

                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-cog fa-2x text-custom"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">New settings</h5>
                                                <p class="m-0">
                                                    <small>There are new settings available</small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>

                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-bell-o fa-2x text-danger"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">Updates</h5>
                                                <p class="m-0">
                                                    <small>There are <span class="text-primary font-600">2</span> new
                                                        updates available
                                                    </small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>

                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-user-plus fa-2x text-info"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">New user registered</h5>
                                                <p class="m-0">
                                                    <small>You have 10 unread messages</small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>

                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-diamond fa-2x text-primary"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">A new order has been placed A new order has
                                                    been placed</h5>
                                                <p class="m-0">
                                                    <small>There are new settings available</small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>

                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-cog fa-2x text-custom"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">New settings</h5>
                                                <p class="m-0">
                                                    <small>There are new settings available</small>
                                                </p>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="javascript:void(0);" class="list-group-item text-right">
                                        <small class="font-600">See all notifications</small>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="hidden-xs">
                            <a href="#" id="btn-fullscreen" class="waves-effect waves-light"><i
                                    class="icon-size-fullscreen"></i></a>
                        </li>
                        <li class="hidden-xs">
                            <a href="#" class="right-bar-toggle waves-effect waves-light"><i class="icon-settings"></i></a>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><img
                                    src="../assets/images/users/avatar-1.jpg" alt="user-img" class="img-circle"> </a>
                            <ul class="dropdown-menu">
                                <li><a href="javascript:void(0)"><i class="ti-user m-r-5"></i> Profile</a></li>
                                <li><a href="javascript:void(0)"><i class="ti-settings m-r-5"></i> Settings</a></li>
                                <li><a href="javascript:void(0)"><i class="ti-lock m-r-5"></i> Lock screen</a></li>
                                <li><a href="javascript:void(0)"><i class="ti-power-off m-r-5"></i> Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <!-- Top Bar End -->
    <!-- ========== Left Sidebar Start ========== -->

    <div class="left side-menu">
        <div class="sidebar-inner slimscrollleft">

            <!--- Divider -->
            <div id="sidebar-menu">
                <ul>
                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">商品</font></a>
                        <ul class="list-unstyled">
                            <div class="title">商品</div>
                            <li><a href="${basePath}zomoreCommodity/showEChart.do">商品概览</a></li>
                            <li><a href="${basePath}zomoreCommodity/list.do">商品资料</a></li>
                            <li><a href="${basePath}zomoreCommodityCategory/list.do">商品分类</a></li>
                            <%--    <li><a href="">商品设置</a></li>
                                <li><a href="">组装拆分</a></li>
                                <li><a href="">调价单</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">项目</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">项目</div>
                            <li><a href="">项目概览</a></li>
                            <li><a href="${basePath}zomoreServiceCommodity/list.do">项目资料</a></li>
                            <%-- <li><a href="">项目分类</a></li>
                             <li><a href="">项目设置</a></li>
                             <li><a href="">调价单</a></li>--%>
                        </ul>
                    </li>


                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">库存</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">库存</div>
                            <li><a href="${basePath}zomoreCommodityStore/list.do">库存查询</a></li>
                            <li><a href="${basePath}zomoreCommodityStoreWarning/list.do">库存预警</a></li>
                            <li><a href="${basePath}zomoreInventoryhistory/list.do">盘点历史</a></li>
                            <%--    <li><a href="">变动明细表</a></li>
                                <li><a href="">商品变动明细</a></li>
                                <li><a href="">商品报损</a></li>
                                <li><a href="">寄存统计</a></li>
                                <li><a href="">寄存取明细</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">销售</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">销售</div>
                            <%--      <li><a href="">数据分析</a></li>
                                  <li><a href="">营业概况</a></li>
                                  <li><a href="">营业趋势分析</a></li>
                                  <li><a href="">营业占比销售统计</a></li>
                                  <li><a href="">笔单价分析</a></li>
                                  <li><a href="">门店客流</a></li>
                                  <li><a href="">折扣分析</a></li>--%>
                            <div class="title">订单中心</div>
                            <li><a href="${basePath}zomoreCommoditySale/list.do">销售单据</a></li>
                            <%--   <li><a href="">顾客预约</a></li>
                               <li><a href="">网店订单</a></li>
                               <div class="title">交接班管理</div>
                               <li><a href="">日结记录</a></li>
                               <li><a href="">交班记录</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">会员</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">会员</div>
                            <li><a href="${basePath}zomoreMember/showEChart.do">会员概览</a></li>
                            <div class="title">会员中心</div>
                            <li><a href="${basePath}zomoreMember/selectAllZomoreMember.do">会员资料</a></li>
                            <li><a href="${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do">等级管理</a>
                            </li>
                            <%--           <li><a href="">会员规则</a></li>
                                       <li><a href="">充值规则</a></li>
                                       <div class="title">会员报表</div>
                                       <li><a href="">会员构成分析</a></li>
                                       <li><a href="">会员增长统计</a></li>
                                       <li><a href="">会员消费分析</a></li>
                                       <li><a href="">客单价分析</a></li>
                                       <li><a href="">会员储值卡统计</a></li>
                                       <li><a href="">储值卡分析</a></li>
                                       <li><a href="">项目充值分析</a></li>
                                       <li><a href="">积分分布</a></li>
                                       <li><a href="">积点分布</a></li>
                                       <li><a href="">积分使用记录</a></li>
                                       <li><a href="">积点兑换记录</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">员工</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">员工</div>
                            <li><a href="">员工概览</a></li>
                            <div class="title">员工中心</div>
                            <li><a href="${basePath}zomoreCashier/list.do">收银台资料</a></li>
                            <li><a href="${basePath}zomoreShoppingGuide/list.do">技师导购资料</a></li>
                            <li><a href="${pageContext.request.contextPath}/shop/findAllReservation.do">预约服务</a></li>
                            <div class="title">员工业绩</div>
                            <%--<li><a href="">收银台绩效</a></li>
                            <li><a href="">收银台资料</a></li>
                            <li><a href="">技师导购资料</a></li>
                            <li><a href="">技师导购客流</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">营销</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <%-- <div class="title">营销</div>
                             <li><a href="">营销概览</a></li>--%>
                            <div class="title">常规促销</div>
                            <li>
                                <a href="${pageContext.request.contextPath}/shop/findAllMarketByShopId.do?shopId=${sessionScope.shopId}">促销活动</a>
                            </li>
                            <%-- <li><a href="">精准营销</a></li>
                             <li><a href="">自动通知</a></li>
                             <li><a href="">短息发送记录</a></li>--%>
                            <div class="title">卡卷管理</div>
                            <li>
                                <a href="${pageContext.request.contextPath}/conpon/findAllConponByShopId.do?shopId=${sessionScope.shopId}">优惠券</a>
                            </li>
                            <%--<li><a href="">购物卡</a></li>--%>
                        </ul>
                    </li>

                    <%--     <li class="has_sub">
                             <a href="#" class="waves-effect waves-light"><font class="hidetxt">财务</font><span class="pull-right"><i class="md md-add"></i></span></a>
                             <ul class="list-unstyled">
                                 <div class="title">财务</div>
                                 <li><a href="">进账报表</a></li>
                                 <li><a href="">出账报表</a></li>
                                 <li><a href="">财务设置</a></li>
                             </ul>
                         </li>
     --%>
                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">货流</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">货流配送</div>
                            <li><a href="${basePath}zomoreSupplier/list.do">供应商资料</a></li>
                            <li><a href="${basePath}zomoreCommodityOrdergoods/list.do">门店订货申请</a></li>
                            <li><a href="${basePath}zomoreCommodityIntogoods/list.do">采购单</a></li>
                            <li><a href="${basePath}zomoreCommodityWholesale/list.do">批发单</a></li>
                            <%--  <li><a href="">货流管理</a></li>
                              <li><a href="">明细查询</a></li>
                              <li><a href="">商品调货统计</a></li>
                              <li><a href="">供应商结算</a></li>
                              <li><a href="">进货价分析</a></li>
                              <li><a href="">门店对账</a></li>--%>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">设置</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <%--  <div class="title">系统设置</div>
                              <li><a href="">账户设置</a></li>
                              <li><a href="">小票打印设置</a></li>
                              <li><a href="">推送通知设置</a></li>
                              <li><a href="">使用参数设置</a></li>
                              <li><a href="">操作日志</a></li>--%>
                            <div class="title">网店设置</div>
                            <li><a href="${pageContext.request.contextPath}/shop/findAllTurnOver.do">交接班记录</a></li>
                            <li><a href="${pageContext.request.contextPath}/shop/findAllDaily.do">日结记录</a></li>
                            <li><a href="${pageContext.request.contextPath}/shop/findAllReservation.do">顾客预约</a></li>
                            <li><a href="${pageContext.request.contextPath}/subCard/findAllClassification.do">次卡管理</a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/subCard/findAllScheme.do">次卡方案</a></li>
                            <%-- <div class="title">门店设置</div>
                             <li><a href="">广告管理</a></li>
                             <li><a href="">门店通知</a></li>--%>
                        </ul>
                    </li>
                </ul>
                <div class="clearfix"></div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!-- Left Sidebar End -->

    <!-- ============================================================== -->
    <!-- Start right Content here -->
    <!-- ============================================================== -->
    <div class="content-page">
        <!-- Start content -->
        <div class="content">
            <div class="container">

                <!-- Page-Title -->
                <div class="row">
                    <div class="col-sm-12">
                        <p style="font-size: 17px;">日结记录</p>
                    </div>
                </div>

                <!--Custom Toolbar-->
                <!--===================================================-->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
                            <div class="col-sm-8" style="margin-bottom: 10px;">
                                <div class="button-list">
                                    <!-- Full width modal -->
                                    <button class="btn btn-primary waves-effect waves-light" data-toggle="modal"
                                            data-target="#">导出
                                    </button>
                                </div>
                                <a href="${pageContext.request.contextPath}/pages/time.jsp">
                                    <button type="submit" value="交接班"></button>
                                </a>
                            </div>
                            <div class="col-sm-2" style="margin-bottom: 10px;">
                                <div class="btn-group">
                                    <input type="text" class="form-control input-daterange-timepicker" name="daterange"
                                           value="01/01/2015 1:30 PM - 01/01/2015 2:00 PM" placeholder="">
                                </div>
                            </div>
                            <div class="col-sm-2">
                                <form role="form">
                                    <div class="input-group">
                                        <input type="text" id="example-input1-group2" name="example-input1-group2"
                                               class="form-control" placeholder="条码/名称/拼音码">
                                        <span class="input-group-btn">
                          <button type="button" class="btn waves-effect waves-light btn-primary"
                                  style="padding: 6px 12px">搜索</button>
                        </span>
                                    </div>
                                </form>
                            </div>

                            <table id="demo-custom-toolbar" data-toggle="table"
                                   class="table-bordered table table-hover">
                                <thead>
                                <tr>
                                    <th scope="col">开始时间</th>
                                    <th scope="col">结束时间</th>
                                    <th scope="col">收银员</th>
                                    <th scope="col">收银总额</th>
                                    <th scope="col">现金支付</th>
                                    <th scope="col">微信支付</th>
                                    <th scope="col">支付宝支付</th>
                                    <th scope="col">银联支付</th>
                                    <th scope="col">储蓄卡支付</th>
                                    <th scope="col">次卡支付</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${dailyReportList}" var="daily">
                                    <tr>
                                        <td>
                                            <fmt:formatDate value="${daily.createTime}"
                                                            pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
                                        </td>
                                        <td>
                                            <fmt:formatDate value="${daily.dueTime}"
                                                            pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
                                        </td>
                                        <td>${daily.cashier}</td>
                                        <td>${daily.totalmoney}</td>
                                        <td>${daily.cash}</td>
                                        <td>${daily.wxpay}</td>
                                        <td>${daily.alipay}</td>
                                        <td>${daily.unionpay}</td>
                                        <td>${daily.storagecard}</td>
                                        <td>${daily.subcard}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>


            </div> <!-- container -->

        </div> <!-- content -->

    </div>
    <!-- ============================================================== -->
    <!-- End Right content here -->
    <!-- ============================================================== -->


    <!-- Right Sidebar -->
    <div class="side-bar right-bar nicescroll">
        <h4 class="text-center">Chat</h4>
        <div class="contact-list nicescroll">
            <ul class="list-group contacts-list">
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-1.jpg" alt="">
                        </div>
                        <span class="name">Chadengle</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-2.jpg" alt="">
                        </div>
                        <span class="name">Tomaslau</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-3.jpg" alt="">
                        </div>
                        <span class="name">Stillnotdavid</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-4.jpg" alt="">
                        </div>
                        <span class="name">Kurafire</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-5.jpg" alt="">
                        </div>
                        <span class="name">Shahedk</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-6.jpg" alt="">
                        </div>
                        <span class="name">Adhamdannaway</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-7.jpg" alt="">
                        </div>
                        <span class="name">Ok</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-8.jpg" alt="">
                        </div>
                        <span class="name">Arashasghari</span>
                        <i class="fa fa-circle offline"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-9.jpg" alt="">
                        </div>
                        <span class="name">Joshaustin</span>
                        <i class="fa fa-circle offline"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="../assets/images/users/avatar-10.jpg" alt="">
                        </div>
                        <span class="name">Sortino</span>
                        <i class="fa fa-circle offline"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
            </ul>
        </div>
    </div>
    <!-- /Right-bar -->

    <!-- 新增商品资料弹窗 -->
    <!-- ============================================================== -->
    <div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                </div>

                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="form-group">
                                <button class="btn btn-primary waves-effect waves-light" data-toggle="modal"
                                        data-target="#con-close-modal1">选择调价商品
                                </button>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="年/月/日" id="datepicker-autoclose">
                            </div><!-- input-group -->
                        </div>
                        <div class="col-md-4">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="年/月/日"
                                       id="datepicker-multiple-date">
                            </div><!-- input-group -->
                        </div><!-- input-group -->
                    </div><!-- end row -->
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>


                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="field-7" class="control-label">备注</label>
                                <textarea class="form-control autogrow" id="field-7"
                                          style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px;"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-info waves-effect waves-light">保存</button>
                </div>
            </div>
        </div>
    </div><!-- /.modal -->
    <!-- ============================================================== -->

    <!-- 新增商品资料弹窗 -->
    <!-- ============================================================== -->
    <div id="con-close-modal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title">调价单</h4>
                </div>

                <div class="modal-body">
                    <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered table table-hover">
                        <thead>
                        <tr>
                            <th data-field="state" data-checkbox="true"></th>
                            <th data-field="id" data-sortable="true" data-formatter="invoiceFormatter">Order ID</th>
                            <th data-field="name" data-sortable="true">Name</th>
                            <th data-field="date" data-sortable="true" data-formatter="dateFormatter">Order Date</th>
                            <th data-field="amount" data-align="center" data-sortable="true" data-sorter="priceSorter">
                                Price
                            </th>
                            <th data-field="status" data-align="center" data-sortable="true"
                                data-formatter="statusFormatter">Status
                            </th>
                        </tr>
                        </thead>

                        <tbody>
                        <tr>
                            <td></td>
                            <td>UB-1609</td>
                            <td>Boudreaux</td>
                            <td>22 Jun 2015</td>
                            <td>$ 35.00</td>
                            <td>Unpaid</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>UB-1609</td>
                            <td>Boudreaux</td>
                            <td>22 Jun 2015</td>
                            <td>$ 35.00</td>
                            <td>Unpaid</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>UB-1609</td>
                            <td>Boudreaux</td>
                            <td>22 Jun 2015</td>
                            <td>$ 35.00</td>
                            <td>Unpaid</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>UB-1609</td>
                            <td>Boudreaux</td>
                            <td>22 Jun 2015</td>
                            <td>$ 35.00</td>
                            <td>Unpaid</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>UB-1609</td>
                            <td>Boudreaux</td>
                            <td>22 Jun 2015</td>
                            <td>$ 35.00</td>
                            <td>Unpaid</td>
                        </tr>

                        </tbody>
                    </table>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-info waves-effect waves-light">完成</button>
                </div>
            </div>
        </div>
    </div>
</div><!-- /.modal -->
<!-- ============================================================== -->
<!-- ============================================================== -->
</div>
</div>
<!-- END wrapper -->

<script>
    var resizefunc = [];
</script>

<!-- jQuery  -->
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/detect.js"></script>
<script src="../assets/js/fastclick.js"></script>
<script src="../assets/js/jquery.slimscroll.js"></script>
<script src="../assets/js/jquery.blockUI.js"></script>
<script src="../assets/js/waves.js"></script>
<script src="../assets/js/wow.min.js"></script>
<script src="../assets/js/jquery.nicescroll.js"></script>
<script src="../assets/js/jquery.scrollTo.min.js"></script>
<script src="../assets/pages/jquery.bs-table.js"></script>
<!-- Modal-Effect -->
<script src="../assets/plugins/custombox/dist/custombox.min.js"></script>
<script src="../assets/plugins/custombox/dist/legacy.min.js"></script>
<script src="../assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="../assets/plugins/switchery/dist/switchery.min.js"></script>
<script src="../assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
<script src="../assets/js/jquery.core.js"></script>
<script src="../assets/js/jquery.app.js"></script>
<script src="../assets/js/timejquery.js"></script>
<script src="../assets/js/mjquery.js"></script>

<script src="../assets/plugins/moment/moment.js"></script>
<script src="../assets/plugins/timepicker/bootstrap-timepicker.min.js"></script>
<script src="../assets/plugins/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
<script src="../assets/plugins/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<script src="../assets/plugins/clockpicker/dist/jquery-clockpicker.min.js"></script>
<script src="../assets/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>


</body>
</html>
