package com.zomore.controller;


import com.zomore.domain.HeadShop;
import com.zomore.domain.ZomoreCommodity;
import com.zomore.domain.ZomoreCommodityCategory;
import com.zomore.service.ClassificationService;
import com.zomore.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/classify")
public class ClassificationController {
    @Autowired
    private ClassificationService classificationServiceImpl;
    @RequestMapping("/selectClassify.do")
    public String selectClassify(HttpSession session){
        List<ZomoreCommodityCategory> oneClassify = (List<ZomoreCommodityCategory>) session.getAttribute("oneClassify");
        List<ZomoreCommodityCategory> twoClassify = (List<ZomoreCommodityCategory>) session.getAttribute("twoClassify");
        if (oneClassify==null||twoClassify==null){
            HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
            //ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
            //封装一级分类查询条件
            ZomoreCommodityCategory zomoreCommodityCategory = new ZomoreCommodityCategory();
            //zomoreCommodityCategory.setShop(zomoreMember.getMemberShop());
            zomoreCommodityCategory.setShop(headShop.getShopName());
            zomoreCommodityCategory.setZomoreCommodityIsparent(1);
            oneClassify = classificationServiceImpl.selectClassify(zomoreCommodityCategory);

            //封装二级分类查询条件
            ZomoreCommodityCategory zomoreCommodityCategory2 = new ZomoreCommodityCategory();
            //zomoreCommodityCategory2.setShop(zomoreMember.getMemberShop());
            zomoreCommodityCategory2.setShop(headShop.getShopName());
            zomoreCommodityCategory2.setZomoreCommodityIsparent(0);
            twoClassify = classificationServiceImpl.selectClassify(zomoreCommodityCategory2);

            session.setAttribute("oneClassify",oneClassify);
            session.setAttribute("twoClassify",twoClassify);
        }

        return "forward:/pages/classify.jsp";

    }

    //进入分类详情页
    @RequestMapping("/findClassifyCommoditys.do")
    public String findClassifyCommoditys(Model model, String zomoreCommodityCategoryName ){

        model.addAttribute("zomoreCommodityCategoryName",zomoreCommodityCategoryName);
        return "forward:/pages/classifyDetails.jsp";
    }

    //获取分类数据
    @RequestMapping("/findClassifyCommodityData.do")
    @ResponseBody
    public  List<ZomoreCommodity> findClassifyCommodityData(HttpSession session, PageUtils pageUtils){
//            ZomoreMember zomoreMember = (ZomoreMember) session.getAttribute("user");
//            pageUtils.setShopName(zomoreMember.getMemberShop());

        HeadShop headShop = (HeadShop) session.getAttribute("isCommodity");
        pageUtils.setShopName(headShop.getShopName());
            Integer start = (pageUtils.getCurrentPage()-1)*pageUtils.getPageSize();
            pageUtils.setStart(start);

        List<ZomoreCommodity>  zomoreCommodityList = classificationServiceImpl.findClassifyCommodityData(pageUtils);

            return zomoreCommodityList;

    }





}
