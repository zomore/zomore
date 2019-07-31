package com.zomore.dao;

import com.zomore.domain.Dailyreport;
import com.zomore.domain.DailyreportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyreportMapper {
    long countByExample(DailyreportExample example);

    int deleteByExample(DailyreportExample example);

    int deleteByPrimaryKey(Long dailyid);

    int insert(Dailyreport record);

    int insertSelective(Dailyreport record);

    List<Dailyreport> selectByExample(DailyreportExample example);

    Dailyreport selectByPrimaryKey(Long dailyid);

    int updateByExampleSelective(@Param("record") Dailyreport record, @Param("example") DailyreportExample example);

    int updateByExample(@Param("record") Dailyreport record, @Param("example") DailyreportExample example);

    int updateByPrimaryKeySelective(Dailyreport record);

    int updateByPrimaryKey(Dailyreport record);
}