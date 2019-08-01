package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommoditySplitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommoditySplitExample() {
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

        public Criteria andZomoreCommoditySplitIdIsNull() {
            addCriterion("zomore_commodity_split_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdIsNotNull() {
            addCriterion("zomore_commodity_split_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdEqualTo(Integer value) {
            addCriterion("zomore_commodity_split_id =", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_split_id <>", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdGreaterThan(Integer value) {
            addCriterion("zomore_commodity_split_id >", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_split_id >=", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdLessThan(Integer value) {
            addCriterion("zomore_commodity_split_id <", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_split_id <=", value, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdIn(List<Integer> values) {
            addCriterion("zomore_commodity_split_id in", values, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_split_id not in", values, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_split_id between", value1, value2, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_split_id not between", value1, value2, "zomoreCommoditySplitId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigIsNull() {
            addCriterion("zomore_commodity_split_big is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigIsNotNull() {
            addCriterion("zomore_commodity_split_big is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigEqualTo(String value) {
            addCriterion("zomore_commodity_split_big =", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigNotEqualTo(String value) {
            addCriterion("zomore_commodity_split_big <>", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigGreaterThan(String value) {
            addCriterion("zomore_commodity_split_big >", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_big >=", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigLessThan(String value) {
            addCriterion("zomore_commodity_split_big <", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_big <=", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigLike(String value) {
            addCriterion("zomore_commodity_split_big like", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigNotLike(String value) {
            addCriterion("zomore_commodity_split_big not like", value, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigIn(List<String> values) {
            addCriterion("zomore_commodity_split_big in", values, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigNotIn(List<String> values) {
            addCriterion("zomore_commodity_split_big not in", values, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_big between", value1, value2, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitBigNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_big not between", value1, value2, "zomoreCommoditySplitBig");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinIsNull() {
            addCriterion("zomore_commodity_split_min is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinIsNotNull() {
            addCriterion("zomore_commodity_split_min is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinEqualTo(String value) {
            addCriterion("zomore_commodity_split_min =", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinNotEqualTo(String value) {
            addCriterion("zomore_commodity_split_min <>", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinGreaterThan(String value) {
            addCriterion("zomore_commodity_split_min >", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_min >=", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinLessThan(String value) {
            addCriterion("zomore_commodity_split_min <", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_min <=", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinLike(String value) {
            addCriterion("zomore_commodity_split_min like", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinNotLike(String value) {
            addCriterion("zomore_commodity_split_min not like", value, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinIn(List<String> values) {
            addCriterion("zomore_commodity_split_min in", values, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinNotIn(List<String> values) {
            addCriterion("zomore_commodity_split_min not in", values, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_min between", value1, value2, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitMinNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_min not between", value1, value2, "zomoreCommoditySplitMin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleIsNull() {
            addCriterion("zomore_commodity_split_rule is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleIsNotNull() {
            addCriterion("zomore_commodity_split_rule is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleEqualTo(String value) {
            addCriterion("zomore_commodity_split_rule =", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleNotEqualTo(String value) {
            addCriterion("zomore_commodity_split_rule <>", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleGreaterThan(String value) {
            addCriterion("zomore_commodity_split_rule >", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_rule >=", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleLessThan(String value) {
            addCriterion("zomore_commodity_split_rule <", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_split_rule <=", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleLike(String value) {
            addCriterion("zomore_commodity_split_rule like", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleNotLike(String value) {
            addCriterion("zomore_commodity_split_rule not like", value, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleIn(List<String> values) {
            addCriterion("zomore_commodity_split_rule in", values, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleNotIn(List<String> values) {
            addCriterion("zomore_commodity_split_rule not in", values, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_rule between", value1, value2, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitRuleNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_split_rule not between", value1, value2, "zomoreCommoditySplitRule");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeIsNull() {
            addCriterion("zomore_commodity_split_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeIsNotNull() {
            addCriterion("zomore_commodity_split_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_split_time =", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_split_time <>", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_split_time >", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_split_time >=", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeLessThan(Date value) {
            addCriterion("zomore_commodity_split_time <", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_split_time <=", value, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_split_time in", values, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_split_time not in", values, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_split_time between", value1, value2, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySplitTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_split_time not between", value1, value2, "zomoreCommoditySplitTime");
            return (Criteria) this;
        }

        public Criteria andShopIsNull() {
            addCriterion("shop is null");
            return (Criteria) this;
        }

        public Criteria andShopIsNotNull() {
            addCriterion("shop is not null");
            return (Criteria) this;
        }

        public Criteria andShopEqualTo(String value) {
            addCriterion("shop =", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotEqualTo(String value) {
            addCriterion("shop <>", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThan(String value) {
            addCriterion("shop >", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThanOrEqualTo(String value) {
            addCriterion("shop >=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThan(String value) {
            addCriterion("shop <", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThanOrEqualTo(String value) {
            addCriterion("shop <=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLike(String value) {
            addCriterion("shop like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotLike(String value) {
            addCriterion("shop not like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopIn(List<String> values) {
            addCriterion("shop in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotIn(List<String> values) {
            addCriterion("shop not in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopBetween(String value1, String value2) {
            addCriterion("shop between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotBetween(String value1, String value2) {
            addCriterion("shop not between", value1, value2, "shop");
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