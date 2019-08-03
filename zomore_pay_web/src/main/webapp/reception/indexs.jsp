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
    <title>择沐收银台</title>
    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
    <link href="${basePath}css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${basePath}css/icon.css" rel="stylesheet"/>
    <link href="${basePath}css/commons.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="${basePath}css/components.css" rel="stylesheet"/>

    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
    <!-- 引入系统信息警告的JS -->
    <script src="${basePath}js/alert.js"></script>
    <!-- toggle -->
    <link href="../css/toggles.css" rel="stylesheet"/>

    <!-- 引入加减 -->
    <link href="../css/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>
    <!-- to -->
    <script src="../js/toggles.min.js"></script>
    <!-- 引入 -->
    <script src="../js/jquery.bootstrap-touchspin.min.js"></script>
    <!-- x-editable (bootstrap version) -->

    <link href="${basePath}x-editable-develop/dist/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet"/>
    <script src="${basePath}x-editable-develop/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
    <!-- main.js -->
    <script src="${basePath}assets/main.js"></script>
    <%--    <link rel="stylesheet" type="text/css" href="${basePath}css/hdw.css"/>--%>
</head>
<body>
<div class="two-main">
    <div class="two-main-left col-lg-2 col-md-3 col-sm-3">
        <div class="two-main-left-top">
            <!-- <div class="two-main-left-top-icon">
              <i class="fa  fa-bars"></i>
             </div> -->
            <div style="line-height: 30px;text-indent: 10px; color: #FFFFFF;margin-left: 40px;float: left; font-size: 28px;">
                zomoe.cn
            </div>
            <div class="two-main-left-top-icons">
            </div>
        </div>
        <div class="two-main-left-content">
            <div class="t-m-l-ct">
                <span> | 共 <b id="num">${requestScope.fwlnum==null?'0':requestScope.fwlnum}</b> 件</span>
            </div>
            <div class="t-m-table" id="tables" style="overflow-y: auto;height: 84%">
                <c:forEach items="${requestScope.salecommodit}" var="result">
                    <table  class="table">
                        <tbody>
                        <tr>
                            <td class="t-title" name="commoditName">${result.zomoreCommodityName}</td>
                            <td name="commodityPrice"><fmt:parseNumber value="${result.zomoreCommodityMoney/result.zomoreCommodityNum}" pattern="0.00"></fmt:parseNumber></td>
                            <td class="t-nums" name="commoditNum">${result.zomoreCommodityNum}</td>
                            <td rowspan="2" class="icons" style="text-align: center;vertical-align: middle;"><i
                                    class="fa  fa-minus"></i></td>
                        </tr>
                        <tr>
                            <td colspan="3" class="allprice">小计<a
                                    name="commoditallPrice"><fmt:parseNumber value="${result.zomoreCommodityMoney}" pattern="0.00"></fmt:parseNumber></a></td>
                        </tr>
                        </tbody>
                    </table>
                </c:forEach>
            </div>
            <script>
                /* 计算单价*/
                function chu(str, str1) {
                    return Number(Number(str) / Number(str1)).toFixed(2);
                }
            </script>
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
        <div class="two-main-left-bottom" style="width: 70% ;float: right;" id="submit">
            <b>收款：<a id="allmomey">${requestScope.fwlmoney==null?0:requestScope.fwlmoney}</a></b>
        </div>
        <div class="two-main-left-bottom" style="width: 29.5% ;float: left;" onclick="qianyuan()">
            <div style="width: 100%;height: 30px;"><i class="fa fa-retweet" style="font-size: 40px;"></i>
            </div>
            <b>前店</b>
        </div>
    </div>
    <div class="two-main-right col-lg-10 col-md-9 col-sm-9 com-bjs">
        <div class="two-main-left-top">
            <%-- <span class="qx">开启<i class="fa  fa-archive"></i>钱箱</span>--%>
            <span class="qx"><i class="fa  fa-shopping-cart"></i></span>
            <span class="qx" id="time"></span>
            <span class="other"><i class="fa   fa-wifi"></i>${sessionScope.cashierNumber}
                <a style="text-decoration:none; color:#fff;" id="exitFullScreen"><i class="fa fa-compress"></i></a>
                <!--放大和缩小窗口事件-->
                <a style="text-decoration:none; color:#fff;" id="fullScreen"><i class="fa fa-arrows-alt"></i></a>
                <i class="fa  fa-times jqb"></i> </span>
        </div>


            <!-- <i class="iconfont icon-weibiaoti29"></i> -->
            <%--   <i class="iconfont icon-chuangkouhua"></i>--%>
            <%--<i class="iconfont icon-suoxiao icon-hide"></i>--%>
            
        <div class="t-m-r-t-t">
            <div class="t-b t-fist" id="up">
                <i class="fa  fa-chevron-left"></i>
            </div>
            <div class="t-b" id="charu" style="overflow-y: hidden; width: 62%;white-space:nowrap">
                <div class="t-b">
                    <a style="color: white" href="javascript:void(0)" onclick="catageType(this)">全部</a>
                </div>
            </div>
            <div class="t-b t-fist" style="margin-right: -50px" id="down">
                <i class="fa  fa-chevron-right"></i>
            </div>

            <div class="t-b">
                <i class="fa  fa-plus"></i>
            </div>
        </div>
        <script type="text/javascript">
            //标记第几个开始显示
            var i = 0;
            $('#up').click(function () {
                i--;
                $('#charu').children().eq(i).show();
            });
            $('#down').click(function () {
                $('#charu').children().eq(i).hide();
                i++;
            });
        </script>
        <div class="t-m-r-c">
            <div class="p-10 tmrc-co" id="addcondityservice" style="overflow-y: auto;height: 107%">
                <c:forEach items="${requestScope.result.items}" var="result">
                    <div class="col-lg-3 col-md-3 col-sm-3" name="condityservice">
                        <div class="media" onclick="media(this)" title="${result.serviceCommodityId}">
                            <div class="media-left">
                                <img src="../img/t1.png" class="media-object" style="width:60px"/>
                            </div>
                            <div class="media-body">
                                <p class="mtitle"
                                   id="${result.serviceCommodityId}a">${result.serviceCommodityName}</p>
                                <p class="mprice" id="${result.serviceCommodityId}b"
                                   title="${result.serviceCommodityOutprice}">
                                    ￥：${result.serviceCommodityOutprice}</p>
                            </div>
                        </div>
                    </div>
                </c:forEach>

                <div class="col-lg-3 col-md-3 col-sm-3" style="width: 10%;">
                    <div class="media add" id="add" style="background: transparent;">
                        <div class="media-left">
                            <img src="../img/t2.png" class="media-object" style="width:60px;"/>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="t-m-r-c1">
            <%--  <div class="col-sm-4 col-lg-3" style="float: right;text-align: right;">
                  <button class="btn btn-success">上一页</button>
                  <button class="btn btn-success">1/3</button>
                  <button class="btn btn-success">下一页</button>
              </div>--%>
        </div>
        <div class="t-m-r-b">
            <div class="col-lg-3 col-md-4 col-sm-4">
                <div class="panel pan2" style="height: 80px;">
                    <div class="input-group ">
                        <input type="text" id="zomoreMemberNum" name="num" class="form-control"
                               placeholder="会员号/手机号"
                               autocomplete="off" value="${requestScope.zomoreMember.memberNumber}" />
                        <input type="hidden" id="memberDiscount"value="${requestScope.zomoreMember.memberDiscount}"/>
                        <span class="input-group-addon modal4" border-left: solid 1px green;>
                        <i class="fa fa-user-plus"></i>
                        <font style="color: #9d9d9d">新增</font></span>
                    </div>
                    <div style="height: 1px; background-color: #9edde3;">
                        <div class="col-lg-4 col-sm-4 col-md-4 talign"
                             style="border-right: solid 1px #9edde3; margin-top: 5px;" onclick="showUser()">
                            <p id="name"><c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberMemberidname}</c:if>
                                <c:if test="${requestScope.zomoreMember.memberNumber eq null}">会员</c:if></p>
                        </div>
                        <div class="col-lg-4 col-sm-4 col-md-4 talign"
                             style="border-right: solid 1px #9edde3; margin-top: 5px;">
                            <p id="money">余额 :<c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberBalance}</c:if>
                                <c:if test="${requestScope.zomoreMember.memberNumber eq null}">0</c:if></p>
                        </div>
                        <div class="col-lg-4 col-sm-4 col-md-4 talign"
                             style="border-right: solid 1px #9edde3; margin-top: 5px;">
                            <p id="integral">积分:<c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberIntegral}</c:if>
                                <c:if test="${requestScope.zomoreMember.memberNumber eq null}">0</c:if></p>
                        </div>
                    </div>
                </div>
            </div>
            <ul class="nav nav-tabs">
                <li><a href="javascript:;" class="jqb"><p><i class="fa fa-newspaper-o"></i></p>
                    <p>交接班</p></a></li>
                <li><a href="${basePath}zomoreServiceCommodityorder/list1.do"><p><i class="fa  fa-file-text"></i>
                </p>
                    <p>销售单据</p></a></li>
                <li><a href="${basePath}reception/searchUser.jsp" class="adduser"><p><i class="fa fa-credit-card"></i></p>
                    <p>次卡消费</p></a></li>
                <li><a href="javascript:;" class="kuaijiejian"><p><i class="fa fa-info-circle"></i></p>
                    <p>快捷键</p></a></li>
               <%-- <li><a href="${basePath}reception/settings.jsp"><p><i class="iconfont icon-xitong"></i></p>
                    <p>系统设置</p></a></li>
                <li><a href="${basePath}reception/genduo.jsp"><p><i class="iconfont icon-fenlei"></i></p>
                    <p>更多功能</p></a></li>--%>
            </ul>
        </div>
    </div>
