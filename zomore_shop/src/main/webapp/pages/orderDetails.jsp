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
    <title>订单详情</title>
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
            <div class="m-cell demo-small-pitch">
                <a class="cell-item" href="javascript:;">
                    <div class="cell-left"><i class="cell-icon demo-icons-order"></i>订单详情-></div>
                    <c:if test="${newMemberShopOrder.memberOrderStatus eq 0}">
                        <div class="cell-left">待支付订单</div>
                    </c:if>
                    <c:if test="${newMemberShopOrder.memberOrderStatus eq 1}">
                        <div class="cell-left">待发货订单</div>
                    </c:if>
                    <c:if test="${newMemberShopOrder.memberOrderStatus eq 2}">
                        <div class="cell-left">待收货订单</div>
                    </c:if>
                    <c:if test="${newMemberShopOrder.memberOrderStatus eq 3 }">
                        <div class="cell-left">已完成订单</div>
                    </c:if>
                </a>
            </div>
            <c:forEach items="${memberShopOrderDetails}" var="orderDetailsCommodity">
                <div class="cell-item">
                    <div class="cell-left">${orderDetailsCommodity.memberOrderdetailCommodityName} </div>
                    <div class="cell-left" style="margin-left: 25px">
                        <em>¥</em>${orderDetailsCommodity.memberOrdetailCommodityoutprice}
                    </div>
                    <div class="cell-right" style="margin-left: 25px">
                        X ${orderDetailsCommodity.memberOrderdetailComodityNum}
                    </div>
                    <div class="cell-right"><span class="list-price"><em>¥</em>${orderDetailsCommodity.memberOrdetailCommodityoutprice* orderDetailsCommodity.memberOrderdetailComodityNum}</span></div>
                </div>
            </c:forEach>
            <div class="cell-item">
                <div class="cell-right"><span class="list-price">总付款：<em>¥</em>${newMemberShopOrder.memberOrderAmout}</span></div>
            </div>
            <div class="m-cell demo-small-pitch">
                <div class="cell-item">
                    <div class="cell-left"><input type="text" class="cell-input" readonly="readonly"  autocomplete="off"  value="${newMemberShopOrder.memberName}"/></div>
                </div>
            </div>

            <div class="cell-item">
                <div class="cell-left">手机号：</div>
                <div class="cell-left">
                    <input type="number" class="cell-input" readonly="readonly" autocomplete="off" value="${newMemberShopOrder.memberPhone}" />
                </div>
            </div>
            <div class="cell-item">
                <div class="cell-left">收货地址：</div>
                <div class="cell-right">
                    <input type="text"  class="cell-input" readonly="readonly" autocomplete="off" value="${newMemberShopOrder.memberAddress}"/>
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
                        <textarea class="cell-textarea"  readonly="readonly"  value="${newMemberShopOrder.memberOrderRemark}"></textarea>
                    </div>
                </div>
            </div>
        <c:if test="${newMemberShopOrder.memberOrderStatus eq 0}">
            <!--这里是确定按钮-->
            <div class="m-button">
                <button type="submit" class="btn-block btn-primary" onclick="gotoPay(${newMemberShopOrder.memberOrderId})"> 去支付 </button>
            </div>
        </c:if>

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
<script>
    function gotoPay(memberOrderId ) {
        var memberOrderStatus = 1;
        window.location.href="${basePath}memberShop/updataMemberOrder.do?memberOrderId="+memberOrderId+"&memberOrderStatus="+memberOrderStatus;
        
    }
    
    
</script>
</body>
</html>
