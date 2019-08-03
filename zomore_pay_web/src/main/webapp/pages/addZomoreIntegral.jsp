<%--
  Created by IntelliJ IDEA.
  User: star
  Date: 2019/3/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>
<html>
<head>
    <title>更新积分规则</title>
    <link rel="icon" href="${basePath}assets/images/favicon.ico" type="image/x-icon">
</head>
<body>
<form action="" method="post">
    <input type="hidden" value="${requestScope.result.integralRuleId}" name="integralRuleId">
    <input type="hidden" value="${requestScope.result.integralRuleTypeRule}" name="integralRuleTypeRule">
    <input type="hidden" value="${requestScope.result.integralRuleCycle}" name="integralRuleCycle">
    <table align="center">
        <tr>
            <td style="text-align: right">积分方式</td>
            <td>
                <input type="radio" name="integralRuleType" value="1"
                <c:if test="${requestScope.result.integralRuleType==1}"> checked</c:if>
                >按金额积分&nbsp;
                <input type="radio" name="integralRuleType" value="2"
                <c:if test="${requestScope.result.integralRuleType==2}"> checked</c:if>
                >按商品积分&nbsp;
                <input type="radio" name="integralRuleType" value="3"
                <c:if test="${requestScope.result.integralRuleType==3}"> checked</c:if>
                >积点方式&nbsp;
            </td>
        </tr>
        <tr>
            <td style="text-align: right">积分方式的规则</td>
            <td>
           每消费<input type="text" name="TypeRule" value="" style="width: 64px">元积1分
                 <input type="checkbox" name="TypeRule1"> 积分取整数
                <input type="checkbox" name="TypeRule2"> 无码商品参与积分
            </td>
        </tr>
        <tr>
            <td style="text-align: right; vertical-align: top">指定周期多倍积分</td>
            <td>
                <%-- <input type="text" name="integralRuleCycle" value="${requestScope.result.integralRuleCycle}">--%>
                <input type="radio" name="one" value="1">每周
                <select name="week">
                    <option name="week1" value="1">星期一</option>
                    <option name="week1" value="2">星期二</option>
                    <option name="week1" value="3">星期三</option>
                    <option name="week1" value="4">星期四</option>
                    <option name="week1" value="5">星期五</option>
                    <option name="week1" value="6">星期六</option>
                    <option name="week1" value="7">星期日</option>
                </select>
                消费获<input type="text" name="week2" style="width: 50px">倍积分&nbsp;<br>

                <input type="radio" name="one" value="2">每月
                <input type="text" name="month" style="width: 64px">
                消费获<input type="text" name="month1" style="width: 50px"> 倍积分&nbsp;<br>
                <input type="radio" name="one" value="3">每月逢
                <input type="text" name="whenMonth" style="width: 64px">消费获<input type="text" name="whenMonth1"
                                                                                  style="width: 50px"> 倍积分&nbsp;<br>
            </td>
        </tr>
        <tr>
            <td style="text-align: right">兑换方式</td>
            <td>
                <input type="radio" name="integralRuleExchange" value="1"
                <c:if test="${requestScope.result.integralRuleExchange==1}"> checked</c:if>
                >兑换礼品&nbsp;
                <input type="radio" name="integralRuleExchange" value="2"
                <c:if test="${requestScope.result.integralRuleExchange==2}"> checked</c:if>
                >抵扣现金&nbsp;
                <input type="radio" name="integralRuleExchange" value="3"
                <c:if test="${requestScope.result.integralRuleExchange==3}"> checked</c:if>
                >无&nbsp;

        <tr>
            <td style="text-align: right">是否清空积分</td>
            <td>
                <input type="radio" name="integralRuleIsempty" value="1"
                <c:if test="${requestScope.result.integralRuleIsempty==1}"> checked</c:if>
                >是&nbsp;
                <input type="radio" name="integralRuleIsempty" value="0"
                <c:if test="${requestScope.result.integralRuleIsempty==0}"> checked</c:if>
                >否
        </tr>

        <tr>
            <td style="text-align: right">
                <input type="submit" value="提交" id="submit">
            </td>
            <td><input type="button" onclick="javascript:history.go(-1)" value="返回"/></td>
        </tr>
    </table>
</form>
<script src="../assets/js/jquery.min.js"></script>
<script type="text/javascript">

    $(function () {
        $("#submit").click(function () {
            //拼接积分方式的规则
            var a = $("input[name='TypeRule']").val();
            if ($("input[name='TypeRule1']").is(':checked')) {
                //选中
                var b = "1";
            } else {
                //未选中
                var b = "0";
            }
            if ($("input[name='TypeRule2']").is(':checked')) {
                //选中
                var c = "1";
            } else {
                //未选中
                var c = "0";
            }
            $("input[name='integralRuleTypeRule']").attr("value",a + "," + b + "," + c);

            //拼接指定周期多倍积分
            var a1 = $("input[name='one']:checked").val();
            if (a1!=undefined) {
                if (a1 == "1") {
                    var b1 = $("select[name='week'] option:checked").val();
                    var c1 = $("input[name='week2']").val();
                    if(c1==""){
                        c1=0;
                    }
                }else if (a1 == "2") {
                    var b1 = $("input[name='month']").val();
                    if(b1==""){
                        b1=0;
                    }
                    var c1 = $("input[name='month1']").val();
                    if(c1==""){
                        c1=0;
                    }
                }else if (a1 == "3") {
                    var b1 = $("input[name='whenMonth']").val();
                    if(b1==""){
                        b1=0;
                    }
                    var c1 = $("input[name='whenMonth']").val();
                    if(c1==""){
                        c1=0;
                    }

                }
                $("input[name='integralRuleCycle']").attr("value",a1 + "," + b1 + "," + c1);
            }else {
                $("input[name='integralRuleCycle']").attr("value",0 + "," + 0 + "," + 0);
            }
            document.forms[0].action ="${basePath}zomoreIntegral/add.do";
        });
        //选中指定周期多倍积分
       /* var RuleCycle1=$("input[name='integralRuleCycle']").val();
        var RuleCycle=RuleCycle1.split(",");
        $("input[name='one']").each(function () {
            if($(this).val()==RuleCycle[0]){
                $(this).attr("checked","checked");
            }
        });

        if(RuleCycle[0]=='1'){
            $("option[name='week1']").each(function () {
                if($(this).val()==RuleCycle[1]){
                    $(this).attr("selected","selected");
                }
            });
            $("input[name='week2']").attr("value",RuleCycle[2])
        }
        if(RuleCycle[0]=='2'){
            $("input[name='month']").attr("value",RuleCycle[1])
            $("input[name='month1']").attr("value",RuleCycle[2])
        }
        if(RuleCycle[0]=='3'){
            $("input[name='whenMonth']").attr("value",RuleCycle[1])
            $("input[name='whenMonth1']").attr("value",RuleCycle[2])
        }*/
    });
</script>
</body>
</html>
