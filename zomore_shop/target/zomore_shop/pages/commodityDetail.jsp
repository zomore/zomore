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
    <title>商品详情</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link rel="stylesheet" href="${basePath}css/ydui.css?rev=@@hash"/>
    <link rel="stylesheet" href="${basePath}css/demo.css"/>
    <link rel="stylesheet" href="${basePath}css/iconfont.css"/>
    <script src="${basePath}js/jquery-3.2.1.min.js"></script>
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/ydui.flexible.js"></script>
    <script src="${basePath}js/ydui.js"></script>

</head>
<body>

<section class="g-flexview">
    <!--这是头部-->
    <header class="m-navbar">
        <div class="navbar-center">
            <span class="navbar-title">商品详情</span>
        </div>
    </header>

    <section class="g-scrollview">
        <!--这里是轮播图-->
        <div class="m-slider" id="J_Slider">
            <div class="slider-wrapper">
                <div class="slider-item">
                    <a href="#">
                        <%--<img src="http://static.ydcss.com/uploads/ydui/1.jpg">--%>
                            <img src="${basePath}images/shopImage2.jpg">
                    </a>
                </div>
                <div class="slider-item">
                    <a href="#">
                        <%--<img src="http://static.ydcss.com/uploads/ydui/2.jpg">--%>
                            <img src="${basePath}images/shopImage1.jpg">
                    </a>
                </div>
               <%-- <div class="slider-item">
                    <a href="#">
                        <img src="http://static.ydcss.com/uploads/ydui/3.jpg">
                    </a>
                </div>--%>
            </div>
            <div class="slider-pagination"></div>
        </div>

        <!--这里是商品详情-->

        <div class="list-mes">
            <div class="list-mes-item"><div>
                <span class="list-price" style="font-size: 20px;"><em>¥</em>${zomoreCommodity.zomoreCommodityOut}</span>
                <span class="list-del-price">¥${zomoreCommodity.zomoreCommodityOut}</span>
            </div>
                <div style="font-size: 24px; margin-top: 10px;">
                    <a href="#"><i class="icon-share1"></i></a>
                </div>
            </div>
            <h3 class="list-title">${zomoreCommodity.zomoreCommodityName}</h3>
        </div>
        <div class="m-cell" style="margin-bottom: 0rem;">
            <a class="cell-item" href="javascript:;" id="J_ShowActionSheet">
                <div class="cell-left">商品规格：${zomoreCommodity.zomoreCommoditySpecifications}</div>
                <div class="cell-right cell-arrow"></div>
                <%--<div class="cell-right cell-arrow"></div>--%>
            </a>
        </div>
        <div class="m-cell" style="margin-bottom: 0rem;">
            <a class="cell-item" href="javascript:;" id="J_ShowActionSheet2">
                <div class="cell-left">图文详情</div>
                <div class="cell-right cell-arrow"></div>
            </a>
        </div>
        <article class="m-list list-theme5">
            <a href="javascript:;" class="list-item">
                <div class="list-img">
                    <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="http://img1.shikee.com/try/2016/06/23/15395220917905380014.jpg">
                </div>
            </a>
            <a href="javascript:;" class="list-item">
                <div class="list-img">
                    <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="http://img1.shikee.com/try/2016/06/25/14244120933639105658.jpg">
                </div>
            </a>
            <a href="javascript:;" class="list-item">
                <div class="list-img">
                    <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="http://img1.shikee.com/try/2016/06/26/12365720933909085511.jpg">
                </div>
            </a>
          <%--  <a href="javascript:;" class="list-item">
                <div class="list-img">
                    <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="http://img1.shikee.com/try/2016/06/19/09430120929215230041.jpg">
                </div>
            </a>--%>
        </article>
    </section>
    <!--选择规格-->
    <div class="m-actionsheet" id="J_ActionSheet">
        <a href="#" class="actionsheet-item" style="height: 140px;">
            <div class="cell-left">
    		<span class="cell-icon">
    			<img src="//static.ydcss.com/ydui/img/logo.png" style="height: 120px;width: 120px; margin: 10px 10px 10px 10px;"/>
    		</span>
                <div class="cell-left" style="padding-top: 80px;">
                    <span class="list-price" style="font-size: 20px;"><em>¥</em>${zomoreCommodity.zomoreCommodityOut}</span>
                </div>
            </div>
        </a>
        <a href="#" class="actionsheet-item" style="padding-left: 10px;">
            <div class="cell-left">
                <span class="cell-icon">规格</span>
                <div class="cell-left">
                    <span class="badge badge-radius badge-hollow" style="margin-left: 10px;">${zomoreCommodity.zomoreCommoditySpecifications}123</span>
                </div>
            </div>
        </a>
        <div class="m-cell">
            <div class="cell-item">
                <div class="cell-left">
                    <span class="cell-icon">购买数量</span>
                </div>
                <div class="cell-right">
            	<span class="m-spinner" data-ydui-spinner="{input: '.J_Input', add: '.J_Add', minus: '.J_Del'}"><!-- 添加data-ydui-spinner属性并添加参数即可 -->
                <a href="javascript:;" class="J_Del"></a>
                <input type="text" class="J_Input" placeholder="1" id="commodityNum"/>
                <a href="javascript:;" class="J_Add"></a>
                 </span>
                </div>
            </div>
        </div>
        <a href="javascript:;" class="actionsheet-action" id="J_Cancel">确认</a>
    </div>


