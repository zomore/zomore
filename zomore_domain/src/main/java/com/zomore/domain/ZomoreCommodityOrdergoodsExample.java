package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityOrdergoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityOrdergoodsExample() {
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

        public Criteria andZomoreCommodityOrdergoodsIdIsNull() {
            addCriterion("zomore_commodity_ordergoods_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_id =", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_id <>", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_id >", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_id >=", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_id <", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_id <=", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdLike(String value) {
            addCriterion("zomore_commodity_ordergoods_id like", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_id not like", value, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_id in", values, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_id not in", values, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_id between", value1, value2, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_id not between", value1, value2, "zomoreCommodityOrdergoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameIsNull() {
            addCriterion("zomore_commodity_ordergoods_outname is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_outname is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_outname =", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_outname <>", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_outname >", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_outname >=", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_outname <", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_outname <=", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameLike(String value) {
            addCriterion("zomore_commodity_ordergoods_outname like", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_outname not like", value, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_outname in", values, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_outname not in", values, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_outname between", value1, value2, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsOutnameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_outname not between", value1, value2, "zomoreCommodityOrdergoodsOutname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeIsNull() {
            addCriterion("zomore_commodity_ordergoods_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_time =", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_time <>", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_ordergoods_time >", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_time >=", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeLessThan(Date value) {
            addCriterion("zomore_commodity_ordergoods_time <", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_time <=", value, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_ordergoods_time in", values, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_ordergoods_time not in", values, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_ordergoods_time between", value1, value2, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_ordergoods_time not between", value1, value2, "zomoreCommodityOrdergoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameIsNull() {
            addCriterion("zomore_commodity_ordergoods_inname is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_inname is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_inname =", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_inname <>", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_inname >", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_inname >=", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_inname <", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_inname <=", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameLike(String value) {
            addCriterion("zomore_commodity_ordergoods_inname like", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_inname not like", value, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_inname in", values, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_inname not in", values, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_inname between", value1, value2, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsInnameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_inname not between", value1, value2, "zomoreCommodityOrdergoodsInname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameIsNull() {
            addCriterion("zomore_commodity_ordergoods_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_name =", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_name <>", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_name >", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_name >=", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_name <", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_name <=", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameLike(String value) {
            addCriterion("zomore_commodity_ordergoods_name like", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_name not like", value, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_name in", values, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_name not in", values, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_name between", value1, value2, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_name not between", value1, value2, "zomoreCommodityOrdergoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumIsNull() {
            addCriterion("zomore_commodity_ordergoods_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_num =", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_num <>", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_num >", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_num >=", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_num <", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_num <=", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumLike(String value) {
            addCriterion("zomore_commodity_ordergoods_num like", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_num not like", value, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_num in", values, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_num not in", values, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_num between", value1, value2, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsNumNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_num not between", value1, value2, "zomoreCommodityOrdergoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeIsNull() {
            addCriterion("zomore_commodity_ordergoods_expecttime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_expecttime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime =", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime <>", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime >", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime >=", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeLessThan(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime <", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_ordergoods_expecttime <=", value, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeIn(List<Date> values) {
            addCriterion("zomore_commodity_ordergoods_expecttime in", values, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_ordergoods_expecttime not in", values, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_ordergoods_expecttime between", value1, value2, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsExpecttimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_ordergoods_expecttime not between", value1, value2, "zomoreCommodityOrdergoodsExpecttime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyIsNull() {
            addCriterion("zomore_commodity_ordergoods_money is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_money is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_money =", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyNotEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_money <>", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyGreaterThan(String value) {
            addCriterion("zomore_commodity_ordergoods_money >", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_money >=", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyLessThan(String value) {
            addCriterion("zomore_commodity_ordergoods_money <", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_ordergoods_money <=", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyLike(String value) {
            addCriterion("zomore_commodity_ordergoods_money like", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyNotLike(String value) {
            addCriterion("zomore_commodity_ordergoods_money not like", value, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_money in", values, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyNotIn(List<String> values) {
            addCriterion("zomore_commodity_ordergoods_money not in", values, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_money between", value1, value2, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsMoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_ordergoods_money not between", value1, value2, "zomoreCommodityOrdergoodsMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateIsNull() {
            addCriterion("zomore_commodity_ordergoods_state is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_state is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state =", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state <>", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateGreaterThan(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state >", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state >=", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateLessThan(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state <", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_state <=", value, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateIn(List<Integer> values) {
            addCriterion("zomore_commodity_ordergoods_state in", values, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_ordergoods_state not in", values, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_ordergoods_state between", value1, value2, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_ordergoods_state not between", value1, value2, "zomoreCommodityOrdergoodsState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumIsNull() {
            addCriterion("zomore_commodity_ordergoods_printingnum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumIsNotNull() {
            addCriterion("zomore_commodity_ordergoods_printingnum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum =", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum <>", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum >", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum >=", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumLessThan(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum <", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_ordergoods_printingnum <=", value, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumIn(List<Integer> values) {
            addCriterion("zomore_commodity_ordergoods_printingnum in", values, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_ordergoods_printingnum not in", values, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_ordergoods_printingnum between", value1, value2, "zomoreCommodityOrdergoodsPrintingnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOrdergoodsPrintingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_ordergoods_printingnum not between", value1, value2, "zomoreCommodityOrdergoodsPrintingnum");
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