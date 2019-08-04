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

    <title>zomore</title>
<%--会员等级--%>
    <link href="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

    <link href="${basePath}assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/css/core.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/css/components.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/css/pages.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/css/responsive.css" rel="stylesheet" type="text/css" />
    <link href="${basePath}assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet" />

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <script src="${basePath}assets/js/modernizr.min.js"></script>

</head>

<body class="fixed-left">

<!-- Begin page -->
<div id="wrapper" class="forced enlarged">

    <!-- Top Bar Start -->
    <div class="topbar">

        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="index.html" class="logo"><i class="icon-magnet icon-c-logo"></i><span>Ub<i class="md md-album"></i>ld</span></a>
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
                            <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="true">
                                <i class="icon-bell"></i> <span class="badge badge-xs badge-danger">3</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-lg">
                                <li class="notifi-title"><span class="label label-default pull-right">New 3</span>Notification</li>
                                <li class="list-group nicescroll notification-list">
                                    <!-- list item-->
                                    <a href="javascript:void(0);" class="list-group-item">
                                        <div class="media">
                                            <div class="pull-left p-r-10">
                                                <em class="fa fa-diamond fa-2x text-primary"></em>
                                            </div>
                                            <div class="media-body">
                                                <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
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
                                                    <small>There are <span class="text-primary font-600">2</span> new updates available</small>
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
                                                <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
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
                            <a href="#" id="btn-fullscreen" class="waves-effect waves-light"><i class="icon-size-fullscreen"></i></a>
                        </li>
                        <li class="hidden-xs">
                            <a href="#" class="right-bar-toggle waves-effect waves-light"><i class="icon-settings"></i></a>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><img src="${basePath}assets/images/users/avatar-1.jpg" alt="user-img" class="img-circle"> </a>
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
    <div id="sidebar-menu">
        <ul>
            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-dashujujichupingtai"
                        style="font-size: 15px; width: 3px;"></i>数据台</font></a>
                <ul class="list-unstyled">
                    <div class="title">数据台</div>
                    <li><a href="${basePath}zomore-index.jsp">数据台</a></li>
                </ul>
            </li>
            <li class="has_sub">
                <a href="#" class="waves-effect waves-light" style="font-size: 16px"><font class="hidetxt"
                                                                                           style="font-size: 16px"><i
                        class="iconfont icon-shangpin2" style="font-size: 15px; width: 3px;"></i>商品</font></a>
                <ul class="list-unstyled">
                    <div class="title">商品</div>
                    <li><a href="${basePath}zomoreCommodity/showEChart.do">商品概览</a></li>
                    <li><a href="${basePath}zomoreCommodity/list.do">商品资料</a></li>
                    <li><a href="${basePath}pages/zomoreCommodityCategory.jsp">商品分类</a></li>
                    <li><a href="${basePath}zomoreCommodityBand/list.do">商品品牌</a></li>
                    <li><a href="${basePath}zomoreCommodityBatch/list.do">商品设置</a></li>
                    <li><a href="${basePath}zomoreCommoditySplit/list.do">组装拆分</a></li>
                    <li><a href="${basePath}zomoreCommodityChangeprice/list.do">调价单</a></li>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-zuodaohang-caizhuang"
                        style="font-size: 15px; width: 3px;"></i>项目</font><span class="pull-right"
                                                                                style="font-size: 16px"><i
                        class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">项目</div>
                    <%-- <li><a href="">项目概览</a></li>--%>
                    <li><a href="${basePath}zomoreServiceCommodity/list.do">项目资料</a></li>
                    <li><a href="${basePath}pages/zomoreServiceCommodityCategory.jsp">项目分类</a></li>
                    <li><a href="${basePath}zomoreServiceCommodityBatch/list.do">项目设置</a></li>
                    <li><a href="${basePath}zomoreServiceCommodityChangeprice/list.do">调价单</a></li>
                </ul>
            </li>


            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-cangku" style="font-size: 16px; width: 3px;"></i>库存</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">库存</div>
                    <li><a href="${basePath}zomoreCommodityStore/list.do">库存查询</a></li>
                    <li><a href="${basePath}zomoreCommodityChange/list.do">商品变动明细</a></li>
                    <li><a href="${basePath}zomoreCommodityStoreWarning/list.do">库存预警</a></li>
                    <li><a href="${basePath}zomoreInventoryhistory/list.do">盘点历史</a></li>
                    <%--<li><a href="">变动明细表</a></li>
                    <li><a href="">商品变动明细</a></li>
                    <li><a href="">商品报损</a></li>
                    <li><a href="">寄存统计</a></li>
                    <li><a href="">寄存取明细</a></li>--%>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-yingxiao1" style="font-size: 16px; width: 3px;"></i>销售</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <%--           <div class="title">销售</div>
                               <li><a href="">数据分析</a></li>
                               <li><a href="">营业概况</a></li>
                               <li><a href="">营业趋势分析</a></li>
                               <li><a href="">营业占比销售统计</a></li>
                               <li><a href="">笔单价分析</a></li>
                               <li><a href="">门店客流</a></li>
                               <li><a href="">折扣分析</a></li>--%>
                    <div class="title">订单中心</div>
                    <li><a href="${basePath}zomoreCommoditySale/list.do">销售单据</a></li>
                    <%--  <li><a href="">网店订单</a></li>--%>
                    <div class="title">批发</div>
                    <li><a href="${basePath}zomoreCommodityWholesale/list.do">批发</a></li>
                    <li><a href="${basePath}zomoreCommodityWholesale/list2.do">批发单据列表</a></li>
                    <li><a href="${basePath}zomoreCommodityWholesale/list4.do">批发退货单据</a></li>
                    <li><a href="${basePath}zomoreCommodityWholesale/list3.do">批发汇总报表</a></li>
                    <div class="title">交接班管理</div>
                    <li><a href="${pageContext.request.contextPath}/shop/findAllDaily.do">日结记录</a></li>
                    <li><a href="${pageContext.request.contextPath}/shop/findAllTurnOver.do">交班记录</a></li>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-vip" style="font-size: 16px; width: 3px;"></i></i>会员</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">会员</div>
                    <li><a href="${basePath}zomoreMember/showEChart.do">会员概览</a></li>
                    <div class="title">会员中心</div>
                    <li><a href="${basePath}zomoreMember/selectAllZomoreMember.do">会员资料</a></li>
                    <li><a href="${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do">等级管理</a>
                    <li><a href="${basePath}zomoreIntegral/listByshop.do">会员规则</a></li>
                    <li><a href="${basePath}zomoreMemberInputrule/list.do">充值规则</a></li>
                    <li><a href="${basePath}zomoreMemberPoint/list.do">积点规则</a></li>
                    <div class="title">会员报表</div>
                    <li><a href="${basePath}zomoreMemberInputRecord/list1.do">充值明细</a></li>
                    <li><a href="${basePath}zomoreMember/showConstituteEchart.do">会员构成分析</a></li>
                    <%--  <li><a href="">会员增长统计</a></li>--%>
                    <li><a href="${basePath}zomoreMember/showConsumptionEchart.do">会员消费分析</a></li>
                    <%-- <li><a href="">客单价分析</a></li>--%>
                    <li><a href="${basePath}zomoreMemberInput/list.do">会员储值卡统计</a></li>
                    <li><a href="${basePath}zomoreMemberInput/showChart.do">储值卡分析</a></li>
                    <%--  <li><a href="">项目充值分析</a></li>
                    <li><a href="">积分分布</a></li>
                    <li><a href="">积点分布</a></li>--%>
                    <li><a href="${basePath}zomoreIntegralRecord/list.do">积分记录</a></li>
                    <li><a href="${basePath}zomoreIntegralHistory/list.do">积分使用记录</a></li>
                    <li><a href="${basePath}zomoreMemberPointHistory/list.do">积点兑换记录</a></li>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-huiyuan" style="font-size: 16px; width: 3px;"></i>员工</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">员工</div>
                    <li><a href="${basePath}zomoreShoppingGuide/showEChart.do">员工概览</a></li>
                    <div class="title">员工中心</div>
                    <li><a href="${basePath}zomoreCashier/list.do">收银台资料</a></li>
                    <li><a href="${basePath}zomoreShoppingGuide/list.do">技师导购资料</a></li>
                    <li><a href="${pageContext.request.contextPath}/shop/findAllReservation.do">预约服务</a></li>
                    <div class="title">员工业绩</div>
                    <li><a href="${basePath}zomoreShoppingGuide/list1.do">技师导购储值卡提成</a></li>
                    <li><a href="${basePath}zomoreShoppingGuide/list2.do">技师导购客流</a></li>
                    <li><a href="${basePath}zomoreShoppingGuide/list3.do">技师导购销售提成</a></li>
                    <li><a href="${basePath}zomoreCashierPerformance/list.do">收银台绩效</a></li>
                    <li><a href="${basePath}zomoreShoppingGuide/list4.do">技师导购绩效明细</a></li>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-jingzhundashuju" style="font-size: 16px; width: 3px;"></i>营销</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <%--<div class="title">营销</div>
                    <li><a href="">营销概览</a></li>--%>
                    <div class="title">常规促销</div>
                    <li>
                        <a href="${pageContext.request.contextPath}/shop/findAllMarketByShopId.do?shopId=${sessionScope.shopId}">促销活动</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAdddztj.do">打折/特价</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAdddzcx.do">搭赠促销</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAdddejzk.do">第二件折扣</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAddtdzk.do">梯度折扣</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAddtccx.do">套餐促销</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAddmefx.do">满额返现</a>
                        <a href="${pageContext.request.contextPath}/shop/marketAddhgcx.do">换购促销</a>
                    </li>
                    <%--   <li><a href="">精准营销</a></li>
                       <li><a href="">自动通知</a></li>
                       <li><a href="">短息发送记录</a></li>--%>
                    <div class="title">卡券管理</div>
                    <li>
                        <a href="${pageContext.request.contextPath}/conpon/findAllConponByShopId.do?shopId=${sessionScope.shopId}">优惠券</a>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/zomoreCard/list1.do">次卡管理</a>
                    </li>
                    <li><a href="${pageContext.request.contextPath}/zomoreCard/list.do">次卡方案</a></li>
                    <li><a href="${pageContext.request.contextPath}/zomoreCard/cardMemberHistory.do">次卡消费记录</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/zomoreCard/zomorecardMemberInput.do">次卡充值记录</a>
                    </li>
                    <%--<li><a href="">购物卡</a></li>--%>
                </ul>
            </li>

            <%--        <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                                class="iconfont icon-caiwu" style="font-size: 16px; width: 3px;"></i>财务</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <div class="title">财务</div>
                            <li><a href="">进账报表</a></li>
                            <li><a href="">出账报表</a></li>
                            <li><a href="">财务设置</a></li>
                        </ul>
                    </li>--%>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-wuliu" style="font-size: 16px; width: 3px;"></i>货流</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">货流配送</div>
                    <li><a href="${basePath}zomoreSupplier/list.do">供应商资料</a></li>
                    <li><a href="${basePath}zomoreCustomer/list.do">客户资料</a></li>
                    <li><a href="${basePath}zomoreCommodityOrdergoods/list.do">门店订货申请</a></li>
                    <div class="title">采购</div>
                    <li><a href="${basePath}zomoreCommodityIntogoods/list.do">采购单</a></li>
                    <%-- <div class="title">货流</div>
                     <li><a href="">货流管理</a></li>
                     <li><a href="">明细查询</a></li>
                     <li><a href="">商品调货统计</a></li>
                     <li><a href="">供应商结算</a></li>
                     <li><a href="">进货价分析</a></li>
                     <li><a href="">门店对账</a></li>--%>
                </ul>
            </li>

            <li class="has_sub">
                <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px"><i
                        class="iconfont icon-shezhi" style="font-size: 16px; width: 3px;"></i>设置</font><span
                        class="pull-right"><i class="md md-add"></i></span></a>
                <ul class="list-unstyled">
                    <div class="title">系统设置</div>
                    <li><a href="${basePath}pages/zomoreAccount.jsp">账户设置</a></li>
                    <li><a href="${basePath}pages/zomorexiaopiao.jsp">小票打印设置</a></li>
                    <li><a href="${basePath}pages/zomorepay.jsp">支付设置</a></li>
                    <%--  <li><a href="">推送通知设置</a></li>
                      <li><a href="">使用参数设置</a></li>
                      <li><a href="">操作日志</a></li>--%>
                    <%--   <div class="title">网店设置</div>
                      <li><a href="">基础设置</a></li>
                      <li><a href="">网店装修</a></li>
                      <li><a href="">网店公告</a></li>
                      <li><a href="">广告管理</a></li>
                      <li><a href="">自定义热卖</a></li>
                      <div class="title">门店设置</div>
                      <li><a href="">广告管理</a></li>
                      <li><a href="">门店通知</a></li>--%>
                </ul>
            </li>

        </ul>
        <div class="clearfix"></div>
    </div>


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
                        <p style="font-size: 17px;">会员等级</p>
                    </div>
                </div>

                <!--Custom Toolbar-->
                <!--===================================================-->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
                            <div class="col-sm-12" style="margin-bottom: 10px;">
                                <div class="button-list">
                                    <!-- Full width modal -->
                                    <button class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target="#con-close-modal">新增</button>
                                </div>
                            </div>

                            <table id="demo-custom-toolbar"  data-toggle="table" class="table-bordered table table-hover">
                                <thead>
                                <tr>
                                    <th data-field="state" data-checkbox="true"></th>
                                    <th data-field="id" data-sortable="true" >操作</th>
                                    <th data-field="name" data-sortable="true">等级名称</th>
                                    <th data-field="date" data-sortable="true" data-formatter="dateFormatter">比重</th>
                                    <th data-field="amount" data-align="center" data-sortable="true" data-sorter="priceSorter">临近升级会员</th>
                                    <th data-field="1" data-sortable="true">优惠折扣</th>
                                    <th data-field="2" data-sortable="true">是否积分</th>
                                    <th data-field="3" data-sortable="true">升级规则</th>
                                    <th data-field="4" data-sortable="true">是否为默认会员</th>
                                    <th data-field="5" data-sortable="true">自动升级</th>
                                    <th data-field="6" data-sortable="true">付费升级</th>
                                    <th data-field="7" data-sortable="true">有效时间</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${requestScope.result}" var="result" varStatus="status">
                                <tr>
                                    <td></td>
                                    <td><a href="${basePath}zomoreMembershiplevel/updateZomoreMemberUI.do?id=${result.membershiplevelId}"
                                           style="color: black">编辑</a>&nbsp;
                                        <a href="${basePath}zomoreMembershiplevel/deletedZomoreMember.do?ids=${result.membershiplevelId}"
                                           style="color: black">删除</a></td>
                                    <td>${result.membershiplevelName}</td>
                                    <td>${result.membershiplevelProportion}</td>
                                    <td>
                                            ${requestScope.nearsize[status.index]}人</td>
                                    <td>${result.membershiplevelDiscount}折</td>
                                    <td>
                                        <c:if test="${result.membershiplevelIntegral==1}">
                                            是
                                        </c:if>
                                        <c:if test="${result.membershiplevelIntegral==0}">
                                            否
                                        </c:if>
                                    </td>
                                    <td>
                                        <div>购物满<a style="color: #0ab5d4" onclick="change()"
                                                   name="${result.membershiplevelId}">${result.membershiplevelRule}</a><input
                                                style="width: 80px;height: 25px" type="hidden" name="${result.membershiplevelId}">积分
                                        </div>
                                    </td>
                                    <td>
                                        <c:if test="${result.membershiplevelDefault==1}">
                                            是
                                        </c:if>
                                        <c:if test="${result.membershiplevelDefault==0}">
                                            否
                                        </c:if>
                                    </td>
                                    <td>
                                        <c:if test="${result.membershiplevelUpgradetype==1}">
                                            是
                                        </c:if>
                                        <c:if test="${result.membershiplevelUpgradetype==0}">
                                            否
                                        </c:if>
                                    </td>
                                    <td>
                                        <c:if test="${result.membershiplevelUpgradepayment==1}">
                                            是
                                        </c:if>
                                        <c:if test="${result.membershiplevelUpgradepayment==0}">
                                            否
                                        </c:if>
                                    </td>
                                    <td>
                                        <c:if test="${result.membershiplevelEffective=='1'}">永久有效</c:if>
                                        <c:if test="${result.membershiplevelEffective!='1'}">
                                            <fmt:formatDate value="${result.membershiplevelTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                                        </c:if>
                                    </td>
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
                            <img src="${basePath}assets/images/users/avatar-1.jpg" alt="">
                        </div>
                        <span class="name">Chadengle</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-2.jpg" alt="">
                        </div>
                        <span class="name">Tomaslau</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-3.jpg" alt="">
                        </div>
                        <span class="name">Stillnotdavid</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-4.jpg" alt="">
                        </div>
                        <span class="name">Kurafire</span>
                        <i class="fa fa-circle online"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-5.jpg" alt="">
                        </div>
                        <span class="name">Shahedk</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-6.jpg" alt="">
                        </div>
                        <span class="name">Adhamdannaway</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-7.jpg" alt="">
                        </div>
                        <span class="name">Ok</span>
                        <i class="fa fa-circle away"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-8.jpg" alt="">
                        </div>
                        <span class="name">Arashasghari</span>
                        <i class="fa fa-circle offline"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-9.jpg" alt="">
                        </div>
                        <span class="name">Joshaustin</span>
                        <i class="fa fa-circle offline"></i>
                    </a>
                    <span class="clearfix"></span>
                </li>
                <li class="list-group-item">
                    <a href="#">
                        <div class="avatar">
                            <img src="${basePath}assets/images/users/avatar-10.jpg" alt="">
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

    <!-- 新增会员等级弹窗 -->
    <!-- ============================================================== -->
    <form action="${basePath}zomoreMembershiplevel/insertZomoreMember.do" method="post">
    <div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title">会员等级</h4>
                </div>

                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-10">
                            <div class="form-group">
                                <label  class="control-label">是否启用</label>
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="switchery-demo">
                                <input type="checkbox" name="employeeRoleState1" checked data-plugin="switchery" data-color="#34d3eb" data-size="small"/>
                            </div>
                        </div>
                    </div>
                    <%--所属门店--%>
                    <input type="hidden" name="employeeRoleCashierStore" value="门店测试">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <input type="text" class="form-control"  name="membershiplevelName" id="membershiplevelName" placeholder="等级名称">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                    <button type="submit" class="btn btn-info waves-effect waves-light">保存</button>
                </div>
            </div>
        </div>
    </div><!-- /.modal -->
    </form>
    <!-- ============================================================== -->
    <!-- 修改会员等级弹窗 -->
    <!-- ============================================================== -->
    <form name="actionfome1" action="${basePath}zomoreEmployeeRole/add.do" method="post">
        <div id="con-close-modal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        <h4 class="modal-title">新增员工角色</h4>
                    </div>

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label  class="control-label">是否启用</label>
                                </div>
                            </div>
                            <div class="col-md-1">
                                <div class="switchery-demo">
                                    <input type="checkbox" name="employeeRoleState1" checked data-plugin="switchery" data-color="#34d3eb" data-size="small"/>
                                </div>
                            </div>
                        </div>
                        <%--所属门店--%>
                        <input type="hidden" name="employeeRoleCashierStore" value="门店测试">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="text" class="form-control"  name="employeeRoleRolename" id="employeeRoleRolename1" placeholder="角色名称">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                        <button type="submit" class="btn btn-info waves-effect waves-light">更新</button>
                    </div>
                </div>
            </div>
        </div><!-- /.modal -->
    </form>
    <!-- ============================================================== -->