</div>
<%--挂单弹窗--%>
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel5">挂单</h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="paihao"
                                                               class="btn btn-info">牌号</button> </span>
                        <input type="email" id="band" name="paihao" class="form-control" placeholder="牌号"/>

                    </div>
                </div>
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="daogou"
                                                               class="btn btn-info">导购员</button></span>
                        <%--<input type="email" id="guide" name="daogou" class="form-control" placeholder="导购员"/>--%>
                        <select id="guide" name="daogou" class="form-control">
                        </select>
                    </div>
                </div>
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="beizu" class="btn btn-info">备注</button> </span>
                        <input type="email" id="meno" name="meno" class="form-control" placeholder="备注"/>
                    </div>
                </div>

            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-block btn-lg sure8" id="selectGuide"
                            onclick="guadan()"> 挂单
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>


<%--快捷键弹窗--%>
<div class="modal fade  " id="kuaijiejian" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabe"> 快捷键 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">


                    </div>
                </div>
                <div class="table-fex" style="height: 200px; overflow-x: hidden;">
                    <table id="kuaijiejianTable" class="table  table-bordered">
                        <thead>
                        <tr>
                            <th data-field="memberNumber">名称</th>
                            <th data-field="memberMemberidname">快捷键</th>
                        </tr>
                        </thead>
                        <tbody class="search-list" style="overflow-y: auto;">
                        <tr>
                            <td>系统设置</td>
                            <td>Ctrl+A</td>
                        </tr>
                        <tr>
                            <td>补打小票</td>
                            <td>Ctrl+B</td>
                        </tr>
                       <%-- <tr>
                            <td>单品删除</td>
                            <td>Ctrl+D</td>
                        </tr>--%>
                        <tr>
                            <td>导购员</td>
                            <td>Ctrl+E</td>
                        </tr>
                        <tr>
                            <td>挂单</td>
                            <td>Ctrl+G</td>
                        </tr>
                        <tr>
                            <td>取单</td>
                            <td>Ctrl+Q</td>
                        </tr>
                        <tr>
                            <td>进货</td>
                            <td>Ctrl+L</td>
                        </tr>
                        <tr>
                            <td>积分兑换</td>
                            <td>Ctrl+J</td>
                        </tr>
                        <tr>
                            <td>盘点</td>
                            <td>Ctrl+K</td>
                        </tr>
                       <%-- <tr>
                            <td>单品加1</td>
                            <td>+</td>
                        </tr>
                        <tr>
                            <td>单品减1</td>
                            <td>-</td>
                        </tr>--%>
                        <tr>
                            <td>商品报损</td>
                            <td>Ctrl+R</td>
                        </tr>
                        <tr>
                            <td>订货</td>
                            <td>Ctrl+S</td>
                        </tr>
                        <tr>
                            <td>退货</td>
                            <td>Ctrl+T</td>
                        </tr>
                        <tr>
                            <td>调货</td>
                            <td>Ctrl+Y</td>
                        </tr>
                        <tr>
                            <td>查看通知</td>
                            <td>F3</td>
                        </tr>
                        <tr>
                            <td>交接班</td>
                            <td>F6</td>
                        </tr>
                        <tr>
                            <td>弹钱箱</td>
                            <td>F7</td>
                        </tr>
                        <tr>
                            <td>新增会员</td>
                            <td>F8</td>
                        </tr>
                        <tr>
                            <td>查看会员资料</td>
                            <td>F9</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <div class="col-lg-8">

                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-pink  " data-dismiss="modal">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%--隐藏域记住所有服务商品名称--%>
