<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人中心</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link rel="stylesheet" href="${basePath}css/ydui.css?rev=@@hash"/>
    <link rel="stylesheet" href="${basePath}css/demo.css"/>
    <link rel="stylesheet" href="${basePath}css/iconfont.css"/>

    <script src="${basePath}js/jquery-3.2.1.min.js"></script>
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/ydui.js"></script>
    <script src="${basePath}js/ydui.flexible.js"></script>
    <script src="${basePath}js/ydui.citys.js"></script>

    <script>(!YDUI.device.isMobile && navigator.userAgent.indexOf('Firefox') >= 0) && YDUI.dialog.alert('PC端请使用谷歌内核浏览器查看！');</script>

</head>
<body>

<section class="g-flexview">

    <header class="m-navbar">
        <a href="../pages/index.jsp" class="navbar-item"><i class="back-ico"></i></a>
        <div class="navbar-center"><span class="navbar-title">会员中心</span></div>
    </header>

    <section class="g-scrollview">
        <div class="user-core">
        	<div class="navbar-center"><font style="font-size:20px;color: #ffffff;">
                <c:choose>
                    <c:when test="${not empty sessionScope.user}">${user.memberMemberidname}</c:when>
                    <c:otherwise>未登录</c:otherwise>
                </c:choose></font></div>
            <div class="cell-item">
                <div class="cell-left">
            	    <div class="round_icon">
        			    <img src="../images/logo.png">
        		    </div>
                </div>
            <div class="cell-left" style="margin-left: 20px; color: #ffffff;">
            	<div class="round_sal">余额：
                    <c:choose>
                        <c:when test="${not empty sessionScope.user}">${user.memberBalance}</c:when>
                        <c:otherwise>0</c:otherwise>
                    </c:choose>
                    <br />次卡：
                    <c:choose>
                        <c:when test="${not empty sessionScope.user}">${user.memberSubcard}</c:when>
                        <c:otherwise>0</c:otherwise>
                    </c:choose>
                    </div>
            </div>
            <div class="cell-left" style="margin-left: 20px; color: #ffffff;">
            	<div class="round_sal">积分：
                    <c:choose>
                        <c:when test="${not empty sessionScope.user}">${user.memberIntegral}</c:when>
                        <c:otherwise>0</c:otherwise>
                    </c:choose>
                    <br />积点：
                    <c:choose>
                        <c:when test="${not empty sessionScope.user}">${countPointNumber}</c:when>
                        <c:otherwise>0</c:otherwise>
                    </c:choose>
                    </div>
            </div>
        </div>
    </div>
        <div class="m-cell demo-small-pitch">
            <a class="cell-item" href="${basePath}memberShop/findAllOrderByMemberAccount.do?orderStatus=3">
                <div class="cell-left"><i class="cell-icon demo-icons-order"></i>我的订单</div>
                <div class="cell-right cell-arrow">查看全部订单</div>
            </a>
            <ul class="m-grids-4 demo-icons">

              <a href="${basePath}memberShop/findAllOrderByMemberAccount.do?orderStatus=0">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-shield-outline"></i>
                    <span class="badge badge-danger">${orderNumber.pendingPaymemtNum}</span>
                </div>
                <div class="grids-txt">待付款</div>
            </li>
            </a>

            <a  href="${basePath}memberShop/findAllOrderByMemberAccount.do?orderStatus=1">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-shopcart-outline"></i>
                    <span class="badge badge-danger">${orderNumber.pendingSendingGoodsNum}</span>
                </div>
                <div class="grids-txt">待发货</div>
            </li>
            </a>
            <a  href="${basePath}memberShop/findAllOrderByMemberAccount.do?orderStatus=2">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-shopcart"></i>
                    <span class="badge badge-danger">${orderNumber.pendingGetGoodsNum}</span>
                </div>
                <div class="grids-txt">待收货</div>
            </li>
            </a>
            <a href="${basePath}memberShop/findPendingEvaluateOrders.do?orderStatus=3">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-feedback"></i>
                    <span class="badge badge-danger">${orderNumber.pendingEvalateNum}</span>
                </div>
                <div class="grids-txt">待评价</div>
            </li>
            </a>
        </ul>
        </div>

        <c:choose>
            <c:when test="${not empty sessionScope.user}">
        <div class="m-celltitle">收货地址</div>
        <div class="m-cell">
            <div class="cell-item">
                <div class="cell-left">所在地区：</div>
                <div class="cell-right cell-arrow">
                    <input type="text" class="cell-input" readonly id="J_Address" placeholder="请选择收货地址">
                </div>
            </div>
            <div class="cell-item">
                <div class="cell-left">详细地址：</div>
                    <div class="cell-right">
        	            <input type="number" pattern="[0-9]*" class="cell-input" placeholder="请输入详细地址" autocomplete="off" />
                    </div>
                </div>
            </div>
        <div class="m-cell">
            <label class="cell-item">
                <span class="cell-left">广州市白云区七星岗路嘉禾街道48号盈润商务中心</span>
                <label class="cell-right">
                    <input type="radio" value="1" name="checkbox"/>
                    <i class="cell-checkbox-icon"></i>
                </label>
            </label>
            <label class="cell-item">
                <span class="cell-left">广州市白云区七星岗路嘉禾街道48号盈润商务中心</span>
                <label class="cell-right">
                    <input type="radio" value="2" name="checkbox"/>
                    <i class="cell-checkbox-icon"></i>
                </label>
            </label>
            <label class="cell-item">
                <span class="cell-left">广州市白云区七星岗路嘉禾街道48号盈润商务中心</span>
                <label class="cell-right">
                    <input type="radio" value="3" name="checkbox"/>
                    <i class="cell-checkbox-icon"></i>
                </label>
            </label>
        </div>

        <div class="m-celltitle">备注</div>
        <div class="m-cell">
            <div class="cell-item">
                <div class="cell-right">
                    <textarea class="cell-textarea" placeholder=""></textarea>
                </div>
            </div>
        </div>
        <!--这里是确定按钮-->
        <div class="m-button">
            <button type="button" class="btn-block btn-primary"> 确 定 </button>
        </div></c:when>
            <c:otherwise>
                <div class="m-button">
                    <button type="button" class="btn-block btn-primary"
                            onclick="javascript:window.location.href='${basePath}pages/login.jsp';"> 马上登录 </button>
                </div>
            </c:otherwise>
        </c:choose>
    </section>
</section>
<%--尾部--%>
<%@include file="footer.jsp" %>


<%--<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://static.ydcss.com/uploads/ydui/ydui.citys.js"></script>
<script src="js/ydui.js"></script>--%>

<script src="${basePath}js/ydui.js"></script>

<script>
    var $address = $('#J_Address');

    $address.citySelect();

    $address.on('click', function (event) {
        event.stopPropagation();
        $address.citySelect('open');
    });

    $address.on('done.ydui.cityselect', function (ret) {
        /* 省：ret.provance */
        /* 市：ret.city */
        /* 县：ret.area */
        $(this).val(ret.provance + ' ' + ret.city + ' ' + ret.area);
    });

</script>
</body>
</html>
