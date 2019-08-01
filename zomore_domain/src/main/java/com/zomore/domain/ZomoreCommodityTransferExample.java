package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityTransferExample() {
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

        public Criteria andZomoreCommodityTransferIdIsNull() {
            addCriterion("zomore_commodity_transfer_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdIsNotNull() {
            addCriterion("zomore_commodity_transfer_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_id =", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_id <>", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_id >", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_id >=", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdLessThan(String value) {
            addCriterion("zomore_commodity_transfer_id <", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_id <=", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdLike(String value) {
            addCriterion("zomore_commodity_transfer_id like", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdNotLike(String value) {
            addCriterion("zomore_commodity_transfer_id not like", value, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_id in", values, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_id not in", values, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_id between", value1, value2, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_id not between", value1, value2, "zomoreCommodityTransferId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumIsNull() {
            addCriterion("zomore_commodity_transfer_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumIsNotNull() {
            addCriterion("zomore_commodity_transfer_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_num =", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_num <>", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_num >", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_num >=", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumLessThan(String value) {
            addCriterion("zomore_commodity_transfer_num <", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_num <=", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumLike(String value) {
            addCriterion("zomore_commodity_transfer_num like", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumNotLike(String value) {
            addCriterion("zomore_commodity_transfer_num not like", value, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_num in", values, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_num not in", values, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_num between", value1, value2, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferNumNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_num not between", value1, value2, "zomoreCommodityTransferNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeIsNull() {
            addCriterion("zomore_commodity_transfer_size is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeIsNotNull() {
            addCriterion("zomore_commodity_transfer_size is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_size =", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_size <>", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_size >", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_size >=", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeLessThan(String value) {
            addCriterion("zomore_commodity_transfer_size <", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_size <=", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeLike(String value) {
            addCriterion("zomore_commodity_transfer_size like", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeNotLike(String value) {
            addCriterion("zomore_commodity_transfer_size not like", value, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_size in", values, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_size not in", values, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_size between", value1, value2, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferSizeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_size not between", value1, value2, "zomoreCommodityTransferSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreIsNull() {
            addCriterion("zomore_commodity_transfer_instore is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreIsNotNull() {
            addCriterion("zomore_commodity_transfer_instore is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_instore =", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_instore <>", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_instore >", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_instore >=", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreLessThan(String value) {
            addCriterion("zomore_commodity_transfer_instore <", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_instore <=", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreLike(String value) {
            addCriterion("zomore_commodity_transfer_instore like", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreNotLike(String value) {
            addCriterion("zomore_commodity_transfer_instore not like", value, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_instore in", values, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_instore not in", values, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_instore between", value1, value2, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferInstoreNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_instore not between", value1, value2, "zomoreCommodityTransferInstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreIsNull() {
            addCriterion("zomore_commodity_transfer_outstore is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreIsNotNull() {
            addCriterion("zomore_commodity_transfer_outstore is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_outstore =", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_outstore <>", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_outstore >", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_outstore >=", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreLessThan(String value) {
            addCriterion("zomore_commodity_transfer_outstore <", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_outstore <=", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreLike(String value) {
            addCriterion("zomore_commodity_transfer_outstore like", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreNotLike(String value) {
            addCriterion("zomore_commodity_transfer_outstore not like", value, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_outstore in", values, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_outstore not in", values, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_outstore between", value1, value2, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferOutstoreNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_outstore not between", value1, value2, "zomoreCommodityTransferOutstore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoIsNull() {
            addCriterion("zomore_commodity_transfer_meno is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoIsNotNull() {
            addCriterion("zomore_commodity_transfer_meno is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_meno =", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_meno <>", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_meno >", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_meno >=", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoLessThan(String value) {
            addCriterion("zomore_commodity_transfer_meno <", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_meno <=", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoLike(String value) {
            addCriterion("zomore_commodity_transfer_meno like", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoNotLike(String value) {
            addCriterion("zomore_commodity_transfer_meno not like", value, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_meno in", values, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_meno not in", values, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_meno between", value1, value2, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferMenoNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_meno not between", value1, value2, "zomoreCommodityTransferMeno");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeIsNull() {
            addCriterion("zomore_commodity_transfer_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeIsNotNull() {
            addCriterion("zomore_commodity_transfer_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_time =", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeNotEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_time <>", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeGreaterThan(String value) {
            addCriterion("zomore_commodity_transfer_time >", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_time >=", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeLessThan(String value) {
            addCriterion("zomore_commodity_transfer_time <", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_transfer_time <=", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeLike(String value) {
            addCriterion("zomore_commodity_transfer_time like", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeNotLike(String value) {
            addCriterion("zomore_commodity_transfer_time not like", value, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_time in", values, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeNotIn(List<String> values) {
            addCriterion("zomore_commodity_transfer_time not in", values, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_time between", value1, value2, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferTimeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_transfer_time not between", value1, value2, "zomoreCommodityTransferTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeIsNull() {
            addCriterion("zomore_commodity_transfer_datetime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeIsNotNull() {
            addCriterion("zomore_commodity_transfer_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeEqualTo(Date value) {
            addCriterion("zomore_commodity_transfer_datetime =", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_transfer_datetime <>", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_transfer_datetime >", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_transfer_datetime >=", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeLessThan(Date value) {
            addCriterion("zomore_commodity_transfer_datetime <", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_transfer_datetime <=", value, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeIn(List<Date> values) {
            addCriterion("zomore_commodity_transfer_datetime in", values, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_transfer_datetime not in", values, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_transfer_datetime between", value1, value2, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTransferDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_transfer_datetime not between", value1, value2, "zomoreCommodityTransferDatetime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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