<input type="hidden" id="servicename" value="">
<input type="hidden" id="servicenum" value="">
<%--使用隐藏域保存订单id--%>
<input type="hidden" id="servieceorderid" name="servieceorderid" value="${sessionScope.Aa_servieceorderid}">
<%--收银台--%>
<input type="hidden" id="cashierName" name="cashierName" value="${sessionScope.cashierName}">
<%--回显金额,数量--%>
<input type="hidden" id="fwlmoney" name="fwlmoney" value="${requestScope.fwlmoney==null?0:requestScope.fwlmoney}">
<input type="hidden" id="fwlnum" name="fwlnum" value="${requestScope.fwlnum}">
<!-- 添加项目弹窗 -->
<form id="submit1" action="${basePath}zomoreServiceCommodity/add.do" method="post">
    <div class="modal fade in " id="AddGood" data-backdrop="static" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header com-bj">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                    <h4 class="modal-title" id="myModalLabel"> 项目资料 </h4>
                </div>
                <div class="modal-body">
                    <div class="table-fexs">
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group m-t-10">
                                        <span class="input-group-addon"><font style="color: red">*</font>编号：</span>
                                        <input type="text" id="serviceCommodityId" name="serviceCommodityId"
                                               class="form-control"/>
                                        <span class="input-group-btn"> <button type="button"
                                                                               class="btn waves-effect waves-light btn-info"
                                                                               id="createId">生成</button> </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group m-t-10">
                                        <span class="input-group-addon"><font style="color: red">*</font>销售价：</span>
                                        <input type="text" class="form-control" id="serviceCommodityOutprice"
                                               name="serviceCommodityOutprice"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon"><font style="color: red">*</font>品名：</span>
                                        <input type="text" class="form-control" id="serviceCommodityName"
                                               name="serviceCommodityName"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon"><font style="color: red">*</font>成本价：</span>
                                    <input type="text" class="form-control" id="serviceCommodityInprice"
                                           name="serviceCommodityInprice"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group m-t-10">
                                        <span class="input-group-addon"><font style="color: red">*</font>分类：</span>
                                        <select class="select2 form-control" name="serviceCommodityType"
                                                id="serviceCommodityType"
                                                data-placeholder="Choose a Country...">
                                            <c:forEach items="${requestScope.categorylist}" var="Type">
                                                <c:if test="${Type.zomoreCommodityCategoryParentid=='0'}">
                                                    <option value="${Type.zomoreCommodityCategoryName}"
                                                            <c:if test="${requestScope.type==Type.zomoreCommodityCategoryName}">selected</c:if>>
                                                            ${Type.zomoreCommodityCategoryName}</option>
                                                    <c:forEach items="${requestScope.categorylist}" var="Type1">
                                                        <c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
                                                            <option value="${Type1.zomoreCommodityCategoryName}"
                                                                    <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
                                                                &nbsp;&nbsp; ${Type1.zomoreCommodityCategoryName}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                        <%--<span class="input-group-btn"> <button type="button" class="btn  btn-info">推荐</button> </span>--%>
                                    </div>
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
                                            <input type="text" class="form-control" id="serviceCommodityPinyincode"
                                                   name="serviceCommodityPinyincode"/>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <span class="input-group-addon">项目状态：</span>
                                            <div class="toggle toggle-primary togglezt" style="float: right;"></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="form-group">
                                        <div class="input-group">

                                            <div class="toggle toggle-primary toggleprice"
                                                 style="float: left;"></div>
                                            <input style="float: left;width: 100px; margin-left: 10px;"
                                                   class="form-control tps" name="serviceCommodityState"/>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12 col-lg-12 col-sm-12">
                                    <div class="input-group">
                                        <span class="input-group-addon">项目备注：</span>
                                        <textarea class="form-control" name="serviceCommodityMeno"
                                                  style="min-height: 100px;"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-success " onclick="subNewService()"> 确认</button>
                </div>
            </div>
        </div>
    </div>
