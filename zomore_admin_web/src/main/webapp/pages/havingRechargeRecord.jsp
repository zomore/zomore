<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="../assets/images/favicon_1.ico">

    <title>充值</title>

    <!--Morris Chart CSS -->
    <link rel="stylesheet" href="../assets/plugins/morris/morris.css">
    <link href="../assets/plugins/sweetalert/dist/sweetalert.css" rel="stylesheet" type="text/css">

    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/core.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/components.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/icons.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/pages.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/responsive.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/menu.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

    <script src="../assets/js/modernizr.min.js"></script>

</head>


<body class="fixed-left">

<!-- Begin page -->
<div id="wrapper" class="forced enlarged">

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
                        <i class="fa fa-star" style="color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="color: #efc847; background-color: #1b2432;"></i>
                        <font style="color: #FFFFFF;">服务商</font>
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
                    <c:forEach items="${menuList}" var="menuList">
                        <li class="has_sub">
                            <a href="#" class="waves-effect waves-light"><font class="hidetxt" style="font-size: 16px">${menuList.menuName}</font><span class="pull-right"><i class="md md-add"></i></span></a>
                            <ul class="list-unstyled">
                                <li><a href="#"></a></li>
                                <c:forEach items="${menuItemList}" var="menuItemList">
                                    <c:if test="${menuItemList.menuId eq menuList.menuId}">
                                        <li><a href="${pageContext.request.contextPath}${menuItemList.url}" style="font-size: 16px">${menuItemList.menuitemName}</a></li>
                                    </c:if>
                                </c:forEach>
                            </ul>
                        </li>
                    </c:forEach>
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
                        <h4 class="page-title">充值</h4>
                    </div>
                </div>

                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="col-sm-1"><button type="button" class="btn btn-white waves-effect" data-toggle="modal" data-target="#zomore-call" style="margin-bottom: 10px;">充 值</button></div>
                        <div class="col-sm-3"></div>
                        <div class="col-sm-4"></div>
                        <div class="col-sm-4"></div>
                    </div>
                </div>
                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>
                <div class="col-lg-12">
                    <h4 class="m-t-0 header-title"><b></b></h4>
                    <p class="text-muted font-13">充值明细表</p>
                    <div class="p-20">
                        <table class="table table-bordered m-0">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>账号</th>
                                <th>名称</th>
                                <th>充值数量</th>
                                <th>充值金额</th>
                                <th>充值时间</th>
                                <th>备注</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${havingRechargedRecordList}" var="rechargedRecord" varStatus="status">
                                <tr>
                                    <th>${status.count}</th>
                                    <td>${rechargedRecord.rechargeAccount}</td>
                                    <td>${rechargedRecord.accountName}</td>
                                    <td>1</td>
                                    <td>${rechargedRecord.rechargedAmount}</td>
                                    <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${rechargedRecord.rechargeTime}"></fmt:formatDate></td>
                                    <td>${rechargedRecord.remark}</td>
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

<!-- sample modal content -->
<div id="zomore-call" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel" aria-hidden="true" style="display: none;">
    <div class="modal-dialog modal-full">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="full-width-modalLabel">充值金额</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-lg-12">
                        <form action="${pageContext.request.contextPath}/superAdmin/rechargeToAdmin.do" method="post">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="col-sm-2" style="width:9%"><h4>充值账号：</h4></div>
                                <div class="col-sm-3"><input type="text" class="form-control" value="" name="rechargeAccount" style="float: right;"></div>
                               <%-- <div class="col-sm-8"><h4>余额：￥888888</h4></div>--%>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="col-sm-2"style="width: 9%"><h4>充值金额：</h4></div>
                                <div class="col-sm-3" style="float: left;"><input type="text" class="form-control" name="rechargedAmount" value=""></div>
                                <div class="col-sm-4">
                                </div>
                                <div class="col-sm-4"></div>
                            </div>
                        </div>

                        <div class="modal-footer">
                            <button type="submit" class="btn btn-white waves-effect" data-toggle="modal" data-target="#zomore-call">确认充值</button>
                            <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
                        </div>
                        </form>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal --><!-- /.modal -->
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
        <script src="../assets/js/jquery.nicescroll.js"></script>
        <script src="../assets/js/jquery.scrollTo.min.js"></script>
        <!-- jQuery  -->
        <script src="../assets/plugins/moment/moment.js"></script>
        <script src="../assets/plugins/morris/morris.min.js"></script>
        <script src="../assets/plugins/raphael/raphael-min.js"></script>
        <script src="../assets/plugins/sweetalert/dist/sweetalert.min.js"></script>

        <!-- Todojs  -->
        <script src="../assets/pages/jquery.todo.js"></script>

        <!-- chatjs  -->
        <script src="../assets/pages/jquery.chat.js"></script>
        <script src="../assets/plugins/peity/jquery.peity.min.js"></script>
        <script src="../assets/pages/jquery.dashboard_2.js"></script>
        <script src="../assets/plugins/peity/jquery.peity.min.js"></script>

        <!-- jQuery  -->
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>


</body>
</html>