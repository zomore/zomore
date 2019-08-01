package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCashierPerformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCashierPerformanceExample() {
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

        public Criteria andZomoreCashierPerformanceIdIsNull() {
            addCriterion("zomore_cashier_performance_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdIsNotNull() {
            addCriterion("zomore_cashier_performance_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdEqualTo(String value) {
            addCriterion("zomore_cashier_performance_id =", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_id <>", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_id >", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_id >=", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdLessThan(String value) {
            addCriterion("zomore_cashier_performance_id <", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_id <=", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdLike(String value) {
            addCriterion("zomore_cashier_performance_id like", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdNotLike(String value) {
            addCriterion("zomore_cashier_performance_id not like", value, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdIn(List<String> values) {
            addCriterion("zomore_cashier_performance_id in", values, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_id not in", values, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_id between", value1, value2, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceIdNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_id not between", value1, value2, "zomoreCashierPerformanceId");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateIsNull() {
            addCriterion("zomore_cashier_performance_date is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateIsNotNull() {
            addCriterion("zomore_cashier_performance_date is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateEqualTo(Date value) {
            addCriterion("zomore_cashier_performance_date =", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateNotEqualTo(Date value) {
            addCriterion("zomore_cashier_performance_date <>", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateGreaterThan(Date value) {
            addCriterion("zomore_cashier_performance_date >", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_cashier_performance_date >=", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateLessThan(Date value) {
            addCriterion("zomore_cashier_performance_date <", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateLessThanOrEqualTo(Date value) {
            addCriterion("zomore_cashier_performance_date <=", value, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateIn(List<Date> values) {
            addCriterion("zomore_cashier_performance_date in", values, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateNotIn(List<Date> values) {
            addCriterion("zomore_cashier_performance_date not in", values, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateBetween(Date value1, Date value2) {
            addCriterion("zomore_cashier_performance_date between", value1, value2, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceDateNotBetween(Date value1, Date value2) {
            addCriterion("zomore_cashier_performance_date not between", value1, value2, "zomoreCashierPerformanceDate");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridIsNull() {
            addCriterion("zomore_cashier_performance_cashierid is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridIsNotNull() {
            addCriterion("zomore_cashier_performance_cashierid is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashierid =", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashierid <>", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_cashierid >", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashierid >=", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridLessThan(String value) {
            addCriterion("zomore_cashier_performance_cashierid <", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashierid <=", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridLike(String value) {
            addCriterion("zomore_cashier_performance_cashierid like", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridNotLike(String value) {
            addCriterion("zomore_cashier_performance_cashierid not like", value, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridIn(List<String> values) {
            addCriterion("zomore_cashier_performance_cashierid in", values, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_cashierid not in", values, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_cashierid between", value1, value2, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashieridNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_cashierid not between", value1, value2, "zomoreCashierPerformanceCashierid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameIsNull() {
            addCriterion("zomore_cashier_performance_cashiername is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameIsNotNull() {
            addCriterion("zomore_cashier_performance_cashiername is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashiername =", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashiername <>", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_cashiername >", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashiername >=", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameLessThan(String value) {
            addCriterion("zomore_cashier_performance_cashiername <", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_cashiername <=", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameLike(String value) {
            addCriterion("zomore_cashier_performance_cashiername like", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameNotLike(String value) {
            addCriterion("zomore_cashier_performance_cashiername not like", value, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameIn(List<String> values) {
            addCriterion("zomore_cashier_performance_cashiername in", values, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_cashiername not in", values, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_cashiername between", value1, value2, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCashiernameNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_cashiername not between", value1, value2, "zomoreCashierPerformanceCashiername");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidIsNull() {
            addCriterion("zomore_cashier_performance_commodityid is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidIsNotNull() {
            addCriterion("zomore_cashier_performance_commodityid is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityid =", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityid <>", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_commodityid >", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityid >=", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidLessThan(String value) {
            addCriterion("zomore_cashier_performance_commodityid <", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityid <=", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidLike(String value) {
            addCriterion("zomore_cashier_performance_commodityid like", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidNotLike(String value) {
            addCriterion("zomore_cashier_performance_commodityid not like", value, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidIn(List<String> values) {
            addCriterion("zomore_cashier_performance_commodityid in", values, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_commodityid not in", values, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_commodityid between", value1, value2, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommodityidNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_commodityid not between", value1, value2, "zomoreCashierPerformanceCommodityid");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameIsNull() {
            addCriterion("zomore_cashier_performance_commodityname is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameIsNotNull() {
            addCriterion("zomore_cashier_performance_commodityname is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityname =", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityname <>", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_commodityname >", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityname >=", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameLessThan(String value) {
            addCriterion("zomore_cashier_performance_commodityname <", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_commodityname <=", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameLike(String value) {
            addCriterion("zomore_cashier_performance_commodityname like", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameNotLike(String value) {
            addCriterion("zomore_cashier_performance_commodityname not like", value, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameIn(List<String> values) {
            addCriterion("zomore_cashier_performance_commodityname in", values, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_commodityname not in", values, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_commodityname between", value1, value2, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceCommoditynameNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_commodityname not between", value1, value2, "zomoreCashierPerformanceCommodityname");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyIsNull() {
            addCriterion("zomore_cashier_performance_money is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyIsNotNull() {
            addCriterion("zomore_cashier_performance_money is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyEqualTo(String value) {
            addCriterion("zomore_cashier_performance_money =", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_money <>", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_money >", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_money >=", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyLessThan(String value) {
            addCriterion("zomore_cashier_performance_money <", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_money <=", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyLike(String value) {
            addCriterion("zomore_cashier_performance_money like", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyNotLike(String value) {
            addCriterion("zomore_cashier_performance_money not like", value, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyIn(List<String> values) {
            addCriterion("zomore_cashier_performance_money in", values, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_money not in", values, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_money between", value1, value2, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_money not between", value1, value2, "zomoreCashierPerformanceMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumIsNull() {
            addCriterion("zomore_cashier_performance_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumIsNotNull() {
            addCriterion("zomore_cashier_performance_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumEqualTo(Integer value) {
            addCriterion("zomore_cashier_performance_num =", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumNotEqualTo(Integer value) {
            addCriterion("zomore_cashier_performance_num <>", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumGreaterThan(Integer value) {
            addCriterion("zomore_cashier_performance_num >", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_cashier_performance_num >=", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumLessThan(Integer value) {
            addCriterion("zomore_cashier_performance_num <", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_cashier_performance_num <=", value, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumIn(List<Integer> values) {
            addCriterion("zomore_cashier_performance_num in", values, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumNotIn(List<Integer> values) {
            addCriterion("zomore_cashier_performance_num not in", values, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_cashier_performance_num between", value1, value2, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_cashier_performance_num not between", value1, value2, "zomoreCashierPerformanceNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallIsNull() {
            addCriterion("zomore_cashier_performance_moneyall is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallIsNotNull() {
            addCriterion("zomore_cashier_performance_moneyall is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyall =", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyall <>", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_moneyall >", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyall >=", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallLessThan(String value) {
            addCriterion("zomore_cashier_performance_moneyall <", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyall <=", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallLike(String value) {
            addCriterion("zomore_cashier_performance_moneyall like", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallNotLike(String value) {
            addCriterion("zomore_cashier_performance_moneyall not like", value, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneyall in", values, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneyall not in", values, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneyall between", value1, value2, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyallNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneyall not between", value1, value2, "zomoreCashierPerformanceMoneyall");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualIsNull() {
            addCriterion("zomore_cashier_performance_moneyactual is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualIsNotNull() {
            addCriterion("zomore_cashier_performance_moneyactual is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyactual =", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyactual <>", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_moneyactual >", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyactual >=", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualLessThan(String value) {
            addCriterion("zomore_cashier_performance_moneyactual <", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneyactual <=", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualLike(String value) {
            addCriterion("zomore_cashier_performance_moneyactual like", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualNotLike(String value) {
            addCriterion("zomore_cashier_performance_moneyactual not like", value, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneyactual in", values, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneyactual not in", values, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneyactual between", value1, value2, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneyactualNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneyactual not between", value1, value2, "zomoreCashierPerformanceMoneyactual");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveIsNull() {
            addCriterion("zomore_cashier_performance_moneysave is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveIsNotNull() {
            addCriterion("zomore_cashier_performance_moneysave is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneysave =", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneysave <>", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_moneysave >", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneysave >=", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveLessThan(String value) {
            addCriterion("zomore_cashier_performance_moneysave <", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_moneysave <=", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveLike(String value) {
            addCriterion("zomore_cashier_performance_moneysave like", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveNotLike(String value) {
            addCriterion("zomore_cashier_performance_moneysave not like", value, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneysave in", values, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_moneysave not in", values, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneysave between", value1, value2, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceMoneysaveNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_moneysave not between", value1, value2, "zomoreCashierPerformanceMoneysave");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeIsNull() {
            addCriterion("zomore_cashier_performance_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeIsNotNull() {
            addCriterion("zomore_cashier_performance_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeEqualTo(String value) {
            addCriterion("zomore_cashier_performance_type =", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeNotEqualTo(String value) {
            addCriterion("zomore_cashier_performance_type <>", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeGreaterThan(String value) {
            addCriterion("zomore_cashier_performance_type >", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_type >=", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeLessThan(String value) {
            addCriterion("zomore_cashier_performance_type <", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_performance_type <=", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeLike(String value) {
            addCriterion("zomore_cashier_performance_type like", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeNotLike(String value) {
            addCriterion("zomore_cashier_performance_type not like", value, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeIn(List<String> values) {
            addCriterion("zomore_cashier_performance_type in", values, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeNotIn(List<String> values) {
            addCriterion("zomore_cashier_performance_type not in", values, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_type between", value1, value2, "zomoreCashierPerformanceType");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierPerformanceTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_performance_type not between", value1, value2, "zomoreCashierPerformanceType");
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