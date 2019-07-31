package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityWholesale;
import com.zomore.domain.ZomoreCommodityWholesaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityWholesaleMapper {
    long countByExample(ZomoreCommodityWholesaleExample example);

    int deleteByExample(ZomoreCommodityWholesaleExample example);

    int deleteByPrimaryKey(String zomoreCommodityWholesaleId);

    int insert(ZomoreCommodityWholesale record);

    int insertSelective(ZomoreCommodityWholesale record);

    List<ZomoreCommodityWholesale> selectByExampleWithBLOBs(ZomoreCommodityWholesaleExample example);

    List<ZomoreCommodityWholesale> selectByExample(ZomoreCommodityWholesaleExample example);

    ZomoreCommodityWholesale selectByPrimaryKey(String zomoreCommodityWholesaleId);

    int updateByExampleSelective(@Param("record") ZomoreCommodityWholesale record, @Param("example") ZomoreCommodityWholesaleExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreCommodityWholesale record, @Param("example") ZomoreCommodityWholesaleExample example);

    int updateByExample(@Param("record") ZomoreCommodityWholesale record, @Param("example") ZomoreCommodityWholesaleExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityWholesale record);

    int updateByPrimaryKeyWithBLOBs(ZomoreCommodityWholesale record);

    int updateByPrimaryKey(ZomoreCommodityWholesale record);
}