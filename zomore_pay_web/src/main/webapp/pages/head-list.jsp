<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Rukada - Responsive Bootstrap4 Admin Dashboard Template</title>
    <!--favicon-->
    <link rel="icon" href="${pageContext.request.contextPath}/assets/images/favicon.ico" type="image/x-icon">
    <!-- simplebar CSS-->
    <link href="${pageContext.request.contextPath}/assets/plugins/simplebar/css/simplebar.css" rel="stylesheet" />
    <!-- Bootstrap core CSS-->
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" />
    <!-- animate CSS-->
    <link href="${pageContext.request.contextPath}/assets/css/animate.css" rel="stylesheet" type="text/css" />
    <!-- Icons CSS-->
    <link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet" type="text/css" />
    <!-- Sidebar CSS-->
    <link href="${pageContext.request.contextPath}/assets/css/sidebar-menu.css" rel="stylesheet" />
    <!-- Custom Style-->
    <link href="${pageContext.request.contextPath}/assets/css/app-style.css" rel="stylesheet" />

</head>

<body>

<!-- Start wrapper-->
<div id="wrapper">

    <!--Start sidebar-wrapper-->
    <div id="sidebar-wrapper" data-simplebar="" data-simplebar-auto-hide="true">
        <div class="brand-logo">
            <a href="${pageContext.request.contextPath}/index.html">
                <img src="${pageContext.request.contextPath}/assets/images/logo-icon.png" class="logo-icon" alt="logo icon">
                <h5 class="logo-text">择沐</h5>
            </a>
        </div>
        <ul class="sidebar-menu do-nicescrol">
            <li>
                <a href="${pageContext.request.contextPath}/index.html" class="waves-effect">
                    <i class="zmdi zmdi-view-dashboard"></i> <span>商品资料</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sidebar-submenu">
                    <li>
                        <a href="${pageContext.request.contextPath}/superAdmin/findAll.do"><i class="zmdi zmdi-star-outline"></i> 管理员管理</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/superAdmin/findAllShop.do"><i class="zmdi zmdi-star-outline"></i> 店铺管理</a>
                    </li>
                    <li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index3.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v3</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index4.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v4</a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="sidebar-menu do-nicescrol">
            <li>
                <a href="${pageContext.request.contextPath}/index.html" class="waves-effect">
                    <i class="zmdi zmdi-view-dashboard"></i> <span>库存</span> <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="sidebar-submenu">
                    <li>
                        <a href="${pageContext.request.contextPath}/库存查询.html"><i class="zmdi zmdi-star-outline"></i> 库存查询</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index2.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v2</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index3.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v3</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/index4.html"><i class="zmdi zmdi-star-outline"></i> Dashboard v4</a>
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
                    <a class="nav-link toggle-menu" href="javascript:void();">
                        <i class="icon-menu menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <form class="search-bar">
                        <input type="text" class="form-control" placeholder="Enter keywords">
                        <a href="javascript:void();"><i class="icon-magnifier"></i></a>
                    </form>
                </li>
            </ul>

            <ul class="navbar-nav align-items-center right-nav-link">
                <li class="nav-item dropdown-lg">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown" href="javascript:void();">
                        <i class="fa fa-envelope-open-o"></i><span class="badge badge-secondary badge-up">12</span></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                You have 12 new messages
                                <span class="badge badge-secondary">12</span>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3" src="${pageContext.request.contextPath}/assets/images/avatars/avatar-5.png" alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Jhon Deo</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>Today, 4:10 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3" src="${pageContext.request.contextPath}/assets/images/avatars/avatar-6.png" alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Sara Jen</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>Yesterday, 8:30 AM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3" src="${pageContext.request.contextPath}/assets/images/avatars/avatar-7.png" alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Dannish Josh</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet...</p>
                                            <small>5/11/2018, 2:50 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">
                                    <div class="media">
                                        <div class="avatar"><img class="align-self-start mr-3" src="${pageContext.request.contextPath}/assets/images/avatars/avatar-8.png" alt="user avatar"></div>
                                        <div class="media-body">
                                            <h6 class="mt-0 msg-title">Katrina Mccoy</h6>
                                            <p class="msg-info">Lorem ipsum dolor sit amet.</p>
                                            <small>1/11/2018, 2:50 PM</small>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">See All Messages</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item dropdown-lg">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown" href="javascript:void();">
                        <i class="fa fa-bell-o"></i><span class="badge badge-info badge-up">14</span></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item d-flex justify-content-between align-items-center">
                                You have 14 Notifications
                                <span class="badge badge-info">14</span>
                            </li>
                            <li class="list-group-item">
                                <a href="javaScript:void();">
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
                                <a href="javaScript:void();">
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
                                <a href="javaScript:void();">
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
                                <a href="javaScript:void();">See All Notifications</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item language">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret waves-effect" data-toggle="dropdown" href="#"><i class="flag-icon flag-icon-gb"></i></a>
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li class="dropdown-item"> <i class="flag-icon flag-icon-gb mr-2"></i> English</li>
                        <li class="dropdown-item"> <i class="flag-icon flag-icon-fr mr-2"></i> French</li>
                        <li class="dropdown-item"> <i class="flag-icon flag-icon-cn mr-2"></i> Chinese</li>
                        <li class="dropdown-item"> <i class="flag-icon flag-icon-de mr-2"></i> German</li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link dropdown-toggle dropdown-toggle-nocaret" data-toggle="dropdown" href="#">
                        <span class="user-profile"><img src="${pageContext.request.contextPath}/assets/images/avatars/avatar-13.png" class="img-circle" alt="user avatar"></span>
                    </a>
                    <ul class="dropdown-menu dropdown-menu-right">
                        <li class="dropdown-item user-details">
                            <a href="javaScript:void();">
                                <div class="media">
                                    <div class="avatar"><img class="align-self-start mr-3" src="${pageContext.request.contextPath}/assets/images/avatars/avatar-13.png" alt="user avatar"></div>
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
                    <hr>

                    <div>
                        <div>
                            <div style="float: left;">

                                <a href="javascript:void()" class="btn-social-text btn-outline-skype waves-effect waves-light m-1"
                                   data-target="#AdvancedSearch" data-toggle="modal"><span>新增</span></a>
                                <div class="modal fade" id="AdvancedSearch" style="top: 10%">
                                    <div class="modal-dialog modal-lg">
                                        <div class="modal-content">

                                            <div class="card-body" style="position: relative;">
                                                <div class="card-title text-dark">新增管理员页面
                                                    <form action="${pageContext.request.contextPath}/superAdmin/saveHead.do" method="get">
                                                        <table>
                                                            <tr>
                                                                <td class="td_left"><label for="username">用户名</label></td>
                                                                <td class="td_right"><input type="text" name="username" id="username" placeholder="请输入用户名"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="username">密码</label></td>
                                                                <td class="td_right"><input type="password" name="password" id="password" placeholder="请输入密码"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="mail">Email</label></td>
                                                                <td class="td_right"><input type="text" name="mail" id="mail" placeholder="请输入邮箱"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="name">姓名</label></td>
                                                                <td class="td_right"><input type="text" name="name" id="name" placeholder="请输入姓名"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="shopName">店铺名称</label></td>
                                                                <td class="td_right"><input type="text" name="shopName" id="shopName" placeholder="请输入店铺名称"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="phoneNumber">手机号</label></td>
                                                                <td class="td_right"><input type="text" name="phoneNumber" id="phoneNumber" placeholder="请输入手机号"></td>
                                                            </tr>

                                                            <tr>
                                                                <td class="td_left"><label for="registrationTime">注册日期</label></td>
                                                                <td class="td_right"><div class="input-group-addon"><i class="fa fa-calendar"></i></div>                                                                   <input type="date" name="registrationTime" id="registrationTime" placeholder="请输入注册日期"></td>
                                                            </tr>
                                                            <tr>
                                                                <td class="td_left"><label for="dueTime">到期日期</label></td>
                                                                <td class="td_right"><div class="input-group-addon"><i class="fa fa-calendar"></i></div>                                                                   <input type="date" name="dueTime" id="dueTime" placeholder="请输入到期时间"></td>
                                                            </tr>
                                                            <tr>
                                                                <td class="td_left"><label for="address">地址</label></td>
                                                                <td class="td_right"><input type="text" name="address" id="address" placeholder="请输入地址"></td>
                                                            </tr>
                                                            <tr>
                                                                <td class="td_left"><label for="industry">所属行业</label></td>
                                                                <td class="td_right"><input type="text" name="industry" id="industry" placeholder="请输入所属行业"></td>
                                                            </tr>
                                                            <tr>
                                                                <td class="td_left"><label>角色名称</label></td>
                                                                <td class="td_right">
                                                                    <select name="role">
                                                                        <option value="1">连锁店</option>
                                                                        <option value="2">直营店</option>
                                                                        <option value="3">加盟店</option>
                                                                        <option value="4">单店</option>
                                                                    </select>
                                                                </td>
                                                            </tr>




                                                            <tr>
                                                                <td colspan="2" align="center"><input type="submit" id="btn_sub" value="注册"></td>
                                                            </tr>
                                                        </table>
                                                    </form>

                                                </div>
                                                <hr>
                                                <td class="td_left">
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





                                <a href="javascript:void()" class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>导入</span></a>
                                <a href="javascript:void()" class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>导出</span></a>
                            </div>
                        </div>
                        <div>
                            <div style="float: right;">
                                <a href="javascript:void()" class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>高级查询</span></a>
                            </div>
                        </div>
                        <div style="float: right; margin-right: 1%;">
                            <a href="javascript:void()" class="btn-social-text btn-outline-skype waves-effect waves-light m-1"><span>查询</span></a>
                        </div>
                        <div style="float: right; margin-right: 1%;">
                            <input type="text" class="form-control input-shadow my-1" placeholder="名称/条码/拼音码">
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
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">用户名</th>
                    <th scope="col">注册时间</th>
                    <th scope="col">邮箱</th>
                    <th scope="col">电话</th>
                    <th scope="col">姓名</th>
                    <th scope="col">地址</th>
                    <th scope="col">店铺名称</th>
                    <th scope="col">所属行业</th>
                    <th scope="col">到期时间</th>
                    <th scope="col">角色名称</th>
                    <th scope="col">操作</th>
                    <th scope="col">修改</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${headList}" var="head">
                    <tr>
                        <td><input name="ids" type="checkbox"></td>
                        <td>${head.username }</td>
                        <td>${head.registrationTimeStr}</td>
                        <td>${head.mail }</td>
                        <td>${head.phoneNumber }</td>
                        <td>${head.name }</td>
                        <td>${head.address}</td>
                        <td>${head.shopName}</td>
                        <td>${head.industry}</td>
                        <td>${head.dueTimeStr}</td>
                        <td>${head.roleStr}</td>
                        <td><a href="${pageContext.request.contextPath}/superAdmin/findByRole.do?role=${head.role}" class="btn bg-olive btn-xs">详情</a></td>
                        <td><a href="${pageContext.request.contextPath}/superAdmin/findShopById.do?headId=${head.headId}" class="btn bg-olive btn-xs">修改</a></td>
                        <td class="text-center">
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
<a href="javaScript:void();" class="back-to-top"><i class="fa fa-angle-double-up"></i> </a>
<!--End Back To Top Button-->

</div>
<!--End wrapper-->

<!-- Bootstrap core JavaScript-->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<!-- simplebar js -->
<script src="${pageContext.request.contextPath}/assets/plugins/simplebar/js/simplebar.js"></script>
<!-- waves effect js -->
<script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
<!-- sidebar-menu js -->
<script src="${pageContext.request.contextPath}/assets/js/sidebar-menu.js"></script>
<!-- Custom scripts -->
<script src="${pageContext.request.contextPath}/assets/js/app-script.js"></script>

</body>

</html>