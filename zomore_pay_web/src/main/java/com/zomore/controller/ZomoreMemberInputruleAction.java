package com.zomore.controller;

import com.zomore.domain.ZomoreMember;
import com.zomore.domain.ZomoreMemberInputRecord;
import com.zomore.domain.ZomoreMemberInputrule;
import com.zomore.service.ZomoreMemberInputRecordService;
import com.zomore.service.ZomoreMemberInputruleService;
import com.zomore.service.ZomoreMemberService;
import com.zomore.service.ZomoreMembershiplevelService;
import com.zomore.utils.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

//充值规则
@Controller("zomoreMemberInputruleAction")
@RequestMapping("zomoreMemberInputrule")
public class ZomoreMemberInputruleAction {
    @Resource
    private ZomoreMemberInputruleService zomoreMemberInputruleServiceImpl;
    @Resource
    private ZomoreMembershiplevelService zomoreMembershiplevelServiceImpl;
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private ZomoreMemberInputRecordService zomoreMemberInputRecordServiceImpl;
    //查询所有的充值规则
    @RequestMapping("list")
    public String select(PageResult<ZomoreMemberInputrule> page, Model model,HttpSession session) {
        String shop=session.getAttribute("shopName")+"";
        model.addAttribute("result",zomoreMemberInputruleServiceImpl.select(page,shop));
        //查询所有的会员的等级
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        return "forward:/pages/zomoreMemberInputrule.jsp";
    }
    //添加充值规则
    @RequestMapping("insert")
    public  String insert(ZomoreMemberInputrule zomoreMemberInputrule,String isone ,HttpSession session){
        zomoreMemberInputrule.setShop(session.getAttribute("shopName")+"");
        if(isone!=null&&isone.equals("on")){
            zomoreMemberInputrule.setZomoreMemberInputruleIsuserone(1);
        }else {
            zomoreMemberInputrule.setZomoreMemberInputruleIsuserone(0);
        }
        zomoreMemberInputrule.setZomoreMemberInputruleNum(0);
        zomoreMemberInputruleServiceImpl.insert(zomoreMemberInputrule);
        return "redirect:/zomoreMemberInputrule/list.do";
    }
    //删除充值规则
    @RequestMapping("deleted")
    public  String deleted(String id){
        zomoreMemberInputruleServiceImpl.deleted(id);
        return "redirect:/zomoreMemberInputrule/list.do";
    }

    //前台点击会员充值，跳转到会员充值页面
            //根据门店查询所有的充值规则
    @RequestMapping("cz")
    public String chonzhi(String memberNum,HttpSession session,Model model){
        //根据会员号查找会员信息

        String multipleId= session.getAttribute("multipleId")+"";
        if(multipleId.equals("")||multipleId.equals("null")){
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(memberNum);
            model.addAttribute("member",zomoreMember);
            String shop=session.getAttribute("shopName")+"";
            model.addAttribute("result",zomoreMemberInputruleServiceImpl.select(zomoreMember.getMemberGrade(),shop));
            return "forward:/reception/cz.jsp";
        }else{
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,memberNum);
            model.addAttribute("member",zomoreMember);
            String shop=session.getAttribute("shopName")+"";
            model.addAttribute("result",zomoreMemberInputruleServiceImpl.select(zomoreMember.getMemberGrade(),shop));
            return "forward:/reception/cz.jsp";
        }


    }

    //会员充值金额，点击充值
    @RequestMapping("cz1")
    @ResponseBody
    public String chonzhi1(ZomoreMemberInputRecord record, HttpSession session, Model model){
        //保存充值记录，状态为0
        boolean insert = zomoreMemberInputRecordServiceImpl.insert(record);
        String multipleId =session.getAttribute("multipleId")+"";
        if(multipleId.equals("")||multipleId.equals("null")){
            //会员余额添加
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(record.getMemberNum());

            zomoreMember.setMemberBalance((Double.parseDouble(zomoreMember.getMemberBalance())+record.getInputmoney()+record.getGivemoney())+"");
            if(zomoreMember.getMemberMoney1()==null)
                zomoreMember.setMemberMoney1(0.0);
            if(zomoreMember.getMemberMoney2()==null)
                zomoreMember.setMemberMoney2(0.0);
            zomoreMember.setMemberMoney1(zomoreMember.getMemberMoney1()+record.getInputmoney());
            zomoreMember.setMemberMoney2(zomoreMember.getMemberMoney2()+record.getGivemoney());
            zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
            if(insert){
                return "success";
            }
            return "error";

        }else {
            //会员余额添加
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,record.getMemberNum());

            zomoreMember.setMemberBalance((Double.parseDouble(zomoreMember.getMemberBalance())+record.getInputmoney()+record.getGivemoney())+"");
            if(zomoreMember.getMemberMoney1()==null)
                zomoreMember.setMemberMoney1(0.0);
            if(zomoreMember.getMemberMoney2()==null)
                zomoreMember.setMemberMoney2(0.0);
            zomoreMember.setMemberMoney1(zomoreMember.getMemberMoney1()+record.getInputmoney());
            zomoreMember.setMemberMoney2(zomoreMember.getMemberMoney2()+record.getGivemoney());
            zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
            if(insert){
                return "success";
            }
            return "error";

        }

    }

}