</form>
<!-- 交接班部分 -->
<div class="modal fade  " id="closeWork" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel6" aria-hidden="true">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header com-bj ">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel6"> 请输入现金
                </h4>
            </div>
            <form id="jiaojieban" action="${basePath}zomoreTurnover/changePeople.do" method="post">
                <div class="modal-body">
                    <div class="input-group " style="width: 100%;">
                        <input type="text" id="example-input2-group1" name="money" class="form-control "
                               autofocus="autofocus"/>

                    </div>
                    <div class="numbers " style="display: block;">
                        <ul>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">1</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">2</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">3</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">4</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">5</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">6</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">7</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">8</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">9</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">.</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 num4">0</li>
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 numback4"><i
                                    class="fa  fa-mail-reply"></i>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="submit" onclick="jiaojieban()" class="btn btn-success btn-block btn-lg"
                            data-dismiss="modal">确定
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- 这里是会员关键字搜索结果，没有封装，考虑后端数据的读取 -->
<div class="modal fade  " id="UserSearch" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title"> 会员查询 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">

                        <input type="text" id="serchUser" name="serchUser" class="form-control"
                               placeholder="输入卡号/手机号/会员账号"/>
                        <span class="input-group-btn"> <button type="button" class="btn btn-info"
                                                               id="serchUser1">搜索</button> </span>
                    </div>
                </div>
                <div class="table-fex">

                    <table id="usertable" class="table  table-bordered ">
                        <thead>
                        <tr>
                            <th data-field="memberNumber">卡号</th>
                            <th data-field="memberMemberidname">姓名</th>
                            <th data-field="memberPhonenumber">手机</th>
                            <th data-field="memberIntegral">积分</th>
                            <th data-field="memberBalance">余额</th>
                            <th data-field="memberDiscount">折扣</th>
                        </tr>
                        </thead>
                        <tbody class="search-list">
                        <c:forEach items="${requestScope.userList}" var="users">
                            <tr>
                                <td>${users.memberNumber}</td>
                                <td>${users.memberMemberidname}</td>
                                <td>${users.memberPhonenumber}</td>
                                <td>${users.memberIntegral}</td>
                                <td>${users.memberBalance}</td>
                                <td>${users.memberDiscount}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <div class="col-lg-8">
                    <%--没有找到配对的件，请重新输入关键字--%>
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-success " onclick="inputUser()"> 加入</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%--<script>

    $('.fa-chevron-down').on('click',function(){
        if($('.two-t-b').is(':hidden')){
            $('.two-t-b').show();
        }else{
            $('.two-t-b').hide();
        }

    })
    // 点击清空事件
    function clearTable(){
        $('.t-m-table').html('');
        $('.t-m-l-b2').hide();
        $('.t-m-l-b1').show();
    }
    //点击删除事件
    $('.icons').on('click',function(){
        console.log("fdsa");
        $(this).parents('.table').remove();
    });

    //点击添加商品
    $('.add').on('click',function(){
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


    $('#AddGood .togglezt').toggles({on: true, text: {
            on: '启用', // text for the ON position
            off: '禁用' // and off
        },width: 100, // width used if not set in css
        height: 30, });
    $('#AddGood .toggleprice').toggles({on: true, text: {
            on: '会员折扣', // text for the ON position
            off: '会员价' // and off
        },width: 100, // width used if not set in css
        height: 30, });

    $('#AddGood .toggleprice').on('toggle', function(e, active) {
        if (active) {
            $('.tps').hide()
        } else {
            $('.tps').show()
        }
    });
    //展开更多操作
    $('.fben').on('click',function(){
        if($('.addgoodshide').is(':hidden')){

            $('.addgoodshide').show();
            $(this).html('收起');

            var m_top = ( $(window).height() - $('#AddGood .modal-dialog').height() )/2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});

        }else{
            $('.addgoodshide').hide();
            $(this).html('展开更多');
            var m_top = ( $(window).height() - $('#AddGood .modal-dialog').height() )/2.5;
            $('#AddGood .modal-dialog').css({'margin': m_top + 'px auto'});
        }
    })

    window.onload=function(){

//定时器每秒调用一次fnDate()
        setInterval(function(){
            fnDate();
        },1000);
    }

    //js 获取当前时间
    function fnDate(){
        var oDiv=document.getElementById("time");
        var date=new Date();
        var year=date.getFullYear();//当前年份
        var month=date.getMonth();//当前月份
        var data=date.getDate();//天
        var hours=date.getHours();//小时
        var minute=date.getMinutes();//分
        var second=date.getSeconds();//秒
        var time=year+"-"+fnW((month+1))+"-"+fnW(data)+" "+fnW(hours)+":"+fnW(minute)+":"+fnW(second);
        oDiv.innerHTML=time;
    }
    //补位 当某个字段不是两位数时补0
    function fnW(str){
        var num;
        str>10?num=str:num="0"+str;
        return num;
    }

</script>--%>
<script>
    $(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/selectcatage.do",
            success: function (msg) {
                //console.log(JSON.stringify(msg));
                var tr1 = "";
                var tr2 = "";
                var tr3 = "";
                var tr4 = "";
                var tr5 = "";
                if (msg != null) {
                    for (var i = 0; i < msg.length; i++) {
                        if (msg[i].zomoreCommodityCategoryParentid == '0') {
                            tr1 = "<div class=\"t-b\"> <a style='color: white' href='javaxcript:void(0)'  onclick='catageType(this)'>" + msg[i].zomoreCommodityCategoryName + "</a>";
                            var aaa = 1;
                            for (var j = 0; j < msg.length; j++) {
                                if (msg[i].zomoreCommodityCategoryId == msg[j].zomoreCommodityCategoryParentid) {
                                    if (aaa == 1) {
                                        tr3 = "   <i class=\"fa  fa-chevron-down\" onclick='catage(this)'></i>\n" +
                                            "                                <div class=\"two-t-b\">\n" +
                                            "                                <div class=\"t-b-20\">\n" +
                                            "                                    <i class=\"fa  fa-chevron-left\"></i>\n" +
                                            "                                </div>";
                                        tr4 = "   <div class=\"t-b-20\">\n" +
                                            "                                    <i class=\"fa  fa-chevron-right\"></i>\n" +
                                            "                                </div>\n" +
                                            "                                <div class=\"t-b-20\">\n" +
                                            "                                    <i class=\"fa  fa-plus\"></i>\n" +
                                            "                                </div>\n" +
                                            "                                </div>";
                                    }
                                    tr5 += "<div class=\"t-b-20\"'> <a style='color: white' href='javaxcript:void(0)'  onclick='catageType(this)'>" + msg[j].zomoreCommodityCategoryName + "</a></div>";
                                    aaa = 2;
                                }
                            }
                            tr2 = "</div>";
                        }

                        var tr = tr1 + tr3 + tr5 + tr4 + tr2;
                        tr1 = "";
                        tr2 = "";
                        tr3 = "";
                        tr4 = "";
                        tr5 = "";
                        $('#charu').append(tr);
                    }
                }
            }
        });
    });
