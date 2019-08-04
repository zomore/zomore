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

    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">

    <title>商品变动明细</title>

    <link href="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet"
          type="text/css"/>

    <link href="${basePath}assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/core.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/components.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/icons.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/iconfont.css" rel="stylesheet" type="text/css"/>
    <link href="${basePath}assets/css/pages.css" rel="stylesheet" type="text/css"/>
    <![endif]-->
    <link href="${basePath}assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css"
          rel="stylesheet">
    <link href="${basePath}assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
    <link href="${basePath}assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <link href="${basePath}assets/css/menu.css" rel="stylesheet" type="text/css">
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
                <a href="#" class="logo"><img src="${basePath}assets/images/alogo.png"></a>
            </div>
        </div>


        <!-- 头部内容 -->
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <div class="">
                    <div class="pull-left">
                        <p style="font-size: 18px; margin-left: 20px; margin-top: 20px;color: #2f353f">商品变动明细</p>
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
    </br>
    <!-- ========== 左侧栏内容 ========== -->

    <%@include file="leftMenu.jsp" %>
</div>
<!-- 左侧导航栏结束 -->

<!-- ============================================================== -->
<!-- 右侧内容开始 -->
<!-- ============================================================== -->

<div class="gd" style="height: 100%; margin-top: 67px;">
    <div class="row">
        <div class="col-sm-12">
            <div class="card-box">
                <div class="row">
                    <div class="row">
                        <div class="col-lg-12 col-sm-12">
                            <div class="col-sm-4 col-sm-4" style="width: 511px;">
                            </div>
                            <form action="${basePath}zomoreCommodityChange/search.do" method="post">
                                <div class="col-sm-2 col-sm-2" style="width: 100px;">
                                    <select class="form-control select2" style="margin-right: 0px;" id="type" name="type">
                                        <option value="">变动类型</option>
                                        <option value="商品销售"
                                                <c:if test="${requestScope.type=='商品销售'}">selected</c:if>
                                        >商品销售</option>
                                        <option value="客户退货"
                                                <c:if test="${requestScope.type=='客户退货'}">selected</c:if>
                                        >客户退货</option>
                                        <option value="货流进货"
                                                <c:if test="${requestScope.type=='货流进货'}">selected</c:if>
                                        >货流进货</option>
                                        <option value="货流采购"
                                                <c:if test="${requestScope.type=='货流采购'}">selected</c:if>
                                        >货流采购</option>
                                        <option value="货流调出"
                                                <c:if test="${requestScope.type=='货流调出'}">selected</c:if>
                                        >货流调出</option>
                                        <option value="货流出库"
                                                <c:if test="${requestScope.type=='货流出库'}">selected</c:if>
                                        >货流出库</option>
                                        <option value="货流退货"
                                                <c:if test="${requestScope.type=='货流退货'}">selected</c:if>
                                        >货流退货</option>
                                        <option value="会员存取"
                                                <c:if test="${requestScope.type=='会员存取'}">selected</c:if>
                                        >会员存取</option>
                                        <option value="库存盘点"
                                                <c:if test="${requestScope.type=='库存盘点'}">selected</c:if>
                                        >库存盘点</option>
                                        <option value="商品报损"
                                                <c:if test="${requestScope.type=='商品报损'}">selected</c:if>
                                        >商品报损</option>
                                        </optgroup>
                                    </select>
                                </div>
                                <div class="col-sm-2 col-sm-2" style="width: 100px;">
                                    <input type="text" id="starttime" class="form-control" name="starttime">
                                    <!-- <div class="form-group">
                                        <div class="wui-area">
                                            <wui-date format="yyyy-mm-dd"
                                                      placeholder="<c:if test="${requestScope.startime ==''||requestScope.startime == null}">请选择或输入日期</c:if>
                                                    ${requestScope.startime}"
                                                      id="starttime"
                                                      btns="{'ok':'确定','now':'此刻'}"
                                                      name="starttime"
                                                      ng-model="starttime"
                                                      ng-value="${requestScope.startime}">
                                            </wui-date>
                                        </div>
                                    </div> -->
                                </div>
                                <div class="col-sm-2 col-sm-2" style="width: 100px;">
                                    <input type="text" id="endtime" class="form-control" name="endtime">
                                    <!-- <div class="form-group">
                                        <div class="wui-area">
                                            <wui-date format="yyyy-mm-dd"
                                                      placeholder="<c:if test="${requestScope.endtime ==''||requestScope.endtime == null}">请选择或输入日期</c:if>
                                                    ${requestScope.endtime}"
                                                      id="endtime"
                                                      btns="{'ok':'确定','now':'此刻'}"
                                                      name="endtime"
                                                      ng-model="endtime"
                                                        ng-value="${requestScope.endtime}"></wui-date>
                                        </div>
                                    </div> -->
                                </div>
                                <div class="col-sm-3 col-sm-3" style="width: 216px;">
                                    <div class="input-group">
                                        <input type="text" id="name" name="name" value="${requestScope.name}"
                                               class="form-control" placeholder="单号">
                                        <span class="input-group-btn">
                                        <button type="submit" class="btn btn-white waves-effect">查询</button>
                                        </span>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div style="margin-top: 5px; margin-bottom: 5px; border-bottom: 1px dashed #e5e5e5;"></div>
                    <table id="demo-custom-toolbar" data-toggle="table" class="table-bordered ">
                        <thead>
                        <tr>
                            <th data-field="xh" data-align="center" data-sortable="true">序号</th>
                            <th data-field="tm" data-align="center" data-sortable="true">操作时间</th>
                            <th data-field="name" data-align="center">变动类型</th>
                            <th data-field="fl" data-align="center">库存变动</th>
                            <th data-field="ls" data-align="center">校正库存</th>
                            <th data-field="jh" data-align="center" data-sortable="true">单号</th>
                            <th data-field="cz" data-align="center">操作</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${requestScope.result.items}" var="result" varStatus="step">
                         <tr>
                             <td>${step.count}</td>
                             <td>
                                 <fmt:formatDate value="${result.zomoreCommodityChangeTime}"
                                                 pattern="yyyy-MM-dd"></fmt:formatDate>
                             </td>
                             <td>${result.zomoreCommodityChangeType}</td>
                             <td>${result.zomoreCommodityChangeNum}</td>
                             <td>${result.zomoreNum}</td>
                             <td>${result.zomoreOrderId}</td>
                             <td><a class="waves-effect waves-light" data-toggle="modal"
                                    data-target="#zomore-call1"
                                    name="edit"
                                    style="color: black" onclick="edit('${result.zomoreOrderId}','${result.zomoreCommodityChangeType}')">详情</a>
                             </td>
                         </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="row">
                    <div class="col-lg-12 col-sm-12" style="margin-top: 20px">
                        <div class="col-lg-4 col-sm-4">共 ${requestScope.result.totalCount} 记录</div>
                        <div class="col-lg-8 col-sm-8">
                            <div id="pageToolbar" style="float: right"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<input type="hidden" id="t1" value="${requestScope.startime}">
