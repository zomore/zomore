package com.zomore.controller;

import com.zomore.domain.*;
import com.zomore.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Date;
import java.util.List;

//积分规则
@Controller("zomoreIntegralAction")
@RequestMapping("zomoreIntegral")
public class ZomoreIntegralAction {
    @Resource
    private ZomoreIntegralService zomoreIntegralServiceImpl;
    @Resource
    private ZomoreIntegralGradeService zomoreIntegralGradeServiceImpl;
    @Resource
    private ZomoreIntegralBirthdayService zomoreIntegralBirthdayServiceImpl;
    @Resource
    private ZomoreIntegralDateService zomoreIntegralDateServiceImpl;
    @Resource
    private ZomoreIntegralExchangeService zomoreIntegralExchangeServiceImpl;
    @Resource
    private ZomoreIntegralExchangeMoneyService zomoreIntegralExchangeMoneyServiceImpl;
    //查询所有的积分规则
    @RequestMapping("selectAllZomoreIntegral")
    public String selecAllZomoreIntegral(Model model) {
        model.addAttribute("result", zomoreIntegralServiceImpl.selectAllZomoreIntegralBypage(1, 50));
        return "forward:/pages/zomoreIntegral.jsp";
    }
    //跳转到编辑页面
    @RequestMapping("editUI")
    public String editZomoreIntegralUI(String id, Model model) {
        //根据id查询积分规则
        model.addAttribute("result", zomoreIntegralServiceImpl.selectZomoreIntegralById(id));
        return "forward:/pages/editZomoreIntegral.jsp";
    }
    //更新积分规则
    @RequestMapping("edit")
    public String updateZomoreIntegral(ZomoreIntegral zomoreIntegral, ZomoreIntegralGrade grade, ZomoreIntegralBirthday birthday, ZomoreIntegralDate date, ZomoreIntegralExchange exchange, ZomoreIntegralExchangeMoney exchangeMoney) {
        String ruleid = zomoreIntegral.getIntegralRuleId();
        //更新会员等级多倍积分
        //判断原来有没有会员等级多倍积分
        List<ZomoreIntegralGrade> zomoreIntegralGrades = zomoreIntegralGradeServiceImpl.selectByRuleId(ruleid);
        if (zomoreIntegralGrades != null && zomoreIntegralGrades.size() > 0) {
            zomoreIntegralGradeServiceImpl.update(grade);
        } else {
            zomoreIntegralGradeServiceImpl.insert(grade);
        }
        //更新会员生日多倍积分
        //判断原来有没有生日多倍积分
        List<ZomoreIntegralBirthday> zomoreIntegralBirthdays = zomoreIntegralBirthdayServiceImpl.selectByRuleId(ruleid);
        if (zomoreIntegralBirthdays != null && zomoreIntegralBirthdays.size() > 0) {
            zomoreIntegralBirthdayServiceImpl.update(birthday);
        } else {
            zomoreIntegralBirthdayServiceImpl.insert(birthday);
        }
        //更新特殊节日多倍积分:
        List<ZomoreIntegralDate> zomoreIntegralDates = zomoreIntegralDateServiceImpl.selectByRuleId(ruleid);
        if (zomoreIntegralDates != null && zomoreIntegralDates.size() > 0) {
            zomoreIntegralDateServiceImpl.update(date);
        } else {
            zomoreIntegralDateServiceImpl.insert(date);
        }

        //判断原来是否已经存在积分兑换规则，如果没有这添加
        ZomoreIntegral zomoreIntegral1 = zomoreIntegralServiceImpl.selectZomoreIntegralById(zomoreIntegral.getIntegralRuleId());
        if (zomoreIntegral1.getIntegralRuleExchange() == null || zomoreIntegral1.getIntegralRuleExchange().equals("3")) {
            if (zomoreIntegral.getIntegralRuleExchange().equals("1")) {
                //保存进  兑换方式：兑换礼品表
                zomoreIntegralExchangeServiceImpl.insert(exchange);
            } else if (zomoreIntegral.getIntegralRuleExchange().equals("2")) {
                //保存进  兑换方式：抵扣现金
                zomoreIntegralExchangeMoneyServiceImpl.insert(exchangeMoney);
            }
        } else {
            //原来已经有兑换规则时，判断有没有改变兑换规则
            if (!zomoreIntegral1.getIntegralRuleExchange().equals(zomoreIntegral.getIntegralRuleExchange())) {
                //如果有改变兑换规则，则把原来的兑换规则详细删除，添加新的兑换规则详细
                if (zomoreIntegral1.getIntegralRuleExchange().equals("1")) {
                    //删除 兑换方式：兑换礼品表
                    zomoreIntegralExchangeServiceImpl.deleted(zomoreIntegral1.getIntegralRuleId());
                    zomoreIntegralExchangeServiceImpl.insert(exchange);
                } else if (zomoreIntegral1.getIntegralRuleExchange().equals("2")) {
                    //删除 兑换方式：抵扣现金
                    zomoreIntegralExchangeMoneyServiceImpl.deleted(zomoreIntegral1.getIntegralRuleId());
                    zomoreIntegralExchangeMoneyServiceImpl.insert(exchangeMoney);
                }
            } else {
                //如果没有改变兑换规则，则更新兑换规则详细
                if (zomoreIntegral.getIntegralRuleExchange().equals("1")) {
                    //保存进  兑换方式：兑换礼品表
                    zomoreIntegralExchangeServiceImpl.update(exchange);
                } else if (zomoreIntegral.getIntegralRuleExchange().equals("2")) {
                    //保存进  兑换方式：抵扣现金
                    zomoreIntegralExchangeMoneyServiceImpl.update(exchangeMoney);
                }

            }
        }
        //对积分规则数据进行处理
        zomoreIntegralServiceImpl.updateZomoreIntegral(zomoreIntegral);
        return "redirect:/zomoreIntegral/selectAllZomoreIntegral.do";
    }

