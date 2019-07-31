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
    <title>登录</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link rel="stylesheet" href="${basePath}css/ydui.css?rev=@@hash"/>
    <link rel="stylesheet" href="${basePath}css/demo.css"/>
    <script src="${basePath}js/ydui.flexible.js"></script>
</head>
<body>

<section class="g-flexview">
    <!--这是头部-->
    <header class="m-navbar">
        <div class="navbar-center">
            <span class="navbar-title">择沐美妆</span>
        </div>
    </header>

    <!--这里是logo图-->
    <div class="demo-pagetitle" style="text-align: center;">
        <div style="padding-left: 40%; margin-top: 10%; margin-bottom: 10%;">
            <img src="${basePath}images/logo.png" style="height: 100px; width: 100px;">
        </div>
    </div>
    <form action="${basePath}loginController/login.do" method="post">
        <!--这里是登录框-->
        <div class="m-cell">
            <div class="cell-item">
                <div class="cell-left">账号：</div>
                <div class="cell-right">
                    <input type="number" pattern="[0-9]*"  name="username" class="cell-input" placeholder="请输入账号" autocomplete="off"/>
                </div>
            </div>
            <div class="cell-item">
                <div class="cell-left">密码：</div>
                <div class="cell-right">
                    <input type="password" name="password"  pattern="[0-9]*" class="cell-input" placeholder="请输入密码" autocomplete="off"/>
                </div>
            </div>
        </div>
        <!--这里是登录按钮-->
        <div class="m-button">
            <button type="submit" class="btn-block btn-primary"> 登 录</button>
            <button type="reset" class="btn-block btn-danger"> 取 消</button>
        </div>
    </form>
</section>
<script src="${basePath}js/jquery-3.2.1.min.js"></script>
<script src="${basePath}js/ydui.js"></script>
<script>(!YDUI.device.isMobile && navigator.userAgent.indexOf('Firefox') >= 0) && YDUI.dialog.alert('PC端请使用谷歌内核浏览器查看！');</script>
<script>
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
        setTimeout(function () {
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
