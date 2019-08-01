package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreIntegralExample() {
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

        public Criteria andIntegralRuleTypeIsNull() {
            addCriterion("integral_rule_type is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeIsNotNull() {
            addCriterion("integral_rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeEqualTo(Integer value) {
            addCriterion("integral_rule_type =", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeNotEqualTo(Integer value) {
            addCriterion("integral_rule_type <>", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeGreaterThan(Integer value) {
            addCriterion("integral_rule_type >", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_rule_type >=", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeLessThan(Integer value) {
            addCriterion("integral_rule_type <", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("integral_rule_type <=", value, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeIn(List<Integer> values) {
            addCriterion("integral_rule_type in", values, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeNotIn(List<Integer> values) {
            addCriterion("integral_rule_type not in", values, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeBetween(Integer value1, Integer value2) {
            addCriterion("integral_rule_type between", value1, value2, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_rule_type not between", value1, value2, "integralRuleType");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleIsNull() {
            addCriterion("integral_rule_type_rule is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleIsNotNull() {
            addCriterion("integral_rule_type_rule is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleEqualTo(String value) {
            addCriterion("integral_rule_type_rule =", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleNotEqualTo(String value) {
            addCriterion("integral_rule_type_rule <>", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleGreaterThan(String value) {
            addCriterion("integral_rule_type_rule >", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("integral_rule_type_rule >=", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleLessThan(String value) {
            addCriterion("integral_rule_type_rule <", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleLessThanOrEqualTo(String value) {
            addCriterion("integral_rule_type_rule <=", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleLike(String value) {
            addCriterion("integral_rule_type_rule like", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleNotLike(String value) {
            addCriterion("integral_rule_type_rule not like", value, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleIn(List<String> values) {
            addCriterion("integral_rule_type_rule in", values, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleNotIn(List<String> values) {
            addCriterion("integral_rule_type_rule not in", values, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleBetween(String value1, String value2) {
            addCriterion("integral_rule_type_rule between", value1, value2, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleTypeRuleNotBetween(String value1, String value2) {
            addCriterion("integral_rule_type_rule not between", value1, value2, "integralRuleTypeRule");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleIsNull() {
            addCriterion("integral_rule_cycle is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleIsNotNull() {
            addCriterion("integral_rule_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleEqualTo(String value) {
            addCriterion("integral_rule_cycle =", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleNotEqualTo(String value) {
            addCriterion("integral_rule_cycle <>", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleGreaterThan(String value) {
            addCriterion("integral_rule_cycle >", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleGreaterThanOrEqualTo(String value) {
            addCriterion("integral_rule_cycle >=", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleLessThan(String value) {
            addCriterion("integral_rule_cycle <", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleLessThanOrEqualTo(String value) {
            addCriterion("integral_rule_cycle <=", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleLike(String value) {
            addCriterion("integral_rule_cycle like", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleNotLike(String value) {
            addCriterion("integral_rule_cycle not like", value, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleIn(List<String> values) {
            addCriterion("integral_rule_cycle in", values, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleNotIn(List<String> values) {
            addCriterion("integral_rule_cycle not in", values, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleBetween(String value1, String value2) {
            addCriterion("integral_rule_cycle between", value1, value2, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleCycleNotBetween(String value1, String value2) {
            addCriterion("integral_rule_cycle not between", value1, value2, "integralRuleCycle");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeIsNull() {
            addCriterion("integral_rule_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeIsNotNull() {
            addCriterion("integral_rule_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeEqualTo(String value) {
            addCriterion("integral_rule_exchange =", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeNotEqualTo(String value) {
            addCriterion("integral_rule_exchange <>", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeGreaterThan(String value) {
            addCriterion("integral_rule_exchange >", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("integral_rule_exchange >=", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeLessThan(String value) {
            addCriterion("integral_rule_exchange <", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeLessThanOrEqualTo(String value) {
            addCriterion("integral_rule_exchange <=", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeLike(String value) {
            addCriterion("integral_rule_exchange like", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeNotLike(String value) {
            addCriterion("integral_rule_exchange not like", value, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeIn(List<String> values) {
            addCriterion("integral_rule_exchange in", values, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeNotIn(List<String> values) {
            addCriterion("integral_rule_exchange not in", values, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeBetween(String value1, String value2) {
            addCriterion("integral_rule_exchange between", value1, value2, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleExchangeNotBetween(String value1, String value2) {
            addCriterion("integral_rule_exchange not between", value1, value2, "integralRuleExchange");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyIsNull() {
            addCriterion("integral_rule_isempty is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyIsNotNull() {
            addCriterion("integral_rule_isempty is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyEqualTo(Integer value) {
            addCriterion("integral_rule_isempty =", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyNotEqualTo(Integer value) {
            addCriterion("integral_rule_isempty <>", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyGreaterThan(Integer value) {
            addCriterion("integral_rule_isempty >", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_rule_isempty >=", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyLessThan(Integer value) {
            addCriterion("integral_rule_isempty <", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyLessThanOrEqualTo(Integer value) {
            addCriterion("integral_rule_isempty <=", value, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyIn(List<Integer> values) {
            addCriterion("integral_rule_isempty in", values, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyNotIn(List<Integer> values) {
            addCriterion("integral_rule_isempty not in", values, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyBetween(Integer value1, Integer value2) {
            addCriterion("integral_rule_isempty between", value1, value2, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleIsemptyNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_rule_isempty not between", value1, value2, "integralRuleIsempty");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopIsNull() {
            addCriterion("integral_rule_shop is null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopIsNotNull() {
            addCriterion("integral_rule_shop is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopEqualTo(String value) {
            addCriterion("integral_rule_shop =", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopNotEqualTo(String value) {
            addCriterion("integral_rule_shop <>", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopGreaterThan(String value) {
            addCriterion("integral_rule_shop >", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopGreaterThanOrEqualTo(String value) {
            addCriterion("integral_rule_shop >=", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopLessThan(String value) {
            addCriterion("integral_rule_shop <", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopLessThanOrEqualTo(String value) {
            addCriterion("integral_rule_shop <=", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopLike(String value) {
            addCriterion("integral_rule_shop like", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopNotLike(String value) {
            addCriterion("integral_rule_shop not like", value, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopIn(List<String> values) {
            addCriterion("integral_rule_shop in", values, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopNotIn(List<String> values) {
            addCriterion("integral_rule_shop not in", values, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopBetween(String value1, String value2) {
            addCriterion("integral_rule_shop between", value1, value2, "integralRuleShop");
            return (Criteria) this;
        }

        public Criteria andIntegralRuleShopNotBetween(String value1, String value2) {
            addCriterion("integral_rule_shop not between", value1, value2, "integralRuleShop");
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