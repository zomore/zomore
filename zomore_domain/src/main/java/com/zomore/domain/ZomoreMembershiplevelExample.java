package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreMembershiplevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreMembershiplevelExample() {
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

        public Criteria andMembershiplevelIdIsNull() {
            addCriterion("membershipLevel_id is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdIsNotNull() {
            addCriterion("membershipLevel_id is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdEqualTo(String value) {
            addCriterion("membershipLevel_id =", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdNotEqualTo(String value) {
            addCriterion("membershipLevel_id <>", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdGreaterThan(String value) {
            addCriterion("membershipLevel_id >", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_id >=", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdLessThan(String value) {
            addCriterion("membershipLevel_id <", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_id <=", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdLike(String value) {
            addCriterion("membershipLevel_id like", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdNotLike(String value) {
            addCriterion("membershipLevel_id not like", value, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdIn(List<String> values) {
            addCriterion("membershipLevel_id in", values, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdNotIn(List<String> values) {
            addCriterion("membershipLevel_id not in", values, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdBetween(String value1, String value2) {
            addCriterion("membershipLevel_id between", value1, value2, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIdNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_id not between", value1, value2, "membershiplevelId");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameIsNull() {
            addCriterion("membershipLevel_Name is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameIsNotNull() {
            addCriterion("membershipLevel_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameEqualTo(String value) {
            addCriterion("membershipLevel_Name =", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameNotEqualTo(String value) {
            addCriterion("membershipLevel_Name <>", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameGreaterThan(String value) {
            addCriterion("membershipLevel_Name >", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_Name >=", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameLessThan(String value) {
            addCriterion("membershipLevel_Name <", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_Name <=", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameLike(String value) {
            addCriterion("membershipLevel_Name like", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameNotLike(String value) {
            addCriterion("membershipLevel_Name not like", value, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameIn(List<String> values) {
            addCriterion("membershipLevel_Name in", values, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameNotIn(List<String> values) {
            addCriterion("membershipLevel_Name not in", values, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameBetween(String value1, String value2) {
            addCriterion("membershipLevel_Name between", value1, value2, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNameNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_Name not between", value1, value2, "membershiplevelName");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionIsNull() {
            addCriterion("membershipLevel_proportion is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionIsNotNull() {
            addCriterion("membershipLevel_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionEqualTo(String value) {
            addCriterion("membershipLevel_proportion =", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionNotEqualTo(String value) {
            addCriterion("membershipLevel_proportion <>", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionGreaterThan(String value) {
            addCriterion("membershipLevel_proportion >", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_proportion >=", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionLessThan(String value) {
            addCriterion("membershipLevel_proportion <", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_proportion <=", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionLike(String value) {
            addCriterion("membershipLevel_proportion like", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionNotLike(String value) {
            addCriterion("membershipLevel_proportion not like", value, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionIn(List<String> values) {
            addCriterion("membershipLevel_proportion in", values, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionNotIn(List<String> values) {
            addCriterion("membershipLevel_proportion not in", values, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionBetween(String value1, String value2) {
            addCriterion("membershipLevel_proportion between", value1, value2, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelProportionNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_proportion not between", value1, value2, "membershiplevelProportion");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeIsNull() {
            addCriterion("membershipLevel_nearUpgrade is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeIsNotNull() {
            addCriterion("membershipLevel_nearUpgrade is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeEqualTo(Double value) {
            addCriterion("membershipLevel_nearUpgrade =", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeNotEqualTo(Double value) {
            addCriterion("membershipLevel_nearUpgrade <>", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeGreaterThan(Double value) {
            addCriterion("membershipLevel_nearUpgrade >", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeGreaterThanOrEqualTo(Double value) {
            addCriterion("membershipLevel_nearUpgrade >=", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeLessThan(Double value) {
            addCriterion("membershipLevel_nearUpgrade <", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeLessThanOrEqualTo(Double value) {
            addCriterion("membershipLevel_nearUpgrade <=", value, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeIn(List<Double> values) {
            addCriterion("membershipLevel_nearUpgrade in", values, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeNotIn(List<Double> values) {
            addCriterion("membershipLevel_nearUpgrade not in", values, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeBetween(Double value1, Double value2) {
            addCriterion("membershipLevel_nearUpgrade between", value1, value2, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelNearupgradeNotBetween(Double value1, Double value2) {
            addCriterion("membershipLevel_nearUpgrade not between", value1, value2, "membershiplevelNearupgrade");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountIsNull() {
            addCriterion("membershipLevel_discount is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountIsNotNull() {
            addCriterion("membershipLevel_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountEqualTo(String value) {
            addCriterion("membershipLevel_discount =", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountNotEqualTo(String value) {
            addCriterion("membershipLevel_discount <>", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountGreaterThan(String value) {
            addCriterion("membershipLevel_discount >", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_discount >=", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountLessThan(String value) {
            addCriterion("membershipLevel_discount <", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_discount <=", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountLike(String value) {
            addCriterion("membershipLevel_discount like", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountNotLike(String value) {
            addCriterion("membershipLevel_discount not like", value, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountIn(List<String> values) {
            addCriterion("membershipLevel_discount in", values, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountNotIn(List<String> values) {
            addCriterion("membershipLevel_discount not in", values, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountBetween(String value1, String value2) {
            addCriterion("membershipLevel_discount between", value1, value2, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDiscountNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_discount not between", value1, value2, "membershiplevelDiscount");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralIsNull() {
            addCriterion("membershipLevel_integral is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralIsNotNull() {
            addCriterion("membershipLevel_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralEqualTo(Integer value) {
            addCriterion("membershipLevel_integral =", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralNotEqualTo(Integer value) {
            addCriterion("membershipLevel_integral <>", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralGreaterThan(Integer value) {
            addCriterion("membershipLevel_integral >", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_integral >=", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralLessThan(Integer value) {
            addCriterion("membershipLevel_integral <", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_integral <=", value, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralIn(List<Integer> values) {
            addCriterion("membershipLevel_integral in", values, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralNotIn(List<Integer> values) {
            addCriterion("membershipLevel_integral not in", values, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_integral between", value1, value2, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_integral not between", value1, value2, "membershiplevelIntegral");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeIsNull() {
            addCriterion("membershipLevel_type is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeIsNotNull() {
            addCriterion("membershipLevel_type is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeEqualTo(String value) {
            addCriterion("membershipLevel_type =", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeNotEqualTo(String value) {
            addCriterion("membershipLevel_type <>", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeGreaterThan(String value) {
            addCriterion("membershipLevel_type >", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_type >=", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeLessThan(String value) {
            addCriterion("membershipLevel_type <", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_type <=", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeLike(String value) {
            addCriterion("membershipLevel_type like", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeNotLike(String value) {
            addCriterion("membershipLevel_type not like", value, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeIn(List<String> values) {
            addCriterion("membershipLevel_type in", values, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeNotIn(List<String> values) {
            addCriterion("membershipLevel_type not in", values, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeBetween(String value1, String value2) {
            addCriterion("membershipLevel_type between", value1, value2, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTypeNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_type not between", value1, value2, "membershiplevelType");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleIsNull() {
            addCriterion("membershipLevel_rule is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleIsNotNull() {
            addCriterion("membershipLevel_rule is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleEqualTo(String value) {
            addCriterion("membershipLevel_rule =", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleNotEqualTo(String value) {
            addCriterion("membershipLevel_rule <>", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleGreaterThan(String value) {
            addCriterion("membershipLevel_rule >", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleGreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule >=", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleLessThan(String value) {
            addCriterion("membershipLevel_rule <", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleLessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule <=", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleLike(String value) {
            addCriterion("membershipLevel_rule like", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleNotLike(String value) {
            addCriterion("membershipLevel_rule not like", value, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleIn(List<String> values) {
            addCriterion("membershipLevel_rule in", values, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleNotIn(List<String> values) {
            addCriterion("membershipLevel_rule not in", values, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleBetween(String value1, String value2) {
            addCriterion("membershipLevel_rule between", value1, value2, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRuleNotBetween(String value1, String value2) {
            addCriterion("membershipLevel_rule not between", value1, value2, "membershiplevelRule");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1IsNull() {
            addCriterion("membershipLevel_rule1 is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1IsNotNull() {
            addCriterion("membershipLevel_rule1 is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1EqualTo(String value) {
            addCriterion("membershipLevel_rule1 =", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1NotEqualTo(String value) {
            addCriterion("membershipLevel_rule1 <>", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1GreaterThan(String value) {
            addCriterion("membershipLevel_rule1 >", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1GreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule1 >=", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1LessThan(String value) {
            addCriterion("membershipLevel_rule1 <", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1LessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule1 <=", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1Like(String value) {
            addCriterion("membershipLevel_rule1 like", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1NotLike(String value) {
            addCriterion("membershipLevel_rule1 not like", value, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1In(List<String> values) {
            addCriterion("membershipLevel_rule1 in", values, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1NotIn(List<String> values) {
            addCriterion("membershipLevel_rule1 not in", values, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1Between(String value1, String value2) {
            addCriterion("membershipLevel_rule1 between", value1, value2, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule1NotBetween(String value1, String value2) {
            addCriterion("membershipLevel_rule1 not between", value1, value2, "membershiplevelRule1");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2IsNull() {
            addCriterion("membershipLevel_rule2 is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2IsNotNull() {
            addCriterion("membershipLevel_rule2 is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2EqualTo(String value) {
            addCriterion("membershipLevel_rule2 =", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2NotEqualTo(String value) {
            addCriterion("membershipLevel_rule2 <>", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2GreaterThan(String value) {
            addCriterion("membershipLevel_rule2 >", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2GreaterThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule2 >=", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2LessThan(String value) {
            addCriterion("membershipLevel_rule2 <", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2LessThanOrEqualTo(String value) {
            addCriterion("membershipLevel_rule2 <=", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2Like(String value) {
            addCriterion("membershipLevel_rule2 like", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2NotLike(String value) {
            addCriterion("membershipLevel_rule2 not like", value, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2In(List<String> values) {
            addCriterion("membershipLevel_rule2 in", values, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2NotIn(List<String> values) {
            addCriterion("membershipLevel_rule2 not in", values, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2Between(String value1, String value2) {
            addCriterion("membershipLevel_rule2 between", value1, value2, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelRule2NotBetween(String value1, String value2) {
            addCriterion("membershipLevel_rule2 not between", value1, value2, "membershiplevelRule2");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultIsNull() {
            addCriterion("membershipLevel_default is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultIsNotNull() {
            addCriterion("membershipLevel_default is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultEqualTo(Integer value) {
            addCriterion("membershipLevel_default =", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultNotEqualTo(Integer value) {
            addCriterion("membershipLevel_default <>", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultGreaterThan(Integer value) {
            addCriterion("membershipLevel_default >", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_default >=", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultLessThan(Integer value) {
            addCriterion("membershipLevel_default <", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_default <=", value, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultIn(List<Integer> values) {
            addCriterion("membershipLevel_default in", values, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultNotIn(List<Integer> values) {
            addCriterion("membershipLevel_default not in", values, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_default between", value1, value2, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_default not between", value1, value2, "membershiplevelDefault");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeIsNull() {
            addCriterion("membershipLevel_upgradetype is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeIsNotNull() {
            addCriterion("membershipLevel_upgradetype is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradetype =", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeNotEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradetype <>", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeGreaterThan(Integer value) {
            addCriterion("membershipLevel_upgradetype >", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradetype >=", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeLessThan(Integer value) {
            addCriterion("membershipLevel_upgradetype <", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeLessThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradetype <=", value, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeIn(List<Integer> values) {
            addCriterion("membershipLevel_upgradetype in", values, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeNotIn(List<Integer> values) {
            addCriterion("membershipLevel_upgradetype not in", values, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_upgradetype between", value1, value2, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_upgradetype not between", value1, value2, "membershiplevelUpgradetype");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentIsNull() {
            addCriterion("membershipLevel_upgradepayment is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentIsNotNull() {
            addCriterion("membershipLevel_upgradepayment is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradepayment =", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentNotEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradepayment <>", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentGreaterThan(Integer value) {
            addCriterion("membershipLevel_upgradepayment >", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradepayment >=", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentLessThan(Integer value) {
            addCriterion("membershipLevel_upgradepayment <", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentLessThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_upgradepayment <=", value, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentIn(List<Integer> values) {
            addCriterion("membershipLevel_upgradepayment in", values, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentNotIn(List<Integer> values) {
            addCriterion("membershipLevel_upgradepayment not in", values, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_upgradepayment between", value1, value2, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelUpgradepaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_upgradepayment not between", value1, value2, "membershiplevelUpgradepayment");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeIsNull() {
            addCriterion("membershipLevel_time is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeIsNotNull() {
            addCriterion("membershipLevel_time is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeEqualTo(Date value) {
            addCriterion("membershipLevel_time =", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeNotEqualTo(Date value) {
            addCriterion("membershipLevel_time <>", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeGreaterThan(Date value) {
            addCriterion("membershipLevel_time >", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("membershipLevel_time >=", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeLessThan(Date value) {
            addCriterion("membershipLevel_time <", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeLessThanOrEqualTo(Date value) {
            addCriterion("membershipLevel_time <=", value, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeIn(List<Date> values) {
            addCriterion("membershipLevel_time in", values, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeNotIn(List<Date> values) {
            addCriterion("membershipLevel_time not in", values, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeBetween(Date value1, Date value2) {
            addCriterion("membershipLevel_time between", value1, value2, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelTimeNotBetween(Date value1, Date value2) {
            addCriterion("membershipLevel_time not between", value1, value2, "membershiplevelTime");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveIsNull() {
            addCriterion("membershipLevel_effective is null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveIsNotNull() {
            addCriterion("membershipLevel_effective is not null");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveEqualTo(Integer value) {
            addCriterion("membershipLevel_effective =", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveNotEqualTo(Integer value) {
            addCriterion("membershipLevel_effective <>", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveGreaterThan(Integer value) {
            addCriterion("membershipLevel_effective >", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_effective >=", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveLessThan(Integer value) {
            addCriterion("membershipLevel_effective <", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("membershipLevel_effective <=", value, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveIn(List<Integer> values) {
            addCriterion("membershipLevel_effective in", values, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveNotIn(List<Integer> values) {
            addCriterion("membershipLevel_effective not in", values, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_effective between", value1, value2, "membershiplevelEffective");
            return (Criteria) this;
        }

        public Criteria andMembershiplevelEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("membershipLevel_effective not between", value1, value2, "membershiplevelEffective");
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