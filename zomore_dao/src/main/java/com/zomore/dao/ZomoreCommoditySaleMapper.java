package com.zomore.dao;

import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommoditySale;
import com.zomore.domain.ZomoreCommoditySaleExample;
import com.zomore.domain.ZomoreServiceCommodityorder;
import com.zomore.utils.CountCommoditySale;
import com.zomore.utils.GuidCommodity;
import com.zomore.utils.GuideCommodityUtil;
import com.zomore.utils.KeyValueResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

public  interface ZomoreCommoditySaleMapper
{
  public  long countByExample(ZomoreCommoditySaleExample paramZomoreCommoditySaleExample);
  
  public  int deleteByExample(ZomoreCommoditySaleExample paramZomoreCommoditySaleExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreCommoditySale paramZomoreCommoditySale);
  
  public  int insertSelective(ZomoreCommoditySale paramZomoreCommoditySale);
  
  public  List<ZomoreCommoditySale> selectByExample(ZomoreCommoditySaleExample paramZomoreCommoditySaleExample);
  
  public  ZomoreCommoditySale selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreCommoditySale paramZomoreCommoditySale, @Param("example") ZomoreCommoditySaleExample paramZomoreCommoditySaleExample);
  
  public  int updateByExample(@Param("record") ZomoreCommoditySale paramZomoreCommoditySale, @Param("example") ZomoreCommoditySaleExample paramZomoreCommoditySaleExample);
  
  public  int updateByPrimaryKeySelective(ZomoreCommoditySale paramZomoreCommoditySale);
  
  public  int updateByPrimaryKey(ZomoreCommoditySale paramZomoreCommoditySale);
  
  public  List<Map> selectSaleChart(String shop);
  /*查询总部下所有店铺的销售单据*/
  List<ZomoreCommoditySale> selectAllShopSaleByName(Map<String,Object> map);

  //根据时间段查询销售商品类别
  @Select({"select c.commodityType as type, SUM(c.realMoney) as money,count(*) as outNum \n" +
          "from(select t.zomore_commodity_type as commodityType,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_commodity_sale d LEFT JOIN  zomore_commodity_sale_commodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and d.zomore_commodity_state=1 and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} )c GROUP BY type order by money desc limit 0,5"})
  List<Map<String,Object>> selectSaleCharByTime(@Param("shop")String shop,@Param("startime") Date startime, @Param("endtime") Date endtime);

  public  List<Map> selectSaleChart2(String shop, Date date, Date date1);

  //普通商品类日结
  @Select({"select zomore_commodity_sale_id as zomoreCommoditySaleId, zomore_commodity_sale_time as zomoreCommoditySaleTime, zomore_commodity_sale_type as zomoreCommoditySaleType, \n" +
          "zomore_commodity_sale_name as zomoreCommoditySaleName, zomore_commodity_sale_member as zomoreCommoditySaleMember, zomore_commodity_sale_num as zomoreCommoditySaleNum, \n" +
          "zomore_commodity_sale_money as zomoreCommoditySaleMoney, zomore_commodity_sale_inmoney as zomoreCommoditySaleInmoney, zomore_commodity_sale_letmoney as zomoreCommoditySaleLetmoney, \n" +
          "zomore_commodity_sale_savemoney as zomoreCommoditySaleSavemoney, zomore_commodity_sale_guide as zomoreCommoditySaleGuide, zomore_commodity_shop as zomoreCommodityShop, \n" +
          "zomore_commodity_state as zomoreCommodityState, zomore_commodity_meno as zomoreCommodityMeno, zomore_commodity_guadanNum as zomoreCommodityGuadannum\n" +
          "from zomore_commodity_sale where zomore_commodity_shop = #{shopName} and zomore_commodity_state=1 and zomore_commodity_sale_time BETWEEN #{beforeTime} and #{nowTime} "})
  public List<ZomoreCommoditySale> findDayliSale(@Param("beforeTime") Date beforeTime, @Param("nowTime")Date nowTime, @Param("shopName")String shopName);

  //服务类日结
  @Select({"select zomore_commodity_sale_id as zomoreCommoditySaleId, zomore_commodity_sale_time as zomoreCommoditySaleTime, zomore_commodity_sale_type as zomoreCommoditySaleType, \n" +
          "zomore_commodity_sale_name as zomoreCommoditySaleName, zomore_commodity_sale_member as zomoreCommoditySaleMember, zomore_commodity_sale_num as zomoreCommoditySaleNum, \n" +
          "zomore_commodity_sale_money as zomoreCommoditySaleMoney, zomore_commodity_sale_inmoney as zomoreCommoditySaleInmoney, zomore_commodity_sale_letmoney as zomoreCommoditySaleLetmoney, \n" +
          "zomore_commodity_sale_savemoney as zomoreCommoditySaleSavemoney, zomore_commodity_sale_guide as zomoreCommoditySaleGuide, zomore_commodity_shop as zomoreCommodityShop, \n" +
          "zomore_commodity_state as zomoreCommodityState\n" +
          "from zomore_service_commodityorder where zomore_commodity_shop = #{shopName} and zomore_commodity_state=1 and zomore_commodity_sale_time BETWEEN #{beforeTime} and #{nowTime} "})
  public List<ZomoreServiceCommodityorder> findDayliSale2(@Param("beforeTime") Date beforeTime, @Param("nowTime")Date nowTime, @Param("shopName")String shopName);


  //7天普通商品类销售额
  public List<Map> selectTotal(ZomoreCommoditySale zomoreCommoditySale);
  //7天项目类销售额
  public List<Map>selectTotalService(ZomoreServiceCommodityorder zomoreServiceCommodityorder);
  //7天会员普通商品类消费额
   List<Map> selectTotalMemberSale(ZomoreCommoditySale zomoreCommoditySale);
   //7天会员项目类消费额
  List<Map> selectTotalMemberServiceSale(ZomoreServiceCommodityorder zomoreServiceCommodityorder);

  //7天会员项目类消费额储值卡
  List<Map> selectTotalMemberServicePaytypeSale(ZomoreServiceCommodityorder zomoreServiceCommodityorder);

  //7天会员普通类消费额储值卡
  List<Map> selectTotalMemberPaytypeSale(ZomoreCommoditySale zomoreCommoditySale);

  //导购员7天的销售提成普通商品类
  List<Map> selectTotalGuideSale(ZomoreCommoditySale zomoreCommoditySale) throws Exception;

  //导购员7天的销售提成项目类
  List<Map> selectTotalGuideServiceSale(ZomoreServiceCommodityorder zomoreServiceCommodityorder) throws Exception;

  //商品销售统计
  List<CountCommoditySale> searchCommoditySale(CountCommoditySale countCommoditySale);

  //总部所有门店的销售统计
  List<CountCommoditySale>  selectAllshopCountSale(Map<String ,Object> map);

  //根据商品名称以及店名查询商品的进货价
  @Select({"select zomore_commodity_in as zomoreCommodityIn from zomore_commodity where zomore_commodity_shop =#{shop} and zomore_commodity_name= #{name}"})
  List<ZomoreCommodity> selectCommodityFrom(@Param("shop")String shop,@Param("name") String name);

