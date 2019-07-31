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
    <title>商品分类</title>
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

    <header class="m-navbar">
        <a href="tabs.html" class="navbar-item"><i class="back-ico"></i></a>
        <div class="navbar-center"><span class="navbar-title">全部商品</span></div>
    </header>
        <div class="m-scrolltab" data-ydui-scrolltab>
            <div class="scrolltab-nav">
                <c:forEach items="${oneClassify}" var="oneClassify">
                    <a href="javascript:;" class="scrolltab-item">
                        <div class="scrolltab-icon"><i class="demo-icons-category1"></i></div>
                        <div class="scrolltab-title">${oneClassify.zomoreCommodityCategoryName}</div>
                    </a>
                </c:forEach>

               <%-- <a href="javascript:;" class="scrolltab-item">
                    <div class="scrolltab-icon"><i class="demo-icons-category2"></i></div>
                    <div class="scrolltab-title">洗护类</div>
                </a>--%>

            </div>
            <div class="scrolltab-content">
                        <c:forEach items="${oneClassify}" var="oneClassify">
                            <div class="scrolltab-content-item">
                             <article class="m-list list-theme3">
                            <c:forEach items="${twoClassify}" var="twoClassify">
                                    <c:if test="${twoClassify.zomoreCommodityCategoryParentid eq oneClassify.zomoreCommodityCategoryId}">
                                        <a href="${basePath}classify/findClassifyCommoditys.do?zomoreCommodityCategoryName=${twoClassify.zomoreCommodityCategoryName}" class="list-item">
                                            <div class="list-img">
                                                <img src="${basePath}images/shopImage3.jpg">
                                            </div>
                                            <div class="list-mes">
                                                <h3 class="list-title">${twoClassify.zomoreCommodityCategoryName}</h3>
                                            </div>
                                        </a>
                                    </c:if>
                            </c:forEach>
                             </article>
                          </div>
                        </c:forEach>
            </div>
        </div>
</section>
<%--尾部--%>
<%@include file="footer.jsp" %>

</body>
</html>
