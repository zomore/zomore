package com.zomore.controller;

import com.zomore.domain.HeadShop;
import com.zomore.domain.ZomoreCommodity;
import com.zomore.service.MemberShopService;
import com.zomore.service.ZomoreCommodityService;
import com.zomore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Autowired
    private MemberShopService memberShopServiceImpl;

    /**
     * 获取商店的所有商品到session中
     * @param
     * @param session
     * @param
     * @return
     */
    @RequestMapping("/findAllCommodityByShop.do")
    @ResponseBody
    public  List<ZomoreCommodity> findAllCommodity(HttpSession session, PageUtils pageUtils){
        //ZomoreMember user = (ZomoreMember)session.getAttribute("user");
        //String shop=user.getMemberShop();
        HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
        //if(session.getAttribute("indexCommodity")==null){
           //起始索引
            Integer start = (pageUtils.getCurrentPage()-1)*(pageUtils.getPageSize());
            pageUtils.setStart(start);
            pageUtils.setShopName(headShop.getShopName());
            List<ZomoreCommodity> zomoreCommodityList = zomoreCommodityServiceImpl.selectAllCommodityByShop(pageUtils);
            return zomoreCommodityList;
       /* } else {
            List<ZomoreCommodity> zomoreCommodityList = (List<ZomoreCommodity>) session.getAttribute("indexCommodity");
            return zomoreCommodityList;
        }*/
       /* PageResult<ZomoreCommodityResult> list = zomoreCommodityServiceImpl.selectByPage(page);*/
       /* List<Map<String,Object>> zomoreCommodityList = zomoreCommodityServiceImpl.selectAllCommodityByShop(user.getMemberShop());*/

    }

    /**
     * 获取商品的具体信息
     * @param session
     * @param commodityCode
     * @param model
     * @return
     */
    @RequestMapping("/findCommodityDetails.do")
    public String findCommodityDetails(HttpSession session,String commodityCode,Model model){
        /*ZomoreMember user = (ZomoreMember)session.getAttribute("user");
        String name = user.getMemberShop();*/
        HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
       ZomoreCommodity zomoreCommodity = zomoreCommodityServiceImpl.selectCommodityDetails(headShop.getShopName(),commodityCode);
        model.addAttribute("zomoreCommodity",zomoreCommodity);
        return "forward:/pages/commodityDetail.jsp";
    }




}
