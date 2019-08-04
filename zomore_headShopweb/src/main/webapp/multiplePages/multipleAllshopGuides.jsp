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
    <title>技师导购</title>

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
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
    <link href="${basePath}assets/css/iconfont.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="${basePath}assets/js/jquery.min.js"></script>

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

<body class="fixed-left">

<!-- Begin page -->
<div id="wrapper" class="forced enlarged">

    <!-- 头部开始 -->
    <div class="topbar">

        <!-- LOGO -->
        <div class="topbar-left">
            <div class="text-center">
                <a href="#" class="logo" style="font-size: 0px;"><img src="${basePath}assets/images/alogo.png"></a>
            </div>
        </div>


        <!-- Button mobile view to collapse sidebar menu -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <div class="pull-left">
                        <p style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f">技师导购</p>
                    </div>

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
                            </ul>
                        </li>
                    </ul>
                </div>
                <!--/.nav-collapse -->
            </div>
        </div>
    </div>
    <!-- 头部内容栏 -->
    <!-- ========== 左侧栏内容 ========== -->
    <%@include file="multipleLeftMenu.jsp" %>
<!-- 左侧导航栏结束 -->

<div class="gd" style="height: 1088px; margin-top: 85px;">
    <div class="row">
        <div class="col-sm-12">
            <div class="card-box">
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="col-sm-5 col-sm-5" style="width: 747px;">
                               <%-- <button type="button" class="btn btn-white waves-effect" data-toggle="modal"
                                        data-target="#zomore-call">新增
                                </button>--%>
                                <%--<button type="button" class="btn btn-white waves-effect">导入</button>
                                <button type="button" class="btn btn-white waves-effect">导出</button>--%>
                            </div>
                            <form action="${basePath}multipleStaff/multipleGuides.do" method="post">
                                <div class="col-sm-2 col-sm-2" style="width: 80px;">
                                    <select class="form-control select2" name="state" id="state">
                                        <option value="">状态</option>
                                        <option value="1" <c:if test="${requestScope.state=='1'}">selected</c:if>>
                                            启用
                                        </option>
                                        <option value="0" <c:if test="${requestScope.state=='0'}">selected</c:if>>
                                            禁用
                                        </option>
                                        </optgroup>
                                    </select>
                                </div>
                                <div class="col-sm-3 col-sm-3" style="width: 200px;">
                                    <div class="input-group">
                                        <input type="text" id="condent" name="condent"
                                               value="${requestScope.condent}"
                                               class="form-control" placeholder="名称">
                                        <span class="input-group-btn"><button type="submit" class="btn btn-white waves-effect"
                                        >查询</button></span>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>
                    <div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
                    <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered ">
                        <thead>
                        <tr>
                            <th data-field="id" data-align="center" data-sortable="true">序号</th>
                            <th data-field="do" data-align="center">操作</th>
                            <th data-field="num" data-align="center" data-sortable="true">编号</th>
                            <th data-field="name" data-align="center">
                                姓名
                            </th>
                            <th data-field="phone" data-align="center" data-sortable="true">电话
                            </th>
                            <th data-field="a" data-align="center" data-sortable="true">销售提成</th>
                            <th data-field="b" data-align="center" data-sortable="true">指定提成</th>
                            <th data-field="c" data-align="center" data-sortable="true">
                                充值提成
                            </th>
                            <th data-field="d" data-align="center" data-sortable="true">购物卡提成</th>
                            <th data-field="e" data-align="center">描述</th>
                            <th data-field="f" data-align="center">状态</th>
                            <th data-field="j" data-align="center">所属门店</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${requestScope.result.items}" var="result" varStatus="step">
                            <tr>
                                <td>${step.count}</td>
                                <td>
                                    <a class="waves-effect waves-light" data-toggle="modal"
                                       data-target="#zomore-call1" title="${result.shoppingGuideId}"
                                       name="edit"
                                       style="color: black" onclick="edit('${result.shoppingGuideId}')">编辑</a>&nbsp;
                                    <a href="${basePath}zomoreShoppingGuide/deleted.do?ids=${result.shoppingGuideId}"
                                       style="color: black">删除</a>
                                </td>
                                <td>${result.shoppingGuideId}</td>
                                <td>${result.shoppingGuideName}</td>
                                <td>${result.shoppingGuidePhone}</td>
                                <td>${result.shoppingGuideSale}%</td>
                                <td>${result.shoppingGuideAppoint}%</td>
                                <td>${result.shoppingGuideRecharge}%</td>
                                <td>${result.shoppingGuideShoppingcar}%</td>
                                <td>${result.shoppingGuideMeno}</td>
                                <td>${result.shoppingGuideState=='1'?'启用':'禁用'}</td>
                                <td>${result.shoppingGuideCashierStore}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="row">
                    <div class="col-lg-12 col-sm-12" style="margin-top: 20px">
                        <div class="col-lg-4 col-sm-4">共 ${requestScope.result.totalCount} 导购员</div>
                        <div class="col-lg-8 col-sm-8">
                            <div id="pageToolbar" style="float: right"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--Custom Toolbar-->
