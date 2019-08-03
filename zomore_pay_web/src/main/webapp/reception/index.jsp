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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>择沐收银台</title>
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

    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
    <!-- 引用表格的JS -->
    <script src="${basePath}js/bootstrap-table.min.js"></script>
    <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
    <!-- 引用表格后键菜单的JS -->
    <script src="${basePath}js/BootstrapMenu.min.js"></script>
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
    <style type="text/css">
        .th-inner {
            font-weight: normal;
        }

        #table > tbody > tr:nth-of-type(odd) {
            background-color: #f7f0df;
        }

        #winpop {
            width: 300px;
            height: 0px;
            position: absolute;
            right: 0;
            bottom: 200px;
            border: 0px solid #4e5b99;
            margin: 0;
            padding: 1px;
            overflow: hidden;
            display: none;
            background: #FFFFFF
        }

        #winpop .con {
            width: 100%;
            height: 80px;
            line-height: 80px;
            font-weight: bold;
            font-size: 12px;
            color: #FF0000;
            text-decoration: underline;
            text-align: center
        }
    </style>
    <style>
        #birthday {
            width: 300px;
            height: 0px;
            position: absolute;
            right: 0;
            bottom: 200px;
            border: 0px solid #4e5b99;
            margin: 0;
            padding: 1px;
            overflow: hidden;
            display: none;
            background: #FFFFFF
        }

        #birthday .con {
            width: 100%;
            height: 80px;
            line-height: 80px;
            font-weight: bold;
            font-size: 12px;
            color: #FF0000;
            text-decoration: underline;
            text-align: center
        }
    </style>
</head>
<body>
<%--<!--加入放大和缩小窗口事件-->--%>
<%--<div id="quite">--%>
    <%--<div id="content" style="background-color: #fff">--%>

<header class="header com-bj index-header">
    <div class="col-sm-2 col-md-2 col-lg-1" style="text-align: center;">
        <img src="${basePath}img/logo.png"/>
    </div>
    <div class="col-sm-8 col-md-8 col-lg-9">
        <ul class="nav nav-tabs">
            <li><a href="${basePath}zomoreTurnover/list.do?id=${sessionScope.cashierNumber}" ><p><i class="iconfont icon-yuangongruzhi"></i></p>
                <p>交接班</p></a></li>
            <li><a href="${basePath}zomoreCommoditySale/list1.do"><p><i class="iconfont icon-qian1"></i></p>
                <p>销售单据</p></a></li>
            <li><a href="${basePath}reception/searchUser.jsp"><p><i class="iconfont icon-shuaqia"></i></p>
                <p>次卡消费</p></a>
            </li>
            <li><a href="javascript:;" class="kuaijiejian"><p><i class="iconfont icon-icon_details"></i></p>
                <p>快捷键</p></a></li>
            <li><a href="javascript:(0);" id="setSystem"><p><i class="iconfont icon-xitong"></i></p>
                <p>系统设置</p></a></li>
            <%--  <li><a href="${pageContext.request.contextPath}/reception/reservation-action.jsp"><p><i
                      class="iconfont icon-fenlei"></i></p>
                  <p>更多功能</p></a></li>--%>
            <li><a href="${basePath}reception/genduo.jsp"><p><i
                    class="iconfont icon-fenlei"></i></p>
                <p>更多功能</p></a></li>
        </ul>
    </div>
    <div class="col-sm-2 col-md-2 col-lg-2">
        <div class="h-top">
                <%--<i class="iconfont icon-xinxi"></i>--%>
                    <a style="text-decoration:none" id="exitFullScreen"><i class="iconfont icon-weibiaoti29"></i></a>
                <!--放大和缩小窗口事件-->
                <a style="text-decoration:none" id="fullScreen"><i class="iconfont icon-fangda"></i></a>
                <%--   <i class="iconfont icon-chuangkouhua"></i>--%>
                <%--<i class="iconfont icon-suoxiao icon-hide"></i>--%>
                <i class="iconfont icon-x jqb" ></i>
            </div>

        <%-- <div class="h-top-txt">
             STC美妆1店
         </div>
         <p class="h-top-no"><i class="iconfont icon-wifi1"></i>1001</p>--%>
        <div class="h-top-txt">
            ${sessionScope.shopName}
        </div>
        <p class="h-top-no"><i class="iconfont icon-wifi1" id="wifi"></i>${sessionScope.cashierNumber}</p>
    </div>
</header>
<!-- 主界面内容 -->
<div class="index-main">
    <table id="table" data-resizable="true">
        <thead>
        <tr>
            <th data-field="id">商品条码</th>
            <th data-field="name">商品名称</th>
            <th data-field="oldprivice">原价</th>
            <th data-field="discount">折扣</th>
            <th data-field="num" style="width: 10px">数量</th>
            <th data-field="newprivice">现价</th>
            <th data-field="money">小计</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${qianyuanList}" var="list">
            <tr>
                <td>${list.zomreComoditycode}</td>
                <td>${list.zomoreCommodityName}</td>
                <td>${list.zomoreCommodityMoney/list.zomoreCommodityNum}</td>
                <td>${list.zomoreCommodityDiscount}</td>
                <td>${list.zomoreCommodityNum}</td>
                <td>${list.zomoreCommodutyInMoney}</td>
                <td>${list.zomoreCommodityCountMoney}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- 主界面底部 -->
<div class="index-footer">
    <div class="f-top f-top-bj">
        <div class="col-lg-3 col-md-3 col-xs-3 f-top-left">
            共计 <a id="allShopNum"><c:if test="${qianyuanSale eq null}">0</c:if><c:if test="${qianyuanSale ne null}">${qianyuanSale.zomoreCommoditySaleNum}</c:if></a> 件商品
        </div>
        <div class="col-lg-9 col-md-9 col-xs-9 f-top-right">
            <c:if test="${requestScope.cashierGenralSetting.newlyadded eq 1}">
                <button class="btn btn-default waves-effect waves-light add" data-toggle="modal"
                        data-target="#addCommity"><i class="iconfont icon-jiahao"></i> <span>新增商品</span></button>
            </c:if>
           <%-- <button class="btn btn-default waves-effect waves-light add" data-toggle="modal"
                    data-target="#addCommity"><i class="iconfont icon-jiahao"></i> <span>新增商品</span></button>--%>
            <button class="btn btn-default " onclick="Deleted()"><span>删除</span></button>
            <button class="btn btn-default " onclick="DeletedAll()"><span>整单删除</span></button>
            <button class="btn btn-default "><i class="iconfont icon-shouji"></i> <span>商城订单</span></button>
        </div>
    </div>
    <div class="f-bottom f-bottom-bj">
        <div class="col-sm-4 col-lg-3">
            <div class="panel pan1">
                <div class="input-group m-t-10">
                    <input type="text" id="searchByCode" name="code" class="form-control" placeholder="请输入条码"
                           autocomplete="off"/>
                    <span class="input-group-addon"><i class="iconfont icon-jisuanqi modal1"></i></span>
                </div>
                <div class="input-group m-top-10">
                    <input type="text" id="WM" name="WM" class="form-control"
                           placeholder="无码收银"/>
                    <span class="input-group-addon"><i class="iconfont icon-jisuanqi modal3"></i></span>
                </div>
            </div>
        </div>
        <div class="col-sm-4 col-lg-3 ">
            <div class="panel pan2">
                <div class="input-group ">
                    <input type="text" id="zomoreMemberNum" name="num" class="form-control" placeholder="会员号/手机号"
                           autocomplete="off" value="${requestScope.zomoreMember.memberNumber}"/>
                    <input type="hidden" id="zomoreMemberId" name="zomoreMemberId">
                    <span class="input-group-addon"><i class="iconfont icon-icon_addperson modal4"></i></span>
                </div>
                <div style="height: 1px; background-color: #9edde3;">
                    <div class="col-lg-4 col-sm-4 col-md-4 talign"
                         style="border-right: solid 1px #9edde3;">
                        <p id="name">  <c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberMemberidname}</c:if><c:if test="${requestScope.zomoreMember.memberNumber eq null}">会员</c:if> </p> 姓名
                        <span class="label label-warning " id="showUser" >查看</span>
                    </div>
                    <div class="col-lg-4 col-sm-4 col-md-4 talign"
                         style="border-right: solid 1px #9edde3;">
                        <p id="money"> <c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberBalance}</c:if>
                        <c:if test="${requestScope.zomoreMember.memberNumber eq null}">0</c:if></p>余额
                        <span class="label label-warning" id="cz">充值</span>
                    </div>
                    <div class="col-lg-4 col-sm-4 col-md-4 talign">
                        <p id="integral"><c:if test="${requestScope.zomoreMember.memberNumber ne null}">${requestScope.zomoreMember.memberIntegral}</c:if>
                            <c:if test="${requestScope.zomoreMember.memberNumber eq null}">0</c:if></p> 积分
                        <span class="label label-warning" id="jifenduihuan">兑换</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4 col-lg-3" style="float: right;">
            <div class="panel p-red">
                <a href="javascript:void(0)" name="${basePath}reception/sk.jsp" id="getmoney">
                    <div class="left">
                        <div class="p-left">
                            <p class="p-red-h1">收款</p>
                            <p class="p-red-txt">[空格键]</p>
                        </div>
                        <div class="p-right" id="allmoney" style="font-size: 30px" onchange="allmoneyreq()">
                            <c:if test="${qianyuanSale eq null}">￥:0.00</c:if><c:if test="${qianyuanSale ne null}">￥:${qianyuanSale.zomoreCommoditySaleInmoney}</c:if>
                        </div>
                    </div>
                </a>
                <div class="right" onclick="houyuan()">
                    <i class="iconfont icon-icon_exchange"></i>
                    <p>后院</p>
                </div>
            </div>
        </div>
    </div>
</div>
    <%--</div>--%>
<%--</div>--%>
<%--隐藏域，获取回显的商品总数量用于初始化table改变的allmoney的值--%>
<input type="hidden" id="realAllmoney" value="<c:if test="${qianyuanSale eq null}">0</c:if><c:if test="${qianyuanSale ne null}">${qianyuanSale.zomoreCommoditySaleMoney}</c:if>"/>
<input type="hidden" id="realEndmoney" value="<c:if test="${qianyuanSale eq null}">0</c:if><c:if test="${qianyuanSale ne null}">${qianyuanSale.zomoreCommoditySaleInmoney}</c:if>"/>
<%--隐藏域，获取回显的商品总数量用于初始化table改变的allmoney的值--%>
<input type="hidden" id="realAllShopNum" value="<c:if test="${qianyuanSale eq null}">0</c:if><c:if test="${qianyuanSale ne null}">${qianyuanSale.zomoreCommoditySaleNum}</c:if>">
<%--隐藏域，获取回显的商品总数量用于初始化table改变的allmoney的值--%>
<input type="hidden" id="realEndShopNum" value="<c:if test="${qianyuanSale eq null}">0</c:if><c:if test="${qianyuanSale ne null}">${qianyuanSale.zomoreCommoditySaleInmoney}</c:if>">
<%--会员专享活动的id--%>
<input type="hidden" id="memberPromotion" value="">
<%--会员折上折--%>
<input type="hidden" id="memberPromotionZekou" value="">
<%--存在满额返现的商品--%>
<input type="hidden" id="mefxCommodity" value="">
<%--返现金额--%>
<input type="hidden" id="giveMoney" value="">
<!-- 这里是商品关键字搜索结果，没有封装，考虑后端数据的读取 -->
<div class="modal fade  " id="GoodSearch" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title"> 选择商品 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <span class="btn  btn-primary search-icon"><i
                                class="fa fa-search"></i></span> </span>
                        <input type="email" id="searchLikeCode" name="searchLikeCode" class="form-control"
                               placeholder="按条形码/拼音码/品名搜索"/>
                        <span class="input-group-btn"> <button type="button" id="searchLikeCode1" class="btn btn-info">搜索</button> </span>
                    </div>
                </div>
                <div class="table-fex">

                    <table id="searchLikeCodeTable" data-resizable="true" class="table  table-bordered ">
                        <thead>
                        <tr>
                            <th data-field="CommodityCode">商品条码</th>
                            <th data-field="CommodityName">商品名称</th>
                            <th data-field="Specifications">分类</th>
                            <th data-field="CommodityOut">价格</th>
                            <th data-field="CommodityNum">会员价</th>
                        </tr>
                        </thead>
                        <tbody class="search-list">
                        <c:forEach items="${requestScope.CommodityList}" var="commodity">
                            <tr>
                                <td>${commodity.zomoreCommodityCode}</td>
                                <td>${commodity.zomoreCommodityName}</td>
                                <td>${commodity.zomoreCommoditySpecifications}</td>
                                <td>${commodity.zomoreCommodityOut}</td>
                                <td>${commodity.zomoreCommodityNum}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="modal-footer">
                <div class="col-lg-8">
                    没有找到配对的件，请重新输入关键字
                </div>
                <div class="col-lg-4">
                    <button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-success" id="inputCommodity" onclick=""> 加入</button>
                </div>
            </div>
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
                <h4 class="modal-title" id="myModalLabel"> 会员查询 </h4>
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


