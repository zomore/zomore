package com.zomore.controller;

import com.github.pagehelper.Page;
import com.zomore.dao.CardMemberInputMapper;
import com.zomore.dao.ZomoreMemberMapper;
import com.zomore.dao.ZomoreMemberPointMapper;
import com.zomore.domain.*;
import com.zomore.service.*;
import com.zomore.utils.InvitationCodeUtils;
import com.zomore.utils.PageResult;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//会员资料
@Controller("zomoreMemberAction")
@RequestMapping("zomoreMember")
public class ZomoreMemberAction {
    @Resource
    private ZomoreMemberService zomoreMemberServiceImpl;
    @Resource
    private ZomoreMembershiplevelService zomoreMembershiplevelServiceImpl;
    @Resource
    private ZomoreShoppingGuideService zomoreShoppingGuideServiceImpl;
    @Resource
    private ZomoreCommoditySaleService zomoreCommoditySaleServiceImpl;
    @Resource
    private ZomoreMemberPointMapper zomoreMemberPointMapper;
    @Resource
    private ZomoreIntegralService zomoreIntegralServiceImpl;
    @Resource
    private ZomoreIntegralExchangeService zomoreIntegralExchangeServiceImpl;
    @Resource
    private ZomoreIntegralHistoryService zomoreIntegralHistoryServiceImpl;
    @Resource
    private ZomoreCommodityService zomoreCommodityServiceImpl;
    @Resource
    private ZomoreCommodityStoreService zomoreCommodityStoreServiceImpl;
    @Resource
    private ZomoreCardService zomoreCardServiceImpl;
    @Resource
    private ZomoreChainsetSharedMemberService zomoreChainsetSharedMemberServiceImpl;
    @Resource
    private MultipleService multipleServiceImpl;

