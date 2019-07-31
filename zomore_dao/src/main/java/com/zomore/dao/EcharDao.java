package com.zomore.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EcharDao {


    @Select({"SELECT a.zomore_commodity_name,SUM(a.zomore_commodity_num) as 'num' FROM zomore_commodity_sale_commodit a,zomore_commodity_sale b WHERE a.zomore_commodity_sale_id= b.zomore_commodity_sale_id and  #{date}< b.zomore_commodity_sale_time AND a.zomore_commodity_shop=#{shop}  GROUP BY a.zomore_commodity_name ORDER BY num DESC LIMIT 0,3 "})
    List<Map<String,Object>> selctSaleOrderthree(@Param("shop") String shop, @Param("date") Date date);

    @Select({"SELECT a.zomore_commodity_name,SUM(a.zomore_commodity_num) as 'num' FROM zomore_commodity_sale_commodit a,zomore_commodity_sale b WHERE a.zomore_commodity_sale_id= b.zomore_commodity_sale_id and  #{date}< b.zomore_commodity_sale_time AND a.zomore_commodity_shop=#{shop} GROUP BY a.zomore_commodity_name ORDER BY num DESC LIMIT 0,5 "})
    List<Map<String,Object>> selctSaleOrderfire(@Param("shop") String shop, @Param("date") Date date);

    @Select({"SELECT zomore_commodity_sale_guide,zomore_commodity_shop,SUM(zomore_commodity_sale_inmoney) as money  FROM zomore_commodity_sale WHERE zomore_commodity_shop = #{shop} and  #{date}< zomore_commodity_sale_time and zomore_commodity_sale_guide !='' GROUP BY zomore_commodity_sale_guide ORDER BY money DESC  LIMIT 0,3;"})
    List<Map<String,Object>> selcGuidethree(@Param("shop") String shop ,@Param("date") Date date);

    @Select({"SELECT zomore_commodity_sale_time as time ,zomore_commodity_sale_name as guide,zomore_commodity_sale_inmoney as money from zomore_commodity_sale WHERE zomore_commodity_shop= #{shop} ORDER BY zomore_commodity_sale_time DESC LIMIT 0,3; "})
    List<Map<String,Object>> selcShopthree(@Param("shop") String shop);

    //当天普通商品的销售额
    @Select({"SELECT SUM(zomore_commodity_sale_inmoney) as allin ,COUNT(*) as num FROM zomore_commodity_sale WHERE zomore_commodity_shop=#{shop}and zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_state='1';"})
    Map<String,Object>selectShopAllin(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);

    //当天会员普通商品的销售额
    @Select({"SELECT SUM(zomore_commodity_sale_inmoney) as allin ,COUNT(*) as num FROM zomore_commodity_sale WHERE zomore_commodity_shop=#{shop}and zomore_commodity_sale_member != '来宾'and  zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_state='1';"})
    Map<String,Object>selectShopAllinByMember(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);

    //当天服务类商品的销售额
    @Select({"SELECT SUM(zomore_commodity_sale_inmoney) as allin ,COUNT(*) as num FROM zomore_service_commodityorder WHERE zomore_commodity_shop=#{shop}and zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_state='1';"})
    Map<String,Object>selectShopAllin1(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);

    //当天会员服务类商品的销售额
    @Select({"SELECT SUM(zomore_commodity_sale_inmoney) as allin ,COUNT(*) as num FROM zomore_service_commodityorder WHERE zomore_commodity_shop=#{shop} and zomore_commodity_sale_member != '来宾' and zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_state='1';"})
    Map<String,Object>selectShopAllinByMember1(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);

    //当天普通商品销售额的各个支付类型的金额
    @Select({"SELECT SUM(t.zomore_commodity_sale_inmoney) as paymoney ,COUNT(t.zomore_commodity_sale_type) as paynum ,t.zomore_commodity_sale_type as paytype \n" +
            "from (select zomore_commodity_sale_inmoney,zomore_commodity_sale_type  from zomore_commodity_sale where zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_shop =#{shop} and zomore_commodity_state='1') t  \n" +
            "GROUP BY zomore_commodity_sale_type"})
    List<Map<String,Object>>selectPaymoneyOfAllin(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);

    //当天服务类商品销售额的各个支付类型的金额
    @Select({"SELECT SUM(t.zomore_commodity_sale_inmoney) as paymoney ,COUNT(t.zomore_commodity_sale_type) as paynum ,t.zomore_commodity_sale_type as paytype \n" +
            "from (select zomore_commodity_sale_inmoney,zomore_commodity_sale_type  from zomore_service_commodityorder where zomore_commodity_sale_time BETWEEN #{startime}AND #{endtime} and zomore_commodity_shop =#{shop} and zomore_commodity_state='1') t  \n" +
            "GROUP BY zomore_commodity_sale_type"})
    List<Map<String,Object>>selectPaymoneyOfAllin2(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);


    //查询门店每个会员等级人数
    @Select({"SELECT member_grade AS grade,COUNT(*)AS num FROM zomore_member WHERE member_shop=#{shop} and member_grade !='无' GROUP BY member_grade;"})
    List<Map<String,Object>> countGradeNum(@Param("shop") String shop);

}