<!--===================================================-->

</div> <!-- content -->

</div>
<!-- ============================================================== -->
<!-- End Right content here -->
<!-- ============================================================== -->
<%--导购分页--%>
<script type="text/javascript">
    var page = new Paging();
    var url = "${basePath}multipleStaff/selectByCondentAjax.do";
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
            var state = $("#state").find("option:selected").val();
            var condent = $('#condent').val();
            if (state != "" || condent != "") {
                url = "${basePath}multipleStaff/selectByCondentAjax.do?state=" + state + "&condent=" + condent;
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
                        tr = " <tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td>\n" +
                            "                                    <a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                       data-target=\"#zomore-call1\" title=\"" + msg.items[i].shoppingGuideId + "\"\n" +
                            "                                       name=\"edit\"\n" +
                            "                                       style=\"color: black\" onclick=\"edit('" + msg.items[i].shoppingGuideId + "')\">编辑</a>&nbsp;\n" +
                            "                                    <a href=\"${basePath}zomoreShoppingGuide/deleted.do?ids=" + msg.items[i].shoppingGuideId + "\"\n" +
                            "                                       style=\"color: black\">删除</a>\n" +
                            "                                </td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideId + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideName + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuidePhone + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideSale + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideAppoint + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideRecharge + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideShoppingcar + "%</td>\n" +
                            "                                <td>" + toStr(msg.items[i].shoppingGuideMeno) + "</td>\n" +
                            "                                <td>" + trimState(msg.items[i].shoppingGuideState) + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideCashierStore + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }, callback: function (pagecount, size, count) {
            //判断是否带有条件
            var state = $("#state").find("option:selected").val();
            var condent = $('#condent').val();
            if (state != "" || condent != "") {
                url = "${basePath}multipleStaff/selectByCondentAjax.do?state=" + state + "&condent=" + condent;
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
                        tr = " <tr>\n" +
                            "                                <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                                <td>\n" +
                            "                                    <a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                       data-target=\"#zomore-call1\" title=\"" + msg.items[i].shoppingGuideId + "\"\n" +
                            "                                       name=\"edit\"\n" +
                            "                                       style=\"color: black\" onclick=\"edit('" + msg.items[i].shoppingGuideId + "')\">编辑</a>&nbsp;\n" +
                            "                                    <a href=\"${basePath}zomoreShoppingGuide/deleted.do?ids=" + msg.items[i].shoppingGuideId + "\"\n" +
                            "                                       style=\"color: black\">删除</a>\n" +
                            "                                </td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideId + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideName + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuidePhone + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideSale + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideAppoint + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideRecharge + "%</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideShoppingcar + "%</td>\n" +
                            "                                <td>" + toStr(msg.items[i].shoppingGuideMeno) + "</td>\n" +
                            "                                <td>" + trimState(msg.items[i].shoppingGuideState) + "</td>\n" +
                            "                                <td>" + msg.items[i].shoppingGuideCashierStore + "</td>\n" +
                            "                            </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }
    });

    //格式状态
    function trimState(str) {
        if (str == "1") {
            return "启用";
        }
        return "禁用";
    }

    //格式状态
    function toStr(str) {
        if (str == null) {
            return "";
        }
        return str;
    }