    //会员概览
    @RequestMapping("showEChart")
    public String showEChart(Model model) {
        List<ZomoreMember> zomoreMembers = zomoreMemberServiceImpl.selectAllZomoreMember();
        //会员总个数
        model.addAttribute("zomoreMemberNum", zomoreMembers.size());
        //会员总余额
        double money = 0;
        for (ZomoreMember zomoreMember : zomoreMembers) {
            if (zomoreMember.getMemberBalance() != null)
                money = money + Double.parseDouble(zomoreMember.getMemberBalance());
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        model.addAttribute("zomoreMemberMoney", df.format(money));
        double saleMoney = 0;
        //会员交易总余额
        List<ZomoreCommoditySale> Sales = zomoreCommoditySaleServiceImpl.selectBymember(1);
        for (ZomoreCommoditySale sale : Sales) {
            if (sale.getZomoreCommoditySaleInmoney() != null)
                saleMoney += Double.parseDouble(sale.getZomoreCommoditySaleInmoney());

        }
        model.addAttribute("saleMoney", df.format(saleMoney));
        //会员订单笔数
        model.addAttribute("saleSize", Sales.size());
        //充值金额(元)
        model.addAttribute("inputMoney", df.format(money + saleMoney));

        //按照星期统计会员消费次数

        return "forward:/pages/zomorememberChart.jsp";
    }


    //查询所有会员资料
    @RequestMapping("selectAllZomoreMember")
    public String selectAllZomoreMember(PageResult<ZomoreMember> page, Model model) {
        //保存会员分类。默认为0
        model.addAttribute("memberGrade", 0);
        //所有会员分类
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        //查询所有导购员
        model.addAttribute("memberGuideList", zomoreShoppingGuideServiceImpl.selectAll());
        model.addAttribute("result", zomoreMemberServiceImpl.selectAllZomoreMemberBypage(page));
        return "forward:/pages/zomoremember.jsp";
    }

    //根据会员分类查询会员资料
    @RequestMapping("selectAllZomoreMemberByType")
    public String selectAllZomoreMemberByType(String Grade, Model model) {
    /*    try {
            Grade = new String(Grade.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        if (Grade.equals("0")) {
            return "redirect:/zomoreMember/selectAllZomoreMember.do";
        }
        model.addAttribute("memberGrade", Grade);
        //所有会员分类
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        model.addAttribute("result", zomoreMemberServiceImpl.selectAllZomoreMemberByType(Grade));
        return "forward:/pages/zomoremember.jsp";
    }

    //根据输入的条件模糊查询
    @RequestMapping("selectAllZomoreMemberByCondition")
    public String selectAllZomoreMemberByCondition(String memberGrade, String condition, Model model) {
      /*  try {
            condition = new String(condition.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        if (condition == null || condition.trim().equals("")) {
            return "redirect:/zomoreMember/selectAllZomoreMember.do";
        }
        //保存会员分类。默认为0
        model.addAttribute("memberGrade", 0);
        //保存会员条件。用于回显
        model.addAttribute("condition", condition);
        //所有会员分类
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        model.addAttribute("result", zomoreMemberServiceImpl.selectAllZomoreMemberByCondition(condition));
        return "forward:/pages/zomoremember.jsp";
    }

    //编辑会员页面
    @RequestMapping("updateZomoreMemberUI")
    public String updateZomoreMemberUI(String id, Model model) {
        model.addAttribute("result", zomoreMemberServiceImpl.selectZomoreMemberById(id));
        return "forward:/pages/edit.jsp";
    }

    //异步编辑会员页面,
    @RequestMapping("updateAjax")
    @ResponseBody
    public ZomoreMember updateAjax(String id) {
        return zomoreMemberServiceImpl.selectZomoreMemberById(id);
    }

    //前台 根据会员号查找会员信息，异步返回
    @RequestMapping("searchByNum")
    @ResponseBody
    public ZomoreMember searchByNum(String num, HttpSession session) {

        //查询该店是否是连锁
        String multipleId = session.getAttribute("multipleId") + "";
        if (multipleId.equals("") || multipleId.equals("null")) {
            //只查询本店会员
            return zomoreMemberServiceImpl.selectZomoreMemberByNum(num);
        } else {
            //查询该连锁店是否设置了全部共享/不共享、共享分组
            ZomoreChainsetSharedMember zomoreChainsetSharedMember = new ZomoreChainsetSharedMember();
            zomoreChainsetSharedMember.setChainsetSharedmemberMultipleId(multipleId);
            zomoreChainsetSharedMember.setChainsetSharedmemberLevel(0);
            ZomoreChainsetSharedMember zomoreChainsetSharedMember2 = zomoreChainsetSharedMemberServiceImpl.selectZomoreChainsetSharedMemberByMultipleId(zomoreChainsetSharedMember);
            if (zomoreChainsetSharedMember2 != null) {
                //state为0表示共享分组，1表示全部共享、2全部不共享
                if (zomoreChainsetSharedMember2.getChainsetSharedmemberState().equals(2)) {
                    //只查询本店会员
                    return zomoreMemberServiceImpl.selectZomoreMemberByNum(num);
                }

                if (zomoreChainsetSharedMember2.getChainsetSharedmemberState().equals(1)) {
                    Map<String, Object> map = new HashMap<>();
                    List<String> shopNames = new ArrayList<>();
                    //查询该连锁总部下所有的分店（直营+加盟）的会员
                    //查询所有的直营、加盟店
                    List<HeadShop> headShopList = multipleServiceImpl.selectHeadshopByMultipleId(session.getAttribute("multipleMarker") + "");
                    if (headShopList != null && headShopList.size() > 0) {
                        for (int i = 0; i < headShopList.size(); i++) {
                            shopNames.add(headShopList.get(i).getShopName());
                        }
                        map.put("num", num);
                        map.put("shoplist", shopNames);
                        map.put("numLike",null);
                        map.put("memberId" ,null);
                        return zomoreMemberServiceImpl.selectZomoreMenberByNumAndShops(map);

                    }

                }
                //设置了分组共享
                if (zomoreChainsetSharedMember2.getChainsetSharedmemberState().equals(0)) {
                    //查询本店是否在某个分组中
                    String sharedmemberid = session.getAttribute("sharedmemberid") + "";
                    if (sharedmemberid.equals("") || sharedmemberid.equals("null")) {
                        //只查询本店会员
                        return zomoreMemberServiceImpl.selectZomoreMemberByNum(num);
                    } else {
                        Map<String, Object> map = new HashMap<>();
                        List<String> shopNames = new ArrayList<>();
                        //同一共享组的会员
                        List<HeadShop> headShopList = zomoreChainsetSharedMemberServiceImpl.selectAllshopBySharedMemberId(sharedmemberid);
                        if (headShopList != null && headShopList.size() > 0) {
                            for (int i = 0; i < headShopList.size(); i++) {
                                shopNames.add(headShopList.get(i).getShopName());
                            }
                            map.put("num", num);
                            map.put("shoplist", shopNames);
                            map.put("numLike",null);
                            map.put("memberId" ,null);
                            return zomoreMemberServiceImpl.selectZomoreMenberByNumAndShops(map);

                        }

                    }

                }


            } else {//全部共享/不共享为空，是否设置了分组共享
                    //查询本店是否在某个分组中
                    String sharedmemberid = session.getAttribute("sharedmemberid") + "";
                    if (sharedmemberid.equals("") || sharedmemberid.equals("null")) {
                    //只查询本店会员
                        return zomoreMemberServiceImpl.selectZomoreMemberByNum(num);
                    } else {
                        Map<String, Object> map = new HashMap<>();
                        List<String> shopNames = new ArrayList<>();
                        //同一共享组的会员
                        List<HeadShop> headShopList = zomoreChainsetSharedMemberServiceImpl.selectAllshopBySharedMemberId(sharedmemberid);
                        if (headShopList != null && headShopList.size() > 0) {
                            for (int i = 0; i < headShopList.size(); i++) {
                                shopNames.add(headShopList.get(i).getShopName());
                            }
                            map.put("num", num);
                            map.put("shoplist", shopNames);
                            map.put("numLike",null);
                            map.put("memberId" ,null);
                            return zomoreMemberServiceImpl.selectZomoreMenberByNumAndShops(map);

                        }

                    }
                }
        }

        return null;

    }



    //更新会员资料
    @RequestMapping("updateZomoreMember")
    public String updateZomoreMember(ZomoreMember zomoreMember, Model model) {
        ZomoreMember zomoreMember1 = new ZomoreMember();
        if (zomoreMember.getMemberGrade() != null) {
            //判断是否已经修改过比重了
            boolean isedit = true;
            //更新会员信息时，如果会员类型发生改变时，则修改人数
            //判断是否发生改变
            zomoreMember1 = zomoreMemberServiceImpl.selectZomoreMemberById(zomoreMember.getMemberMemberid());
            //如果发生改变
            if (!zomoreMember1.getMemberGrade().equals(zomoreMember.getMemberGrade())) {
                //如果发生改变这修改比重
                change(zomoreMember1, zomoreMember);
                isedit = false;
            }
            //原来的积分
            Double memberIntegral1 = zomoreMember1.getMemberIntegral();
            //新传来的积分
            Double memberIntegral = zomoreMember.getMemberIntegral();
            if (memberIntegral1 < memberIntegral) {
                //当积分增加时
                List<ZomoreMembershiplevel> zomoreMembershiplevels = zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevelByRuleBig(memberIntegral1.toString());
                if (zomoreMembershiplevels.size() > 0) {
                    for (int i = zomoreMembershiplevels.size(); i > 0; i--) {
                        double v = Double.parseDouble(zomoreMembershiplevels.get(i - 1).getMembershiplevelRule());
                        if (memberIntegral >= v) {
                            //当积分达到可升级时，更新会员等级
                            zomoreMember.setMemberGrade(zomoreMembershiplevels.get(i - 1).getMembershiplevelName());
                            if (isedit) {
                                change(zomoreMember1, zomoreMember);
                            }
                        }
                    }
                }
            }
        }
        //修改会员折扣
        ZomoreMembershiplevel zomoreMembershiplevel = zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelByName(zomoreMember.getMemberGrade());
        zomoreMember.setMemberDiscount(zomoreMembershiplevel.getMembershiplevelDiscount());
        zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
        return "redirect:/zomoreMember/selectAllZomoreMember.do";
    }

    //删除会员
    @RequestMapping("deletedZomoreMember")
    public String deletedZomoreMember(String[] ids, Model model) {
        zomoreMemberServiceImpl.deletedZomoreMemberByIds(ids);
        return "redirect:/zomoreMember/selectAllZomoreMember.do";
    }

    //添加会员界面
    @RequestMapping("insertZomoreMemberUI")
    public String insertZomoreMemberUI(Model model) {
        model.addAttribute("gradeType", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        //查询默认的会员
        model.addAttribute("defult", zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelBydefault(1));
        return "forward:/pages/add.jsp";
    }

    @RequestMapping("insert")
    public String insert(ZomoreMember zomoreMember, String memberBirthday1, String memberDuedate1) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        if (memberBirthday1 != null) {
            try {
                zomoreMember.setMemberBirthday(format.parse(memberBirthday1));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (memberDuedate1 != null) {
            try {
                zomoreMember.setMemberDuedate(format.parse(memberDuedate1));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        ZomoreMembershiplevel zomoreMembershiplevel = zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelByName(zomoreMember.getMemberGrade());
        //更新等级的人数，即人数加1
        String membershiplevelProportion = zomoreMembershiplevel.getMembershiplevelProportion();
        int i = Integer.parseInt(membershiplevelProportion) + 1;
        zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelBymembershiplevelProportion(zomoreMember.getMemberGrade(), Integer.toString(i));
        long id = System.currentTimeMillis();
        zomoreMember.setMemberMemberid(id + "");
        //根据会员编号生产邀请码
        String code = InvitationCodeUtils.toSerialCode(Long.parseLong(zomoreMember.getMemberNumber()));
        //设置邀请码
        zomoreMember.setMemberInvitationcode(code);
        //添加会员的折扣
        zomoreMember.setMemberDiscount(zomoreMembershiplevel.getMembershiplevelDiscount());
        zomoreMemberServiceImpl.insertZomoreMember(zomoreMember);

        return "redirect:/reception/list.do";
    }

    //添加会员资料
    @RequestMapping("insertZomoreMember")
    public String insertZomoreMember(ZomoreMember zomoreMember, Model model) {
        //添加会员时在会员类上新增该会员的人数
        //获取等级
        ZomoreMembershiplevel zomoreMembershiplevel = zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelByName(zomoreMember.getMemberGrade());
        //更新等级的人数，即人数加1
        String membershiplevelProportion = zomoreMembershiplevel.getMembershiplevelProportion();
        int i = Integer.parseInt(membershiplevelProportion) + 1;
        zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelBymembershiplevelProportion(zomoreMember.getMemberGrade(), Integer.toString(i));
        long id = System.currentTimeMillis();
        zomoreMember.setMemberMemberid(id + "");
        //根据会员编号生产邀请码
        String code = InvitationCodeUtils.toSerialCode(Long.parseLong(zomoreMember.getMemberNumber()));
        //设置邀请码
        zomoreMember.setMemberInvitationcode(code);
        //添加会员的折扣
        zomoreMember.setMemberDiscount(zomoreMembershiplevel.getMembershiplevelDiscount());
        zomoreMemberServiceImpl.insertZomoreMember(zomoreMember);
        //当受邀码不为空时，添加积点记录
        if (zomoreMember.getMemberRecommendcode() != null) {
            ZomoreMemberPoint zomoreMemberPoint = new ZomoreMemberPoint();
            zomoreMemberPoint.setZomoreMemberPointCode(zomoreMember.getMemberRecommendcode());
            zomoreMemberPoint.setZomoreMemberPointPeople(zomoreMember.getMemberMemberidname());
            zomoreMemberPointMapper.insertSelective(zomoreMemberPoint);
        }

        return "redirect:/zomoreMember/selectAllZomoreMember.do";
    }

    /**
     * 更新比重（该类型的会员人数有多少）
     *
     * @param zomoreMember1 原来的
     * @param zomoreMember  新的
     */
    public void change(ZomoreMember zomoreMember1, ZomoreMember zomoreMember) {
        //把原来的类型人数减少1，新的类型增加1个
        //获取等级
        ZomoreMembershiplevel zomoreMembershiplevel = zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelByName(zomoreMember1.getMemberGrade());
        //更新等级的人数，即人数减1
        String membershiplevelProportion = zomoreMembershiplevel.getMembershiplevelProportion();
        int i = Integer.parseInt(membershiplevelProportion) - 1;
        zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelBymembershiplevelProportion(zomoreMember1.getMemberGrade(), Integer.toString(i));

        //获取等级
        ZomoreMembershiplevel zomoreMembershiplevel1 = zomoreMembershiplevelServiceImpl.selectZomoreMembershiplevelByName(zomoreMember.getMemberGrade());
        //更新等级的人数，即人数加1
        String membershiplevelProportion1 = zomoreMembershiplevel1.getMembershiplevelProportion();
        int j = Integer.parseInt(membershiplevelProportion1) + 1;
        zomoreMembershiplevelServiceImpl.updateZomoreMembershiplevelBymembershiplevelProportion(zomoreMember.getMemberGrade(), Integer.toString(j));
    }

    //导入excel表数据进数据库
    @RequestMapping("importExcel")
    @ResponseBody
    public String importExcel(MultipartFile importExcelfile) {
        boolean b = false;
        if (importExcelfile != null) {
            if (importExcelfile.getOriginalFilename().matches("^.+\\.(?i)((xls)|(xlsx))$")) {
                b = zomoreMemberServiceImpl.inportExcel(importExcelfile);
            }
        }
        if (b) {
            return "success";
        } else {
            return "error";
        }

    }

    //导出数据库数据进excel表
    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletResponse response) {
        //1、获取会员列表
        //2、输出excel
        ServletOutputStream outputStream = null;
        try {
            response.setContentType("application/x-excel");
            response.setHeader("Content-Disposition", "attachment;filename=" + new String("会员列表.xls".getBytes(), "ISO-8859-1"));
            outputStream = response.getOutputStream();
            //所有会员资料
            List<ZomoreMember> zomoreMembers = zomoreMemberServiceImpl.selectAllZomoreMember();
            zomoreMemberServiceImpl.exportExcel(zomoreMembers, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    //跟据会员号模糊查询
    @RequestMapping("searchLikeMember")
    @ResponseBody
    public List searchLikdCode(String Member,HttpSession session) {
        List list = new ArrayList();
        List<ZomoreMember> zomoreMembers =new ArrayList<>();
        //查询该店是否是连锁
        String multipleId = session.getAttribute("multipleId") + "";
        if (multipleId.equals("") || multipleId.equals("null")) {
            //只查询本店会员
            zomoreMembers = zomoreMemberServiceImpl.selectLikeMember(Member);
        } else {
            //模糊查询
            zomoreMembers = zomoreMemberServiceImpl.selectLikeMember2(multipleId,Member);
        }

        for (ZomoreMember zomoreMember : zomoreMembers) {
            Map map = new HashMap();
            if (zomoreMember.getMemberNumber() != null)
                map.put("memberNumber", zomoreMember.getMemberNumber());
            if (zomoreMember.getMemberMemberidname() != null)
                map.put("memberMemberidname", zomoreMember.getMemberMemberidname());
            if (zomoreMember.getMemberPhonenumber() != null)
                map.put("memberPhonenumber", zomoreMember.getMemberPhonenumber());
            if (zomoreMember.getMemberIntegral() != null)
                map.put("memberIntegral", zomoreMember.getMemberIntegral());
            if (zomoreMember.getMemberBalance() != null)
                map.put("memberBalance", zomoreMember.getMemberBalance());
            if (zomoreMember.getMemberDiscount() != null)
                map.put("memberDiscount", zomoreMember.getMemberDiscount());
            list.add(map);
        }
        return list;
    }


    //检查会员是否重复
    @GetMapping("inspetMemberUsername")
    @ResponseBody
    private Object inspetMemberUsername(@RequestParam("member")String member, @RequestParam("memberShop")String memberShop){
        Map<String,String> result=new HashMap<>();
        if(zomoreMembershiplevelServiceImpl.inspetMemberExist(member,memberShop)){
            result.put("status","fail");
            result.put("message","添加失败，会员号已经存在！");
            return result;
        }
        result.put("status","success");
        return result;
    }


    //前台添加会员
    @RequestMapping("insertMember")
    public String insertMember(Model model) {
        //所有会员分类
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());
        return "forward:/reception/adduser.jsp";
    }

    //前台查看会员
    @RequestMapping("selectByMemberNum")
    public String selectByMemberNum(String num, Model model, HttpSession session) {
        //查询该店是否是连锁
        String multipleId = session.getAttribute("multipleId") + "";
        if (multipleId.equals("") || multipleId.equals("null")) {
            //只查询本店会员
            model.addAttribute("result", zomoreMemberServiceImpl.selectZomoreMemberByNum(num));
        } else {
            //该会员可能不是本店的
            model.addAttribute("result", zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,num));
        }
        //查询所有的积分兑换规则
        ZomoreIntegral integral = zomoreIntegralServiceImpl.selectZomoreIntegralByshop(session.getAttribute("shopName") + "");
        //查询所有当前门店的积分兑换规则(已经启效的)
        List<ZomoreIntegralExchange> zomoreIntegralExchanges = zomoreIntegralExchangeServiceImpl.selectByRule(integral.getIntegralRuleId(), 1);
        model.addAttribute("zomoreIntegralExchanges", zomoreIntegralExchanges);
        //所有会员分类
        model.addAttribute("memberGradeList", zomoreMembershiplevelServiceImpl.selectAllZomoreMembershiplevel());

        return "forward:/reception/showUser.jsp";
    }

    //前台更新会员
    @RequestMapping("updataMemberNum")
    @ResponseBody
    public String updataMember(ZomoreMember zomoreMember){
        zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
        return "success";

    }


    //前台，积分兑换
    @RequestMapping("changeIntegral")
    public String changeIntegral(ZomoreIntegralHistory history, Integer integral, HttpSession session) {
        if (integral != null) {
            history.setNum(integral);
            history.setType("手动兑换");
        } else {
            history.setType("兑换商品");
            //减去商品库存
            ZomoreCommodity commodity = zomoreCommodityServiceImpl.selectByName(history.getCommodit());
            ZomoreCommodityStore store1 = zomoreCommodityStoreServiceImpl.selectByCommodityId(commodity.getZomoreCommodityId());
            store1.setZomoreCommodityStore(store1.getZomoreCommodityStore() - 1);
            zomoreCommodityStoreServiceImpl.updateCommodityid(store1);
        }
        //记下积分兑换记录
        history.setShop(session.getAttribute("shopName") + "");
        zomoreIntegralHistoryServiceImpl.insert(history);
        //减去会员积分
        String multipleId=session.getAttribute("multipleId")+"";
        if(multipleId.equals("")||multipleId.equals("null")){
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(history.getMemberNum());
            zomoreMember.setMemberIntegral(zomoreMember.getMemberIntegral() - history.getNum());
            zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
            return "redirect:/reception/list.do";
        }else{
            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,history.getMemberNum());
            zomoreMember.setMemberIntegral(zomoreMember.getMemberIntegral() - history.getNum());
            zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
            return "redirect:/reception/list.do";
        }



    }

    //前台，根据会员号,名称，会员联系电话，模糊查询会员资料
    @RequestMapping("searchMember")
    public String searchMember(String condity, Model model) {
        model.addAttribute("result", zomoreMemberServiceImpl.select(condity, condity, condity));
        return "forward:/reception/searchUser.jsp";
    }

    //根据会员号查找会员信息跳转到次卡消费页面
    @RequestMapping("searchMemberId")
    public String searchMemberId(String id, Model model,HttpSession session) {
        ZomoreMember zomoreMember=null;
        String multipleId=session.getAttribute("multipleId")+"";
        if(multipleId.equals("")||multipleId.equals("null")){
            zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(id);
        }else {
            zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,id);
        }

        if (zomoreMember != null) {
            model.addAttribute("result", zomoreMember);
            List<CardMember> cardMembers = zomoreCardServiceImpl.selectByCardMember(zomoreMember.getMemberMemberid());
            model.addAttribute("cardMembers", cardMembers);
            return "forward:/reception/card_scheme.jsp";
        }
        return "forward:/reception/searchUser.jsp";
    }
    //跳转到购买次卡页面

