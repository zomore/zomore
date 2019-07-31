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
    <title>择沐管理助手</title>
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <!--标准mui.css-->
    <link rel="stylesheet" href="${basePath}css/mui.min.css">
    <!--App自定义的css-->
    <link rel="stylesheet" type="text/css" href="${basePath}css/app.css"/>
    <link rel="stylesheet" type="text/css" href="${basePath}css/iconfont.css">
    <script type="text/javascript" src="${basePath}js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${basePath}js/jquery.min.js"></script>
    <style>

        .title {
            margin: 20px 15px 10px;
            color: #6d6d72;
            font-size: 15px;
        }

        .oa-contact-cell.mui-table .mui-table-cell {
            padding: 11px 0;
            vertical-align: middle;
        }

        .oa-contact-cell {
            position: relative;
            margin: -11px 0;
        }

        .oa-contact-avatar {
            width: 75px;
        }

        .oa-contact-avatar img {
            border-radius: 50%;
        }

        .oa-contact-content {
            width: 100%;
        }

        .oa-contact-name {
            margin-right: 20px;
        }

        .oa-contact-name, oa-contact-position {
            float: left;
        }

        .chart {
            height: 200px;
            margin: 0px;
            padding: 0px;
        }

        h5 {
            margin-top: 30px;
            font-weight: bold;
        }

        h5:first-child {
            margin-top: 15px;
        }

        #container {
            width: 400px;
            height: 300px;
            overflow: hidden;
        }

        #photo {
            width: 1200px;
            animation: switch 5s ease-out infinite;
        }

        #photo > img {
            float: left;
            width: 400px;
            height: 300px;
        }

        @keyframes switch {
            0%, 25% {
                margin-left: 0;
            }
            35%, 60% {
                margin-left: -400px;
            }
            70%, 100% {
                margin-left: -800px;
            }
        }


    </style>
    <script src="${basePath}js/mui.min.js"></script>
</head>

<body>
<header class="mui-bar mui-bar-nav" style="background:#099c0b;">
    <h1 class="mui-title" style="color: #ffffff;">${sessionScope.shopName}</h1>
</header>
<nav class="mui-bar mui-bar-tab">
    <a class="mui-tab-item mui-active" href="javascript:void (0)" onclick="sy()">
        <span class="mui-icon mui-icon-home"></span>
        <span class="mui-tab-label">首页</span>
    </a>
    <a class="mui-tab-item" href="javascript:void (0)" onclick="xiaosou()">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">销售</span>
    </a>
    <a class="mui-tab-item" href="javascript:void(0)" onclick="yuangong()">
        <span class="mui-icon mui-icon-contact"></span>
        <span class="mui-tab-label">员工</span>
    </a>
    <a class="mui-tab-item" href="javascript:void (0)" onclick="shezhi()">
        <span class="mui-icon mui-icon-gear"></span>
        <span class="mui-tab-label">门店</span>
    </a>
