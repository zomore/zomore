<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
pageContext.setAttribute("basePath", request.getContextPath() + "/");
%>


<!DOCTYPE html>

<html>
 <head> 
  <meta charset="utf-8" /> 
  <title>择沐收银台</title> 
  <link href="${basePath}css/bootstrap.min.css" rel="stylesheet" />
  <link href="${basePath}css/icon.css" rel="stylesheet" />
  <link href="${basePath}css/commons.css" rel="stylesheet" />
  <!-- 引用阿里图标样式 --> 
  <link href="${basePath}css/iconfont.css" rel="stylesheet" />
  <!-- 引用按钮样式 --> 
  <link href="${basePath}css/components.css" rel="stylesheet" />
  <!-- toggle -->
  <link href="${basePath}css/toggles.css" rel="stylesheet"/>
 
  <!-- 引入加减 -->
  <link href="${basePath}css/jquery.bootstrap-touchspin.min.css"  rel="stylesheet"/>
  <!-- 轮播图样式 -->
  <link rel="stylesheet" href="${basePath}css/style.css">
  
  <!-- 引入jquery的JS --> 
  
  <script src="${basePath}js/jquery.min.js"></script>
  <script src="${basePath}js/bootstrap.min.js"></script>
   <!-- to -->
  <script src="${basePath}js/toggles.min.js"></script>
  <!-- 引入 -->
  <script src="${basePath}js/jquery.bootstrap-touchspin.min.js"></script>
  <!-- 引入系统信息警告的JS --> 
  <script src="${basePath}js/alert.js"></script>
  
        <style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
@keyframes slidy {
0% { left: 0%; }
20% { left: 0%; }
25% { left: -100%; }
45% { left: -100%; }
50% { left: -200%; }
70% { left: -200%; }
75% { left: -300%; }
95% { left: -300%; }
100% { left: -400%; }
}
* {
  box-sizing: border-box;
}
body, figure { 
  margin: 0; background: #ffffff;
  font-family: Istok Web, sans-serif;
  font-weight: 100;
}
div#captioned-gallery { 
  width: 100%; overflow: hidden; 
}
figure.slider { 
  position: relative; width: 500%;
  font-size: 0; animation: 6s slidy infinite; 
}
figure.slider figure { 
  width: 20%; height: auto;
  display: inline-block;  position: inherit; 
}
figure.slider img { width: 100%; height: auto; }
figure.slider figure figcaption { 
  position: absolute; bottom: 0;
  background: rgba(0,0,0,0.4);
  color: #fff; width: 100%;
  font-size: 2rem; padding: .6rem; 
}


    </style>
  
 </head> 
 <body> 
  <div class="two-main"> 
   <div class="two-main-left col-lg-2 col-md-3 col-sm-3  "> 
    <div class="two-main-left-content1" style="height: 100%;">  
     <div class="t-m-table" style="height: 92%;"> 
      <table class="table" style="margin-bottom: 0px;"> 
       <tbody>
        <tr style="background-color: #3dacdf; color:#f3f3f3"> 
         <td class="allprice"><h3>您好!</h3></td> <%--localStorage.membername--%>
         <td class="allprice" style="text-align: left;"><h3 class="h3a"></h3></td>
         <td class="allprice"></td> 
       </tbody>
      </table> 
      <table class="table" style="margin-bottom: 0px;"> 
       <tbody style="background: #3eb5eb; color: #f3f3f3">
        <tr style="text-align: center;">
         <td class="t-title"><font style="color: #f3f3f3; font-size: 20px;">余额</font></td>
         <td class="t-title"><font style="color: #f3f3f3; font-size: 20px;">积分</font></td>
        </tr>
        <tr style="text-align: center;">
         <td class="t-title1">￥ 0.00</td>
         <td class="t-title2">0</td>
        </tr> 
       </tbody>
      </table> 
      <table class="table" style="margin-bottom: 0px;"> 
       <tbody style="background: #58c0ef; color: #f3f3f3">
        <tr> 
         <td style="text-align: right;"><font style="color: #f3f3f3; font-size: 20px;">总额</font></td> 
         <td style="text-align: left;" class="t-title3"><font style="color: #f3f3f3; font-size: 20px;">￥ 0.00</font>
         </td> 
        </tr> 
       </tbody>
      </table>
      <table class="table" id="table1">
       <tbody >

       </tbody>
      </table>
    </div>
    <table class="table">
       <tbody style="background: #58c0ef; color: #f3f3f3">
        <tr>
         <td style="text-align: left;"><font style="color: #f3f3f3; font-size: 20px;"><marquee behavior="left">${sessionScope.shopName}欢迎您光临！</marquee></font>
         </td>
        </tr>
       </tbody>
      </table>
     </div> 
    </div>
   <div class="two-main-right col-lg-10 col-md-9 col-sm-9 com-bjs1" >
    <div class="t-m-r-c"> 
     <div class="p-10 tmrc-co"> 
     	<div id="captioned-gallery">
	<figure class="slider">
		<figure>
			<img src="${basePath}img/agsquare.png" alt style="height: 100%;width: 100%;">
		</figure>
		<figure>
			<img src="${basePath}img/agsquare.png" alt>
		</figure>
