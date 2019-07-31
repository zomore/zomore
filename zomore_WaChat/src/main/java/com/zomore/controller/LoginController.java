package com.zomore.controller;
import com.zomore.domain.ZomoreShoppingGuide;
import com.zomore.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller("loginController")
@RequestMapping("loginController")
public class LoginController {
    @Autowired
    private  ZomoreShoppingGuideService zomoreShoppingGuideServiceImpl;
    @Resource
    private EcharService echarServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private WaChatService waChatServiceImpl;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    //员工登陆
    @RequestMapping("login")
    public String login(String phone, String password,HttpSession session) {
        ZomoreShoppingGuide select = zomoreShoppingGuideServiceImpl.select(phone, password);
        if (select == null) {
            //返回登陆页面
            return "redirect:/pages/login.jsp";
        }
        //登陆成功
        session.setAttribute("user",select);

        return "redirect:/loginController/select.do";
    }

    @RequestMapping("select")
    public String indexMessage(Model model)throws Exception{
        //获取营业额
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = format.format(date);
        date = format.parse(format1);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String format2 = format.format(calendar.getTime());
        Date date1 = format.parse(format2);
        //获取销售额
        Map<String, Object> result = echarServiceImpl.selectShopAllin(date, date1);
        model.addAttribute("ShopAllin",result);
        //获取每日订单数
       Integer result1 = waChatServiceImpl.SelectOrder(date,date1);/*zomoreCommodityServiceImpl*/
       model.addAttribute("Order",result1);
     /*   List<Map<String, Object>> lists = echarServiceImpl.selctSaleOrderfire();
        model.addAttribute("Hot",lists);*/

        //获取五件热销商品
        List<Map<String, Object>> lists = waChatServiceImpl.selctSaleOrderfireDetailed();/*echarServiceImpl*/
        model.addAttribute("Hot",lists);

        //获取五件热销项目
        List<Map<String, Object>> lists1 = waChatServiceImpl.selctServiceSaleOrderfireDetailed();
        model.addAttribute("Hot1",lists1);


    //折线图：销售总量、会员消费量
        Map<String, Object>  map = zomoreCommoditySaleServiceImpl.selectTotal();
        model.addAttribute("countSale",map);

        Map<String, Object>  map2 = zomoreCommoditySaleServiceImpl.selectTotalMemberPay();
        model.addAttribute("memberPay",map2);

        //查询会员
        //新增会员人数
        Integer dou1 = waChatServiceImpl.UpMemberForDay(date,date1);/*zomoreMemberServiceImpl*/
        //会员总人数
        Integer dou2 = waChatServiceImpl.UpMemberInMember();
        if(dou2 == 0){
            Integer dou = 1;
            model.addAttribute("Percentage",dou);
        }
        else{
            BigDecimal decimal = new BigDecimal(String.valueOf(dou1));
            BigDecimal decimal2= new BigDecimal(String.valueOf(dou2));
            BigDecimal dou4 = decimal.divide(decimal2,4,BigDecimal.ROUND_HALF_UP);
            String dou = String.valueOf(dou4);
            model.addAttribute("Percentage",dou);
        }
        /* Integer dou = dou1*100/dou2;*/
        model.addAttribute("Newmember",dou1);
        model.addAttribute("Member",dou2);
        /* model.addAttribute("Percentage",dou);*/

        Integer money = waChatServiceImpl.selectProfit(date,date1);
        model.addAttribute("Profit",money);
        return "forward:/pages/index.jsp";
    }

/*    @RequestMapping("select1")
    public String index(Model model)throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = format.format(date);
        date = format.parse(format1);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        String format2 = format.format(calendar.getTime());
        Date date1 = format.parse(format2);
        //获取销售额
        Map<String, Object> result = echarServiceImpl.selectShopAllin(date, date1);
        model.addAttribute("ShopAllin",result);

        return "forward:/pages/index.jsp";
}*/

}
