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
    <title>购物车</title>
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
            <span class="navbar-title">择沐美妆</span>
        </div>
    </header>

    <!--这里是购物车标题-->
    <a href="#" class="cell-item">
        <div class="cell-left">购物车</div>
        <div class="cell-right cell-arrow"></div>
    </a>

    <!--这里是热销商品-->
    <section class="g-scrollview" id="J_List">
        <article class="m-list list-theme4">
            <c:forEach items="${zomoreMemberShopcars}" var="commodityList" >

                <div class="list-item">
                    <div class="m-cell" style="position: initial;margin-top: .35rem;">
                        <label class="cell-item">
                            <label class="cell-right">
                                <input type="checkbox" name="checkbox"  value="${commodityList.shopcarId}" onclick="countMoney()"/>
                                <i class="cell-checkbox-icon" ></i>
                            </label>
                        </label>
                    </div>
                    <div class="list-img" onclick="goDetails(${commodityList.shopcarCommodityCode});">
                        <img src="http://static.ydcss.com/uploads/ydui/goods_default.jpg" data-url="http://img1.shikee.com/try/2016/06/19/09430120929215230041.jpg_180x180.jpg">
                    </div>
                    <div class="list-mes">
                        <h3 class="list-title">${commodityList.shopcarCommodityName}</h3>
                        <div class="list-mes-item">
                            <div>
                                <span class="list-price"><em>¥</em>${commodityList.shopcarCommodityActiveprice}</span>
                                <span class="list-del-price">¥${commodityList.shopcarCommodityOutprice}</span>
                            </div>
                            <div class="cell-left" style="margin-left: 15px">
                                <span style="margin-right:60px">库存：${commodityList.shopcarComodityStore}</span>
                                <span class="m-spinner" data-ydui-spinner="{input: '.J_Input', add: '.J_Add', minus: '.J_Del',longpress: false}" ><!-- 添加data-ydui-spinner属性并添加参数即可 -->
                                    <a href="javascript:;" class="J_Del" onclick="changeCommodityNum(${commodityList.shopcarId},this)" ></a>
                                        <input type="text" class="J_Input"  value="${commodityList.shopcarCommodityNum}" placeholder="" onchange="changeValueNum(${commodityList.shopcarId},this)"/>
                                    <a href="javascript:;" class="J_Add" onclick="changeCommodityNum(${commodityList.shopcarId},this)"></a>
                                 </span>
                            </div>
                            <a href="${basePath}memberShop/deleteShopcar.do?shopcarId=${commodityList.shopcarId}">删除</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <div class="m-cell">
                <label class="cell-item">
                    <span class="cell-left">全选</span>
                    <label class="cell-right">
                        <input type="checkbox" name="checkbox" onclick="allChecked()"/>
                        <i class="cell-checkbox-icon"></i>
                    </label>
                </label>
            </div>
        </article>
    </section>
</section>

