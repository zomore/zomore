package com.zomore.dao;

import com.zomore.domain.ZomoreMemberPoint;
import com.zomore.domain.ZomoreMemberPointExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberPointMapper {
    long countByExample(ZomoreMemberPointExample example);

    int deleteByExample(ZomoreMemberPointExample example);

    int deleteByPrimaryKey(Integer zomoreMemberPointId);

    int insert(ZomoreMemberPoint record);

    int insertSelective(ZomoreMemberPoint record);

    List<ZomoreMemberPoint> selectByExampleWithBLOBs(ZomoreMemberPointExample example);

    List<ZomoreMemberPoint> selectByExample(ZomoreMemberPointExample example);

    ZomoreMemberPoint selectByPrimaryKey(Integer zomoreMemberPointId);

    Double selsectMemberPoitNumber(@Param("zomoreMemberPointCode") String zomoreMemberPointCode);

    int updateByExampleSelective(@Param("record") ZomoreMemberPoint record, @Param("example") ZomoreMemberPointExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreMemberPoint record, @Param("example") ZomoreMemberPointExample example);

    int updateByExample(@Param("record") ZomoreMemberPoint record, @Param("example") ZomoreMemberPointExample example);

    int updateByPrimaryKeySelective(ZomoreMemberPoint record);

    int updateByPrimaryKeyWithBLOBs(ZomoreMemberPoint record);

    int updateByPrimaryKey(ZomoreMemberPoint record);
}