//导购员每天最新5条的前院商品记录
  @Select({"select c.commodityId as commodityId, c.commodityName as commodityName,c.saleTime as saleTime,SUM(c.commodutyNum) as commodutyNum, SUM(c.realMoney) as realMoney, SUM(c.commodityOutprice) as commodityOutprice \n" +
          "from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_commodity_sale d LEFT JOIN  zomore_commodity_sale_commodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.commodityName ORDER BY saleTime DESC LIMIT 0,5"})
  List<GuideCommodityUtil> slectGuideSaleCommodity(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);

  //导购员每天最新5条的后院商品记录
  @Select({"select c.commodityName as commodityName,c.saleTime as saleTime,SUM(c.commodutyNum) as commodutyNum, SUM(c.realMoney) as realMoney, SUM(c.commodityOutprice) as commodityOutprice \n" +
          "from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_service_commodityorder d LEFT JOIN  zomore_service_commodity_salecommodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.commodityName ORDER BY saleTime DESC LIMIT 0,5"})
  List<GuideCommodityUtil> slectGuideSaleServiceCommodity(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);


//导购员每天店内卖出所有前院店的商品记录
  @Select({"select c.guideName as guidName,c.shop as shop, SUM(c.realMoney) as realmoney\n" +
          "from(select d.zomore_commodity_sale_id as id,d.zomore_commodity_sale_guide as guideName,d.zomore_commodity_shop as shop,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_cmoney as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_commodity_sale d LEFT JOIN  zomore_commodity_sale_commodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide is NOT null and zomore_commodity_sale_guide !='' and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.guideName ORDER BY realMoney DESC"})
  List<GuidCommodity> selectGuideTotalSaleComodity(@Param("shop")String shop, @Param("startime") Date startime, @Param("endtime") Date endtime);

  //导购员每天店内卖出所有后院的商品记录
  @Select({"select c.guideName as guidName,c.shop as shop, SUM(c.realMoney) as realmoney\n" +
          "from(select d.zomore_commodity_sale_id as id,d.zomore_commodity_sale_guide as guideName,d.zomore_commodity_shop as shop,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_service_commodityorder d LEFT JOIN  zomore_service_commodity_salecommodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide is NOT null and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.guideName ORDER BY realMoney DESC"})
  List<GuidCommodity> selectGuideTotalSaleServiceComodity(@Param("shop")String shop, @Param("startime") Date startime, @Param("endtime") Date endtime);

  //后台首页今日导购后院销售额
  @Select({"select zomore_commodity_sale_guide as guidName,zomore_commodity_shop as shop, SUM(zomore_commodity_sale_inmoney) as realmoney\n" +
          "from  zomore_service_commodityorder where zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide!=''\n" +
          "and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} GROUP BY zomore_commodity_sale_guide ORDER BY realMoney DESC"})
  List<GuidCommodity> selectGuideTotalSaleServiceComodity2(@Param("shop")String shop, @Param("startime") Date startime, @Param("endtime") Date endtime);



  //导购员今日卖出的前店商品
  @Select({"select c.commodityId as commodityId, c.commodityName as commodityName,c.saleTime as saleTime,SUM(c.commodutyNum) as commodutyNum, SUM(c.realMoney) as realMoney, SUM(c.commodityOutprice) as commodityOutprice \n" +
          "from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_commodity_sale d LEFT JOIN  zomore_commodity_sale_commodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.commodityName ORDER BY saleTime DESC "})
  List<GuideCommodityUtil> selectGuideTotalCommodity(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);

  //导购员今日卖出的后院商品
  @Select({"select c.commodityId as commodityId, c.commodityName as commodityName,c.saleTime as saleTime,SUM(c.commodutyNum) as commodutyNum, SUM(c.realMoney) as realMoney, SUM(c.commodityOutprice) as commodityOutprice \n" +
          "from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,\n" +
          "t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice \n" +
          "from zomore_service_commodityorder d LEFT JOIN  zomore_service_commodity_salecommodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id\n" +
          "where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.commodityName ORDER BY saleTime DESC"})
  List<GuideCommodityUtil> selectGuideTotalServiceCommodity(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);

  //导购员今日前院销售单数
  @Select({"select c.commodityId as commodityId, SUM(c.commodutyNum) as commodutyNum " +
          " from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName,t.zomore_commodity_num as commodutyNum," +
          " t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice from zomore_commodity_sale d LEFT JOIN  zomore_commodity_sale_commodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id " +
          "where d.zomore_commodity_shop= #{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and  #{endtime} ) c GROUP BY c.commodityId ORDER BY saleTime DESC"})
  List<GuideCommodityUtil> selectGuideTotalSale(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);
  //导购员今日后院销售单数
  @Select({"select c.commodityId as commodityId, SUM(c.commodutyNum) as commodutyNum " +
          " from(select d.zomore_commodity_sale_id as id,t.zomore_commodity_sale_id as commodityId,d.zomore_commodity_sale_time as saleTime ,t.zomore_commodity_name as commodityName," +
          " t.zomore_commodity_num as commodutyNum, t.zomore_commodity_money as realMoney,t.zomore_commodity_money as commodityOutprice " +
          " from zomore_service_commodityorder d LEFT JOIN  zomore_service_commodity_salecommodit t on d.zomore_commodity_sale_id =t.zomore_commodity_sale_id " +
          " where d.zomore_commodity_shop=#{shop} and zomore_commodity_sale_guide=#{guidename} and zomore_commodity_sale_time BETWEEN #{startime} and #{endtime} ) c GROUP BY c.commodityId ORDER BY saleTime DESC"})
  List<GuideCommodityUtil> selectGuideTotalServiceSale(@Param("shop")String shop, @Param("guidename") String guidename, @Param("startime") Date startime, @Param("endtime") Date endtime);


  @Select({"select zomore_commodity_sale_type as k,SUM(zomore_commodity_sale_inmoney) as v from zomore_commodity_sale where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime} ORDER BY zomore_commodity_sale_type"})
  List<KeyValueResult> selectGroupByType(@Param("shop")String shop, @Param("startTime")Date startTime, @Param("endTime")Date endTime);
//应收
  @Select({"select SUM(zomore_commodity_sale_money) from zomore_commodity_sale where zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countMoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);
//折扣
  @Select({"select SUM(zomore_commodity_sale_letmoney) from zomore_commodity_sale where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countLetmoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);
//实收
  @Select({"select SUM(zomore_commodity_sale_inmoney) from zomore_commodity_sale where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  String countInmoney(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

  @Select({"select COUNT(zomore_commodity_sale_id) from zomore_commodity_sale where zomore_commodity_state=1 and zomore_commodity_shop=#{shop} and zomore_commodity_sale_time BETWEEN #{startTime} and #{endTime}"})
  Integer countSaleNum(@Param("shop")String shop, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

}
