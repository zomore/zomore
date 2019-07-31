package com.zomore.dao;

import com.zomore.domain.ZomoreCashierPerformance;
import com.zomore.domain.ZomoreCashierPerformanceExample;

import java.util.Date;
import java.util.List;

import com.zomore.utils.CashierPerformanceResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZomoreCashierPerformanceMapper {
    long countByExample(ZomoreCashierPerformanceExample example);

    int deleteByExample(ZomoreCashierPerformanceExample example);

    int deleteByPrimaryKey(String zomoreCashierPerformanceId);

    int insert(ZomoreCashierPerformance record);

    int insertSelective(ZomoreCashierPerformance record);

    List<ZomoreCashierPerformance> selectByExample(ZomoreCashierPerformanceExample example);

    //根据时间段查询当前门店的收银台业绩
    @Select({"SELECT zomore_commodity_sale_name, SUM(zomore_commodity_sale_num)as num, SUM(zomore_commodity_sale_money) as oleprice,SUM(zomore_commodity_sale_inmoney) as allinprice,SUM(zomore_commodity_sale_savemoney) as savemoney from zomore_commodity_sale WHERE zomore_commodity_shop=#{shop} and zomore_commodity_state='1' and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} GROUP BY zomore_commodity_sale_name LIMIT #{pageNum},#{pageSize};"})
    List<CashierPerformanceResult> selectByPage(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime, @Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize);

    @Select({"SELECT zomore_commodity_sale_name, SUM(zomore_commodity_sale_num)as num, SUM(zomore_commodity_sale_money) as oleprice,SUM(zomore_commodity_sale_inmoney) as allinprice,SUM(zomore_commodity_sale_savemoney) as savemoney from zomore_commodity_sale WHERE zomore_commodity_shop=#{shop} and zomore_commodity_state='1' and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} GROUP BY zomore_commodity_sale_name;"})
    List<CashierPerformanceResult> select(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime);

    //根据时间段查询当前门店的收银台业绩
    @Select({"SELECT zomore_commodity_sale_name, SUM(zomore_commodity_sale_num)as num, SUM(zomore_commodity_sale_money) as oleprice,SUM(zomore_commodity_sale_inmoney) as allinprice,SUM(zomore_commodity_sale_savemoney) as savemoney from zomore_commodity_sale WHERE zomore_commodity_shop=#{shop} and zomore_commodity_state='1' and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} and zomore_commodity_sale_name=#{cashier} GROUP BY zomore_commodity_sale_name LIMIT #{pageNum},#{pageSize};"})
    List<CashierPerformanceResult> selectByPage1(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime, @Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize,@Param("cashier") String cashier);

    @Select({"SELECT zomore_commodity_sale_name, SUM(zomore_commodity_sale_num)as num, SUM(zomore_commodity_sale_money) as oleprice,SUM(zomore_commodity_sale_inmoney) as allinprice,SUM(zomore_commodity_sale_savemoney) as savemoney from zomore_commodity_sale WHERE zomore_commodity_shop=#{shop} and zomore_commodity_state='1' and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} and zomore_commodity_sale_name=#{cashier} GROUP BY zomore_commodity_sale_name;"})
    List<CashierPerformanceResult> select1(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime ,@Param("cashier") String cashier);

    ZomoreCashierPerformance selectByPrimaryKey(String zomoreCashierPerformanceId);


    int updateByExampleSelective(@Param("record") ZomoreCashierPerformance record, @Param("example") ZomoreCashierPerformanceExample example);

    int updateByExample(@Param("record") ZomoreCashierPerformance record, @Param("example") ZomoreCashierPerformanceExample example);

    int updateByPrimaryKeySelective(ZomoreCashierPerformance record);

    int updateByPrimaryKey(ZomoreCashierPerformance record);
}