</script>
<script>
    //交接班控件事件
    $("li[class='col-lg-4 col-md-4 col-sm-4 col-xs-4 num4']").click(function () {
        $("#example-input2-group1").val($("#example-input2-group1").val() + $(this).text());
    });
    $("li[class='col-lg-4 col-md-4 col-sm-4 col-xs-4 numback4']").click(function () {
        var ss = $("#example-input2-group1").val();
        $("#example-input2-group1").val(ss.substring(0, ss.length - 1));
    });

    function jiaojieban() {
        $('#jiaojieban').submit();
    }

    //退出
    function tuichu() {
        window.location.href = "${basePath}pages/shouyintailogin.jsp";

    }

    //快捷键弹窗
    $("a[class='kuaijiejian']").click(function () {
        $('#kuaijiejian').modal('show');
    });

    $('.jqb').on('click', function () {
        modelJjb('确认交班', closework);
    })

    // 交接班
    function closework() {
        console.log("我要交接班");
        $('#closeWork').modal('show');
    }

    $('.modal4').on('click', function () {
        var bandaddmember = ${sessionScope.zomoreCashierBeforeRight.bandaddmember}+"";
        if (bandaddmember=='1'){
            alert("该收银台没有新增会员的权限");
            return false;
        }else{
            window.location.href = "${basePath}zomoreMember/insertMember.do";
        }

    });

</script>
<script>
    function qianyuan() {
        /*window.location.href = "${basePath}reception/list.do";*/
        window.location.href="${basePath}zomoreCommoditySale/selectQianYuan.do?id=${sessionScope.Aa_servieceorderid}"
    }

    //标记相同会员只能输入一次会员
    var Member = 0;
    //添加会员
    $('#zomoreMemberNum').keydown(function (e) {
        var num = $("#zomoreMemberNum").val();
        var Member1 = num;
        if (e.keyCode == 13 && Member != Member1) {
            huicheUser();
        }
    });

    //添加会员方法
    function huicheUser() {
        var num = $("#zomoreMemberNum").val();
        var Member1 = num;
        Member = Member1;
        //向后台动态获取会员信息，回到前台显示，
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreMember/searchByNum.do",
            data: {"num": num},
            success: function (msg) {
                if (msg != null && msg != '') {
                    $("#name").text(msg.memberMemberidname);
                    $("#money").text(msg.memberBalance);
                    $("#integral").text(msg.memberIntegral);
                    $("#memberDiscount").val(msg.memberDiscount);
                    var allmoney2=0;
                    $("td[name='commodityPrice']").each(function () {
                        //
                        var price= Number($(this).text())*Number(msg.memberDiscount)/100;
                        $(this).text(price);
                    });

                    $("a[name='commoditallPrice']").each(function () {
                        //
                        var price= Number($(this).text())*Number(msg.memberDiscount)/100;
                        allmoney2=allmoney2+price;
                        $(this).text(price);
                    });

                    $('#allmomey').text(allmoney2);
                    //根据会员的折扣，修改商品的折扣,现价，小计，收款
                      /*  var index = 0;
                        $('#commdityTable>tbody>tr>td').each(function () {

                            //现价
                            if (index == 1) {
                                // $(this).text(old * 100);
                                var aa=$(this).text() * (msg.memberDiscount / 100);
                                $(this).text(aa.toFixed(2));
                            }

                           /!* if (index == 4) {
                                //$(this).text($(this).text() / old);
                                var nm = $(this).text() * (msg.memberDiscount / 100);
                                $(this).text(nm.toFixed(2));
                            }
*!/
                            index++;
                            if (index == 4) {
                                index = 0;
                            }
                        });*/

                       /* old = (msg.memberDiscount / 100);
                        //修改付款金额
                        var test = parseFloat(allmoney * (msg.memberDiscount / 100)).toFixed(2);
                        $('#allmoney').text("￥:" + test);
                        endmoney = test;*/
                } else {
                    $('#serchUser').val(num);
                    userback(num);
                }
            },
            error: function () {
                //modelJjb('确认交班', adduser);
                /* modalOne('该会员不存在，是否确认添加会员吗？', '输入会员/手机号', adduser);*/
                $('#serchUser').val(num);
                userback(num);
            }
        });
    }

    //会员模糊查询
    function userback(id) {
        if (id == '' || id == undefined) {
            modelalert('请输入会员/手机号');
        } else {
            //console.log("执行下一个");
            // 这里可以用AJAX取值,将取到的值给新窗口过去
            //模糊查询会员信息
            $('#usertable').bootstrapTable('destroy');
            $('#usertable').bootstrapTable({
                url: "${basePath}zomoreMember/searchLikeMember.do?Member=" + id,
                method: "POST",
                onClickRow: function (row, $element) {
                    //响应点击事件
                    /*alert(row);*/
                    $('.info').removeClass('info');
                    $($element).addClass('info');
                    $('#zomoreMemberNum').val(row.memberNumber);
                },
                onLoadSuccess: function (data) {
                    if(data!=null&&data!=''){
                        $('#zomoreMemberNum').val(data[0].memberNumber);
                    }
                    $("#usertable tbody tr").addClass("DynamicAdd");
                }
            });
            $('#UserSearch').modal('show');
        }
    };
    //点击搜索，模糊查找会员
    $('#serchUser1').click(function () {
        var user = $('#serchUser').val();
        $('#usertable').bootstrapTable('destroy');
        $('#usertable').bootstrapTable({
            url: "${basePath}zomoreMember/searchLikeMember.do?Member=" + user,
            method: "POST",
            onClickRow: function (row, $element) {
                /*    //响应点击事件
                    alert(row);*/
                $('.info').removeClass('info');
                $($element).addClass('info');
                $('#zomoreMemberNum').val(row.memberNumber);
            },
            onLoadSuccess: function (data) {
                $("#usertable tbody tr").addClass("DynamicAdd");
            }
        })
    });

    //加入会员
    function inputUser() {
        huicheUser();
        $('#UserSearch').modal('hide');
    }

    var servicename1 = "";
    var servicenum1 = 0;
    var allmoney = $("#fwlmoney").val();
    var inmoney = $("#fwlmoney").val();
    var num = $("#fwlnum").val();//商品数量

    /*    $('.fa-chevron-down').on('click', function () {
            if ($('.two-t-b').is(':hidden')) {
                $('.two-t-b').show();
            } else {
                $('.two-t-b').hide();
            }
        });*/
    //显示子分类
    function catage(ss) {
        if ($(ss).next().is(':hidden')) {
            $(ss).parent().attr("style", "background: #84c44c; border: #84c44c solid 1px;");
            $(ss).next().show();
        } else {
            $(ss).parent().attr("style", "");
            $(ss).next().hide();
        }
    }

    //根据分类查找项目
    function catageType(aa) {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/searchBytype.do",
            data: {"type": $(aa).text().toString()},
            success: function (msg) {
                console.log(JSON.stringify(msg));
                $("div[name='condityservice']").remove();
                for (var i = 0; i < msg.length; i++) {
                    var tr = "   <div class=\"col-lg-3 col-md-3 col-sm-3\" name=\"condityservice\">\n" +
                        "                        <div class=\"media\" onclick='media(this)' title=\"" + msg[i].serviceCommodityId + "\">\n" +
                        "                            <div class=\"media-left\">\n" +
                        "                                <img src=\"../img/t1.png\" class=\"media-object\" style=\"width:60px\"/>\n" +
                        "                            </div>\n" +
                        "                            <div class=\"media-body\">\n" +
                        "                                <p class=\"mtitle\"\n" +
                        "                                   id=\"" + msg[i].serviceCommodityId + "a\">" + msg[i].serviceCommodityName + "</p>\n" +
                        "                                <p class=\"mprice\" id=\"" + msg[i].serviceCommodityId + "b\"\n" +
                        "                                   title=\"" + msg[i].serviceCommodityOutprice + "\">\n" +
                        "                                    ￥：" + msg[i].serviceCommodityOutprice + "</p>\n" +
                        "                            </div>\n" +
                        "                        </div>\n" +
                        "                    </div>";

                    $('#addcondityservice').prepend(tr);
                }
            }
        });
    };
    //点击收款时触发
    $('#submit').click(function () {
        if (parseFloat($("#allmomey").text()).toFixed(2) > 0){
            var cancash="";
            cancash = ${sessionScope.zomoreCashierBeforeRight.cancash};
            if(cancash=='0'){
                alert("该收银台没有收银的权限");
                return false;
            }
            var name = "";
            //拼接商品名称
            $("td[name='commoditName']").each(function () {
                name += $(this).text() + ",";
            });
            name = name.substring(0, name.length - 1);
            $('#servicename').val(name);
            var num = "";
            $("td[name='commoditNum']").each(function () {
                num += $(this).text() + ",";
            });
            num = num.substring(0, num.length - 1);
            $('#servicenum').val(num);
            var p = 0;
            $("a[name='commoditallPrice']").each(function () {
                p = p + Number($(this).text());
            });
            inmoney = p;
            allmoney = p;
            submit();
        }

    });
    //新增产品生成id
    $('#createId').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/getId.do",
            success: function (msg) {
                $('#serviceCommodityId').val(msg);
            }
        });
    });
