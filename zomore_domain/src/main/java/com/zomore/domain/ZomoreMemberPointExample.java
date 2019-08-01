package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreMemberPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreMemberPointExample() {
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

        public Criteria andZomoreMemberPointIdIsNull() {
            addCriterion("zomore_member_point_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdIsNotNull() {
            addCriterion("zomore_member_point_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdEqualTo(Integer value) {
            addCriterion("zomore_member_point_id =", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdNotEqualTo(Integer value) {
            addCriterion("zomore_member_point_id <>", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdGreaterThan(Integer value) {
            addCriterion("zomore_member_point_id >", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_point_id >=", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdLessThan(Integer value) {
            addCriterion("zomore_member_point_id <", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_point_id <=", value, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdIn(List<Integer> values) {
            addCriterion("zomore_member_point_id in", values, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdNotIn(List<Integer> values) {
            addCriterion("zomore_member_point_id not in", values, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_point_id between", value1, value2, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_point_id not between", value1, value2, "zomoreMemberPointId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeIsNull() {
            addCriterion("zomore_member_point_code is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeIsNotNull() {
            addCriterion("zomore_member_point_code is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeEqualTo(String value) {
            addCriterion("zomore_member_point_code =", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeNotEqualTo(String value) {
            addCriterion("zomore_member_point_code <>", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeGreaterThan(String value) {
            addCriterion("zomore_member_point_code >", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_member_point_code >=", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeLessThan(String value) {
            addCriterion("zomore_member_point_code <", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeLessThanOrEqualTo(String value) {
            addCriterion("zomore_member_point_code <=", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeLike(String value) {
            addCriterion("zomore_member_point_code like", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeNotLike(String value) {
            addCriterion("zomore_member_point_code not like", value, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeIn(List<String> values) {
            addCriterion("zomore_member_point_code in", values, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeNotIn(List<String> values) {
            addCriterion("zomore_member_point_code not in", values, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeBetween(String value1, String value2) {
            addCriterion("zomore_member_point_code between", value1, value2, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointCodeNotBetween(String value1, String value2) {
            addCriterion("zomore_member_point_code not between", value1, value2, "zomoreMemberPointCode");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleIsNull() {
            addCriterion("zomore_member_point_people is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleIsNotNull() {
            addCriterion("zomore_member_point_people is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleEqualTo(String value) {
            addCriterion("zomore_member_point_people =", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleNotEqualTo(String value) {
            addCriterion("zomore_member_point_people <>", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleGreaterThan(String value) {
            addCriterion("zomore_member_point_people >", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_member_point_people >=", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleLessThan(String value) {
            addCriterion("zomore_member_point_people <", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleLessThanOrEqualTo(String value) {
            addCriterion("zomore_member_point_people <=", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleLike(String value) {
            addCriterion("zomore_member_point_people like", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleNotLike(String value) {
            addCriterion("zomore_member_point_people not like", value, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleIn(List<String> values) {
            addCriterion("zomore_member_point_people in", values, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleNotIn(List<String> values) {
            addCriterion("zomore_member_point_people not in", values, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleBetween(String value1, String value2) {
            addCriterion("zomore_member_point_people between", value1, value2, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointPeopleNotBetween(String value1, String value2) {
            addCriterion("zomore_member_point_people not between", value1, value2, "zomoreMemberPointPeople");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleIsNull() {
            addCriterion("zomore_member_point_rule is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleIsNotNull() {
            addCriterion("zomore_member_point_rule is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleEqualTo(Double value) {
            addCriterion("zomore_member_point_rule =", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleNotEqualTo(Double value) {
            addCriterion("zomore_member_point_rule <>", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleGreaterThan(Double value) {
            addCriterion("zomore_member_point_rule >", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_member_point_rule >=", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleLessThan(Double value) {
            addCriterion("zomore_member_point_rule <", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleLessThanOrEqualTo(Double value) {
            addCriterion("zomore_member_point_rule <=", value, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleIn(List<Double> values) {
            addCriterion("zomore_member_point_rule in", values, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleNotIn(List<Double> values) {
            addCriterion("zomore_member_point_rule not in", values, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleBetween(Double value1, Double value2) {
            addCriterion("zomore_member_point_rule between", value1, value2, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointRuleNotBetween(Double value1, Double value2) {
            addCriterion("zomore_member_point_rule not between", value1, value2, "zomoreMemberPointRule");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumIsNull() {
            addCriterion("zomore_member_point_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumIsNotNull() {
            addCriterion("zomore_member_point_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumEqualTo(Double value) {
            addCriterion("zomore_member_point_num =", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumNotEqualTo(Double value) {
            addCriterion("zomore_member_point_num <>", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumGreaterThan(Double value) {
            addCriterion("zomore_member_point_num >", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_member_point_num >=", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumLessThan(Double value) {
            addCriterion("zomore_member_point_num <", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumLessThanOrEqualTo(Double value) {
            addCriterion("zomore_member_point_num <=", value, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumIn(List<Double> values) {
            addCriterion("zomore_member_point_num in", values, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumNotIn(List<Double> values) {
            addCriterion("zomore_member_point_num not in", values, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumBetween(Double value1, Double value2) {
            addCriterion("zomore_member_point_num between", value1, value2, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberPointNumNotBetween(Double value1, Double value2) {
            addCriterion("zomore_member_point_num not between", value1, value2, "zomoreMemberPointNum");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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