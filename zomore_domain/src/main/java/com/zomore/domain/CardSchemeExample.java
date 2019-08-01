package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardSchemeExample() {
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

        public Criteria andSchemeidIsNull() {
            addCriterion("schemeId is null");
            return (Criteria) this;
        }

        public Criteria andSchemeidIsNotNull() {
            addCriterion("schemeId is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeidEqualTo(String value) {
            addCriterion("schemeId =", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidNotEqualTo(String value) {
            addCriterion("schemeId <>", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidGreaterThan(String value) {
            addCriterion("schemeId >", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidGreaterThanOrEqualTo(String value) {
            addCriterion("schemeId >=", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidLessThan(String value) {
            addCriterion("schemeId <", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidLessThanOrEqualTo(String value) {
            addCriterion("schemeId <=", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidLike(String value) {
            addCriterion("schemeId like", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidNotLike(String value) {
            addCriterion("schemeId not like", value, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidIn(List<String> values) {
            addCriterion("schemeId in", values, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidNotIn(List<String> values) {
            addCriterion("schemeId not in", values, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidBetween(String value1, String value2) {
            addCriterion("schemeId between", value1, value2, "schemeid");
            return (Criteria) this;
        }

        public Criteria andSchemeidNotBetween(String value1, String value2) {
            addCriterion("schemeId not between", value1, value2, "schemeid");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNull() {
            addCriterion("cardName is null");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNotNull() {
            addCriterion("cardName is not null");
            return (Criteria) this;
        }

        public Criteria andCardnameEqualTo(String value) {
            addCriterion("cardName =", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotEqualTo(String value) {
            addCriterion("cardName <>", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThan(String value) {
            addCriterion("cardName >", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThanOrEqualTo(String value) {
            addCriterion("cardName >=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThan(String value) {
            addCriterion("cardName <", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThanOrEqualTo(String value) {
            addCriterion("cardName <=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLike(String value) {
            addCriterion("cardName like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotLike(String value) {
            addCriterion("cardName not like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameIn(List<String> values) {
            addCriterion("cardName in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotIn(List<String> values) {
            addCriterion("cardName not in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameBetween(String value1, String value2) {
            addCriterion("cardName between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotBetween(String value1, String value2) {
            addCriterion("cardName not between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("cardType is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("cardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("cardType =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("cardType <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("cardType >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardType >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("cardType <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("cardType <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("cardType like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("cardType not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("cardType in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("cardType not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("cardType between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("cardType not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andServicelifeIsNull() {
            addCriterion("servicelife is null");
            return (Criteria) this;
        }

        public Criteria andServicelifeIsNotNull() {
            addCriterion("servicelife is not null");
            return (Criteria) this;
        }

        public Criteria andServicelifeEqualTo(String value) {
            addCriterion("servicelife =", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeNotEqualTo(String value) {
            addCriterion("servicelife <>", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeGreaterThan(String value) {
            addCriterion("servicelife >", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeGreaterThanOrEqualTo(String value) {
            addCriterion("servicelife >=", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeLessThan(String value) {
            addCriterion("servicelife <", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeLessThanOrEqualTo(String value) {
            addCriterion("servicelife <=", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeLike(String value) {
            addCriterion("servicelife like", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeNotLike(String value) {
            addCriterion("servicelife not like", value, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeIn(List<String> values) {
            addCriterion("servicelife in", values, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeNotIn(List<String> values) {
            addCriterion("servicelife not in", values, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeBetween(String value1, String value2) {
            addCriterion("servicelife between", value1, value2, "servicelife");
            return (Criteria) this;
        }

        public Criteria andServicelifeNotBetween(String value1, String value2) {
            addCriterion("servicelife not between", value1, value2, "servicelife");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIsNull() {
            addCriterion("saleMoney is null");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIsNotNull() {
            addCriterion("saleMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSalemoneyEqualTo(String value) {
            addCriterion("saleMoney =", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotEqualTo(String value) {
            addCriterion("saleMoney <>", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyGreaterThan(String value) {
            addCriterion("saleMoney >", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("saleMoney >=", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLessThan(String value) {
            addCriterion("saleMoney <", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLessThanOrEqualTo(String value) {
            addCriterion("saleMoney <=", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyLike(String value) {
            addCriterion("saleMoney like", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotLike(String value) {
            addCriterion("saleMoney not like", value, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyIn(List<String> values) {
            addCriterion("saleMoney in", values, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotIn(List<String> values) {
            addCriterion("saleMoney not in", values, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyBetween(String value1, String value2) {
            addCriterion("saleMoney between", value1, value2, "salemoney");
            return (Criteria) this;
        }

        public Criteria andSalemoneyNotBetween(String value1, String value2) {
            addCriterion("saleMoney not between", value1, value2, "salemoney");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNull() {
            addCriterion("useNum is null");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNotNull() {
            addCriterion("useNum is not null");
            return (Criteria) this;
        }

        public Criteria andUsenumEqualTo(String value) {
            addCriterion("useNum =", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotEqualTo(String value) {
            addCriterion("useNum <>", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThan(String value) {
            addCriterion("useNum >", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThanOrEqualTo(String value) {
            addCriterion("useNum >=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThan(String value) {
            addCriterion("useNum <", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThanOrEqualTo(String value) {
            addCriterion("useNum <=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLike(String value) {
            addCriterion("useNum like", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotLike(String value) {
            addCriterion("useNum not like", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumIn(List<String> values) {
            addCriterion("useNum in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotIn(List<String> values) {
            addCriterion("useNum not in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumBetween(String value1, String value2) {
            addCriterion("useNum between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotBetween(String value1, String value2) {
            addCriterion("useNum not between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIsNull() {
            addCriterion("effectivedays is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIsNotNull() {
            addCriterion("effectivedays is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysEqualTo(String value) {
            addCriterion("effectivedays =", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotEqualTo(String value) {
            addCriterion("effectivedays <>", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThan(String value) {
            addCriterion("effectivedays >", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysGreaterThanOrEqualTo(String value) {
            addCriterion("effectivedays >=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThan(String value) {
            addCriterion("effectivedays <", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLessThanOrEqualTo(String value) {
            addCriterion("effectivedays <=", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysLike(String value) {
            addCriterion("effectivedays like", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotLike(String value) {
            addCriterion("effectivedays not like", value, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysIn(List<String> values) {
            addCriterion("effectivedays in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotIn(List<String> values) {
            addCriterion("effectivedays not in", values, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysBetween(String value1, String value2) {
            addCriterion("effectivedays between", value1, value2, "effectivedays");
            return (Criteria) this;
        }

        public Criteria andEffectivedaysNotBetween(String value1, String value2) {
            addCriterion("effectivedays not between", value1, value2, "effectivedays");
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

        public Criteria andCommodityidIsNull() {
            addCriterion("commodityId is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityId is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(String value) {
            addCriterion("commodityId =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(String value) {
            addCriterion("commodityId <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(String value) {
            addCriterion("commodityId >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(String value) {
            addCriterion("commodityId >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(String value) {
            addCriterion("commodityId <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(String value) {
            addCriterion("commodityId <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLike(String value) {
            addCriterion("commodityId like", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotLike(String value) {
            addCriterion("commodityId not like", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<String> values) {
            addCriterion("commodityId in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<String> values) {
            addCriterion("commodityId not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(String value1, String value2) {
            addCriterion("commodityId between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(String value1, String value2) {
            addCriterion("commodityId not between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommoditynumIsNull() {
            addCriterion("commoditynum is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynumIsNotNull() {
            addCriterion("commoditynum is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynumEqualTo(Integer value) {
            addCriterion("commoditynum =", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumNotEqualTo(Integer value) {
            addCriterion("commoditynum <>", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumGreaterThan(Integer value) {
            addCriterion("commoditynum >", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commoditynum >=", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumLessThan(Integer value) {
            addCriterion("commoditynum <", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumLessThanOrEqualTo(Integer value) {
            addCriterion("commoditynum <=", value, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumIn(List<Integer> values) {
            addCriterion("commoditynum in", values, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumNotIn(List<Integer> values) {
            addCriterion("commoditynum not in", values, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumBetween(Integer value1, Integer value2) {
            addCriterion("commoditynum between", value1, value2, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andCommoditynumNotBetween(Integer value1, Integer value2) {
            addCriterion("commoditynum not between", value1, value2, "commoditynum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andTichengIsNull() {
            addCriterion("ticheng is null");
            return (Criteria) this;
        }

        public Criteria andTichengIsNotNull() {
            addCriterion("ticheng is not null");
            return (Criteria) this;
        }

        public Criteria andTichengEqualTo(String value) {
            addCriterion("ticheng =", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotEqualTo(String value) {
            addCriterion("ticheng <>", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengGreaterThan(String value) {
            addCriterion("ticheng >", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengGreaterThanOrEqualTo(String value) {
            addCriterion("ticheng >=", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLessThan(String value) {
            addCriterion("ticheng <", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLessThanOrEqualTo(String value) {
            addCriterion("ticheng <=", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLike(String value) {
            addCriterion("ticheng like", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotLike(String value) {
            addCriterion("ticheng not like", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengIn(List<String> values) {
            addCriterion("ticheng in", values, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotIn(List<String> values) {
            addCriterion("ticheng not in", values, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengBetween(String value1, String value2) {
            addCriterion("ticheng between", value1, value2, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotBetween(String value1, String value2) {
            addCriterion("ticheng not between", value1, value2, "ticheng");
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