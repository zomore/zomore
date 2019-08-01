package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreIntegralDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreIntegralDateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdIsNull() {
            addCriterion("integral_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdIsNotNull() {
            addCriterion("integral_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdEqualTo(String value) {
            addCriterion("integral_rule_id =", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdNotEqualTo(String value) {
            addCriterion("integral_rule_id <>", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdGreaterThan(String value) {
            addCriterion("integral_rule_id >", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("integral_rule_id >=", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdLessThan(String value) {
            addCriterion("integral_rule_id <", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdLessThanOrEqualTo(String value) {
            addCriterion("integral_rule_id <=", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdLike(String value) {
            addCriterion("integral_rule_id like", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdNotLike(String value) {
            addCriterion("integral_rule_id not like", value, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdIn(List<String> values) {
            addCriterion("integral_rule_id in", values, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdNotIn(List<String> values) {
            addCriterion("integral_rule_id not in", values, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdBetween(String value1, String value2) {
            addCriterion("integral_rule_id between", value1, value2, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIdNotBetween(String value1, String value2) {
            addCriterion("integral_rule_id not between", value1, value2, "integralRuleId");
            return (Criteria) this;
        }

        public Criteria andMultipleDateIsNull() {
            addCriterion("multiple_date is null");
            return (Criteria) this;
        }

        public Criteria andMultipleDateIsNotNull() {
            addCriterion("multiple_date is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleDateEqualTo(Integer value) {
            addCriterion("multiple_date =", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateNotEqualTo(Integer value) {
            addCriterion("multiple_date <>", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateGreaterThan(Integer value) {
            addCriterion("multiple_date >", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple_date >=", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateLessThan(Integer value) {
            addCriterion("multiple_date <", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateLessThanOrEqualTo(Integer value) {
            addCriterion("multiple_date <=", value, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateIn(List<Integer> values) {
            addCriterion("multiple_date in", values, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateNotIn(List<Integer> values) {
            addCriterion("multiple_date not in", values, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateBetween(Integer value1, Integer value2) {
            addCriterion("multiple_date between", value1, value2, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMultipleDateNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple_date not between", value1, value2, "multipleDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateIsNull() {
            addCriterion("member_date is null");
            return (Criteria) this;
        }

        public Criteria andMemberDateIsNotNull() {
            addCriterion("member_date is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDateEqualTo(String value) {
            addCriterion("member_date =", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateNotEqualTo(String value) {
            addCriterion("member_date <>", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateGreaterThan(String value) {
            addCriterion("member_date >", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateGreaterThanOrEqualTo(String value) {
            addCriterion("member_date >=", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateLessThan(String value) {
            addCriterion("member_date <", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateLessThanOrEqualTo(String value) {
            addCriterion("member_date <=", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateLike(String value) {
            addCriterion("member_date like", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateNotLike(String value) {
            addCriterion("member_date not like", value, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateIn(List<String> values) {
            addCriterion("member_date in", values, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateNotIn(List<String> values) {
            addCriterion("member_date not in", values, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateBetween(String value1, String value2) {
            addCriterion("member_date between", value1, value2, "memberDate");
            return (Criteria) this;
        }

        public Criteria andMemberDateNotBetween(String value1, String value2) {
            addCriterion("member_date not between", value1, value2, "memberDate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
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