/*后院的提交*/
    function submit() {

        $.ajax({
            type: "POST",
            data: {
                "zomoreCommoditySaleName": $("#cashierName").val(),
                "zomoreCommoditySaleInmoney": inmoney,
                "zomoreCommoditySaleMoney": allmoney,
                "zomoreCommoditySaleId": $('#servieceorderid').val(),
                "commoditNum": $('#servicenum').val(),
                "commoditName": $('#servicename').val(),
                "memberNum": $('#zomoreMemberNum').val()
            },
            url: "${basePath}zomoreServiceCommodityorder/add.do",
            success: function (msg) {
                if (msg == 'success') {
                    //点击收款跳转到收款页面
                    window.location.href = "${basePath}zomoreServiceCommodityorder/pay.do?id=" + $('#servieceorderid').val() + "&zomoreMemberNum=" + $("#zomoreMemberNum").val();
                }
            }
        });
    }

    // 点击清空事件
    function clearTable() {
        $('.t-m-table').html('');
        //$('.t-m-l-b2').hide();
        //$('.t-m-l-b1').show();
        $('#allmomey').text(0);
        $('#num').text(0);
        num = 0;
        inmoney = 0;
        allmoney = 0;
        $('#servicename').val('');
        clean();
    }

    //点击删除事件
    $('.icons').click(function () {
        //数量
        var scsl = $(this).parent().children().eq(2).html();
        num = num - Number(scsl);
        //小计
        var jqxj = $(this).parent().parent().children().eq(1).children().children("a").html();
        allmoney = allmoney - Number(jqxj);
        inmoney = inmoney - Number(jqxj);
        $('#num').text(num);
        $('#allmomey').text(allmoney);
        $(this).parents('.table').remove();
        var kexian = $('#allmomey').text(allmoney);
        allmoneyreq(kexian);
    });

    //点击删除事件
    function jianshul(aa) {
        //数量
        var scsl = $(aa).parent().children().eq(2).html();
        num = num - Number(scsl);
        //小计
        var jqxj = $(aa).parent().parent().children().eq(1).children().children("a").html();
        allmoney = allmoney - Number(jqxj);
        inmoney = inmoney - Number(jqxj);
        $('#num').text(num);
        $('#allmomey').text(allmoney);
        $(aa).parents('.table').remove();
    }

    //点击添加商品
    $('.add').on('click', function () {
        $('#AddGood').modal('show');
    });
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
    //客显收款
    function allmoneyreq(object) {
        /*alert("客显");*/
        /*alert(object);*/
        var req =$("#allmoney").text();
        $.ajax({
            type:"POST",
            url: "${basePath}zomoreCommoditySale/searchByreq.do",
            data:{"req":object},
            success:function(msg){
               /* alert("发送成功");*/

            }

        });

    }

    //客显清零
    function clean(){
       /* alert("111");*/
        $.ajax({
            type:"POST",
            url: "${basePath}zomoreCommoditySale/clean.do",

            success:function(msg){
                /*alert("发送成功");*/
            }

        });

    }

    //补位 当某个字段不是两位数时补0
    function fnW(str) {
        var num;
        str > 10 ? num = str : num = "0" + str;
        return num;
    }

    //标记相同会员只能输入一次会员
    var Member = 0;
    //上一个会员的折扣
    var old = 1;



    function media(sss) {
        if ($(sss).attr("id") != "add") {
            var disCount=$("#memberDiscount").val();

            var id = $(sss).attr("title");
            var name = $('#' + id + 'a').text();
            if(disCount!=null&&disCount!=""){
                var money = Number($('#' + id + 'b').attr("title"))*Number(disCount)/100;
            }else{
                var money = $('#' + id + 'b').attr("title");
            }

            if (servicename1 == '') {//拼接服务商品的名称
                servicename1 = name;
            } else {
                servicename1 = servicename1 + "," + name;
            }
            if (servicenum1 == 0) {
                servicenum1 = 1;
            } else {
                servicenum1 = servicenum1 + "," + 1;
            }
            allmoney = Number(allmoney) + Number(money),
                //  inmoney = Number(allmoney) + Number(money),
                $('#allmomey').text(allmoney);
            /*mark*/
            var  a= allmoney;
          allmoneyreq(allmoney);

            // alert(allmoney);
            $("#servicename").attr("value", servicename1);
            $("#servicenum").attr("value", servicenum1);
            var isinsert = 0;
            //当存在该商品时添加数量
            $("td[name='commoditName']").each(function () {
                if ($(this).text() == name) {
                    var ylnum = $(this).parent().children().eq(2).html();
                    $(this).parent().children().eq(2).text(Number(ylnum) + Number(1));
                    var ylxj = $(this).parent().parent().children().eq(1).children().children("a").html();
                    $(this).parent().parent().children().eq(1).children().children("a").text(Number(ylxj) + Number(money))
                    isinsert = 1;
                }
            });
            if (isinsert == 0) {
                var table = "<table class=\"table\">\n" +
                    "                  <tbody>\n" +
                    "                  <tr>\n" +
                    "                   <td class=\"t-title\"  name=\"commoditName\">" + name + "</td>\n" +
                    "                   <td name=\"commodityPrice\">" + money + "</td>\n" +
                    "                   <td class=\"t-nums\" name=\"commoditNum\">1</td>\n" +
                    "                   <td rowspan=\"2\"id=\"aasa\" onclick='jianshul(this)' class=\"icons\" style=\"text-align: center;vertical-align: middle;\"> <i class=\"fa  fa-minus\" ></i> </td>\n" +
                    "                  </tr>\n" +
                    "                  <tr>\n" +
                    "                   <td colspan=\"3\" class=\"allprice\" >小计<a name=\"commoditallPrice\">" + money + "</a></td>\n" +
                    "                  </tr>\n" +
                    "                  </tbody>\n" +
                    "                 </table>";
                $('#tables').append(table);
            }
            num++;
            $('#num').text(num);
        }
    };

    //点击查看会员
    $("#showUser").click(function () {
        if ($("#name").text() != '来宾') {
            window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
        } else {
            alert("请输入会员号!^-^!");
        }
    });
