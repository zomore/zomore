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
<%--会员管理--%>
    <link href="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="${basePath}assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/responsive.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet"/>

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
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
                <a href="index.html" class="logo"><i class="icon-magnet icon-c-logo"></i><span>Ub<i
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
                                    src="${basePath}assets/images/users/avatar-1.jpg" alt="user-img" class="img-circle">
                            </a>
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
                            <li><a href="${basePath}zomoreSupplier/list.do">供应商资料</a></li>
                            <li><a href="${basePath}zomoreCommodity/list.do">商品资料</a></li>
                            <li><a href="${basePath}zomoreCommodityCategory/list.do">商品分类</a></li>
                            <li><a href="peity-chart.html">Peity Charts</a></li>
                            <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                            <li><a href="chart-radial.html">Radial charts</a></li>
                            <li><a href="other-chart.html">Other Chart</a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">库存</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>

                        <ul class="list-unstyled">
                            <div class="title">
                                库存
                            </div>
                            <li><a href="${basePath}zomoreCommodityStore/list.do">商品库存</a></li>
                            <li><a href="${basePath}zomoreCommodityOrdergoods/list.do">采购订货</a></li>
                            <li><a href="${basePath}zomoreCommodityIntogoods/list.do">采购进货</a></li>
                            <li><a href="peity-chart.html">Peity Charts</a></li>
                            <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                            <li><a href="chart-radial.html">Radial charts</a></li>
                            <li><a href="other-chart.html">Other Chart</a></li>
                        </ul>

                    </li>


                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">数据</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="${basePath}zomoreCommoditySale/list.do">销售单据</a></li>
                            <li><a href="buttons.html">Buttons</a></li>
                            <li><a href="panels.html">Panels</a></li>
                            <li><a href="checkbox-radio.html">Checkboxs-Radios</a></li>
                            <li><a href="tabs-accordions.html">Tabs &amp; Accordions</a></li>
                            <li><a href="modals.html">Modals</a></li>
                            <li><a href="bootstrap-ui.html">BS Elements</a></li>
                            <li><a href="progressbars.html">Progress Bars</a></li>
                            <li><a href="notification.html">Notification</a></li>
                            <li><a href="sweet-alert.html">Sweet-Alert</a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">会员</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="${basePath}zomoreMember/selectAllZomoreMember.do">会员资料</a></li>
                            <li><a href="${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do">会员等级</a></li>
                            <li><a href="widgets.html">Widgets</a></li>
                            <li><a href="nestable-list.html">Nesteble</a></li>
                            <li><a href="ui-sliders.html">Sliders </a></li>
                            <li><a href="gallery.html">Gallery </a></li>
                            <li><a href="pricing.html">Pricing Table </a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">员工</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="${basePath}zomoreEmployeeRole/list.do">员工角色</a></li>
                            <li><a href="${basePath}zomoreShoppingGuide/list.do">导购技师资料</a></li>
                            <li><a href="font-awesome.html">Font awesome</a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">营销</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="form-elements.html">General Elements</a></li>
                            <li><a href="form-validation.html">Form Validation</a></li>
                            <li><a href="form-advanced.html">Advanced Form</a></li>
                            <li><a href="form-wizard.html">Form Wizard</a></li>
                            <li><a href="form-editor.html">WYSIWYG Editor</a></li>
                            <li><a href="code-editor.html">Code Editors</a></li>
                            <li><a href="form-uploads.html">Multiple File Upload</a></li>
                            <li><a href="form-xeditable.html">X-editable</a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">货流</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="tables.html">Basic Tables</a></li>
                            <li><a href="table-datatable.html">Data Table</a></li>
                            <li><a href="tables-editable.html">Editable Table</a></li>
                            <li><a href="responsive-table.html">Responsive Table</a></li>
                        </ul>
                    </li>

                    <li class="has_sub">
                        <a href="#" class="waves-effect waves-light"><font class="hidetxt">设置</font><span
                                class="pull-right"><i class="md md-add"></i></span></a>
                        <ul class="list-unstyled">
                            <li><a href="morris-chart.html">Morris Chart</a></li>
                            <li><a href="chartjs.html">Chartjs</a></li>
                            <li><a href="flot-chart.html">Flot Chart</a></li>
                            <li><a href="peity-chart.html">Peity Charts</a></li>
                            <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                            <li><a href="chart-radial.html">Radial charts</a></li>
                            <li><a href="other-chart.html">Other Chart</a></li>
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
                        <p style="font-size: 17px;">会员资料</p>
                    </div>
                </div>

                <!--Custom Toolbar-->
                <!--===================================================-->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
                            <div class="col-sm-7" style="margin-bottom: 10px;">

                                <div class="button-list">
                                <!-- Full width modal -->
                                <button class="btn btn-primary waves-effect waves-light" data-toggle="modal"
                                        data-target="#con-close-modal">新增
                                </button>
                                <form style="display: inline-block;" id="upload" method="post"
                                      enctype="multipart/form-data">
                                    <div class="fileupload btn btn-primary waves-effect waves-light">
                                        <span>导入</span>
                                        <input type="file" class="upload" name="importExcelfile" onchange="login()">
                                    </div>
                                    <button onclick="doExportExcel()"
                                            class="btn btn-primary waves-effect waves-light"
                                            data-toggle="modal" data-target="#full-width-modal">导出
                                    </button>
                                </form>
                            </div>
                            </div>
                            <div class="col-sm-2" style="margin-bottom: 10px;">
                                <div class="btn-group">
                                    <%-- 自定义下拉列表--%>
                                    <input type="hidden" id="select111" name="memberGrade" value="会员分类">
                                    <button id="select11" type="button"
                                            class="btn btn-info dropdown-toggle waves-effect waves-light"
                                            data-toggle="dropdown" aria-expanded="false">会员分类 <span
                                            class="caret"></span></button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li onclick="selectOnclick('会员分类')"><a name="select1" title="会员分类">全部分类</a></li>
                                        <c:forEach items="${requestScope.memberGradeList}" var="memberGrade1">
                                            <li><a name="select1"onclick="selectOnclick('${memberGrade1.membershiplevelName}')"
                                                    title="${memberGrade1.membershiplevelName}">${memberGrade1.membershiplevelName}</a>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </div>

                                <div class="btn-group">
                                    <%-- 自定义下拉列表2--%>
                                    <input type="hidden" id="select222" name="memberGrade" value="全部导购员">
                                    <button id="select22" type="button"
                                            class="btn btn-info dropdown-toggle waves-effect waves-light"
                                            data-toggle="dropdown" aria-expanded="false">导购员分类 <span
                                            class="caret"></span></button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li onclick="selectOnclick2('全部导购员')"><a name="select2" title="全部导购员">全部导购员</a></li>
                                        <c:forEach items="${requestScope.memberGuideList}" var="memberGuideList">
                                            <li><a name="select1"onclick="selectOnclick2('${memberGuideList.shoppingGuideName}')"
                                                   title="${memberGuideList.shoppingGuideName}">${memberGuideList.shoppingGuideName}</a>
                                            </li>
                                        </c:forEach>
                                    </ul>
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
                            <div class="col-sm-1">
                                <div class="button-list">
                                    <!-- Small modal -->
                                    <button class="btn btn-primary waves-effect waves-light" data-toggle="modal"
                                            data-target="#con-close-modal1">高级搜索
                                    </button>
                                </div>
                            </div>

                            <table id="demo-custom-toolbar" data-toggle="table"
                                   class="table-bordered table table-hover">
                                <thead <%--style="background: #EBEFF2"--%>>
                                <tr>
                                    <th data-field="state" data-checkbox="true"><input type="checkbox" id="selAll"
                                                                                       onclick="doSelectAll()"/></th>
                                    <th data-field="id" data-sortable="true">会员号</th>
                                    <th data-field="name" data-sortable="true">姓名</th>
                                    <th data-field="date" data-sortable="true" data-formatter="dateFormatter">电话</th>
                                    <th>会员等级</th>
                                    <th>余额</th>
                                    <th>积分</th>
                                    <th>次卡</th>
                                    <th>购物卡</th>
                                    <th>优惠券</th>
                                    <th>导购员</th>
                                    <th>开卡门店</th>
                                    <th>开卡日期</th>
                                    <th>操作</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${requestScope.result}" var="result">
                                    <tr>
                                        <td><input type="checkbox" name="ids" value="${result.memberMemberid}"/></td>
                                        <td>${result.memberNumber}</td>
                                        <td>${result.memberMemberidname}</td>
                                        <td>${result.memberPhonenumber}</td>
                                        <td>${result.memberGrade}</td>
                                        <td>${result.memberBalance}</td>
                                        <td>${result.memberIntegral}</td>
                                        <td>${result.memberSubcard}</td>
                                        <td>${result.memberShopcar}</td>
                                        <td>${result.memberCoupon}</td>
                                        <td>${result.memberGuide}</td>
                                        <td>${result.memberShop}</td>
                                        <td>
                                            <fmt:formatDate value="${result.memberDateofopeningcard}"
                                                            pattern="yyyy-MM-dd"></fmt:formatDate>
                                        </td>
                                        <td>
                                            <a class="waves-effect waves-light" data-toggle="modal"
                                               data-target="#con-close-modal1" title="${result.memberMemberid}"
                                               name="edit"
                                               style="color: black" onclick="edit(${result.memberMemberid})">编辑</a>&nbsp;
                                            <a href="${basePath}zomoreMember/deletedZomoreMember.do?ids=${result.memberMemberid}"
                                               style="color: black">删除</a>

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

    <!-- 新增会员资料弹窗 -->
    <!-- ============================================================== -->
    <form name="actionfome" action="${basePath}zomoreMember/insertZomoreMember.do" method="post">
        <div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">会员资料</h4>
                    </div>

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label for="field-1" class="control-label">是否启用</label>
                                </div>
                            </div>
                            <div class="col-md-1">
                                <div class="switchery-demo">
                                    <input type="checkbox" checked data-plugin="switchery" data-color="#34d3eb"
                                           data-size="small"/>
                                </div>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">会员编号:</span>
                                    <input class="form-control" id="memberNumber" type="text" name="memberNumber"
                                           placeholder="">
                                </div>
                                </br>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">会员姓名:</span>
                                    <input class="form-control" id="memberMemberidname" type="text"
                                           name="memberMemberidname" placeholder="">
                                </div>
                                </br>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">会员等级:</span>
                                    <select class="form-control" name="memberGrade">
                                        <c:forEach items="${requestScope.memberGradeList}" var="gradeType">
                                            <option value="${gradeType.membershiplevelName}">${gradeType.membershiplevelName}</option>
                                        </c:forEach>
                                    </select>

                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">会员折扣:</span>
                                    <input class="form-control" id="memberDiscount" name="memberDiscount" type="text">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">会员余额:</span>
                                    <input class="form-control" id="memberBalance" name="memberBalance" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">会员积分:</span>
                                    <input class="form-control" id="memberIntegral" name="memberIntegral" type="text"
                                           placeholder="">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">联系电话:</span>
                                    <input oninput="if(value.length>11)value=value.slice(0,11)" class="form-control"
                                           id="memberPhonenumber" name="memberPhonenumber" type="text" placeholder="">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-8">
                                    <div class="input-group">
                                        <span class="input-group-addon">会员密码:</span>
                                        <input class="form-control" id="memberPassword" name="memberPassword"
                                               type="password" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">开卡日期:</span>
                                        <input class="form-control" id="memberDateofopeningcard"
                                               name="memberDateofopeningcard" type="date" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">到期日期:</span>
                                        <input class="form-control" id="memberDuedate" name="memberDuedate" type="date"
                                               placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">允许赊账:</span>
                                        <input class="form-control" id="memberOncredit" name="memberOncredit"
                                               type="text" placeholder="">
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="${basePath}assets/images/small/img3.jpg" alt="image"
                                         class="img-responsive img-thumbnail" width="200"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>
                    <div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="input-group">
                                <span class="input-group-addon">QQ号码:</span>
                                <input class="form-control" id="memberQq" name="memberQq" type="text" placeholder="">
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="input-group">
                                <span class="input-group-addon">邮箱:</span>
                                <input class="form-control" id="memberEmail" name="memberEmail" type="text"
                                       placeholder="">
                            </div>
                        </div>
                    </div>
                    </br>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>

                    <div class="row">
                        <div class="col-md-11">
                            <div class="input-group">
                                <span class="input-group-addon">地址:</span>
                                <input class="form-control" id="memberAddress" name="memberAddress" type="text"
                                       placeholder="">
                            </div>
                        </div>
                    </div>
                    </br>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="field-7" class="control-label">会员详情</label>
                                <textarea class="form-control autogrow" id="field-7" name="memberNote"
                                          style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px;"></textarea>
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
    <!-- 修改（编辑）会员资料弹窗 -->
    <!-- ============================================================== -->
    <form name="actionfome1" action="" method="post">
        <div id="con-close-modal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">会员资料</h4>
                    </div>

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label for="field-1" class="control-label">是否启用</label>
                                </div>
                            </div>
                            <div class="col-md-1">
                                <div class="switchery-demo">
                                    <input type="checkbox" checked data-plugin="switchery" data-color="#34d3eb"
                                           data-size="small"/>
                                </div>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">会员编号:</span>
                                    <input class="form-control" id="memberNumber1" type="text" name="memberNumber"
                                           placeholder="">
                                </div>
                                </br>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">会员姓名:</span>
                                    <input class="form-control" id="memberMemberidname1" type="text"
                                           name="memberMemberidname" placeholder="">
                                </div>
                                </br>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">会员等级:</span>
                                    <select class="form-control" name="memberGrade">
                                        <c:forEach items="${requestScope.memberGradeList}" var="gradeType">
                                            <option name="memberGrade"
                                                    value="${gradeType.membershiplevelName}">${gradeType.membershiplevelName}</option>
                                        </c:forEach>
                                    </select>

                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">会员折扣:</span>
                                    <input class="form-control" id="memberDiscount1" name="memberDiscount" type="text">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-6">
                                <div class="input-group">
                                    <span class="input-group-addon">会员余额:</span>
                                    <input class="form-control" id="memberBalance1" name="memberBalance" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">会员积分:</span>
                                    <input class="form-control" id="memberIntegral1" name="memberIntegral" type="text"
                                           placeholder="" value="0">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">联系电话:</span>
                                    <input oninput="if(value.length>11)value=value.slice(0,11)" class="form-control"
                                           id="memberPhonenumber1" name="memberPhonenumber" type="text" placeholder="">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                        </br>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-8">
                                    <div class="input-group">
                                        <span class="input-group-addon">会员密码:</span>
                                        <input class="form-control" id="memberPassword1" name="memberPassword"
                                               type="password" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">开卡日期:</span>
                                        <input class="form-control" id="memberDateofopeningcard1"
                                               name="memberDateofopeningcard" type="date" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">到期日期:</span>
                                        <input class="form-control" id="memberDuedate1" name="memberDuedate" type="date"
                                               placeholder="" value="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">允许赊账:</span>
                                        <input class="form-control" id="memberOncredit1" name="memberOncredit"
                                               type="text" placeholder="">
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <img src="${basePath}assets/images/small/img3.jpg" alt="image"
                                         class="img-responsive img-thumbnail" width="200"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>
                    <div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="input-group">
                                <span class="input-group-addon">QQ号码:</span>
                                <input class="form-control" id="memberQq1" name="memberQq" type="text" placeholder="">
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="input-group">
                                <span class="input-group-addon">邮箱:</span>
                                <input class="form-control" id="memberEmail1" name="memberEmail" type="text"
                                       placeholder="">
                            </div>
                        </div>
                    </div>
                    </br>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>

                    <div class="row">
                        <div class="col-md-11">
                            <div class="input-group">
                                <span class="input-group-addon">地址:</span>
                                <input class="form-control" id="memberAddress1" name="memberAddress" type="text"
                                       placeholder="">
                            </div>
                        </div>
                    </div>
                    </br>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label for="field-7" class="control-label">会员详情</label>
                                <textarea class="form-control autogrow" id="memberNote1" name="memberNote"
                                          style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px;"></textarea>
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
<script src="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>
<script type="text/javascript">
    //全选、全反选
    function doSelectAll() {
        $("input[name=ids]").prop("checked", $("#selAll").is(":checked"));
    }

    //导入
    function login() {
        var form = new FormData(document.getElementById("upload"));
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreMember/importExcel.do",//url
            data: form,
            processData: false,
            contentType: false,
            success: function (result) {
                if (result == 'success') {

                    alert("导入会员成功！");
                    location.reload();
                } else {
                    alert("导入会员失败！");
                }

            },
            error: function (result) {
                alert("异常！" + result);
            }
        });
    }

    //导出
    function doExportExcel() {
        var myWindow = window.open("${basePath}zomoreMember/exportExcel.do");
        myWindow.document.title = "会员资料导出excel表";
        window.location.reload()
    }

    //点击编辑数据回显
    function edit(id) {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreMember/updateAjax.do",//url
            data: {"id": id},
            success: function (data) {
                // alert(JSON.stringify(data));
                //修改地址
                $("form[name='actionfome1']").attr("action", "${basePath}zomoreMember/updateZomoreMember.do?memberMemberid=" + data.memberMemberid);
                $("#memberNumber1").val(data.memberNumber);
                $("#memberMemberidname1").val(data.memberMemberidname);
                /*会员等级没有写回显*/
                $("#memberDiscount1").val(data.memberDiscount);
                $("#memberBalance1").val(data.memberBalance);
                $("#memberIntegral1").val(data.memberIntegral);
                $("#memberPhonenumber1").val(data.memberPhonenumber);
                $("#memberPassword1").val(data.memberPassword);
                /*时间类型需要修改*/
                $("#memberDateofopeningcard1").val(data.memberDateofopeningcard);
                $("#memberDuedate1").val(data.memberDuedate);
                $("#memberOncredit1").val(data.memberOncredit);
                /*图片还没有写回显*/
                $("#memberQq1").val(data.memberQq);
                $("#memberEmail1").val(data.memberEmail);
                $("#memberAddress1").val(data.memberAddress);
                $("#memberNote1").val(data.memberNote);
            },
            error: function (result) {
                alert("异常，请稍后再试");
            }
        });
    }
    //下拉列表
    function selectOnclick(date) {
       $("#select11").text(date + " ");
        $("#select11").append("<span class=\"caret\"></span>");
        $("#select111").attr("value", date);
    }

</script>

</body>
</html>