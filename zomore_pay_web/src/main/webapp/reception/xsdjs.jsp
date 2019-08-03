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
    <title>择沐前台</title>
    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
    <link href="${basePath}css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${basePath}css/icon.css" rel="stylesheet"/>
    <link href="${basePath}css/commons.css" rel="stylesheet"/>
    <!-- 引用阿里图标样式 -->
    <link href="${basePath}css/iconfont.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="${basePath}css/components.css" rel="stylesheet"/>
    <!-- 引入表格的样式  -->
    <link href="${basePath}css/bootstrap-table.min.css" rel="stylesheet"/>
    <!-- 引入时间选择插件 -->
    <link href="${basePath}css/bootstrap-datepicker.min.css" rel="stylesheet"/>
    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
    <!-- 引入时间的JS -->
    <script src="${basePath}js/bootstrap-datepicker.js"></script>
    <script src="${basePath}js/bootstrap-datepicker.zh-cn.js"></script>
    <!-- 引用表格的JS -->
    <script src="${basePath}js/bootstrap-table.min.js"></script>
    <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
    <script src="${basePath}js/alert.js"></script>
    <style>
        .header .logo {
            text-align: center;
            font-size: 20px;
            color: #FFFFFF;
            line-height: 100px;
        }
        .header .logo i {
            margin-right: 10px;
        }
        .title .btn-user {
            margin-right: 100px;
        }
    </style>

</head>
<body>
<header class="header com-bj">
    <a href="${basePath}zomoreServiceCommodity/list1.do?state=1">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">销售单据
        <a class="btn btn-default btn-user btns" style="margin-right: 0px">搜索</a>
    </div>
    <div class="titles">

        <div class="xsdj-search">
            <div class="xsdj-search-top">

                <div class="input-group ">
                    <input type="email" name="group2" class="form-control" placeholder="输入单据号/牌号/会员号进行搜索">
                    <span class="input-group-btn">
						     <button type="button" class="btn  btn-warning">搜索</button>
						     </span>
                </div>
            </div>
            <div class="xsdj-search-bottom col-lg-11 col-md-12 col-sm-12">
                <div class="form-group">
                    <label for="stime" class="control-label col-lg-1 col-sm-1 col-md-1">开始日期:</label>
                    <div class="col-sm-2 col-lg-2 col-md-2">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="mm/dd/yyyy" id="date1">
                            <span class="input-group-addon"><i class="fa  fa-calendar"></i></span>
                        </div>

                    </div>
                    <label for="etime" class="control-label col-sm-1 col-md-1 col-lg-1">结束日期:</label>
                    <div class="col-sm-2 col-lg-2 col-md-2">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="mm/dd/yyyy" id="date2">
                            <span class="input-group-addon"><i class="fa  fa-calendar"></i></span>
                        </div>
                    </div>
                    <div class="col-sm-5 col-lg-5 col-md-5">
                        <a class="btn btn-info">今日</a>
                        <a class="btn btn-info">近3天</a>
                        <a class="btn btn-info">近7天</a>
                        <a class="btn btn-info">近一个月</a>
                    </div>
                    <div class="col-sm-1 col-lg-1 col-md-1">
                        <button class="btn btn-danger" id="xsdj-close">关闭</button>
                    </div>
                </div>

            </div>
        </div>
    </div>
<!--     <div class="logo">
        <i class="fa  fa-gears"></i>设置
    </div> -->
</header>
<!-- 中间区域 -->
<div class="xsdj-main">
    <!-- 左边部分 -->
    <div class="xsdj-left col-lg-2 col-md-3"  style="overflow-y: auto">
        <div class="xsdj-left-title">
            流水号 <span>总额</span>
        </div>
        <c:forEach items="${requestScope.result}" var="result">
        <div class="media" name="${result.zomoreCommoditySaleId}" >
            <div class="media-left media-middle">
                <i class="fa  fa-money media-object"></i>

            </div>
            <div class="media-body">
                <p>${result.zomoreCommoditySaleId}<span class="price">${result.zomoreCommoditySaleMoney}</span></p>
                <p>收银台：${sessionScope.cashierNumber}<span style="float: right;"><fmt:formatDate value="${result.zomoreCommoditySaleTime}" pattern="MM-dd"></fmt:formatDate> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${result.zomoreCommoditySaleTime}" pattern="HH:mm"></fmt:formatDate></span></p>
            </div>
        </div>
        </c:forEach>