<%--备用金--%>
<!-- 交接班部分：上班 -->
<div class="modal fade  " id="closeWork2" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel6" aria-hidden="true">
    <div class="modal-dialog ">
        <div class="modal-content">
            <div class="modal-header com-bj ">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel62"> 请输入备用金
                </h4>
            </div>
            <form id="jiaojieban2" action="${basePath}zomoreTurnover/#" method="post">
                <div class="modal-body">
                    <div class="input-group " style="width: 100%;">
                        <input type="text"  id="shangBan" name="money" class="form-control "
                               autofocus="autofocus"/>

                    </div>
                    <div class="numbers " style="display: block;">
                        <ul>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">1</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">2</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">3</li>
                            <li class="col-lg-3col-md-3 col-sm-3 col-xs-3 num3">4</li>
                            <li class="col-lg-3col-md-3 col-sm-3 col-xs-3 num3">5</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">6</li>
                            <li class="col-lg-3col-md-3 col-sm-3 col-xs-3  num3">7</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">8</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">9</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">.</li>
                            <li class="col-lg-3 col-md-3 col-sm-3 col-xs-3 num3">0</li>
                            <li class="col-lg-3 col-md-3  col-sm-3 col-xs-34 numback3"><i class="fa  fa-mail-reply"></i>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" onclick="jiaojieban2()" class="btn btn-success btn-block btn-lg"
                            data-dismiss="modal">确定
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>




<!-- 交接班部分：下班 -->
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
                        <input type="hidden"  name="readycash" id="readycash"
                               />

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
                            <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 numback4"><i class="fa  fa-mail-reply"></i>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" onclick="jiaojieban()" class="btn btn-success btn-block btn-lg"
                            <%--data-dismiss="modal"--%>>确定
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>


<!-- 新增商品资料弹窗 -->
<form id="submit" action="${basePath}zomoreCommodity/add1.do" method="post">
    <div class="modal fade in " id="AddGood" data-backdrop="static" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header com-bj">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                    <h4 class="modal-title" id="myModalLabel1"> 商品资料 </h4>
                </div>
                <div class="modal-body">
                    <div class="table-fexs">
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group m-t-10">
                                        <span class="input-group-addon">条码：</span>
                                        <input type="text" id="zomoreCommodityCode" name="zomoreCommodityCode"
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
                                        <span class="input-group-addon">零售价：</span>
                                        <input type="text" class="form-control" id="zomoreCommodityOut"
                                               name="zomoreCommodityOut"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group">
                                        <span class="input-group-addon">品名：</span>
                                        <input type="text" class="form-control" id="zomoreCommodityName"
                                               name="zomoreCommodityName"/>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon">进货价：</span>
                                    <input type="text" class="form-control" id="zomoreCommodityIn"
                                           name="zomoreCommodityIn"/>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="form-group">
                                    <div class="input-group m-t-10">
                                        <span class="input-group-addon">分类：</span>
                                        <select class="select2 form-control" name="zomoreCommodityType">
                                            <option value="默认分类">默认分类</option>
                                            <c:forEach items="${requestScope.commodityType}" var="Type">
                                                <c:if test="${Type.zomoreCommodityCategoryParentid=='0'}">
                                                    <option value="${Type.zomoreCommodityCategoryName}"
                                                            <c:if test="${requestScope.type==Type.zomoreCommodityCategoryName}">selected</c:if>>
                                                            ${Type.zomoreCommodityCategoryName}</option>
                                                    <c:forEach items="${requestScope.commodityType}" var="Type1">
                                                        <c:if test="${Type1.zomoreCommodityCategoryParentid==Type.zomoreCommodityCategoryId}">
                                                            <option value="${Type1.zomoreCommodityCategoryName}"
                                                                    <c:if test="${requestScope.type==Type1.zomoreCommodityCategoryName}">selected</c:if>>
                                                                &nbsp;&nbsp; ${Type1.zomoreCommodityCategoryName}</option>
                                                        </c:if>
                                                    </c:forEach>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                        <span class="input-group-btn"> <button type="button"
                                                                               class="btn  btn-info">推荐</button> </span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6 col-sm-6">
                                <div class="input-group">
                                    <span class="input-group-addon">库存：</span>
                                    <input type="text" class="form-control" id="zomoreCommodityStore"
                                           name="zomoreCommodityStore"/>
                                </div>
                            </div>
                        </div>
                        <div class="fben">屏开更多</div>
                        <div class="addgoodshide">
                            <div class="row">
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <span class="input-group-addon">颜色：</span>
                                            <input type="text" class="form-control" id="zomoreCommodityLaber2"
                                                   name="zomoreCommodityLaber2"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">尺码：</span>
                                        <input class="form-control" type="text" value=""
                                               id="zomoreCommodityLaber3" name="zomoreCommodityLaber3"
                                        >
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="form-group">
                                        <div class="input-group">
                                            <span class="input-group-addon">拼音码：</span>
                                            <input type="text" class="form-control" id="zomoreCommodityPingyin"
                                                   name="zomoreCommodityPingyin"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">库存上限：</span>
                                        <input class="vertical-spin form-control" type="text" value=""
                                               id="zomoreCommodityUplimit" name="zomoreCommodityUplimit"
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
                                            <input type="text" class="form-control" id="zomoreCommodityProvide"
                                                   name="zomoreCommodityProvide"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">库存下限：</span>
                                        <input class="vertical-spin form-control" type="text" value=""
                                               id="zomoreCommodityDownlimit" name="zomoreCommodityDownlimit"
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
                                            <input type="text" class="form-control" id="zomoreCommodityProductdate"
                                                   name="zomoreCommodityProductdate" placeholder="2018-08-08"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 col-sm-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">保质期：</span>
                                        <input class="vertical-spin form-control" type="text" value=""
                                               id="zomoreCommodityTime" name="zomoreCommodityTime"
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
                                                   class="form-control tps" name="zomoreCommodityMemberprice"
                                                   id="zomoreCommodityMemberprice"/>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-12 col-lg-12 col-sm-12">
                                    <div class="input-group">
                                        <span class="input-group-addon">商品备注：</span>
                                        <textarea class="form-control" name="zomoreCommodityMeno"
                                                  style="min-height: 100px;"></textarea>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-pink  " data-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-success " id="addCommody"> 确认</button>
                </div>
            </div>
        </div>
    </div>
</form>
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
                        <tr>
                            <td>单品删除</td>
                            <td>Ctrl+D</td>
                        </tr>
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
                        <tr>
                            <td>单品加1</td>
                            <td>+</td>
                        </tr>
                        <tr>
                            <td>单品减1</td>
                            <td>-</td>
                        </tr>
                        <tr>
                            <td>商品报损</td>
                            <td>Ctrl+R</td>
                        </tr>
                       <%-- <tr>
                            <td>订货</td>
                            <td>Ctrl+S</td>
                        </tr>--%>
                        <tr>
                            <td>退货</td>
                            <td>Ctrl+T</td>
                        </tr>
                        <tr>
                            <td>调货</td>
                            <td>Ctrl+Y</td>
                        </tr>
                       <%-- <tr>
                            <td>查看通知</td>
                            <td>F3</td>
                        </tr>--%>
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

<%--消息通知--%>
<%--<div id="winpop">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title">消息提醒</h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="paihao"
                                                               class="btn btn-info">牌号</button> </span>
                        <input type="email"  name="paihao" class="form-control" placeholder="牌号"/>

                    </div>
                </div>
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <span class="input-group-btn"> <button type="button" id="daogou"
                                                               class="btn btn-info">导购员</button></span>
                        &lt;%&ndash;<input type="email" id="guide" name="daogou" class="form-control" placeholder="导购员"/>&ndash;%&gt;
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
</div>--%>
<div id="winpop" style="background: #ebe9e6">
    <div style="padding: 15px; min-height: 16.428571429px;background: linear-gradient(45deg,#13bdce 0,#0094d9 66%,#0094d9 100%);height: 10px">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="tips_pop()"> &times;
        </button>
        <h5 class="modal-title" style="padding-bottom:50px">您有新的消息</h5>
    </div>
    <div style="background: linear-gradient(45deg,#13bdce 0,#0094d9 66%,#0094d9 100%);height: 10px"></div>
    <div class="con" style="background: #fbf9f6;margin-top: 2px" id="xiaoxi" onclick="xiaoxi()">未读信息(1)</div>
</div>

<div id="birthday" style="background: #ebe9e6">
    <div style="padding: 15px; min-height: 16.428571429px;background: linear-gradient(45deg,#13bdce 0,#0094d9 66%,#0094d9 100%);height: 10px">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="tips_pop()"> &times;
        </button>
        <h5 class="modal-title" style="padding-bottom:50px">您有新的消息</h5>
    </div>
    <div style="background: linear-gradient(45deg,#13bdce 0,#0094d9 66%,#0094d9 100%);height: 10px"></div>
    <div class="con" style="background: #fbf9f6;margin-top: 2px" id="birthdayMsg" onclick="birthday()">最近三天有${requestScope.memberbirthdayNum}个会员过生日</div>
</div>

<input type="hidden" id="yincode" value="">
<input type="hidden" id="yinnum" value="">
<input type="hidden" id="yinmoney" value="">
<input type="hidden" id="yinzhekou" value="">

