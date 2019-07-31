package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralHistory;
import com.zomore.domain.ZomoreIntegralHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreIntegralHistoryMapper {
    long countByExample(ZomoreIntegralHistoryExample example);

    int deleteByExample(ZomoreIntegralHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreIntegralHistory record);

    int insertSelective(ZomoreIntegralHistory record);

    List<ZomoreIntegralHistory> selectByExampleWithBLOBs(ZomoreIntegralHistoryExample example);

    List<ZomoreIntegralHistory> selectByExample(ZomoreIntegralHistoryExample example);

    ZomoreIntegralHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreIntegralHistory record, @Param("example") ZomoreIntegralHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreIntegralHistory record, @Param("example") ZomoreIntegralHistoryExample example);

    int updateByExample(@Param("record") ZomoreIntegralHistory record, @Param("example") ZomoreIntegralHistoryExample example);

    int updateByPrimaryKeySelective(ZomoreIntegralHistory record);

    int updateByPrimaryKeyWithBLOBs(ZomoreIntegralHistory record);

    int updateByPrimaryKey(ZomoreIntegralHistory record);
}