package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreMemberInputruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreMemberInputruleExample() {
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

        public Criteria andZomoreMemberInputruleIdIsNull() {
            addCriterion("zomore_member_inputrule_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdIsNotNull() {
            addCriterion("zomore_member_inputrule_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdEqualTo(String value) {
            addCriterion("zomore_member_inputrule_id =", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdNotEqualTo(String value) {
            addCriterion("zomore_member_inputrule_id <>", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdGreaterThan(String value) {
            addCriterion("zomore_member_inputrule_id >", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_id >=", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdLessThan(String value) {
            addCriterion("zomore_member_inputrule_id <", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_id <=", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdLike(String value) {
            addCriterion("zomore_member_inputrule_id like", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdNotLike(String value) {
            addCriterion("zomore_member_inputrule_id not like", value, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdIn(List<String> values) {
            addCriterion("zomore_member_inputrule_id in", values, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdNotIn(List<String> values) {
            addCriterion("zomore_member_inputrule_id not in", values, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_id between", value1, value2, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIdNotBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_id not between", value1, value2, "zomoreMemberInputruleId");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameIsNull() {
            addCriterion("zomore_member_inputrule_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameIsNotNull() {
            addCriterion("zomore_member_inputrule_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameEqualTo(String value) {
            addCriterion("zomore_member_inputrule_name =", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameNotEqualTo(String value) {
            addCriterion("zomore_member_inputrule_name <>", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameGreaterThan(String value) {
            addCriterion("zomore_member_inputrule_name >", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_name >=", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameLessThan(String value) {
            addCriterion("zomore_member_inputrule_name <", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_name <=", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameLike(String value) {
            addCriterion("zomore_member_inputrule_name like", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameNotLike(String value) {
            addCriterion("zomore_member_inputrule_name not like", value, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameIn(List<String> values) {
            addCriterion("zomore_member_inputrule_name in", values, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameNotIn(List<String> values) {
            addCriterion("zomore_member_inputrule_name not in", values, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_name between", value1, value2, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNameNotBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_name not between", value1, value2, "zomoreMemberInputruleName");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeIsNull() {
            addCriterion("zomore_member_inputrule_grade is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeIsNotNull() {
            addCriterion("zomore_member_inputrule_grade is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeEqualTo(String value) {
            addCriterion("zomore_member_inputrule_grade =", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeNotEqualTo(String value) {
            addCriterion("zomore_member_inputrule_grade <>", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeGreaterThan(String value) {
            addCriterion("zomore_member_inputrule_grade >", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_grade >=", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeLessThan(String value) {
            addCriterion("zomore_member_inputrule_grade <", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeLessThanOrEqualTo(String value) {
            addCriterion("zomore_member_inputrule_grade <=", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeLike(String value) {
            addCriterion("zomore_member_inputrule_grade like", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeNotLike(String value) {
            addCriterion("zomore_member_inputrule_grade not like", value, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeIn(List<String> values) {
            addCriterion("zomore_member_inputrule_grade in", values, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeNotIn(List<String> values) {
            addCriterion("zomore_member_inputrule_grade not in", values, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_grade between", value1, value2, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGradeNotBetween(String value1, String value2) {
            addCriterion("zomore_member_inputrule_grade not between", value1, value2, "zomoreMemberInputruleGrade");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyIsNull() {
            addCriterion("zomore_member_inputrule_inmoney is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyIsNotNull() {
            addCriterion("zomore_member_inputrule_inmoney is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_inmoney =", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyNotEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_inmoney <>", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyGreaterThan(Double value) {
            addCriterion("zomore_member_inputrule_inmoney >", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_inmoney >=", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyLessThan(Double value) {
            addCriterion("zomore_member_inputrule_inmoney <", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyLessThanOrEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_inmoney <=", value, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyIn(List<Double> values) {
            addCriterion("zomore_member_inputrule_inmoney in", values, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyNotIn(List<Double> values) {
            addCriterion("zomore_member_inputrule_inmoney not in", values, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyBetween(Double value1, Double value2) {
            addCriterion("zomore_member_inputrule_inmoney between", value1, value2, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleInmoneyNotBetween(Double value1, Double value2) {
            addCriterion("zomore_member_inputrule_inmoney not between", value1, value2, "zomoreMemberInputruleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyIsNull() {
            addCriterion("zomore_member_inputrule_givemoney is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyIsNotNull() {
            addCriterion("zomore_member_inputrule_givemoney is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_givemoney =", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyNotEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_givemoney <>", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyGreaterThan(Double value) {
            addCriterion("zomore_member_inputrule_givemoney >", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_givemoney >=", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyLessThan(Double value) {
            addCriterion("zomore_member_inputrule_givemoney <", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyLessThanOrEqualTo(Double value) {
            addCriterion("zomore_member_inputrule_givemoney <=", value, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyIn(List<Double> values) {
            addCriterion("zomore_member_inputrule_givemoney in", values, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyNotIn(List<Double> values) {
            addCriterion("zomore_member_inputrule_givemoney not in", values, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyBetween(Double value1, Double value2) {
            addCriterion("zomore_member_inputrule_givemoney between", value1, value2, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleGivemoneyNotBetween(Double value1, Double value2) {
            addCriterion("zomore_member_inputrule_givemoney not between", value1, value2, "zomoreMemberInputruleGivemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeIsNull() {
            addCriterion("zomore_member_inputrule_starttime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeIsNotNull() {
            addCriterion("zomore_member_inputrule_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_starttime =", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeNotEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_starttime <>", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeGreaterThan(Date value) {
            addCriterion("zomore_member_inputrule_starttime >", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_starttime >=", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeLessThan(Date value) {
            addCriterion("zomore_member_inputrule_starttime <", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_starttime <=", value, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeIn(List<Date> values) {
            addCriterion("zomore_member_inputrule_starttime in", values, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeNotIn(List<Date> values) {
            addCriterion("zomore_member_inputrule_starttime not in", values, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeBetween(Date value1, Date value2) {
            addCriterion("zomore_member_inputrule_starttime between", value1, value2, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_member_inputrule_starttime not between", value1, value2, "zomoreMemberInputruleStarttime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeIsNull() {
            addCriterion("zomore_member_inputrule_endtime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeIsNotNull() {
            addCriterion("zomore_member_inputrule_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_endtime =", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeNotEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_endtime <>", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeGreaterThan(Date value) {
            addCriterion("zomore_member_inputrule_endtime >", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_endtime >=", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeLessThan(Date value) {
            addCriterion("zomore_member_inputrule_endtime <", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_member_inputrule_endtime <=", value, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeIn(List<Date> values) {
            addCriterion("zomore_member_inputrule_endtime in", values, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeNotIn(List<Date> values) {
            addCriterion("zomore_member_inputrule_endtime not in", values, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeBetween(Date value1, Date value2) {
            addCriterion("zomore_member_inputrule_endtime between", value1, value2, "zomoreMemberInputruleEndtime");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_member_inputrule_endtime not between", value1, value2, "zomoreMemberInputruleEndtime");
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

        public Criteria andZomoreMemberInputruleIsuseroneIsNull() {
            addCriterion("zomore_member_inputrule_isuserone is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneIsNotNull() {
            addCriterion("zomore_member_inputrule_isuserone is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone =", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneNotEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone <>", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneGreaterThan(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone >", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone >=", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneLessThan(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone <", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_isuserone <=", value, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneIn(List<Integer> values) {
            addCriterion("zomore_member_inputrule_isuserone in", values, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneNotIn(List<Integer> values) {
            addCriterion("zomore_member_inputrule_isuserone not in", values, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_inputrule_isuserone between", value1, value2, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleIsuseroneNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_inputrule_isuserone not between", value1, value2, "zomoreMemberInputruleIsuserone");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumIsNull() {
            addCriterion("zomore_member_inputrule_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumIsNotNull() {
            addCriterion("zomore_member_inputrule_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_num =", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumNotEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_num <>", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumGreaterThan(Integer value) {
            addCriterion("zomore_member_inputrule_num >", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_num >=", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumLessThan(Integer value) {
            addCriterion("zomore_member_inputrule_num <", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_member_inputrule_num <=", value, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumIn(List<Integer> values) {
            addCriterion("zomore_member_inputrule_num in", values, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumNotIn(List<Integer> values) {
            addCriterion("zomore_member_inputrule_num not in", values, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_inputrule_num between", value1, value2, "zomoreMemberInputruleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreMemberInputruleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_member_inputrule_num not between", value1, value2, "zomoreMemberInputruleNum");
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