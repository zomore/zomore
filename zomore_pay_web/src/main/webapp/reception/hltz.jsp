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
    <title>货流通知</title>
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
    <a href="#" onclick="javascript :history.back(-1);">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title" >货流通知
    </div>
    <div class="logo">
        <i class="fa  fa-gears"></i>设置
    </div>
</header>
<!-- 中间区域 -->
<div class="xsdj-main ">
    <!-- 左边部分 -->
    <div class="xsdj-left col-lg-2 col-md-3 col-sm-3 " style="overflow-y: auto">
        <div class="xsdj-left-title">
            货流订单列表
        </div>
        <c:forEach items="${requestScope.result}" var="result">
        <div class="media" name="${result.zomoreCommodityOrdergoodsId}"  >
            <div class="media-left media-middle">
                <i class="fa  fa-money media-object"></i>

            </div>
            <div class="media-body">
                <p>${result.zomoreCommodityOrdergoodsId}<span class="price" name="type">订货</span></p>
                <p>收银台：${sessionScope.cashierNumber} <span style="float: right;"><fmt:formatDate value="${result.zomoreCommodityOrdergoodsTime}" pattern="MM-dd"></fmt:formatDate> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${result.zomoreCommodityOrdergoodsTime}" pattern="HH:mm"></fmt:formatDate></span></p>
            </div>
        </div>
        </c:forEach>
        <c:forEach items="${requestScope.result2}" var="result2">
        <div class="media" name="${result2.zomoreCommodityTransferId}"  >
            <div class="media-left media-middle">
                <i class="fa  fa-money media-object"></i>

            </div>
            <div class="media-body">
                <p>${result2.zomoreCommodityTransferId}<span class="price" name="type">调货</span></p>
                <p>收银台：${sessionScope.cashierNumber} <span style="float: right;"><fmt:formatDate value="${result2.zomoreCommodityTransferDatetime}" pattern="MM-dd"></fmt:formatDate> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fmt:formatDate value="${result2.zomoreCommodityTransferDatetime}" pattern="HH:mm"></fmt:formatDate></span></p>
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
                    <th data-field="code">商品条码</th>
                    <th data-field="name">商品名</th>
                    <th data-field="num">数量</th>
                    <th data-field="price">进货价</th>
                </tr>
                </thead>
            </table>
        </div>
        <!-- 右边Table结束 -->
        <!-- 右边地址栏 -->
        <div class="xsdj-right-f2">
            <div class="col-sm-6 col-lg-6 col-md-6 ">
                <ul class="list-group">
                    <li class="list-group-item" id="beizu">
                        备注：无
                    </li>
                    <li class="list-group-item" id="hlxx">
                        货流信息：
                    </li>
                </ul>
            </div>
            <div class="col-sm-6 col-lg-6 col-md-6 ">
                <ul class="list-group">
                    <li class="list-group-item" id="sl">
                        共订货<a>  </a>件
                    </li>

                </ul>
            </div>
        </div>
        <!-- 右边底部 -->
        <%--<div class="xsdj-right-footer">

            <button class="btn btn-danger btn-lg " id="tf">退货</button>
          &lt;%&ndash;  <button class="btn btn-warning btn-lg">反结账</button>&ndash;%&gt;
            <button class="btn btn-success btn-lg" id="dy">打印</button>


        </div>--%>
        <!-- 右边底部 -->
        <div class="xsdj-right-footer">
            <button class="btn btn-warning btn-lg" id="jj">拒绝</button>
            <button class="btn btn-success btn-lg" id="jh">确定</button>
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
<%--保存选择的销售订单号--%>
<input type="hidden" id="saleId" value="">
<%--保存订单类型，是1订货，2调货--%>
<input type="hidden" id="state" value="">

<script>

    $('.media').click(function () {
        /*将订单号保存在隐藏域中*/
        $('#saleId').val($(this).attr("name"));
        /*先移除其他的选择状态*/
        $("div[class='media active']").attr("class","media");
        /* 变成选择状态*/
        $(this).attr("class","media active");
        var type = $(this).find("p span[name='type']").text();
      $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/hltzmessage.do",
            data: {"id":$(this).attr("name"),"type":type},
            success: function(msg){
                  /*  $('#table thead tr:eq(0) th:eq(3)').text("订货");*/
                 //alert(JSON.stringify(msg));
                $("#table").bootstrapTable('removeAll');
                //后面追加
                $("#table").bootstrapTable('append',msg);

                $('#beizu').text("备注："+nullStr(msg[0].meno));
                $('#hlxx').text("货流信息："+msg[0].orderid);
                if(msg[0].state=='1'){
                $('#sl').text("共订货"+msg[0].allnum+"件");
                }
                if(msg[0].state=='2'){
                $('#sl').text("共调货"+msg[0].allnum+"件");
                }
                $('#state').val(msg[0].state);
                if(msg[0].state=='1'){
                     $("#jj").hide();
                }else {
                    $("#jj").show();
                }
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
    var id;
   $(function () {
       $('#table').bootstrapTable({
            url: 'json/data1.json',
            method: "POST",
            onClickRow: function (row, $element) {
                $('.info').removeClass('info');
                $($element).addClass('info');
                id=row.code;
               // modelPrint('请选择XX商品进行补打发票或者退货的操作', '退货', test1, test2);
            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })
    });
   //整个单据入库
    $('#jh').on('click', function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/hltzmessageIn.do",
            data:{"id": $('#saleId').val(),"state":$('#state').val()},
            success: function (msg) {
                window.location.href = "${basePath}zomoreCommodity/hltz.do";
            }
        });
        /*modelalert('请选中右边的商品在进行操作');*/
    })
   //整个订货单据拒绝
    $('#jj').on('click', function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/hltzmessagejujue.do",
            data:{"id": $('#saleId').val(),"state":$('#state').val()},
            success: function (msg) {
                window.location.href = "${basePath}zomoreCommodity/hltz.do";
            }
        });
        /*modelalert('请选中右边的商品在进行操作');*/
    })
    $('#dy').on('click', function () {
        modelPrint('确认打印订单!', '打印', test1, test2);
    });

    function test1() {//补打标签
        alert("a")

    }
    function test2(){//退货单类商品
        //进行退货操作
        //根据id退货
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/deletedCommoditSale.do",
            data: {
                "id": id,
                "code":$('#saleId').val()}
            ,success : function (msg) {
                window.location.href = "${basePath}zomoreCommoditySale/list1.do";
            }
        });
    }
    function nullStr(obj) {
        if(obj==null||obj=="null"){
            return "";
        }else {
            return obj
        }
        
    }
</script>
</body>
</html>
