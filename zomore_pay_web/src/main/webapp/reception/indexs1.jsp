<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>主界面2</title>
    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
    <link href="../css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../css/icon.css" rel="stylesheet"/>
    <link href="../css/commons.css" rel="stylesheet"/>
    <!-- 引用阿里图标样式 -->
    <link href="../css/iconfont.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="../css/components.css" rel="stylesheet"/>
    <!-- toggle -->
    <link href="../css/toggles.css" rel="stylesheet"/>

    <!-- 引入加减 -->
    <link href="../css/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>
    <!-- 引入jquery的JS -->

    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <!-- to -->
    <script src="../js/toggles.min.js"></script>
    <!-- 引入 -->
    <script src="../js/jquery.bootstrap-touchspin.min.js"></script>
    <!-- 引入系统信息警告的JS -->
    <script src="../js/alert.js"></script>
</head>
<body>
<%--二版页面--%>
<%--<div class="two-main">
    <div class="two-main-left col-lg-2 col-md-3 col-sm-3  ">
        <div class="two-main-left-top">
            <!-- <div class="two-main-left-top-icon">
              <i class="fa  fa-bars"></i>
             </div> -->
            <div style="line-height: 30px;text-indent: 10px; color: #FFFFFF;margin-left: 40px;float: left;">这里放LOGO</div>
            <div class="two-main-left-top-icons">
                <i class="fa   fa-wifi"></i>
            </div>
        </div>
        <div class="two-main-left-content">
            <div class="t-m-l-ct">
                <span> | 共<b id="num">0</b> 件</span>
            </div>
            <div class="t-m-table" id="tables">
              &lt;%&ndash;  <table class="table">
                    <tbody>
                    <tr>
                        <td class="t-title">测试商品</td>
                        <td>0.03</td>
                        <td class="t-nums">2</td>
                        <td rowspan="2" class="icons" style="text-align: center;vertical-align: middle;"> <i class="fa  fa-minus"></i> </td>
                    </tr>
                    <tr>
                        <td colspan="3" class="allprice">小计130</td>
                    </tr>
                    </tbody>
                </table>
                <table class="table">
                    <tbody>
                    <tr>
                        <td class="t-title">测试商品</td>
                        <td>0.03</td>
                        <td class="t-nums">2</td>
                        <td class="icons" style="text-align: center;vertical-align: middle;"> <i class="fa  fa-minus"></i> </td>
                    </tr>
                    <tr style="display: none;">
                        <td colspan="3" class="allprice">小计130</td>
                    </tr>
                    </tbody>
                </table>&ndash;%&gt;
                <!-- 清空，挂单 -->
            </div>
            <div class="t-m-l-b">
                <div class="t-m-l-b1">
                    取单
                </div>
                <div class="t-m-l-b2">
                    <ul>
                        <li onclick="clearTable()">清空</li>
                        <li>挂单</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- <div class="two-main-left-bottom2">
          <div class="media" style="margin: 10px;">
           <div class="media-left">
            <i class="fa  fa-user "></i>
           </div>
           <div class="media-body">
            <h4 class="media-heading">来宾</h4>
            <p>余额：0 积分：0</p>
           </div>
          </div>
         </div> -->
        <div class="two-main-left-bottom" id="submit">
            <b>收款：154785.52</b>
        </div>
    </div>
    <div class="two-main-right col-lg-10 col-md-9 col-sm-9 com-bjs">
        <div class="two-main-left-top">
            <span class="qx">开启<i class="fa  fa-archive"></i>钱箱</span>
            <span class="qx"><i class="fa  fa-shopping-cart"></i></span>
            <span class="qx" id="time"></span>
            <span class="other">1001 <i class="iconfont icon-xinxi"></i> <i class="iconfont icon-weibiaoti29"></i> <i class="iconfont icon-fangda"></i> <i class="iconfont icon-suoxiao icon-hide"></i> <i class="iconfont icon-x"></i> </span>
        </div>
        <div class="t-m-r-t-t">
            <div class="t-b t-fist">
                <i class="fa  fa-chevron-left"></i>
            </div>
            <div class="t-b">
                次卡
            </div>
            <div class="t-b">
                阿道夫
            </div>
            <div class="t-b">
                同仁御医
                <i class="fa  fa-chevron-down"></i>
                <div class="two-t-b">
                    <div class="t-b-20" >
                        <i class="fa  fa-chevron-left"></i>
                    </div>
                    <div class="t-b-20">
                        阿道夫1
                    </div>
                    <div class="t-b-20">
                        阿道夫2
                    </div>
                    <div class="t-b-20">
                        阿道夫3
                    </div>
                    <div class="t-b-20">
                        阿道夫4
                    </div>
                    <div class="t-b-20">
                        阿道夫5
                    </div>
                    <div class="t-b-20">
                        <i class="fa  fa-chevron-right"></i>
                    </div>
                </div>
            </div>
            <div class="t-b">
                果本
            </div>
            <div class="t-b">
                植物医生
            </div>
            <div class=" t-b t-fist">
                <i class="fa  fa-chevron-right"></i>
            </div>
            <div class="t-b">
                <i class="fa  fa-plus"></i>
            </div>
        </div>
        <div class="t-m-r-c">
            <div class="p-10 tmrc-co">
                <div class="col-lg-3 col-md-3 col-sm-3">
                    <div class="media add">
                        <div class="media-left">
                            <img src="../img/t2.png" class="media-object" style="width:60px"/>
                        </div>
                        <div class="media-body">
                            <p class="mprice" style="line-height: 50px;">新增商品</p>
                        </div>
                    </div>
                </div>
                <c:forEach items="${requestScope.result.items}" var="result">
                    <div class="col-lg-3 col-md-3 col-sm-3">
                        <div class="media">
                            <div class="media-left">
                                <img src="../img/t1.png" class="media-object" style="width:60px"/>
                            </div>
                            <div class="media-body">
                                <p class="mtitle">${result.serviceCommodityName}</p>
                                <p class="mprice">￥：${result.serviceCommodityOutprice}</p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div class="t-m-r-c1">
            <!-- <div class="col-sm-4 col-lg-3">
             <div class="panel pan1">
              <div class="input-group m-t-10">
               <input type="email" id="example-input2-group1" name="example-input2-group1" class="form-control" placeholder="输入商品关键字" />
               <span class="input-group-addon"><i class="fa  fa-keyboard-o modal1"></i></span>
              </div>
             </div>
            </div> -->
            <div class="col-sm-4 col-lg-3" style="float: right;text-align: right;">
                <button class="btn btn-success">上一页</button>
                <button class="btn btn-success">1/3</button>
                <button class="btn btn-success">下一页</button>
            </div>
        </div>
        <div class="t-m-r-b">
            <div class="col-lg-2 col-md-3 col-sm-3">
                <div class="media" >
                    <div class="media-left">
                        <i class="fa  fa-user "></i>
                    </div>
                    <div class="media-body">
                        <h4 class="media-heading">来宾</h4>
                        <p>余额：0 积分：0</p>
                    </div>
                </div>
            </div>
            <ul class="nav nav-tabs">
                <li> <a href="javascript:;" class="jqb"> <p><i class="iconfont icon-yuangongruzhi"></i></p> <p>交接班</p> </a></li>
                <li> <a href="javascript:;" class="adduser"> <p><i class="iconfont icon-huiyuan2"></i></p> <p>新增会员</p> </a></li>
                <li> <a href="${basePath}zomoreServiceCommodityorder/list1.do"> <p><i class="iconfont icon-qian1"></i></p> <p>销售单据</p> </a> </li>
                <li><a href="settings.html"> <p><i class="iconfont icon-xitong"></i></p> <p>系统设置</p> </a></li>
                <li><a href="#"> <p><i class="iconfont icon-fenlei"></i></p> <p>所有功能</p> </a></li>
            </ul>
        </div>
    </div>