</script>
<script>

    $(function(){
        //全屏
        $("#fullScreen").on("click",function(){

            fullScreen();
        })
        //退出全屏
        $("#exitFullScreen").on("click",function(){

            exitFullscreen();
        })
    })

    //fullScreen()和exitScreen()有多种实现方式，此处只使用了其中一种
    //全屏
    function fullScreen() {
        var element = document.documentElement;
        if (element.requestFullscreen) {
            element.requestFullscreen();
        } else if (element.msRequestFullscreen) {
            element.msRequestFullscreen();
        }  else if (element.webkitRequestFullscreen) {
            element.webkitRequestFullscreen();
        }
    }

    //退出全屏
    function exitFullscreen() {
        if (document.exitFullscreen) {
            document.exitFullscreen();
        } else if (document.msExitFullscreen) {
            document.msExitFullscreen();
        } else if (document.mozCancelFullScreen) {
            document.mozCancelFullScreen();
        } else if (document.webkitExitFullscreen) {
            document.webkitExitFullscreen();
        }
    }

    //监听window是否全屏，并进行相应的操作,支持esc键退出
    window.onresize = function() {
        var isFull=!!(document.webkitIsFullScreen || document.mozFullScreen ||
            document.msFullscreenElement || document.fullscreenElement
        );//!document.webkitIsFullScreen都为true。因此用!!
        if (isFull==false) {
            $("#exitFullScreen").css("display","none");
            $("#fullScreen").css("display","");
        }else{
            $("#exitFullScreen").css("display","");
            $("#fullScreen").css("display","none");
        }
    }
