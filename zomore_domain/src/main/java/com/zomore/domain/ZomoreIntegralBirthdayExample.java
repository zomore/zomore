package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreIntegralBirthdayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreIntegralBirthdayExample() {
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

        public Criteria andMultipleBirthIsNull() {
            addCriterion("multiple_birth is null");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthIsNotNull() {
            addCriterion("multiple_birth is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthEqualTo(Integer value) {
            addCriterion("multiple_birth =", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthNotEqualTo(Integer value) {
            addCriterion("multiple_birth <>", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthGreaterThan(Integer value) {
            addCriterion("multiple_birth >", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthGreaterThanOrEqualTo(Integer value) {
            addCriterion("multiple_birth >=", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthLessThan(Integer value) {
            addCriterion("multiple_birth <", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthLessThanOrEqualTo(Integer value) {
            addCriterion("multiple_birth <=", value, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthIn(List<Integer> values) {
            addCriterion("multiple_birth in", values, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthNotIn(List<Integer> values) {
            addCriterion("multiple_birth not in", values, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthBetween(Integer value1, Integer value2) {
            addCriterion("multiple_birth between", value1, value2, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMultipleBirthNotBetween(Integer value1, Integer value2) {
            addCriterion("multiple_birth not between", value1, value2, "multipleBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthIsNull() {
            addCriterion("member_birth is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthIsNotNull() {
            addCriterion("member_birth is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthEqualTo(String value) {
            addCriterion("member_birth =", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthNotEqualTo(String value) {
            addCriterion("member_birth <>", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthGreaterThan(String value) {
            addCriterion("member_birth >", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthGreaterThanOrEqualTo(String value) {
            addCriterion("member_birth >=", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthLessThan(String value) {
            addCriterion("member_birth <", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthLessThanOrEqualTo(String value) {
            addCriterion("member_birth <=", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthLike(String value) {
            addCriterion("member_birth like", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthNotLike(String value) {
            addCriterion("member_birth not like", value, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthIn(List<String> values) {
            addCriterion("member_birth in", values, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthNotIn(List<String> values) {
            addCriterion("member_birth not in", values, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthBetween(String value1, String value2) {
            addCriterion("member_birth between", value1, value2, "memberBirth");
            return (Criteria) this;
        }

        public Criteria andMemberBirthNotBetween(String value1, String value2) {
            addCriterion("member_birth not between", value1, value2, "memberBirth");
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