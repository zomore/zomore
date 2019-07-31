package com.zomore.dao;

import com.zomore.domain.CardClassification;
import com.zomore.domain.CardScheme;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public  interface SubCardDao
{
  @Select({"select * from card_classification"})
  public  List<CardClassification> findAllClassification()
    throws Exception;
  
  @Insert({"insert into card_classification set classificationId=#{classificationId},classificationName=#{classificationName},classificationRemark=#{classificationRemark}"})
  public  void saveClassification(CardClassification paramCardClassification)
    throws Exception;
  
  @Select({"select * from card_scheme"})
  public  List<CardScheme> findAllScheme()
    throws Exception;
  
  @Insert({"insert into card_scheme set schemeId=#{schemeId},cardName=#{cardName},cardType=#{cardType},servicelife=#{servicelife},shopName=#{shopName},saleMoney=#{saleMoney},useNum=#{useNum},effectivedays=#{effectivedays},createTime=#{createTime},dueTime=#{dueTime},remark=#{remark},status=#{status}"})
  public  void saveScheme(CardScheme paramCardScheme)
    throws Exception;
  
  @Select({"select * from card_classification where classificationId = #{classificationId}"})
  public  CardClassification findClassificationById(Long paramLong)
    throws Exception;
  
  @Update({"update card_classification set classificationId=#{classificationId},classificationName=#{classificationName},classificationRemark=#{classificationRemark} where classificationId=#{classificationId}"})
  public  void updatedClassificationById(CardClassification paramCardClassification)
    throws Exception;
}

