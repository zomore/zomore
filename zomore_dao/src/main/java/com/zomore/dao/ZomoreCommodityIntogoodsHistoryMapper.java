package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityIntogoods;
import com.zomore.domain.ZomoreCommodityIntogoodsHistory;
import com.zomore.domain.ZomoreCommodityIntogoodsHistoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityIntogoodsHistoryMapper {
    long countByExample(ZomoreCommodityIntogoodsHistoryExample example);

    int deleteByExample(ZomoreCommodityIntogoodsHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreCommodityIntogoodsHistory record);

    int insertSelective(ZomoreCommodityIntogoodsHistory record);

    List<ZomoreCommodityIntogoodsHistory> selectByExampleWithBLOBs(ZomoreCommodityIntogoodsHistoryExample example);

    List<ZomoreCommodityIntogoodsHistory> selectByExample(ZomoreCommodityIntogoodsHistoryExample example);

    ZomoreCommodityIntogoodsHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityIntogoodsHistory record, @Param("example") ZomoreCommodityIntogoodsHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCommodityIntogoodsHistory record, @Param("example") ZomoreCommodityIntogoodsHistoryExample example);

    int updateByExample(@Param("record") ZomoreCommodityIntogoodsHistory record, @Param("example") ZomoreCommodityIntogoodsHistoryExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityIntogoodsHistory record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCommodityIntogoodsHistory record);

    int updateByPrimaryKey(ZomoreCommodityIntogoodsHistory record);

    List<ZomoreCommodityIntogoodsHistory> selectHistoryIntogoods(String shop);

    List< ZomoreCommodityIntogoodsHistory> selectAllshopHistoryIntogoods(Map<String,Object> map);

    List<ZomoreCommodityIntogoodsHistory>selectHistoryIntogoods2(@Param("shop") String shop,@Param("intoGoods") String intoGoods);

    List<ZomoreCommodityIntogoods> selectHistoryIntogoodsDetails(@Param("intoGoodsId") String intoGoodsId);

    void deleteIntoGoodsById(@Param("intoGoodsId") String intoGoodsId);


}