</div>--%>
<%--一版页面--%>
<div class="two-main">
    <div class="two-main-left col-lg-2 col-md-3 col-sm-3  " style="height: 92%">
        <div class="two-main-left-top">
            <div class="two-main-left-top-icon">
                <i class="fa  fa-bars"></i>
            </div>
            <div class="two-main-left-top-icons">
                <i class="fa   fa-wifi"></i>
            </div>
        </div>
        <div class="two-main-left-content">
            <div class="t-m-l-ct">
                <span> | 共 <b id="num">0</b> 件</span>
            </div>
            <div class="t-m-table" id="tables">
                <!-- 清空，挂单 -->
            </div>
            <div class="t-m-l-b">
                <div class="t-m-l-b1">
                    取单
                </div>
                <div class="t-m-l-b2">
                    <ul>
                        <li onclick="clearTable()">清空</li>
                        <li>挂单</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="two-main-left-bottom2">
            <div class="media" style="margin: 10px;">
                <div class="media-left">
                    <i class="fa  fa-user "></i>
                </div>
                <div class="media-body">
                    <h4 class="media-heading">来宾</h4>
                    <p>余额：0 积分：0</p>
                </div>
            </div>
        </div>
        <div class="two-main-left-bottom" id="submit">
            <b>收款：154785.52</b>
        </div>
    </div>
    <div class="two-main-right col-lg-10 col-md-9 col-sm-9 com-bjs">
        <div class="two-main-left-top">
            <span class="qx">开启<i class="fa  fa-archive"></i>钱箱</span>
            <span class="qx"><i class="fa  fa-shopping-cart"></i></span>
            <span class="qx" id="time"></span>
            <span class="other">1001 <i class="iconfont icon-xinxi"></i> <i class="iconfont icon-weibiaoti29"></i> <i
                    class="iconfont icon-fangda"></i> <i class="iconfont icon-suoxiao icon-hide"></i> <i
                    class="iconfont icon-x"></i> </span>
        </div>
        <div class="t-m-r-t-t">
            <div class="t-b t-fist">
                <i class="fa  fa-chevron-left"></i>
            </div>
            <div class="t-b">
                次卡
            </div>
            <div class="t-b">
                阿道夫
            </div>
            <div class="t-b">
                同仁御医
                <i class="fa  fa-chevron-down"></i>
                <div class="two-t-b">
                    <div class="t-b-20">
                        阿道夫1
                    </div>
                    <div class="t-b-20">
                        阿道夫2
                    </div>
                    <div class="t-b-20">
                        阿道夫3
                    </div>
                    <div class="t-b-20">
                        阿道夫4
                    </div>
                    <div class="t-b-20">
                        阿道夫5
                    </div>
                </div>
            </div>
            <div class="t-b">
                果本
            </div>
            <div class="t-b">
                植物医生
            </div>
            <div class=" t-b t-fist">
                <i class="fa  fa-chevron-right"></i>
            </div>
            <div class="t-b">
                <i class="fa  fa-plus"></i>
            </div>
        </div>
        <div class="t-m-r-c">
            <div class="p-10 tmrc-co">
                <div class="col-lg-3 col-md-3 col-sm-3">
                    <div class="media add">
                        <div class="media-left">
                            <img src="../img/t2.png" class="media-object" style="width:60px"/>
                        </div>
                        <div class="media-body">
                            <p class="mprice" style="line-height: 50px;">新增商品</p>
                        </div>
                    </div>
                </div>
                <c:forEach items="${requestScope.result.items}" var="result">
                <div class="col-lg-3 col-md-3 col-sm-3">
                    <div class="media">
                        <div class="media-left">
                            <img src="../img/t1.png" class="media-object" style="width:60px"/>
                        </div>
                        <div class="media-body">
                            <p class="mtitle">${result.serviceCommodityName}</p>
                            <p class="mprice">￥：${result.serviceCommodityOutprice}</p>
                        </div>
                    </div>
                </div>
                </c:forEach>

            </div>
        </div>
        <div class="t-m-r-c1">
            <div class="col-sm-4 col-lg-3">
                <div class="panel pan1">
                    <div class="input-group m-t-10">
                        <input type="email" name="example-input2-group1" class="form-control"
                               placeholder="输入商品关键字" id="searchByCode"/>
                        <span class="input-group-addon"><i class="fa  fa-keyboard-o modal1"></i></span>
                    </div>
                </div>
            </div>
            <div class="col-sm-4 col-lg-3" style="float: right;text-align: right;">
                <button class="btn btn-success">上一页</button>
                <button class="btn btn-success">1/3</button>
                <button class="btn btn-success">下一页</button>
            </div>
        </div>
        <div class="t-m-r-b">
            <ul class="nav nav-tabs">
                <li><a href="javascript:;" class="jqb"><p><i class="iconfont icon-yuangongruzhi"></i></p>
                    <p>交接班</p></a></li>
                <li><a href="${basePath}reception/addusers.jsp" class="adduser"><p><i class="iconfont icon-huiyuan2"></i></p>
                    <p>新增会员</p></a></li>
                <li><a href="${basePath}zomoreServiceCommodityorder/list1.do"><p><i class="iconfont icon-qian1"></i></p>
                    <p>销售单据</p></a></li>
                <li><a href="${basePath}reception/settings.jsp"><p><i class="iconfont icon-xitong"></i></p>
                    <p>系统设置</p></a></li>
                <li><a href="#"><p><i class="iconfont icon-fenlei"></i></p>
                    <p>所有功能</p></a></li>
            </ul>
        </div>
    </div>
