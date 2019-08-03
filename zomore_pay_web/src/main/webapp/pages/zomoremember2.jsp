<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>会员资料</title>
    <link href="${basePath}css/tree.css" rel="stylesheet"/>
    <!--favicon-->
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
    <!-- simplebar CSS-->
    <link href="${basePath}assets/plugins/simplebar/css/simplebar.css" rel="stylesheet"/>
    <!-- Bootstrap core CSS-->
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"/>
    <!-- animate CSS-->
    <link href="${basePath}assets/css/animate.css" rel="stylesheet" type="text/css"/>
    <!-- Icons CSS-->
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <!-- Sidebar CSS-->
    <link href="${basePath}assets/css/sidebar-menu.css" rel="stylesheet"/>
    <!-- Custom Style-->
    <link href="${basePath}assets/css/app-style.css" rel="stylesheet"/>

</head>

<body>
<!-- Start wrapper-->
<div id="wrapper">

    <!--Start sidebar-wrapper-->
    <div id="sidebar-wrapper" data-simplebar="" data-simplebar-auto-hide="true">
        <div class="brand-logo">
            <a href="index.html">
                <img src="${basePath}assets/images/logo-icon.png" class="logo-icon" alt="logo icon">
                <h5 class="logo-text">择沐</h5>
            </a>
        </div>
        <ul class="sidebar-menu do-nicescrol">
            <li>
                <a href="${basePath}zomoreMember/selectAllZomoreMember.do" class="waves-effect">
                    <i class="zmdi zmdi-view-dashboard"></i> <span>会员资料</span> <i
                        class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sidebar-submenu">
                    <li>
                        <a href="${basePath}zomoreMember/selectAllZomoreMember.do"><i
                                class="zmdi zmdi-star-outline"></i> 会员资料</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreMembershiplevel/selectAllZomoreMembershiplevel.do"><i
                                class="zmdi zmdi-star-outline"></i> 会员等级</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreIntegral/selectAllZomoreIntegral.do"><i class="zmdi zmdi-star-outline"></i> 积分规则</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCashier/list.do"><i class="zmdi zmdi-star-outline"></i> 员工资料</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreEmployeeRole/list.do"><i class="zmdi zmdi-star-outline"></i> 员工角色管理</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreShoppingGuide/list.do"><i class="zmdi zmdi-star-outline"></i> 导购员</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCashierPerformance/list.do"><i class="zmdi zmdi-star-outline"></i> 员工业绩</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCommodity/list.do"><i class="zmdi zmdi-star-outline"></i> 商品资料</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCommodityCategory/list.do"><i class="zmdi zmdi-star-outline"></i> 商品类目</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCommoditySale/list.do"><i class="zmdi zmdi-star-outline"></i> 销售单据</a>
                    </li>
                    <li>
                        <a href="${basePath}zomoreCommodityOrdergoods/list.do"><i class="zmdi zmdi-star-outline"></i> 订货</a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
    <!--End sidebar-wrapper-->

    <!--Start topbar header-->
    <header class="topbar-nav">
        <nav class="navbar navbar-expand fixed-top bg-white">
            <ul class="navbar-nav mr-auto align-items-center">
                <li class="nav-item">
                    <a class="nav-link toggle-menu" href="javascript:void(0);">
                        <i class="icon-menu menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <input type="text" class="form-control" placeholder="Enter keywords">
                    <a href="javascript:void(0);"><i class="icon-magnifier"></i></a>
                </li>
            </ul>

            <ul class="navbar-nav align-items-center right-nav-link">
                <li class="nav-item dropdown-lg">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown"
                       href="javascript:void(0);">
                        <i class="fa fa-envelope-open-o"></i><span class="badge badge-secondary badge-up">12</span></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                You have 12 new messages
                                <span class="badge badge-secondary">12</span>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3"
                                                                 src="${basePath}assets/images/avatars/avatar-5.png"
                                                                 alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Jhon Deo</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>Today, 4:10 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3"
                                                                 src="${basePath}assets/images/avatars/avatar-6.png"
                                                                 alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Sara Jen</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>Yesterday, 8:30 AM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3"
                                                                 src="${basePath}assets/images/avatars/avatar-7.png"
                                                                 alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Dannish Josh</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>5/11/2018, 2:50 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3"
                                                                 src="${basePath}assets/images/avatars/avatar-8.png"
                                                                 alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Katrina Mccoy</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet.</p>
                                            <small>1/11/2018, 2:50 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">See All Messages</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item dropdown-lg">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown"
                       href="javascript:void(0);">
                        <i class="fa fa-bell-o"></i><span class="badge badge-info badge-up">14</span></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                You have 14 Notifications
                                <span class="badge badge-info">14</span>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <i class="zmdi zmdi-accounts fa-2x mr-3 text-primary"></i>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">New Registered Users</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <i class="zmdi zmdi-coffee fa-2x mr-3 text-success"></i>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">New Received Orders</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">
                                    <div class="media">
                                        <i class="zmdi zmdi-notifications-active fa-2x mr-3 text-secondary"></i>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">New Updates</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:void(0);">See All Notifications</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item language">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown"
                       href="#"><i class="flag-icon flag-icon-gb"></i></a>
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li class="dropdown-item"><i class="flag-icon flag-icon-gb mr-2"></i> English</li>
                        <li class="dropdown-item"><i class="flag-icon flag-icon-fr mr-2"></i> French</li>
                        <li class="dropdown-item"><i class="flag-icon flag-icon-cn mr-2"></i> Chinese</li>
                        <li class="dropdown-item"><i class="flag-icon flag-icon-de mr-2"></i> German</li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret" data-toggle="dropdown" href="#">
                        <span class="user-profile"><img src="${basePath}assets/images/avatars/avatar-13.png"
                                                        class="img-circle" alt="user avatar"></span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li class="dropdown-item user-details">
                            <a href="javascript:void(0);">
                                <div class="media">
                                    <div class="avatar"><img class="align-self-start mr-3"
                                                             src="${basePath}assets/images/avatars/avatar-13.png"
                                                             alt="user avatar"></div>
                                    <div class="media-body">
                                        <h6 class="mt-2 user-title">Katrina Mccoy</h6>
                                        <p class="user-subtitle">mccoy@example.com</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="dropdown-divider"></li>
                        <li class="dropdown-item"><i class="icon-envelope mr-2"></i> Inbox</li>
                        <li class="dropdown-divider"></li>
                        <li class="dropdown-item"><i class="icon-wallet mr-2"></i> Account</li>
                        <li class="dropdown-divider"></li>
                        <li class="dropdown-item"><i class="icon-settings mr-2"></i> Setting</li>
                        <li class="dropdown-divider"></li>
                        <li class="dropdown-item"><i class="icon-power mr-2"></i> Logout</li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>
    <!--End topbar header-->

    <div class="clearfix"></div>

    <div class="content-wrapper">
        <div class="container-fluid">
            <!-- Breadcrumb-->

            <!-- End Breadcrumb-->

            <div class="card-body">
                <div class="col-lg-12">
                    <h6 class="text-uppercase mt-3">商品资料</h6>
                    <hr>

                    <div>
                        <div>
                            <form name="inputfile" action="" method="post" enctype="multipart/form-data">
                                <div style="float: left;">
                                    <a href="${basePath}zomoreMember/insertZomoreMemberUI.do"
                                       class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                                       style="color: #00AFF0"><span>新增</span></a>
                                    <a id="in"
                                       class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                                       style="color: #00AFF0"><span>导入</span></a>
                                    <input type="file" name="importExcelfile" style="display: none" accept=".xls,.xlsx"/>
                                    <a href="javascript:void(0)" id="out"
                                       class="btn-social-text btn-outline-skype waves-effect waves-light m-1 "
                                       style="color: #00AFF0" onclick="doExportExcel()"><span>导出</span></a>
                                </div>
                            </form>
                        </div>
                        <div>
                            <div style="float: right;">
                                <a class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                                   data-target="#AdvancedSearch" data-toggle="modal">高级搜索</a>
                                <div class="modal fade" id="AdvancedSearch" style="top: 10%">
                                    <div class="modal-dialog modal-lg">
                                        <div class="modal-content">

                                            <div class="card-body" style="position: relative;">
                                                <div class="card-title text-dark">商品资料高级搜索</div>
                                                <hr>
                                                <div class="form-group row">
                                                    <label for="input-21"
                                                           class="col-sm-2 col-form-label">分类</label>
                                                    <div class="col-sm-10">
                                                        不限分类 &nbsp;&nbsp;<a
                                                            href="javascript:void(0)"
                                                            onclick="selectClassification()">选择分类</a>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-22"
                                                           class="col-sm-2 col-form-label">品牌</label>
                                                    <div class="col-sm-10">
                                                        不限品牌 &nbsp;&nbsp;<a href="#">选择品牌</a>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-23"
                                                           class="col-sm-2 col-form-label">标签</label>
                                                    <div class="col-sm-10">
                                                        默认分组 &nbsp;&nbsp;<a href="#">名牌</a>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-24"
                                                           class="col-sm-2 col-form-label">供应商</label>
                                                    <div class="form-group row">
                                                        <label class="col-sm-2 col-form-label"></label>
                                                        <div class="col-sm-10">
                                                            <table>
                                                                <tr>
                                                                    <td>
                                                                        <div class="icheck-material-primary">
                                                                            <input type="checkbox"
                                                                                   id="user-checkbox5"/>
                                                                            <label>STCPOS</label>
                                                                        </div>
                                                                    </td>
                                                                    <td>
                                                                        <div class="icheck-material-primary">
                                                                            <input type="checkbox"
                                                                                   id="user-checkbox5"/>
                                                                            <label>zhang</label>
                                                                        </div>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-24"
                                                           class="col-sm-2 col-form-label">商品状态</label>
                                                    <div class="col-sm-10">
                                                        禁用 &nbsp;&nbsp;启用
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-25"
                                                           class="col-sm-2 col-form-label">会员折扣</label>
                                                    <div class="col-sm-10">
                                                        是 &nbsp;&nbsp;否
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-22"
                                                           class="col-sm-2 col-form-label">录入时间</label>
                                                    <div class="col-sm-10">
                                                        <div class='input-group date'
                                                             id='datetimepicker2'>
                                                            <input type="date"
                                                                   class="form-control"/>
                                                            <span class="input-group-addon">
                                                                <span class="glyphicon glyphicon-calendar"></span>
                                                                </span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-23"
                                                           class="col-sm-2 col-form-label">价格区间</label>
                                                    <div class="col-sm-10">
                                                        <div class="form-group">
                                                            <div class="row">
                                                                <div class="col-md-5">
                                                                    <input type="email"
                                                                           class="form-control"
                                                                           placeholder="价格">
                                                                </div>
                                                                --
                                                                <div class="col-md-5">
                                                                    <input type="email"
                                                                           class="form-control"
                                                                           placeholder="价格">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-24"
                                                           class="col-sm-2 col-form-label">库存区间</label>
                                                    <div class="col-sm-10">
                                                        <div class="form-group">
                                                            <div class="row">
                                                                <div class="col-md-5">
                                                                    <input type="email"
                                                                           class="form-control"
                                                                           placeholder="">
                                                                </div>
                                                                --
                                                                <div class="col-md-5">
                                                                    <input type="email"
                                                                           class="form-control"
                                                                           placeholder="">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="form-group row">
                                                    <label for="input-25"
                                                           class="col-sm-2 col-form-label">商品规格</label>
                                                    <div class="col-sm-10">
                                                        <input type="text" class="form-control"
                                                               id="input-25" placeholder="输入关键字查询">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-inverse-primary"
                                                        data-dismiss="modal"><i class="fa fa-times"></i>
                                                    关闭
                                                </button>
                                                <button type="button" class="btn btn-primary"><i
                                                        class="fa fa-check-square-o"></i> 确定
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div style="float: right; margin-right: 1%;">
                            <a id="Checked" href="javascript:void(0)"
                               class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                               style="color: black">查询</a>
                        </div>
                        <div style="float: right; margin-right: 1%;">
                            <input name="condition" type="text" class="form-control input-shadow my-1"
                                   placeholder="姓名"
                                   value="${requestScope.condition}">
                        </div>
                        <div>
                            <div style="float: right; margin-right: 1%;">
                                <select name="memberGrade" class="form-control single-select">
                                    <option name="memberGrade" value="0">全部分类</option>
                                    <c:forEach items="${requestScope.memberGradeList}" var="memberGrade1">
                                        <option name="memberGrade" value="${memberGrade1.membershiplevelName}"
                                            <%--<c:if test="${requestScope.memberGrade==memberGrade1.membershiplevelName}">
                                                selected
                                            </c:if>--%>
                                        >${memberGrade1.membershiplevelName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <br>
            <input type="hidden" value="${requestScope.memberGrade}" name="aa">
            <table id="example" class="table table-light table-striped shadow-light">
                <thead>
                <tr style="text-align: center">
                    <th scope="col">操作</th>
                    <th scope="col">会员号</th>
                    <th scope="col">姓名</th>
                    <th scope="col">电话</th>
                    <th scope="col">会员等级</th>
                    <th scope="col">优惠折扣</th>
                    <th scope="col">余额</th>
                    <th scope="col">积分</th>
                    <th scope="col">次卡</th>
                    <th scope="col">优惠劵</th>
                    <th scope="col">导购员</th>
                    <th scope="col">开卡日期</th>
                    <th scope="col">到期日期</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.result}" var="result">
                    <tr style="text-align: center">
                        <th scope="row">
                            <a href="${basePath}zomoreMember/updateZomoreMemberUI.do?id=${result.memberMemberid}"
                               style="color: black">编辑</a>&nbsp;
                            <a href="${basePath}zomoreMember/deletedZomoreMember.do?ids=${result.memberMemberid}"
                               style="color: black">删除</a>
                        </th>
                        <td>${result.memberNumber}</td>
                        <td>${result.memberMemberidname}</td>
                        <td>${result.memberPhonenumber}</td>
                        <td>${result.memberGrade}</td>
                        <td>${result.memberDiscount}折</td>
                        <td>${result.memberBalance}</td>
                        <td>${result.memberIntegral}</td>
                        <td>${result.memberSubcard}</td>
                        <td>${result.memberCoupon}</td>
                        <td>${result.memberGuide}</td>
                        <td>
                            <fmt:formatDate value="${result.memberDateofopeningcard}"
                                            pattern="yyyy-MM-dd"></fmt:formatDate>
                        </td>
                        <td>
                            <fmt:formatDate value="${result.memberDuedate}"
                                            pattern="yyyy-MM-dd"></fmt:formatDate>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <!--End Row-->

