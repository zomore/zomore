package com.zomore.dao;

import com.zomore.domain.ZomoreMember;
import com.zomore.domain.ZomoreMemberInput;
import com.zomore.domain.ZomoreMemberInputExample;
import java.util.List;
import java.util.Map;

import com.zomore.domain.ZomoreMemberInputRecord;
import com.zomore.utils.MemberInputRecordAndMemberVo;
import com.zomore.utils.PageResult;
import org.apache.ibatis.annotations.Param;

public interface ZomoreMemberInputMapper {
    long countByExample(ZomoreMemberInputExample example);

    int deleteByExample(ZomoreMemberInputExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZomoreMemberInput record);

    int insertSelective(ZomoreMemberInput record);

    List<ZomoreMemberInput> selectByExample(ZomoreMemberInputExample example);

    ZomoreMemberInput selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZomoreMemberInput record, @Param("example") ZomoreMemberInputExample example);

    int updateByExample(@Param("record") ZomoreMemberInput record, @Param("example") ZomoreMemberInputExample example);

    int updateByPrimaryKeySelective(ZomoreMemberInput record);

    int updateByPrimaryKey(ZomoreMemberInput record);

    List<Map<String ,Object>> selectNumAndMoneyByName(@Param("name") List<String> name);
    //标记一下
   /* List<ZomoreMemberInputRecord> selectAndGradePH(@Param("name") List<String> name);*/

    List<MemberInputRecordAndMemberVo>  selectMemberInputRecordAndMemberVo (@Param("name") List<String> name);

    List<MemberInputRecordAndMemberVo>selectMemberInputRecordAndMemberVoBySearch(@Param("page")PageResult<MemberInputRecordAndMemberVo> page,@Param("memberName") String memberName,@Param("startime") String startime,@Param("endtime")String endtime,@Param("shiplevelName")String shiplevelName,@Param("shop")String shop);

    List<String> selectOnlyName(String shop);

    List<ZomoreMember> selectAllMemberLevel(String shop);
}