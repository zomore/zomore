package com.zomore.dao;

import com.zomore.domain.Reservation;
import com.zomore.domain.ZomoreCashier;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public  interface PayDao
{
  @Select({"select * from zomore_cashier where cashierUsername = #{cashierUsername} and cashierPassword=#{cashierPassword}"})
  public  ZomoreCashier secondLogin(String paramString1, String paramString2);
  
  @Insert({"insert into reservation set createTime = #{createTime},dueTime=#{dueTime},serverItem=#{serverItem},member=#{member},phone=#{phone},repay=#{repay},status=#{status},payway=#{payway},remark=#{remark},serverer=#{serverer}"})
  public  void saveReservation(Reservation paramReservation)
    throws Exception;
}