    /**
     * id 会员号
     */
    @RequestMapping("BuyCard")
    public String BuyCard(String id, Model model,HttpSession session) {
        //查询所有次卡信息
        List<CardScheme> select = zomoreCardServiceImpl.select();
        model.addAttribute("result", select);
       String multipleId=session.getAttribute("multipleId")+"";
       if(multipleId.equals("")||multipleId.equals("null")){
           ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(id);
           model.addAttribute("zomoreMember", zomoreMember);
       }
       else{
           ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum2(multipleId,id);
           model.addAttribute("zomoreMember", zomoreMember);
        }


        return "forward:/reception/card_buy.jsp";
    }

    //充值次卡
    @RequestMapping("inputCard")
    public String inputCard(CardMemberInput input) {
        //未完成支付(*);

        //添加次卡充值记录
        zomoreCardServiceImpl.insert(input);
        //当会员已经购买了该类型次卡则直接修改次卡，否则添加次卡
        List<CardMember> cardMembers = zomoreCardServiceImpl.selectByCardId2(input.getMemberId(),input.getCardId());
        CardScheme scheme = zomoreCardServiceImpl.select(input.getCardId());
        if (cardMembers.size() == 0) {
            //添加会员次卡
            CardMember cardMember = new CardMember();
            cardMember.setEndtime(scheme.getDuetime());
            cardMember.setNum(scheme.getUsenum());
            cardMember.setMemberCardId(scheme.getSchemeid());
            cardMember.setMemberCardName(input.getCardName());
            cardMember.setMemberId(input.getMemberId());
            cardMember.setState(0);
            cardMember.setTime(new Date());
            zomoreCardServiceImpl.insert(cardMember);

            ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberById(input.getMemberId());

            if (zomoreMember.getMemberSubcard() == null) {
                zomoreMember.setMemberSubcard(0);
            }
            zomoreMember.setMemberSubcard(zomoreMember.getMemberSubcard() + 1);
            zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
        } else {

            CardMember cardMember = cardMembers.get(0);
            cardMember.setNum((Integer.parseInt(cardMember.getNum()) + Integer.parseInt(scheme.getUsenum())) + "");
            zomoreCardServiceImpl.update(cardMember);
        }
        return "redirect:/reception/list.do";
    }