<footer class="m-tabbar">
    <a href="${basePath}memberShop/deleteAllshopcar.do" class="tabbar-item" style="background-color: #bf1d06;" >
                <span class="tabbar-icon" style="color: #ffffff;">
                    <i class="icon-shopcart-outline"></i>
                </span>
        <span class="tabbar-txt" style="color: #ffffff;">清空购物车</span>
    </a>
    <a href="#" class="tabbar-item" style="background-color: #bf0000;" onclick="submitOrder()">
                    <span style="color: #ffffff; font-size: 16px; margin-top: .06rem; margin-bottom: .06rem;">
                   <div style="height: .48rem"> 总计：<span id="countMoney">0.00 元</span></div>
                </span>
        <span class="tabbar-txt" style="color: #ffffff;" >立即购买</span>
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
<script src="js/ydui.js"></script>

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

        /*$('#J_List').infiniteScroll({
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
        });*/
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
    //选中商品提交
    function submitOrder(){
        var boxs = document.getElementsByName("checkbox");
        var num = 0;
        var shopcarId = "";
        //在Js中foreach并不会遍历每个元素,而是遍历Key,即所有属性
        for (var i = 0; i < boxs.length; i++) {
            //全选事件点击，其他复选框和全选框状态相同
            if(i!=boxs.length-1){
                var box = boxs[i];
               if(box.checked){
                    num++;
                   if(shopcarId == null ||  shopcarId == ""){
                       shopcarId =box.value;
                   }else{
                       //判断是否已经存在
                       shopcarId = shopcarId + ","+box.value;
                   }

                }
            }
        }
        if(num == 0){
            var tipStr = "请选择需要购买的商品";
            window.YDUI.dialog.toast(tipStr, 'none', 1500);
        }else{
            window.location.href="${basePath}memberShop/gotoMemberOrder.do?commodityCountId="+shopcarId;
        }

    }

    //选中商品计算总金额数
    function countMoney() {
        var boxs = document.getElementsByName("checkbox");
        var num = 0;
        var shopcarId = "";
        //在Js中foreach并不会遍历每个元素,而是遍历Key,即所有属性
        for (var i = 0; i < boxs.length; i++) {
            //全选事件点击，其他复选框和全选框状态相同
            if (i != boxs.length - 1) {
                var box = boxs[i];
                if (box.checked) {
                    num++;
                    if (shopcarId == null || shopcarId == "") {
                        shopcarId = box.value;
                    } else {
                        //判断是否已经存在
                        shopcarId = shopcarId + "," + box.value;
                    }

                }
            }
        }
        if(num!=boxs.length-1){
            boxs[boxs.length-1].checked="";
        }
        if(num==boxs.length-1){
            boxs[boxs.length-1].checked="true";
        }
        if(num==0){
            //设置金额为0
            $("#countMoney").html("0.00 元");
        }
        else{
            $.ajax({
                url: '${basePath}memberShop/countMoneny.do',
                data: {
                    shopcarIds: shopcarId
                },
                success(ret){

                    $("#countMoney").html(ret+" "+"元");
                },
                error(){
                    alert("失败");
                }

            });
        }
    }

    function  allChecked() {
        var boxs = document.getElementsByName("checkbox");
        var box = boxs[boxs.length-1]
        if(boxs.length==1){
            box.checked="";
        }
        if(box.checked){
            for(var i=0;i<boxs.length-1;i++){
                boxs[i].checked="true";
            }
        }
        else {
            for(var i=0;i<boxs.length-1;i++){
                boxs[i].checked="";
            }

        }

        countMoney();
    }
    /*${commodityList.zomoreCommodityCode}*/
    //点击图片跳详情页
    function goDetails(commoditycode) {

        window.location.href="${basePath}commodity/findCommodityDetails.do?commodityCode="+commoditycode;


    }
</script>
<script>
   //减少商品数量
   function changeCommodityNum(shopcarId,obj) {
        //获取input标签的的value

       var val = $(obj).parent().find('input').eq(0).val();

       var shopcarCommodityNum=val;

       if(shopcarCommodityNum<1 ){

           return false;
        }

       $.ajax({
           url: '${basePath}memberShop/changeCommodityNum.do',
           data: {
               shopcarId: shopcarId,
               shopcarCommodityNum:shopcarCommodityNum
           },
           success(ret){
               countMoney();

           },
           error(){
               alert("失败");
           }


   });

   }

   function changeValueNum(shopcarId,obj) {
      var val = $(obj).val();
       var shopcarCommodityNum=val;
       if(shopcarCommodityNum<1 ){
           //alert("已经为1");
           return false;
       }

       $.ajax({
           url: '${basePath}memberShop/changeCommodityNum.do',
           data: {
               shopcarId: shopcarId,
               shopcarCommodityNum:shopcarCommodityNum
           },
           success(ret){

               countMoney();

           },
           error(){
               alert("失败");
           }


       });



   }
</script>


</body>
</html>
