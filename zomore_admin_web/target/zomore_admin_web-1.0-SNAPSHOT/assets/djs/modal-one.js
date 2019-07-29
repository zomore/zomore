var modalFixed;//定义是否固定弹出数字键盘 
var modalInput='';
var backname;
//title 头部信息

// inputtile输入框的信息
// onback 回调事件

var modalOne =function(title,inputtile,onback){
	//console.log(onback);
	backname = onback;
	var OneHtml='<div class="modal fade   " id="modalOne" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"> '+
'   <div class="modal-dialog"> '+
'    <div class="modal-content"> '+
'     <div class="modal-header com-bj"> '+
'      <button type="button" class="close" onclick="modalclose()"  aria-hidden="true"> &times; </button> '+
'      <h4 class="modal-title" id="myModalLabel"><font class="stitle"> '+title+'</font> <br /> '+
'       <div class="checkbox checkbox-circle"> '+
'        <input id="checkbox8" type="checkbox" onclick="checkbox()" /> '+
'        <label for="checkbox8"> 固定弹出当前触屏键盘 </label> '+
'       </div> </h4> '+
'     </div> '+
'     <div class="modal-body"> '+
'      <div class="input-group m-t-10"> '+
'       <input type="text" id="example-input2-group1" name="example-input2-group1" class="form-control key4" placeholder="'+inputtile+'" /> '+
'       <span class="input-group-addon"><i class="iconfont icon-jisuanqi " onclick="shownumbers()"></i></span> '+
'      </div> '+
'      <div class="numbers "> '+
'       <ul> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4" onclick="nums(\'1\')">1</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'2\')">2</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'3\')">3</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'4\')">4</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'5\')">5</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'6\')">6</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'7\')">7</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'8\')">8</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'9\')">9</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'.\')">.</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="nums(\'0\')">0</li> '+
'        <li class="col-lg-4 col-md-4 col-sm-4 col-xs-4 " onclick="numsback()"><i class="fa  fa-mail-reply"></i></li> '+
'       </ul> '+
'      </div> '+
'     </div> '+
'     <div class="modal-footer"> '+
'      <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
'       <button type="button" class="btn btn-pink btn-block btn-lg" onclick="modalclose()" data-dismiss="modal">取消 </button>'+
'      </div> '+
'      <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6"> '+
'       <button type="button" class="btn btn-info btn-block btn-lg sure4" onclick="sure()"> 确认 </button> '+
'      </div> '+
'     </div> '+
'    </div> '+
'   </div> '+
'  </div> ';
if ($("#modalOne").length == 0) {
	      $("body").append(OneHtml);
	  }else{
		  $('.stitle').html(title);
		  $('.key4').attr('placeholder',inputtile);
	  };
	$('#modalOne').modal('show');  
	// 加载成功后执行的事件
	//console.log(modalFixed);
	if(modalFixed==1){
		$('#modalOne .numbers').show();
	}else{
		$('#modalOne .numbers').hide();
	}
}
// 加载成功后执行的事件
function shownumbers(){
	console.log("这里执行了没有");
	
	if($('#modalOne .numbers').is(':hidden')){//如果当前隐藏  
		 $('#modalOne .numbers').show(200);//那么就显示div
		 
		}else{
		$('#modalOne .numbers').hide(200);//就隐藏div 
		} 
	setTimeout(function(){
		var m_top = ( $(window).height() - $('#modalOne .modal-dialog').height() )/2.5;
		$('#modalOne .modal-dialog').css({'margin': m_top + 'px auto'});
	},200)
}
// 点击数字
function nums(type){
	modalInput+=type;
	$('.key4').val(modalInput);
}
//回退数字
function numsback(){
	var val = $(".key4").val();
	if (val.length > 0) {
		val = val.substring(0, val.length - 1);
	}
	$(".key4").val(val);
	modalInput=val;
}
//选择框
function checkbox(){
	
	if($('#checkbox8').is(':checked')) {
		modalFixed=1;
		
	}else{
		modalFixed=2;
		
	}
}
//点击确定过后要做的事
function sure(){
	var inputval = $('.key4').val();
	backname(inputval);
}
//关闭框采用事件
function modalclose(){
	$('.key4').val('');
	$('#modalOne').modal('hide');
	  
}

