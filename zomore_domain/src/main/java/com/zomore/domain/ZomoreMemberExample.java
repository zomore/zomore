package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreMemberExample() {
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

        public Criteria andMemberMemberidIsNull() {
            addCriterion("member_memberId is null");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidIsNotNull() {
            addCriterion("member_memberId is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidEqualTo(String value) {
            addCriterion("member_memberId =", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidNotEqualTo(String value) {
            addCriterion("member_memberId <>", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidGreaterThan(String value) {
            addCriterion("member_memberId >", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidGreaterThanOrEqualTo(String value) {
            addCriterion("member_memberId >=", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidLessThan(String value) {
            addCriterion("member_memberId <", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidLessThanOrEqualTo(String value) {
            addCriterion("member_memberId <=", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidLike(String value) {
            addCriterion("member_memberId like", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidNotLike(String value) {
            addCriterion("member_memberId not like", value, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidIn(List<String> values) {
            addCriterion("member_memberId in", values, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidNotIn(List<String> values) {
            addCriterion("member_memberId not in", values, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidBetween(String value1, String value2) {
            addCriterion("member_memberId between", value1, value2, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidNotBetween(String value1, String value2) {
            addCriterion("member_memberId not between", value1, value2, "memberMemberid");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNull() {
            addCriterion("member_number is null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIsNotNull() {
            addCriterion("member_number is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNumberEqualTo(String value) {
            addCriterion("member_number =", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotEqualTo(String value) {
            addCriterion("member_number <>", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThan(String value) {
            addCriterion("member_number >", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberGreaterThanOrEqualTo(String value) {
            addCriterion("member_number >=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThan(String value) {
            addCriterion("member_number <", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLessThanOrEqualTo(String value) {
            addCriterion("member_number <=", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberLike(String value) {
            addCriterion("member_number like", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotLike(String value) {
            addCriterion("member_number not like", value, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberIn(List<String> values) {
            addCriterion("member_number in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotIn(List<String> values) {
            addCriterion("member_number not in", values, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberBetween(String value1, String value2) {
            addCriterion("member_number between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberNumberNotBetween(String value1, String value2) {
            addCriterion("member_number not between", value1, value2, "memberNumber");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameIsNull() {
            addCriterion("member_memberIdName is null");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameIsNotNull() {
            addCriterion("member_memberIdName is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameEqualTo(String value) {
            addCriterion("member_memberIdName =", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameNotEqualTo(String value) {
            addCriterion("member_memberIdName <>", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameGreaterThan(String value) {
            addCriterion("member_memberIdName >", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameGreaterThanOrEqualTo(String value) {
            addCriterion("member_memberIdName >=", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameLessThan(String value) {
            addCriterion("member_memberIdName <", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameLessThanOrEqualTo(String value) {
            addCriterion("member_memberIdName <=", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameLike(String value) {
            addCriterion("member_memberIdName like", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameNotLike(String value) {
            addCriterion("member_memberIdName not like", value, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameIn(List<String> values) {
            addCriterion("member_memberIdName in", values, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameNotIn(List<String> values) {
            addCriterion("member_memberIdName not in", values, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameBetween(String value1, String value2) {
            addCriterion("member_memberIdName between", value1, value2, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberMemberidnameNotBetween(String value1, String value2) {
            addCriterion("member_memberIdName not between", value1, value2, "memberMemberidname");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberIsNull() {
            addCriterion("member_phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberIsNotNull() {
            addCriterion("member_phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberEqualTo(String value) {
            addCriterion("member_phoneNumber =", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberNotEqualTo(String value) {
            addCriterion("member_phoneNumber <>", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberGreaterThan(String value) {
            addCriterion("member_phoneNumber >", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("member_phoneNumber >=", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberLessThan(String value) {
            addCriterion("member_phoneNumber <", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("member_phoneNumber <=", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberLike(String value) {
            addCriterion("member_phoneNumber like", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberNotLike(String value) {
            addCriterion("member_phoneNumber not like", value, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberIn(List<String> values) {
            addCriterion("member_phoneNumber in", values, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberNotIn(List<String> values) {
            addCriterion("member_phoneNumber not in", values, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberBetween(String value1, String value2) {
            addCriterion("member_phoneNumber between", value1, value2, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhonenumberNotBetween(String value1, String value2) {
            addCriterion("member_phoneNumber not between", value1, value2, "memberPhonenumber");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIsNull() {
            addCriterion("member_grade is null");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIsNotNull() {
            addCriterion("member_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGradeEqualTo(String value) {
            addCriterion("member_grade =", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotEqualTo(String value) {
            addCriterion("member_grade <>", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeGreaterThan(String value) {
            addCriterion("member_grade >", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeGreaterThanOrEqualTo(String value) {
            addCriterion("member_grade >=", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeLessThan(String value) {
            addCriterion("member_grade <", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeLessThanOrEqualTo(String value) {
            addCriterion("member_grade <=", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeLike(String value) {
            addCriterion("member_grade like", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotLike(String value) {
            addCriterion("member_grade not like", value, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeIn(List<String> values) {
            addCriterion("member_grade in", values, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotIn(List<String> values) {
            addCriterion("member_grade not in", values, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeBetween(String value1, String value2) {
            addCriterion("member_grade between", value1, value2, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberGradeNotBetween(String value1, String value2) {
            addCriterion("member_grade not between", value1, value2, "memberGrade");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNull() {
            addCriterion("member_discount is null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIsNotNull() {
            addCriterion("member_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountEqualTo(String value) {
            addCriterion("member_discount =", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotEqualTo(String value) {
            addCriterion("member_discount <>", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThan(String value) {
            addCriterion("member_discount >", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("member_discount >=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThan(String value) {
            addCriterion("member_discount <", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLessThanOrEqualTo(String value) {
            addCriterion("member_discount <=", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountLike(String value) {
            addCriterion("member_discount like", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotLike(String value) {
            addCriterion("member_discount not like", value, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountIn(List<String> values) {
            addCriterion("member_discount in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotIn(List<String> values) {
            addCriterion("member_discount not in", values, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountBetween(String value1, String value2) {
            addCriterion("member_discount between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberDiscountNotBetween(String value1, String value2) {
            addCriterion("member_discount not between", value1, value2, "memberDiscount");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIsNull() {
            addCriterion("member_balance is null");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIsNotNull() {
            addCriterion("member_balance is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceEqualTo(String value) {
            addCriterion("member_balance =", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotEqualTo(String value) {
            addCriterion("member_balance <>", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceGreaterThan(String value) {
            addCriterion("member_balance >", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("member_balance >=", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceLessThan(String value) {
            addCriterion("member_balance <", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceLessThanOrEqualTo(String value) {
            addCriterion("member_balance <=", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceLike(String value) {
            addCriterion("member_balance like", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotLike(String value) {
            addCriterion("member_balance not like", value, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceIn(List<String> values) {
            addCriterion("member_balance in", values, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotIn(List<String> values) {
            addCriterion("member_balance not in", values, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceBetween(String value1, String value2) {
            addCriterion("member_balance between", value1, value2, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberBalanceNotBetween(String value1, String value2) {
            addCriterion("member_balance not between", value1, value2, "memberBalance");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1IsNull() {
            addCriterion("member_money1 is null");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1IsNotNull() {
            addCriterion("member_money1 is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1EqualTo(Double value) {
            addCriterion("member_money1 =", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1NotEqualTo(Double value) {
            addCriterion("member_money1 <>", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1GreaterThan(Double value) {
            addCriterion("member_money1 >", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1GreaterThanOrEqualTo(Double value) {
            addCriterion("member_money1 >=", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1LessThan(Double value) {
            addCriterion("member_money1 <", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1LessThanOrEqualTo(Double value) {
            addCriterion("member_money1 <=", value, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1In(List<Double> values) {
            addCriterion("member_money1 in", values, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1NotIn(List<Double> values) {
            addCriterion("member_money1 not in", values, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1Between(Double value1, Double value2) {
            addCriterion("member_money1 between", value1, value2, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney1NotBetween(Double value1, Double value2) {
            addCriterion("member_money1 not between", value1, value2, "memberMoney1");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2IsNull() {
            addCriterion("member_money2 is null");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2IsNotNull() {
            addCriterion("member_money2 is not null");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2EqualTo(Double value) {
            addCriterion("member_money2 =", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2NotEqualTo(Double value) {
            addCriterion("member_money2 <>", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2GreaterThan(Double value) {
            addCriterion("member_money2 >", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2GreaterThanOrEqualTo(Double value) {
            addCriterion("member_money2 >=", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2LessThan(Double value) {
            addCriterion("member_money2 <", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2LessThanOrEqualTo(Double value) {
            addCriterion("member_money2 <=", value, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2In(List<Double> values) {
            addCriterion("member_money2 in", values, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2NotIn(List<Double> values) {
            addCriterion("member_money2 not in", values, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2Between(Double value1, Double value2) {
            addCriterion("member_money2 between", value1, value2, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberMoney2NotBetween(Double value1, Double value2) {
            addCriterion("member_money2 not between", value1, value2, "memberMoney2");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIsNull() {
            addCriterion("member_integral is null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIsNotNull() {
            addCriterion("member_integral is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralEqualTo(Double value) {
            addCriterion("member_integral =", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotEqualTo(Double value) {
            addCriterion("member_integral <>", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralGreaterThan(Double value) {
            addCriterion("member_integral >", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralGreaterThanOrEqualTo(Double value) {
            addCriterion("member_integral >=", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralLessThan(Double value) {
            addCriterion("member_integral <", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralLessThanOrEqualTo(Double value) {
            addCriterion("member_integral <=", value, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralIn(List<Double> values) {
            addCriterion("member_integral in", values, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotIn(List<Double> values) {
            addCriterion("member_integral not in", values, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralBetween(Double value1, Double value2) {
            addCriterion("member_integral between", value1, value2, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberIntegralNotBetween(Double value1, Double value2) {
            addCriterion("member_integral not between", value1, value2, "memberIntegral");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardIsNull() {
            addCriterion("member_subCard is null");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardIsNotNull() {
            addCriterion("member_subCard is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardEqualTo(Integer value) {
            addCriterion("member_subCard =", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardNotEqualTo(Integer value) {
            addCriterion("member_subCard <>", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardGreaterThan(Integer value) {
            addCriterion("member_subCard >", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_subCard >=", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardLessThan(Integer value) {
            addCriterion("member_subCard <", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardLessThanOrEqualTo(Integer value) {
            addCriterion("member_subCard <=", value, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardIn(List<Integer> values) {
            addCriterion("member_subCard in", values, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardNotIn(List<Integer> values) {
            addCriterion("member_subCard not in", values, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardBetween(Integer value1, Integer value2) {
            addCriterion("member_subCard between", value1, value2, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberSubcardNotBetween(Integer value1, Integer value2) {
            addCriterion("member_subCard not between", value1, value2, "memberSubcard");
            return (Criteria) this;
        }

        public Criteria andMemberCouponIsNull() {
            addCriterion("member_coupon is null");
            return (Criteria) this;
        }

        public Criteria andMemberCouponIsNotNull() {
            addCriterion("member_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCouponEqualTo(String value) {
            addCriterion("member_coupon =", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponNotEqualTo(String value) {
            addCriterion("member_coupon <>", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponGreaterThan(String value) {
            addCriterion("member_coupon >", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponGreaterThanOrEqualTo(String value) {
            addCriterion("member_coupon >=", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponLessThan(String value) {
            addCriterion("member_coupon <", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponLessThanOrEqualTo(String value) {
            addCriterion("member_coupon <=", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponLike(String value) {
            addCriterion("member_coupon like", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponNotLike(String value) {
            addCriterion("member_coupon not like", value, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponIn(List<String> values) {
            addCriterion("member_coupon in", values, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponNotIn(List<String> values) {
            addCriterion("member_coupon not in", values, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponBetween(String value1, String value2) {
            addCriterion("member_coupon between", value1, value2, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberCouponNotBetween(String value1, String value2) {
            addCriterion("member_coupon not between", value1, value2, "memberCoupon");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardIsNull() {
            addCriterion("member_dateOfOpeningCard is null");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardIsNotNull() {
            addCriterion("member_dateOfOpeningCard is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardEqualTo(Date value) {
            addCriterion("member_dateOfOpeningCard =", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardNotEqualTo(Date value) {
            addCriterion("member_dateOfOpeningCard <>", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardGreaterThan(Date value) {
            addCriterion("member_dateOfOpeningCard >", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardGreaterThanOrEqualTo(Date value) {
            addCriterion("member_dateOfOpeningCard >=", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardLessThan(Date value) {
            addCriterion("member_dateOfOpeningCard <", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardLessThanOrEqualTo(Date value) {
            addCriterion("member_dateOfOpeningCard <=", value, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardIn(List<Date> values) {
            addCriterion("member_dateOfOpeningCard in", values, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardNotIn(List<Date> values) {
            addCriterion("member_dateOfOpeningCard not in", values, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardBetween(Date value1, Date value2) {
            addCriterion("member_dateOfOpeningCard between", value1, value2, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDateofopeningcardNotBetween(Date value1, Date value2) {
            addCriterion("member_dateOfOpeningCard not between", value1, value2, "memberDateofopeningcard");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateIsNull() {
            addCriterion("member_dueDate is null");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateIsNotNull() {
            addCriterion("member_dueDate is not null");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateEqualTo(Date value) {
            addCriterion("member_dueDate =", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateNotEqualTo(Date value) {
            addCriterion("member_dueDate <>", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateGreaterThan(Date value) {
            addCriterion("member_dueDate >", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("member_dueDate >=", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateLessThan(Date value) {
            addCriterion("member_dueDate <", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateLessThanOrEqualTo(Date value) {
            addCriterion("member_dueDate <=", value, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateIn(List<Date> values) {
            addCriterion("member_dueDate in", values, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateNotIn(List<Date> values) {
            addCriterion("member_dueDate not in", values, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateBetween(Date value1, Date value2) {
            addCriterion("member_dueDate between", value1, value2, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberDuedateNotBetween(Date value1, Date value2) {
            addCriterion("member_dueDate not between", value1, value2, "memberDuedate");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNull() {
            addCriterion("member_birthday is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNotNull() {
            addCriterion("member_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayEqualTo(Date value) {
            addCriterion("member_birthday =", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotEqualTo(Date value) {
            addCriterion("member_birthday <>", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThan(Date value) {
            addCriterion("member_birthday >", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("member_birthday >=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThan(Date value) {
            addCriterion("member_birthday <", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("member_birthday <=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIn(List<Date> values) {
            addCriterion("member_birthday in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotIn(List<Date> values) {
            addCriterion("member_birthday not in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayBetween(Date value1, Date value2) {
            addCriterion("member_birthday between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("member_birthday not between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNull() {
            addCriterion("member_address is null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNotNull() {
            addCriterion("member_address is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressEqualTo(String value) {
            addCriterion("member_address =", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotEqualTo(String value) {
            addCriterion("member_address <>", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThan(String value) {
            addCriterion("member_address >", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThanOrEqualTo(String value) {
            addCriterion("member_address >=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThan(String value) {
            addCriterion("member_address <", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThanOrEqualTo(String value) {
            addCriterion("member_address <=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLike(String value) {
            addCriterion("member_address like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotLike(String value) {
            addCriterion("member_address not like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIn(List<String> values) {
            addCriterion("member_address in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotIn(List<String> values) {
            addCriterion("member_address not in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressBetween(String value1, String value2) {
            addCriterion("member_address between", value1, value2, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotBetween(String value1, String value2) {
            addCriterion("member_address not between", value1, value2, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditIsNull() {
            addCriterion("member_onCredit is null");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditIsNotNull() {
            addCriterion("member_onCredit is not null");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditEqualTo(Integer value) {
            addCriterion("member_onCredit =", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditNotEqualTo(Integer value) {
            addCriterion("member_onCredit <>", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditGreaterThan(Integer value) {
            addCriterion("member_onCredit >", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_onCredit >=", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditLessThan(Integer value) {
            addCriterion("member_onCredit <", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditLessThanOrEqualTo(Integer value) {
            addCriterion("member_onCredit <=", value, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditIn(List<Integer> values) {
            addCriterion("member_onCredit in", values, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditNotIn(List<Integer> values) {
            addCriterion("member_onCredit not in", values, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditBetween(Integer value1, Integer value2) {
            addCriterion("member_onCredit between", value1, value2, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberOncreditNotBetween(Integer value1, Integer value2) {
            addCriterion("member_onCredit not between", value1, value2, "memberOncredit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitIsNull() {
            addCriterion("member_creditLimit is null");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitIsNotNull() {
            addCriterion("member_creditLimit is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitEqualTo(Long value) {
            addCriterion("member_creditLimit =", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitNotEqualTo(Long value) {
            addCriterion("member_creditLimit <>", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitGreaterThan(Long value) {
            addCriterion("member_creditLimit >", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitGreaterThanOrEqualTo(Long value) {
            addCriterion("member_creditLimit >=", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitLessThan(Long value) {
            addCriterion("member_creditLimit <", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitLessThanOrEqualTo(Long value) {
            addCriterion("member_creditLimit <=", value, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitIn(List<Long> values) {
            addCriterion("member_creditLimit in", values, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitNotIn(List<Long> values) {
            addCriterion("member_creditLimit not in", values, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitBetween(Long value1, Long value2) {
            addCriterion("member_creditLimit between", value1, value2, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberCreditlimitNotBetween(Long value1, Long value2) {
            addCriterion("member_creditLimit not between", value1, value2, "memberCreditlimit");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNull() {
            addCriterion("member_state is null");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNotNull() {
            addCriterion("member_state is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStateEqualTo(Integer value) {
            addCriterion("member_state =", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotEqualTo(Integer value) {
            addCriterion("member_state <>", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThan(Integer value) {
            addCriterion("member_state >", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_state >=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThan(Integer value) {
            addCriterion("member_state <", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThanOrEqualTo(Integer value) {
            addCriterion("member_state <=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateIn(List<Integer> values) {
            addCriterion("member_state in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotIn(List<Integer> values) {
            addCriterion("member_state not in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateBetween(Integer value1, Integer value2) {
            addCriterion("member_state between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotBetween(Integer value1, Integer value2) {
            addCriterion("member_state not between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberGuideIsNull() {
            addCriterion("member_guide is null");
            return (Criteria) this;
        }

        public Criteria andMemberGuideIsNotNull() {
            addCriterion("member_guide is not null");
            return (Criteria) this;
        }

        public Criteria andMemberGuideEqualTo(String value) {
            addCriterion("member_guide =", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideNotEqualTo(String value) {
            addCriterion("member_guide <>", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideGreaterThan(String value) {
            addCriterion("member_guide >", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideGreaterThanOrEqualTo(String value) {
            addCriterion("member_guide >=", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideLessThan(String value) {
            addCriterion("member_guide <", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideLessThanOrEqualTo(String value) {
            addCriterion("member_guide <=", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideLike(String value) {
            addCriterion("member_guide like", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideNotLike(String value) {
            addCriterion("member_guide not like", value, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideIn(List<String> values) {
            addCriterion("member_guide in", values, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideNotIn(List<String> values) {
            addCriterion("member_guide not in", values, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideBetween(String value1, String value2) {
            addCriterion("member_guide between", value1, value2, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberGuideNotBetween(String value1, String value2) {
            addCriterion("member_guide not between", value1, value2, "memberGuide");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_qq like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_qq not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberShopIsNull() {
            addCriterion("member_shop is null");
            return (Criteria) this;
        }

        public Criteria andMemberShopIsNotNull() {
            addCriterion("member_shop is not null");
            return (Criteria) this;
        }

        public Criteria andMemberShopEqualTo(String value) {
            addCriterion("member_shop =", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopNotEqualTo(String value) {
            addCriterion("member_shop <>", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopGreaterThan(String value) {
            addCriterion("member_shop >", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopGreaterThanOrEqualTo(String value) {
            addCriterion("member_shop >=", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopLessThan(String value) {
            addCriterion("member_shop <", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopLessThanOrEqualTo(String value) {
            addCriterion("member_shop <=", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopLike(String value) {
            addCriterion("member_shop like", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopNotLike(String value) {
            addCriterion("member_shop not like", value, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopIn(List<String> values) {
            addCriterion("member_shop in", values, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopNotIn(List<String> values) {
            addCriterion("member_shop not in", values, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopBetween(String value1, String value2) {
            addCriterion("member_shop between", value1, value2, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopNotBetween(String value1, String value2) {
            addCriterion("member_shop not between", value1, value2, "memberShop");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarIsNull() {
            addCriterion("member_shopcar is null");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarIsNotNull() {
            addCriterion("member_shopcar is not null");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarEqualTo(String value) {
            addCriterion("member_shopcar =", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarNotEqualTo(String value) {
            addCriterion("member_shopcar <>", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarGreaterThan(String value) {
            addCriterion("member_shopcar >", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarGreaterThanOrEqualTo(String value) {
            addCriterion("member_shopcar >=", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarLessThan(String value) {
            addCriterion("member_shopcar <", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarLessThanOrEqualTo(String value) {
            addCriterion("member_shopcar <=", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarLike(String value) {
            addCriterion("member_shopcar like", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarNotLike(String value) {
            addCriterion("member_shopcar not like", value, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarIn(List<String> values) {
            addCriterion("member_shopcar in", values, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarNotIn(List<String> values) {
            addCriterion("member_shopcar not in", values, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarBetween(String value1, String value2) {
            addCriterion("member_shopcar between", value1, value2, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberShopcarNotBetween(String value1, String value2) {
            addCriterion("member_shopcar not between", value1, value2, "memberShopcar");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeIsNull() {
            addCriterion("member_recommendcode is null");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeIsNotNull() {
            addCriterion("member_recommendcode is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeEqualTo(String value) {
            addCriterion("member_recommendcode =", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeNotEqualTo(String value) {
            addCriterion("member_recommendcode <>", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeGreaterThan(String value) {
            addCriterion("member_recommendcode >", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeGreaterThanOrEqualTo(String value) {
            addCriterion("member_recommendcode >=", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeLessThan(String value) {
            addCriterion("member_recommendcode <", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeLessThanOrEqualTo(String value) {
            addCriterion("member_recommendcode <=", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeLike(String value) {
            addCriterion("member_recommendcode like", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeNotLike(String value) {
            addCriterion("member_recommendcode not like", value, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeIn(List<String> values) {
            addCriterion("member_recommendcode in", values, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeNotIn(List<String> values) {
            addCriterion("member_recommendcode not in", values, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeBetween(String value1, String value2) {
            addCriterion("member_recommendcode between", value1, value2, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberRecommendcodeNotBetween(String value1, String value2) {
            addCriterion("member_recommendcode not between", value1, value2, "memberRecommendcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeIsNull() {
            addCriterion("member_invitationcode is null");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeIsNotNull() {
            addCriterion("member_invitationcode is not null");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeEqualTo(String value) {
            addCriterion("member_invitationcode =", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeNotEqualTo(String value) {
            addCriterion("member_invitationcode <>", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeGreaterThan(String value) {
            addCriterion("member_invitationcode >", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("member_invitationcode >=", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeLessThan(String value) {
            addCriterion("member_invitationcode <", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeLessThanOrEqualTo(String value) {
            addCriterion("member_invitationcode <=", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeLike(String value) {
            addCriterion("member_invitationcode like", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeNotLike(String value) {
            addCriterion("member_invitationcode not like", value, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeIn(List<String> values) {
            addCriterion("member_invitationcode in", values, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeNotIn(List<String> values) {
            addCriterion("member_invitationcode not in", values, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeBetween(String value1, String value2) {
            addCriterion("member_invitationcode between", value1, value2, "memberInvitationcode");
            return (Criteria) this;
        }

        public Criteria andMemberInvitationcodeNotBetween(String value1, String value2) {
            addCriterion("member_invitationcode not between", value1, value2, "memberInvitationcode");
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