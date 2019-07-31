package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityChange;
import com.zomore.domain.ZomoreCommodityChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityChangeMapper {
    long countByExample(ZomoreCommodityChangeExample example);

    int deleteByExample(ZomoreCommodityChangeExample example);

    int deleteByPrimaryKey(String zomoreCommodityChangeId);

    int insert(ZomoreCommodityChange record);

    int insertSelective(ZomoreCommodityChange record);

    List<ZomoreCommodityChange> selectByExample(ZomoreCommodityChangeExample example);

    ZomoreCommodityChange selectByPrimaryKey(String zomoreCommodityChangeId);

    int updateByExampleSelective(@Param("record") ZomoreCommodityChange record, @Param("example") ZomoreCommodityChangeExample example);

    int updateByExample(@Param("record") ZomoreCommodityChange record, @Param("example") ZomoreCommodityChangeExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityChange record);

    int updateByPrimaryKey(ZomoreCommodityChange record);
}