package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketingPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketingPromotionExample() {
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

        public Criteria andPromotionidIsNull() {
            addCriterion("promotionId is null");
            return (Criteria) this;
        }

        public Criteria andPromotionidIsNotNull() {
            addCriterion("promotionId is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionidEqualTo(String value) {
            addCriterion("promotionId =", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidNotEqualTo(String value) {
            addCriterion("promotionId <>", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidGreaterThan(String value) {
            addCriterion("promotionId >", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidGreaterThanOrEqualTo(String value) {
            addCriterion("promotionId >=", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidLessThan(String value) {
            addCriterion("promotionId <", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidLessThanOrEqualTo(String value) {
            addCriterion("promotionId <=", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidLike(String value) {
            addCriterion("promotionId like", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidNotLike(String value) {
            addCriterion("promotionId not like", value, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidIn(List<String> values) {
            addCriterion("promotionId in", values, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidNotIn(List<String> values) {
            addCriterion("promotionId not in", values, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidBetween(String value1, String value2) {
            addCriterion("promotionId between", value1, value2, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionidNotBetween(String value1, String value2) {
            addCriterion("promotionId not between", value1, value2, "promotionid");
            return (Criteria) this;
        }

        public Criteria andPromotionnameIsNull() {
            addCriterion("promotionName is null");
            return (Criteria) this;
        }

        public Criteria andPromotionnameIsNotNull() {
            addCriterion("promotionName is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionnameEqualTo(String value) {
            addCriterion("promotionName =", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameNotEqualTo(String value) {
            addCriterion("promotionName <>", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameGreaterThan(String value) {
            addCriterion("promotionName >", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameGreaterThanOrEqualTo(String value) {
            addCriterion("promotionName >=", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameLessThan(String value) {
            addCriterion("promotionName <", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameLessThanOrEqualTo(String value) {
            addCriterion("promotionName <=", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameLike(String value) {
            addCriterion("promotionName like", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameNotLike(String value) {
            addCriterion("promotionName not like", value, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameIn(List<String> values) {
            addCriterion("promotionName in", values, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameNotIn(List<String> values) {
            addCriterion("promotionName not in", values, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameBetween(String value1, String value2) {
            addCriterion("promotionName between", value1, value2, "promotionname");
            return (Criteria) this;
        }

        public Criteria andPromotionnameNotBetween(String value1, String value2) {
            addCriterion("promotionName not between", value1, value2, "promotionname");
            return (Criteria) this;
        }

        public Criteria andCreateshopIsNull() {
            addCriterion("createShop is null");
            return (Criteria) this;
        }

        public Criteria andCreateshopIsNotNull() {
            addCriterion("createShop is not null");
            return (Criteria) this;
        }

        public Criteria andCreateshopEqualTo(String value) {
            addCriterion("createShop =", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopNotEqualTo(String value) {
            addCriterion("createShop <>", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopGreaterThan(String value) {
            addCriterion("createShop >", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopGreaterThanOrEqualTo(String value) {
            addCriterion("createShop >=", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopLessThan(String value) {
            addCriterion("createShop <", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopLessThanOrEqualTo(String value) {
            addCriterion("createShop <=", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopLike(String value) {
            addCriterion("createShop like", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopNotLike(String value) {
            addCriterion("createShop not like", value, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopIn(List<String> values) {
            addCriterion("createShop in", values, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopNotIn(List<String> values) {
            addCriterion("createShop not in", values, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopBetween(String value1, String value2) {
            addCriterion("createShop between", value1, value2, "createshop");
            return (Criteria) this;
        }

        public Criteria andCreateshopNotBetween(String value1, String value2) {
            addCriterion("createShop not between", value1, value2, "createshop");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIsNull() {
            addCriterion("promotionType is null");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIsNotNull() {
            addCriterion("promotionType is not null");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeEqualTo(Integer value) {
            addCriterion("promotionType =", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotEqualTo(Integer value) {
            addCriterion("promotionType <>", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeGreaterThan(Integer value) {
            addCriterion("promotionType >", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotionType >=", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeLessThan(Integer value) {
            addCriterion("promotionType <", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("promotionType <=", value, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeIn(List<Integer> values) {
            addCriterion("promotionType in", values, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotIn(List<Integer> values) {
            addCriterion("promotionType not in", values, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeBetween(Integer value1, Integer value2) {
            addCriterion("promotionType between", value1, value2, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotionType not between", value1, value2, "promotiontype");
            return (Criteria) this;
        }

        public Criteria andPromotionshopIsNull() {
            addCriterion("promotionshop is null");
            return (Criteria) this;
        }

        public Criteria andPromotionshopIsNotNull() {
            addCriterion("promotionshop is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionshopEqualTo(String value) {
            addCriterion("promotionshop =", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopNotEqualTo(String value) {
            addCriterion("promotionshop <>", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopGreaterThan(String value) {
            addCriterion("promotionshop >", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopGreaterThanOrEqualTo(String value) {
            addCriterion("promotionshop >=", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopLessThan(String value) {
            addCriterion("promotionshop <", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopLessThanOrEqualTo(String value) {
            addCriterion("promotionshop <=", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopLike(String value) {
            addCriterion("promotionshop like", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopNotLike(String value) {
            addCriterion("promotionshop not like", value, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopIn(List<String> values) {
            addCriterion("promotionshop in", values, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopNotIn(List<String> values) {
            addCriterion("promotionshop not in", values, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopBetween(String value1, String value2) {
            addCriterion("promotionshop between", value1, value2, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionshopNotBetween(String value1, String value2) {
            addCriterion("promotionshop not between", value1, value2, "promotionshop");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeIsNull() {
            addCriterion("promotionScope is null");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeIsNotNull() {
            addCriterion("promotionScope is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeEqualTo(String value) {
            addCriterion("promotionScope =", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeNotEqualTo(String value) {
            addCriterion("promotionScope <>", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeGreaterThan(String value) {
            addCriterion("promotionScope >", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeGreaterThanOrEqualTo(String value) {
            addCriterion("promotionScope >=", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeLessThan(String value) {
            addCriterion("promotionScope <", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeLessThanOrEqualTo(String value) {
            addCriterion("promotionScope <=", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeLike(String value) {
            addCriterion("promotionScope like", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeNotLike(String value) {
            addCriterion("promotionScope not like", value, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeIn(List<String> values) {
            addCriterion("promotionScope in", values, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeNotIn(List<String> values) {
            addCriterion("promotionScope not in", values, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeBetween(String value1, String value2) {
            addCriterion("promotionScope between", value1, value2, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionscopeNotBetween(String value1, String value2) {
            addCriterion("promotionScope not between", value1, value2, "promotionscope");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIsNull() {
            addCriterion("promotionnum is null");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIsNotNull() {
            addCriterion("promotionnum is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionnumEqualTo(Integer value) {
            addCriterion("promotionnum =", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotEqualTo(Integer value) {
            addCriterion("promotionnum <>", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumGreaterThan(Integer value) {
            addCriterion("promotionnum >", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotionnum >=", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumLessThan(Integer value) {
            addCriterion("promotionnum <", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumLessThanOrEqualTo(Integer value) {
            addCriterion("promotionnum <=", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIn(List<Integer> values) {
            addCriterion("promotionnum in", values, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotIn(List<Integer> values) {
            addCriterion("promotionnum not in", values, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumBetween(Integer value1, Integer value2) {
            addCriterion("promotionnum between", value1, value2, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("promotionnum not between", value1, value2, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNull() {
            addCriterion("dueTime is null");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNotNull() {
            addCriterion("dueTime is not null");
            return (Criteria) this;
        }

        public Criteria andDuetimeEqualTo(Date value) {
            addCriterion("dueTime =", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotEqualTo(Date value) {
            addCriterion("dueTime <>", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThan(Date value) {
            addCriterion("dueTime >", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dueTime >=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThan(Date value) {
            addCriterion("dueTime <", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThanOrEqualTo(Date value) {
            addCriterion("dueTime <=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIn(List<Date> values) {
            addCriterion("dueTime in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotIn(List<Date> values) {
            addCriterion("dueTime not in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeBetween(Date value1, Date value2) {
            addCriterion("dueTime between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotBetween(Date value1, Date value2) {
            addCriterion("dueTime not between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("shopId like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("shopId not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andMultipleidIsNull() {
            addCriterion("multipleId is null");
            return (Criteria) this;
        }

        public Criteria andMultipleidIsNotNull() {
            addCriterion("multipleId is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleidEqualTo(String value) {
            addCriterion("multipleId =", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidNotEqualTo(String value) {
            addCriterion("multipleId <>", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidGreaterThan(String value) {
            addCriterion("multipleId >", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidGreaterThanOrEqualTo(String value) {
            addCriterion("multipleId >=", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidLessThan(String value) {
            addCriterion("multipleId <", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidLessThanOrEqualTo(String value) {
            addCriterion("multipleId <=", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidLike(String value) {
            addCriterion("multipleId like", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidNotLike(String value) {
            addCriterion("multipleId not like", value, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidIn(List<String> values) {
            addCriterion("multipleId in", values, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidNotIn(List<String> values) {
            addCriterion("multipleId not in", values, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidBetween(String value1, String value2) {
            addCriterion("multipleId between", value1, value2, "multipleid");
            return (Criteria) this;
        }

        public Criteria andMultipleidNotBetween(String value1, String value2) {
            addCriterion("multipleId not between", value1, value2, "multipleid");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNull() {
            addCriterion("isMember is null");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNotNull() {
            addCriterion("isMember is not null");
            return (Criteria) this;
        }

        public Criteria andIsmemberEqualTo(Integer value) {
            addCriterion("isMember =", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotEqualTo(Integer value) {
            addCriterion("isMember <>", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThan(Integer value) {
            addCriterion("isMember >", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("isMember >=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThan(Integer value) {
            addCriterion("isMember <", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThanOrEqualTo(Integer value) {
            addCriterion("isMember <=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberIn(List<Integer> values) {
            addCriterion("isMember in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotIn(List<Integer> values) {
            addCriterion("isMember not in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberBetween(Integer value1, Integer value2) {
            addCriterion("isMember between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotBetween(Integer value1, Integer value2) {
            addCriterion("isMember not between", value1, value2, "ismember");
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