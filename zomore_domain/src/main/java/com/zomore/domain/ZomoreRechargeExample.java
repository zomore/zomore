package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreRechargeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRechargeIdIsNull() {
            addCriterion("recharge_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIsNotNull() {
            addCriterion("recharge_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeIdEqualTo(String value) {
            addCriterion("recharge_id =", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotEqualTo(String value) {
            addCriterion("recharge_id <>", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThan(String value) {
            addCriterion("recharge_id >", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_id >=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThan(String value) {
            addCriterion("recharge_id <", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLessThanOrEqualTo(String value) {
            addCriterion("recharge_id <=", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdLike(String value) {
            addCriterion("recharge_id like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotLike(String value) {
            addCriterion("recharge_id not like", value, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdIn(List<String> values) {
            addCriterion("recharge_id in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotIn(List<String> values) {
            addCriterion("recharge_id not in", values, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdBetween(String value1, String value2) {
            addCriterion("recharge_id between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andRechargeIdNotBetween(String value1, String value2) {
            addCriterion("recharge_id not between", value1, value2, "rechargeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectIsNull() {
            addCriterion("recharge_project is null");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectIsNotNull() {
            addCriterion("recharge_project is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectEqualTo(String value) {
            addCriterion("recharge_project =", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectNotEqualTo(String value) {
            addCriterion("recharge_project <>", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectGreaterThan(String value) {
            addCriterion("recharge_project >", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_project >=", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectLessThan(String value) {
            addCriterion("recharge_project <", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectLessThanOrEqualTo(String value) {
            addCriterion("recharge_project <=", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectLike(String value) {
            addCriterion("recharge_project like", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectNotLike(String value) {
            addCriterion("recharge_project not like", value, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectIn(List<String> values) {
            addCriterion("recharge_project in", values, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectNotIn(List<String> values) {
            addCriterion("recharge_project not in", values, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectBetween(String value1, String value2) {
            addCriterion("recharge_project between", value1, value2, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeProjectNotBetween(String value1, String value2) {
            addCriterion("recharge_project not between", value1, value2, "rechargeProject");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(String value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(String value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(String value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(String value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(String value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLike(String value) {
            addCriterion("recharge_money like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotLike(String value) {
            addCriterion("recharge_money not like", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<String> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<String> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(String value1, String value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(String value1, String value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andGiveProjectIsNull() {
            addCriterion("give_project is null");
            return (Criteria) this;
        }

        public Criteria andGiveProjectIsNotNull() {
            addCriterion("give_project is not null");
            return (Criteria) this;
        }

        public Criteria andGiveProjectEqualTo(String value) {
            addCriterion("give_project =", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectNotEqualTo(String value) {
            addCriterion("give_project <>", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectGreaterThan(String value) {
            addCriterion("give_project >", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectGreaterThanOrEqualTo(String value) {
            addCriterion("give_project >=", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectLessThan(String value) {
            addCriterion("give_project <", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectLessThanOrEqualTo(String value) {
            addCriterion("give_project <=", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectLike(String value) {
            addCriterion("give_project like", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectNotLike(String value) {
            addCriterion("give_project not like", value, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectIn(List<String> values) {
            addCriterion("give_project in", values, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectNotIn(List<String> values) {
            addCriterion("give_project not in", values, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectBetween(String value1, String value2) {
            addCriterion("give_project between", value1, value2, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveProjectNotBetween(String value1, String value2) {
            addCriterion("give_project not between", value1, value2, "giveProject");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyIsNull() {
            addCriterion("give_money is null");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyIsNotNull() {
            addCriterion("give_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyEqualTo(String value) {
            addCriterion("give_money =", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyNotEqualTo(String value) {
            addCriterion("give_money <>", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyGreaterThan(String value) {
            addCriterion("give_money >", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("give_money >=", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyLessThan(String value) {
            addCriterion("give_money <", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyLessThanOrEqualTo(String value) {
            addCriterion("give_money <=", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyLike(String value) {
            addCriterion("give_money like", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyNotLike(String value) {
            addCriterion("give_money not like", value, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyIn(List<String> values) {
            addCriterion("give_money in", values, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyNotIn(List<String> values) {
            addCriterion("give_money not in", values, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyBetween(String value1, String value2) {
            addCriterion("give_money between", value1, value2, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andGiveMoneyNotBetween(String value1, String value2) {
            addCriterion("give_money not between", value1, value2, "giveMoney");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIsNull() {
            addCriterion("is_upgrade is null");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIsNotNull() {
            addCriterion("is_upgrade is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeEqualTo(String value) {
            addCriterion("is_upgrade =", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotEqualTo(String value) {
            addCriterion("is_upgrade <>", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeGreaterThan(String value) {
            addCriterion("is_upgrade >", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeGreaterThanOrEqualTo(String value) {
            addCriterion("is_upgrade >=", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLessThan(String value) {
            addCriterion("is_upgrade <", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLessThanOrEqualTo(String value) {
            addCriterion("is_upgrade <=", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeLike(String value) {
            addCriterion("is_upgrade like", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotLike(String value) {
            addCriterion("is_upgrade not like", value, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeIn(List<String> values) {
            addCriterion("is_upgrade in", values, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotIn(List<String> values) {
            addCriterion("is_upgrade not in", values, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeBetween(String value1, String value2) {
            addCriterion("is_upgrade between", value1, value2, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUpgradeNotBetween(String value1, String value2) {
            addCriterion("is_upgrade not between", value1, value2, "isUpgrade");
            return (Criteria) this;
        }

        public Criteria andIsUseroneIsNull() {
            addCriterion("is_userone is null");
            return (Criteria) this;
        }

        public Criteria andIsUseroneIsNotNull() {
            addCriterion("is_userone is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseroneEqualTo(Integer value) {
            addCriterion("is_userone =", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneNotEqualTo(Integer value) {
            addCriterion("is_userone <>", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneGreaterThan(Integer value) {
            addCriterion("is_userone >", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_userone >=", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneLessThan(Integer value) {
            addCriterion("is_userone <", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneLessThanOrEqualTo(Integer value) {
            addCriterion("is_userone <=", value, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneIn(List<Integer> values) {
            addCriterion("is_userone in", values, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneNotIn(List<Integer> values) {
            addCriterion("is_userone not in", values, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneBetween(Integer value1, Integer value2) {
            addCriterion("is_userone between", value1, value2, "isUserone");
            return (Criteria) this;
        }

        public Criteria andIsUseroneNotBetween(Integer value1, Integer value2) {
            addCriterion("is_userone not between", value1, value2, "isUserone");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}