<input type="hidden" id="cashierName" value="${sessionScope.cashierName}">
<input type="hidden" id="items" value="${requestScope.result.items}">
<input type="hidden" id="itemssize" value="${requestScope.result.items.size()}">
<script src="${basePath}js/modal-one.js"></script>
<%--<script type="text/javascript">--%>
    <%--var btn = document.getElementById('btn');--%>
    <%--var content = document.getElementById('content');--%>
    <%--btn.onclick = function(){--%>
        <%--console.log(content);--%>
        <%--fullScreen(content);--%>
    <%--}--%>
    <%--var quite = document.getElementById('quite');--%>
    <%--quite.onclick = function(){--%>
        <%--exitFullScreen();--%>
    <%--}--%>

    <%--function fullScreen(el) {--%>
        <%--var rfs = el.requestFullScreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullScreen,--%>
            <%--wscript;--%>

        <%--if(typeof rfs != "undefined" && rfs) {--%>
            <%--rfs.call(el);--%>
            <%--return;--%>
        <%--}--%>

        <%--if(typeof window.ActiveXObject != "undefined") {--%>
            <%--wscript = new ActiveXObject("WScript.Shell");--%>
            <%--if(wscript) {--%>
                <%--wscript.SendKeys("{F11}");--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>

    <%--function exitFullScreen(el) {--%>
        <%--var el= document,--%>
            <%--cfs = el.cancelFullScreen || el.webkitCancelFullScreen || el.mozCancelFullScreen || el.exitFullScreen,--%>
            <%--wscript;--%>

        <%--if (typeof cfs != "undefined" && cfs) {--%>
            <%--cfs.call(el);--%>
            <%--return;--%>
        <%--}--%>

        <%--if (typeof window.ActiveXObject != "undefined") {--%>
            <%--wscript = new ActiveXObject("WScript.Shell");--%>
            <%--if (wscript != null) {--%>
                <%--wscript.SendKeys("{F11}");--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>
<%--</script>--%>


<script>
    $("#setSystem").on('click',function () {
        var systemsetting = ${sessionScope.zomoreCashierBeforeRight.systemsetting}+"";
        if (systemsetting=='0'){
            $("#searchByCode").focus();
            alert("该收银台没有系统设置的权限");
            return false;
        }
        window.location.href = "${basePath}setting/settingIndex.do";
    });
    $(function () {
        $('#changeNum').editable();
    });

    //交接班控件事件
    $("li[class='col-lg-4 col-md-4 col-sm-4 col-xs-4 num4']").click(function () {
        $("#example-input2-group1").val($("#example-input2-group1").val() + $(this).text());
    });
    $("li[class='col-lg-3 col-md-3 col-sm-3 col-xs-3 num3']").click(function () {
        $("#shangBan").val($("#shangBan").val() + $(this).text());
    });

    $("li[class='col-lg-4 col-md-4 col-sm-4 col-xs-4 numback4']").click(function () {
        var ss = $("#example-input2-group1").val();
        $("#example-input2-group1").val(ss.substring(0, ss.length - 1));
    });
    $("li[class='col-lg-3 col-md-3 col-sm-3 col-xs-3 numback3']").click(function () {
        var ss = $("#shangBan").val();
        $("#shangBan").val(ss.substring(0, ss.length - 1));
    });

    function jiaojieban() {
       var money=$("#example-input2-group1").val();
       if(money==null||money==""){
           alert("金额不能为空");
           return false;
       }else{
           $('#jiaojieban').submit();
       }

    }
    function jiaojieban2() {
        var readycash=$("#shangBan").val();
        if(readycash==null||readycash==""){
            alert("备用金不能为空");
            return false;
        }
        $.ajax({
            type:"post",
            url:"${basePath}zomoreTurnover/saveReadycash.do",
            data:{"readycash":readycash},
            success:function () {

            },
            error:function () {
                alert("输入错误");
                return false;
            }
        })

        $('#closeWork2').modal('hide');
    }

    //退出
    function tuichu() {
        window.location.href = "${basePath}pages/shouyintailogin.jsp";

    }

    //快捷键弹窗
    $("a[class='kuaijiejian']").click(function () {
        $('#kuaijiejian').modal('show');
    });



    //商品打折后价
    var endmoney = $("#realEndmoney").val();
    //商品原总价
    var allmoney = $("#realAllmoney").val();
    $('#searchByCode').focus();
    //点击后院,跳转
    function houyuan() {
        if (parseFloat(endmoney).toFixed(2) > 0) {
            //要做的事情
            var hf = $("#getmoney").attr("title") + "?money=" + parseFloat(endmoney).toFixed(2);
            //拼接销售单据
            //1.会员
            var huiyuan = $("#name").text();
            hf = hf + "&huiyuan=" + huiyuan;

            //商品数量
            var conditynum = "";
            //商品名称
            var condityname = "";
            //实收
            var condrealprice="";
            //折扣
            var discount="";

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

            //5.商品实收 数组（1,1,1）
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

            //6.商品折扣 数组（1,1,1）
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
            //保存销售单据
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/add.do",
                data: {
                    "zomoreCommoditySaleName": $('#cashierName').val(),
                    "zomoreCommoditySaleInmoney": parseFloat(endmoney).toFixed(2),
                    "zomoreCommoditySaleMember": huiyuan,
                    "zomoreCommoditySaleMoney": allmoney,
                    "commoditNum": conditynum,
                    "commoditName": condityname,
                    "condrealprice":condrealprice,
                    "discount":discount
                },
                success: function (msg) {
                    var zomoreMemberNum="";
                    zomoreMemberNum=$("#zomoreMemberNum").val();
                    window.location.href = "${basePath}zomoreServiceCommodity/list1.do?id=" + msg+"&"+"zomoreMemberNum="+zomoreMemberNum;
                }
            });
        } else {
            window.location.href = "${basePath}zomoreServiceCommodity/list1.do";
        }

    }

    var r = 0;
    var allShopNum = $("#realAllShopNum").val();
    //扫码添加商品
    $('#searchByCode').keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            huiche();
        }
    });

    //新增商品弹窗
    $('#zomoreCommodityCode').keydown(function (ev) {
        if (ev.keyCode == 13) {
            $.ajax({
                data:{'commodityCode':$('#zomoreCommodityCode').val()},
                url:'${basePath}zomoreCommodity/getCommodityCode.do',
                success(data){
                    //console.log(data)
                    $('#zomoreCommodityName').val(data.commodity_name)
                    $('#zomoreCommodityOut').val(data.commodity_retailPrice)
                }
            })
        }
    });

    //添加无码商品0000000000001
    $("#WM").keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            var nocodecash = ${sessionScope.zomoreCashierBeforeRight.nocodecash}+"";
            if (nocodecash=='1'){
                alert("该收银台没有无码收银的权限");
                return false;
            }
            var momey = $("#WM").val();
            //修改无码商品的金额
            $.ajax({
                    type: "POST",
                    url: "${basePath}zomoreCommodity/update.do",
                    data: {"id": '0000000000001', "price": momey},
                    success: function (msg) {
                        if (msg !=null) {
                            $('#searchByCode').val(msg);
                            huiche();
                            $("#WM").val("");
                        }
                        if (msg == 'error') {
                            aler("无码商品添加失败");
                        }
                    },
                    error: function () {
                        aler("无码商品添加失败");
                    }
                }
            );
        }
    });
    //总价
    function allmoneyreq(object) {
        /*alert(object);*/
        var req =$("#allmoney").text();
        $.ajax({
            type:"POST",
            url: "${basePath}zomoreCommoditySale/searchByreq.do",
            data:{"req":object},
            success:function(msg){
                alert("发送成功");
            }

        });

    }

    var zekou = 100;

    function huiche() {
        var code = $('#searchByCode').val();
        $("#yincode").val(code);
        //向后台动态获取商品信息，回到前台显示，需要前台做重复处理
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/searchByCode.do",
            data: {"code": code},
            success: function (msg) {
                alert(msg[0].promotionName);
                /*alert(JSON.stringify(msg));*/
                //存在促销活动
                if(msg[0].promotionName!=""){
                    var index1 = 0;
                    var code="";
                    var num="";
                    var nowCode=msg[0].id;
                    var promotionNames=msg[0].promotionName;
                    var index1 = 0;
                    $('#table>tbody>tr>td').each(function () {
                        if (index1 == 0) {
                            code = code + $(this).text() + ",";
                        }
                        if(index1==4){
                            num=num+$(this).text()+",";
                        }
                        index1++;
                        if (index1 == 7) {
                            index1 = 0;
                        }
                    });
                    code=code.substring(0,code.length-1);
                    num=num.substring(0,num.length-1);
                    $.ajax({
                        type:"post",
                        url:"${basePath}zomoreCommodity/searchPromotion.do",
                        data:{"code":code,"nowCode":nowCode,"promotionNames":promotionNames,"num":num},
                        async:false,
                        success:function (msg) {
                            //是否是会员专享
                            if(msg[0].huiyuan!=""){
                                //活动id（商品选择已经符合活动，差会员条件）
                                $("#memberPromotion").val(msg[0].huiyuan);

                            }
                            //满额返现商品
                            if(msg[0].mefxCommodity!=""){
                                $("#mefxCommodity").val(msg[0].mefxCommodity);
                                $("#giveMoney").val(msg[0].giveMoney);
                            }
                            //是否会员折上
                            $("#memberPromotionZekou").val(msg[0].promotionZekou);

                            if(msg[0].promotionName=="梯度优惠"){
                                var money = 0;
                                //获取表格的所有内容行
                                var allTableData = $('#table').bootstrapTable('getData');

                                for( var i=0;i<allTableData.length;i++)
                                {
                                    var flag2 = true;
                                    for(var j=0;j<msg[0].tdCommoditys.length;j++){
                                        if(msg[0].tdCommoditys[j].marketingCommodityCode==allTableData[i].id){
                                            flag2=false;
                                            var dis = Number(msg[0].tdCommoditys[j].marketingCommodityPrice)/Number(msg[0].tdCommoditys[j].marketingCommodityOldprice)*100;
                                            $('#table').bootstrapTable('updateRow', {
                                                index: i,
                                                row: {
                                                    "discount":Number(dis).toFixed(2),
                                                    "newprivice": msg[0].tdCommoditys[j].marketingCommodityPrice, //要更新列的field
                                                    "money": msg[0].tdCommoditys[j].marketingCommodityPrice //要更新列的数据
                                                }
                                            });
                                        }
                                    }
                                    if(flag2){

                                        money +=Number(allTableData[i].money);
                                    }

                                }

                                //新增条码
                                $("#table").bootstrapTable('append', msg);
                                $("#table tbody tr").addClass("DynamicAdd");
                                var name2= msg[0].name;
                                var num2= msg[0].num;
                                var money2 = msg[0].money;
                                var code3 =code;
                                fenpingInsert(name2,num2,money2,code3);

                                allmoney = Number(Number(msg[0].countMoney)+Number(money)).toFixed(2);
                                endmoney = allmoney;
                                //把金额写进收款中(保留两位小数)
                                $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                                //前面追加
                                /*$("#table").bootstrapTable('prepend',msg);*/
                                Member = 0;
                                allShopNum = Number(allShopNum) + 1;
                                $('#allShopNum').text(allShopNum);
                                $('#searchByCode').val("");
                                //准备插表

                                //客显
                                allmoneyreq(parseFloat(allmoney).toFixed(2));
                                //存入本地
                                try{
                                    localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));
                                }catch (e) {
                                    if (isQuotaExceeded(e)) {
                                        console.log("Storage full, maybe notify user or do some clean-up");
                                    }
                                }

                                return false;
                            }
                            //判断是否存在该商品 ，如果存在则修改数量和小计
                            var index3 = 0;
                            //判断是否存在商品的标准
                            var flag = 0;
                            //判断是否存在商品
                            var flag1 = 0;
                            var xianjia = 0;
                            $('#table>tbody>tr>td').each(function () {

                                if (index3 == 0 && msg[0].id == $(this).text()&&msg[0].promotionName!="第二件打折"&&msg[0].promotionName!="梯度优惠2") {
                                    //如果存在商品
                                    flag = 1;
                                }
                                if (index3 == 3 && flag == 1) {

                                    if(zekou==0){
                                        zekou=100;
                                        msg[0].money = 0;
                                        msg[0].newprivice =0;
                                    }else{
                                        zekou=100;
                                    }
                                }

                                //修改数量
                                if (index3 == 4 && flag == 1) {
                                    r = $(this).parent().attr("data-index");
                                    flag1 = 1;
                                    msg[0].num = Number($(this).text()) + Number(msg[0].num);
                                    /*var num2 = Number($(this).text()) + Number(msg[0].num);*/
                                    var num2 = ( Number(msg[0].num));
                                    $("#yinnum").val(num2);
                                    /*  alert("num2:"+num2);
                                      alert("num21:"+Number($(this).text()));
                                      alert("num22:"+Number(msg[0].num));*/
                                    //$(this).text(msg[0].num);
                                }
                                if (index3 == 5 && flag == 1) {
                                    xianjia = Number($(this).text());

                                }
                                //修改小计
                                if (index3 == 6 && flag == 1) {
                                    //判断现价是否经过调整
                                    if (msg[0].newprivice == xianjia || xianjia == null) {//没有调整

                                        msg[0].money = (Number($(this).text()) * 100 / zekou + Number(msg[0].money)).toFixed(2);

                                        var money2 = (Number($(this).text()) * 100 / zekou + Number(msg[0].money)).toFixed(2);
                                        /*alert("money21:"+money2);
                                        alert("money211:"+Number($(this).text()) * 100 / zekou +num2);*/
                                        var num = $("#yinnum").val();
                                        /*alert("money2:"+(Number($(this).text()) * 100 / zekou *num).toFixed(2));*/
                                        $("#yinmoney").val((Number($(this).text()) * 100 / zekou *num).toFixed(2))
                                    } else {//有调整
                                        /*mark2不触发*/
                                        msg[0].money = (Number($(this).text()) * 100 / zekou + Number(xianjia)).toFixed(2);
                                        msg[0].newprivice = xianjia;
                                        /*   var money2 = (Number($(this).text()) * 100 / zekou + Number(xianjia)).toFixed(2);
                                           alert("money22:"+money2);*/
                                    }
                                    /*alert($(this).text(msg[0].money));*/
                                }

                                index3++;
                                if (index3 == 7) {
                                    index3 = 0;
                                    flag = 0;
                                }
                            });
                            /*      $("#table").bootstrapTable('append',msg);
                                  $("#table tbody tr").addClass("DynamicAdd");*/
                            if (flag1 != 0) {
                                //更新数量和小计
                                var _data = {
                                    "num": msg[0].num, //要更新列的field
                                    "money": msg[0].money //要更新列的数据
                                }//更新表格数据
                                /*alert("111");*/

                                /* alert("m&n:"+money2+num2);*/
                                $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                                $("#table tbody tr").addClass("DynamicAdd");
                                fenpingMoneyAndNum($("#yinmoney").val(),$("#yinnum").val());

                            } else {
                                //后面追加
                                $("#table").bootstrapTable('append', msg);
                                $("#table tbody tr").addClass("DynamicAdd");
                                var name1= msg[0].name;
                                var num1 = msg[0].num;
                                var money1 = msg[0].money;
                                var code1 =code;
                                fenpingInsert(name1,num1,money1,code1);
                                /*alert("money1 :"+money1);*/
                                /*localStorage.setItem("allmoneytoFuping",money1);*/

                            }
                            //不能是会员专享
                            if(msg[0].promotionName=="套餐促销"&&msg[0].huiyuan==""){
                                //套餐价
                                allmoney = (Number(allmoney) + Number(msg[0].newprivice)-Number(msg[0].oldPrice)+Number(msg[0].tcPirce)).toFixed(2);
                                endmoney = allmoney;
                            }else{
                                if(msg[0].promotionName=="满额返现"){

                                    if(msg[0].huiyuan2=="1"){//非会员专享

                                        allmoney = (Number(allmoney) + Number(msg[0].newprivice)-Number(msg[0].giveMoney)).toFixed(2);
                                        endmoney = allmoney;
                                    }else {
                                        allmoney = (Number(allmoney) + Number(msg[0].newprivice)).toFixed(2);
                                        endmoney = allmoney;
                                    }
                                }else {
                                    allmoney = (Number(allmoney) + Number(msg[0].newprivice)).toFixed(2);
                                    endmoney = allmoney;
                                }

                            }
                            //把金额写进收款中(保留两位小数)
                            $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                            //前面追加
                            /*$("#table").bootstrapTable('prepend',msg);*/
                            Member = 0;
                            allShopNum = Number(allShopNum) + 1;
                            $('#allShopNum').text(allShopNum);
                            $('#searchByCode').val("");
                            //准备插表
                            //客显
                            allmoneyreq(parseFloat(allmoney).toFixed(2));
                            //存入本地
                            try{
                                localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));
                            }catch (e) {
                                if (isQuotaExceeded(e)) {
                                    console.log("Storage full, maybe notify user or do some clean-up");
                                }
                            }

                        },
                        error:function (msg) {
                            alert("错误");
                        }
                    });

                }else{

                    //判断是否存在该商品 ，如果存在则修改数量和小计
                    var index3 = 0
                    //判断是否存在商品的标准
                    var flag = 0;
                    //判断是否存在商品
                    var flag1 = 0;
                    var xianjia = 0;
                    $('#table>tbody>tr>td').each(function () {

                        if (index3 == 0 && msg[0].id == $(this).text()) {
                            //如果存在商品
                            flag = 1;
                        }
                        if (index3 == 3 && flag == 1) {
                            zekou = 100;
                        }
                        //修改数量
                        if (index3 == 4 && flag == 1) {
                            r = $(this).parent().attr("data-index");
                            flag1 = 1;
                            msg[0].num = Number($(this).text()) + Number(msg[0].num);
                            /*var num2 = Number($(this).text()) + Number(msg[0].num);*/
                            var num2 = ( Number(msg[0].num));
                            $("#yinnum").val(num2);
                            /*  alert("num2:"+num2);
                              alert("num21:"+Number($(this).text()));
                              alert("num22:"+Number(msg[0].num));*/
                            //$(this).text(msg[0].num);
                        }
                        if (index3 == 5 && flag == 1) {
                            xianjia = Number($(this).text());
                        }
                        //修改小计
                        if (index3 == 6 && flag == 1) {
                            //判断现价是否经过调整
                            if (msg[0].newprivice == xianjia || xianjia == null) {//没有调整
                                msg[0].money = (Number($(this).text()) * 100 / zekou + Number(msg[0].money)).toFixed(2);
                                var money2 = (Number($(this).text()) * 100 / zekou + Number(msg[0].money)).toFixed(2);
                                /*alert("money21:"+money2);
                                alert("money211:"+Number($(this).text()) * 100 / zekou +num2);*/
                                var num = $("#yinnum").val();
                                /*alert("money2:"+(Number($(this).text()) * 100 / zekou *num).toFixed(2));*/
                                $("#yinmoney").val((Number($(this).text()) * 100 / zekou *num).toFixed(2))
                            } else {//有调整
                                /*mark2不触发*/
                                msg[0].money = (Number($(this).text()) * 100 / zekou + Number(xianjia)).toFixed(2);
                                msg[0].newprivice = xianjia;
                                /*   var money2 = (Number($(this).text()) * 100 / zekou + Number(xianjia)).toFixed(2);
                                   alert("money22:"+money2);*/
                            }
                            /*alert($(this).text(msg[0].money));*/
                        }

                        index3++;
                        if (index3 == 7) {
                            index3 = 0;
                            flag = 0;
                        }
                    });
                    /*      $("#table").bootstrapTable('append',msg);
                          $("#table tbody tr").addClass("DynamicAdd");*/
                    if (flag1 != 0) {
                        //更新数量和小计
                        var _data = {
                            "num": msg[0].num, //要更新列的field
                            "money": msg[0].money //要更新列的数据
                        }//更新表格数据
                        /*alert("111");*/

                        /* alert("m&n:"+money2+num2);*/
                        $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                        $("#table tbody tr").addClass("DynamicAdd");
                        fenpingMoneyAndNum($("#yinmoney").val(),$("#yinnum").val());

                    } else {
                        //后面追加
                        $("#table").bootstrapTable('append', msg);
                        $("#table tbody tr").addClass("DynamicAdd");
                        var name1= msg[0].name;
                        var num1 = msg[0].num;
                        var money1 = msg[0].money;
                        var code1 =code;
                        fenpingInsert(name1,num1,money1,code1);
                        /*alert("money1 :"+money1);*/
                        /*localStorage.setItem("allmoneytoFuping",money1);*/

                    }
                    allmoney = (Number(allmoney) + Number(msg[0].newprivice)).toFixed(2);
                    endmoney = allmoney;
                    //把金额写进收款中(保留两位小数)
                    $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                    //前面追加
                    /*$("#table").bootstrapTable('prepend',msg);*/
                    Member = 0;
                    allShopNum = Number(allShopNum) + 1;
                    $('#allShopNum').text(allShopNum);
                    $('#searchByCode').val("");
                    //准备插表

                    //客显
                    allmoneyreq(parseFloat(allmoney).toFixed(2));
                    //存入本地
                    try{
                        localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));
                    }catch (e) {
                        if (isQuotaExceeded(e)) {
                            console.log("Storage full, maybe notify user or do some clean-up");
                        }
                    }

                }

                /*mark*/
            },
            error: function () {
                /*   //添加商品

                     if (confirm("该商品不存在，需要新增")) {
                         $('#submit input').each(function () {
                             $(this).val('');
                         });
                         $('#AddGood').modal('show');
                     }*/

                //查询商品

                $('#searchLikeCode').val(code);
                $('#searchLikeCodeTable').bootstrapTable('destroy');
                $('#searchLikeCodeTable').bootstrapTable({
                    url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + code,
                    method: "POST",
                    onClickRow: function (row, $element) {
                        //响应点击事件
                        $('.info').removeClass('info');
                        $($element).addClass('info');
                        $('#searchByCode').val(row.CommodityCode);
                    },
                    onLoadSuccess: function (data) {
                        $("#table tbody tr").addClass("DynamicAdd");
                    }
                })
                $('#GoodSearch').modal('show');

            }
        });
    }

    //标记相同会员只能输入一次会员
    var Member = 0;
    //上一个会员的折扣
    // var old = 1;
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

                    //会员信息
                    //alert(JSON.stringify(msg));
                    //后面追加
                    //$("#table").bootstrapTable('append',msg);
                    $("#name").text(msg.memberMemberidname);
                    $("#money").text(msg.memberBalance);
                    $("#integral").text(msg.memberIntegral);
                    $("#zomoreMemberId").val(msg.memberMemberid);
                    var discount=msg.memberDiscount;

                    //是否是会员专享
                    var memberPromotion=$("#memberPromotion").val();


                    if(memberPromotion!=""){
                        var code="";
                        var index1 = 0;
                        $('#table>tbody>tr>td').each(function () {
                            if (index1 == 0) {
                                code = code + $(this).text() + ",";
                            }
                            index1++;
                            if (index1 == 7) {
                                index1 = 0;
                            }
                        });
                        code=code.substring(0,code.length-1);
                        num = num.substring(0,num.length-1);
                        $.ajax({
                            type:"post",
                            url:"${basePath}zomoreCommodity/getMemberPromotion.do",
                            data:{"code":code,"promotionId":memberPromotion},
                            async:false,
                            success:function (msg2) {
                                if(msg2.name=="搭赠促销"){
                                    var giveCode=msg2.giveCode;
                                    var xj2=0;
                                    var codes =giveCode.split(",");
                                    //是否会员折上折
                                    if(msg2.memberPromotionZekou=='0'){

                                        $('#table>tbody>tr>td').each(function () {
                                            if (index1 == 0) {
                                                for(var i=0;i<codes.length;i++) {
                                                    if (codes[i] == $(this).text()) {
                                                        var xj = $(this).parent().find("td:eq(6)").text();
                                                        xj2=xj2+xj*1;
                                                        $(this).parent().find("td:eq(6)").text("0");
                                                        $(this).parent().find("td:eq(5)").text("0");
                                                        $(this).parent().find("td:eq(3)").text("0");
                                                    }
                                                }
                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });
                                        //修改付款金额
                                        var test = parseFloat(allmoney - xj2 * 1).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;

                                    }else {
                                        var xiaoji2=0;
                                        $('#table>tbody>tr>td').each(function () {
                                            //是否是赠品
                                            var index2 =0;
                                            if (index1 == 0) {
                                                for(var i=0;i<codes.length;i++) {
                                                    if (codes[i] == $(this).text()) {
                                                        index2=1;
                                                        var xj = $(this).parent().find("td:eq(6)").text();
                                                        xj2=xj2*1+xj*1;
                                                        $(this).parent().find("td:eq(6)").text("0");
                                                        $(this).parent().find("td:eq(5)").text("0");
                                                        $(this).parent().find("td:eq(3)").text("0");
                                                    }
                                                }
                                                if(index2==0){
                                                        //折扣
                                                        $(this).parent().find("td:eq(3)").text(discount);
                                                        $("#yinzhekou").val(discount);
                                                        //现价
                                                        //$(this).text($(this).text() / old);
                                                        var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                        $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                        //小计
                                                        //$(this).text($(this).text() / old);
                                                        var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                        var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                        var chajia = xiaoji1*1-xiaoji*1;
                                                        xiaoji2=xiaoji2*1+chajia*1;
                                                        $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                }

                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });
                                        //修改付款金额
                                        var test = parseFloat(allmoney*1 - xj2 * 1-xiaoji2*1).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;
                                    }

                                }

                                if(msg2.name=="套餐促销"){
                                    //是否会员折上折
                                    if(msg2.memberPromotionZekou=='0'){
                                        //修改付款金额
                                        var test = parseFloat(allmoney - Number(msg2.oldPrice)+Number(msg2.tcPirce)).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;
                                    }else {
                                        //根据会员的折扣，修改商品的折扣,现价，小计，收款
                                        var index = 0;
                                        $('#table>tbody>tr>td').each(function () {
                                            //折扣
                                            if (index == 3) {
                                                // $(this).text(old * 100);
                                                var nm = $(this).text() * (discount / 100);
                                                $(this).text(nm);
                                                $("#yinzhekou").val(discount);
                                            }
                                            //现价
                                            if (index == 5) {
                                                //$(this).text($(this).text() / old);
                                                var nm = $(this).text() * (discount / 100);
                                                $(this).text(nm.toFixed(2));
                                            }
                                            //小计
                                            if (index == 6) {
                                                //$(this).text($(this).text() / old);
                                                var nm = $(this).text() * (discount / 100);
                                                $(this).text(nm.toFixed(2));
                                            }
                                            index++;
                                            if (index == 7) {
                                                index = 0;
                                            }
                                        });
                                        old = (discount / 100);
                                        //修改付款金额
                                        var test = parseFloat(allmoney * (discount / 100)).toFixed(2);
                                        //折上折
                                        var test2=parseFloat(test*1-Number(msg2.oldPrice)+Number(msg2.tcPirce)).toFixed(2);

                                        $('#allmoney').text("￥:" + test2);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        /*mark*/

                                        allmoneyreq(test2);
                                        /*alert("test :"+test);*/
                                        localStorage.setItem("allmoneytoFuping",test);
                                        endmoney = test2;

                                    }

                                }
                                if(msg2.name=="第二件打折"){
                                    if(msg2.memberPromotionZekou=='0'){
                                          var haveCode = "";
                                          var xj=0;
                                        $('#table>tbody>tr>td').each(function () {
                                            if (index1 == 0) {
                                                for(var i=0;i<msg2.commodityList.length;i++) {
                                                    if (msg2.commodityList[i].marketingCommodityCode == $(this).text()) {
                                                        if(haveCode!=$(this).text()){
                                                            xj =xj+($(this).parent().find("td:eq(6)").text()*1-Number(msg2.commodityList[i].marketingCommodityPrice));
                                                            $(this).parent().find("td:eq(6)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                            $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                            $(this).parent().find("td:eq(3)").text(msg2.commodityList[i].marketingCommodityDiscount);
                                                            haveCode=$(this).text();
                                                        }

                                                    }
                                                }
                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });
                                        //修改付款金额
                                        var test = parseFloat(allmoney - xj * 1).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;

                                    }else {
                                        var xiaoji3=0;
                                        var haveCode2 = "";
                                        var xj3=0;
                                        $('#table>tbody>tr>td').each(function () {
                                            //是否是打折商品
                                            if (index1 == 0) {
                                                for(var i=0;i<msg2.commodityList.length;i++) {
                                                    if (msg2.commodityList[i].marketingCommodityCode == $(this).text()) {
                                                        if(haveCode2!=$(this).text()) {

                                                            xj3 += ($(this).parent().find("td:eq(6)").text()* 1 - Number(msg2.commodityList[i].marketingCommodityPrice));
                                                            $(this).parent().find("td:eq(6)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                            $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                            $(this).parent().find("td:eq(3)").text(msg2.commodityList[i].marketingCommodityDiscount);
                                                            haveCode2 =$(this).text();
                                                        }
                                                    }
                                                }
                                                    //折扣
                                                     var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(discount);
                                                    //现价
                                                    //$(this).text($(this).text() / old);
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    //$(this).text($(this).text() / old);
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    xiaoji3=xiaoji3*1+chajia*1;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });

                                        //修改付款金额
                                        var test = parseFloat(allmoney*1 - xj3 * 1-xiaoji3*1).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;
                                    }

                                }
                                if(msg2.name=="打折/特价"){
                                    var xj4=0;
                                    if(msg2.memberPromotionZekou=='0'){
                                        $('#table>tbody>tr>td').each(function () {
                                            if (index1 == 0) {
                                                var num=$(this).parent().find("td:eq(4)").text();
                                                for(var i=0;i<msg2.commodityList.length;i++) {
                                                    if (msg2.commodityList[i].marketingCommodityCode == $(this).text()) {

                                                        if(msg2.commodityList[i].marketingCommodityDiscount==null||msg2.commodityList[i].marketingCommodityDiscount==""){
                                                            var discount  = Number(msg2.commodityList[i].marketingCommodityPrice)/$(this).parent().find("td:eq(6)").text();

                                                            $(this).parent().find("td:eq(3)").text(Number(discount).toFixed(2));
                                                        }else {
                                                            $(this).parent().find("td:eq(3)").text(msg2.commodityList[i].marketingCommodityDiscount);
                                                        }
                                                            xj4 =xj4+($(this).parent().find("td:eq(6)").text()*1-Number(msg2.commodityList[i].marketingCommodityPrice)*Number(num));
                                                            $(this).parent().find("td:eq(6)").text(Number(msg2.commodityList[i].marketingCommodityPrice)*Number(num));
                                                            $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                    }
                                                }
                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });
                                        //修改付款金额
                                        var test = parseFloat(allmoney - xj4 * 1).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;

                                    }else{
                                        $('#table>tbody>tr>td').each(function () {
                                            //是否是打折商品
                                            if (index1 == 0) {
                                                var num=$(this).parent().find("td:eq(4)").text();
                                                for(var i=0;i<msg2.commodityList.length;i++) {
                                                    if (msg2.commodityList[i].marketingCommodityCode == $(this).text()) {

                                                        if(msg2.commodityList[i].marketingCommodityDiscount==null||msg2.commodityList[i].marketingCommodityDiscount==""){
                                                            var discount2  = Number(msg2.commodityList[i].marketingCommodityPrice)/$(this).parent().find("td:eq(6)").text();
                                                            $(this).parent().find("td:eq(3)").text(Number(discount2).toFixed(2));
                                                        }else {
                                                            $(this).parent().find("td:eq(3)").text(msg2.commodityList[i].marketingCommodityDiscount);
                                                        }
                                                        xj4 =xj4+($(this).parent().find("td:eq(6)").text()*1-Number(msg2.commodityList[i].marketingCommodityPrice)*Number(num));
                                                        $(this).parent().find("td:eq(6)").text(Number(msg2.commodityList[i].marketingCommodityPrice)*Number(num));
                                                        $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                    }
                                                }

                                                //折扣
                                                var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                $(this).parent().find("td:eq(3)").text(nm);

                                                $("#yinzhekou").val(nm);
                                                //现价
                                                var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                //小计
                                                //$(this).text($(this).text() / old);
                                                var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                var chajia = xiaoji1*1-xiaoji*1;
                                                xj4=xj4+chajia;
                                                $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                            }
                                            index1++;
                                            if (index1 == 7) {
                                                index1 = 0;
                                            }
                                        });
                                        //修改付款金额
                                        var test = parseFloat(allmoney*1 - xj4).toFixed(2);
                                        $('#allmoney').text("￥:" + test);
                                        fenpingOnlyForMoney($("#yinzhekou").val());
                                        endmoney = test;

                                    }

                                }

                                //梯度优惠
                                if(msg2.name=="梯度优惠"){
                                    var chajia5 = 0;
                                   //是否是会员专享
                                    if(msg2.huiyuan=='0'){
                                        //非会员专享,不是折上折，享受等级折扣，不要梯度打折
                                        if(msg2.memberPromotionZekou=='0'){
                                            var index5=0;
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index5==0){

                                                    //折扣
                                                    var nm = discount;
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(discount);
                                                    //销售价
                                                    var xioashou = $(this).parent().find("td:eq(2)").text();
                                                    //现价
                                                    //$(this).text($(this).text() / old);
                                                    var xj = Number(xioashou) * (discount/100);

                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //数量
                                                    var num=$(this).parent().find("td:eq(4)").text();
                                                    //小计
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = Number(xj)*num;
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    chajia5=chajia5+chajia;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                            }
                                                index5++;
                                                if(index5==7){
                                                    index5=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia5).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;


                                        }//折上折
                                        else{
                                            var indexb = 0;
                                            $('#table>tbody>tr>td').each(function () {
                                                if(indexb==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(Number(nm));

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    chajia5=chajia5+chajia;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                }
                                                indexb++;
                                                if(indexb==7){
                                                    indexb=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia5).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;
                                        }
                                    }else{
                                        //会员专享，不是折上折，算等级折扣
                                        if(msg2.memberPromotionZekou=='0'){
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index5==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(nm);

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    chajia5=chajia5+chajia;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                }
                                                index5++;
                                                if(index5==7){
                                                    index5=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia5).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;

                                        }else{//会员专享，折上折

                                            if(msg2.memberPromotionZekou=='1'){
                                                var indexc=0;
                                                var count=0;
                                                $('#table>tbody>tr>td').each(function () {
                                                    if(indexc==0){
                                                        var have =0;
                                                        for(var i=0;i<msg2.commodityList.length;i++){
                                                            if($(this).text()==msg2.commodityList[i].marketingCommodityCode){
                                                                have=1;

                                                                var dis = Number(msg2.commodityList[i].marketingCommodityPrice)/Number(msg2.commodityList[i].marketingCommodityOldprice)*100

                                                                $(this).parent().find("td:eq(3)").text(dis.toFixed(2));
                                                                $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                                $(this).parent().find("td:eq(6)").text(msg2.commodityList[i].marketingCommodityPrice);
                                                                msg2.commodityList[i].marketingCommodityCode="0";

                                                            }
                                                        }
                                                        if(have==0){
                                                            count += Number($(this).parent().find("td:eq(6)").text());

                                                        }
                                                        //折上折
                                                        var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                        $(this).parent().find("td:eq(3)").text(nm);

                                                        $("#yinzhekou").val(Number(nm));

                                                        //现价
                                                        var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                        $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                        //小计
                                                        var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                        var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                        var chajia = xiaoji1*1-xiaoji*1;
                                                        chajia5=chajia5+chajia;
                                                        $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                    }
                                                    indexc++;
                                                    if(indexc==7){
                                                        indexc=0;
                                                    }
                                                });


                                                //修改付款金额
                                                var test5 = parseFloat(msg2.countMoney*1+count-chajia5).toFixed(2);
                                                $('#allmoney').text("￥:" + test5);
                                                fenpingOnlyForMoney($("#yinzhekou").val());
                                                endmoney = test5;
                                            }

                                        }

                                    }

                                }
                                //已经是符合了活动的
                                if(msg2.name=="换购促销"){
                                    var chajia6=0;
                                    var index6=0;
                                    //不是会员专享
                                    if(msg2.huiyuan=='0'){
                                        //没有折上折，则享受等级折扣
                                        if(msg2.memberPromotionZekou=='0'){
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index6==0){
                                                    //折扣
                                                    var nm = discount;
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(discount);
                                                    //销售价
                                                    var xioashou = $(this).parent().find("td:eq(2)").text();
                                                    //现价
                                                    //$(this).text($(this).text() / old);
                                                    var xj = Number(xioashou) * Number(discount)/100;

                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //数量
                                                    var num=$(this).parent().find("td:eq(4)").text();
                                                    //小计
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = Number(xj)*num;
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    chajia6=chajia6+chajia;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                }
                                                index6++;
                                                if(index6==7){
                                                    index6=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia6).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;

                                        }else{//会员折上折
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index6==0){
                                                    //折扣
                                                    var hgdis = Number($(this).parent().find("td:eq(3)").text())/100;
                                                    //是换购的商品不打折
                                                    if(hgdis==1){
                                                        var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                        $(this).parent().find("td:eq(3)").text(nm);

                                                        $("#yinzhekou").val(Number(nm));

                                                        //现价
                                                        var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                        $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                        //小计
                                                        var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                        var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                        var chajia = xiaoji1*1-xiaoji*1;
                                                        chajia6=chajia6+chajia;
                                                        $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                    }

                                                }
                                                index6++;
                                                if(index6==7){
                                                    index6=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia6).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;

                                        }

                                    }else{//会员专享
                                        //没有折上折，则享受等级折扣
                                        if(msg2.memberPromotionZekou=='0'){
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index6==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(nm);

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                    var chajia = xiaoji1*1-xiaoji*1;
                                                    chajia6=chajia6+chajia;
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                }
                                                index6++;
                                                if(index6==7){
                                                    index6=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*1 - chajia6).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;
                                        }else {//会员专享，折上折

                                            var hgchajia = 0;
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index6==0){
                                                    for(var i=0;i<msg2.commodityList.length;i++){
                                                        if($(this).text()==msg2.commodityList[i].commodityCode){

                                                            var dis = Number(msg2.commodityList[i].submoney)/Number(msg2.commodityList[i].commodityPrice)*100;

                                                            $(this).parent().find("td:eq(3)").text(dis.toFixed(2));
                                                            $(this).parent().find("td:eq(5)").text(msg2.commodityList[i].submoney);//现价
                                                            var num= $(this).parent().find("td:eq(4)").text();
                                                            var hgchajia2 = $(this).parent().find("td:eq(6)").text();
                                                            hgchajia = hgchajia +(Number(hgchajia2)-msg2.commodityList[i].submoney*Number(num));//原来减去现在的
                                                            $(this).parent().find("td:eq(6)").text(msg2.commodityList[i].submoney*Number(num));
                                                            msg2.commodityList[i].commodityCode="0";
                                                        }
                                                    }
                                                    //折上折
                                                    var hgdis2 = Number($(this).parent().find("td:eq(3)").text())/100;
                                                    //是换购的商品不打折
                                                    if(hgdis2==1){
                                                        var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                        $(this).parent().find("td:eq(3)").text(nm);

                                                        $("#yinzhekou").val(Number(nm));

                                                        //现价
                                                        var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                        $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                        //小计
                                                        var xiaoji1=$(this).parent().find("td:eq(6)").text()*1;
                                                        var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                        var chajia = xiaoji1*1-xiaoji*1;
                                                        chajia6=chajia6+chajia;
                                                        $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                    }


                                                }
                                                index6++;
                                                if(index6==7){
                                                    index6=0;
                                                }
                                            });

                                            //修改付款金额
                                            var test6 = parseFloat(allmoney*1 - chajia6-hgchajia).toFixed(2);
                                            $('#allmoney').text("￥:" + test6);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test6;

                                        }

                                    }

                                }
                                if(msg2.name=="满额返现"){
                                    var index7 = 0;
                                    var chajia7 = 0;
                                    //不是会员专享
                                    if(msg2.huiyuan=='0'){
                                        //是不是折上折,就是等级打折价
                                        if(msg2.memberPromotionZekou=='0') {
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index7==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(nm);

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100);
                                                    chajia7=chajia7+xiaoji*1
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));

                                                }
                                                index7++;
                                                if(index7==7){
                                                    index7=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(chajia7).toFixed(2);
                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;
                                        }else{//会员折上折
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index7==0){
                                                        //折扣
                                                        var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                        $(this).parent().find("td:eq(3)").text(nm);

                                                        $("#yinzhekou").val(Number(nm));

                                                        //现价
                                                        var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                        $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                        //小计
                                                        var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100)
                                                        $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                }
                                                index7++;
                                                if(index7==7){
                                                    index7=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*discount/100).toFixed(2);

                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;
                                        }

                                    }else {//会员专享
                                        if(msg2.memberPromotionZekou=='0') {//不是折上折,等级折扣
                                            $('#table>tbody>tr>td').each(function () {
                                                if(index7==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(Number(nm));

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100)
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                }
                                                index7++;
                                                if(index7==7){
                                                    index7=0;
                                                }

                                            });
                                            //修改付款金额
                                            var test = parseFloat(allmoney*discount/100).toFixed(2);

                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;

                                        }else{//会员专享，折上折

                                            $('#table>tbody>tr>td').each(function () {
                                                if(index7==0){
                                                    //折扣
                                                    var nm = $(this).parent().find("td:eq(3)").text() * (discount / 100);
                                                    $(this).parent().find("td:eq(3)").text(nm);

                                                    $("#yinzhekou").val(Number(nm));

                                                    //现价
                                                    var xj = $(this).parent().find("td:eq(5)").text() * (discount/100);
                                                    $(this).parent().find("td:eq(5)").text(xj.toFixed(2));
                                                    //小计
                                                    var xiaoji = $(this).parent().find("td:eq(6)").text() * (discount/100)
                                                    $(this).parent().find("td:eq(6)").text(xiaoji.toFixed(2));
                                                }
                                                index7++;
                                                if(index7==7){
                                                    index7=0;
                                                }

                                            });

                                            //修改付款金额
                                            var test = parseFloat((allmoney*1-msg2.givemoney)*discount/100).toFixed(2);

                                            $('#allmoney').text("￥:" + test);
                                            fenpingOnlyForMoney($("#yinzhekou").val());
                                            endmoney = test;

                                        }


                                    }

                                }


                            },
                            error:function () {
                                alert("错误");
                            }
                        });

                    }else{
                        //折上折只有符合了促销活动才有
                        var memberPromotionZekou = $("#memberPromotionZekou").val();

                            if(memberPromotionZekou!=""){

                                if(memberPromotionZekou=="0"){
                                        //不打折,不变
                                     }else if(memberPromotionZekou=="1"){
                                    //打折
                                //根据会员的折扣，修改商品的折扣,现价，小计，收款
                                        var index = 0;
                                     $('#table>tbody>tr>td').each(function () {
                                    //折扣
                                    if (index == 3) {
                                        // $(this).text(old * 100);
                                        var nm = $(this).text() * (msg.memberDiscount / 100);
                                        $(this).text(nm);
                                        $("#yinzhekou").val(msg.memberDiscount);
                                    }
                                    //现价
                                    if (index == 5) {
                                        //$(this).text($(this).text() / old);
                                        var nm = $(this).text() * (msg.memberDiscount / 100);
                                        $(this).text(nm.toFixed(2));
                                    }
                                    //小计
                                    if (index == 6) {
                                        //$(this).text($(this).text() / old);
                                        var nm = $(this).text() * (msg.memberDiscount / 100);
                                        $(this).text(nm.toFixed(2));
                                    }
                                    index++;
                                    if (index == 7) {
                                        index = 0;
                                    }
                                });
                                old = (msg.memberDiscount / 100);

                                //修改付款金额
                                var test = parseFloat(allmoney * (msg.memberDiscount / 100)).toFixed(2);
                                $('#allmoney').text("￥:" + test);
                                fenpingOnlyForMoney($("#yinzhekou").val());
                                /*mark*/

                                allmoneyreq(test);
                                /*alert("test :"+test);*/
                                localStorage.setItem("allmoneytoFuping",test);

                                endmoney = test;

                            }

                        }else {
                            //根据会员的折扣，修改商品的折扣,现价，小计，收款
                            var index = 0;
                            $('#table>tbody>tr>td').each(function () {
                                //折扣
                                if (index == 3) {
                                    // $(this).text(old * 100);
                                    $(this).text(msg.memberDiscount);
                                    $("#yinzhekou").val(msg.memberDiscount);
                                }
                                //现价
                                if (index == 5) {
                                    //$(this).text($(this).text() / old);
                                    var nm = $(this).text() * (msg.memberDiscount / 100);
                                    $(this).text(nm.toFixed(2));
                                }
                                //小计
                                if (index == 6) {
                                    //$(this).text($(this).text() / old);
                                    var nm = $(this).text() * (msg.memberDiscount / 100);
                                    $(this).text(nm.toFixed(2));
                                }
                                index++;
                                if (index == 7) {
                                    index = 0;
                                }
                            });
                            old = (msg.memberDiscount / 100);
                            //修改付款金额
                            var test = parseFloat(allmoney * (msg.memberDiscount / 100)).toFixed(2);
                            $('#allmoney').text("￥:" + test);
                            fenpingOnlyForMoney($("#yinzhekou").val());
                            /*mark*/

                            allmoneyreq(test);
                            /*alert("test :"+test);*/
                            localStorage.setItem("allmoneytoFuping",test);

                            endmoney = test;

                        }

                    }

                } else {
                    $('#serchUser').val(num);
                    userback(num);
                }
                var target = msg.memberMemberidname;//张三
                /*  alert(msg.memberBalance);
                  alert(msg.memberIntegral);*/
                try {
                    /*alert(msg.memberBalance);*/
                    localStorage.setItem("memberName",target);
                    localStorage.setItem("memberBalance",msg.memberBalance);
                    localStorage.setItem("memberIntegral",msg.memberIntegral);
                }catch (e) {
                    if (isQuotaExceeded(e)) {
                        console.log("Storage full, maybe notify user or do some clean-up");
                    }
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


    /*   键盘快捷键响应*/
    document.onkeydown = function (event) {
        var e = event || window.event || arguments.callee.caller.arguments[0];
        //按空格键触发(spaces)
        if (e && e.keyCode == 32) { // 按 空格键
            if (parseFloat(endmoney).toFixed(2) > 0) {
                var cancash="";
                cancash = ${sessionScope.zomoreCashierBeforeRight.cancash};
                if(cancash=='0'){
                    alert("该收银台没有收银的权限");
                    return false;
                }
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
                //保存销售单据
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
                        "discount":discount
                    },
                    success: function (msg) {
                        window.location.href = hf + "&id=" + msg + "&tk=0";
                    }
                });

            }
        }

        //挂单(Ctrl+G)
        if (e.keyCode == 71 && e.ctrlKey) {
            if (parseFloat(endmoney).toFixed(2) > 0) {
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
        //单品删除（ctrl+D）
        if(e.keyCode == 68 && e.ctrlKey){
            Deleted();
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
        //查看会员资料（f9）
        if(e && e.keyCode ==120){
            var zomoreMemberId=$("#zomoreMemberId").val();
            if (zomoreMemberId!==""&&zomoreMemberId!=null) {
                window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num="+ $("#zomoreMemberNum").val();
            } else {
                alert("请先查询会员!^-^!");
            }

        }
        //积分兑换(ctrl+j)
        if (e.keyCode == 74 && e.ctrlKey) {
            var zomoreMemberId=$("#zomoreMemberId").val();
            if (zomoreMemberId!==""&&zomoreMemberId!=null) {
                window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
            } else {
                alert("请查询会员!^-^!");
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

    //点击收款
    $('#getmoney').click(function () {
        if (parseFloat(endmoney).toFixed(2) > 0) {
            var cancash="";
            cancash = ${sessionScope.zomoreCashierBeforeRight.cancash};
            if(cancash=='0'){
                alert("该收银台没有收银的权限");
                return false;
            }
            //商品数量
            var conditynum = "";
            //商品名称
            var condityname = "";
            //实收
            var condrealprice="";
            //折扣
            var discount="";
            var hf = $(this).attr("name") + "?money=" + parseFloat(endmoney).toFixed(2);
            //拼接销售单据
            //1.会员
            var huiyuan = $("#name").text();
            //会员余额
            var yuer = $('#money').text();
            //会员积分
            var jifen =$('#integral').text();
            //会员号
            var memberNum = $("#zomoreMemberNum").val();

            hf = hf + "&huiyuan=" + huiyuan + "&yuer=" + yuer+ "&jifen=" + jifen + "&memberNum=" + memberNum;
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
            //  hf=hf+"&condityname="+condityname;
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
            //hf=hf+"&conditynum="+conditynum;


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


            //保存销售单据
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreCommoditySale/add.do",
                data: {
                    "zomoreCommoditySaleName": $('#cashierName').val(),
                    "zomoreCommoditySaleInmoney": parseFloat(endmoney).toFixed(2),
                    "zomoreCommoditySaleMember": huiyuan,
                    "zomoreCommoditySaleMoney": allmoney,
                    "commoditNum": conditynum,
                    "commoditName": condityname,
                    "condrealprice":condrealprice,
                    "discount":discount
                },
                success: function (msg) {
                    window.location.href = hf + "&id=" + msg + "&tk=0";
                },
                error:function (jqXHR, textStatus, errorThrown) {
                    alert("单据异常");
                }
            });
        }
        //$(this).attr("href",hf);
    });

    $('.modal3').on('click', function () {
        modelalert('你没有无码收银的权限');
    })

    $('.modal1').on('click', function () {
        modalOne('商品关键字', '输入关键字', sureback);
    })
    $('.jqb').on('click', function () {
        modelJjb('确认交班', closework);
    })

    // 出现交接班窗口
    function closework2() {
        console.log("我要交接班");
        $('#closeWork2').modal('show');
    }

    // 出现交接班窗口
    function closework() {
        console.log("我要交接班");
        $('#closeWork').modal('show');
    }

    $('.modal4').on('click', function () {
        alert("123");
        var bandaddmember = ${sessionScope.zomoreCashierBeforeRight.bandaddmember}+"";
        if (bandaddmember=='1'){
            alert("该收银台没有新增会员的权限");
            return false;
        }
        window.location.href = "${basePath}zomoreMember/insertMember.do"
    });

    /*  $('.modal4').on('click', function () {
          modalOne('会员关键字', '输入会员/手机号', userback);
      })*/


    function sureback(id) {
        if (id == '' || id == undefined) {
            modelalert('请输入值');
        } else {
            console.log("执行下一个");
            $('#searchLikeCode').val(id);
            $('#searchLikeCodeTable').bootstrapTable('destroy');
            $('#searchLikeCodeTable').bootstrapTable({
                url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + id,
                method: "POST",
                onClickRow: function (row, $element) {
                    //响应点击事件
                    $('.info').removeClass('info');
                    $($element).addClass('info');
                    $('#searchByCode').val(row.CommodityCode);
                },
                onLoadSuccess: function (data) {
                    $("#searchLikeCodeTable tbody tr").addClass("DynamicAdd");
                }
            })
            modalclose(id);
            $('#GoodSearch').modal('show');
        }
    };

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
                    //不选会员直接确认的，默认第一个
                    if(data!=null&&data.length>0){
                        $('#zomoreMemberNum').val(data[0].memberNumber);
                    }
                    $("#usertable tbody tr").addClass("DynamicAdd");
                }
            });
            // modalclose(id);
            $('#UserSearch').modal('show');
        }
    };
    // 些处新增会员页面
    $('.adduser').on('click', function () {
        modalOne('会员关键字', '输入会员/手机号', adduser);
    })

    function adduser(id) {
        window.location.href = "${basePath}reception/adduser.jsp?num=" + id;
    }

    //全部删除，清空
    function fenpingDelAll(){
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingDelAll.do",

            success: function (msg) {
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });

    }
    var blank = 0;
    //编辑表格
    $(function () {
        $('#table').bootstrapTable({
            onClickRow: function (row, $element) {
                $('.info').removeClass('info');
                $($element).addClass('info');
                var aa = $element.children().eq(6);
                //现价
                var xj = $element.children().eq(5).text();
                //原来的小计
                var yxiaojie = aa.text();
                //原价
                var yuanjia = $element.children().eq(2).text();

                var discount = $element.children().eq(3).text();
                //原来数量
                var ylsl = $element.children().eq(4).text();

                r = $element.attr("data-index");
                //修改单价权限
                var onechangeprice = ${sessionScope.zomoreCashierBeforeRight.onechangeprice}+"";
                blank++;
                //修改数量
                $($element).children().eq(4).editable({
                    type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
                    title: "num",              //编辑框的标题
                    disabled: false,             //是否禁用编辑
                    emptytext: "1",          //空值的默认文本
                    mode: "inline",              //编辑框的模式：支持popup和inline两种模式，默认是popup
                    showbuttons: false,
                    onblur: 'submit',
                    validate: function (value) { //字段验证
                        blank = 0;
                        if (!$.trim(value)) {
                            return '不能为空';
                        }
                        if ($.trim(value)) {
                            //修改小计和收款
                            var xiaojie = Number(Number(value) * Number(xj)).toFixed(2);
                            //aa.text(xiaojie);
                            var cy = xiaojie - Number(yxiaojie);
                            endmoney = Number(endmoney) + Number(cy);
                            allmoney = endmoney;
                            $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                            /*mark*/
                            allmoneyreq( parseFloat(allmoney).toFixed(2));
                            localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));
                            //修改总件数
                            allShopNum = Number(allShopNum) + Number(value) - Number(ylsl);
                            $('#allShopNum').text(allShopNum);
                            /*mark2*//*开始插表*/
                            var money2 = xiaojie;
                            var num2 = value;
                            fenpingMoneyAndNum(money2,num2);

                            //更新数量和小计
                            var _data = {
                                "newprivice": xj,
                                "discount":discount,
                                "num": value, //要更新列的field
                                "money": xiaojie //要更新列的数据

                            };
                            //更新表格数据
                            $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                            $("#table tbody tr").addClass("DynamicAdd");
                        }
                    }
                });

                //修改单价的权限
                if (onechangeprice=='1'){
                    $($element).children().eq(5).editable({
                        type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
                        title: "num",              //编辑框的标题
                        disabled: false,             //是否禁用编辑
                        emptytext: "1",          //空值的默认文本
                        mode: "inline",              //编辑框的模式：支持popup和inline两种模式，默认是popup
                        showbuttons: false,
                        onblur: 'submit',
                        validate: function (value) { //字段验证
                            blank = 0;
                            if (!$.trim(value)) {
                                return '不能为空';
                            }
                            if ($.trim(value)) {
                                //修改小计和收款
                                var xiaojie = Number(Number(value) * Number(ylsl)).toFixed(2);
                                //修改折扣
                                var discount2  = Number(Number(value)/Number(yuanjia)*100).toFixed(2);
                                //aa.text(xiaojie);
                                var cy = Number(yxiaojie) - xiaojie;
                                endmoney = Number(endmoney) - Number(cy);
                                allmoney = endmoney;
                                $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                                //更新数量和小计
                                fenpingOnlyForMoney(allmoney);
                                allmoneyreq( parseFloat(allmoney).toFixed(2));
                                localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));

                                var _data = {
                                    "newprivice": value, //要更新列的field
                                    "money": xiaojie, //要更新列的数据
                                    "discount":discount2
                                }//更新表格数据
                                $('#table').bootstrapTable('updateRow', {index: r, row: _data});
                                $("#table tbody tr").addClass("DynamicAdd");
                            }
                        }
                    });
                }
                if (onechangeprice=='0'&&blank>2){
                        alert("该收银台没有单品改价的权限");
                        blank=0;
                        return false;
                }
            },
            onLoadSuccess: function (data) {

                $("#table tbody tr").addClass("DynamicAdd");
            },
            success: function () {

            }
        })
    });


    //整单删除
    function DeletedAll() {
        $("#table").bootstrapTable('removeAll');
        endmoney = 0;
        allmoney = 0;
        conditynum = "";
        condityname = "";
        $('#allShopNum').text(0);
        allShopNum = 0
        //修改显示的收款金额
        $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
        localStorage.setItem("allmoneytoFuping",parseFloat(endmoney).toFixed(2));
        /*mark2*//*开始插表*/
        fenpingDelAll();

    }

    function addOne(){
        var rows = $('.info').attr("data-index");
        var aaa = "data-index='" + rows + "'";
        //获取选择行的id
        var id = $('tr[' + aaa + ']');
        var num=$(id).children("td:eq(4)").text() * 1+1;
        $(id).children("td:eq(4)").text(num);

        allShopNum = $('#allShopNum').text() * 1 +1;
        $('#allShopNum').text(allShopNum);

        //修改金额
        var addmoney=$(id).children("td:eq(5)").text()*1;

        var num6=$(id).children("td:eq(6)").text()*1+addmoney;
        $(id).children("td:eq(6)").text(num6);

        endmoney = parseFloat(endmoney).toFixed(2)*1 + parseFloat(addmoney).toFixed(2)*1;
        allmoney = parseFloat(allmoney).toFixed(2)*1 + $(id).children("td:eq(2)").text()*1;

        //修改显示的收款金额
        $('#allmoney').text("￥:" + parseFloat(endmoney).toFixed(2));
        localStorage.setItem("allmoneytoFuping",parseFloat(endmoney).toFixed(2));
    }

    function deleteOne(){
        var rows = $('.info').attr("data-index");
        var aaa = "data-index='" + rows + "'";
        //获取选择行的id
        var id = $('tr[' + aaa + ']');
        if($(id).children("td:eq(4)").text() * 1<2){
            alert("商品数量不能小于1");
        }
        else{
            var num=$(id).children("td:eq(4)").text() * 1-1;
            $(id).children("td:eq(4)").text(num);

            allShopNum = $('#allShopNum').text() * 1 -1;
            $('#allShopNum').text(allShopNum);

            //修改金额
            var addmoney=$(id).children("td:eq(5)").text()*1;

            var num6=$(id).children("td:eq(6)").text()*1-addmoney;
            $(id).children("td:eq(6)").text(num6);

            endmoney = parseFloat(endmoney).toFixed(2)*1 - parseFloat(addmoney).toFixed(2)*1;
            allmoney = parseFloat(allmoney).toFixed(2)*1 - $(id).children("td:eq(2)").text()*1;

            //修改显示的收款金额
            $('#allmoney').text("￥:" + parseFloat(endmoney).toFixed(2));
            localStorage.setItem("allmoneytoFuping",parseFloat(endmoney).toFixed(2));
        }

    }

    //删除
    function Deleted() {
        var rows = $('.info').attr("data-index");
        var aaa = "data-index='" + rows + "'";
        //获取选择行的id
        var id = $('tr[' + aaa + ']');
        var ids = [];//定义一个数组
        ids.push($(id).children("td:first-child").html());//将要删除的id存入数组
        $("#table").bootstrapTable('remove', {field: 'id', values: ids});//field:根据field的值来判断要删除的行  values：删除行所对应的值
        allShopNum = $('#allShopNum').text() * 1 - $(id).children("td:eq(4)").text() * 1;
        $('#allShopNum').text(allShopNum);
        //定义你自己的修改事件
        //修改金额
        var lessmoney = $(id).children("td:eq(6)").text();
        endmoney = endmoney - lessmoney;
        allmoney = allmoney - lessmoney;

        //修改显示的收款金额
        $('#allmoney').text("￥:" + parseFloat(endmoney).toFixed(2));
        localStorage.setItem("allmoneytoFuping",parseFloat(endmoney).toFixed(2));
        //修改订单商品(*未完成)
        //conditynum
        //condityname
        /*alert("1111");*/
        var id2 = $(id).children("td:first-child").html();
        /*alert("id2:"+id2);*/
        fenpingDelOne(id2);
        conditynum.del(row);

        //修改订单商品(*未完成)
        //conditynum
        //condityname
        conditynum.del(row);
        $("#table tbody tr").addClass("DynamicAdd");

    }

    //取商品，两秒交互
    function fenpingGetMsg(){
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingGetMsg.do",

            success: function (msg) {
                /* alert("进来了");*/
            }
        });
    }
    //插入单据中间表
    function fenpingInsert(name1,num1,money1,code1) {
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingInsert.do",
            data: {"name": name1,"num":num1,"money":money1,"code":code1},
            success: function (msg) {
                /* alert("进来了");*/
                /*alert("5ge8");*/
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });
    }
    //更新字段
    function fenpingUpdate(name1,num1,money1,code1) {
        var code1 = $('#yincode').val();
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingUpdate.do",
            data: {"name": name1,"num":num1,"money":money1,"code":code1},
            success: function (msg) {
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });
    }
    //更新小计
    function fenpingOnlyForMoney(test) {
        var code1 = $('#yincode').val();
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingOnlyForMoney.do",
            data: {"zhekou": test,"code":code1},
            success: function (msg) {
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });

    }
    //鼠标更改和插入新数据
    function  fenpingMoneyAndNum(money2,num2) {
        var code1 =  $('#yincode').val();
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingMoneyAndNum.do",
            data: {"money": money2,"num":num2,"code":code1},
            success: function (msg) {
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });
    }
    //删除一个
    function fenpingDelOne(id){
        /* var code1 =  $('#yincode').val();*/
        var code = id;
        /* alert("111");
         alert(code);*/
        $.ajax({
            type: "POST",
            url: "${basePath}fuping/fenpingDelOne.do",
            data: {"code":code},
            success: function (msg) {
                fenpingGetMsg();
            },
            error:function(msg){
                fenpingGetMsg();
            }
        });

    }



    $(document).ready(function () {
        var menu = new BootstrapMenu('.DynamicAdd', {
            fetchElementData: function ($rowElem) {
                var data = $($rowElem).attr('data-index');

                return data;
            },

            actionsGroups: [

                ['editDescription'],
                ['deleteRow']

            ],

            actions: {
                addDescription: {
                    name: '<font size=3>详细</font>',
                    iconClass: 'fa-plus',
                    onClick: function (row) {
                        alert(row);//添加右击事件

                        //定义你自己的添加事件
                    },
                    isEnabled: function (row) {
                        return row.isEditable;
                    }
                },
                editDescription: {
                    name: '<font size=3>删除</font>',
                    iconClass: 'fa-trash',
                    onClick: function (row) {   //修改右击事件
                        //alert(row);
                        var aaa = "data-index='" + row + "'";
                        //获取选择行的id
                        var id = $('tr[' + aaa + ']');
                        var ids = [];//定义一个数组
                        ids.push($(id).children("td:first-child").html());//将要删除的id存入数组
                        allShopNum = $('#allShopNum').text() * 1 - $(id).children("td:eq(4)").text() * 1;
                        $('#allShopNum').text(allShopNum);
                        /*$('#allShopNum').text( $('#allShopNum').text()*1-$(id).children("td:eq(4)").text()*1);
                        */
                        $("#table").bootstrapTable('remove', {field: 'id', values: ids});//field:根据field的值来判断要删除的行  values：删除行所对应的值
                        //定义你自己的修改事件
                        //修改金额
                        var lessmoney = $(id).children("td:eq(6)").text();
                        endmoney = endmoney - lessmoney;
                        allmoney = allmoney - lessmoney;
                        //修改显示的收款金额
                        $('#allmoney').text("￥:" + parseFloat(endmoney).toFixed(2));
                        var id3 = $(id).children("td:first-child").html();
                        /* alert("111");*/
                        /* alert("id3"+id3);*/
                        fenpingDelOne(id3);
                        allmoneyreq(parseFloat(endmoney).toFixed(2));
                        localStorage.setItem("allmoneytoFuping",parseFloat(endmoney).toFixed(2));

                        //修改订单商品(*未完成)
                        //conditynum
                        // condityname
                        conditynum.del(row);
                        $("#table tbody tr").addClass("DynamicAdd");
                    },
                    isEnabled: function (row) {
                        return row.isEditable;
                    }
                },

                deleteRow: {
                    name: '<font size=3>清空</font>',
                    iconClass: 'fa-trash',
                    onClick: function (row) {  //删除右击事件
                        // alert(row);
                        //定义你自己的删除事件
                        $("#table").bootstrapTable('removeAll');
                        endmoney = 0;
                        allmoney = 0;
                        conditynum = "";
                        condityname = "";
                        $('#allShopNum').text(0);
                        allShopNum = 0;
                        //修改显示的收款金额
                        $('#allmoney').text("￥:" + parseFloat(allmoney).toFixed(2));
                        fenpingDelAll();
                        allmoneyreq(parseFloat(allmoney).toFixed(2));
                        localStorage.setItem("allmoneytoFuping",parseFloat(allmoney).toFixed(2));

                    },
                    isEnabled: function (row) {
                        return row.isEditable && row.isRemovable;
                    }
                }
            }
        });
    });


    //点击添加商品
    $('.add').on('click', function () {
        $('#AddGood').modal('show');
    })
    //确定添加商品
    $('#addCommody').click(function () {
        var data = $('#submit').serializeArray();
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreCommodity/add1.do",
            data: data,
            success: function (msg) {
                $('#AddGood').modal('hide');
                $('#submit input').val("");
            }
        });
    });
    //生成编号
    $('#createId').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreServiceCommodity/getId.do",
            success: function (msg) {
                $('#zomoreCommodityCode').val(msg);
            }
        });
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
    //查询商品
    $('#searchLikeCode1').click(function () {
        searchCondity();
    });
    //回车查询商品
    $('#searchLikeCode').keydown(function (e) {
        if (e.keyCode == 13) {//处理回车事件
            searchCondity()
        }
    });

    function searchCondity() {
        var likecode = $('#searchLikeCode').val();
        $('#searchLikeCodeTable').bootstrapTable('destroy');
        $('#searchLikeCodeTable').bootstrapTable({
            url: "${basePath}zomoreCommodity/searchLikeCode.do?code=" + likecode,
            method: "POST",
            onClickRow: function (row, $element) {
                //响应点击事件
                $('.info').removeClass('info');
                $($element).addClass('info');
                $('#searchByCode').val(row.CommodityCode);
            },
            onLoadSuccess: function (data) {
                $("#table tbody tr").addClass("DynamicAdd");
            }
        })

    }

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

    //加入商品
    $('#inputCommodity').click(function () {
        huiche();
        $('#GoodSearch').modal('hide');
    });
    setTimeout("StoreWarmming()", 100);

    //库存预警
    function StoreWarmming() {
        if ($('#items').val() != '') {
            var msg = "您有" + $('#itemssize').val() + "件商品库存不足，马上进货？";
            $('#xiaoxi').html(msg);

        }
    }

    function xiaoxi() {
        window.location.href = "${basePath}reception/jh.jsp";
    }
    function birthday() {
        window.location.href = "${basePath}zomoreMember/memberbirthday.do";
    }

    //点击会员充值
    $("#cz").click(function () {
        var memberId=$("#zomoreMemberId").val();
        if (memberId!=null&&memberId!="") {
            window.location.href = "${basePath}zomoreMemberInputrule/cz.do?memberNum=" + $("#zomoreMemberNum").val();
        } else {
            alert("请先查询会员!^-^!");
        }

    });
    //点击查看会员
    $("#showUser").click(function () {
       /* var member=$("#zomoreMemberNum").val();*/
        var memberId=$("#zomoreMemberId").val();
        if (memberId!=null&&memberId!="") {
            /*//会员记录id查询
            window.location.href = "${basePath}zomoreMember/selectByMemberNum2.do?memberId="+memberId;*/
            window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();

        } else {
            alert("请先查询会员!^-^!");

        }
    });
    //点击积分兑换
    $("#jifenduihuan").click(function () {
        var zomoreMemberId=$("#zomoreMemberId").val();
        if (zomoreMemberId!=null&&zomoreMemberId!="") {
            window.location.href = "${basePath}zomoreMember/selectByMemberNum.do?num=" + $("#zomoreMemberNum").val();
        } else {
            alert("请先查询会员!^-^!");
        }
    });
    //登录弹窗确认上班
    $(function () {
        var standbyfund=${requestScope.cashierGenralSetting.standbyfund};
        if(standbyfund==1){
            modelJjb("确认交班",closework2);
        }
    })
