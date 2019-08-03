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
    <!-- 引用键盘 -->

    <link href="${basePath}css/keyword/keyboard.css" rel="stylesheet"/>
    <!-- 引入jquery的JS -->
    <script src="${basePath}js/jquery.min.js"></script>
    <script src="${basePath}js/bootstrap.min.js"></script>
    <!-- 引用表格的JS -->
    <script src="${basePath}js/bootstrap-table.min.js"></script>
    <script src="${basePath}js/bootstrap-table-zh-CN.min.js"></script>
    <!-- 引用键盘的JS -->
    <script src="${basePath}js/keyword/jquery.slimscroll.min.js"></script>
    <script src="${basePath}js/keyword/chinese-pynsimpl.js"></script>
    <!-- 引入系统信息警告的JS -->
    <script src="${basePath}js/alert.js"></script>
    <!-- to -->
    <script src="${basePath}js/toggles.min.js"></script>
    <!-- 引入 -->
    <script src="${basePath}js/jquery.bootstrap-touchspin.min.js"></script>
    <!-- toggle -->
    <link href="${basePath}css/toggles.css" rel="stylesheet"/>
    <!-- 引入加减 -->
    <link href="${basePath}css/jquery.bootstrap-touchspin.min.css" rel="stylesheet"/>


    <style>

        .header .title {
            position: relative;
        }

        .login-footer .btn {
            float: right;
            margin-right: 20px;
        }

        .login-footer {
            background: #FFFFFF;
        }

        .user-main {
            position: fixed;
            top: 100px;
            height: calc(100% - 180px);
        }
    </style>
</head>
<body>
<header class="header com-bj">
    <a href="${basePath}reception/list.do">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>

    <div class="title">次卡消费
        <a class="btn btn-default btn-tg btns daogo">导购:</a>
    </div>

</header>
<div class="user-main">
    <div class="media">
        <div class="media-left media-top">
            <img src="${basePath}img/timg.jpg" class="media-object" style="width:150px">
        </div>
        <div class="media-body">
            <div class="row">
                <div class="col-lg-4 col-sm-4">
                    <div class="input-group">
                        <input type="hidden" id="memberNumber" value="${requestScope.result.memberNumber}">
                        <span class="input-group-addon" style="text-align: left;">会员卡号:</span><font
                            style="font-size: 18px;">${requestScope.result.memberNumber}</font>
                    </div>
                </div>
                <div class="col-lg-6 col-sm-6">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">余&nbsp;&nbsp;&nbsp;额:</span><font
                            style="font-size: 18px; color: red;">￥：${requestScope.result.memberBalance}</font>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-sm-4">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">会员姓名:</span><font
                            style="font-size: 18px;">${requestScope.result.memberMemberidname}</font>
                    </div>
                </div>
                <div class="col-lg-6 col-sm-6">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">积&nbsp;&nbsp;&nbsp;分:</span><font
                            style="font-size: 18px; color: red;">￥：${requestScope.result.memberIntegral}</font>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-sm-4">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">会员电话:</span><font
                            style="font-size: 18px;">${requestScope.result.memberPhonenumber}</font>
                    </div>
                </div>
                <form id="saleCard">
                    <input type="hidden" name="memberName" value="${requestScope.result.memberMemberidname}">
                    <input type="hidden"  name="memberId" value="${requestScope.result.memberMemberid}">
                    <input type="hidden" id="cardid" name="cardid" value="">
                    <input type="hidden" id="memberNumber2"  value="${requestScope.result.memberNumber}">
                    <input type="hidden" id="type" name="type" value="">
                    <input type="hidden" id="guide" name="guide" value="">
                    <input type="hidden" id="id" name="cardMemberId" value="">
                    <input type="hidden" id="startime"  value="">
                    <input type="hidden" id="endtime"  value="">

                    <div class="col-lg-6 col-sm-6">
                        <div class="input-group">
                            <span class="input-group-addon" style="text-align: left; padding-bottom: 20px;">消费次数:</span>
                            <div style="width: 100px;float: left;" class="">
                                <input class="vertical-spin" type="text" value="" id="cardnum" name="cardnum"
                                       data-bts-button-down-class="btn btn-primary"
                                       data-bts-button-up-class="btn btn-primary"
                                       style="float: left; height: 35px; border: 1px solid #C8C8C8;">
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- 大内容 -->
    <div class="panel">
        <div class="panel-body">
            <div class="modal-body" style="height: 537px;">
                <!-- 右边table1 -->
                <div class="xsdj-table">
                    <table id="table1" data-resizable="true">
                        <thead>
                        <tr>
                            <th data-field="id">次卡编码</th>
                            <th data-field="name">次卡名称</th>
                            <th data-field="num">可用次数</th>
                            <th data-field="t1">生效日期</th>
                            <th data-field="t2">截止日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${requestScope.cardMembers}" var="aa">
                            <input type="hidden" name="${aa.memberCardId}" value="${aa.id}">
                            <tr>
                                <td>${aa.memberCardId}</td>
                                <td>${aa.memberCardName}</td>
                                <td>${aa.num}</td>
                                <td>
                                    <fmt:formatDate value="${aa.time}"
                                                    pattern="yyyy-MM-dd"></fmt:formatDate>
                                </td>
                                <td>
                                    <fmt:formatDate value="${aa.endtime}"
                                                    pattern="yyyy-MM-dd"></fmt:formatDate>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- 右边Table1结束 -->
            </div>
        </div>
    </div>