</div>
</div>
<!-- END wrapper -->

<script>
    var resizefunc = [];
</script>

<!-- jQuery  -->
<%--<script src="${basePath}assets/js/jquery.min.js"></script>--%>
<script src="${basePath}js/jquery-3.3.1.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<script src="${basePath}assets/js/detect.js"></script>
<script src="${basePath}assets/js/fastclick.js"></script>
<script src="${basePath}assets/js/jquery.slimscroll.js"></script>
<script src="${basePath}assets/js/jquery.blockUI.js"></script>
<script src="${basePath}assets/js/waves.js"></script>
<script src="${basePath}assets/js/wow.min.js"></script>
<script src="${basePath}assets/js/jquery.nicescroll.js"></script>
<script src="${basePath}assets/js/jquery.scrollTo.min.js"></script>
<script src="${basePath}assets/pages/jquery.bs-table.js"></script>
<!-- Modal-Effect -->
<script src="${basePath}assets/plugins/custombox/dist/custombox.min.js"></script>
<script src="${basePath}assets/plugins/custombox/dist/legacy.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${basePath}assets/plugins/switchery/dist/switchery.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
<script src="${basePath}assets/js/jquery.core.js"></script>
<script src="${basePath}assets/js/jquery.app.js"></script>
<script src="${basePath}assets/js/timejquery.js"></script>
<script src="${basePath}assets/js/mjquery.js"></script>