</script>
<%--消息提醒框--%>
<script type="text/javascript">
    function tips_pop() {
        var MsgPop = document.getElementById("winpop");//获取窗口这个对象,即ID为winpop的对象
        var popH = parseInt(MsgPop.style.height);//用parseInt将对象的高度转化为数字,以方便下面比较
        if (popH == 0) {//如果窗口的高度是0
            MsgPop.style.display = "block";//那么将隐藏的窗口显示出来
            show = setInterval("changeH('up')", 2);//开始以每0.002秒调用函数changeH("up"),即每0.002秒向上移动一次
        }
        else {//否则
            hide = setInterval("changeH('down')", 2);//开始以每0.002秒调用函数changeH("down"),即每0.002秒向下移动一次
        }
    }
    function tips_pop2() {
        var MsgPop = document.getElementById("birthday");//获取窗口这个对象,即ID为birthday的对象
        var popH = parseInt(MsgPop.style.height);//用parseInt将对象的高度转化为数字,以方便下面比较
        if (popH == 0) {//如果窗口的高度是0
            MsgPop.style.display = "block";//那么将隐藏的窗口显示出来
            show = setInterval("changeH2('up')", 2);//开始以每0.002秒调用函数changeH("up"),即每0.002秒向上移动一次
        }
        else {//否则
            hide = setInterval("changeH2('down')", 2);//开始以每0.002秒调用函数changeH("down"),即每0.002秒向下移动一次
        }
    }


    function changeH(str) {
        var MsgPop = document.getElementById("winpop");
        var popH = parseInt(MsgPop.style.height);
        if (str == "up") {//如果这个参数是UP
            if (popH <= 100) {//如果转化为数值的高度小于等于100
                MsgPop.style.height = (popH + 1).toString() + "px";//高度增加1个象素
            }
            else {
                clearInterval(show);//否则就取消这个函数调用,意思就是如果高度超过100象度了,就不再增长了
            }
        }


        if (str == "down") {
            if (popH >= 4) {//如果这个参数是down
                MsgPop.style.height = (popH - 1).toString() + "px";//那么窗口的高度减少1个象素
            }
            else {//否则
                clearInterval(hide);//否则就取消这个函数调用,意思就是如果高度小于4个象度的时候,就不再减了
                MsgPop.style.display = "none";//因为窗口有边框,所以还是可以看见1~2象素没缩进去,这时候就把DIV隐藏掉
            }
        }
    }

    function changeH2(str) {
        var MsgPop = document.getElementById("birthday");
        var popH = parseInt(MsgPop.style.height);
        if (str == "up") {//如果这个参数是UP
            if (popH <= 100) {//如果转化为数值的高度小于等于100
                MsgPop.style.height = (popH + 1).toString() + "px";//高度增加1个象素
            }
            else {
                clearInterval(show);//否则就取消这个函数调用,意思就是如果高度超过100象度了,就不再增长了
            }
        }


        if (str == "down") {
            if (popH >= 4) {//如果这个参数是down
                MsgPop.style.height = (popH - 1).toString() + "px";//那么窗口的高度减少1个象素
            }
            else {//否则
                clearInterval(hide);//否则就取消这个函数调用,意思就是如果高度小于4个象度的时候,就不再减了
                MsgPop.style.display = "none";//因为窗口有边框,所以还是可以看见1~2象素没缩进去,这时候就把DIV隐藏掉
            }
        }
    }


    if (${sessionScope.index=='1'}) {
        var setrepeat=${sessionScope.setrepeat}+"";
        var memberBirthday=${sessionScope.memberBirthday}+"";


            window.onload = function () {//加载
                    if(setrepeat=='1'){
                        document.getElementById('winpop').style.height = '0px';//我不知道为什么要初始化这个高度,CSS里不是已经初始化了吗,知道的告诉我一下
                        setTimeout("tips_pop()", 1000);//1秒后调用tips_pop()这个函数
                        setTimeout("tips_pop()", 5000);//5秒后调用tips_pop()这个函数

                    }
                if(memberBirthday=='1'){
                    document.getElementById('birthday').style.height = '0px';//我不知道为什么要初始化这个高度,CSS里不是已经初始化了吗,知道的告诉我一下
                    setTimeout("tips_pop2()", 5000);//1秒后调用tips_pop()这个函数
                    setTimeout("tips_pop2()", 9000);//5秒后调用tips_pop()这个函数

                }

                localStorage.clear();
                fenpingDelAll();

            }



    }

  /*  window.onload=function(){
        localStorage.clear();
        fenpingDelAll();
    }*/

