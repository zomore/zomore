package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityWholesaleCommodity;
import com.zomore.domain.ZomoreCommodityWholesaleCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityWholesaleCommodityMapper {
    long countByExample(ZomoreCommodityWholesaleCommodityExample example);

    int deleteByExample(ZomoreCommodityWholesaleCommodityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreCommodityWholesaleCommodity record);

    int insertSelective(ZomoreCommodityWholesaleCommodity record);

    List<ZomoreCommodityWholesaleCommodity> selectByExampleWithBLOBs(ZomoreCommodityWholesaleCommodityExample example);

    List<ZomoreCommodityWholesaleCommodity> selectByExample(ZomoreCommodityWholesaleCommodityExample example);

    ZomoreCommodityWholesaleCommodity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityWholesaleCommodity record, @Param("example") ZomoreCommodityWholesaleCommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCommodityWholesaleCommodity record, @Param("example") ZomoreCommodityWholesaleCommodityExample example);

    int updateByExample(@Param("record") ZomoreCommodityWholesaleCommodity record, @Param("example") ZomoreCommodityWholesaleCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityWholesaleCommodity record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCommodityWholesaleCommodity record);

    int updateByPrimaryKey(ZomoreCommodityWholesaleCommodity record);
}