</nav>
<div class="mui-content" style="background: #ffffff;">
    <div id="tabbar" class="mui-control-content mui-active">
        <div class="mui-collapse-content">

            <div id="slider" class="mui-slider" data-slidershowtimer="3">
                <div class="mui-slider-group mui-slider-loop">
                    <!-- 额外增加的一个节点(循环轮播：第一个节点是最后一张轮播) -->
                    <div class="mui-slider-item mui-slider-item-duplicate">
                        <a href="#">
                            <img src="${basePath}images/yuantiao.jpg">
                        </a>
                    </div>
                    <!-- 第一张 -->
                    <div class="mui-slider-item">
                        <a href="#">
                            <img src="${basePath}images/b1.jpg">
                        </a>
                    </div>
                    <!-- 第二张 -->
                    <div class="mui-slider-item">
                        <a href="#">
                            <img src="${basePath}images/b2.jpg">
                        </a>
                    </div>

                    <!-- 额外增加的一个节点(循环轮播：最后一个节点是第一张轮播) -->

                </div>
                <div class="mui-slider-indicator">
                    <div class="mui-indicator mui-active"></div>
                    <div class="mui-indicator"></div>
                    <div class="mui-indicator"></div>
                    <div class="mui-indicator"></div>
                </div>
            </div>
        </div>
        <ul class="mui-table-view" style="color: #2b2b2b;">
            <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600;">
                营业概况
            </li>
        </ul>
        <ul class="mui-table-view mui-grid-view">
            <li class="mui-table-view-cell mui-media mui-col-xs-6">
                <a href="#">
                    <div class="mui-media-body">总销售额</div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-6">
                <a href="#">
                    <div class="mui-media-body">订单数</div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-6">
                <div class="mui-table-view-cell" style="font-size: 28px; margin-left: -25px;"id="TotalSale" ><fmt:formatNumber value="${requestScope.ShopAllin.money }" pattern="0.00" type="number" />
                </div>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-6">
                <div class="mui-table-view-cell" style="font-size: 28px; margin-left: -25px;" id="allnum">${requestScope.Order}</div>
                </li>
        </ul>
        <div style="height: 1px;background: #c9c9c9;"></div>
        <ul class="mui-table-view" style="color: #2b2b2b;">
            <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600;">
                <div id="saleDate"></div>
            </li>
        </ul>
        <div class="chart" id="lineChart" style="width: 100%"></div>

        <!--热卖商品-->
        <div style="height: 1px;background: #c9c9c9;"></div>
        <ul class="mui-table-view" style="color: #2b2b2b;">
            <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600;">
                热卖商品
            </li>
        </ul>
        <c:forEach items="${requestScope.Hot}" var="Hot">
            <ul class="mui-table-view">
                <li class="mui-table-view-cell">
                        ${Hot.name}<font style="float: right;">￥${Hot.money}</font>
                    <br>
                    <p>销量${Hot.num}件 </p>
                </li>
            </ul>
        </c:forEach>

        <!--热卖项目-->
        <div style="height: 1px;background: #c9c9c9;"></div>
        <ul class="mui-table-view" style="color: #2b2b2b;">
            <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600;">
                热卖项目
            </li>
        </ul>
        <c:forEach items="${requestScope.Hot1}" var="Hot">
            <ul class="mui-table-view">
                <li class="mui-table-view-cell">
                        ${Hot.name}<font style="float: right;">￥${Hot.money}</font>
                    <br>
                    <p>销量${Hot.num}件 </p>
                </li>
            </ul>
        </c:forEach>

        <!--门店会员-->
        <div style="height: 1px;background: #c9c9c9;"></div>
        <ul class="mui-table-view" style="color: #2b2b2b;">
            <li class="mui-table-view-cell" style="background: #ffffff; font-size: 15px; font-weight:600;">
                门店会员
            </li>
        </ul>
        <ul class="mui-table-view">
            <li class="mui-table-view-cell">
                新增会员<font style="float: right;" id="newmember">${requestScope.Newmember}人</font>
                <br>
                <p id="newzhanbi">人数占比${requestScope.Percentage*100}%</p>
            </li>
            <li class="mui-table-view-cell">
                总会员<font style="float: right;" id="allmember">${requestScope.Member}人</font>
                <br>
            </li>
        </ul>
    </div>
   <%-- <script>
        //当天实时交易额
        $.ajax({
            type: "POST",
            dataType: "json",
            contentType: 'application/json',
            url: "${basePath}echar/selectShopAllin.do",
            success: function (msg) {
                console.log(msg);
                $('#allmoney').text("￥" + msg.money);
                $('#allnum').text(msg.num);
            }
        });
        //每天商品销售数量排前五
        $.ajax({
            type: "POST",
            dataType: "json",
            contentType: 'application/json',
            url: "${basePath}echar/selctSaleFire.do",
            success: function (msg) {
                for (var i = 0; i < msg.length; i++) {
                    var tr = "<li class=\"mui-table-view-cell\">\n" +
                        "                " + msg[i].name + "<font style=\"float: right;\">￥" + msg[i].price + "</font>\n" +
                        "                <br>\n" +
                        "                <p>销量" + msg[i].salenum + "件</p>\n" +
                        "            </li>";
                    $("#addcommodity").append(tr);
                }
            }
        });
        //会员数
        $.ajax({
            type: "POST",
            dataType: "json",
            contentType: 'application/json',
            url: "${basePath}echar/searchallmember.do",
            success: function (msg) {
                $('#allmember').text(msg[0] + "人");
                $('#newmember').text(msg[1] + "人");
                $('#newzhanbi').text("人数占比"+msg[2] + "%");
            }
        });
    </script>--%>
    <script>
 /*       $.ajax({
            type: "POST",
            dataType: "json",
            contentType: 'application/json',
            url: "${basePath}loginController/select.do",
            success: function (msg) {
                alert("11111111111111111111111111111111");
                $('#TotalSale').val("￥" + msg.money);
                /!*$('#allnum').text(msg.num);*!/
            }
        });*/


    </script>

<div id="tabbar-with-map" class="mui-control-content">
        <!--
            <ul class="mui-table-view">
        <li class="mui-table-view-cell">
            <a class="mui-navigate-right">
                新消息通知
            </a>
        </li>
    </ul>-->
        <ul class="mui-table-view" style="margin-top: 25px;">
            <li class="mui-table-view-cell">
                <a class="mui-navigate-right" onclick="spzl()">
                    库存查询
                </a>
            </li>
            <li class="mui-table-view-cell">
                <a class="mui-navigate-right" onclick="kcyj()">
                    库存预警
                </a>
            </li>
            <li class="mui-table-view-cell">
                <a class="mui-navigate-right">
                    关于择沐
                </a>
            </li>
        </ul>
        <ul class="mui-table-view" style="margin-top: 25px;">
            <li class="mui-table-view-cell">
                <a style="text-align: center;color: #FF3B30;">
                    退出登录
                </a>
            </li>
        </ul>
    </div>
