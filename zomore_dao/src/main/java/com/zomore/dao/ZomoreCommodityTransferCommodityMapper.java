package com.zomore.dao;

import com.zomore.domain.ZomoreCommodityTransfer;
import com.zomore.domain.ZomoreCommodityTransferCommodity;
import com.zomore.domain.ZomoreCommodityTransferCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreCommodityTransferCommodityMapper {
    long countByExample(ZomoreCommodityTransferCommodityExample example);

    int deleteByExample(ZomoreCommodityTransferCommodityExample example);

    int deleteByPrimaryKey(String id);

    int insert(ZomoreCommodityTransferCommodity record);

    int insertSelective(ZomoreCommodityTransferCommodity record);

    List<ZomoreCommodityTransferCommodity> selectByExample(ZomoreCommodityTransferCommodityExample example);

    ZomoreCommodityTransferCommodity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ZomoreCommodityTransferCommodity record, @Param("example") ZomoreCommodityTransferCommodityExample example);

    int updateByExample(@Param("record") ZomoreCommodityTransferCommodity record, @Param("example") ZomoreCommodityTransferCommodityExample example);

    int updateByPrimaryKeySelective(ZomoreCommodityTransferCommodity record);

    int updateByPrimaryKey(ZomoreCommodityTransferCommodity record);






}