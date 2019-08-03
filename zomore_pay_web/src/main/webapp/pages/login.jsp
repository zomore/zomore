<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <link rel="shortcut icon" href="${basePath}assets/images/favicon_1.ico">
    <link href="../css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../css/icon.css" rel="stylesheet"/>
    <link href="../css/commons.css" rel="stylesheet"/>
    <!-- 引用按钮样式 -->
    <link href="../css/components.css" rel="stylesheet"/>
    <!-- 引用键盘 -->

    <link href="../css/keyword/keyboard.css" rel="stylesheet"/>
    <!-- 引用全局JS -->
    <script src="../js/jquery.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <!-- 引用键盘的JS -->
    <script src="../js/keyword/jquery.slimscroll.min.js"></script>
    <script src="../js/keyword/chinese-pynsimpl.js"></script>
    <!-- 引用系统提示插件 -->
    <%--<script src="../js/alert.js"></script>--%>
    <script src="${basePath}js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        function login() {
            $("#deglu").submit();
        }

        //加载页面后加载次函数
        $().ready(function () {// 记住密码功能

            var str = decodeURIComponent(document.cookie.split(';')); // 获取Cookie

            // 以下是Cookie数据处理逻辑
            // 不同的项目存储的Cookie不同，处理数据的逻辑不同
            // 要根据具体的Cookie值来截取账号、密码

            //寻找loginInfo第一次出现的位置，找不到返回-1
            if (str.indexOf("loginInfo") > -1) {

                var arr = str.split("=");

              var loginInfo = arr[1];
                var namepass = loginInfo.split("+");
                var name = namepass[0];

               /* name = name.substring(name.lastIndexOf("=", name.length - 1) + 1);*/
                var phone = namepass[1];

                //自动填充用户名和密码
                $("#username").val(name);
                $("#password").val(phone);

                if (name!=null&&name!=""&&phone!=null&&phone!="") {
              $("#deglu").submit();
                }
            }
        });
    </script>

</head>
<form id="deglu" class="form-horizontal m-t-20" action="${pageContext.request.contextPath}/login.do" method="post">
    <body>
    <header class="header com-bj">
        <div class="close" onclick="close1()">
            <i class="fa fa-close"></i>
        </div>
        <div class="title">
            账号登录
        </div>
        <div class="logo">
            <img src="../img/logo.png"/>
        </div>
    </header>
    <div class="main">
        <div class="col-lg-5 col-xs-12 col-md-8 col-sm-7">
            <div class="panel">
                <div class="panel-body">

                    <div class="form-group">
                        <label class="col-sm-2 control-label">账号:</label>
                        <div class="col-sm-10">
                            <input type="text" name="username" class="form-control" autofocus="autofocus" required
                                   id="username" placeholder="请输入账号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">密码:</label>
                        <div class="col-sm-10">
                            <input type="password" name="password" class="form-control" id="password" required
                                   placeholder="请输入密码">
                        </div>
                    </div>


                </div>
                <div class="panel-footer">
                    <button type="button" onclick="login()" class="btn btn-success">登录</button>
                    <a class="btn btn-info" href="#">免费注册</a>
                    <p>联系客服</p>
                </div>
</form>
</div>

</div>
</div>
<div class="login-footer">
    <i class="fa  fa-keyboard-o"></i>
</div>
<script src="../js/page/login.js"></script>
<!-- 封装键盘插件必须在最下面 -->
<script src="../js/keyword.js"></script>
<script type="text/javascript">
    function close1() {
        window.close();
    }
</script>
</body>
</html>
