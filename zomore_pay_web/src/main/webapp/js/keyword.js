var CapsLockValue = 0,
check;
var tempSt = '',
tempEt = '';
var zn_en = 'en';
var config = {
    spaceBehavesLikeTab: true,
    leftRightIntoCmdGoes: 'up',
    restrictMismatchedBrackets: true,
    sumStartsWithNEquals: true,
    supSubsRequireOperand: true,
    autoSubscriptNumerals: true,
    handlers: {
        edit: function() {},
    },
    restrictMismatchedBrackets: true
};
var MQ;
//var mathField=inputnow;
//console.log(mathField);
var keyword = function(){
	console.log();
	var keyhtml='<div class="input_box js_math">'+
//'<div class="mask"></div>'+
'<div class="input_con">'+

'<div class="change_box clear">'+
'<div class="l change_btns active" data-type="zimu">英文</div>'+
'<div class="l change_btns" data-type="zhongwen">中文</div>'+
'<div class="l change_btns" data-type="shuzi">数字</div>'+
'<div class="l change_btns" data-type="fuhao">符号</div>'+
'<div class="l close_keyborad">关闭键盘</div>'+
'</div>'+
'<div class="keyboard_box">'+
'<div class="prettyprint"></div>'+
'<div class="softkeyboard" name="softkeyboard">'+
'<div class="c_panel shuzi" id="shuzi">'+
'<table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">'+
'<tbody>'+
'<tr>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'0\');" value=" 0 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'1\');" value=" 1 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'2\');" value=" 2 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'3\');" value=" 3 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'4\');" value=" 4 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'5\');" value=" 5 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'6\');" value=" 6 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'7\');" value=" 7 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'8\');" value=" 8 "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'9\');" value=" 9 "></td>'+
'</tr>'+
'<tr>'+
'<td><input class="i_button i_button_num" type="button" value="." onclick="addValue(\'.\');"></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'①\');" value=" ① "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'②\');" value=" ② "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'③\');" value=" ③ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'④\');" value=" ④ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'⑤\');" value=" ⑤ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'⑥\');" value=" ⑥ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'⑦\');" value=" ⑦ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'⑧\');" value=" ⑧ "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'⑨\');" value=" ⑨ "></td>'+
'</tr>'+
'<tr>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'+\');" value=" + "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'-\');" value=" - "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'*\');" value=" * "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'/\');" value=" / "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'=\');" value=" = "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'<\');" value=" < "></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="addValue(\'>\');" value=" > "></td>'+
'<td><input class="i_button i_button_num" type="button" value="删除" onclick="backspace();"></td>'+
'<td><input class="i_button i_button_num" type="button" onclick="clearValue();" value="清空"></td>'+
'<td><input class="i_button i_button_num" onclick="changePanl(\'zimu\');" type="button" value="返回"></td>'+
'</tr>'+
'</tbody>'+
'</table>'+
'</div>'+
'<div class="c_panel zimu" id="zimu">'+
'<table align="center" width="98%" border="0" cellspacing="0" cellpadding="0">'+
'<tbody>'+
'<tr>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'q\');" value=" q "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'w\');" value=" w "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'e\');" value=" e "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'r\');" value=" r "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'t\');" value=" t "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'y\');" value=" y "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'u\');" value=" u "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'i\');" value=" i "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'o\');" value=" o "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'p\');" value=" p "></td>'+
'</tr>'+
'<tr>'+
'<td><input class="i_button i_button_fh" type="button" onclick="setCapsLock(this);" value="大写"></td>'+
'<td style="display: none"><input class="i_button i_button_zm js_ym" type="button" value="韵母" onclick="changePanl(\'yunmu\');"></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'a\');" value=" a "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'s\');" value=" s "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'d\');" value=" d "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'f\');" value=" f "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'g\');" value=" g "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'h\');" value=" h "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'j\');" value=" j "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'k\');" value=" k "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'l\');" value=" l "></td>'+
'</tr>'+
'<tr>'+
'<td><input class="i_button i_button_zm" type="button" value=" 空格" onclick="addValue(\'\/\/\/\/ \');"></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'z\');" value=" z "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'x\');" value=" x "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'c\');" value=" c "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'v\');" value=" v "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'b\');" value=" b "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'n\');" value=" n "></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="addValue(\'m\');" value=" m "></td>'+
'<td colspan="2"><input class="i_button i_button_bs" type="button" value=" 删除" onclick="backspace();"></td>'+
'</tr>'+
'</tbody>'+
'</table>'+
'</div>'+
'<div class="c_panel fuhao" id="fuhao">'+
'<table align="center" width="98%" border="0" cellspacing="0" cellpadding="0">'+
'<tbody>'+
'<tr>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'~\');" value=" ~ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'@\');" value=" @ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'#\');" value=" # "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'$\');" value=" $ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'￥\');" value=" ￥ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'%\');" value=" % "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'\/\/\'\');" value=" \' "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'_\');" value=" _ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'|\');" value=" | "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'-\');" value=" - "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'+\');" value=" + "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'=\');" value=" = "></td>'+
'</tr>'+
'<tr>'+
' <td><input class="i_button i_button_fh" type="button" onclick="addValue(\'<\');" value=" < "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'>\');" value=" > "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'《\');" value=" 《 "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'》\');" value=" 》 "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'!\');" value=" ! "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'?\');" value=" ? "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\';\');" value=" ; "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\':\');" value=" : "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'(\');" value=" ( "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\')\');" value=" ) "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'*\');" value=" * "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'/\');" value=" / "></td>'+
'</tr>'+
'<tr>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'{\');" value=" { "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'}\');" value=" } "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'[\');" value=" [ "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\']\');" value=" ] "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'、\');" value=" 、 "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'+\');" value=" , "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick="addValue(\'。\');" value=" 。 "></td>'+
'<td><input class="i_button i_button_fh" type="button" onclick=\'addValue("\/\/"");\' value=\' " \'></td>'+
'<td><input class="i_button i_button_zm" type="button" value=" 空格" onclick="addValue(\'\/\/\/\/ \');"></td>'+
'<td><input class="i_button i_button_zm" type="button" onclick="clearValue();" value="清空"></td>'+
'<td><input class="i_button i_button_zm" type="button" value=" 删除" onclick="backspace();"></td>'+
'<td><input class="i_button i_button_zm" type="button" value=" 返回" onclick="changePanl(\'zimu\');"></td>'+
'</tr>'+
'</tbody>'+
'</table>'+
'</div>'+
'</div>'+
'</div>'+
'</div>'+
'</div>';
  if ($(".input_box").length == 0) {
        $("body").append(keyhtml);
    }
    
	changePanl("zimu");
	keyclick();
	$(".input_box").show();
	$(".input_con").slideDown();
}
function addValue(newValue) {
	
    mathField.focus();
    if ($(".change_btns.active").attr("data-type") == "zhongwen" && /[a-zA-Z]/.test(newValue)) {
        znValue(newValue);
        return false;
    }
    CapsLockValue == 0 ? '': newValue = newValue.toUpperCase();
	
	
	if(mathField.val() ==''){
		
		mathField.val(newValue);
	}else{
		mathField.val(mathField.val()+$.trim(newValue));
	}

	
}

var _text = '';
function znValue(obj) {
    _text ? _text += obj: _text = obj;
    console.log(_text); 
	var lists = zn_lists[_text];
    if (!lists) {
        _text = obj;
        lists = zn_lists[_text];
        console.log(_text)
    }
    var str = '<div class="zn_box clearfix"><span>' + _text + '</span><div class="zn_scroll"><ul class="clearfix">';
    for (var i = 0; i < lists.length; i++) {
        str += '<li>' + zn_lists[_text][i] + '</li>'
    }
    str += '</ul></div>';
    if (lists.length >= 13) {
        str += '<a href="javascript:;" class="zn_btn"></a>';
    }
    str += '</div>';
    $(".zn_box").remove();
    $(".input_con").append(str);
}
function clearValue() {
    mathField.val('');
	_text = '';
    $(".zn_box").remove();
}
function backspace() {
	console.log(_text);
    if (zn_en == 'zn' && _text.length >= 1) {
        if (_text.length == 1) {
            _text = '';
            $(".zn_box").remove();
        } else {
            _text = _text.substring(0, _text.length - 1);
            znValue(_text);
        }
        return false;
    }
	if(mathField.val() ==''){
		
		return false;
	}else{
		s=mathField.val().substring(0,mathField.val().length-1);
		mathField.val(s);
	}
	
	
   // mathField.keystroke('Backspace')
}
function changePanl(oj) {
    //mathField.focus();
    if (oj == 'zhongwen') {
        zn_en = 'zn';
        if (CapsLockValue == 1) {
            setCapsLock($("input[value=小写]"))
        }
        $("input[value=韵母]").closest("td").show();
        $("input[value=小写]").closest("td").hide();
        $("input[value=大写]").closest("td").hide();
        $(".zimu").siblings(".c_panel").hide();
        $(".zimu").show();
    } else {
        zn_en = 'en';
        $("input[value=韵母]").closest("td").hide();
        $("input[value=小写]").closest("td").show();
        $("input[value=大写]").closest("td").show();
        _text = '';
    }
    $("." + oj).siblings(".c_panel").hide();
    $("." + oj).show();
}
function setCapsLock(o) {
    if (CapsLockValue == 0) {
        CapsLockValue = 1;
        $(o).val("小写");
        $.each($(".i_button_zm"),
        function(b, c) {
            $(c).val($(c).val().toUpperCase());
        });
    } else {
        CapsLockValue = 0;
        $(o).val("大写");
        $.each($(".i_button_zm"),
        function(b, c) {
            $(c).val($(c).val().toLowerCase());
        });
    }
    _text = '';
    $(".zn_box").remove();
    $("input[value=英文]").val("中文");
}

$(document).on("click", ".zn_btn",
    function() {
        $(this).toggleClass('on');
        if ($(this).hasClass('on')) {
            $('.zn_box').addClass('on');
            $(".zn_scroll ul").slimScroll({
                height: '200px'
            })
        } else {
            $('.zn_box').removeClass('on');
        }
    });
function keyclick(){	
	
 $(document).on("click", ".zn_box li",
    function() {
		if(mathField.val() ==''){
			
			mathField.val($(this).text());
		}else{
			mathField.val(mathField.val()+$(this).text());
		}
       
		 $(".zn_box").remove();
    });
$(".addlatex").on("click",
    function() {
        $(".temp_input").text(mathField.latex()); 
		MQ.StaticMath($(".temp_input")[0]); 
		$(".input_con").slideUp(function() {
            $(".input_box").hide(); 
			$("#txt_Search").val("");
        });
    }); 
$(".btn_ok").on("click",
    function() {
        $(".input_box").hide();
        $(".temp_input").text($("#txt_Search").val()); 
		$("#txt_Search").val("");
    }); 
// $(".answer_lists p").on("click",
//     function() {
//         mathField.latex('');
//         $(".answer_lists p").removeClass("temp_input"); 
// 		$(".input_box").show();
//         $(".input_con").slideDown();
//         $(this).addClass("temp_input");
//         if ($.trim($(this).text()) != '') {
//             var el = $(this).find('.mq-selectable').text();
//             if (el) {
//                 var txt = el.substr(0, el.length - 1).substr(1, el.length - 1);
//             } else {
//                 var txt = $(this).text();
//             }
//             mathField.latex(txt)
//         }
//     }); 
$(".close_keyborad").on("click",
    function() {
        $(".input_con").slideUp(function() {
            $(".input_box").hide(); 
			$("#txt_Search").val("");
        });
    });
 $(".change_btns").on("click",
    function() {
		console.log("点了一下点了没有");
        $(this).addClass("active").siblings().removeClass("active"); 
		changePanl($(this).attr("data-type"));
    })						
	}