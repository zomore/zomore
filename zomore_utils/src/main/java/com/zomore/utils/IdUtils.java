package com.zomore.utils;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//id生产工具类
public class IdUtils {

    //流水号(年月日时分秒+两位随机数+从001开始自加)如2019031909522536001
    public static String  commoditySaleId(String shopname,ServletContext servletContext){
        //先生成流水号
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        //获取量位随机数
        Random random = new Random();
        int ends = random.nextInt(99);
        String format1 = String.format("%02d", ends);//如果不足两位，前面补0
        //订单数量从每天从001开始
        int index =(int) servletContext.getAttribute(shopname);
        String format2 = String.format("%03d", index);//如果不足两位，前面补0
        //servletContent里面的数据要增加1
        servletContext.setAttribute(shopname,index+1);
        return format.format(new Date())+format1+format2;
    }
}