</script>
<script>
    /*   键盘快捷键响应*/
    document.onkeydown = function (event) {
        var e = event || window.event || arguments.callee.caller.arguments[0];
        //按空格键触发(spaces)
        if (e && e.keyCode == 32) { // 按 空格键 收款

            if (parseFloat($("#allmomey").text()).toFixed(2) > 0){
                var name = "";
                //拼接商品名称
                $("td[name='commoditName']").each(function () {
                    name += $(this).text() + ",";
                });
                name = name.substring(0, name.length - 1);
                $('#servicename').val(name);
                var num = "";
                $("td[name='commoditNum']").each(function () {
                    num += $(this).text() + ",";
                });
                num = num.substring(0, num.length - 1);
                $('#servicenum').val(num);
                var p = 0;
                $("a[name='commoditallPrice']").each(function () {
                    p = p + Number($(this).text());
                });
                inmoney = p;
                allmoney = p;
                submit();
            }


        }
        //挂单(Ctrl+G)
        if (e.keyCode == 71 && e.ctrlKey) {
            if (parseFloat($("#allmomey").text()).toFixed(2) > 0) {
                //查询所有导购员，写入下拉列表
                $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreShoppingGuide/listAll.do",
                    success: function (msg) {
                        for (var i = 0; i < msg.length; i++) {
                            var aa = "<option value=" + msg[i].shoppingGuideId + ">" + msg[i].shoppingGuideName + "</option>";
                            $('#guide').append(aa);
                        }
                    },
                    error: function () {
                        alert("查找导购员失败");
                    }
                });
                $('#SelectService').modal('show');
                $('#guide>option').remove();
            } else {
                alert("您还没有选择商品");
            }
        }

        //查看挂单（Ctrl+Q）
        if (e.keyCode == 81 && e.ctrlKey) {
            window.location.href = "${basePath}zomoreCommoditySale/list2.do"
        }

        //单品+1;
        if(e.keyCode == 107 && e){
            addOne();
        }
        if(e.keyCode == 109 && e){
            deleteOne();
        }
        //进货(ctrl+L)
        if (e.keyCode == 76 && e.ctrlKey) {
            window.location.href = "${basePath}reception/jh.jsp"
        }
        //调货(ctrl+Y)
        if(e.keyCode == 89 && e.ctrlKey){
            window.location.href = "${basePath}zomoreCommodityDiaohuo/add.do";
        }
        //退货(ctrl+T)
        if(e.keyCode == 84 && e.ctrlKey){
            window.location.href = "${basePath}reception/tk.jsp";
        }
        //盘点(ctrl+K)
        if (e.keyCode == 75 && e.ctrlKey) {
            window.location.href = "${basePath}reception/pandian.jsp"
        }
        //报损(ctrl+R)
        if(e.keyCode == 82 && e.ctrlKey){
            var bandloss = ${sessionScope.zomoreCashierBeforeRight.bandloss}+"";
            if (bandloss=='0'){
                alert("该收银台没有报损的权限");
                return false;
            }
            window.location.href = "${basePath}reception/bs.jsp";
        }
        //新增会员（f8）
        if(e && e.keyCode ==119){

            var bandaddmember = ${sessionScope.zomoreCashierBeforeRight.bandaddmember}+"";
            if (bandaddmember=='0'){
                alert("该收银台没有新增会员的权限");
                return false;
            }
            window.location.href = "${basePath}zomoreMember/insertMember.do";
        }
        if(e && e.keyCode ==120){
            var member=$("#zomoreMemberNum").val();
            if (member!==""&&member!=null) {
                window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num="+ $("#zomoreMemberNum").val();
            } else {
                alert("请输入会员号!^-^!");
            }

        }
        //积分兑换(ctrl+j)
        if (e.keyCode == 74 && e.ctrlKey) {
            var member=$("#zomoreMemberNum").val();
            if (member!==""&&member!=null) {
                window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
            } else {
                alert("请输入会员号!^-^!");
            }
        }
        //系统设置(ctrl+A)
        if(e.keyCode==65 && e.ctrlKey){
            var systemsetting = ${sessionScope.zomoreCashierBeforeRight.systemsetting}+"";
            if (systemsetting=='0'){
                alert("该收银台没有系统设置的权限");
                return false;
            }
            window.location.href = "${basePath}setting/settingIndex.do";
        }
        //
        if(e && e.keyCode==117){
            modelJjb('确认交班', closework);
        }


    };

    //点击挂单时使用
    function guadan() {
        //商品数量
        var conditynum = "";
        //商品名称
        var condityname = "";
        //实收
        var condrealprice="";
        //折扣
        var discount="";
        //要做的事情
        var hf = $("#getmoney").attr("name") + "?money=" + parseFloat(endmoney).toFixed(2);
        //拼接销售单据
        //1.会员
        var huiyuan = $("#name").text();
        //会员余额
        var yuer = $('#money').text();
        //会员号
        var memberNum = $("#zomoreMemberNum").val();
        hf = hf + "&huiyuan=" + huiyuan + "&yuer=" + yuer + "&memberNum=" + memberNum;
        //2.商品原总价
        //alert(allmoney);
        // hf=hf+"&allmoney="+allmoney;
        //3.单个商品名称  数组(aa,bb,cc)
        var index1 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index1 == 1) {
                condityname = condityname + $(this).text() + ","
            }
            index1++;
            if (index1 == 7) {
                index1 = 0;
            }
        });
        condityname = condityname.substring(0, condityname.length - 1);
        // hf=hf+"&condityname="+condityname;
        //4.商品数量 数组（1,1,1）
        var index2 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index2 == 4) {
                conditynum = conditynum + $(this).text() + ","
            }
            index2++;
            if (index2 == 7) {
                index2 = 0;
            }
        });
        conditynum = conditynum.substring(0, conditynum.length - 1);

        //4.商品实收 数组（1,1,1）
        var index3 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index3 == 5) {
                condrealprice = condrealprice + $(this).text() + ","
            }
            index3++;
            if (index3 == 7) {
                index3 = 0;
            }
        });
        condrealprice = condrealprice.substring(0, condrealprice.length - 1);
        //  hf=hf+"&condityname="+condityname;

        //4.商品折扣 数组（1,1,1）
        var index4 = 0;
        $('#table>tbody>tr>td').each(function () {
            if (index4 == 3) {
                discount = discount + $(this).text() + ","
            }
            index4++;
            if (index4 == 7) {
                index4 = 0;
            }
        });
        discount = discount.substring(0, discount.length - 1);
        //hf=hf+"&conditynum="+conditynum;
        //$(this).attr("href",hf);
        //保存挂单单据
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommoditySale/add.do",
            data: {
                "zomoreCommoditySaleName": $('#cashierName').val()<%--"收银员"${sessionScope.cashierName}--%>,
                "zomoreCommoditySaleInmoney": parseFloat(endmoney).toFixed(2),
                "zomoreCommoditySaleMember": huiyuan,
                "zomoreCommoditySaleMoney": allmoney,
                "commoditNum": conditynum,
                "commoditName": condityname,
                "condrealprice":condrealprice,
                "discount":discount,
                "state": 2,
                "zomoreCommoditySaleGuide": $("#guide option:checked").text(),
                "zomoreCommodityMeno": $('#meno').val(),
                "zomoreCommodityGuadannum": $('#band').val()
            },
            success: function (msg) {
                alert("挂单成功");
                window.location.href = "${basePath}reception/list.do"
            },
            error: function () {
                alert("挂单失败");
            }
        });
    }
    
</script>

<script>
    function subNewService() {
       var serviceCommodityId = $("#serviceCommodityId").val();
        if(serviceCommodityId==null||serviceCommodityId==""){
            alert("项目编号不能为空");
            return false;
        }
        var serviceCommodityOutprice = $("#serviceCommodityOutprice").val();
        if(serviceCommodityOutprice==null||serviceCommodityOutprice==""){
            alert("销售价不能为空");
            return false;
        }
        var serviceCommodityName = $("#serviceCommodityName").val();
        if(serviceCommodityName==null||serviceCommodityName==""){
            alert("品名不能为空");
            return false;
        }
        var serviceCommodityInprice = $("#serviceCommodityInprice").val();
        if(serviceCommodityInprice==null||serviceCommodityInprice==""){
            alert("成本价不能为空");
            return false;
        }
        $("#submit1").submit();

    }
</script>

</body>
</html>