</section>
<footer class="m-tabbar">
    <a href="#" class="tabbar-item" style="background-color: #bf1d06;" onclick="goinShopcar(${zomoreCommodity.zomoreCommodityId})">
                <span class="tabbar-icon" style="color: #ffffff;">
                    <i class="icon-shopcart-outline"></i>
                </span>
        <span class="tabbar-txt" style="color: #ffffff;">加入购物车</span>
    </a>
    <a href="#" class="tabbar-item" style="background-color: #bf0000;" onclick="toOrder(${zomoreCommodity.zomoreCommodityId})">
                    <span class="tabbar-icon" style="color: #ffffff;">
                    <i class="icon-shield"></i>
                </span>
        <span class="tabbar-txt" style="color: #ffffff;">立即购买</span>
    </a>
</footer>
<%--尾部--%>
<%@include file="footer.jsp" %>

<script id="J_ListHtml" type="text/html">
    {{each list as data}}
    <a href="{{data.url}}" class="list-item">
        <div class="list-img">
            <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="{{data.img}}">
        </div>
        <div class="list-mes">
            <h3 class="list-title">{{data.title}}</h3>
            <div class="list-mes-item">
                <div>
                    <span class="list-price"><em>¥</em>{{data.marketprice}}</span>
                    <span class="list-del-price">¥{{data.productprice}}</span>
                </div>
            </div>
        </div>
    </a>
    {{/each}}
</script>
<%--<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://static.ydcss.com/libs/arttemplate/template.js"></script>
<script src="../js/ydui.js"></script>

<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="js/ydui.js"></script>--%>
<script>(!YDUI.device.isMobile && navigator.userAgent.indexOf('Firefox') >= 0) && YDUI.dialog.alert('PC端请使用谷歌内核浏览器查看！');</script>
<script>
    //轮播图
    $('#J_Slider').slider({
        speed: 200,
        autoplay: 2000,
        lazyLoad: true
    });

    !function () {

        // 根据实际情况自定义获取数据方法
        var page = 1, pageSize = 10;
        var loadMore = function (callback) {
            $.ajax({
                url: 'http://list.ydui.org/getdata.php?type=backposition',
                dataType: 'jsonp',
                data: {
                    page: page,
                    pagesize: pageSize
                },
                success: function (ret) {
                    typeof callback == 'function' && callback(ret);
                }
            });
        };

        $('#J_List').infiniteScroll({
            binder: '#J_List',
            pageSize: pageSize,
            initLoad: true,
            loadingHtml: '<img src="http://static.ydcss.com/uploads/ydui/loading/loading10.svg"/>',
            loadListFn: function () {
                var def = $.Deferred();

                loadMore(function (listArr) {

                    var html = template('J_ListHtml', {list: listArr});
                    $('#J_ListContent').append(html).find('img').lazyLoad({binder: '#J_List'});

                    def.resolve(listArr);

                    ++page;
                });

                return def.promise();
            }
        });
    }();

    var $as = $('#J_ActionSheet');

    $('#J_ShowActionSheet').on('click', function () {
        $as.actionSheet('open');
    });

    $('#J_Cancel').on('click', function () {
        $as.actionSheet('close');
    });

    /* 自定义事件 */
    $as.on('open.ydui.actionsheet', function () {
        console.log('打开了');
    }).on('close.ydui.actionsheet', function () {
        console.log('关闭了');
    });

    $('#J_Quantity').spinner({
        input: '.J_Input',
        add: '.J_Add',
        minus: '.J_Del',
        unit: function () {
            return 1 + 2;
        },
        max: function () {
            return (1 + 2 + 3 + 4 + 5) * 5;
        },
        callback: function (value, $ele) {
            // $ele 当前文本框[jQuery对象]
            // $ele.css('background', '#FF5E53');
            console.log('值：' + value);
        }
    });

    !function () {
        $('.m-list').find('img').lazyLoad({binder: '.g-scrollview'});
    }();
</script>
<script>
    function goinShopcar(shopcarCommodityId) {

        var shopcarCommodityNum =$("#commodityNum").val();
        $.ajax({
            url: '${basePath}memberShop/saveCommodityInShopcar.do',
            data: {
                shopcarCommodityId: shopcarCommodityId,
                shopcarCommodityNum:shopcarCommodityNum
            },
            success: function (ret) {
                var tipStr = '成功加入购物车';
                YDUI.dialog.toast(tipStr, 'none', 1500);

            },
            error:function (ret) {
                alert("加入购物车失败");

            }
        });
    }
    function toOrder(shopcarCommodityId) {

        var shopcarCommodityNum =$("#commodityNum").val();


        window.location.href="${basePath}memberShop/saveCommodityToBuy.do?shopcarCommodityId="+ shopcarCommodityId +"&shopcarCommodityNum="+shopcarCommodityNum;

    }
</script>
</body>
</html>