</div>
<c:forEach items="${requestScope.cardMembers}" var="bb">
    <input type="hidden" name="${bb.memberCardId}" value="${bb.id}">
</c:forEach>
<div class="login-footer">
    <i class="fa  fa-keyboard-o"></i>
    <button class="btn btn-info" onclick="tuiCar()" style="background-color: #ee3d3d !important; border: 1px solid #ee3d3d !important">退卡
    </button>
    <button class="btn btn-info" onclick="saleCard()">消费</button>
    <button class="btn btn-info" onclick="buyCard()">购买次卡</button>
</div>

<div class="right-menu">
    <div class="right-menu-close">
        <i class="iconfont icon-x "></i>
    </div>
    <div class="right-menu-body">
        温馨提示：使用会员必须联网，请确保您的店里已经连接网络！
    </div>
</div>


<%--导购弹窗--%>
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel5"> 选择导购员 </h4>
            </div>
            <div class="modal-body">
                <div class="search">
                    <div class="input-group m-t-10 p-10">
                        <input type="email" id="GuideId" name="GuideId" class="form-control" placeholder="按工员/姓名/手机号码"/>
                        <span class="input-group-btn"> <button type="button" id="searchGuide"
                                                               class="btn btn-info">搜索</button> </span>
                    </div>
                </div>
                <div class="table-fex">
                    <div class="list">
                        <table id="table" data-resizable="true">
                            <thead>
                            <tr>
                                <th data-field="name">名称</th>
                                <th data-field="id">工号</th>
                                <th data-field="phone">手机号码</th>
                            </tr>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-block btn-lg sure8" id="selectGuide"> 选择</button>
                </div>
            </div>
        </div>
    </div>
</div>

<input type="hidden" id="num" value="">

<div style="display: none;padding: 0.05em;">
    <div id="ddd" style="width: 100%; font-family: '宋体';">
        <div style="text-align: center; font-size: 0.48em;"><span id="shopName"></span>次卡消费</div>
        </br>
        <div style="margin-top: 5px; margin-bottom: 0.05em; border-bottom: 0.05em dashed #000;"></div>
        <div style="font-size: 0.32em">消费单号：<span id="investNumber"></span></div>
        <div style="font-size: 0.32em">收银台：<span style="margin-right: 10%">${sessionScope.cashierNumber}</span>导购员：<span id="daogou"></span></div>
        <div style="font-size: 0.32em">下单时间：<span id="outDate"></span></div>
        <div style="margin-top: 5px; margin-bottom: 0.05em; border-bottom: 0.05em dashed #000;"></div>

        <div style="font-size: 0.32em">次卡名称：<span id="good1"></span></div>
        <div style="font-size: 0.32em">消费次数：<span id="good2"></span></div>

        <div style="margin-top: 5px; margin-bottom: 0.05em; border-bottom: 0.05em dashed #000;"></div>
        <div style="font-size: 0.32em">会员卡号：<span id="memberId"></span></div>
        <div style="font-size: 0.32em">会员姓名：<span id="memberName"></span></div>
        <div style="font-size: 0.32em">通用余额：<span id="balance"></span></div>
        <div style="font-size: 0.32em">持有积分：<span id="integral"></span></div>
        <div style="font-size: 0.32em">持有可用次卡：<span id="availableNum"></span></div>
        <div style="font-size: 0.32em">剩余次数：<span id="overNum"></span></div>
        <div class="row" style="font-size: 0.38em;">
            <div class="col-sm-12 col-sm-12" style="text-align: center;">广东省广州市白云区七星岗商业街盈润商务中心
            </div>
        </div>
        </br>
        <div class="row" style="font-size: 0.38em;">
            <div class="col-sm-12 col-sm-12" style="text-align: center;">感谢您的光临！</div>
        </div>
    </div>