<script src="${basePath}assets/plugins/moment/moment.js"></script>
<script src="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.js"></script>
<script src="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
<script src="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.js"></script>
<script type="text/javascript">

    //点击编辑数据回显
    function edit(id) {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreEmployeeRole/updateAjax.do",//url
            data: {"id": id},
            success: function (data) {
                // alert(JSON.stringify(data));
                //修改地址
                $("form[name='actionfome1']").attr("action", "${basePath}zomoreEmployeeRole/edit.do?employeeRoleRoleid=" + data.employeeRoleRoleid);
                $("#employeeRoleRolename1").val(data.employeeRoleRolename);
            },
            error: function (result) {
                alert("异常，请稍后再试");
            }
        });
    }

</script>

<script>
    $(document).ready(function () {
        //修改规则
        $("a").click(function () {
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
                $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreMembershiplevel/updateZomoreMembershiplevelRule.do",
                    data: {"id": Waring.attr("name"), "rule": Waring.siblings('input').val()},
                    success: function (msg) {
                        if (msg != 'success') {
                            alert("修改积分规则失败");
                        }else {
                            location.href = "${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do";
                        }

                    },
                    error: function () {
                        alert("修改积分规则失败");
                        location.href = "${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do";
                    }
                });

            });
        });
    });

</script>
</body>
</html>