package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityLossCommodity;
import com.zomore.domain.ZomoreCommodityLossCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityLossCommodityMapper {
    long countByExample(ZomoreCommodityLossCommodityExample example);

    int deleteByExample(ZomoreCommodityLossCommodityExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreCommodityLossCommodity record);

    int insertSelective(ZomoreCommodityLossCommodity record);

    List<ZomoreCommodityLossCommodity> selectByExample(ZomoreCommodityLossCommodityExample example);

    ZomoreCommodityLossCommodity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityLossCommodity record, @Param("example") ZomoreCommodityLossCommodityExample example);

    int updateByExample(@Param("record") ZomoreCommodityLossCommodity record, @Param("example") ZomoreCommodityLossCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityLossCommodity record);

    int updateByPrimaryKey(ZomoreCommodityLossCommodity record);
}