</div>
<%--隐藏域记住所有服务商品名称--%>
<input type="hidden" id="servicename" value="">
<input type="hidden" id="servicenum" value="">
<%--使用隐藏域保存订单id--%>
<input type="hidden" id="servieceorderid" name="servieceorderid" value="${sessionScope.Aa_servieceorderid}">
<!-- 添加服务类商品弹窗 -->
<form id="submit1" action="${basePath}zomoreServiceCommodity/add.do" method="post">
<div class="modal fade in " id="AddGood" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel"> 商品资料 </h4>
            </div>
            <div class="modal-body">
                <div class="table-fexs">
                    <div class="row">
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="form-group">
                                <div class="input-group m-t-10">
                                    <span class="input-group-addon">编号：</span>
                                    <input type="text" id="serviceCommodityId" name="serviceCommodityId"
                                           class="form-control" placeholder="Search"/>
                                    <span class="input-group-btn"> <button type="button"
                                                                           class="btn waves-effect waves-light btn-info" id="createId">生成</button> </span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="form-group">
                                <div class="input-group m-t-10">
                                    <span class="input-group-addon">销售价：</span>
                                    <input type="text" class="form-control" id="serviceCommodityOutprice" name="serviceCommodityOutprice" placeholder="Doe"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="form-group">
                                <div class="input-group">
                                    <span class="input-group-addon">品名：</span>
                                    <input type="text" class="form-control" id="serviceCommodityName" name="serviceCommodityName" placeholder="Doe"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="input-group">
                                <span class="input-group-addon">成本价：</span>
                                <input type="text" class="form-control" id="serviceCommodityInprice" name="serviceCommodityInprice" placeholder="Doe"/>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="form-group">
                                <div class="input-group m-t-10">
                                    <span class="input-group-addon">分类：</span>
                                    <select class="select2 form-control" name="zomoreCommodityType" data-placeholder="Choose a Country...">
                                        <option>xxx</option>
                                        <option>1</option>
                                        <option>1</option>
                                    </select>
                                    <span class="input-group-btn"> <button type="button"
                                                                           class="btn  btn-info">推荐</button> </span>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 col-lg-6 col-sm-6">
                            <div class="input-group">
                                <span class="input-group-addon">库存：</span>
                                <input type="text" class="form-control" id="field-2" placeholder="Doe"/>
                            </div>
                        </div>
                    </div>
                    <div class="fben">屏开更多</div>
                    <div class="addgoodshide">
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">拼音码：</span>
                                        <input type="text" class="form-control" id="serviceCommodityPinyincode" name="serviceCommodityPinyincode" placeholder="Doe"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon">库存上限：</span>
                                    <input class="vertical-spin form-control" type="text" value="" name="vertical-spin"
                                           data-bts-button-down-class="btn btn-info"
                                           data-bts-button-up-class="btn btn-info">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">供货商：</span>
                                        <input type="text" class="form-control" id="field-2" placeholder="Doe"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon">库存下限：</span>
                                    <input class="vertical-spin form-control" type="text" value="" name="vertical-spin"
                                           data-bts-button-down-class="btn btn-info"
                                           data-bts-button-up-class="btn btn-info">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">生产日期：</span>
                                        <select class="select2 form-control" data-placeholder="Choose a Country...">
                                            <option>xxx</option>
                                            <option>1</option>
                                            <option>1</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon">保质期：</span>
                                    <input class="vertical-spin form-control" type="text" value="" name="vertical-spin"
                                           data-bts-button-down-class="btn btn-info"
                                           data-bts-button-up-class="btn btn-info">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">商品状态：</span>
                                        <div class="toggle toggle-primary togglezt" style="float: right;"></div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">

                                        <div class="toggle toggle-primary toggleprice" style="float: left;"></div>
                                        <input style="float: left;width: 100px; margin-left: 10px;"
                                               class="form-control tps" name="serviceCommodityState"/>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12 col-lg-12 col-sm-12">
                                <div class="input-group">
                                    <span class="input-group-addon">商品备注：</span>
                                    <textarea class="form-control" name="serviceCommodityMeno" style="min-height: 100px;"></textarea>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
                <button type="submit" class="btn btn-success "> 确认</button>
            </div>
        </div>
    </div>
