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
    <title>商城首页</title>
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
	
<section class="g-flexview" style="height:5.5rem">
        <!--这是头部-->
    	<header class="m-navbar">
     	   <div class="navbar-center">
        	    <span class="navbar-title">${sessionScope.isCommodity.shopName}</span>
       	    </div>
    	</header>

    	<!--这里是轮播图-->
    	<div class="m-slider" id="J_Slider">
            <div class="slider-wrapper">
                <div class="slider-item">
                    <a href="#">
                        <img src="${basePath}images/shopImage1.jpg">
                    </a>
                </div>
        <div class="slider-item">
            <a href="#">
                <img src="${basePath}images/shopImage2.jpg">
                <%--<img src="http://static.ydcss.com/uploads/ydui/2.jpg">--%>
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
    
   <%-- <ul class="m-grids-4 demo-icons">
            <a href="#">
            	<li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-home"></i>
                </div>
                <div class="grids-txt">优选榜单</div>
            </li>
            </a>
            <a href="#">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-home-outline"></i>
                </div>
                <div class="grids-txt">超值套餐</div>
            </li>
            </a>
            <a href="#">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-shopcart"></i>
                </div>
                <div class="grids-txt">限时特惠</div>
            </li>
            </a>
            <a href="#">
            <li class="grids-item">
                <div class="grids-icon">
                    <i class="icon-shopcart-outline"></i>
                </div>
                <div class="grids-txt">特卖专场</div>
            </li>
            </a>
        </ul>--%>
    	
    	<!--这里是店长推荐标题-->
    	<a href="#" class="cell-item">
            <div class="cell-left">店长推荐</div>
            <div class="cell-right cell-arrow"></div>
        </a>
    </section>
    <!--这里是店长推荐classify.html-->
<section class="g-scrollview" id="J_List">
    <div id="J_ListContent" class="m-list list-theme1"></div>
</section>

<%--尾部--%>
<%@include file="footer.jsp" %>
<script id="J_ListHtml" type="text/html">
    {{each list as data}}
    <a href="${basePath}commodity/findCommodityDetails.do?commodityCode={{data.zomoreCommodityCode}}" class="list-item">
        <div class="list-img">
            <%--<img src="{{data.zomoreCommodityImage}}">--%>
            <img src="http://img1.shikee.com/try/2016/06/23/14381920926024616259.jpg_220x220.jpg">
            <%-- <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="{{data.zomoreCommodityImage}}">--%>
        </div>
        <div class="list-mes">
            <h3 class="list-title">{{data.zomoreCommodityName}}</h3>
            <div class="list-mes-item">
                <div>
                    <span class="list-price"><em>¥</em>{{data.zomoreCommodityOut}}</span>
                    <span class="list-del-price">¥{{data.zomoreCommodityOut}}</span>
                </div>
            </div>
        </div>
    </a>
    {{/each}}
</script>
<script src="${basePath}js/jquery.min.js"></script>
<script src="${basePath}js/template.js"></script>
<script src="${basePath}js/ydui.js"></script>

<script src="${basePath}js/jquery.min.js"></script>
<script src="${basePath}js/ydui.js"></script>
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
                url: '${basePath}commodity/findAllCommodityByShop.do',
                dataType: 'json',
                data: {
                    currentPage: page,
                    pageSize: pageSize
                },
                success: function (ret) {

                    typeof callback == 'function' && callback(ret);
                },
                error:function (ret) {
                    alert("123");

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

    var $keyboard = $('#J_KeyBoard');

    /* 初始化参数 */
    $keyboard.keyBoard({
        disorder: false, /* 是否打乱数字顺序 */
        title: 'YDUI安全键盘' /* 显示标题 */
    });

    /* 打开键盘 */
    $('#J_OpenKeyBoard').on('click', function () {
        $keyboard.keyBoard('open');
    });

    /* 六位密码输入完毕后执行 */
    $keyboard.on('done.ydui.keyboard', function (ret) {

        console.log('输入的密码是：' + ret.password);

        YDUI.dialog.loading.open('验证账号密码');
        setTimeout(function(){
            /* 显示错误信息 */
            YDUI.dialog.loading.close();
            $keyboard.keyBoard('error', '对不起，您的密码不正确，请重新输入。');
        }, 1500);

        /* 关闭键盘 */
        /* $keyboard.keyBoard('close'); */
    });
</script>

</body>
</html>