</script>
</div>
</div>
<!-- END wrapper -->

<!-- 修改技师导购弹窗 -->
<form name="actionfome1" action="${basePath}zomoreShoppingGuide/edit.do" method="post">
    <div id="zomore-call1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="full-width-modalLabel"
         aria-hidden="true" style="width: 700px;margin-left: 25%; display: none;">
        <div class="modal-dialog modal-full">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="full-width-modalLabel1">编辑技师导购资料</h4>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-10">
                            <div class="form-group">
                                <label for="field-1" class="control-label">状态</label>
                            </div>
                        </div>
                        <div class="col-md-1">
                            <div class="switchery-demo">
                                <input type="checkbox" checked data-plugin="switchery" data-color="#34d3eb"
                                       name="isuser"
                                       data-size="small"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-8">
                            <div class="input-group">
                                <span class="input-group-addon">编号:</span>
                                <input class="form-control" readonly id="shoppingGuideId1" name="shoppingGuideId"
                                       type="text" placeholder="">
                            </div>
                            </br>
                            <div class="input-group">
                                <span class="input-group-addon">姓名:</span>
                                <input class="form-control" id="shoppingGuideName1" name="shoppingGuideName" type="text"
                                       placeholder="">
                            </div>
                            </br>
                            <div class="input-group">
                                <span class="input-group-addon">手机号:</span>
                                <input class="form-control" id="shoppingGuidePhone1" name="shoppingGuidePhone"
                                       type="text" placeholder="">
                            </div>
                            </br>
                            <p>*照片：大小不超过500k，类型：jpg,jpeg,png</p>
                        </div>
                        <div class="col-md-4">
                            <img src="${basePath}assets/images/small/img3.jpg" alt="image"
                                 class="img-responsive img-thumbnail"
                                 width="200"/>
                        </div>
                    </div>
                    </br>

                    <div class="row">
                        <div class="col-md-6">

                            <div class="input-group">
                                <span class="input-group-addon">销售提成:</span>
                                <input class="form-control" id="shoppingGuideSale1" name="shoppingGuideSale" type="text"
                                       placeholder="">
                                <span class="input-group-addon"
                                      style="background-color: #ffffff;border: 1px solid #ffffff !important;">%</span>
                            </div>
                            </br>
                            <p>* 顾客指定技师导购时的提成比例</p>
                        </div>
                        <div class="input-group">
                            <span class="input-group-addon">指定数:</span>
                            <input class="form-control" id="shoppingGuideAppoint1" name="shoppingGuideAppoint"
                                   type="text" placeholder="">
                            <span class="input-group-addon"
                                  style="background-color: #ffffff;border: 1px solid #ffffff !important;">%</span>
                        </div>
                        </br>
                    </div>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="input-group">
                                <span class="input-group-addon">充值提成:</span>
                                <input class="form-control" id="shoppingGuideRecharge1" name="shoppingGuideRecharge"
                                       type="text" placeholder="">
                                <span class="input-group-addon"
                                      style="background-color: #ffffff;border: 1px solid #ffffff !important;">%</span>
                            </div>
                            </br>
                        </div>
                        <div class="col-md-12">
                            <div class="input-group">
                                <span class="input-group-addon">次卡提成:</span>
                                <input class="form-control" id="shoppingGuideSubcard1" name="shoppingGuideSubcard"
                                       type="text" placeholder="">
                                <span class="input-group-addon"
                                      style="background-color: #ffffff;border: 1px solid #ffffff !important;">%</span>
                            </div>
                            </br>
                        </div>
                        <div class="col-md-12">
                            <div class="input-group">
                                <span class="input-group-addon">购物卡提成:</span>
                                <input class="form-control" id="shoppingGuideShoppingcar1"
                                       name="shoppingGuideShoppingcar" type="text" placeholder="">
                                <span class="input-group-addon"
                                      style="background-color: #ffffff;border: 1px solid #ffffff !important;">%</span>
                            </div>
                            </br>
                        </div>
                    </div>
                    <div style="border-bottom: 2px dashed #e5e5e5;"></div>
                    </br>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group no-margin">
                                <label class="control-label">备注</label>
                                <textarea class="form-control autogrow" id="shoppingGuideMeno1" name="shoppingGuideMeno"
                                          style="overflow: hidden; word-wrap: break-word; resize: horizontal; height: 104px;"></textarea>
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
    </div>
