<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>订单提交</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link rel="stylesheet" href="${basePath}css/ydui.css?rev=@@hash"/>
    <link rel="stylesheet" href="${basePath}css/demo.css"/>
    <link rel="stylesheet" href="${basePath}css/iconfont.css"/>
     <script src="${basePath}js/jquery-3.2.1.min.js"></script>
    <script src="${basePath}js/ydui.flexible.js"></script>
</head>
<body>
<section class="g-flexview">

    <header class="m-navbar">
        <a href="javascript:history.back(-1)" class="navbar-item"><i class="back-ico"></i></a>
        <div class="navbar-center"><span class="navbar-title">订单</span></div>
    </header>

    <section class="g-scrollview">
        <form id="subOrder" action="${basePath}memberShop/subMemberOrder.do" method="post">
        <div class="m-cell demo-small-pitch">
            <a class="cell-item" href="javascript:;">
                <div class="cell-left"><i class="cell-icon demo-icons-order"></i>订单提交</div>
                <div class="cell-right"></div>
            </a>
        </div>
        <c:forEach items="${shopcars}" var="shopCommodity">
            <input type="hidden" name="shopcarId" value="${shopCommodity.shopcarId}"/>
            <div class="cell-item">
                <div class="cell-left">${shopCommodity.shopcarCommodityName} </div>
                <div class="cell-left" style="margin-left: 25px">
                    <em>¥</em>${shopCommodity.shopcarCommodityOutprice}
                </div>
                <div class="cell-right" style="margin-left: 25px">
                        X ${shopCommodity.shopcarCommodityNum}
                </div>
                <div class="cell-right"><span class="list-price"><em>¥</em>${shopCommodity.shopcarCommodityOutprice* shopCommodity.shopcarCommodityNum}</span></div>
            </div>
         </c:forEach>
            <div class="cell-item">
                <div class="cell-right"><span class="list-price">总计：<em>¥</em>${countMoney}</span></div>
            </div>
        <div class="m-cell demo-small-pitch">
            <div class="cell-item">
                <div class="cell-left">姓名：</div>
                <div class="cell-right"><input type="text" class="cell-input" placeholder="收货人姓名" autocomplete="off"  name="memberName"/></div>
            </div>
        </div>

        <div class="cell-item">
            <div class="cell-left"><i class="cell-icon demo-icons-phone"></i>手机号码：</div>
            <div class="cell-right">
                <input type="number" pattern="[0-9]*" class="cell-input" placeholder="手机号码" autocomplete="off" name="memberPhone" />
            </div>
        </div>
        <div class="m-cell demo-small-pitch">
            <a class="cell-item" href="javascript:;">
                <div class="cell-left"><i class="cell-icon demo-icons-phone"></i>地址：</div>
                <input type="text" class="cell-input" readonly id="J_Address" placeholder="请选择收货地址" name="memberAddress">
            </a>
        </div>
        <div class="cell-item">
            <div class="cell-left">详细地址：</div>
            <div class="cell-right">
                <input type="text"  class="cell-input" placeholder="请输入详细地址" autocomplete="off" name="memberAddressDetails"/>
            </div>
        </div>

        </div>
      <%--  <div class="m-cell">
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
        </div>--%>
        <div class="m-celltitle">备注</div>
        <div class="m-cell">
            <div class="cell-item">
                <div class="cell-right">
                    <textarea class="cell-textarea" placeholder="" name="memberOrderRemark"></textarea>
                </div>
            </div>
        </div>

        <!--这里是确定按钮-->
        <div class="m-button">
            <button type="submit" class="btn-block btn-primary"> 确 定 </button>
        </div>
    </form>
</section>

</section>
<%--尾部--%>
<%@include file="footer.jsp" %>
<script src="${basePath}js/jquery.min.js"></script>
<script src="${basePath}js/ydui.js"></script>
<script src="${basePath}js/ydui.citys.js"></script>
<script>
    /**
     * 默认调用
     */
    !function () {

        var $target = $('#J_Address');

        $target.citySelect();

        $target.on('click', function (event) {
            event.stopPropagation();
            $target.citySelect('open');
        });

        $target.on('done.ydui.cityselect', function (ret) {
            $(this).val(ret.provance + ' ' + ret.city + ' ' + ret.area);
        });
    }();
</script>
</body>
</html>
