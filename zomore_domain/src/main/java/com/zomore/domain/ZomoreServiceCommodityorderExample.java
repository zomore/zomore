package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreServiceCommodityorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreServiceCommodityorderExample() {
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

        public Criteria andZomoreCommoditySaleIdIsNull() {
            addCriterion("zomore_commodity_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdIsNotNull() {
            addCriterion("zomore_commodity_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdEqualTo(String value) {
            addCriterion("zomore_commodity_sale_id =", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_id <>", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_id >", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_id >=", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdLessThan(String value) {
            addCriterion("zomore_commodity_sale_id <", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_id <=", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdLike(String value) {
            addCriterion("zomore_commodity_sale_id like", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdNotLike(String value) {
            addCriterion("zomore_commodity_sale_id not like", value, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdIn(List<String> values) {
            addCriterion("zomore_commodity_sale_id in", values, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_id not in", values, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_id between", value1, value2, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_id not between", value1, value2, "zomoreCommoditySaleId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeIsNull() {
            addCriterion("zomore_commodity_sale_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeIsNotNull() {
            addCriterion("zomore_commodity_sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_sale_time =", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_sale_time <>", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_sale_time >", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_sale_time >=", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeLessThan(Date value) {
            addCriterion("zomore_commodity_sale_time <", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_sale_time <=", value, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_sale_time in", values, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_sale_time not in", values, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_sale_time between", value1, value2, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_sale_time not between", value1, value2, "zomoreCommoditySaleTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeIsNull() {
            addCriterion("zomore_commodity_sale_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeIsNotNull() {
            addCriterion("zomore_commodity_sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeEqualTo(String value) {
            addCriterion("zomore_commodity_sale_type =", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_type <>", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_type >", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_type >=", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeLessThan(String value) {
            addCriterion("zomore_commodity_sale_type <", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_type <=", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeLike(String value) {
            addCriterion("zomore_commodity_sale_type like", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeNotLike(String value) {
            addCriterion("zomore_commodity_sale_type not like", value, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeIn(List<String> values) {
            addCriterion("zomore_commodity_sale_type in", values, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_type not in", values, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_type between", value1, value2, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_type not between", value1, value2, "zomoreCommoditySaleType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameIsNull() {
            addCriterion("zomore_commodity_sale_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameIsNotNull() {
            addCriterion("zomore_commodity_sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameEqualTo(String value) {
            addCriterion("zomore_commodity_sale_name =", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_name <>", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_name >", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_name >=", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameLessThan(String value) {
            addCriterion("zomore_commodity_sale_name <", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_name <=", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameLike(String value) {
            addCriterion("zomore_commodity_sale_name like", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameNotLike(String value) {
            addCriterion("zomore_commodity_sale_name not like", value, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameIn(List<String> values) {
            addCriterion("zomore_commodity_sale_name in", values, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_name not in", values, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_name between", value1, value2, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_name not between", value1, value2, "zomoreCommoditySaleName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberIsNull() {
            addCriterion("zomore_commodity_sale_member is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberIsNotNull() {
            addCriterion("zomore_commodity_sale_member is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberEqualTo(String value) {
            addCriterion("zomore_commodity_sale_member =", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_member <>", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_member >", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_member >=", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberLessThan(String value) {
            addCriterion("zomore_commodity_sale_member <", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_member <=", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberLike(String value) {
            addCriterion("zomore_commodity_sale_member like", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberNotLike(String value) {
            addCriterion("zomore_commodity_sale_member not like", value, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberIn(List<String> values) {
            addCriterion("zomore_commodity_sale_member in", values, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_member not in", values, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_member between", value1, value2, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMemberNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_member not between", value1, value2, "zomoreCommoditySaleMember");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumIsNull() {
            addCriterion("zomore_commodity_sale_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumIsNotNull() {
            addCriterion("zomore_commodity_sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_num =", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_num <>", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_sale_num >", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_num >=", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumLessThan(Integer value) {
            addCriterion("zomore_commodity_sale_num <", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_num <=", value, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_sale_num in", values, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_sale_num not in", values, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_sale_num between", value1, value2, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_sale_num not between", value1, value2, "zomoreCommoditySaleNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyIsNull() {
            addCriterion("zomore_commodity_sale_money is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyIsNotNull() {
            addCriterion("zomore_commodity_sale_money is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyEqualTo(String value) {
            addCriterion("zomore_commodity_sale_money =", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_money <>", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_money >", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_money >=", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyLessThan(String value) {
            addCriterion("zomore_commodity_sale_money <", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_money <=", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyLike(String value) {
            addCriterion("zomore_commodity_sale_money like", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyNotLike(String value) {
            addCriterion("zomore_commodity_sale_money not like", value, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyIn(List<String> values) {
            addCriterion("zomore_commodity_sale_money in", values, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_money not in", values, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_money between", value1, value2, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleMoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_money not between", value1, value2, "zomoreCommoditySaleMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyIsNull() {
            addCriterion("zomore_commodity_sale_inmoney is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyIsNotNull() {
            addCriterion("zomore_commodity_sale_inmoney is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyEqualTo(String value) {
            addCriterion("zomore_commodity_sale_inmoney =", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_inmoney <>", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_inmoney >", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_inmoney >=", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyLessThan(String value) {
            addCriterion("zomore_commodity_sale_inmoney <", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_inmoney <=", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyLike(String value) {
            addCriterion("zomore_commodity_sale_inmoney like", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyNotLike(String value) {
            addCriterion("zomore_commodity_sale_inmoney not like", value, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyIn(List<String> values) {
            addCriterion("zomore_commodity_sale_inmoney in", values, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_inmoney not in", values, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_inmoney between", value1, value2, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleInmoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_inmoney not between", value1, value2, "zomoreCommoditySaleInmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyIsNull() {
            addCriterion("zomore_commodity_sale_letmoney is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyIsNotNull() {
            addCriterion("zomore_commodity_sale_letmoney is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyEqualTo(String value) {
            addCriterion("zomore_commodity_sale_letmoney =", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_letmoney <>", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_letmoney >", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_letmoney >=", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyLessThan(String value) {
            addCriterion("zomore_commodity_sale_letmoney <", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_letmoney <=", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyLike(String value) {
            addCriterion("zomore_commodity_sale_letmoney like", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyNotLike(String value) {
            addCriterion("zomore_commodity_sale_letmoney not like", value, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyIn(List<String> values) {
            addCriterion("zomore_commodity_sale_letmoney in", values, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_letmoney not in", values, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_letmoney between", value1, value2, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleLetmoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_letmoney not between", value1, value2, "zomoreCommoditySaleLetmoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyIsNull() {
            addCriterion("zomore_commodity_sale_savemoney is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyIsNotNull() {
            addCriterion("zomore_commodity_sale_savemoney is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyEqualTo(String value) {
            addCriterion("zomore_commodity_sale_savemoney =", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_savemoney <>", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_savemoney >", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_savemoney >=", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyLessThan(String value) {
            addCriterion("zomore_commodity_sale_savemoney <", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_savemoney <=", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyLike(String value) {
            addCriterion("zomore_commodity_sale_savemoney like", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyNotLike(String value) {
            addCriterion("zomore_commodity_sale_savemoney not like", value, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyIn(List<String> values) {
            addCriterion("zomore_commodity_sale_savemoney in", values, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_savemoney not in", values, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_savemoney between", value1, value2, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleSavemoneyNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_savemoney not between", value1, value2, "zomoreCommoditySaleSavemoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideIsNull() {
            addCriterion("zomore_commodity_sale_guide is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideIsNotNull() {
            addCriterion("zomore_commodity_sale_guide is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideEqualTo(String value) {
            addCriterion("zomore_commodity_sale_guide =", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideNotEqualTo(String value) {
            addCriterion("zomore_commodity_sale_guide <>", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideGreaterThan(String value) {
            addCriterion("zomore_commodity_sale_guide >", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_guide >=", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideLessThan(String value) {
            addCriterion("zomore_commodity_sale_guide <", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_sale_guide <=", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideLike(String value) {
            addCriterion("zomore_commodity_sale_guide like", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideNotLike(String value) {
            addCriterion("zomore_commodity_sale_guide not like", value, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideIn(List<String> values) {
            addCriterion("zomore_commodity_sale_guide in", values, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideNotIn(List<String> values) {
            addCriterion("zomore_commodity_sale_guide not in", values, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_guide between", value1, value2, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleGuideNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_sale_guide not between", value1, value2, "zomoreCommoditySaleGuide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopIsNull() {
            addCriterion("zomore_commodity_shop is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopIsNotNull() {
            addCriterion("zomore_commodity_shop is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopEqualTo(String value) {
            addCriterion("zomore_commodity_shop =", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopNotEqualTo(String value) {
            addCriterion("zomore_commodity_shop <>", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopGreaterThan(String value) {
            addCriterion("zomore_commodity_shop >", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shop >=", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopLessThan(String value) {
            addCriterion("zomore_commodity_shop <", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shop <=", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopLike(String value) {
            addCriterion("zomore_commodity_shop like", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopNotLike(String value) {
            addCriterion("zomore_commodity_shop not like", value, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopIn(List<String> values) {
            addCriterion("zomore_commodity_shop in", values, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopNotIn(List<String> values) {
            addCriterion("zomore_commodity_shop not in", values, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shop between", value1, value2, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shop not between", value1, value2, "zomoreCommodityShop");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateIsNull() {
            addCriterion("zomore_commodity_state is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateIsNotNull() {
            addCriterion("zomore_commodity_state is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateEqualTo(Integer value) {
            addCriterion("zomore_commodity_state =", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_state <>", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateGreaterThan(Integer value) {
            addCriterion("zomore_commodity_state >", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_state >=", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateLessThan(Integer value) {
            addCriterion("zomore_commodity_state <", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_state <=", value, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateIn(List<Integer> values) {
            addCriterion("zomore_commodity_state in", values, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_state not in", values, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_state between", value1, value2, "zomoreCommodityState");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_state not between", value1, value2, "zomoreCommodityState");
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