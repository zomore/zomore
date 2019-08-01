package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TurnoverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TurnoverExample() {
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

        public Criteria andTurnoveridIsNull() {
            addCriterion("turnoverId is null");
            return (Criteria) this;
        }

        public Criteria andTurnoveridIsNotNull() {
            addCriterion("turnoverId is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoveridEqualTo(Long value) {
            addCriterion("turnoverId =", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridNotEqualTo(Long value) {
            addCriterion("turnoverId <>", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridGreaterThan(Long value) {
            addCriterion("turnoverId >", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridGreaterThanOrEqualTo(Long value) {
            addCriterion("turnoverId >=", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridLessThan(Long value) {
            addCriterion("turnoverId <", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridLessThanOrEqualTo(Long value) {
            addCriterion("turnoverId <=", value, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridIn(List<Long> values) {
            addCriterion("turnoverId in", values, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridNotIn(List<Long> values) {
            addCriterion("turnoverId not in", values, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridBetween(Long value1, Long value2) {
            addCriterion("turnoverId between", value1, value2, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andTurnoveridNotBetween(Long value1, Long value2) {
            addCriterion("turnoverId not between", value1, value2, "turnoverid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNull() {
            addCriterion("dueTime is null");
            return (Criteria) this;
        }

        public Criteria andDuetimeIsNotNull() {
            addCriterion("dueTime is not null");
            return (Criteria) this;
        }

        public Criteria andDuetimeEqualTo(Date value) {
            addCriterion("dueTime =", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotEqualTo(Date value) {
            addCriterion("dueTime <>", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThan(Date value) {
            addCriterion("dueTime >", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dueTime >=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThan(Date value) {
            addCriterion("dueTime <", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeLessThanOrEqualTo(Date value) {
            addCriterion("dueTime <=", value, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeIn(List<Date> values) {
            addCriterion("dueTime in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotIn(List<Date> values) {
            addCriterion("dueTime not in", values, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeBetween(Date value1, Date value2) {
            addCriterion("dueTime between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andDuetimeNotBetween(Date value1, Date value2) {
            addCriterion("dueTime not between", value1, value2, "duetime");
            return (Criteria) this;
        }

        public Criteria andCashierIsNull() {
            addCriterion("cashier is null");
            return (Criteria) this;
        }

        public Criteria andCashierIsNotNull() {
            addCriterion("cashier is not null");
            return (Criteria) this;
        }

        public Criteria andCashierEqualTo(String value) {
            addCriterion("cashier =", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotEqualTo(String value) {
            addCriterion("cashier <>", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThan(String value) {
            addCriterion("cashier >", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThanOrEqualTo(String value) {
            addCriterion("cashier >=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThan(String value) {
            addCriterion("cashier <", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThanOrEqualTo(String value) {
            addCriterion("cashier <=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLike(String value) {
            addCriterion("cashier like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotLike(String value) {
            addCriterion("cashier not like", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierIn(List<String> values) {
            addCriterion("cashier in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotIn(List<String> values) {
            addCriterion("cashier not in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierBetween(String value1, String value2) {
            addCriterion("cashier between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotBetween(String value1, String value2) {
            addCriterion("cashier not between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalmoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(String value) {
            addCriterion("totalmoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(String value) {
            addCriterion("totalmoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(String value) {
            addCriterion("totalmoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("totalmoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(String value) {
            addCriterion("totalmoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(String value) {
            addCriterion("totalmoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLike(String value) {
            addCriterion("totalmoney like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotLike(String value) {
            addCriterion("totalmoney not like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<String> values) {
            addCriterion("totalmoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<String> values) {
            addCriterion("totalmoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(String value1, String value2) {
            addCriterion("totalmoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(String value1, String value2) {
            addCriterion("totalmoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(String value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(String value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(String value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(String value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(String value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(String value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLike(String value) {
            addCriterion("cash like", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotLike(String value) {
            addCriterion("cash not like", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<String> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<String> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(String value1, String value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(String value1, String value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNull() {
            addCriterion("unionpay is null");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNotNull() {
            addCriterion("unionpay is not null");
            return (Criteria) this;
        }

        public Criteria andUnionpayEqualTo(String value) {
            addCriterion("unionpay =", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotEqualTo(String value) {
            addCriterion("unionpay <>", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThan(String value) {
            addCriterion("unionpay >", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThanOrEqualTo(String value) {
            addCriterion("unionpay >=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThan(String value) {
            addCriterion("unionpay <", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThanOrEqualTo(String value) {
            addCriterion("unionpay <=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLike(String value) {
            addCriterion("unionpay like", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotLike(String value) {
            addCriterion("unionpay not like", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayIn(List<String> values) {
            addCriterion("unionpay in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotIn(List<String> values) {
            addCriterion("unionpay not in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayBetween(String value1, String value2) {
            addCriterion("unionpay between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotBetween(String value1, String value2) {
            addCriterion("unionpay not between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andStoragecardIsNull() {
            addCriterion("storagecard is null");
            return (Criteria) this;
        }

        public Criteria andStoragecardIsNotNull() {
            addCriterion("storagecard is not null");
            return (Criteria) this;
        }

        public Criteria andStoragecardEqualTo(String value) {
            addCriterion("storagecard =", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardNotEqualTo(String value) {
            addCriterion("storagecard <>", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardGreaterThan(String value) {
            addCriterion("storagecard >", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardGreaterThanOrEqualTo(String value) {
            addCriterion("storagecard >=", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardLessThan(String value) {
            addCriterion("storagecard <", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardLessThanOrEqualTo(String value) {
            addCriterion("storagecard <=", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardLike(String value) {
            addCriterion("storagecard like", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardNotLike(String value) {
            addCriterion("storagecard not like", value, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardIn(List<String> values) {
            addCriterion("storagecard in", values, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardNotIn(List<String> values) {
            addCriterion("storagecard not in", values, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardBetween(String value1, String value2) {
            addCriterion("storagecard between", value1, value2, "storagecard");
            return (Criteria) this;
        }

        public Criteria andStoragecardNotBetween(String value1, String value2) {
            addCriterion("storagecard not between", value1, value2, "storagecard");
            return (Criteria) this;
        }

        public Criteria andSubcardIsNull() {
            addCriterion("subcard is null");
            return (Criteria) this;
        }

        public Criteria andSubcardIsNotNull() {
            addCriterion("subcard is not null");
            return (Criteria) this;
        }

        public Criteria andSubcardEqualTo(String value) {
            addCriterion("subcard =", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardNotEqualTo(String value) {
            addCriterion("subcard <>", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardGreaterThan(String value) {
            addCriterion("subcard >", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardGreaterThanOrEqualTo(String value) {
            addCriterion("subcard >=", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardLessThan(String value) {
            addCriterion("subcard <", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardLessThanOrEqualTo(String value) {
            addCriterion("subcard <=", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardLike(String value) {
            addCriterion("subcard like", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardNotLike(String value) {
            addCriterion("subcard not like", value, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardIn(List<String> values) {
            addCriterion("subcard in", values, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardNotIn(List<String> values) {
            addCriterion("subcard not in", values, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardBetween(String value1, String value2) {
            addCriterion("subcard between", value1, value2, "subcard");
            return (Criteria) this;
        }

        public Criteria andSubcardNotBetween(String value1, String value2) {
            addCriterion("subcard not between", value1, value2, "subcard");
            return (Criteria) this;
        }

        public Criteria andReadycashIsNull() {
            addCriterion("readycash is null");
            return (Criteria) this;
        }

        public Criteria andReadycashIsNotNull() {
            addCriterion("readycash is not null");
            return (Criteria) this;
        }

        public Criteria andReadycashEqualTo(String value) {
            addCriterion("readycash =", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashNotEqualTo(String value) {
            addCriterion("readycash <>", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashGreaterThan(String value) {
            addCriterion("readycash >", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashGreaterThanOrEqualTo(String value) {
            addCriterion("readycash >=", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashLessThan(String value) {
            addCriterion("readycash <", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashLessThanOrEqualTo(String value) {
            addCriterion("readycash <=", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashLike(String value) {
            addCriterion("readycash like", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashNotLike(String value) {
            addCriterion("readycash not like", value, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashIn(List<String> values) {
            addCriterion("readycash in", values, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashNotIn(List<String> values) {
            addCriterion("readycash not in", values, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashBetween(String value1, String value2) {
            addCriterion("readycash between", value1, value2, "readycash");
            return (Criteria) this;
        }

        public Criteria andReadycashNotBetween(String value1, String value2) {
            addCriterion("readycash not between", value1, value2, "readycash");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNull() {
            addCriterion("paidamount is null");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNotNull() {
            addCriterion("paidamount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidamountEqualTo(String value) {
            addCriterion("paidamount =", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotEqualTo(String value) {
            addCriterion("paidamount <>", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThan(String value) {
            addCriterion("paidamount >", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThanOrEqualTo(String value) {
            addCriterion("paidamount >=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThan(String value) {
            addCriterion("paidamount <", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThanOrEqualTo(String value) {
            addCriterion("paidamount <=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLike(String value) {
            addCriterion("paidamount like", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotLike(String value) {
            addCriterion("paidamount not like", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIn(List<String> values) {
            addCriterion("paidamount in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotIn(List<String> values) {
            addCriterion("paidamount not in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountBetween(String value1, String value2) {
            addCriterion("paidamount between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotBetween(String value1, String value2) {
            addCriterion("paidamount not between", value1, value2, "paidamount");
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