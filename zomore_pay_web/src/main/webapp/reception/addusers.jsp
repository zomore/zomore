<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
    String num = request.getParameter("num");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>新增会员</title>
    <link href="${basePath}css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${basePath}css/icon.css" rel="stylesheet"/>
    <link href="${basePath}css/commons.css" rel="stylesheet"/>
    <!-- 引用阿里图标样式 -->
    <link href="${basePath}css/iconfont.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="${basePath}css/components.css" rel="stylesheet"/>
    <!-- 引入表格的样式  -->
    <link href="${basePath}css/bootstrap-table.min.js" rel="stylesheet"/>
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
<body>
<form action="${basePath}zomoreMember/insert.do" method="post">
<header class="header com-bj">
    <%--<a href="${basePath}reception/index.jsp">--%>
        <a href="#" onclick="javascript :history.back(-1);">
        <div class="close">
            <i class="fa  fa-mail-reply"></i>
        </div>
    </a>
    <div class="title">
        新增会员
    </div>
    <div class="logo">
        <i class="fa  fa-gears"></i>设置
    </div>
</header>

<div class="user-main">
    <div class="media">
        <div class="media-left media-top">
            <img src="${basePath}img/timg.jpg" class="media-object" style="width:150px">
            <p class="user-up-header">上传图片</p>
        </div>
        <%--隐藏域保存导购员名称--%>
        <input type="hidden" id="Guide" name="memberGrade" value="">
        <div class="media-body">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa  fa-asterisk"></i>会员卡号:</span>
                <input type="text" class="form-control" id="memberNumber" name="memberNumber" placeholder="请输入会员卡号" value="" autofocus="autofocus">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><font>&nbsp;</font>会员名称:</span>
                <input type="text" class="form-control" id="memberMemberidname" name="memberMemberidname" placeholder="请输入会员名称">
            </div>
            <div class="input-group">
                <span class="input-group-addon"><font>&nbsp;</font>确认密码:</span>
                <input type="text" class="form-control" id="memberPassword" name="memberPassword" placeholder="请输入会员密码">
            </div>
        </div>
    </div>
    <!-- 大内容 -->
    <div class="panel">
        <div class="panel-body">
            <ul class="list-group">
                <li class="list-group-item">
                    <span class="badge badge-danger usersale">默认会员等级(无折扣)<i class="fa   fa-edit"></i></span>
                    会员等级
                </li>
                <li class="list-group-item"><i class="fa  fa-asterisk"></i>会员姓名</li>
                <li class="list-group-item"><i class="fa  fa-asterisk"></i>会员电话</li>
                <li class="list-group-item">
     		        <span class="badge"> 
     				<input type="text" placeholder="年/月/日" data-mask="9999年99月99日"/></span>
                    过期时间
                </li>
                <li class="list-group-item">会员生日</li>
                <li class="list-group-item">
                    <span class="badge"><input type="text" placeholder="年/月/日" data-mask="9999年99月99日"/></span>
                    联系地址
                </li>
                <li class="list-group-item" style="padding: 20px 15px;">
                    <span class="badge tags"><i class="fa   fa-edit"></i></span>
                    标签
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="login-footer">
    <i class="fa  fa-keyboard-o"></i>
    <button class="btn btn-success" type="submit">确认提交</button>
    <button class="btn btn-info daogo" type="button">选择导购</button>
</div>
</form>
<%--<div class="right-menu">--%>
    <%--<div class="right-menu-close">--%>
        <%--<i class="iconfont icon-x "></i>--%>
    <%--</div>--%>
    <%--<div class="right-menu-body">--%>
        <%--一些文字提示内容，看你怎么去弄，或者去处理--%>
    <%--</div>--%>
</div>

<!-- 选择折扣 -->

<div class="modal fade" id="UserSale" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel6"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabel6"> 选择会员等级
                </h4>
            </div>
            <div class="modal-body">
                <div class="list">
                    <c:forEach items="${requestScope.memberGradeList}" var="list">
                        <a href="#" name="selectdengji" class="list-group-item">${list.membershiplevelName}</a>
                    </c:forEach>
                </div>

            </div>
            <div class="modal-footer">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-pink btn-block btn-lg" data-dismiss="modal">取消</button>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                    <button type="button" class="btn btn-info btn-block btn-lg sure8"> 确认</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 全屏model -->
<div class="modal fade  " id="myModalfull" data-backdrop="static" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabelfull" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header com-bj">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times;</button>
                <h4 class="modal-title" id="myModalLabelfull"> 选择导购员 </h4>
            </div>
            <div class="modal-body">
                <p>默认分组</p>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--xx--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--AA--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--BB--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--CC--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--DD--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">--%>
                    <%--<div class="select-tags">--%>

                        <%--EEE--%>
                    <%--</div>--%>
                <%--</div>--%>
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
<!-- 选择导购 -->

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

<script>
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
    $('#selectGuide').click(function () {
        $('#Guide').val($("#table>tbody>tr[class='info']>td:eq(0)").text());
        $('#SelectService').modal('hide');
    });
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

    $(".list .list-group-item").on("click", function () {

        $(".list .list-group-item").removeClass("active");
        $(this).addClass("active")
    });

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
</script>
<script src="${basePath}js/keyword.js"></script>
<script src="${basePath}js/bootstrap-inputmask.min.js"></script>
</body>
</html>
