package com.zomore.dao;

import com.zomore.domain.ZomoreIntegralRecord;
import com.zomore.domain.ZomoreIntegralRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreIntegralRecordMapper {
    long countByExample(ZomoreIntegralRecordExample example);

    int deleteByExample(ZomoreIntegralRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreIntegralRecord record);

    int insertSelective(ZomoreIntegralRecord record);

    List<ZomoreIntegralRecord> selectByExampleWithBLOBs(ZomoreIntegralRecordExample example);

    List<ZomoreIntegralRecord> selectByExample(ZomoreIntegralRecordExample example);

    ZomoreIntegralRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreIntegralRecord record, @Param("example") ZomoreIntegralRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreIntegralRecord record, @Param("example") ZomoreIntegralRecordExample example);

    int updateByExample(@Param("record") ZomoreIntegralRecord record, @Param("example") ZomoreIntegralRecordExample example);

    int updateByPrimaryKeySelective(ZomoreIntegralRecord record);

    int updateByPrimaryKeyWithBLOBs(ZomoreIntegralRecord record);

    int updateByPrimaryKey(ZomoreIntegralRecord record);
}