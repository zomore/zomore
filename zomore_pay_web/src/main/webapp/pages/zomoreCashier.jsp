<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html ng-app="app" lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">

    <title>收银台资料</title>

    <link href="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="${basePath}assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/responsive.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet"/>
    <link href="${basePath}assets/plugins/select2/select2.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/iconfont.css" rel="stylesheet" type="text/css"/>
    <!--[if lt IE 9]>
    <![endif]-->
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <!--时间选择器-->
    <link href="${basePath}assets/css/wui.min.css" rel="stylesheet" type="text/css">
    <link href="${basePath}assets/css/style.css" rel="stylesheet" type="text/css">

    <script src="${basePath}assets/js/modernizr.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/angular.min.js"></script>
    <script type="text/javascript" src="${basePath}assets/js/wui-date.js" charset="utf-8"></script>
    <%--分页插件--%>
    <link rel="stylesheet" type="text/css" href="${basePath}paging/paging.css">
    <script type="text/javascript" src="${basePath}paging/paging.js"></script>
    <style type="text/css">
        .gd {
            width: 1024px;
            margin-left: 17%;
        }
    </style>

</head>
</br>

<body class="fixed-left">
<!-- Begin page -->
<div id="wrapper" class="forced enlarged">
    <!-- 头部开始 -->
    <div class="topbar">

        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="#" class="logo"><img src="${basePath}assets/images/alogo.png"></a>
            </div>
        </div>


        <!-- 头部内容 -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <div class="pull-left">
                        <p style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f">收银台资料</p>
                    </div>
                    <span style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f"
                          id="tonerInfowarning"></span>
                    <ul class="nav navbar-nav navbar-right pull-right" style="padding: 0px;">
                        <li class="dropdown hidden-xs  ">
                            <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light"
                               data-toggle="dropdown" aria-expanded="true">
                                <i class="icon-bell"></i> <span
                                    class="badge badge-xs badge-danger">${sessionScope.warmming.totalCount}</span>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-lg jiange">
                                <li class="notifi-title">
                                    <span style="margin-left: 10px"> 新消息提醒</span>
                                    <span class="label label-default pull-right">${sessionScope.warmming.totalCount}</span>
                                </li>
                                <li class="list-group nicescroll notification-list">
                                    <c:forEach items="${sessionScope.warmming.items}" var="warmming">
                                        <a href="javascript:void(0);" class="list-group-item">
                                            <div class="media">
                                                <div class="card-body">
                                                    <h5 class="media-heading">库存预警</h5>
                                                </div>
                                                <div>
                                                    您的"${warmming.zomoreCommodityName}"商品
                                                    <br>
                                                    库存已经低于${warmming.zomoreCommodityDownlimit}，请及时补充
                                                </div>
                                            </div>
                                        </a>
                                    </c:forEach>
                                </li>
                                <li>
                                    <a href="${basePath}zomoreCommodityStoreWarning/list.do"
                                       class="list-group-item text-right">
                                        <small class="font-600">查看所有通知</small>
                                    </a>
                                </li>
                            </ul>
                        </li >


                        <li class="hidden-xs" style="margin-top: 10px; margin-left: 20px;">
                            <h4>${sessionScope.shopName}</h4>
                        </li>
                        <li class="dropdown">
                            <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><i
                                    class="ti-power-off m-r-5"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="${basePath}pages/zomoreAccount.jsp"><i class="ti-settings m-r-5"></i> 设置</a></li>
                                <li><a href="${basePath}headShop/logout.do"><i class="ti-power-off m-r-5"></i> 退出</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <!-- 头部内容栏结束 -->

    <!-- ========== 左侧栏内容 ========== -->

    </div>
    <!-- 左侧导航栏结束 --> 

    <!-- ============================================================== -->
    <!-- Start right Content here -->
    <!-- ============================================================== -->
