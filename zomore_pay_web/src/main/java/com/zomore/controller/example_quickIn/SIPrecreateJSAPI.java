package com.zomore.controller.example_quickIn;

import com.zomore.controller.constant.ComConstant_QuickIn;
import com.zomore.utils.SignUtil_QuickIn;

import java.util.HashMap;
import java.util.Map;

/**
 * 公众号&小程序API
 * Created by LVHUIHUI on 2018-8-6
 *
 */
public class SIPrecreateJSAPI {
	
	public static Map getReqparas(){
	 	Map<String, String> paras = new HashMap<String, String>();
    	paras.put("appId", ComConstant_QuickIn.APPID);//合作方标识
    	paras.put("random", "liantuo123");//随机数
    	paras.put("merchantCode", "EW_N4130797151");//商户编号
    	paras.put("outTradeNo", "EW_N4267159134_a111q");//商户订单号
    	paras.put("totalAmount", "0.01");//订单总金额
    	paras.put("channel", "WXPAY");//支付渠道
    	paras.put("tradeType", "JSAPI");//支付交易类型
    	paras.put("notifyUrl", "http://www.baidu.com");//异步通知地址
    	paras.put("openId", "oHucvv64jHMx6hXbPRIdI2FXI_i4");
    	paras.put("subject", "测试订单1");//支付凭证商品描述信息，不填写默认为交易订单编号
    	paras.put("sign", SignUtil_QuickIn.createSign(paras,ComConstant_QuickIn.PARTER_KEY ,ComConstant_QuickIn.INPUT_CHARSET));
	    return paras;
   }
	
	public static Map getReqparasTest(){
	 	Map<String, String> paras = new HashMap<String, String>();
    	paras.put("appId", "EW_N2320993253");//合作方标识
    	paras.put("random", "liantuo123");//随机数
    	paras.put("merchantCode", "EW_N4267159134");//商户编号
    	paras.put("outTradeNo", "EW_N4267159134_a111qq1");//商户订单号
    	paras.put("totalAmount", "0.01");//订单总金额
    	paras.put("channel", "WXPAY");//支付渠道
    	paras.put("tradeType", "JSAPI");//支付交易类型
    	paras.put("notifyUrl", "http://www.baidu.com");//异步通知地址
    	paras.put("openId", "oHucvv_nkhvTi3bXfBGZ4hyt1Dzk");
    	paras.put("subject", "测试订单1");//支付凭证商品描述信息，不填写默认为交易订单编号
    	paras.put("goodsDetail", "");
    	paras.put("sign", SignUtil_QuickIn.createSign(paras,"b36abe709f96f6fd4f1551a751943593" ,ComConstant_QuickIn.INPUT_CHARSET));
	    return paras;
   }
	
	public static void main(String[] args)  { 
		System.out.println("公众号&小程序支付API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIPrecreateJSAPI.getReqparasTest(),ComConstant_QuickIn.SERVICEURL_NEWSI_PRECREATE));
	}
}
