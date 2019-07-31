package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityIntogoods;
import com.zomore.domain.ZomoreCommodityIntogoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityIntogoodsMapper {
    long countByExample(ZomoreCommodityIntogoodsExample example);

    int deleteByExample(ZomoreCommodityIntogoodsExample example);

    int deleteByPrimaryKey(String zomoreCommodityIntogoodsId);

    int insert(ZomoreCommodityIntogoods record);

    int insertSelective(ZomoreCommodityIntogoods record);

    List<ZomoreCommodityIntogoods> selectByExample(ZomoreCommodityIntogoodsExample example);

    ZomoreCommodityIntogoods selectByPrimaryKey(String zomoreCommodityIntogoodsId);

    int updateByExampleSelective(@Param("record") ZomoreCommodityIntogoods record, @Param("example") ZomoreCommodityIntogoodsExample example);

    int updateByExample(@Param("record") ZomoreCommodityIntogoods record, @Param("example") ZomoreCommodityIntogoodsExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityIntogoods record);

    int updateByPrimaryKey(ZomoreCommodityIntogoods record);
}