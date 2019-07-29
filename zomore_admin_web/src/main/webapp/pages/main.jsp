<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
    <meta name="author" content="www.divmb.com">

    <link rel="shortcut icon" href="../assets/images/favicon_1.ico">

    <title>服务商大数据界面</title>

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
    <script src="../assets/js/modernizr.min.js"></script>
    <style>
        *{
            margin: 0;
            padding: 0;
            list-style-type: none;
            background: #2f353f;
        }
        .content{
            position: fixed;
            top: 0;
            width: 100%;
            height: 100%;
        }
        .three-box{
            width: 100%;
            height: 33%;
            float: left;
        }
        .leftcont{

            height: 100%;
            float: left;

        }
        .a1{background: #0044CC;}
        .a2{background: #FF0000;}
        .a3{background: #2f353f;}
        .two-box{
            width: 100%;
            height: 50%;
            float: left;
        }
        .t-1{
            width: 100%;
            height: 20%;
            float: left;
        }
        .t-2{
            width: 100%;
            height: 60%;
            float: left;
        }
        .t-3{
            width: 100%;
            height: 20%;
            float: left;
        }
        .today-img-list,.tb-1{
            width: 100%;
            height: 100%;
            float: left;
        }
        .t-1-title{font-size: 25px; width: 100%; text-align: center;float: left; color: #FFFFFF;margin-top: 1%;}
        .t-1-an{width: 100%;float: left; text-align: center; margin-top: 0%;}
        .t-1-an a{border: #ffd432 solid 1px; color: #ffd432;padding: 1% 2%;border-radius: 5px;display: inline-block;}
        .t-1-shu{width: 100%;float: left;text-align: center;  }
        .t-1-shu span{border: #ffd432 solid 1px; color: #ff5501;padding: 1% 2%;border-radius: 5px;display: inline-block;
            font-size: 30px;
            margin-top: 1%;
            background: #ffd432;
            font-weight: bold;
        }
        .t-1-shu .bx{border: 0 !important;padding: 1% ;background: transparent; color:#ffd432 ;}
        .t-2-s{width: 100%; height: 100%;float: left;}
        .t3-title{width: 100%;float: left;color: #FFFFFF; text-align: center;font-size: 16px;font-weight: bold; margin-bottom: 1%;}
        .t3-table{
            width: 100%;
            float: left;
            height: calc(100% - 6%);
            position: relative;
        }

        .t3-table table{width: 100%;text-align: center; color: #FFFFFF;bottom: 20px;position: absolute;}
        .table-bordered>tbody>tr>td,
        .table-bordered>tbody>tr>th,
        .table-bordered>tfoot>tr>td,
        .table-bordered>tfoot>tr>th,
        .table-bordered>thead>tr>td,
        .table-bordered>thead>tr>th{_height:30px;min-height: 30px; max-height: 40px; height: 27px;}
        .thr-ti{font-size: 16px;
            font-weight: bold;
            width: 100%;
            float: left;
            color: #FFFFFF;
            text-indent: 10px;
        }
        .thr-an{width: 100%;
            float: left;
            text-align: right;
            padding-bottom: 5%;
        }
        .thr-an a{border: #FFFFFF solid 1px; color: #FFFFFF;padding: 1% 2%;border-radius: 5px;display: inline-block;}
        .thr-list ul li{
            color: #FFFFFF;
            font-size: 14px;
        }
        .thr-list ul li i{float: right; color: #FF0000;margin-right: 5px;}
        .thr-list ul li p{
            margin: 0;
            margin: 4% 2%;
        }
        .thr-list ul li p:first-child{font-size: 16px;}
        .thr-list ul li p:last-child{text-align: right;}
        .tb-t1{width: 100%;float: left; margin-top: 2%;}
        .tb-t1 ul li{
            color: #FFFFFF;
            font-size: 14px;
        }
        .tb-t1 ul li i{ color: yellow;margin-right: 5px;font-size: 20px;}
        .tb-t1 ul li p span{margin: 0px 10px;display: inline-block;}
    </style>


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
                            <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                            <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                            <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                            <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
                            <i class="fa fa-star" style="color: #efc847; background-color: #2f353f;"></i>
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
        <!-- ============================================================== -->
        <!-- Start right Content here -->
        <!-- ============================================================== -->
        <body>
        <div class="content" style="padding-left: 35px;">
            <div class="col-lg-3 leftcont col-sm-3 col-md-3">
                <div class="three-box a3">
                    <table class="table-bordered" style="width: 100%;">
                        <tr>
                            <td>序号</td>
                            <td>账号</td>
                            <td>店名</td>
                            <td>月收入</td>
                        </tr>
                        <tr>
                            <td>01</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>02</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>03</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>04</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>05</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>06</td>
                            <td>stcpos001</td>
                            <td>择沐美妆1店</td>
                            <td>￥8685424.00</td>
                        </tr>
                        <tr>
                            <td>07</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>08</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>09</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>10</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>11</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>12</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>13</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>14</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>15</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>16</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>17</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>18</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>19</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>20</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>

                    </table>
                </div>
            </div>
            <div class="col-lg-9 col-sm-9 col-md-9 leftcont">
                <div class="thr-ti">
                    客户分布
                </div>
                <div class="t-2 a1">
                    <div class="t-2-s" id="chart-panel" style="height: 600px;width: 100%; background: #2f353f;"></div>
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
<script src="../assets/djs/jquery.min.js"></script>
<script src="../assets/djs/echarts.min.js"></script>
<script src="../assets/djs/map.js"></script>

<!-- jQuery  -->
<script src="../assets/js/jquery.core.js"></script>
<script src="../assets/js/jquery.app.js"></script>
<script>
    var dom = document.getElementById("today-img");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    app.title = '环形图';

    option = {
        title: {
            text: '今日顾客来源',
            y: '10',
            textStyle: {
                "color": "#ffffff",
                "fontSize":"16"
            }
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b}: {c} ({d}%)"
        },
        legend: {
            bottom: 10,
            left: 'center',
            data:['会员','散客'],
            textStyle:{
                color:'#ffffff',
                fontSize:16
            }
        },
        color:['#ffd154', '#ed87bf'],
        series: [
            {
                name:'今日顾客来源',
                type:'pie',
                radius: ['50%', '70%'],
                avoidLabelOverlap: false,
                label: {
                    normal: {
                        show: false,
                        position: 'center'
                    },
                    emphasis: {
                        show: true,
                        textStyle: {
                            fontSize: '30',
                            fontWeight: 'bold'
                        }
                    }
                },
                labelLine: {
                    normal: {
                        show: false
                    }
                },
                data:[
                    {value:335, name:'会员'},
                    {value:310, name:'散客'},
                    //                 {value:234, name:'联盟广告'},
                    //                 {value:135, name:'视频广告'},
                    //                 {value:1548, name:'搜索引擎'}
                ]
            }
        ]
    };
    ;
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }

    window.onresize = function(){
        myChart.resize();
        myCharts.resize();
        myChart3.resize();
        ty();
    }


    var doms = document.getElementById("t1");
    var myCharts = echarts.init(doms);
    var apps = {};
    options = null;
    options = {
        title: {
            text: '今日收入分析',
            y: '10',
            textStyle: {
                "color": "#ffffff",
                "fontSize":"16"
            }
        },
        legend: {
            bottom: 10,
            left: 'center',
            textStyle:{
                color:'#ffffff',
                fontSize:16
            }
        },
        tooltip: {},
        dataset: {
            source: [
                ['product', '营业收入', '会员售卡', '耗卡'],
                ['', 43.3, 85.8, 93.7],

            ]
        },
        xAxis: {type: 'category',  axisLine: {
                lineStyle: {
                    type: 'solid',
                    color: '#ffffff',//左边线的颜色
                    width:'1'//坐标线的宽度
                }
            },},
        yAxis: {axisLine: {
                lineStyle: {
                    type: 'solid',
                    color: '#2f353f',//左边线的颜色
                    width:'1'//坐标线的宽度
                }
            },},
        // Declare several bar series, each will be mapped
        // to a column of dataset.source by default.
        series: [
            {type: 'bar'},
            {type: 'bar'},
            {type: 'bar'}
        ]
    };
    ;
    if (options && typeof options === "object") {
        myCharts.setOption(options, true);
    }


    var dom3 = document.getElementById("t2");
    var myChart3 = echarts.init(dom3);
    var app3 = {};
    option3 = null;
    option3 = {
        title : {
            text: '今日收款统计',

            y: '10',
            textStyle: {
                "color": "#ffffff",
                "fontSize":"16"
            }
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            bottom: 10,
            left: 'center',
            textStyle:{
                color:'#ffffff',
                fontSize:16
            },
            data: ['现金','微信','支付宝','储者卡','信用卡']
        },
        series : [
            {
                name: '收款方式',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'现金'},
                    {value:310, name:'微信'},
                    {value:234, name:'支付宝'},
                    {value:135, name:'储者卡'},
                    {value:1548, name:'信用卡'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)',

                    }
                }
            }
        ]
    };
    ;
    if (option3 && typeof option3 === "object") {
        myChart3.setOption(option3, true);
    }
</script>

</body>
</html>