<figure>
			<img src="${basePath}img/agsquare.png" alt>
		</figure>
		<figure>
			<img src="${basePath}img/agsquare.png" alt>
		</figure>
		<figure>
			<img src="${basePath}img/agsquare.png" alt>
		</figure>
	</figure>
</div>
    </div> 
   </div> 
  </div>
  <script>


      /*$(document).attr("h3a",localStorage.getItem("memberName"));//修改title值allmoneytoFuping*/
      // $("#h3a").attr("value",localStorage.getItem("memberName"));
      // $("#h3a").html(localStorage.getItem("memberName"));
      // console.log($("#h3a"));
      function freash() {
/*alert("123");



          /* alert(localStorage.getItem("memberBalance"));*!//!**/

          var a = localStorage.getItem("memberBalance");
          var b = localStorage.getItem("memberIntegral");
          var c = localStorage.getItem("allmoneytoFuping");

          $(".h3a").html(localStorage.getItem("memberName"));//修改会员名
          if (localStorage.getItem("memberBalance") == null || localStorage.getItem("memberBalance") == "") {
              $(".t-title1").html("￥ 0.00");//修改余额
              /* alert("111");*/
          } else {
              $(".t-title1").html("￥" + localStorage.getItem("memberBalance"));//修改余额
          }
          if (localStorage.getItem("memberIntegral") == null || localStorage.getItem("memberIntegral") == "") {
              $(".t-title2").html("0");
          } else {
              $(".t-title2").html(localStorage.getItem("memberIntegral"));//修改积分
          }
          if (localStorage.getItem("allmoneytoFuping") == null || localStorage.getItem("allmoneytoFuping") == "") {
              $(".t-title3").html("￥ 0.00");
          } else {
              $(".t-title3").html("￥" + localStorage.getItem("allmoneytoFuping"));//修改总价
          }

      }

  /*        function freash1(){
          $("#table1 tbody").empty();
          var html="";
          var list =${sessionScope.fenping};
          for(var i=0;i<list.length;i++){
              html = "<tr>\n" +
                  "                                <td>" + i + "</td>\n" +
                  "                                <td>" + list[i].name + "</td>\n" +
                  "                                <td>" + list[i].num + "</td>\n" +
                  "                                <td>" + list[i].money + "</td>\n" +
                  "                                <td>" + "-" + "</td>\n" +
                  "                                <td>" + "-" + "</td>"+
                  "                                 </tr>";
              $('#table1 tbody').append(html);
          }

 /!*        /!*  $(".t-title1").html("￥"+localStorage.getItem("memberBalance"));//修改余额
          $(".t-title2").html(localStorage.getItem("memberIntegral"));//修改积分
          $(".t-title3").html("￥"+localStorage.getItem("allmoneytoFuping"));//修改总价*!/!*!/

      }*/
                   //循环执行，定时10秒
          function test() {

              /*$.ajax({
                  type: "post",
                 url:"${basePath}fuping/fenpingGetMsg1.do",//请求地址
                  //data: {carno:'1009'},             //请求参数
                  success: function (data) {
                      console.info(data);
                      var testTbody = $("#table1 tbody");
                      testTbody.empty();          //若不做清空处理，列表则会重复叠加
                      if (data) {
                          $.each(data, function (i, list) {
                              var test = "<tr>" +
                                  "<td>" + list.name + "<td>" +
                                  "<td>" + list.num + "<td>" +
                                  "<td>" + list.money + "<td>" +
                                  "</tr>";
                              testTbody.append(test);
                          });
                      }
                  }
              });*/

              //商品信息
              $.ajax({
                  url:"${basePath}fuping/fenpingGetMsg1.do",
                  type:"post",
                  success:function (result) {

                      $("#table1 tbody").empty();
                      var html="";
                      for(var i=0;i<result.length;i++){
                          html = "<tr>\n" +
                              "                                <td rowspan=\"2\">" + result[i].name + "</td>\n" +
                              "                                <td class=\"icons\" style=\"width: 50px; text-align: center;\">" + result[i].num + "</td>\n" +
                              "                                 </tr>"+
                              "                                 <tr>"+
                              "                                <td class=\"icons\" style=\"width: 50px; text-align: center;\">" +"￥"+ result[i].money+ "</td>\n" +
                              "                                 </tr>";
                          $('#table1 tbody').append(html);
                      }

          }, error:function (result) {

                  /*alert("发生错误");*/

              }
          });

          }


      window.onload=function(){
   /* alert("111");*/


/*    if(window.localStorage){
        alert("浏览器支持localstorage");
        return false;
    }else{
        alert("111");
        //主逻辑业务
    }*/
/*freash();*/
//定时器每秒调用一次fnDate()
setInterval(function(){
/*fnDate();*/freash();
    test();
/*freash1();*/
},2000);
}

