<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="app" lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="../assets/images/favicon_1.ico">

    <title>服务商</title>

    <!--Morris Chart CSS -->
    <link rel="stylesheet" href="../assets/plugins/morris/morris.css">
    <link href="../assets/plugins/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">

    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/responsive.css" rel="stylesheet" type="text/css"/>
    <link href="../assets/css/menu.css" rel="stylesheet" type="text/css">
    <link href="../assets/css/wui.min.css" rel="stylesheet" type="text/css">
    <link href="../assets/css/style.css" rel="stylesheet" type="text/css">
    <link href="../assets/css/iconfont.css" rel="stylesheet" type="text/css">
    <link href="../assets/css/icons.css" rel="stylesheet" type="text/css"/>

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

    <script src="../assets/js/modernizr.min.js"></script>
    <!--时间选择器-->
    <link href="../assets/css/wui.min.css" rel="stylesheet" type="text/css">
    <link href="../assets/css/style.css" rel="stylesheet" type="text/css">

    <script src="../assets/js/modernizr.min.js"></script>
    <script type="text/javascript" src="../assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="../assets/js/angular.min.js"></script>
    <script type="text/javascript" src="../assets/js/wui-date.js" charset="utf-8"></script>

</head>


<body class="fixed-left">

<!-- Begin page -->
<!-- Top Bar Start -->
<div class="topbar">

    <div class="topbar-left">
        <div class="text-center">
            <a href="#" class="logo"><img src="../assets/images/alogo.png"</a>
        </div>
    </div>

    <!-- Button mobile view to collapse sidebar menu -->
    <div class="navbar navbar-default" role="navigation" style="background-color: #1b2432; height: 73px;">
        <div class="container" style="height: 73px;">
            <div class="">
                <div class="pull-left">
                    <button class="button-menu-mobile open-left">
                        <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                        <font style="color: #FFFFFF;">服务商</font>
                    </button>
                    <span class="clearfix"></span>
                </div>
                <ul class="nav navbar-nav navbar-right pull-right" style="margin-top: 25px">
                    <li><a href="${pageContext.request.contextPath}/logout.do" title="退出"><i class="ti-power-off m-r-5" style="color: #ffffff"></i></a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right pull-right">
                    <li class="hidden-xs" style=" margin-top: 15px; margin-left: 20px;">
                        <h4 style="color: #FFFFFF;">择沐</h4>
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
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">大客户</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/findAllAdmin.do" style="font-size: 16px">大客户列表</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">我的客户</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="#"></a></li>
                        <li><a href="#" style="font-size: 16px">客户列表</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/findAllMultiple.do" style="font-size: 16px">连锁客户</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/findAllHead.do" style="font-size: 16px">单店客户</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">报备客户</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/findAllReportedCustomer.do" style="font-size: 16px">报备客户</a></li>
                    </ul>
                </li>

                <!--超管才有的目录-->
                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">客户充值</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <div class="title">客户充值</div>
                        <li><a href="${pageContext.request.contextPath}/superAdmin/findAllApplicationRechargeRecord.do" style="font-size: 16px;">客户充值申请</a></li>
                        <li><a href="${pageContext.request.contextPath}/superAdmin/findAllAdminRechargedRecord.do" style="font-size: 16px;">客户充值记录</a></li>
                        <li><a href="${pageContext.request.contextPath}/superAdmin/findAllHavingRechargedRecord.do" style="font-size: 16px;">客户充值统计</a></li>
                        <li><a href="#" style="font-size: 16px;">客户余额变动</a></li>
                    </ul>
                </li>
                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">客户记录</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <div class="title">客户开通记录</div>
                        <li><a href="#" style="font-size: 16px;">大客户记录</a></li>
                        <li><a href="#" style="font-size: 16px;">客户开通记录</a></li>
                    </ul>
                </li>
                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">支付绑定</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <div class="title">支付绑定</div>
                        <li><a href="#" style="font-size: 16px;">支付绑定</a></li>
                    </ul>
                </li>
                <!--超管才有的目录 END-->


                <!--超管给权限才有的目录-->
                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">库存提醒</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <div class="title">库存提醒</div>
                        <li><a href="#" style="font-size: 16px;">库存不足提醒</a></li>
                    </ul>
                </li>
                <!--超管给权限才有的目录 END-->

                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">个人资料</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/selectPersonalData.do" style="font-size: 16px">余额变动</a></li>
                    </ul>
                </li>

                <li class="has_sub">
                    <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">修改密码</font><span class="pull-right"><i class="md md-add"></i></span></a>
                    <ul class="list-unstyled">
                        <li><a href="#"></a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/getAdminByUsername.do" style="font-size: 16px">修改密码</a></li>
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
            <div class="container" style=" width: 97%; margin-left: 3%;">


                <!-- Page-Title -->
                <div class="row" style="margin-bottom: 10px">
                    <div class="col-sm-3">
                        <h4 class="page-title">我的客户</h4>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="col-lg-8 col-sm-8">
                                    <div class="button-list" style="margin-top: 11px;">
                                        <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                                data-target="#full-width-modal">新增客户
                                        </button>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-2">
                                    <div class="button-list">
                                        <div class="input-group">
                                            <div class="input-group m-t-10">
                                                <input class="form-control" id="showData" type="text">
                                                <span class="input-group-btn">
                                             <button class="btn btn-info waves-effect waves-light" id="getData"
                                                     type="button"
                                                     style="padding: 7px;background-color: #ddd !important;border: 1px solid #f4f8fb !important;">搜索</button>
                                      </span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div>

                                <div class="col-lg-12">
                                    <h4 class="m-t-0 header-title"><b></b></h4>
                                    <p class="text-muted font-13"></p>
                                    <div class="p-20">
                                        <table class="table table-bordered m-0">
                                            <thead>
                                            <tr>
                                                <th>序号</th>
                                                <th>账号</th>
                                                <th>店名</th>
                                                <th>总部账号</th>
                                                <th>总部名称</th>
                                                <th>联系人</th>
                                                <th>联系方式</th>
                                                <th>门店地址</th>
                                                <th>开通时间</th>
                                                <th>活跃天数</th>
                                                <th>备注</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${shopList}" var="shop">
                                                <tr>
                                                    <th>1</th>
                                                    <td>${shop.username}</td>
                                                    <td>${shop.shopName}</td>
                                                    <td>${shop.multiple.username}</td>
                                                    <td>${shop.name}</td>
                                                    <td>${shop.contact}</td>
                                                    <td>${shop.phoneNumber}</td>
                                                    <td>${shop.address}</td>
                                                    <td>
                                                        <fmt:formatDate value="${shop.registrationTime}"
                                                                        pattern="yyyy-MM-dd"/>
                                                    </td>
                                                    <td>${shop.activeDay}</td>
                                                    <td>${shop.remark}</td>
                                                </tr>
                                            </c:forEach>

                                            </tbody>
                                        </table>
                                        <div>
                                            <ul class="pagination" style="float: right;">
                                                <li class="disabled">
                                                    <a href="#"><i class="fa fa-angle-left"></i></a>
                                                </li>
                                                <li>
                                                    <a href="#">1</a>
                                                </li>
                                                <li class="active">
                                                    <a href="#">2</a>
                                                </li>
                                                <li>
                                                    <a href="#">3</a>
                                                </li>
                                                <li>
                                                    <a href="#">4</a>
                                                </li>
                                                <li>
                                                    <a href="#">5</a>
                                                </li>
                                                <li>
                                                    <a href="#"><i class="fa fa-angle-right"></i></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>