</script>
<script type="text/javascript">/*fullscreen=1,toolbar=0,location=0,directories=0,status=0,menubar=0,resizable=0,top=10000,left=10000*/
/*window.open ("fuping.jsp",/!* 'newwindow',*!/"newwindow","fullscreen=1,toolbar=0,location=0,directories=0,status=0,menubar=0,resizable=0,top=10000,left=100");*/
/*/!*window.open('fuping.jsp','newwindow','height=100,width=400,top=0,left=-285px,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no,status=no')*!/*/
/*mark9*//*(window.screen.availWidth-10-iWidth)*/
var openUrl = "fuping.jsp";//弹出窗口的url
var iWidth=800; //弹出窗口的宽度;
var iHeight=600; //弹出窗口的高度;
var iTop = (window.screen.availHeight-30-iHeight)/2; //获得窗口的垂直位置;
var iLeft = (window.screen.availWidth-10-iWidth)*4; //获得窗口的水平位置;

//打开副屏
/*if(${sessionScope.index=='1'}){
    window.open(openUrl,"_blank","height="+iHeight+", width="+iWidth+", top="+iTop+", left="+iLeft);
}*/



/*var newWindow=window.open('http://localhost:8080/reception/list.do',"");*/
/*newWindow.alert('test');
/*newWindow.focus();*/



