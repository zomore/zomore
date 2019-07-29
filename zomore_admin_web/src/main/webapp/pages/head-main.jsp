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



    <%--分页插件--%>
    <link rel="stylesheet" type="text/css" href="../paging/paging.css">
    <link href="../paging/paging2.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../paging/paging.js"></script>
    <script type="text/javascript" src="../paging/jquery-1.11.2.js"></script>

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
<div id="wrapper" class="forced enlarged">


    <!-- Top Bar Start -->
    <div class="topbar">

        <div class="topbar-left">
            <div class="text-center">
                <a href="#" class="logo"><img src="../assets/images/alogo.png"></a>
            </div>
        </div>

        <!-- Button mobile view to collapse sidebar menu -->
        <div class="navbar navbar-default" role="navigation" style="background-color: #1b2432; height: 73px;">
            <div class="container" style="height: 73px;">
                <div class="">
                    <div class="pull-left">
                        <i class="fa fa-star" style="margin-left: 5px;margin-top: 20px; font-size:30px;color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="margin-left: 5px;margin-top: 20px; font-size:30px;color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="margin-left: 5px;margin-top: 20px; font-size:30px;color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="margin-left: 5px;margin-top: 20px; font-size:30px;color: #efc847; background-color: #1b2432;"></i>
                        <i class="fa fa-star" style="margin-left: 5px;margin-top: 20px; font-size:30px;color: #efc847; background-color: #1b2432;"></i>
                        <font style="margin-left:5px;font-size:18px;color: #FFFFFF;">服务商</font>
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
                                        <c:if test="${admin.level eq 1 }">
                                            <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                                    data-target="#full-width-modal">新增客户
                                            </button>
                                        </c:if>
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
                                            <c:forEach items="${headShopList}" var="head" varStatus="status">
                                                <tr>
                                                    <th>${status.count}</th>
                                                    <td>${head.username}</td>
                                                    <td>${head.shopName}</td>
                                                    <td>${head.multiple.multiplename}</td>
                                                    <td>${head.name}</td>
                                                    <td>${head.contact}</td>
                                                    <td>${head.phoneNumber}</td>
                                                    <td>${head.address}</td>
                                                    <td>
                                                        <fmt:formatDate value="${head.registrationTime}"
                                                                        pattern="yyyy-MM-dd"/>
                                                    </td>
                                                    <td>${head.activeDay}</td>
                                                    <td>${head.remark}</td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                        </div>
                                    <div class="row">
                                        <div class="col-lg-12 col-sm-12" style="margin-top: 20px">
                                            <div class="col-lg-4 col-sm-4">共 50 商品</div>
                                            <div class="col-lg-8 col-sm-8">
                                                <div id="pageToolbar" style="float: right">qwrqwer</div>
                                            </div>
                                        </div>
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
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>服务商账号</label>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" name="adminAccount" id="adminAccount" value="">
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
                                    <input type="text" class="form-control" name="multiplename" id="multiplename" value="">
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
                                <label class="col-md-2 control-label"><font style=" color: #F05050;">*</font>店铺类型</label>
                                <div class="col-md-9">
                                    <div class="col-md-2">
                                        <select class="form-control select2" name="role">
                                            <option value="2">连锁直营</option>
                                            <option value="3">连锁加盟</option>
                                            <option value="4">单店</option>
                                            </optgroup>
                                        </select>
                                    </div>
                                    <div class="col-md-7"></div>
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

<%--分页--%>
<script type="text/javascript">
    var page = new Paging();
    var url = "${pageContext.request.contextPath}/";
    //jquery插件的写法
    $("#pageToolbar").Paging({
        //每页显示多少条
        pagesize: 10,
        //总记录数
        count: 50,
        toolbar: true,
        hash: true,
        changePagesize: function (size, pagecount, count) {
            //判断是否带有条件
            var type = $("#selectBytype").find("option:selected").val();
            var suplier = $("#selectBysupplier").find("option:selected").val();
            var code = $('#code').val();
            if (type != "" || suplier != "" || code != "") {
                url="${basePath}zomoreCommodityStore/selectBytypeAjax.do?type="+type+"&suplier="+suplier+"&code="+code;
            }
            //修改每页显示条数
            $.ajax({
                type: "POST",
                url: url,
                data: {"pageNum": pagecount, "pageSize": size},
                success: function (msg) {
                    $('#demo-custom-toolbar tbody').empty();
                    //$('#demo-custom-toolbar').bootstrapTable('append',msg.items);
                    var tr = "";
                    for (var i = 0; i < msg.items.length; i++) {
                        tr="<tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityCode + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityName + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityType + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityStore + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityMain + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityCode + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityNum + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityPingyin + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommoditySpecifications + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityProvide + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityOutall + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }, callback: function (pagecount, size, count) {
            //判断是否带有条件
            var type = $("#selectBytype").find("option:selected").val();
            var suplier = $("#selectBysupplier").find("option:selected").val();
            var code = $('#code').val();
            if (type != "" || suplier != "" || code != "") {
                url="${basePath}zomoreCommodity/selectBytypeAjax.do?type="+type+"&suplier="+suplier+"&code="+code;
            }
            //点击下一页触发
            $.ajax({
                type: "POST",
                url: url,
                data: {"pageNum": pagecount, "pageSize": size},
                success: function (msg) {
                    $('#demo-custom-toolbar tbody').empty();
                    //$('#demo-custom-toolbar').bootstrapTable('append',msg.items);
                    var tr = "";
                    for (var i = 0; i < msg.items.length; i++) {
                        tr="<tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityCode + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityName + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityType + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityStore + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityMain + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityCode + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityNum + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityPingyin + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommoditySpecifications + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityProvide + "</td>\n" +
                            "                                <td>" + msg.items[i].zomoreCommodityOutall + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }
    });

    //非空判断
    function trimNull(str) {
        if (str == null) {
            return "";
        }
        return str;
    }
    //转换状态
    function trimState(str) {
        if (str == "1") {
            return "是";
        }
        return "否";
    }
    //格式化日期
    function getMyDate(str) {
        if (str == null|| str == '') {
            return "";
        }
        var oDate = new Date(str),
            oYear = oDate.getFullYear(),
            oMonth = oDate.getMonth() + 1,
            oDay = oDate.getDate(),
            oHour = oDate.getHours(),
            oMin = oDate.getMinutes(),
            oSen = oDate.getSeconds(),
            //yyyy-MM-dd HH:mm:ss
            oTime = oYear + '-' + addZero(oMonth) + '-' + addZero(oDay) /*+ " " + oHour + ':' + oMin + ':' + oSen*/;
        return oTime;
    } //补零操作
    function addZero(num) {
        if (parseInt(num) < 10) {
            num = '0' + num;
        }
        return num;
    }
</script>

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