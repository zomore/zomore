package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityBand;
import com.zomore.domain.ZomoreCommodityBandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityBandMapper {
    long countByExample(ZomoreCommodityBandExample example);

    int deleteByExample(ZomoreCommodityBandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreCommodityBand record);

    int insertSelective(ZomoreCommodityBand record);

    List<ZomoreCommodityBand> selectByExample(ZomoreCommodityBandExample example);

    ZomoreCommodityBand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityBand record, @Param("example") ZomoreCommodityBandExample example);

    int updateByExample(@Param("record") ZomoreCommodityBand record, @Param("example") ZomoreCommodityBandExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityBand record);

    int updateByPrimaryKey(ZomoreCommodityBand record);

    List<String> selectByCommodityName (String name);
}