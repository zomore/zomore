package com.zomore.controller.example_quickIn;

import com.zomore.controller.constant.ComConstant_QuickIn;
import com.zomore.utils.HttpClientUtil;

import java.util.Map;

/**
 * 联拓富快速接入版支付接口demo列表
 * Created by LVHUIHUI on 2018-8-6
 *
 */
public class Main_QuickIn {
	/**
	 * 联拓富快速接入版
	 * @param reqParas
	 * @return
	 */
	public static String requestAsPost(Map reqParas,String serverUrl){
		String res = HttpClientUtil.requestAsHttpPOST(serverUrl,reqParas, ComConstant_QuickIn.INPUT_CHARSET,10000,20000);
		return res;
	 }
	
	public static void main(String[] args)  { 
		//System.out.println("支付账单查询API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIBill.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_BILL));
		//System.out.println("支付订单撤销API===服务器端返回res====="+Main_QuickIn.requestAsPost(SICancel.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_CANCEL));
		//System.out.println("支付订单关单API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIClose.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_CANCEL));
		//System.out.println("秘钥信息下载===服务器端返回res====="+Main_QuickIn.requestAsPost(SILogin.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_LOGIN));
		//System.out.println("门店信息下载===服务器端返回res====="+Main_QuickIn.requestAsPost(SIMerchantList.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_MERCHANT_LIST));
		//System.out.println("被扫支付API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIPay.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_PAY));
		//System.out.println("被扫支付API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIPayQuery.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_PAY_QUERY));
		//System.out.println("公众号&小程序支付API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIPrecreateJSAPI.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_PRECREATE));
		//System.out.println("主扫支付API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIPrecreateNative.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_PRECREATE));
		//System.out.println("支付订单退款API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIRefund.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_REFUND));
		//System.out.println("支付订单退款查询API===服务器端返回res====="+Main_QuickIn.requestAsPost(SIRefundQuery.getReqparas(),ComConstant_QuickIn.SERVICEURL_NEWSI_REFUND_QUERY));
	}
	
	
	
}