<%--
        <div class="media active">
            <div class="media-left media-middle">
                <i class="fa  fa-money media-object"></i>

            </div>
            <div class="media-body">
                <p>214561324654987 <span class="price">--</span></p>

                <p>牌号：1001 <span style="float: right;">03-17  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11:31</span></p>
            </div>
        </div>

        <div class="media ">
            <div class="media-left media-middle">
                <i class="fa  fa-money media-object"></i>

            </div>
            <div class="media-body">
                <p>214561324654987 <span class="price">--</span></p>

                <p>牌号：1001 <span style="float: right;">03-17  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11:31</span></p>
            </div>
        </div>--%>

    </div>
    <!-- 左边部分结束 -->
    <!-- 右边部分 -->
    <div class="xsdj-right col-lg-10 col-md-9">
        <!-- 右边table -->
        <div class="xsdj-table">
            <table id="table" data-resizable="true">
                <thead>
                <tr>
                    <th data-field="name">商品名</th>
                    <th data-field="price">售价</th>
                    <th data-field="cutprice">折扣价</th>
                    <th data-field="num">数量</th>
                </tr>
                </thead>
            </table>
        </div>
        <!-- 右边Table结束 -->
        <!-- 右边地址栏 -->
        <div class="xsdj-right-f2">
            <div class="col-sm-6 col-lg-6 col-md-6 ">
                <ul class="list-group">
                    <li class="list-group-item fontcred" id="allnum">
                        件数：0
                    </li>
                    <li class="list-group-item" id="menber">
                        会员：(余额：0.00)
                    </li>
                    <li class="list-group-item">
                        地址：
                    </li>
                </ul>
            </div>
            <div class="col-sm-6 col-lg-6 col-md-6 ">
                <ul class="list-group">
                    <li class="list-group-item fontcred" id="allmoney">
                        总额：
                    </li>
                    <li class="list-group-item" id="menbertel">
                        电话：
                    </li>

                </ul>
            </div>
        </div>
        <!-- 右边底部 -->
        <div class="xsdj-right-footer">

            <button class="btn btn-danger btn-lg " id="tf">退货</button>
            <%--<button class="btn btn-warning btn-lg">反结账</button>--%>
            <button class="btn btn-success btn-lg" id="dy">打印</button>


        </div>
    </div>
    <!-- 右边部分结束 -->
</div>


<!-- 中间区域结束 -->

<!-- 右边的设置 -->
<div class="right-menu">
    <div class="right-menu-close">
        <i class="iconfont icon-x "></i>
    </div>
    <div class="right-menu-body">
        一些文字提示内容，看你怎么去弄，或者去处理
    </div>
</div>

<script>

    $('.media').click(function () {
      $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodityorder/showAllCommodit.do",
            data: {"id":$(this).attr("name")},
            success: function(msg){
                 //alert(JSON.stringify(msg));
                $("#table").bootstrapTable('removeAll');
                //后面追加
                $("#table").bootstrapTable('append',msg);
                $('#allnum').text("件数："+msg[0].alllnum);
                $('#allmoney').text("总额："+msg[0].alllmoney);
                $('#menbertel').text("电话："+msg[0].menberphone);
                $('#menber').text("会员："+msg[0].menber+"(余额："+msg[0].menberBalance+")");
            }
        });
    });
    var curDate = new Date();
    var nextDate = new Date(curDate.getTime() + 24 * 60 * 60 * 1000);
    $('#date1').datepicker({
        language: "zh-CN",
        format: "yyyy-mm-dd",
        todayHighlight: true,
    });
    $('#date1').datepicker('setDate', new Date());
    $('#date2').datepicker({
        language: "zh-CN",
        format: "yyyy-mm-dd",
    });
    $('#date2').datepicker('setDate', nextDate);
    $('.btns').on('click', function () {
        $('.title').hide();
        $('.titles').show();
    })
    $('#xsdj-close').on('click', function () {
        $('.title').show();
        $('.titles').hide();
    })
    // 右边设置
    $('.logo').on('click', function () {
        if ($('.right-menu').is(':hidden')) {//如果当前隐藏
            $('.right-menu').show();//那么就显示div

        } else {//否则
            $('.right-menu').hide(200);//就隐藏div

        }
    })
    $('.right-menu-close').on('click', function () {
        $('.right-menu').hide(300);
    })
   $(function () {
       $('#table').bootstrapTable({
            url: 'json/data1.json',
            method: "POST",
            onClickRow: function (row, $element) {
                $('.info').removeClass('info');
                $($element).addClass('info');
                modelPrint('请选择XX商品进行补打发票或者退货的操作', '退货', test1, test2);
            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })
    });
    $('#tf').on('click', function () {
        modelalert('请选中右边的商品在进行操作');
    })
    $('#dy').on('click', function () {
        modelPrint('确认打印订单!', '打印', test1, test2);
    });

    function test1() {

    }

    function test2() {

    }
</script>
</body>
</html>
