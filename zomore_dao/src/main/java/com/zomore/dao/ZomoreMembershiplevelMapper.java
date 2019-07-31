package com.zomore.dao;

import com.zomore.domain.ZomoreMembershiplevel;
import com.zomore.domain.ZomoreMembershiplevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMembershiplevelMapper {
    long countByExample(ZomoreMembershiplevelExample example);

    int deleteByExample(ZomoreMembershiplevelExample example);

    int deleteByPrimaryKey(String membershiplevelId);

    int insert(ZomoreMembershiplevel record);

    int insertSelective(ZomoreMembershiplevel record);

    List<ZomoreMembershiplevel> selectByExample(ZomoreMembershiplevelExample example);

    ZomoreMembershiplevel selectByPrimaryKey(String membershiplevelId);

    int updateByExampleSelective(@Param("record") ZomoreMembershiplevel record, @Param("example") ZomoreMembershiplevelExample example);

    int updateByExample(@Param("record") ZomoreMembershiplevel record, @Param("example") ZomoreMembershiplevelExample example);

    int updateByPrimaryKeySelective(ZomoreMembershiplevel record);

    int updateByPrimaryKey(ZomoreMembershiplevel record);

    //查询会员等级
    List<String> selectAllShopZomoreMemberlevel(String shop);
}