</div>
<div class="gd" style="height: 1088px; margin-top: 67px;">
    <div class="row">
        <div class="col-sm-12">
            <div class="card-box">
                <div class="col-sm-5">
                    <div class="button-list">
                        <!-- Full width modal -->
                    </div>
                </div>
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="col-sm-5 col-sm-5">
                                <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                        data-target="#zomore-call">新增
                                </button>
                            </div>
                            <div class="col-sm-2 col-sm-2">
                            </div>
                            <div class="col-sm-2 col-sm-2">
                            </div>
                            <div class="col-sm-3 col-sm-3">
                                <form action="${basePath}zomoreCashier/search.do" method="post">
                                    <div class="input-group">
                                        <input type="text" id="condent" name="condent"
                                               class="form-control" placeholder="名称" value="${requestScope.condent}">
                                        <span class="input-group-btn">
                          <button type="submit" class="btn btn-white waves-effect"
                                  >查询</button>
                        </span>
                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>
                    <div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
                    <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered ">
                        <thead>
                        <thead>
                        <tr>
                            <th data-field="id" data-align="center" data-sortable="true">序号</th>
                            <th data-field="a" data-align="center">操作</th>
                            <th data-field="b" data-align="center" data-formatter="dateFormatter">所属门店</th>
                            <th data-field="c" data-align="center" data-sortable="true" data-sorter="priceSorter">编号
                            </th>
                            <th data-field="d" data-align="center" data-sorter="statusFormatter">
                                名称
                            </th>
                            <th data-field="f" data-align="center" >角色</th>
                            <th data-field="g" data-align="center" data-formatter="dateFormatter">密码</th>
                            <th data-field="h" data-align="center" data-sortable="true" data-sorter="priceSorter">电话
                            </th>
                            <th data-field="j" data-align="center" data-sorter="priceSorter">状态
                            </th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${requestScope.result.items}" var="result" varStatus="stape">
                            <tr>
                                <td>${stape.count}</td>
                                <td scope="row">
                                    <a class="waves-effect waves-light" data-toggle="modal"
                                       data-target="#zomore-call1" title="${result.cashierNumber}"
                                       name="edit"
                                       style="color: black" onclick="edit('${result.cashierNumber}')">编辑</a>&nbsp;
                                    <a href="javascript:void(0)"
                                       style="color: black"
                                       onclick="deleted('${result.cashierNumber}')">删除</a>
                                </td>
                                <td>${result.cashierStore}</td>
                                <td>${result.cashierNumber}</td>
                                <td>${result.cashierName}</td>
                                <td>${result.cashierRolename}</td>
                                <td>${result.cashierPassword}</td>
                                <td>${result.cashierPhone}</td>
                                <td>${result.cashierState=='1'?"启用":"禁用"}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="row">
                    <div class="col-lg-12 col-sm-12" style="margin-top: 20px">
                        <div class="col-lg-4 col-sm-4">共 ${requestScope.result.totalCount} 收银台</div>
                        <div class="col-lg-8 col-sm-8">
                            <div id="pageToolbar" style="float: right"></div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