/*
var delta=5;
var i=2;
var w=window.open(openUrl,"_blank","height="+iHeight+", width="+iWidth+", top="+iTop+", left="+iLeft);;
var width;
var height;
var x=10;
var y=0;



$(move())



function move() {
     /!*!/!*alert("----");*!/
    if (x <= 0 || x >1920*2) {
        delta = -delta;//变号
    }
    x += delta;
    if (y <= 0 || y > height) {
        i = -i;//变号
    }
    y += i;
    w.moveTo(x, y);
    setTimeout(move, 5);



/!*   if(screen.availLeft>-1){  //判断左屏还是右屏
        w.moveTo(-5000, 0); //1000是根据自己环境来设定的，应该有更好的方式。
        alert("zuo");
    }else{
    w.moveTo(5000, 0);
    alert("you");
}*!/
}*/


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
    window.onload = setRunTime;
    //修改wifi图标颜色
    function wifiState() {
        var state = navigator.connection;
        if (navigator.onLine) {
            if (state.downlink > 1) {
                $("#wifi").css("color", "#28FF28");
            } else if (state.downlink < 1 && state.downlink > 0) {
                $("#wifi").css("color", "#FF5151");
            } else {//排除服务器连接却无网络的情况
                $("#wifi").css("color", "#d0d0d0");
            }
        } else {
            $("#wifi").css("color", "#d0d0d0");
        }
    }

        function setRunTime() {
            //每个30秒检查一次网络下载速度
            window.setInterval("wifiState()", 30000);
        }

</script>
</body>
</html>
