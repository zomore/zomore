<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<footer class="m-tabbar">
    <a href="../pages/index.jsp" class="tabbar-item">
                <span class="tabbar-icon">
                    <i class="icon-home-outline"></i>
                </span>
        <span class="tabbar-txt">首页</span>
    </a>
    <a href="${basePath}classify/selectClassify.do" class="tabbar-item">
                    <span class="tabbar-icon">
                    <i class="iconfont" style="font-size: 28px; margin-right: 5px; color: #999999;">&#58897;</i>
                </span>
        <span class="tabbar-txt">分类</span>
    </a>
    <a href="${basePath}memberShop/gotoMyShopcar.do" class="tabbar-item">
                <span class="tabbar-icon">
                    <i class="icon-shopcart-outline"></i>
                    <span class="tabbar-dot"></span>
                </span>
        <span class="tabbar-txt">购物车</span>
    </a>
    <a href="${basePath}memberShop/findMemberData.do" class="tabbar-item">
                    <span class="tabbar-icon">
                        <i class="icon-ucenter-outline"></i>
                        <span class="tabbar-dot"></span>
                    </span>
        <span class="tabbar-txt">个人中心</span>
    </a>
</footer>
</body>
</html>