</div>
</body>
<script src="${basePath}js/mui.min.js"></script>
<!--引用Echarts样式-->
<script src="${basePath}js/echarts-all.js"></script>

<script type="text/javascript">
    function sy() {
        window.location.href = "${basePath}loginController/select.do";
    }

    function xiaosou() {
        /*alert("${basePath}saleController/select.do");*/
        window.location.href = "${basePath}saleController/check.do";
    }

    function kcyj() {
        window.location.href = "${basePath}pages/kcyj.jsp";
    }

    function spzl() {
        window.location.href = "${basePath}pages/spzl.jsp";
    }
    function yuangong() {
        window.location.href = "${basePath}shopGuide/getGuide.do";
    }
    function shezhi() {
        window.location.href = "${basePath}staffController/select.do";
    }

</script>
<script>

    var dates = {

//获取日期
        FunGetDateStr: function (p_count) {
            var dd = new Date();
            dd.setDate(dd.getDate() + p_count);//获取p_count天后的日期
            var y = dd.getFullYear();
            var m = dd.getMonth() + 1;//获取当前月份的日期
            var d = dd.getDate();
            return m + "月" + d + "日";
        },
        //获取当前时间
        FunGetDate: function () {
            var date = new Date(); //日期对象
            var now = "";
            now = date.getFullYear() + "-";
            now = now + (date.getMonth() + 1) + "-";//取月的时候取的是当前月-1如果想取当前月+1就可以了
            now = now + date.getDate() + " ";
            now = now + date.getHours() + ":";
            now = now + date.getMinutes() + ":";
            now = now + date.getSeconds() + "";
            return now;
        },

    }


    var getOption = function (chartType) {
        var date1=dates.FunGetDateStr(-6)+"-"+dates.FunGetDateStr(0);
        var date2="销售额图表："+date1;
       $("#saleDate").text(date2);
        var chartOption = chartType == 'pie' ? {
            calculable: false,
            series: [{
                name: '访问来源',
                type: 'pie',
                radius: '65%',
                center: ['50%', '50%'],
                data: [{
                    value: 335,
                    name: '直接访问'
                }, {
                    value: 310,
                    name: '邮件营销'
                }, {
                    value: 234,
                    name: '联盟广告'
                }, {
                    value: 135,
                    name: '视频广告'
                }, {
                    value: 1548,
                    name: '搜索引擎'
                }]
            }]
        } : {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data: ['零售', '会员']
            },
            toolbox: {
                show: true,
                feature: {
                    dataZoom: {
                        yAxisIndex: 'none'
                    },
                    dataView: {readOnly: false},
                    magicType: {type: ['line', 'bar']},
                    restore: {},
                    saveAsImage: {}
                }
            },
            xAxis:  {
                type: 'category',
                boundaryGap: false,
                data: [dates.FunGetDateStr(-6), dates.FunGetDateStr(-5), dates.FunGetDateStr(-4), dates.FunGetDateStr(-3), dates.FunGetDateStr(-2), dates.FunGetDateStr(-1), dates.FunGetDateStr(0)]
            },
            yAxis: {
                type: 'value',
                axisLabel: {
                    formatter: '{value}'
                }
            },
            series: [
                {
                    name: '零售',
                    type:'line',
                    data:[${requestScope.countSale.xcount[0]}, ${requestScope.countSale.xcount[1]}, ${requestScope.countSale.xcount[2]}, ${requestScope.countSale.xcount[3]}, ${requestScope.countSale.xcount[4]}, ${requestScope.countSale.xcount[5]}, ${requestScope.countSale.xcount[6]}],
                    markLine: {
                        data: [
                            {type: 'average', name: '平均值'}
                        ]
                    }
                },
                {
                    name: '会员',
                    type:'line',
                    data:[${requestScope.memberPay.xcount[0]}, ${requestScope.memberPay.xcount[1]}, ${requestScope.memberPay.xcount[2]}, ${requestScope.memberPay.xcount[3]}, ${requestScope.memberPay.xcount[4]}, ${requestScope.memberPay.xcount[5]}, ${requestScope.memberPay.xcount[6]}],
                    markLine: {
                        data: [
                            {type: 'average', name: '平均值'},
                            [{
                                symbol: 'none',
                                x: '90%',
                                yAxis: 'max'
                            }, {
                                symbol: 'circle',
                                label: {
                                    normal: {
                                        position: 'start',
                                        formatter: '最大值'
                                    }
                                },
                                type: 'max',
                                name: '最高点'
                            }]
                        ]
                    }
                }
            ]
        };
        return chartOption;
    };
    var byId = function (id) {
        return document.getElementById(id);
    };
    var lineChart = echarts.init(byId('lineChart'));
    lineChart.setOption(getOption('line'));
    byId("echarts").addEventListener('tap', function () {
        var url = this.getAttribute('data-url');
        plus.runtime.openURL(url);
    }, false);
</script>
</html>