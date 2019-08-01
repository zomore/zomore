package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreIntegralExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreIntegralExchangeExample() {
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

        public Criteria andEchangeIsNull() {
            addCriterion("echange is null");
            return (Criteria) this;
        }

        public Criteria andEchangeIsNotNull() {
            addCriterion("echange is not null");
            return (Criteria) this;
        }

        public Criteria andEchangeEqualTo(String value) {
            addCriterion("echange =", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeNotEqualTo(String value) {
            addCriterion("echange <>", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeGreaterThan(String value) {
            addCriterion("echange >", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeGreaterThanOrEqualTo(String value) {
            addCriterion("echange >=", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeLessThan(String value) {
            addCriterion("echange <", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeLessThanOrEqualTo(String value) {
            addCriterion("echange <=", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeLike(String value) {
            addCriterion("echange like", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeNotLike(String value) {
            addCriterion("echange not like", value, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeIn(List<String> values) {
            addCriterion("echange in", values, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeNotIn(List<String> values) {
            addCriterion("echange not in", values, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeBetween(String value1, String value2) {
            addCriterion("echange between", value1, value2, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeNotBetween(String value1, String value2) {
            addCriterion("echange not between", value1, value2, "echange");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralIsNull() {
            addCriterion("echange_integral is null");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralIsNotNull() {
            addCriterion("echange_integral is not null");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralEqualTo(Integer value) {
            addCriterion("echange_integral =", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralNotEqualTo(Integer value) {
            addCriterion("echange_integral <>", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralGreaterThan(Integer value) {
            addCriterion("echange_integral >", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("echange_integral >=", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralLessThan(Integer value) {
            addCriterion("echange_integral <", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("echange_integral <=", value, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralIn(List<Integer> values) {
            addCriterion("echange_integral in", values, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralNotIn(List<Integer> values) {
            addCriterion("echange_integral not in", values, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralBetween(Integer value1, Integer value2) {
            addCriterion("echange_integral between", value1, value2, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andEchangeIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("echange_integral not between", value1, value2, "echangeIntegral");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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