</div>
</div> <!-- content -->
</div>
</div>


<!-- END wrapper -->


<!-- 新增客户弹窗 -->
<div id="full-width-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
     aria-hidden="true" style="display: none;">
    <div class="modal-dialog modal-full">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="full-width-modalLabel">新增客户</h4>
            </div>
            <div class="modal-body">

                <div class="row">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form"
                              action="${pageContext.request.contextPath}/admin/saveSingleShop.do">
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>账号</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="username" id="username" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>密码</label>
                                <div class="col-md-9">
                                    <input type="password" class="form-control" name="password" id="password" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>店名</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="shopName" id="shopName" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>总部账号</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="multipleId" id="multipleId" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>总部名称</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="name" id="name" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>联系人</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="contact" id="contact" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>联系方式</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="phoneNumber" id="phoneNumber"
                                           value="">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>邮箱</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="mail" id="mail" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>门店地址</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="address" id="address" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>开通时间</label>
                                <div class="col-md-9">
                                    <div class="col-sm-2 col-sm-2" style="float: left;">
                                        <div class="form-group">
                                            <div class="wui-area">
                                                <wui-date format="yyyy-mm-dd" placeholder="请选择或输入日期" id="date1"
                                                          btns="{'ok':'确定','now':'此刻'}" name="registrationTime"
                                                          ng-model="date1"></wui-date>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-md-2 control-label"><font
                                        style=" color: #F05050;">*</font>活跃天数</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="activeDate" id="activeDay" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">备注</label>
                                <div class="col-md-9">
                                    <textarea class="form-control" rows="5" name="remark" id="remark"></textarea>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary waves-effect waves-light">保存</button>
            </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal --><!-- /.modal -->


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
<script src="../assets/js/wui-date.js"></script>
<script src="../assets/js/angular.js"></script>
<script src="../assets/js/angular.min.js"></script>

<script type="text/javascript">
    var app = angular.module('app', ["wui.date"]);
</script>


</body>
</html>