</div>
</form >
<script>

    var servicename1 = "";
    var servicenum1 = 0;
    var allmoney=0;
    var inmoney=0;
    var num=0;//商品数量
    //添加订单商品(输入商品关键字)
    $('#searchByCode').keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            var id = $(this).val();
            //向后台动态获取商品信息，回到前台显示，需要前台做重复处理
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreServiceCommodity/selectAjax.do",
                data: {"id": id},
                success: function (msg) {
                    //alert(JSON.stringify(msg));
                    if (servicename1 == '') {//拼接服务商品的名称
                        servicename1 = msg.serviceCommodityName;
                    } else {
                        servicename1 = servicename1 + "," + msg.serviceCommodityName;
                    }
                    if (servicenum1 == 0) {
                        servicenum1 = 1;
                    } else {
                        servicenum1 = servicenum1 + "," + 1;
                    }
                    allmoney+=msg.serviceCommodityOutprice;
                    inmoney+=msg.serviceCommodityMembershipprice;
                    $("#servicename").attr("value", servicename1);
                    $("#servicenum").attr("value", servicenum1);
                    var table = "<table class=\"table\">\n" +
                        "                    <tbody>\n" +
                        "                    <tr>\n" +
                        "                        <td class=\"t-title\">" + msg.serviceCommodityName + "</td>\n" +
                        "                        <td>" + msg.serviceCommodityOutprice + " </td>\n" +
                        "                        <td class=\"t-nums\">1</td>\n" +
                        "                        <td rowspan=\"2\" id=\"aa\" class=\"icons\" style=\"text-align: center;vertical-align: middle;\"><i\n" +
                        "                                class=\"fa  fa-minus\"></i></td>\n" +
                        "                    </tr>\n" +
                        "                    <tr>\n" +
                        "                        <td colspan=\"3\" class=\"allprice\">小计" + msg.serviceCommodityOutprice + "</td>\n" +
                        "                    </tr>\n" +
                        "                    </tbody>\n" +
                        "                </table>"
                    $('#tables').append(table);
                    num++;
                    $('#num').text(num);
                }
            });
        }
    });
    $('.fa-chevron-down').on('click', function () {
        if ($('.two-t-b').is(':hidden')) {
            $('.two-t-b').show();
        } else {
            $('.two-t-b').hide();
        }

    })
    //点击收款时触发
    $('#submit').click(function () {
        if ($('#servicename').val() != '') {
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/getid.do",
                success: function (msg) {
                    //msg 流水账号
                    $('#servieceorderid').attr("value", msg);
                    submit();
                }
            });
        }
    });
    //生成id
    $('#createId').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/getId.do",
            success: function (msg) {
                $('#serviceCommodityId').val(msg);
            }
        });
    });

    function submit() {
        $.ajax({
            type: "POST",
            data: {
                "zomoreCommoditySaleName":"收银员",
                "zomoreCommoditySaleInmoney":inmoney,
                "zomoreCommoditySaleMoney":allmoney,
                "zomoreCommoditySaleId": $('#servieceorderid').val(),
                "commoditNum": $('#servicenum').val(),
                "commoditName": $('#servicename').val()
            },
            url: "${basePath}zomoreServiceCommodityorder/add.do",
            success: function (msg) {
                if (msg == 'success') {
                    //点击收款跳转到收款页面
                    window.location.href="${basePath}zomoreServiceCommodityorder/pay.do?id="+$('#servieceorderid').val();
                }
            }
        });
    }

    // 点击清空事件
    function clearTable() {
        $('.t-m-table').html('');
        $('.t-m-l-b2').hide();
        $('.t-m-l-b1').show();
    }

    //点击删除事件
   $('.icons').on('click', function () {
        console.log("fdsa");
        $(this).parents('.table').remove();
    });
    //点击添加商品
    $('.add').on('click', function () {
        $('#AddGood').modal('show');
    })
    $(".vertical-spin").TouchSpin({
        verticalbuttons: true,
        verticalupclass: 'fa  fa-plus',
        verticaldownclass: 'fa  fa-minus'
    });
    var vspinTrue = $(".vertical-spin").TouchSpin({
        verticalbuttons: true
    });
    if (vspinTrue) {
        $('.vertical-spin').prev('.bootstrap-touchspin-prefix').remove();
    }


    $('#AddGood .togglezt').toggles({
        on: true, text: {
            on: '启用', // text for the ON position
            off: '禁用' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });
    $('#AddGood .toggleprice').toggles({
        on: true, text: {
            on: '会员折扣', // text for the ON position
            off: '会员价' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });

    $('#AddGood .toggleprice').on('toggle', function (e, active) {
        if (active) {
            $('.tps').hide()
        } else {
            $('.tps').show()
        }
    });
    //展开更多操作
    $('.fben').on('click', function () {
        if ($('.addgoodshide').is(':hidden')) {

            $('.addgoodshide').show();
            $(this).html('收起');

            var m_top = ($(window).height() - $('#AddGood .modal-dialog').height()) / 2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});

        } else {
            $('.addgoodshide').hide();
            $(this).html('展开更多');
            var m_top = ($(window).height() - $('#AddGood .modal-dialog').height()) / 2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});
        }
    })

    window.onload = function () {

//定时器每秒调用一次fnDate()
        setInterval(function () {
            fnDate();
        }, 1000);
    }

    //js 获取当前时间
    function fnDate() {
        var oDiv = document.getElementById("time");
        var date = new Date();
        var year = date.getFullYear();//当前年份
        var month = date.getMonth();//当前月份
        var data = date.getDate();//天
        var hours = date.getHours();//小时
        var minute = date.getMinutes();//分
        var second = date.getSeconds();//秒
        var time = year + "-" + fnW((month + 1)) + "-" + fnW(data) + " " + fnW(hours) + ":" + fnW(minute) + ":" + fnW(second);
        oDiv.innerHTML = time;
    }

    //补位 当某个字段不是两位数时补0
    function fnW(str) {
        var num;
        str > 10 ? num = str : num = "0" + str;
        return num;
    }

</script>
</body>
</html>