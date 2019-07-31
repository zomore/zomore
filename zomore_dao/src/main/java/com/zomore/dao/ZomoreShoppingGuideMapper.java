package com.zomore.dao;

import com.zomore.domain.ZomoreShoppingGuide;
import com.zomore.domain.ZomoreShoppingGuideExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public  interface ZomoreShoppingGuideMapper
{
  public  long countByExample(ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  int deleteByExample(ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  int deleteByPrimaryKey(String paramString);
  
  public  int insert(ZomoreShoppingGuide paramZomoreShoppingGuide);
  
  public  int insertSelective(ZomoreShoppingGuide paramZomoreShoppingGuide);
  
  public  List<ZomoreShoppingGuide> selectByExampleWithBLOBs(ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);

  List<ZomoreShoppingGuide>  selectMultipleAllshopGuides(Map<String,Object> map);

  public  List<ZomoreShoppingGuide> selectByExample(ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  ZomoreShoppingGuide selectByPrimaryKey(String paramString);
  
  public  int updateByExampleSelective(@Param("record") ZomoreShoppingGuide paramZomoreShoppingGuide, @Param("example") ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  int updateByExampleWithBLOBs(@Param("record") ZomoreShoppingGuide paramZomoreShoppingGuide, @Param("example") ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  int updateByExample(@Param("record") ZomoreShoppingGuide paramZomoreShoppingGuide, @Param("example") ZomoreShoppingGuideExample paramZomoreShoppingGuideExample);
  
  public  int updateByPrimaryKeySelective(ZomoreShoppingGuide paramZomoreShoppingGuide);
  
  public  int updateByPrimaryKeyWithBLOBs(ZomoreShoppingGuide paramZomoreShoppingGuide);
  
  public  int updateByPrimaryKey(ZomoreShoppingGuide paramZomoreShoppingGuide);

  @Select({"select shopping_guide_name as shoppingGuideName,shopping_guide_sale as shoppingGuideSale,shopping_guide_id as shoppingGuideId ,shopping_guide_sale as shoppingGuideSale,shopping_guide_phone as shoppingGuidePhone from zomore_shopping_guide where shopping_guide_cashier_store=#{shop} and shopping_guide_name=#{name}"})
  List<ZomoreShoppingGuide> selectGuideByNameAndShop(@Param("shop") String shop,@Param("name") String name);
}

