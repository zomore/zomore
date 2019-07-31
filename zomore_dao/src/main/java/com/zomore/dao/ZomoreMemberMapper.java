package com.zomore.dao;

import com.zomore.domain.ZomoreCommoditySale;
import com.zomore.domain.ZomoreMember;
import com.zomore.domain.ZomoreMemberExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ZomoreMemberMapper {
    long countByExample(ZomoreMemberExample example);

    List<Map<String, Object>> countBySex(String shop);

    int deleteByExample(ZomoreMemberExample example);

    int deleteByPrimaryKey(String memberMemberid);

    int insert(ZomoreMember record);

    int insertSelective(ZomoreMember record);

    List<ZomoreMember> selectByExampleWithBLOBs(ZomoreMemberExample example);

    //查询本店的会员
    List<ZomoreMember> selectZomoreMemberByMap(Map<String,Object> map);

    List<ZomoreMember> selectZomoreMenberByNumAndShops(Map<String,Object> map);

    List<ZomoreMember> selectAllshopMember(Map<String,Object> map);

    List<ZomoreMember> selectByExample(ZomoreMemberExample example);

    ZomoreMember selectByPrimaryKey(String memberMemberid);

    int updateByExampleSelective(@Param("record") ZomoreMember record, @Param("example") ZomoreMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") ZomoreMember record, @Param("example") ZomoreMemberExample example);

    int updateByExample(@Param("record") ZomoreMember record, @Param("example") ZomoreMemberExample example);

    int updateByPrimaryKeySelective(ZomoreMember record);

    int updateByPrimaryKeyWithBLOBs(ZomoreMember record);

    int updateByPrimaryKey(ZomoreMember record);

    // 会员普通商品消费总金额排行前五名
    @Select({"select zomore_commodity_sale_member as membername,zomore_commodity_sale_time as time,sum(zomore_commodity_sale_inmoney) as money,\n" +
            "zomore_commodity_shop as shop from zomore_commodity_sale where zomore_commodity_shop=#{shop} and zomore_commodity_state=1 and zomore_commodity_sale_member!='来宾'\n" +
            "and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} GROUP BY zomore_commodity_sale_member ORDER BY money desc limit 0,5"})
    List<Map<String,Object>> selectMemberSales(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime);

    //会员项目消费总金额排行前五名
    @Select({"select zomore_commodity_sale_member as membername,zomore_commodity_sale_time as time,sum(zomore_commodity_sale_inmoney) as money,\n" +
            "zomore_commodity_shop as shop from zomore_service_commodityorder where zomore_commodity_shop=#{shop} and zomore_commodity_state=1 and zomore_commodity_sale_member!='来宾'\n" +
            "and zomore_commodity_sale_time BETWEEN #{startime} AND #{endtime} GROUP BY zomore_commodity_sale_member ORDER BY money desc limit 0,5"})
    List<Map<String,Object>> selectMemberSales2(@Param("shop") String shop, @Param("startime") Date startime, @Param("endtime")Date endtime);

    @Select({"SELECT member_grade AS grade,COUNT(*)AS num FROM zomore_member WHERE member_shop=#{shop} and member_grade !='无' GROUP BY member_grade;"})
    List<Map<String,Object>> countGradeNum(@Param("shop") String shop);

    List<ZomoreMember>selectMemberGetBirthday(String shop);

    int inspetMemberUsernameExist(@Param("member")String member,@Param("memberShop")String memberShop);

}