    //跳转到新增页面
    @RequestMapping("addUI")
    public String addZomoreIntegralUI(ZomoreIntegral zomoreIntegral) {
        return "forward:/pages/addZomoreIntegral.jsp";
    }
    //新增积分规则
    @RequestMapping("add")
    public String addZomoreIntegral(ZomoreIntegral zomoreIntegral, ZomoreIntegralGrade grade, ZomoreIntegralBirthday birthday, ZomoreIntegralDate date, ZomoreIntegralExchange exchange, ZomoreIntegralExchangeMoney exchangeMoney) {
        //添加会员等级多倍积分
        if (grade.getMemberGrade() != null && !grade.getMultipleGrade().equals("")) {
            //当存在积分规则时
            zomoreIntegralGradeServiceImpl.insert(grade);
        }
        //添加会员生日多倍积分
        if (birthday.getMemberBirth() != null && !birthday.getMultipleBirth().equals("")) {
            zomoreIntegralBirthdayServiceImpl.insert(birthday);
        }
        //添加特殊节日多倍积分:
        if (date.getMemberDate() != null && !date.getMultipleDate().equals("")) {
            zomoreIntegralDateServiceImpl.insert(date);
        }
        //当兑换方式不为空是，更新积分兑换规则（）
        //先判断是那种兑换方式（1兑换礼品,2抵扣现金,3无）
        if (zomoreIntegral.getIntegralRuleExchange() != null) {
            if (zomoreIntegral.getIntegralRuleExchange().equals("1")) {
                //保存进  兑换方式：兑换礼品表
                zomoreIntegralExchangeServiceImpl.insert(exchange);
            } else if (zomoreIntegral.getIntegralRuleExchange().equals("2")) {
                //保存进  兑换方式：抵扣现金
                zomoreIntegralExchangeMoneyServiceImpl.insert(exchangeMoney);
            }
        }
        //对积分规则数据进行处理
        zomoreIntegral.setIntegralRuleId(System.currentTimeMillis() + "");
        zomoreIntegralServiceImpl.insertZomoreIntegral(zomoreIntegral);
        return "redirect:/zomoreIntegral/selectAllZomoreIntegral.do";
    }
    //删除积分规则
    @RequestMapping("delete")
    public String deleteZomoreIntegral(String[] ids) {
        zomoreIntegralServiceImpl.deletedZomoreIntegral(ids);
        return "redirect:/zomoreIntegral/selectAllZomoreIntegral.do";
    }

}
