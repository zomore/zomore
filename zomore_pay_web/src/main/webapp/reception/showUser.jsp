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
    <style>
        .header .logo {
            text-align: center;
            font-size: 20px;
            color: #FFFFFF;
            line-height: 100px;
        }

        .header .logo i {
            margin-right: 10px;
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
<header class="header com-bj">
    <a href="#" onclick="javascript :history.back(-1);">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">会员中心</div>
    <div class="logo">
        <i class="fa  fa-gears"></i>设置
    </div>
</header>
<form id="editMemberForm"  method="post">
<div class="user-main">
    <div class="media">
        <div class="media-left media-top">
            <img src="${basePath}img/timg.jpg" class="media-object" style="width:150px">
        </div>
        <div class="media-body">
            <div class="row">
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">会员卡号:</span><font
                            style="font-size: 18px;">
                        <input type="text" style="width: 95%" name="memberNumber" disabled value="${requestScope.result.memberNumber}"/>
                        <!-- ${requestScope.result.memberNumber} --></font>
                        <input type="hidden" name="memberMemberid" value="${requestScope.result.memberMemberid}">
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">余&nbsp;&nbsp;&nbsp;额:</span><font
                            style="font-size: 18px; color: red;">￥：${requestScope.result.memberBalance}</font>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <button type="button" class="btn btn-default " onclick="cz()"><span>充 值</span></button>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">会员姓名:</span><font
                            style="font-size: 18px;">
                        <input type="text" style="width: 95%" id="memberMemberidname" name="memberMemberidname" value="${requestScope.result.memberMemberidname}"/></font>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">积&nbsp;&nbsp;&nbsp;分:</span><font
                            style="font-size: 18px; color: red;">￥：${requestScope.result.memberIntegral}</font>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <button type="button" class="btn btn-default daogo"><span>兑 换</span></button>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">会员电话:</span><font
                            style="font-size: 18px;">
                        <input type="text" style="width: 95%" id="memberPhonenumber" name="memberPhonenumber" value="${requestScope.result.memberPhonenumber}"/></font>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <div class="input-group">
                        <span class="input-group-addon" style="text-align: left;">优惠券:</span><font
                            style="font-size: 18px; color: red;">￥：${requestScope.result.memberCoupon}</font>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-3">
                    <button type="button" class="btn btn-default "><span>查 看</span></button>
                </div>
            </div>
        </div>
    </div>
    <!-- 大内容 -->
    <div class="panel">
        <div class="panel-body">

            <ul class="list-group">
                <li class="list-group-item" style="padding: 20px 15px;"><span class="badge tags">选择标签 <i
                        class="fa   fa-edit"></i></span> 标签
                </li>
                <li class="list-group-item">
                    <font class="badge badge-danger">持有次卡：${requestScope.result.memberSubcard}张<a
                            href="${basePath}reception/searchUser.jsp"></a></font>
                    会员等级：<font>
                    <span class="badge badge-danger usersale"><a id="aa" name="memberGrade">${requestScope.result.memberGrade}</a>
                    <i class="fa fa-edit"></i></span></font>
                    <input type="hidden" id="memberGrade" value="${requestScope.result.memberGrade}">
                    <input type="hidden"  id="memberGradeSub" name="memberGrade" value="${requestScope.result.memberGrade}">
                </li>
                <li class="list-group-item">
                    <%-- <span class="badge badge-danger usersale">购 &nbsp;物 &nbsp;卡：${requestScope.result.memberShopcar}张<i
                             class="fa   fa-edit"></i></span>--%>
                    会员折扣：<font><a id="discount" >${requestScope.result.memberDiscount}%</a></font>
                    <input type="hidden" id="discountResource" value="${requestScope.result.memberDiscount}">
                        <input type="hidden" id="discountSub" name="memberDiscount" value="${requestScope.result.memberDiscount}">
                </li>
                <li class="list-group-item">
     				<span class="badge badge-danger">到期日期：<font>
                    <span class="badge">
                        <input type="date"  id="memberDuedate" name="memberDuedate" value="<fmt:formatDate
                            value="${requestScope.result.memberDuedate}"
                            pattern="yyyy-MM-dd"></fmt:formatDate>"
                               /></span></font>
                    </span>

                    会员生日：<font>
                    <span class="badge" style="text-align: left;">
                        <input type="date"  id="memberBirthday" name="memberBirthday"
                               value="<fmt:formatDate value="${requestScope.result.memberBirthday}"
                               pattern="yyyy-MM-dd"></fmt:formatDate>"
                               /></span></font>
                    </span></font>
                </li>
                <li class="list-group-item">
                    开卡日期：<font><fmt:formatDate value="${requestScope.result.memberDateofopeningcard}"
                                               pattern="yyyy-MM-dd"></fmt:formatDate></font>
                </li>
                <li class="list-group-item">
                    联系地址：<font><input type="text" id="memberAddress" name="memberAddress"
                                      style="width: 80%;"
                                      value="${requestScope.result.memberAddress}"/></font>
                </li>
            </ul>
        </div>
    </div>
</div>
<div class="login-footer">
    <i class="fa  fa-keyboard-o"></i>
    <a class="btn btn-info" onclick="editMember()" style="background-color: #ee3d3d !important; border: 1px solid #ee3d3d !important">确定
    </a>
    <button class="btn btn-info" type="button" onclick="cz()">充值</button>
    <button class="btn btn-info" type="button" onclick="buyCard()">购买次卡</button>

</div>
</form>>
<div class="right-menu">
    <div class="right-menu-close">
        <i class="iconfont icon-x "></i>
    </div>
    <div class="right-menu-body">
        温馨提示：使用会员必须联网，请确保您的店里已经连接网络！
    </div>
</div>


<!-- 选择会员等级 -->
<div class="modal fade" id="UserSale" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel6"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true" > &times;</button>
                <h4 class="modal-title" id="myModalLabel6"> 选择会员等级
                </h4>
            </div>
            <div class="modal-body">
                <div class="list">
                    <c:forEach items="${requestScope.memberGradeList}" var="list">
                        <a href="#" name="selectdengji" class="list-group-item">${list.membershiplevelName}</a>
                        <input type="hidden" name = "gradeDiscount" value = "${list.membershiplevelDiscount}">
                    </c:forEach>
                </div>

            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" id="cancelgrade" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" id="selectgrade" class="btn btn-info btn-block btn-lg sure8"> 确认</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%--会员号的隐藏域--%>
<input id="memberNum" value="${requestScope.result.memberNumber}">

<!-- 选择导购 -->
<div class="modal fade  " id="SelectService" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel5" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content" style="width: 700px; text-align: center; margin-left: -40%;">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel5"> 会员积分兑换 </h4>
            </div>
            <div class="modal-body">
                <input type="hidden" value="${requestScope.result.memberIntegral}" id="dangqianjifen">
                <input type="hidden" value="" id="xuyaojifen">
                <form id="a1" action="${basePath}zomoreMember/changeIntegral.do">
                    <div class="input-group" style="width: 100%; padding-top: 10px; background: #e4e4e4;">
                        <font style="font-size: 18px;">会员卡号：${requestScope.result.memberNumber}</font>
                        <font style="font-size: 18px; margin-left: 2%;">会员：${requestScope.result.memberMemberidname}</font>
                        <font style="font-size: 18px; margin-left: 21%;">当前积分：${requestScope.result.memberIntegral}</font>
                    </div>
                    <input type="hidden" name="memberNum" value="${requestScope.result.memberNumber}">
                    <input type="hidden" name="memberName" value="${requestScope.result.memberMemberidname}">
                    <div class="search">
                        <div class="input-group m-t-10 p-10">
                            <input type="text" id="integral" name="integral" class="form-control"
                                   placeholder="输入兑换的积分数量"/>
                            <span class="input-group-btn">
                            <button type="button" onclick="submit1()" class="btn btn-info">兑换积分</button></span>
                        </div>
                    </div>
                </form>
                <form id="a2" action="${basePath}zomoreMember/changeIntegral.do">
                    <input type="hidden" name="memberNum" value="${requestScope.result.memberNumber}">
                    <input type="hidden" name="memberName" value="${requestScope.result.memberMemberidname}">
                    <div class="table-fex">
                        <div class="list">
                            <c:forEach items="${requestScope.zomoreIntegralExchanges}" var="result">
                                <a href="#" class="list-group-item" style="text-align: left;"
                                   name="${result.echange}"
                                   id="${result.echangeIntegral}">${result.echangeIntegral}积分兑换${result.echange}</a>
                            </c:forEach>
                            <input type="hidden" id="commodit" name="commodit">
                            <input type="hidden" id="num" name="num">
                            <%--<a href="#" class="list-group-item" style="text-align: left;">1000积分兑换美肤宝防晒霜1瓶</a>
                            <a href="#" class="list-group-item" style="text-align: left;">1000积分兑换美肤宝防晒霜1瓶</a>
                            <a href="#" class="list-group-item" style="text-align: left;">1000积分兑换美肤宝防晒霜1瓶</a>--%>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                            <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal"> 取 消
                            </button>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                            <button type="button" onclick="submit2()" class="btn btn-info btn-block btn-lg sure8"> 兑 换</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<!-- 选择标签全屏model -->
<div class="modal fade  " id="myModalfull" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabelfull" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabelfull"> 会员标签 </h4>
            </div>
            <div class="modal-body">
                <p>默认分组</p>
                <%-- <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">
                         xx
                     </div>
                 </div>
                 <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">
                         AA
                     </div>
                 </div>
                 <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">
                         BB
                     </div>
                 </div>
                 <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">

                         CC
                     </div>
                 </div>
                 <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">

                         DD
                     </div>
                 </div>
                 <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                     <div class="select-tags">

                         EEE
                     </div>
                 </div>--%>
            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6" style="text-align: left;">
                    <button type="button" class="btn btn-pink  btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-lg sure8" style="padding: 10px 36px;"> 确定</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 全屏结束 -->

<script>
    function submit1() {
        if(Number($('#dangqianjifen').val())<Number($('#integral').val())){
            alert("积分不足");
        }else {
            $("#a1").submit();
        }
    }
    function submit2() {
        if(Number($('#dangqianjifen').val())<Number( $('#xuyaojifen').val())){
            alert("积分不足");
        }else {
            $("#a2").submit();
        }
    }

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
    });

    $("a[name='selectdengji']").click(function () {
        var dengji = $(this).text();
        // alert(dengji);
        $('#aa').text(dengji);
        $("#memberGradeSub").val(dengji);
        var dis =$(this).next().val();
        $("#discount").text(dis+"%");
        $("#discountSub").text(dis);

    });

    $("#selectgrade").click(function () {
        $("#UserSale").modal('hide');
    });

    $("#cancelgrade").click(function () {
       var grade = $("#memberGrade").val();
        var dis2= $("#discountResource").val();
        $('#aa').text(grade);
        $("#memberGradeSub").val(grade);

        $("#discount").text(dis2+"%");
        $("#discountSub").text(dis2);
    });

    //点击选择兑换商品
    $(".list .list-group-item").on("click", function () {
        $(".list .list-group-item").removeClass("active");
        $(this).addClass("active")
        $('#commodit').val($(this).attr("name"));
        $('#num').val($(this).attr("id"));
        $('#xuyaojifen').val($(this).attr("id"));
    })

    // 选择导购
    $('.daogo').on('click', function () {

        var memberintegralexhange = ${sessionScope.zomoreCashierBeforeRight.memberintegralexhange}+"";
        if (memberintegralexhange=='0'){
            alert("该收银台没有积分兑换的权限");
            return false;
        }

        $('#SelectService').modal('show');
    });
    $('#table').bootstrapTable({
        url: 'json/data1.json',
        method: "get",
        checkbox: true,
        onClickRow: function (row, $element) {
            $('.info').removeClass('info');
            $($element).addClass('info');
        },


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
    //点击充值
    function cz() {
        window.location.href = "${basePath}zomoreMemberInputrule/cz.do?memberNum=" + $("#memberNum").val();
    }
    //次卡充值（购买）
    function buyCard() {
        window.location.href="${basePath}zomoreMember/BuyCard.do?id="+$('#memberNum').val();
    }
    function editMember() {

        var editmember = ${sessionScope.zomoreCashierBeforeRight.editmember}+"";
        if (editmember=='0'){
            alert("该收银台没有编辑会员的权限");
            return false;
        }

        var memberMemberidname= $("#memberMemberidname").val();
        if(memberMemberidname==null||memberMemberidname==""){
            alert("会员姓名不能为空！");
            return false;
        }
        var memberPhonenumber= $("#memberPhonenumber").val();
        if(memberPhonenumber==null||memberPhonenumber==""){
            alert("会员电话不能为空！");
            return false;
        }

        $.ajax({
            type:"post",
            url:"${basePath}zomoreMember/updataMemberNum.do",
            data:$('#editMemberForm').serialize(),
            success:function (msg) {
                alert("修改成功!");
            },
            error:function () {
                alert("失败");
            }
        });


    }
</script>
<script src="${basePath}js/keyword.js"></script>
<script src="${basePath}js/bootstrap-inputmask.min.js"></script>
</body>
</html>
