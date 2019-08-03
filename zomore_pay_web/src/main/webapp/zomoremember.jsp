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
    <title>Rukada - Responsive Bootstrap4 Admin Dashboard Template</title>
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
                        <a href="index2.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v2</a>
                    </li>
                    <li>
                        <a href="index3.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v3</a>
                    </li>
                    <li>
                        <a href="index4.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v4</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="sidebar-menu do-nicescrol">
            <li>
                <a href="index.html" class="waves-effect">
                    <i class="zmdi zmdi-view-dashboard"></i> <span>库存</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sidebar-submenu">
                    <li>
                        <a href="库存查询.html"><i class="zmdi zmdi-star-outline"></i> 库存查询</a>
                    </li>
                    <li>
                        <a href="index2.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v2</a>
                    </li>
                    <li>
                        <a href="index3.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v3</a>
                    </li>
                    <li>
                        <a href="index4.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v4</a>
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
                    <form class="search-bar">
                        <input type="text" class="form-control" placeholder="Enter keywords">
                        <a href="javascript:void(0);"><i class="icon-magnifier"></i></a>
                    </form>
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

            <div class="row">
                <div class="col-lg-12">
                    <h6 class="text-uppercase mt-3">商品资料</h6>
                    <hr>

                    <div>
                        <div>
                            <div style="float: left;">
                                <a href="${basePath}zomoreMember/insertZomoreMemberUI.do"
                                   class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>新增</span></a>
                                <a href="javascript:void(0)"
                                   class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>导入</span></a>
                                <a href="javascript:void(0)"
                                   class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>导出</span></a>
                            </div>
                                                        <td class="td_right"><input type="text" name="username" id="username" placeholder="请输入用户名"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="password">密码</label></td>
                                                        <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="email">Email</label></td>
                                                        <td class="td_right"><input type="email" name="email" id="email" placeholder="请输入邮箱"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="name">姓名</label></td>
                                                        <td class="td_right"><input type="text" name="name" id="name" placeholder="请输入姓名"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="tel">手机号</label></td>
                                                        <td class="td_right"><input type="text" name="tel" id="tel" placeholder="请输入手机号"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label>性别</label></td>
                                                        <td class="td_right">
                                                            <input type="radio" name="gender" value="male"> 男
                                                            <input type="radio" name="gender" value="female"> 女
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="birthday">出生日期</label></td>
                                                        <td class="td_right"><input type="date" name="birthday" id="birthday" placeholder="请输入出生日期"></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="td_left"><label for="checkcode" >验证码</label></td>
                                                        <td class="td_right"><input type="text" name="checkcode" id="checkcode" placeholder="请输入验证码">
                                                            <img id="img_check" src="img/verify_code.jpg">
                                                        </td>
                                                    </tr>


                                                    <tr>
                                                        <td colspan="2" align="center"><input type="submit" id="btn_sub" value="注册"></td>
                                                    </tr>
                                                </table>
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
                            <a href="javascript:void(0)"
                               class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                               style="color: black">查询</a>
                        </div>
                        <div style="float: right; margin-right: 1%;">
                            <input type="text" class="form-control input-shadow my-1" placeholder="名称/条码/拼音码">
                        </div>
                        <div>
                            <div style="float: right; margin-right: 1%;">
                                <select name="memberGrade" class="form-control single-select">
                                    <option>全部分类</option>
                                    <option value="普通会员">普通会员</option>
                                    <option value="黄金会员">黄金会员</option>
                                    <option value="白金会员">白金会员</option>
                                    <option value="钻石会员">钻石会员</option>
                                </select>
                            </div>
                        </div>


                        <div>
                            <div style="float: right; margin-right: 1%;">
                                <select class="form-control single-select">
                                    <option>全部分类</option>
                                    <option>England</option>
                                    <option>America</option>
                                    <option>China</option>
                                    <option>Australiya</option>
                                    <option>Newzeland</option>
                                    <option>Dubai</option>
                                    <option>United Kingdom</option>
                                </select>
                            </div>
                        </div>


                    </div>
                </div>
            </div>
            <br>

            <table class="table table-light table-striped shadow-light">
                <thead>
                <tr style="text-align: center">
                    <th scope="col">操作</th>
                    <th scope="col">会员号</th>
                    <th scope="col">姓名</th>
                    <th scope="col">电话</th>
                    <th scope="col">会员等级</th>
                    <th scope="col">余额</th>
                    <th scope="col">积分</th>
                    <th scope="col">次卡</th>
                    <th scope="col">购物卡</th>
                    <th scope="col">优惠劵</th>
                    <th scope="col">导购员</th>
                    <th scope="col">开卡日期</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${requestScope.result}" var="result">
                    <tr style="text-align: center">
                        <th scope="row">
                            <a href="${basePath}zomoreMember/updateZomoreMemberUI.do?id=${result.memberMemberid}"
                               style="color: black">编辑</a>&nbsp;
                            <a>查看</a>
                        </th>
                        <td>${result.memberNumber}</td>
                        <td>${result.memberMemberidname}</td>
                        <td>${result.memberPhonenumber}</td>
                        <td>${result.memberGrade}</td>
                        <td>${result.memberBalance}</td>
                        <td>${result.memberIntegral}</td>
                        <td>${result.memberSubcard}</td>
                        <td>${result.memberCoupon}</td>
                        <td>${result.memberCoupon}</td>
                        <td>${result.memberGuide}</td>
                        <td>
                            <fmt:formatDate value="${result.memberDateofopeningcard}"
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
<script src="${basePath}assets/js/jquery.min.js"></script>
<script src="${basePath}assets/js/popper.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<!-- simplebar js -->
<script src="${basePath}assets/plugins/simplebar/js/simplebar.js"></script>
<!-- waves effect js -->
<script src="${basePath}assets/js/waves.js"></script>
<!-- sidebar-menu js -->
<script src="${basePath}assets/js/sidebar-menu.js"></script>
<!-- Custom scripts -->
<script src="${basePath}assets/js/app-script.js"></script>

<script src="${basePath}assets/plugins/bootstrap-treeview/js/bootstrap-treeview.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-treeview/js/treeview-custom-script.js"></script>
<script>
    $(document).ready(function () {

        $("#cont_c").hide();
        //Default data table
        $('#default-datatable').DataTable();

        var table = $('#example').DataTable({
            lengthChange: false,
            buttons: ['copy', 'excel', 'pdf', 'print', 'colvis']
        });

        table.buttons().container()
            .appendTo('#example_wrapper .col-md-6:eq(0)');

    });

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