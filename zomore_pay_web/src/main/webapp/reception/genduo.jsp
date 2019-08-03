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
    <title>更多功能</title>
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
    <!-- toggle -->
    <link href="${basePath}css/toggles.css" rel="stylesheet"/>
    <!-- 引入加减 -->
    <link href="${basePath}css/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>
    <!-- 引入select2 -->
    <link href="${basePath}js/select2/dist/css/select2.css" rel="stylesheet"/>
    <link href="${basePath}js/select2/dist/css/select2-bootstrap.css" rel="stylesheet"/>
    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
    <!-- 引入时间的JS -->
    <script src="${basePath}js/bootstrap-datepicker.js"></script>
    <script src="${basePath}js/bootstrap-datepicker.zh-cn.js"></script>
    <!-- 引用表格的JS -->
    <script src="${basePath}js/bootstrap-table.min.js"></script>
    <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
    <!-- to -->
    <script src="${basePath}js/toggles.min.js"></script>
    <!-- 引入 -->
    <script src="${basePath}js/jquery.bootstrap-touchspin.min.js"></script>
    <!-- 引入SELECT -->
    <script src="${basePath}js/select2/dist/js/select2.min.js"></script>
    <script src="${basePath}js/alert.js"></script>
    <style>
        a:hover {
            text-decoration: none;
        }
    </style>
</head>
<body>
<header class="header com-bj">
    <%--<a href="${basePath}reception/list.do">--%>
    <a href="${basePath}reception/list.do">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">更多功能

    </div>

    <div class="logo">
        <img src="${basePath}img/logo.png"/>
    </div>
</header>
<div class="xsdj-main">
    <div class="xsdj-left col-lg-2 col-md-3 col-sm-3" style="width: 8%; border-right:#ffffff solid 0px;">
        <div class="set-menu">
        </div>
    </div>
    <div class="xsdj-right col-lg-10 col-md-9 set-cont col-sm-9">
        <div class="tab-content">
            <div class="tab-pane fade in active" id="menu1">
                <div class="set-content" style="border:1px solid #ffffff">
                    <%--<div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="">
                                    <i class="iconfont icon-rijieguanli" style="font-size:93px; color:#0094D9"> </i>
                            <p style="text-align: center;">日结</p>
                                </a>
                        </div>
                      </div>
                   </div>--%>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}reception/jh.jsp">
                                    <i class="iconfont icon-Icon" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">进货</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}zomoreCommodityDiaohuo/add.do">
                                    <i class="iconfont icon-dhgtd" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">调货</p>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-3">
                            <div class="media add" style="background: transparent;">
                                <div class="media-left" style="padding-left:25px;">
                                    <a href="${basePath}zomoreCommodityOrdergoods/gotoDinghuo.do">
                                        <i class="iconfont icon-shangpin1" style="font-size:93px; color:#0094D9"> </i>
                                        <p style="text-align: center;">订货</p>
                                    </a>
                                </div>
                            </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}zomoreCommodity/hltz.do">
                                    <i class="iconfont icon-huoliutongzhi" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">货流通知</p>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}reception/index.jsp">
                                    <i class="iconfont icon-guadan" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">挂单</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}zomoreCommoditySale/list2.do">
                                    <i class="iconfont icon-qudan" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">取单</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}reception/pandian.jsp">
                                    <i class="iconfont icon-pandian1" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">盘点</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="${basePath}reception/tk.jsp">
                                    <i class="iconfont icon-tuihuo" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">退款</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a href="javascript:(0)" onclick="subBao()">
                                    <i class="iconfont icon-baosunhuifu" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">报损</p>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media add" style="background: transparent;">
                            <div class="media-left" style="padding-left:25px;">
                                <a id="tianqianxiang">
                                    <i class="iconfont icon-danqianxiang" style="font-size:93px; color:#0094D9"> </i>
                                    <p style="text-align: center;">弹钱箱</p>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    href = ""
    $('#tianqianxiang').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}pay/kaiqianxiang.do",
            success: function (msg) {
            }, error: function () {
            }
        });

    });
    function subBao() {
        var bandloss = ${sessionScope.zomoreCashierBeforeRight.bandloss}+"";
        if (bandloss=='0'){
            alert("该收银台没有报损的权限");
            return false;
        }
        window.location.href="${basePath}reception/bs.jsp";

    }

</script>
</html>
