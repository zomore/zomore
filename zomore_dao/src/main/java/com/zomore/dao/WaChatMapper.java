package com.zomore.dao;

import com.zomore.domain.Multiple;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface WaChatMapper {
    //查询订单数目
    /*Integer selectOrder(@Param("shop") String shop,@Param("startime")Date startime,@Param("endtime")Date endtime);*/
    Integer selectOrderByCommoditySale(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime);
    Integer selectOrderByServiceCommodity(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime);

    //获取5件热销商品的数量，单价，名字
    @Select({"SELECT a.zomore_commodity_name as 'name',SUM(a.zomore_commodity_num) as 'num' ,a.zomore_commodity_money as 'money' FROM zomore_commodity_sale_commodit a,zomore_commodity_sale b  WHERE a.zomore_commodity_sale_id= b.zomore_commodity_sale_id and  #{date}< b.zomore_commodity_sale_time AND b.zomore_commodity_state = 1 AND a.zomore_commodity_shop=#{shop} GROUP BY a.zomore_commodity_name ORDER BY num DESC LIMIT 0,5 "})
    List<Map<String,Object>> selctSaleOrderfireDetailed(@Param("shop") String shop, @Param("date") Date date);

    //获取5件热销项目的数量，单价，名字
    @Select({"SELECT a.zomore_commodity_name AS 'name',SUM(a.zomore_commodity_num) AS 'num',a.zomore_commodity_money AS 'money' FROM zomore_service_commodity_salecommodit a,zomore_service_commodityorder b WHERE a.zomore_commodity_sale_id = b.zomore_commodity_sale_id AND #{date} < b.zomore_commodity_sale_time AND b.zomore_commodity_state = 1 AND a.zomore_commodity_shop = #{shop} GROUP BY `name` ORDER BY `num` DESC LIMIT 0,5 "})
    List<Map<String,Object>> selctServiceSaleOrderfireDetailed(@Param("shop") String shop, @Param("date") Date date);

    //查找一天新增的会员
    Integer selectUpMemberForDay(@Param("date")Date date,@Param("date1")Date date1,@Param("shop")String shop);
    //统计店铺的会员数
    Integer countMember(@Param("shop")String shop);

    Integer selectProfit(@Param("date")Date date,@Param("date1")Date date1,@Param("shop")String shop);

    List<Map<String, Objects>> selectSimple(@Param("shop")String shop);

    List<Map<String, Objects>> selectSimpleAndNum(@Param("shop")String shop,@Param("code")String code);

    List<Map<String, Objects>> selectSimpleAndWord(@Param("shop")String shop,@Param("code")String code);

    List<Map<String, Objects>> selectAllStock(@Param("shop")String shop);

    List<Map<String, Objects>> selectStockAndWord(@Param("shop")String shop,@Param("code")String code);

    List<Map<String, Objects>> selectBytype(@Param("shop")String shop,@Param("selectBytype")String selectBytype);



    @Select({"SELECT COUNT(role) FROM shop WHERE shopName = #{shop} and role = 1"})
    Integer selectShopRole(@Param("shop")String shop);
    @Select({"SELECT shopName FROM multiple WHERE multipleId = (SELECT multipleId FROM shop WHERE shopName = #{shop})"})
    List<Multiple> selectMultipeShopName(@Param("shop")String shop);
    //获取总店5件热销商品的的数量，单价，名字
    //@Select({"SELECT a.zomore_commodity_name as 'name',SUM(a.zomore_commodity_num) as 'num' ,a.zomore_commodity_money as 'money' FROM zomore_commodity_sale_commodit a,zomore_commodity_sale b  WHERE a.zomore_commodity_sale_id= b.zomore_commodity_sale_id and  #{date}< b.zomore_commodity_sale_time AND a.zomore_commodity_shop=#{shop} GROUP BY a.zomore_commodity_name ORDER BY num DESC LIMIT 0,5 "})
    //List<Map<String,Object>> selctzMultipleOrderfireDetailed(@Param("shop") String shop, @Param("date") Date date);

}
