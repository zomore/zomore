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
<script type="text/javascript">
/*    function sy() {
        window.location.href = "${basePath}pages/index.jsp";
    }*/

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
<body>
<header class="mui-bar mui-bar-nav" style="background:#099c0b;">
    <h1 class="mui-title" style="color: #ffffff;">${sessionScope.shopName}</h1>
</header>
<nav class="mui-bar mui-bar-tab">
    <a class="mui-tab-item" href="javascript:void (0)" onclick="sy()">
        <span class="mui-icon mui-icon-home"></span>
        <span class="mui-tab-label">首页</span>
    </a>
    <a class="mui-tab-item mui-active" href="javascript:void (0)" onclick="xiaosou()">
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

<div class="mui-content" style="background: #ffffff; margin-bottom: -100px;">
    <div id="tabbar" class="mui-control-content mui-active">
        <!--零售-->
        <div class="mui-collapse-content">
            <ul class="mui-table-view" style="color: #2b2b2b;">
                <li class="mui-table-view-cell">
                    零售
                </li>
            </ul>
            <ul class="mui-table-view mui-table-view-striped mui-table-view-condensed">
                <li class="mui-table-view-cell">
                    <div class="mui-slider-cell">
                        <div class="oa-contact-cell mui-table">
                            <ul class="mui-table-view mui-grid-view">
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#">
                                        <div class="mui-media-body">零售</div>
                                    </a>
                                </li>
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#">
                                        <div class="mui-media-body">利润</div>
                                    </a></li>
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#">
                                        <div class="mui-media-body">订单数</div>
                                    </a></li>
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#" style="font-size: 20px; font-weight: 700;">
                                        <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.money }" pattern="0.00" type="number" /></div>
                                    </a></li>
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#" style="font-size: 20px; font-weight: 700;">
                                        <div class="mui-media-body">${requestScope.Profit}</div>
                                    </a></li>
                                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                                    <a href="#" style="font-size: 20px; font-weight: 700;">
                                        <div class="mui-media-body">${requestScope.Order}</div>
                                    </a></li>
                            </ul>
                        </div>
                </li>
            </ul>
            <div class="chart" id="pieChart"></div>
            <ul class="mui-table-view mui-grid-view">
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">现金</div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">微信</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">支付宝</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.pay0 }" pattern="0.00" type="number" /></div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.pay2 }" pattern="0.00" type="number" /></div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.pay4 }" pattern="0.00" type="number" /></div>
                    </a></li>
            </ul>
        </div>
        </li>
        </ul>
        <ul class="mui-table-view mui-grid-view">
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body">银联卡</div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body">储值卡</div>
                </a></li>
          <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body"></div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.pay3 }" pattern="0.00" type="number" /></div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body"><fmt:formatNumber value="${requestScope.ShopAllin.pay1 }" pattern="0.00" type="number" /></div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body"></div>
                </a></li>
        </ul>
    </div>
    </li>
    </ul>
</div>
</div>

<!--储值卡-->
<%--<div class="mui-content" style="background: #ffffff; padding-bottom: 0px;">
    <div id="tabbar" class="mui-control-content mui-active">
        <!--储值卡-->
        <div class="mui-collapse-content">
            <ul class="mui-table-view" style="color: #2b2b2b;">
                <li class="mui-table-view-cell">
                    储值卡
                </li>
            </ul>
            <ul class="mui-table-view mui-grid-view">
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">现金</div>
                    </a>
                </li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">微信</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#">
                        <div class="mui-media-body">支付宝</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body">￥888888</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body">￥88888</div>
                    </a></li>
                <li class="mui-table-view-cell mui-media mui-col-xs-4">
                    <a href="#" style="font-size: 20px; font-weight: 700;">
                        <div class="mui-media-body">18</div>
                    </a></li>
            </ul>
        </div>
        </li>
        </ul>
        <ul class="mui-table-view mui-grid-view">
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body">银联卡</div>
                </a>
            </li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body">其它</div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#">
                    <div class="mui-media-body"></div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body">￥888</div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body">￥288</div>
                </a></li>
            <li class="mui-table-view-cell mui-media mui-col-xs-4">
                <a href="#" style="font-size: 20px; font-weight: 700;">
                    <div class="mui-media-body"></div>
                </a></li>
        </ul>
    </div>
    </li>
    </ul>
</div>--%>

</div>

</body>
<script src="${basePath}js/mui.min.js"></script>
<!--引用Echarts样式-->
<script src="${basePath}js/echarts-all.js"></script>
<script>
    var getOption = function (chartType) {
        var chartOption = chartType == 'pie' ? {
            calculable: false,
            series: [{
                name: '访问来源',
                type: 'pie',
                radius: '65%',
                center: ['50%', '50%'],
                data: [{
                    value: <fmt:formatNumber value="${requestScope.ShopAllin.pay0 }" pattern="0.00" type="number" />,
                    name: '现金<fmt:formatNumber value="${requestScope.ShopAllin.pay0 }" pattern="0.00" type="number" />'
                }, {
                    value: <fmt:formatNumber value="${requestScope.ShopAllin.pay2 }" pattern="0.00" type="number" />,
                    name: '微信<fmt:formatNumber value="${requestScope.ShopAllin.pay2 }" pattern="0.00" type="number" />'
                }, {
                    value: <fmt:formatNumber value="${requestScope.ShopAllin.pay4 }" pattern="0.00" type="number" />,
                    name: '支付宝<fmt:formatNumber value="${requestScope.ShopAllin.pay4 }" pattern="0.00" type="number" />'
                }, {
                    value: <fmt:formatNumber value="${requestScope.ShopAllin.pay1 }" pattern="0.00" type="number" />,
                    name: '储值卡<fmt:formatNumber value="${requestScope.ShopAllin.pay1 }" pattern="0.00" type="number" />'
                }, {
                    value: <fmt:formatNumber value="${requestScope.ShopAllin.pay3 }" pattern="0.00" type="number" />,
                    name: '银联<fmt:formatNumber value="${requestScope.ShopAllin.pay3 }" pattern="0.00" type="number" />'
                }]
            }]
        } : {
            legend: {
                data: ['蒸发量', '降水量']
            },
            grid: {
                x: 35,
                x2: 10,
                y: 30,
                y2: 25
            },
            toolbox: {
                show: false,
                feature: {
                    mark: {
                        show: true
                    },
                    dataView: {
                        show: true,
                        readOnly: false
                    },
                    magicType: {
                        show: true,
                        type: ['line', 'bar']
                    },
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    }
                }
            },
            calculable: false,
            xAxis: [{
                type: 'category',
                data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
            }],
            yAxis: [{
                type: 'value',
                splitArea: {
                    show: true
                }
            }],
            series: [{
                name: '蒸发量',
                type: chartType,
                data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
            }, {
                name: '降水量',
                type: chartType,
                data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3]
            }]
        };
        return chartOption;
    };
    var byId = function (id) {
        return document.getElementById(id);
    };
    var pieChart = echarts.init(byId('pieChart'));
    pieChart.setOption(getOption('pie'));
    byId("echarts").addEventListener('tap', function () {
        var url = this.getAttribute('data-url');
        plus.runtime.openURL(url);
    }, false);
</script>
</html>