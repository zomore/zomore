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
<%--供应商--%>
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
                        <p style="font-size: 17px;">供应商资料</p>
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
                                    <button type="button" class="btn btn-info dropdown-toggle waves-effect waves-light"
                                            data-toggle="dropdown" aria-expanded="false">全部标签 <span
                                            class="caret"></span></button>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="#">Action</a></li>
                                        <li><a href="#">Another action</a></li>
                                        <li><a href="#">Something else here</a></li>
                                        <li class="divider"></li>
                                        <li><a href="#">Separated link</a></li>
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
                                    <th data-field="id" data-sortable="true">编号</th>
                                    <th data-field="name" data-sortable="true">名称</th>
                                    <th data-field="date" data-sortable="true" data-formatter="dateFormatter">联系人</th>
                                    <th>电话</th>
                                    <th>邮箱</th>
                                    <th>授权状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${requestScope.result.items}" var="result">
                                    <tr>
                                        <td><input type="checkbox" name="ids" value="${result.zomoreSupplierId}"/></td>
                                        <td>${result.zomoreSupplierId}</td>
                                        <td>${result.zomoreSupplierName}</td>
                                        <td>${result.zomoreSupplierConnectName}</td>
                                        <td>${result.zomoreSupplierConnectPhone}</td>
                                        <td>${result.zomoreSupplierConnectEmail}</td>
                                        <td>${result.zomoreSupplierPrivilegetype==1?'授权':'未授权'}</td>
                                        <td>
                                            <a class="waves-effect waves-light" data-toggle="modal"
                                               data-target="#con-close-modal1" title="${result.zomoreSupplierId}"
                                               name="edit"
                                               style="color: black" onclick="edit(${result.zomoreSupplierId})">编辑</a>&nbsp;
                                            <a href="${basePath}zomoreSupplier/deleted.do?ids=${result.zomoreSupplierId}"
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

    <!-- 新增供应商资料弹窗 -->
    <!-- ============================================================== -->
    <form name="actionfome" action="${basePath}zomoreSupplier/add.do" method="post">
        <div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">供应商资料</h4>
                    </div>

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label class="control-label">是否启用</label>
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
                                    <span class="input-group-addon">供应商编号:</span>
                                    <input class="form-control" id="zomoreSupplierId" type="text" name="zomoreSupplierId"
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
                                    <span class="input-group-addon">供应商名称:</span>
                                    <input class="form-control" id="zomoreSupplierName" type="text"
                                           name="zomoreSupplierName" placeholder="">
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
                                    <span class="input-group-addon">授权状态:</span>
                                    <input class="form-control" id="zomoreSupplierPrivilegetype" name="zomoreSupplierPrivilegetype" type="text" placeholder="（1授权，0未授权）">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">供应商名称拼音:</span>
                                    <input class="form-control" id="zomoreSupplierNamepingyin" name="zomoreSupplierNamepingyin" type="text">
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
                                    <span class="input-group-addon">联系人:</span>
                                    <input class="form-control" id="zomoreSupplierConnectName" name="zomoreSupplierConnectName" type="text">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">联系人电话:</span>
                                    <input class="form-control" id="zomoreSupplierConnectPhone" name="zomoreSupplierConnectPhone" type="text">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div class="row">
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">联系邮箱:</span>
                                    <input  class="form-control" id="zomoreSupplierConnectEmail" name="zomoreSupplierConnectEmail" type="text" placeholder="">
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
                                    <span class="input-group-addon">开户行:</span>
                                    <input class="form-control" id="zomoreSupplierBank" name="zomoreSupplierBank" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">开户名:</span>
                                    <input class="form-control" id="zomoreSupplierBankName" name="zomoreSupplierBankName" type="text"
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
                                    <span class="input-group-addon">银行账号:</span>
                                    <input oninput="if(value.length>11)value=value.slice(0,19)" class="form-control"
                                           id="zomoreSupplierBankNum" name="zomoreSupplierBankNum" type="text" placeholder="">
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
                                        <span class="input-group-addon">纳税人识别号:</span>
                                        <input class="form-control" id="zomoreSupplierRatepayingNamenum" name="zomoreSupplierRatepayingNamenum"
                                               type="text" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">发票抬头:</span>
                                        <input class="form-control" id="zomoreSupplierInvoice"
                                               name="zomoreSupplierInvoice" type="text" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">结算方式:</span>
                                        <input class="form-control" id="zomoreSupplierSettlementType" name="zomoreSupplierSettlementType" type="text"
                                               placeholder="月结或者日结">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">结算详细:</span>
                                        <input class="form-control" id="zomoreSupplierSettlementDetailed" name="zomoreSupplierSettlementDetailed"
                                               type="text" placeholder="如每月多少号结算，或者多少天结算">
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
                                <span class="input-group-addon">配送返点:</span>
                                <input class="form-control" id="zomoreSupplierReturnpointDelivery" name="zomoreSupplierReturnpointDelivery" type="text" placeholder="">
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="input-group">
                                <span class="input-group-addon">固定返点:</span>
                                <input class="form-control" id="zomoreSupplierReturnpointFixed" name="zomoreSupplierReturnpointFixed" type="text"
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
                                <input class="form-control" id="zomoreSupplierAddress" name="zomoreSupplierAddress" type="text"
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
                                <label  class="control-label">备注</label>
                                <textarea class="form-control autogrow" id="zomoreSupplierMeno" name="zomoreSupplierMeno"
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
    <!-- 修改（编辑）供应商资料弹窗 -->
    <!-- ============================================================== -->
    <form name="actionfome1" action="${basePath}zomoreSupplier/add.do" method="post">
        <div id="con-close-modal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                        <h4 class="modal-title">供应商资料</h4>
                    </div>

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-10">
                                <div class="form-group">
                                    <label class="control-label">是否启用</label>
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
                                    <span class="input-group-addon">供应商编号:</span>
                                    <input class="form-control" id="zomoreSupplierId1" type="text" name="zomoreSupplierId"
                                           placeholder="" disabled="disabled">
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
                                    <span class="input-group-addon">供应商名称:</span>
                                    <input class="form-control" id="zomoreSupplierName1" type="text"
                                           name="zomoreSupplierName" placeholder="">
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
                                    <span class="input-group-addon">授权状态:</span>
                                    <input class="form-control" id="zomoreSupplierPrivilegetype1" name="zomoreSupplierPrivilegetype" type="text" placeholder="（1授权，0未授权）">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">供应商名称拼音:</span>
                                    <input class="form-control" id="zomoreSupplierNamepingyin1" name="zomoreSupplierNamepingyin" type="text">
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
                                    <span class="input-group-addon">联系人:</span>
                                    <input class="form-control" id="zomoreSupplierConnectName1" name="zomoreSupplierConnectName" type="text">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">联系人电话:</span>
                                    <input class="form-control" oninput="if(value.length>11)value=value.slice(0,11)" id="zomoreSupplierConnectPhone1" name="zomoreSupplierConnectPhone" type="text">
                                </div>
                            </div>
                        </div>
                        </br>
                        <div class="row">
                            <div class="col-md-11">
                                <div class="input-group">
                                    <span class="input-group-addon">联系邮箱:</span>
                                    <input  class="form-control" id="zomoreSupplierConnectEmail1" name="zomoreSupplierConnectEmail" type="text" placeholder="">
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
                                    <span class="input-group-addon">开户行:</span>
                                    <input class="form-control" id="zomoreSupplierBank1" name="zomoreSupplierBank" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-5">
                                <div class="input-group">
                                    <span class="input-group-addon">开户名:</span>
                                    <input class="form-control" id="zomoreSupplierBankName1" name="zomoreSupplierBankName" type="text"
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
                                    <span class="input-group-addon">银行账号:</span>
                                    <input oninput="if(value.length>11)value=value.slice(0,19)" class="form-control"
                                           id="zomoreSupplierBankNum1" name="zomoreSupplierBankNum" type="text" placeholder="">
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
                                        <span class="input-group-addon">纳税人识别号:</span>
                                        <input class="form-control" id="zomoreSupplierRatepayingNamenum1" name="zomoreSupplierRatepayingNamenum"
                                               type="text" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">发票抬头:</span>
                                        <input class="form-control" id="zomoreSupplierInvoice1"
                                               name="zomoreSupplierInvoice" type="text" placeholder="">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">结算方式:</span>
                                        <input class="form-control" id="zomoreSupplierSettlementType1" name="zomoreSupplierSettlementType" type="text"
                                               placeholder="月结或者日结">
                                    </div>
                                    </br>
                                    <div class="input-group">
                                        <span class="input-group-addon">结算详细:</span>
                                        <input class="form-control" id="zomoreSupplierSettlementDetailed1" name="zomoreSupplierSettlementDetailed"
                                               type="text" placeholder="如每月多少号结算，或者多少天结算">
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
                                <span class="input-group-addon">配送返点:</span>
                                <input class="form-control" id="zomoreSupplierReturnpointDelivery1" name="zomoreSupplierReturnpointDelivery" type="text" placeholder="">
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="input-group">
                                <span class="input-group-addon">固定返点:</span>
                                <input class="form-control" id="zomoreSupplierReturnpointFixed1" name="zomoreSupplierReturnpointFixed" type="text"
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
                                <input class="form-control" id="zomoreSupplierAddress1" name="zomoreSupplierAddress" type="text"
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
                                <label  class="control-label">备注</label>
                                <textarea class="form-control autogrow" id="zomoreSupplierMeno1" name="zomoreSupplierMeno"
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
        myWindow.document.title = "供应商资料导出excel表";
        window.location.reload()
    }

    //点击编辑数据回显
    function edit(id) {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreSupplier/updateAjax.do",//url
            data: {"id": id},
            success: function (data) {
                // alert(JSON.stringify(data));
                //修改地址
                $("form[name='actionfome1']").attr("action", "${basePath}zomoreSupplier/edit.do?zomoreSupplierId=" + data.zomoreSupplierId);

                $("#zomoreSupplierId1").val(data.zomoreSupplierId);
                $("#zomoreSupplierName1").val(data.zomoreSupplierName);
                $("#zomoreSupplierPrivilegetype1").val(data.zomoreSupplierPrivilegetype);
                $("#zomoreSupplierNamepingyin1").val(data.zomoreSupplierNamepingyin);
                $("#zomoreSupplierConnectName1").val(data.zomoreSupplierConnectName);
                $("#zomoreSupplierConnectPhone1").val(data.zomoreSupplierConnectPhone);
                $("#zomoreSupplierConnectEmail1").val(data.zomoreSupplierConnectEmail);
                $("#zomoreSupplierBank1").val(data.zomoreSupplierBank);
                $("#zomoreSupplierBankName1").val(data.zomoreSupplierBankName);
                $("#zomoreSupplierBankNum1").val(data.zomoreSupplierBankNum);
                /*图片还没有写回显*/
                $("#zomoreSupplierRatepayingNamenum1").val(data.zomoreSupplierRatepayingNamenum);
                $("#zomoreSupplierInvoice1").val(data.zomoreSupplierInvoice);
                $("#zomoreSupplierSettlementType1").val(data.zomoreSupplierSettlementType);
                $("#zomoreSupplierSettlementDetailed1").val(data.zomoreSupplierSettlementDetailed);
                $("#zomoreSupplierReturnpointDelivery1").val(data.zomoreSupplierReturnpointDelivery);
                $("#zomoreSupplierReturnpointFixed1").val(data.zomoreSupplierReturnpointFixed);
                $("#zomoreSupplierAddress1").val(data.zomoreSupplierAddress);
                $("#zomoreSupplierMeno1").val(data.zomoreSupplierMeno);
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