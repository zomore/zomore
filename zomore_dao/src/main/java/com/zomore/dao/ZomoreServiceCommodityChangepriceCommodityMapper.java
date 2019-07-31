package com.zomore.dao;

import com.zomore.domain.ZomoreServiceCommodityChangepriceCommodity;
import com.zomore.domain.ZomoreServiceCommodityChangepriceCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreServiceCommodityChangepriceCommodityMapper {
    long countByExample(ZomoreServiceCommodityChangepriceCommodityExample example);

    int deleteByExample(ZomoreServiceCommodityChangepriceCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreServiceCommodityChangepriceCommodity record);

    int insertSelective(ZomoreServiceCommodityChangepriceCommodity record);

    List<ZomoreServiceCommodityChangepriceCommodity> selectByExample(ZomoreServiceCommodityChangepriceCommodityExample example);

    ZomoreServiceCommodityChangepriceCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreServiceCommodityChangepriceCommodity record, @Param("example") ZomoreServiceCommodityChangepriceCommodityExample example);

    int updateByExample(@Param("record") ZomoreServiceCommodityChangepriceCommodity record, @Param("example") ZomoreServiceCommodityChangepriceCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreServiceCommodityChangepriceCommodity record);

    int updateByPrimaryKey(ZomoreServiceCommodityChangepriceCommodity record);
}