//js 获取当前时间
function fnDate(){
var oDiv=document.getElementById("time");
var date=new Date();
var year=date.getFullYear();//当前年份
var month=date.getMonth();//当前月份
var data=date.getDate();//天
var hours=date.getHours();//小时
var minute=date.getMinutes();//分
var second=date.getSeconds();//秒
var time=year+"-"+fnW((month+1))+"-"+fnW(data)+" "+fnW(hours)+":"+fnW(minute)+":"+fnW(second);
oDiv.innerHTML=time;
}
//补位 当某个字段不是两位数时补0
function fnW(str){
var num;
str>10?num=str:num="0"+str;
return num;
} 

  </script>

   <script>
       function Fkey() {
           var WsShell = new ActiveXObject('WScript.Shell')
           WsShell.SendKeys('{F11}');
       }

       window.onresize = function() {
           var isFull=!!(document.webkitIsFullScreen || document.mozFullScreen ||
               document.msFullscreenElement || document.fullscreenElement
           );//!document.webkitIsFullScreen都为true。因此用!!
           if (isFull==false) {
               $("#exitFullScreen").css("display","none");
               $("#fullScreen").css("display","");
           }else{
               $("#exitFullScreen").css("display","");
               $("#fullScreen").css("display","none");
           }
       }

       //fullScreen()和exitScreen()有多种实现方式，此处只使用了其中一种
       //全屏
       function fullScreen() {
           var element = document.documentElement;
           if (element.requestFullscreen) {
               element.requestFullscreen();
           } else if (element.msRequestFullscreen) {
               element.msRequestFullscreen();
           } else if (element.mozRequestFullScreen) {
               element.mozRequestFullScreen();
           } else if (element.webkitRequestFullscreen) {
               element.webkitRequestFullscreen();
           }
       }

       //退出全屏
       function exitFullscreen() {
           if (document.exitFullscreen) {
               document.exitFullscreen();
           } else if (document.msExitFullscreen) {
               document.msExitFullscreen();
           } else if (document.mozCancelFullScreen) {
               document.mozCancelFullScreen();
           } else if (document.webkitExitFullscreen) {
               document.webkitExitFullscreen();
           }
       }

window.onload=function () {
    Fkey();
}

      /* $( fullScreen());*/

   </script>

  <%-- <script language="JavaScript">
       function myrefresh()
       {
           window.location.reload();
       }
       setTimeout('myrefresh()',1000); //指定1秒刷新一次
   </script>--%>
 </body>

</html><%--<SCRIPT Language=VBScript><!--

//--></SCRIPT>--%>