<input type="hidden" id="t2" value="${requestScope.endtime}">
<%--分页--%>
<script type="text/javascript">
    var page = new Paging();
    var url = "${basePath}zomoreCommodityChange/listAjax.do";
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
            var type = $("#type").find("option:selected").val();
            var starttime = $('#t1').val();
            var endtime = $('#t2').val();
            var name = $('#name').val();
            if (type!=""||starttime != "" || endtime != "" || name != "") {
                url = "${basePath}zomoreCommodityChange/searchAjax.do?starttime=" + starttime + "&endtime=" + endtime + "&name=" + name+ "&type=" + type;
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
                            "                             <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                             <td>" + getMyDate(msg.items[i].zomoreCommodityChangeTime) + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreCommodityChangeType + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreCommodityChangeNum + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreNum + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreOrderId + "</td>\n" +
                            "                             <td><a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                    data-target=\"#zomore-call1\"\n" +
                            "                                    name=\"edit\"\n" +
                            "                                    style=\"color: black\" onclick=\"edit('" + msg.items[i].zomoreOrderId + "','" + msg.items[i].zomoreCommodityChangeType + "')\">详情</a>\n" +
                            "                             </td>\n" +
                            "                         </tr>";
                        $('#demo-custom-toolbar tbody').append(tr);
                    }
                    page.render({count: msg.totalCount, current: pagecount});
                }
            });
        }, callback: function (pagecount, size, count) {
            //判断是否带有条件
            var type = $("#type").find("option:selected").val();
            var starttime = $('#t1').val();
            var endtime = $('#t2').val();
            var name = $('#name').val();
            if (type!=""||starttime != "" || endtime != "" || name != "") {
                url = "${basePath}zomoreCommodityChange/searchAjax.do?starttime=" + starttime + "&endtime=" + endtime + "&name=" + name+ "&type=" + type;
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
                            "                             <td>" + Number((pagecount - 1) * size + Number(i + 1)) + "</td>\n" +
                            "                             <td>" + getMyDate(msg.items[i].zomoreCommodityChangeTime) + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreCommodityChangeType + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreCommodityChangeNum + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreNum + "</td>\n" +
                            "                             <td>" + msg.items[i].zomoreOrderId + "</td>\n" +
                            "                             <td><a class=\"waves-effect waves-light\" data-toggle=\"modal\"\n" +
                            "                                    data-target=\"#zomore-call1\"\n" +
                            "                                    name=\"edit\"\n" +
                            "                                    style=\"color: black\" onclick=\"edit('" + msg.items[i].zomoreOrderId + "','" + msg.items[i].zomoreCommodityChangeType + "')\">详情</a>\n" +
                            "                             </td>\n" +
                            "                         </tr>";
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
            return "生效";
        }
        return "未生效";
    }

    //格式化日期
    function getMyDate(str) {
        if (str == null || str == '') {
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
<!-- END wrapper -->

<script>
    var resizefunc = [];
</script>
<!-- jQuery  -->
<script src="${basePath}assets/js/jquery.min.js"></script>
<script src="${basePath}assets/js/bootstrap.min.js"></script>
<!--bootstrapSelect-->
<script src="${basePath}assets/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"
        type="text/javascript"></script>

<!--bootstrap Example-->

<script src="${basePath}assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="${basePath}assets/pages/jquery.bs-table.js"></script>
<script src="${basePath}assets/plugins/bootstrap-tagsinput/dist/bootstrap-tagsinput.min.js"></script>
<script type="text/javascript" src="${basePath}assets/plugins/multiselect/js/jquery.multi-select.js"></script>
<script src="${basePath}assets/js/jquery.core.js"></script>
<script type="text/javascript">
    function edit(id,type) {
        window.location.href = "${basePath}zomoreCommodityChange/listAll.do?id=" + id+"&type="+type;
    };
</script>

<!--新的时间选择-->
<script src="${basePath}assets/laydate/laydate.js"></script>

<script>
    //获取当前时间戳
    var now = new Date();
    var timeYear=now.getFullYear();
    var timeMonth = now.getMonth() + 1;
    var timeDay = now.getDate();
    //获取当前时间戳
    var now = new Date().getTime();
    var timeChoose; //用户选择的时间
    var nowTime1=timeYear + '-' + addZero(timeMonth) + '-' + addZero(timeDay);
    var nowTime2=timeYear + '-' + addZero(timeMonth) + '-' + addZero(timeDay);

    //时间选择器
    var timeChoose; //用户选择的时间
    laydate.render({
        elem: '#starttime',
        value: new Date(now), //参数即为：当前的时间戳
        type: 'date',
    done: function(value, date, endDate){
    var value = document.getElementById('starttime').value; //
    console.log(value)
    timeChoose = value;
        }
    });

    laydate.render({
        elem: '#endtime',
        value: new Date(nowTime2), //参数即为：当前的时间戳
        type: 'date',
        done: function(value, date, endDate){

            var value2 = document.getElementById('endtime').value; //
            console.log(value2)
            timeChoose = value2;
        }
    });

    //补零操作
    function addZero(num) {
        if (parseInt(num) < 10) {
            num = '0' + num;
        }
        return num;
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