</div>
<!--Custom Toolbar-->
<!--===================================================-->
<%--分页--%>
<script type="text/javascript">
    function deleted(id) {
        if(confirm("确定要删除该会员的资料吗?")){
            window.location.href="${basePath}zomoreCashier/deleted.do?ids="+id;
        }
    }
    var page = new Paging();
    var url = "${basePath}zomoreCashier/listAjax.do";
    //jquery插件的写法
    $('#pageToolbar').Paging({
        //每页显示多少条
        pagesize: ${requestScope.result.pageSize},
        //总记录数
        count: ${requestScope.result.totalCount},
        toolbar: true,
        hash: true,
        changePagesize: function (size, pagecount, count) {
            //判断是否带有条件
            var condent = $('#condent').val();
            if (condent != "") {
                url = "${basePath}zomoreCashier/searchAjax.do?condent=" + condent;
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
                        tr = "<tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td scope=\"row\">\n" +
                            "                                    <a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                       data-target=\"#zomore-call1\" title=\"" + msg.items[i].cashierNumber + "\"\n" +
                            "                                       name=\"edit\"\n" +
                            "                                       style=\"color: black\" onclick=\"edit('" + msg.items[i].cashierNumber + "')\">编辑</a>&nbsp;\n" +
                            "                                    <a href=\"${basePath}zomoreCashier/deleted.do?ids=" + msg.items[i].cashierNumber + "\"\n" +
                            "                                       style=\"color: black\">删除</a>\n" +
                            "                                </td>\n" +
                            "                                <td>" + msg.items[i].cashierStore + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierNumber + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierName + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierRolename + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierPassword + "</td>\n" +
                            "                                <td>" + trimNull(msg.items[i].cashierPhone) + "</td>\n" +
                            "                                <td>" + trimState(msg.items[i].cashierState) + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }, callback: function (pagecount, size, count) {
            //判断是否带有条件
            var condent = $('#condent').val();
            if (condent != "") {
                url = "${basePath}zomoreCashier/searchAjax.do?condent=" + condent;
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
                        tr = "<tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td scope=\"row\">\n" +
                            "                                    <a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                       data-target=\"#zomore-call1\" title=\"" + msg.items[i].cashierNumber + "\"\n" +
                            "                                       name=\"edit\"\n" +
                            "                                       style=\"color: black\" onclick=\"edit('" + msg.items[i].cashierNumber + "')\">编辑</a>&nbsp;\n" +
                            "                                    <a href=\"${basePath}zomoreCashier/deleted.do?ids=" + msg.items[i].cashierNumber + "\"\n" +
                            "                                       style=\"color: black\">删除</a>\n" +
                            "                                </td>\n" +
                            "                                <td>" + msg.items[i].cashierStore + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierNumber + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierName + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierRolename + "</td>\n" +
                            "                                <td>" + msg.items[i].cashierPassword + "</td>\n" +
                            "                                <td>" + trimNull(msg.items[i].cashierPhone) + "</td>\n" +
                            "                                <td>" + trimState(msg.items[i].cashierState) + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }
    });

    //状态判断
    function trimState(str) {
        if (str == '1') {
            return "启用";
        }
        return "禁用";
    }

    //去null
    function trimNull(str) {
        if (str == null) {
            return "";
        }
        return "str";
    }

    //格式化日期
    function getMyDate(str) {
        if (str == null) {
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
</div> <!-- content -->

</div>
<!-- ============================================================== -->
<!-- End Right content here -->
<!-- ============================================================== -->
</div>
</div>
<!-- END wrapper -->


<!-- 新增收银员弹窗 -->
<form action="${basePath}zomoreCashier/add.do" method="post">
    <div id="zomore-call" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
         aria-hidden="true" style="width: 900px;margin-left: 20%; display: none;">
        <div class="modal-dialog modal-full">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="full-width-modalLabel">新建收银台</h4>
                </div>
                <div class="modal-body">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">编号:</span>
                                    <input class="form-control" id="cashierNumber" name="cashierNumber" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">姓名:</span>
                                    <input class="form-control" id="cashierName" name="cashierName" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">密码:</span>
                                    <input class="form-control" id="cashierPassword" name="cashierPassword" type="text"
                                           placeholder="">
                                </div>
                            </div>
                        </div>
                        </br>

                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">电话:</span>
                                    <input class="form-control" id="cashierPhone" name="cashierPhone" type="text"
                                           placeholder="">
                                </div>
                                </br>
                            </div>
                            <div class="col-md-3">
                                <select class="form-control select2" name="cashierRolename">
                                    <option value="">角色</option>
                                    <option value="店长">店长</option>
                                    <option value="收银员">收银员</option>
                                    <option value="导购员">导购员</option>
                                </select>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">最低折扣:</span>
                                    <input class="form-control" id="cashierDiscount" name="cashierDiscount" type="text"
                                           placeholder="">
                                    <span class="input-group-addon">%</span>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">折让限额:</span>
                                    <input class="form-control" id="cashierMoney" name="cashierMoney" type="text"
                                           placeholder="">
                                    <span class="input-group-addon">元</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <h4 class="m-t-0 header-title"><b>收银台权限</b></h4>
                <div class="p-20">
                    <table class="table m-0">
                        <tbody>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 常用选项 </label>
                                </div>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 允许收银 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止无码收银 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 单品改价 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 整单改价 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 提交进货 </label>
                                </div>
                            </td>
                        </tr>
                        <tr>


                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 确认进货 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台订货 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台退货 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台调货 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 注销账号 </label>
                                </div>
                            </td>
                        </tr>
                        <tr>

                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 撤销单据 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员积分兑换 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员充值 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 编辑会员 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 无卡查询会员 </label>
                                </div>
                            </td>
                        </tr>
                        <tr>


                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 次卡消费 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 退次卡/购物卡 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 删除挂单单据 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 盘点权限 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 明盘（显示库存） </label>
                                </div>
                            </td>

                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 查询连锁库存 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 开启钱箱 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 撤销单据 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 交接班显示明细 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员充值 </label>
                                </div>
                            </td>
                            <td>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 补打单据 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 系统管理 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 编辑货流价 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止报损 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止日结 </label>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止赠送商品 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 次卡延期 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止新增会员 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止提交盘点数据 </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 手动修改提成 </label>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 负数反向充值 </label>
                                </div>
                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                        </tr>
                        </tbody>
                    </table>

                </div>

                <h4 class="m-t-0 header-title"><b>云端权限</b></h4>
                <div class="row">
                    <div class="col-lg-12">
                        <ul class="nav nav-tabs">
                            <!--数据台-->
                            <li class="active">
                                <a href="#home" data-toggle="tab" aria-expanded="true">
                                    <span class="visible-xs"><i class="fa fa-home"></i></span>
                                    <span class="hidden-xs">数据台</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#profile" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-user"></i></span>
                                    <span class="hidden-xs">商品</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#messages" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-envelope-o"></i></span>
                                    <span class="hidden-xs">项目</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#settings" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">库存</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#xiaoshou" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">销售</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#huiyuan" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">会员</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#yuangong" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">员工</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#xiaoshou" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">营销</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#huoliu" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">货流</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#shezhi" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">设置</span>
                                </a>
                            </li>
                        </ul>
                    <!-- 数据台 -->
                    <div class="tab-content">
                        <div class="tab-pane active" id="home">
                            <table class="table m-0">
                                <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 数据台 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 销售概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 员工概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 营销概览 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--商品-->
                    <div class="tab-pane" id="profile">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品分类 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品品牌 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 组装拆分 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 调价单 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--项目-->
                    <div class="tab-pane" id="messages">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目分类 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 调价单 </label>
                                        </div>
                                    </td>
                                    <td> </td>
                                    <td> </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--库存-->
                    <div class="tab-pane" id="settings">
                        <table class="table m-0">
                            <tbody>    
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 库存查询 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 库存预警 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 盘点记录 </label>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <!--销售-->
                        <div class="tab-pane" id="xiaoshou">
                            <table class="table m-0">
                                <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 销售单据 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发列表 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发退货单据 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发汇总报表 </label>
                                        </div>
                                    </td>

                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 日结记录 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 交接班记录 </label>
                                    </div>
                                </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--会员-->
                    <div class="tab-pane" id="huiyuan">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 等级管理 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 充值规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积点规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员构成分析 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <tr>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 会员消费分析 </label>
                                    </div>
                                </td>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 会员储值卡统计 </label>
                                    </div>
                                </td>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 储值卡分析 </label>
                                    </div>
                                </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积分记录 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积分使用记录 </label>
                                        </div>
                                    </td>
                                    <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 积点兑换记录 </label>
                                    </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--员工-->
                    <div class="tab-pane" id="yuangong">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 收银台资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 预约服务 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购业绩提成 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购客流 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购业绩销售 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 收银台绩效 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购绩效明细 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 充值明细 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--销售-->
                    <div class="tab-pane" id="yingxiao">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 促销活动 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 优惠券 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡管理 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡方案 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡消费记录 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2" style="font-size: 16px;"> 营销 </label>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>

                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡充值记录 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--货流-->
                    <div class="tab-pane" id="huoliu">
                        <table class="table m-0">
                          <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 供应商资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 客户资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 门店订货申请 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 采购单 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--设置-->
                    <div class="tab-pane" id="shezhi">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 账户设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 小票打印设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 支付设置 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-white waves-effect"> 保存</button>
                </div><!-- /.modal-content -->
            </div><!-- /.modal --><!-- /.modal -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal --><!-- /.modal -->
</form>
<!-- 修改收银员弹窗 -->
<form action="${basePath}zomoreCashier/edit.do" method="post">
    <div id="zomore-call1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
         aria-hidden="true" style="width: 900px;margin-left: 20%; display: none;">
        <div class="modal-dialog modal-full">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="full-width-modalLabel1">修改收银台</h4>
                </div>
                <div class="modal-body">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">编号:</span>
                                    <input class="form-control" readonly id="cashierNumber1" name="cashierNumber"
                                           type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">姓名:</span>
                                    <input class="form-control" id="cashierName1" name="cashierName" type="text"
                                           placeholder="">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">密码:</span>
                                    <input class="form-control" id="cashierPassword1" name="cashierPassword" type="text"
                                           placeholder="">
                                </div>
                            </div>
                        </div>
                        </br>

                        <div class="row">
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">电话:</span>
                                    <input class="form-control" id="cashierPhone1" name="cashierPhone" type="text"
                                           placeholder="">
                                </div>
                                </br>
                            </div>
                            <div class="col-md-3">
                                <select class="form-control select2" name="cashierRolename">
                                    <option name="cashierRolename" value="">角色</option>
                                    <option name="cashierRolename" value="店长">店长</option>
                                    <option name="cashierRolename" value="收银员">收银员</option>
                                    <option name="cashierRolename" value="导购员">导购员</option>
                                </select>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">最低折扣:</span>
                                    <input class="form-control" id="cashierDiscount1" name="cashierDiscount" type="text"
                                           placeholder="">
                                    <span class="input-group-addon">%</span>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="input-group">
                                    <span class="input-group-addon">折让限额:</span>
                                    <input class="form-control" id="cashierMoney1" name="cashierMoney" type="text"
                                           placeholder="">
                                    <span class="input-group-addon">元</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <h4 class="m-t-0 header-title"><b>收银台权限</b></h4>
                <div class="p-20">
                    <table class="table m-0">
                        <tbody>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 常用选项  </label>
                                </div>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 允许收银  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止无码收银  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 单品改价  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 整单改价  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 提交进货  </label>
                                </div>
                            </td>
                        </tr>
                        <tr>


                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 确认进货  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台订货  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台退货  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 前台调货  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 注销账号  </label>
                                </div>
                            </td>
                        </tr>
                        <tr>

                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 撤销单据  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员积分兑换  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员充值  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 编辑会员  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 无卡查询会员  </label>
                                </div>
                            </td>
                        </tr>
                        <tr>


                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 次卡消费  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 退次卡/购物卡  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 删除挂单单据  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 盘点权限  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 明盘（显示库存）  </label>
                                </div>
                            </td>

                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 查询连锁库存  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 开启钱箱  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 撤销单据  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 交接班显示明细  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 会员充值  </label>
                                </div>
                            </td>
                            <td>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 补打单据  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 系统管理  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 编辑货流价  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止报损  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止日结  </label>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止赠送商品  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 次卡延期  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止新增会员  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 禁止提交盘点数据  </label>
                                </div>
                            </td>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 手动修改提成  </label>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="checkbox checkbox-success checkbox-inline">
                                    <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                    <label for="inlineCheckbox2"> 负数反向充值  </label>
                                </div>
                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                            <td>

                            </td>
                        </tr>
                        </tbody>
                    </table>

                </div>

                <h4 class="m-t-0 header-title"><b>云端权限</b></h4>
                <div class="row">
                    <div class="col-lg-12">
                        <ul class="nav nav-tabs">

                            <!--数据台-->
                            <li class="active1">
                                <a href="#home1" data-toggle="tab" aria-expanded="true">
                                    <span class="visible-xs"><i class="fa fa-home"></i></span>
                                    <span class="hidden-xs">数据台</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#profile1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-user"></i></span>
                                    <span class="hidden-xs">商品</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#messages1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-envelope-o"></i></span>
                                    <span class="hidden-xs">项目</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#settings1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">库存</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#xiaoshou1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">销售</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#huiyuan1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">会员</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#yuangong1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">员工</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#yingxiao1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">营销</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#huoliu1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">货流</span>
                                </a>
                            </li>
                            <li class="">
                                <a href="#shezhi1" data-toggle="tab" aria-expanded="false">
                                    <span class="visible-xs"><i class="fa fa-cog"></i></span>
                                    <span class="hidden-xs">设置</span>
                                </a>
                            </li>
                        </ul>

                        <div class="tab-content">
                    <!-- 数据台 -->
                    <div class="tab-content">
                        <div class="tab-pane active" id="home1">
                            <table class="table m-0">
                                <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 数据台 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 销售概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 员工概览 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 营销概览 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--商品-->
                    <div class="tab-pane" id="profile1">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品分类 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品品牌 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 商品设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 组装拆分 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 调价单 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--项目-->
                    <div class="tab-pane" id="messages1">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目分类 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 项目设置 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 调价单 </label>
                                        </div>
                                    </td>
                                    <td> </td>
                                    <td> </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--库存-->
                    <div class="tab-pane" id="settings1">
                        <table class="table m-0">
                            <tbody>    
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 库存查询 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 库存预警 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 盘点记录 </label>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <!--销售-->
                        <div class="tab-pane" id="xiaoshou1">
                            <table class="table m-0">
                                <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 销售单据 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发列表 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发退货单据 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 批发汇总报表 </label>
                                        </div>
                                    </td>

                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 日结记录 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 交接班记录 </label>
                                    </div>
                                </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--会员-->
                    <div class="tab-pane" id="huiyuan1">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 等级管理 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 充值规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积点规则 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 会员构成分析 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <tr>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 会员消费分析 </label>
                                    </div>
                                </td>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 会员储值卡统计 </label>
                                    </div>
                                </td>
                                <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 储值卡分析 </label>
                                    </div>
                                </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积分记录 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 积分使用记录 </label>
                                        </div>
                                    </td>
                                    <td>
                                    <div class="checkbox checkbox-success checkbox-inline">
                                        <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                        <label for="inlineCheckbox2"> 积点兑换记录 </label>
                                    </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--员工-->
                    <div class="tab-pane" id="yuangong1">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 收银台资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购资料 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 预约服务 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购业绩提成 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购客流 </label>
                                        </div>
                                    </td>
                                </tr>
                                </br>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购业绩销售 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 收银台绩效 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 技师导购绩效明细 </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 充值明细 </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    
                    <!--营销-->
                    <div class="tab-pane" id="yingxiao1">
                        <table class="table m-0">
                                <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 促销活动  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 优惠券  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡管理  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡方案  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡消费记录  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2" style="font-size: 16px;"> 营销  </label>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>

                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 次卡充值记录  </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--货流-->
                    <div class="tab-pane" id="huoliu1">
                        </tbody>
                            </table>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 供应商资料  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 客户资料  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 门店订货申请  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 采购单  </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <!--设置-->
                    <div class="tab-pane" id="shezhi1">
                        <table class="table m-0">
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 账户设置  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 小票打印设置  </label>
                                        </div>
                                    </td>
                                    <td>
                                        <div class="checkbox checkbox-success checkbox-inline">
                                            <input type="checkbox" id="inlineCheckbox2" value="option1" checked="">
                                            <label for="inlineCheckbox2"> 支付设置  </label>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-white waves-effect"> 确定</button>
                </div><!-- /.modal-content -->
            </div><!-- /.modal --><!-- /.modal -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal --><!-- /.modal -->
</form>

<script>
    var resizefunc = [];
</script>

<script type="text/javascript">
    var app = angular.module('app', ["wui.date"]);
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


<script src="${basePath}assets/js/jquery.core.js"></script>
<script src="${basePath}assets/js/jquery.app.js"></script>

<!--bootstrapSelect-->
<script src="${basePath}assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"
        type="text/javascript"></script>

<!--bootstrap Example-->
<script type="text/javascript" src="${basePath}assets/plugins/multiselect/js/jquery.multi-select.js"></script>
<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>

<script src="${basePath}assets/pages/jquery.bs-table.js"></script>
<script type="text/javascript">
    //点击编辑数据回显
    function edit(id) {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreCashier/updateAjax.do",//url
            data: {"id": id},
            success: function (data) {
                //alert(JSON.stringify(data));
                //修改地址
                $("form[name='actionfome1']").attr("action", "${basePath}zomoreCashier/edit.do?cashierNumber=" + data.cashierNumber);
                $("#cashierNumber1").val(data.cashierNumber);
                $("#cashierName1").val(data.cashierName);
                $("#cashierPassword1").val(data.cashierPassword);
                $("#cashierPhone1").val(data.cashierPhone);
                $("option[name='cashierRolename']").each(function () {
                    if ($(this).val() == data.cashierRolename) {
                        $(this).attr("selected", "selected");
                    }
                });
                $("#cashierDiscount1").val(data.cashierDiscount);
                $("#cashierMoney1").val(data.cashierMoney);
            },
            error: function (result) {
                alert("异常，请稍后再试");
            }
        });
    }
</script>
<script>
    jQuery(document).ready(function () {

        //advance multiselect start
        $('#my_multi_select3').multiSelect({
            selectableHeader: "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
            selectionHeader: "<input type='text' class='form-control search-input' autocomplete='off' placeholder='search...'>",
            afterInit: function (ms) {
                var that = this,
                    $selectableSearch = that.$selectableUl.prev(),
                    $selectionSearch = that.$selectionUl.prev(),
                    selectableSearchString = '#' + that.$container.attr('id') + ' .ms-elem-selectable:not(.ms-selected)',
                    selectionSearchString = '#' + that.$container.attr('id') + ' .ms-elem-selection.ms-selected';

                that.qs1 = $selectableSearch.quicksearch(selectableSearchString)
                    .on('keydown', function (e) {
                        if (e.which === 40) {
                            that.$selectableUl.focus();
                            return false;
                        }
                    });

                that.qs2 = $selectionSearch.quicksearch(selectionSearchString)
                    .on('keydown', function (e) {
                        if (e.which == 40) {
                            that.$selectionUl.focus();
                            return false;
                        }
                    });
            },
            afterSelect: function () {
                this.qs1.cache();
                this.qs2.cache();
            },
            afterDeselect: function () {
                this.qs1.cache();
                this.qs2.cache();
            }
        });

        // Select2
        $(".select2").select2();

        $(".select2-limiting").select2({
            maximumSelectionLength: 2
        });

        $('.selectpicker').selectpicker();
        $(":file").filestyle({input: false});
    });

    //Bootstrap-TouchSpin
    $(".vertical-spin").TouchSpin({
        verticalbuttons: true,
        verticalupclass: 'ion-plus-round',
        verticaldownclass: 'ion-minus-round'
    });
    var vspinTrue = $(".vertical-spin").TouchSpin({
        verticalbuttons: true
    });
    if (vspinTrue) {
        $('.vertical-spin').prev('.bootstrap-touchspin-prefix').remove();
    }

    $("input[name='demo1']").TouchSpin({
        min: 0,
        max: 100,
        step: 0.1,
        decimals: 2,
        boostat: 5,
        maxboostedstep: 10,
        postfix: '%'
    });
    $("input[name='demo2']").TouchSpin({
        min: -1000000000,
        max: 1000000000,
        stepinterval: 50,
        maxboostedstep: 10000000,
        prefix: '$'
    });
    $("input[name='demo3']").TouchSpin();
    $("input[name='demo3_21']").TouchSpin({
        initval: 40
    });
    $("input[name='demo3_22']").TouchSpin({
        initval: 40
    });

    $("input[name='demo5']").TouchSpin({
        prefix: "pre",
        postfix: "post"
    });
    $("input[name='demo0']").TouchSpin({});


    //Bootstrap-MaxLength
    $('input#defaultconfig').maxlength()

    $('input#thresholdconfig').maxlength({
        threshold: 20
    });

    $('input#moreoptions').maxlength({
        alwaysShow: true,
        warningClass: "label label-success",
        limitReachedClass: "label label-danger"
    });

    $('input#alloptions').maxlength({
        alwaysShow: true,
        warningClass: "label label-success",
        limitReachedClass: "label label-danger",
        separator: ' out of ',
        preText: 'You typed ',
        postText: ' chars available.',
        validate: true
    });

    $('textarea#textarea').maxlength({
        alwaysShow: true
    });

    $('input#placement').maxlength({
        alwaysShow: true,
        placement: 'top-left'
    });
</script>

</body>
</html>