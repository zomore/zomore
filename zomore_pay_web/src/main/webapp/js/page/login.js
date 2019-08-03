var mathField;	//要使用健盘这个必须定义
//此处必须定义，定义过后才能取得焦点		
$('.form-control').focus(function(){
	mathField=$(this);
});
//这里是为了显示健盘的事件
$('.fa-keyboard-o').on('click',function(){
	keyword();
})
//显示系统提示
$('.btn-success').on('click',function(){
	modelalert('请输入账号');
})