</div>

<script src="${basePath}js/printjs.js"></script>

<script type="text/javascript">

    var daogou;

    //默认得到所有导购信息
    $(function(){
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreShoppingGuide/selectAllAjax.do",
            success: function (msg) {
                $("#table").bootstrapTable('removeAll');
                $("#table").bootstrapTable('append', msg);
            }
        });
    })

    $(function () {
        var num=${sessionScope.shoppingguide}+"";
        if(num==1){
            $('#SelectService').modal('show');
        }

    })

    //选择导购员
    // 选择导购
    $('.daogo').on('click', function () {
        $('#SelectService').modal('show');
    })
    $('#table').bootstrapTable({
        url: 'json/data1.json',
        method: "get",
        checkbox: true,
        onClickRow: function (row, $element) {
            $('.info').removeClass('info');
            $($element).addClass('info');
        },

    })
    //点击导购时触发
    $('#searchGuide').click(function () {
        $.ajax({
            type: "POST",
            url: "${basePath}zomoreShoppingGuide/selectByidAjax.do",
            data: {"GuideId": $('#GuideId').val()},
            success: function (msg) {
                $("#table").bootstrapTable('removeAll');
                $("#table").bootstrapTable('append', msg);
            }
        });
    });
    //回车导购时触发
    $('#GuideId').bind('keypress', function (event) {
        if (event.keyCode == "13") {
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreShoppingGuide/selectByidAjax.do",
                data: {"GuideId": $('#GuideId').val()},
                success: function (msg) {
                    $("#table").bootstrapTable('removeAll');
                    $("#table").bootstrapTable('append', msg);
                }
            });

        }
    });
    $('#selectGuide').click(function () {
        $('#guide').val($("#table>tbody>tr[class='info']>td:eq(0)").text());
        daogou = $("#table>tbody>tr[class='info']>td:eq(0)").text();
        $('.daogo').text("导购:" + daogou);
        $('#SelectService').modal('hide');
    });

    //次卡充值（购买）
    function buyCard() {
        window.location.href = "${basePath}zomoreMember/BuyCard.do?id=" + $('#memberNumber').val();
    }
    //次卡消费
    function saleCard() {

        var cardconsume = ${sessionScope.zomoreCashierBeforeRight.cardconsume}+"";
        if (cardconsume=='0'){
            alert("该收银台没有次卡消费的权限");
            return false;
        }
        var startime = $("#startime").val();
        var endtime = $("#endtime").val();
        console.log(startime);
        console.log(endtime);
        var curdate = new Date();
        var curtime = curdate.getFullYear()+"-"+(curdate.getMonth()+1)+"-"+(curdate.getDate());
        console.log(curtime);
       //比较日期
        var d1 = new Date(Date.parse(startime));
        var d2= new Date(Date.parse(endtime));
        var d3= new Date(Date.parse(curtime));
        var index = 0;
        if(d1<=d3&&d2>=d3){
            index=1;
        }
        if(index==0){
            alert("请选择有效期内的次卡！");
            return false;
        }

        if(Number($('#cardnum').val())> Number($('#num').val())){
            if($('#num').val()==''){
                alert("请选择次卡");
            }else {
                alert("次卡消费次数不足，请充值");
            }
        }else if($('#cardnum').val()!=''){
            $.ajax({
                type: "POST",
                url: "${basePath}zomoreMember/saleCard.do",
                data: $('#saleCard').serialize(),
                contentType:"application/x-www-form-urlencoded;charset=utf-8",
                dataType: "json",
                success: function (msg) {
                    console.log(msg);

                    var inDate = new Date();
                    $("#investNumber").text(inDate.getTime());//单号

                    $("#daogou").text(daogou);
                    var outDate = new Date(msg.outDate);
                    outDate = outDate.toLocaleString('chinese', { hour12: false});
                    $("#outDate").text(outDate);//下单时间
                    $("#good1").text(msg.schemeName);
                    $("#good2").text(msg.outNum);

                    $("#memberId").text(msg.memberid);
                    $("#memberName").text(msg.memberName);

                    $("#balance").text(msg.balance);
                    $("#integral").text(msg.integral);
                    $("#availableNum").text(msg.subCard);
                    $("#overNum").text(msg.cardNum);

                    Print('#ddd', {
                        onStart: function () {
                            console.log('onStart', new Date());
                        },
                        onEnd: function () {
                            console.log('onEnd', new Date());
                            window.location.href="${basePath}reception/list.do";
                        }
                    });
                },
                error: function () {

                }
            });

        }else {
            alert("请选择次卡或者填入消费次卡数量");
        }
    }
    function tuiCar() {
        var returncard = ${sessionScope.zomoreCashierBeforeRight.returncard}+"";
       if (returncard=='0'){
            alert("该收银台没有退次卡的权限");
            return false;
        }
        $.ajax({
            type:"post",
            url: "${basePath}zomoreMember/tuiCard.do",
            data: $('#saleCard').serialize(),
            success:function (result) {
                if(result.msg=="success"){
                    alert("退卡成功");
                    window.location.href="${basePath}zomoreMember/searchMemberId.do?id="+$("#memberNumber2").val();
                }else {
                    alert(result.msg);
                }

            },
            error:function () {
                
            }
        });


    }