</div>
<!-- End container-fluid-->

</div>
<!--End content-wrapper-->
<!--Start Back To Top Button-->
<a href="javascript:void(0);" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
<!--End Back To Top Button-->

</div>
<!--End wrapper-->
<!-- Bootstrap core JavaScript-->
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/popper.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<!-- simplebar js -->
<script src="../assets/plugins/simplebar/js/simplebar.js"></script>
<!-- waves effect js -->
<script src="../assets/js/waves.js"></script>
<!-- sidebar-menu js -->
<script src="../assets/js/sidebar-menu.js"></script>
<!-- Custom scripts -->
<script src="../assets/js/app-script.js"></script>

<script src="../assets/plugins/bootstrap-treeview/js/bootstrap-treeview.min.js"></script>
<script src="../assets/plugins/bootstrap-treeview/js/treeview-custom-script.js"></script>

<!--Data Tables js-->
<script src="../assets/plugins/bootstrap-datatable/js/jquery.dataTables.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/dataTables.bootstrap4.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/dataTables.buttons.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/buttons.bootstrap4.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/jszip.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/pdfmake.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/vfs_fonts.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/buttons.html5.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/buttons.print.min.js"></script>
<script src="../assets/plugins/bootstrap-datatable/js/buttons.colVis.min.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $("#Checked").click(function () {
            location.href = "${basePath}zomoreMember/selectAllZomoreMemberByCondition.do?condition=" + $("input[name='condition']").val();
        });
        $("option[name='memberGrade']").each(function () {
            if ($("input[name='aa']").val() != null) {
                if ($(this).val() == $("input[name='aa']").val()) {
                    $(this).attr("selected", "selected");
                }
            }
        });
        $("select[name='memberGrade']").change(function () {
            var url = "${basePath}zomoreMember/selectAllZomoreMemberByType.do?Grade=" + $(this).val();
            location.href = url;
        });
        //导入
        $("#in").on('click', function (e) {
            e.preventDefault();
            $("input[name='importExcelfile']").trigger('click');
        })
        $("input[name='importExcelfile']").change(function () {
            document.forms[0].action = "${basePath}zomoreMember/importExcel.do";
            document.forms[0].submit();
            /* var form = $("form[name='inputfile']");
               $.ajax({
                   url: '
            ${basePath}zomoreMember/importExcel.do',
                data: form,
                type: 'POST',
                processData:false,
                contentType:false,
                success: function (data) {

                }
            })*/
            /*   $.ajax({
                   type: "POST",
                   url: "
            ${basePath}zomoreMember/importExcel.do",
                data: {"ss":"aa"},
                success: function(msg){
                    alert( "Data Saved: " + msg );
                }
            });*/

        });
        $("#cont_c").hide();
        //Default data table
        // $('#default-datatable').DataTable();

        /* var table = $('#example').DataTable({
                lengthChange: false,
                buttons: ['copy', 'excel', 'pdf', 'print', 'colvis']
            });


            table.buttons().container()
                .appendTo('#example_wrapper .col-md-6:eq(0)');
    */
    });
   //导出
    function doExportExcel() {
        var myWindow=window.open("${basePath}zomoreMember/exportExcel.do");
        myWindow.document.title="会员资料导出excel表";
        window.location.reload()
    }

    //点击分类
    function selectClassification() {
        $("#cont_c").css('z-index', '9999');
        $("#cont_c").show();
    }

    //关闭窗口
    function closeWindow() {
        $("#cont_c").hide();
    }

    function closeWindow1() {
        $("#allClassification").hide();
    }

    function closeWindow2() {
        $("#allLable").hide();
    }

    //全部分类
    function allClassification() {
        $("#allClassification").hide();
        $("#allClassification").show();
    }

    //全部标签
    function allLable() {
        $("#allLable").hide();
        $("#allLable").show();
    }
</script>
</body>

</html>