    //消费次卡
    @RequestMapping("saleCard")
    public String saleCard(CardMemberHistory history, Integer cardMemberId) {
        if (cardMemberId != null && history.getCardnum() != null && history.getCardnum() != 0) {
            //添加次卡消费记录
            zomoreCardServiceImpl.insert(history);
            CardMember cardMember = zomoreCardServiceImpl.selectByCardMemberId(cardMemberId);
            if (cardMember != null) {
                cardMember.setNum((Integer.parseInt(cardMember.getNum()) - history.getCardnum()) + "");
                cardMember.setState(1);
                //更新会员次卡
                zomoreCardServiceImpl.update(cardMember);
                if (cardMember.getNum().equals("0")) {
                    ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberById(history.getMemberId());
                    zomoreMember.setMemberSubcard(zomoreMember.getMemberSubcard() - 1);
                    zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
                }
            }
        }
        return "redirect:/reception/list.do";
    }
    //退次卡
    @RequestMapping("tuiCard")
    @ResponseBody
    public Map<String,Object>  tuiCard(Integer cardMemberId,CardMemberInput input,String memberId,String guide){
        Map<String,Object> map = new HashMap<>();
        //查询当前次卡
        CardMember cardMember1 = zomoreCardServiceImpl.selectByCardMemberId(cardMemberId);
        if(cardMember1!=null){
            //查询店铺活动次卡
            CardScheme scheme = zomoreCardServiceImpl.select(cardMember1.getMemberCardId());
            input.setCardId(cardMember1.getMemberCardId());
            input.setCardName(cardMember1.getMemberCardName());
            input.setType("退卡");
            if(scheme!=null){
                input.setMoney(Double.parseDouble(scheme.getSalemoney()));
                //店铺次卡数
                Integer num1 = Integer.parseInt(scheme.getUsenum());
                //会员次卡数
                Integer num2 = Integer.parseInt(cardMember1.getNum());
                Integer index = num2/num1;
                if(index<1){
                    map.put("msg","次卡次数不足,无法退卡");
                }else{
                    cardMember1.setNum(String.valueOf(Integer.parseInt(cardMember1.getNum())-Integer.parseInt(scheme.getUsenum())));
                    //添加次卡退卡记录
                    zomoreCardServiceImpl.insert(input);
                    if(index==1){
                        zomoreCardServiceImpl.deletedById(cardMemberId);
                    }else{
                        zomoreCardServiceImpl.update(cardMember1);
                    }
                    //次卡退钱
                    ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberById(memberId);
                    zomoreMember.setMemberBalance(String.valueOf(Double.parseDouble(zomoreMember.getMemberBalance())+Double.parseDouble(scheme.getSalemoney())));
                    zomoreMemberServiceImpl.updateZomoreMemberById(zomoreMember);
                    //产生会员充值记录？？？

                    map.put("msg","success");
                }

            }else {
                map.put("msg","success");
                zomoreCardServiceImpl.insert(input);
                zomoreCardServiceImpl.deletedById(cardMemberId);
            }

        }
        return map;
    }


    //会员号唯一性交易
    @RequestMapping("validate")
    @ResponseBody
    public String validate(String num) {
        ZomoreMember zomoreMember = zomoreMemberServiceImpl.selectZomoreMemberByNum(num);
        if (zomoreMember == null) {
            return "success";
        }
        return "error";
    }

    //最近三天要过生日的会员
    @RequestMapping("memberbirthday")
    public String memberbirthday(Model model) {
        List<ZomoreMember> memberList = zomoreMemberServiceImpl.selectMemberGetBirthday();
        model.addAttribute("memberList", memberList);
        return "forward:/reception/memberBirthday.jsp";

    }

}
