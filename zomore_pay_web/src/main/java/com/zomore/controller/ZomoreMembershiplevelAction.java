package com.zomore.controller;

import com.zomore.dao.ZomoreMembershiplevelMapper;
import com.zomore.domain.ZomoreMember;
import com.zomore.domain.ZomoreMembershiplevel;
import com.zomore.service.ZomoreMemberService;
import com.zomore.service.ZomoreMembershiplevelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;
//会员等级
@Controller("zomoreMembershiplevelAction")
@RequestMapping("zomoreMembershiplevel")
public class ZomoreMembershiplevelAction {
    @Resource
    private ZomoreMembershiplevelService zomoreMembershiplevelServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;

    //查询所有会员等级
    @RequestMapping("selectAllZomoreMembershiplevel")
    public String selectAllZomoreMembershiplevel(Model model) {
        List<ZomoreMembershiplevel> zomoreMembershiplevels = zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel();
        model.addAttribute("memberGrade", 0);
        List list=new ArrayList();
        //临近升级人数
        for(int i=0;i<zomoreMembershiplevels.size();i++) {
            String membershiplevelRule = zomoreMembershiplevels.get(i).getMembershiplevelRule();
            List<ZomoreMember> zomoreMember=new ArrayList<>();
            if(membershiplevelRule!=null&&!membershiplevelRule.trim().equals("")){
            Double membershiplevelNearupgrade = zomoreMembershiplevels.get(i).getMembershiplevelNearupgrade();
                zomoreMember = zomoreMemberServiceImpl.selectAllZomoreMemberByintegral(Double.parseDouble(membershiplevelRule), membershiplevelNearupgrade);
            }
            int size = zomoreMember.size();
            list.add(size);
        }
        model.addAttribute("nearsize" ,list);
        model.addAttribute("result",zomoreMembershiplevels);
        return "forward:/pages/zomoreMembershiplevel.jsp";
    }

    /**
     * 修改会员规则
     * @param id   会员规则id
     * @param rule //修改的会员积分规则参数
     * @return
     */
    @RequestMapping("updateZomoreMembershiplevelRule")
    @ResponseBody
    public String updateZomoreMembershiplevelRule(String id, String rule) {
        ZomoreMembershiplevel zomoreMembershiplevel = new ZomoreMembershiplevel();
        zomoreMembershiplevel.setMembershiplevelId(id);
        zomoreMembershiplevel.setMembershiplevelRule(rule);
        boolean b = zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelById(zomoreMembershiplevel);
        if (b) {
            return "success";
        } else {
            return "error";
        }
    }
    //修改会员规则页面
    @RequestMapping("updateZomoreMemberUI")
    public String updateZomoreMemberUI(String id,Model model){
        model.addAttribute("result",zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelById(id));
        return "forward:/pages/editzomoreMembershiplevel.jsp";
    }
    //更新会员规则资料
    @RequestMapping("updateZomoreMember")
    public String updateZomoreMember(ZomoreMembershiplevel zomoreMembershiplevel,Model model){
        //先判断是否为默认会员
        if(zomoreMembershiplevel.getMembershiplevelDefault()==1){
            //如果是，先把以前设置的默认会员去掉
            zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelByMembershiplevelDefault(1);
        }
        zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelById(zomoreMembershiplevel);
        return "redirect:/zomoreMembershiplevel/selectAllZomoreMembershiplevel.do";
    }
    //添加会员规则界面
    @RequestMapping("insertZomoreMemberUI")
    public String insertZomoreMemberUI(){
        return "addzomoreMembershiplevel";
    }
    //添加会员规则资料
    @RequestMapping("insertZomoreMember")
    public String insertZomoreMember(ZomoreMembershiplevel zomoreMember,String membershiplevelTimeAll,Model model){
        //先判断是否为默认会员
        if(zomoreMember.getMembershiplevelDefault()==1){
            //如果是，先把以前设置的默认会员去掉
            zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelByMembershiplevelDefault(1);
        }
        zomoreMember.setMembershiplevelId(Long.toString(System.currentTimeMillis()));
        zomoreMembershiplevelServiceImpl.insertZomoreMembershiplevel(zomoreMember);
        return "redirect:/zomoreMembershiplevel/selectAllZomoreMembershiplevel.do";
    }
    //删除会员规则
    @RequestMapping("deletedZomoreMember")
    public String deletedZomoreMember(String[] ids,Model model){
        zomoreMembershiplevelServiceImpl.deletedZomoreMembershiplevelByIds(ids);
        return "redirect:/zomoreMembershiplevel/selectAllZomoreMembershiplevel.do";
    }

}
