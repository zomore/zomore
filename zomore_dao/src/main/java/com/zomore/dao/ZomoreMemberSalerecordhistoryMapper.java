package com.zomore.dao;

import com.zomore.domain.ZomoreMemberSalerecordhistory;
import com.zomore.domain.ZomoreMemberSalerecordhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberSalerecordhistoryMapper {
    long countByExample(ZomoreMemberSalerecordhistoryExample example);

    int deleteByExample(ZomoreMemberSalerecordhistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberSalerecordhistory record);

    int insertSelective(ZomoreMemberSalerecordhistory record);

    List<ZomoreMemberSalerecordhistory> selectByExample(ZomoreMemberSalerecordhistoryExample example);

    ZomoreMemberSalerecordhistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberSalerecordhistory record, @Param("example") ZomoreMemberSalerecordhistoryExample example);

    int updateByExample(@Param("record") ZomoreMemberSalerecordhistory record, @Param("example") ZomoreMemberSalerecordhistoryExample example);

    int updateByPrimaryKeySelective(ZomoreMemberSalerecordhistory record);

    int updateByPrimaryKey(ZomoreMemberSalerecordhistory record);
}