</script>
<script>
    var mathField;	//要使用健盘这个必须定义
    //此处必须定义，定义过后才能取得焦点
    $('.form-control').focus(function () {
        mathField = $(this);
    });
    //这里是为了显示健盘的事件
    $('.fa-keyboard-o').on('click', function () {
        keyword();
    })
    $('.logo').on('click', function () {
        if ($('.right-menu').is(':hidden')) {//如果当前隐藏
            $('.right-menu').show();//那么就显示div

        } else {//否则
            $('.right-menu').hide(200);//就隐藏div

        }
    })
    $('.right-menu-close').on('click', function () {
        $('.right-menu').hide(300);
    })
    // 选择折扣
    $('.usersale').on('click', function () {
        $('#UserSale').modal('show');
    })
    $(".list .list-group-item").on("click", function () {
        $(".list .list-group-item").removeClass("active");
        $(this).addClass("active")
    })

    // 选择导购
    $('.daogo').on('click', function () {
        $('#SelectService').modal('show');
    })

    //动态，获取会员的次卡
    $('#table1').bootstrapTable({
        onClickRow: function (row, $element) {
            $('.info').removeClass('info');
            $($element).addClass('info');
            $('#cardid').val(row.id)
            $('#num').val(row.num);
            $('#startime').val(row.t1);
            $('#endtime').val(row.t2);
            $('#id').val($("input[name='"+row.id+"']").val());
        }
    })


    $('.tags').on('click', function () {
        $('#myModalfull').modal('show');
    })
    $(".select-tags").on("click", function () {
        if ($(this).is('.active')) {
            $(this).removeClass("active");
        } else {
            $(this).addClass("active");
        }


    })
    $('#menu1 .toggle').toggles({
        on: true, text: {
            on: '是', // text for the ON position
            off: '否' // and off
        }, width: 100, // width used if not set in css
        height: 30, animate: 250, easing: 'swing'
    });
    $('.toggle').on('toggle', function (e, active) {
        if (active) {
            console.log('开启了');
        } else {
            console.log('关闭了');
        }
    });
    $('.toxb').toggles({on: true, text: {on: '58MM', off: '80MM'}, width: 100, height: 30});
    $('#menu3 .toggle').toggles({
        on: true, text: {
            on: '是', // text for the ON position
            off: '否' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });
    $('#menu5 .toggle').toggles({
        on: true, text: {
            on: '是', // text for the ON position
            off: '否' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });
    $('#menu6 .toggle').toggles({
        on: true, text: {
            on: '是', // text for the ON position
            off: '否' // and off
        }, width: 100, // width used if not set in css
        height: 30,
    });
    $('#menu7 .toggle').toggles({
        on: true, text: {
            on: '是', // text for the ON position
            off: '否' // and off
        }, width: 100, // width used if not set in css
        height: 30,
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
    //
    $('.menu2-an').on('click', function () {
        if ($(this).hasClass('active')) {
            $(this).removeClass('active');
            console.log(1)
        } else {
            $(this).addClass('active')
            //$(this).removeClass('active');
            console.log(2)
        }
        //console.log(tt);
    })
    jQuery(".select2").select2({
        width: '100%'
    });

    $('.groupleft a').on('click', function () {
        $(this).addClass('active');
        $(this).siblings().removeClass('active');
    })
</script>
<script src="${basePath}js/keyword.js"></script>
<script src="${basePath}js/bootstrap-inputmask.min.js"></script>
</body>
</html>
