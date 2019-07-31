package com.zomore.controller;

import com.zomore.service.MarketingPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Calendar;
import java.util.Date;

@Controller
public class aaa {
    @Autowired
    private MarketingPromotionService marketingPromotionService;
    //任务调度
    public void refresh() throws Exception{
        //List<MarketingPromotion> marketingPromotionList = marketingPromotionService.findAllMarket();
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        Date time = calendar.getTime();
        System.out.println(time);
        marketingPromotionService.refresh(time);
    }


    public void saveDate()throws Exception{






    }
}
