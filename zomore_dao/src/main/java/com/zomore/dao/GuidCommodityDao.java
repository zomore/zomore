package com.zomore.dao;

import com.zomore.utils.GuidCommodity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface GuidCommodityDao {

    @Select({"SELECT zomore_commodity_sale_guide as guidName,zomore_commodity_sale_inmoney as realmoney \n" +
            "from zomore_commodity_sale where zomore_commodity_sale_guide=#{name} and zomore_commodity_sale_time BETWEEN #{startime}\n" +
            "and #{endtime} and zomore_commodity_state=2;"})
    public List<GuidCommodity> selectGuidCommodity(@Param("name") String name, @Param("startime") Date startime, @Param("endtime") Date endtime) throws  Exception;

    @Select({"SELECT zomore_commodity_sale_guide as guidName,zomore_commodity_sale_inmoney as realmoney \n" +
            "from zomore_service_commodityorder where zomore_commodity_sale_guide=#{name} and zomore_commodity_sale_time BETWEEN #{startime}\n" +
            "and #{endtime}  and zomore_commodity_state=2;"})
    public List<GuidCommodity> selectGuidCommodity2(@Param("name") String name, @Param("startime") Date startime, @Param("endtime") Date endtime) throws  Exception;


}
