package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityWholesaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityWholesaleExample() {
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

        public Criteria andZomoreCommodityWholesaleIdIsNull() {
            addCriterion("zomore_commodity_wholesale_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdIsNotNull() {
            addCriterion("zomore_commodity_wholesale_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_id =", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_id <>", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_id >", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_id >=", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_id <", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_id <=", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdLike(String value) {
            addCriterion("zomore_commodity_wholesale_id like", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_id not like", value, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_id in", values, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_id not in", values, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_id between", value1, value2, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_id not between", value1, value2, "zomoreCommodityWholesaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleIsNull() {
            addCriterion("zomore_commodity_wholesale_connectpeople is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleIsNotNull() {
            addCriterion("zomore_commodity_wholesale_connectpeople is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople =", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople <>", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople >", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople >=", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople <", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople <=", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleLike(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople like", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_connectpeople not like", value, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_connectpeople in", values, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_connectpeople not in", values, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_connectpeople between", value1, value2, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleConnectpeopleNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_connectpeople not between", value1, value2, "zomoreCommodityWholesaleConnectpeople");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumIsNull() {
            addCriterion("zomore_commodity_wholesale_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumIsNotNull() {
            addCriterion("zomore_commodity_wholesale_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_num =", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_num <>", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_num >", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_num >=", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_num <", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_num <=", value, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_num in", values, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_num not in", values, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_num between", value1, value2, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_num not between", value1, value2, "zomoreCommodityWholesaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumIsNull() {
            addCriterion("zomore_commodity_wholesale_givenum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumIsNotNull() {
            addCriterion("zomore_commodity_wholesale_givenum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum =", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum <>", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum >", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum >=", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum <", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_givenum <=", value, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_givenum in", values, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_givenum not in", values, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_givenum between", value1, value2, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleGivenumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_givenum not between", value1, value2, "zomoreCommodityWholesaleGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceIsNull() {
            addCriterion("zomore_commodity_wholesale_privice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceIsNotNull() {
            addCriterion("zomore_commodity_wholesale_privice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_privice =", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceNotEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_privice <>", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceGreaterThan(Double value) {
            addCriterion("zomore_commodity_wholesale_privice >", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_privice >=", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceLessThan(Double value) {
            addCriterion("zomore_commodity_wholesale_privice <", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceLessThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_privice <=", value, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_privice in", values, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceNotIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_privice not in", values, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_privice between", value1, value2, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePriviceNotBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_privice not between", value1, value2, "zomoreCommodityWholesalePrivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceIsNull() {
            addCriterion("zomore_commodity_wholesale_allprivice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceIsNotNull() {
            addCriterion("zomore_commodity_wholesale_allprivice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice =", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceNotEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice <>", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceGreaterThan(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice >", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice >=", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceLessThan(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice <", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceLessThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_allprivice <=", value, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_allprivice in", values, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceNotIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_allprivice not in", values, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_allprivice between", value1, value2, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAllpriviceNotBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_allprivice not between", value1, value2, "zomoreCommodityWholesaleAllprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1IsNull() {
            addCriterion("zomore_commodity_wholesale_people1 is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1IsNotNull() {
            addCriterion("zomore_commodity_wholesale_people1 is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1EqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people1 =", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1NotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people1 <>", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1GreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_people1 >", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1GreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people1 >=", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1LessThan(String value) {
            addCriterion("zomore_commodity_wholesale_people1 <", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1LessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people1 <=", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1Like(String value) {
            addCriterion("zomore_commodity_wholesale_people1 like", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1NotLike(String value) {
            addCriterion("zomore_commodity_wholesale_people1 not like", value, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1In(List<String> values) {
            addCriterion("zomore_commodity_wholesale_people1 in", values, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1NotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_people1 not in", values, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1Between(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_people1 between", value1, value2, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople1NotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_people1 not between", value1, value2, "zomoreCommodityWholesalePeople1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2IsNull() {
            addCriterion("zomore_commodity_wholesale_people2 is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2IsNotNull() {
            addCriterion("zomore_commodity_wholesale_people2 is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2EqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people2 =", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2NotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people2 <>", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2GreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_people2 >", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2GreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people2 >=", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2LessThan(String value) {
            addCriterion("zomore_commodity_wholesale_people2 <", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2LessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_people2 <=", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2Like(String value) {
            addCriterion("zomore_commodity_wholesale_people2 like", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2NotLike(String value) {
            addCriterion("zomore_commodity_wholesale_people2 not like", value, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2In(List<String> values) {
            addCriterion("zomore_commodity_wholesale_people2 in", values, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2NotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_people2 not in", values, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2Between(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_people2 between", value1, value2, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePeople2NotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_people2 not between", value1, value2, "zomoreCommodityWholesalePeople2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerIsNull() {
            addCriterion("zomore_commodity_wholesale_customer is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerIsNotNull() {
            addCriterion("zomore_commodity_wholesale_customer is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_customer =", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_customer <>", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_customer >", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_customer >=", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_customer <", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_customer <=", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerLike(String value) {
            addCriterion("zomore_commodity_wholesale_customer like", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_customer not like", value, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_customer in", values, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_customer not in", values, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_customer between", value1, value2, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCustomerNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_customer not between", value1, value2, "zomoreCommodityWholesaleCustomer");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneIsNull() {
            addCriterion("zomore_commodity_wholesale_phone is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneIsNotNull() {
            addCriterion("zomore_commodity_wholesale_phone is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_phone =", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_phone <>", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_phone >", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_phone >=", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_phone <", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_phone <=", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneLike(String value) {
            addCriterion("zomore_commodity_wholesale_phone like", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_phone not like", value, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_phone in", values, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_phone not in", values, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_phone between", value1, value2, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesalePhoneNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_phone not between", value1, value2, "zomoreCommodityWholesalePhone");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeIsNull() {
            addCriterion("zomore_commodity_wholesale_datetime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeIsNotNull() {
            addCriterion("zomore_commodity_wholesale_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeEqualTo(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime =", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime <>", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime >", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime >=", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeLessThan(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime <", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_wholesale_datetime <=", value, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeIn(List<Date> values) {
            addCriterion("zomore_commodity_wholesale_datetime in", values, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_wholesale_datetime not in", values, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_wholesale_datetime between", value1, value2, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_wholesale_datetime not between", value1, value2, "zomoreCommodityWholesaleDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressIsNull() {
            addCriterion("zomore_commodity_wholesale_address is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressIsNotNull() {
            addCriterion("zomore_commodity_wholesale_address is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_address =", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_address <>", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_address >", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_address >=", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_address <", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_address <=", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressLike(String value) {
            addCriterion("zomore_commodity_wholesale_address like", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_address not like", value, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_address in", values, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_address not in", values, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_address between", value1, value2, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleAddressNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_address not between", value1, value2, "zomoreCommodityWholesaleAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_state is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_state is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state =", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state <>", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state >", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state >=", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state <", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_state <=", value, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_state in", values, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_state not in", values, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_state between", value1, value2, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_state not between", value1, value2, "zomoreCommodityWholesaleCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type =", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type <>", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type >", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type >=", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type <", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_type <=", value, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_type in", values, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_type not in", values, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_type between", value1, value2, "zomoreCommodityWholesaleCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_type not between", value1, value2, "zomoreCommodityWholesaleCommodityType");
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