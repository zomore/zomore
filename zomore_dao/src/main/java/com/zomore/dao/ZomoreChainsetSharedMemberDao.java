package com.zomore.dao;

import com.zomore.domain.HeadShop;
import com.zomore.domain.ZomoreChainsetSharedMember;

import java.util.List;

public interface ZomoreChainsetSharedMemberDao {
     //新增共享分组
     Integer insertZomoreChainsetSharedMember(ZomoreChainsetSharedMember zomoreChainsetSharedMember);

     //查询共享分组
     List<ZomoreChainsetSharedMember>  selectZomoreChainsetSharedMemberByMultipleId(ZomoreChainsetSharedMember zomoreChainsetSharedMember);
     //查询共享分组
     ZomoreChainsetSharedMember selectZomoreChainsetSharedMemberById(ZomoreChainsetSharedMember zomoreChainsetSharedMember);
     //更新分组信息
     Integer updateZomoreChainsetSharedMember(ZomoreChainsetSharedMember zomoreChainsetSharedMember);
     //删除分组信息
     Integer deleteZomoreChainsetSharedMember(String id);


}
