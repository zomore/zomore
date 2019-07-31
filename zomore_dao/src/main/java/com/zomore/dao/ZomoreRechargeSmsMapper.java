package com.zomore.dao;

import com.zomore.domain.ZomoreRechargeSms;
import com.zomore.domain.ZomoreRechargeSmsExample;

import java.util.List;

public interface ZomoreRechargeSmsMapper {

    List<ZomoreRechargeSms> selectAllZomoreRechargeSms();

    long countByExample(ZomoreRechargeSmsExample example);

    int deleteByExample(ZomoreRechargeSmsExample example);

    int deleteByPrimaryKey(String rechargesmsSmsid);

    int insert(ZomoreRechargeSms record);

    int insertSelective(ZomoreRechargeSms zomoreRechargeSms);

    List<ZomoreRechargeSms> selectByExample(ZomoreRechargeSmsExample example);

    ZomoreRechargeSms selectByPrimaryKey(String rechargesmsSmsid);

    int updateByExampleSelective(ZomoreRechargeSms record, ZomoreRechargeSmsExample example);

    int updateByExample(ZomoreRechargeSms record, ZomoreRechargeSmsExample example);

    int updateByPrimaryKeySelective(ZomoreRechargeSms record);

    int updateByPrimaryKey(ZomoreRechargeSms record);

}
