// title是指弹窗的内容
var Jjbback;
var modelalert =function(title){
	
	var alertHtml='<div class="modal fade " id="ModalAlert" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3" aria-hidden="true"> '+
'   <div class="modal-dialog"> '+
'    <div class="modal-content"> '+
'     <div class="modal-header com-bj"> '+
'      <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> '+
'      <h4 class="modal-title" id="myModalLabel3"> <i class="fa  fa-adjust"></i>系统消息 '+
'       </h4> '+
'     </div> '+
'     <div class="modal-body"><i class="fa  fa-lightbulb-o"></i>'+title+'</div> '+
'     <div class="modal-footer"> '+
'       <button type="button" class="btn btn-pink " data-dismiss="modal">关闭 </button>'+
'     </div> '+
'    </div> '+
'   </div> '+
'  </div> ';
	if ($("#ModalAlert").length == 0) {
	      $("body").append(alertHtml);
	  }else{
		  $('#ModalAlert .modal-body').html('<i class="fa  fa-lightbulb-o"></i>'+title);
	  };
	$('#ModalAlert').modal('show');  
}
//交接班
var modelJjb =function(title,back){
	console.log(back);
	Jjbback = back;
	var alertHtml='<div class="modal fade " id="ModalAlerts" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3" aria-hidden="true"> '+
'   <div class="modal-dialog"> '+
'    <div class="modal-content"> '+
'     <div class="modal-header com-bj"> '+
'      <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> '+
'      <h4 class="modal-title" id="myModalLabel3"> <i class="fa  fa-adjust"></i>系统消息 '+
'       </h4> '+
'     </div> '+
'     <div class="modal-body"><i class="fa  fa-lightbulb-o"></i>'+title+'</div> '+
'     <div class="modal-footer"> '+
'       <button type="button" class="btn btn-pink " data-dismiss="modal">关闭 </button>'+
'       <button type="button" class="btn btn-success " onclick="jjback()" >交接班 </button>'+
'     </div> '+
'    </div> '+
'   </div> '+
'  </div> ';
	if ($("#ModalAlerts").length == 0) {
	      $("body").append(alertHtml);
	  };
	$('#ModalAlerts').modal('show');  
}
function jjback(){
	Jjbback();
	$('#ModalAlerts').modal('hide');
	
}

// 销售订单那里的弹窗
var printback,twoback;
var modelPrint =function(title,btitle,back,backs){
	
	printback = back;
	twoback=backs;
	var alertHtml='<div class="modal fade " id="ModalPrint" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3" aria-hidden="true"> '+
'   <div class="modal-dialog"> '+
'    <div class="modal-content"> '+
'     <div class="modal-header com-bj"> '+
'      <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button> '+
'      <h4 class="modal-title" id="myModalLabel3"> <i class="fa  fa-adjust"></i>系统消息 '+
'       </h4> '+
'     </div> '+
'     <div class="modal-body"><i class="fa  fa-lightbulb-o"></i>'+title+'</div> '+
'     <div class="modal-footer"> '+
'       <button type="button" class="btn btn-pink " data-dismiss="modal">关闭 </button>'+
'       <button type="button" class="btn btn-info " onclick="prints()" >补打标签 </button>'+
'       <button type="button" class="btn btn-danger " onclick="print()" >'+btitle+' </button>'+
'     </div> '+
'    </div> '+
'   </div> '+
'  </div> ';
	if ($("#ModalPrint").length == 0) {
	      $("body").append(alertHtml);
	  }else{
		  $('#ModalPrint .modal-body').html('<i class="fa  fa-lightbulb-o"></i>'+title);
		  $('#ModalPrint .btn-danger').html(btitle);
	  };
	$('#ModalPrint').modal('show');
	$('#ModalPrint').modal('show');  
}
function prints(){
	printback();
	$('#ModalPrint').modal('hide');
	
}
function print(){
	twoback();
	$('#ModalPrint').modal('hide');
	
}