</form>

<script>
    var resizefunc = [];
</script>

<!-- jQuery  -->
<script src="${basePath}assets/js/jquery.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<!-- Modal-Effect -->
<script src="${basePath}assets/plugins/custombox/dist/custombox.min.js"></script>
<script src="${basePath}assets/plugins/custombox/dist/legacy.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${basePath}assets/plugins/switchery/dist/switchery.min.js"></script>
<script src="${basePath}assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
<script src="${basePath}assets/js/jquery.core.js"></script>

<script type="text/javascript">
    //点击编辑数据回显
    function edit(id) {
        $.ajax({
            //几个参数需要注意一下
            type: "POST",//方法类型
            url: "${basePath}zomoreShoppingGuide/updateAjax.do",//url
            data: {"id": id},
            success: function (data) {
                // alert(JSON.stringify(data));
                //修改地址
                $("form[name='actionfome1']").attr("action", "${basePath}zomoreShoppingGuide/edit.do");
                if (data.shoppingGuideState == '0') {
                    $("#isuser1").attr("checked", false);
                }
                $("#shoppingGuideId1").val(data.shoppingGuideId);
                $("#shoppingGuideName1").val(data.shoppingGuideName);
                $("#shoppingGuidePhone1").val(data.shoppingGuidePhone);
                $("#shoppingGuideRole1").val(data.shoppingGuideRole);
                $("#shoppingGuidePassword1").val(data.shoppingGuidePassword);
                $("#shoppingGuideSale1").val(data.shoppingGuideSale);
                $("#shoppingGuideAppoint1").val(data.shoppingGuideAppoint);
                $("#shoppingGuideRecharge1").val(data.shoppingGuideRecharge);
                $("#shoppingGuideSubcard1").val(data.shoppingGuideSubcard);
                $("#shoppingGuideShoppingcar1").val(data.shoppingGuideShoppingcar);
                $("#shoppingGuideMeno1").val(data.shoppingGuideMeno);

            },
            error: function (result) {
                alert("异常，请稍后再试");
            }
        });
    }

</script>
<script>
    function saveNewGuide() {
        var shoppingGuideId=$("#shoppingGuideId").val();
        if(shoppingGuideId==null||shoppingGuideId==""){
            alert("导购编号不能为空！");
            return false;
        }
        var shoppingGuideName=$("#shoppingGuideName").val();
        if(shoppingGuideName==null||shoppingGuideName==""){
            alert("导购姓名不能为空！");
            return false;
        }
        var shoppingGuidePhone=$("#shoppingGuidePhone").val();
        if(shoppingGuidePhone==null||shoppingGuidePhone==""){
            alert("导购手机号不能为空！");
            return false;
        }
        var myreg=/^[1][0-9][0-9]{9}$/;
        if (!myreg.test(shoppingGuidePhone)) {
            alert("手机号格式错误");
            return false;
        }

        $.ajax({
            url:"${basePath}zomoreShoppingGuide/checkGuideId.do?guideCode="+shoppingGuideId,
            type: "POST",
            success:function (mesg) {
                if(mesg=="error"){
                    alert("该导购编号已经存在");
                }else{
                    $("#saveNewForm").submit();
                }

            },
            error:function () {
                alert("错误");
            }
        });


    }

</script>
</body>
</html>