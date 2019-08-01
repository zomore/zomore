package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityExample() {
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

        public Criteria andZomoreCommodityIdIsNull() {
            addCriterion("zomore_commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdIsNotNull() {
            addCriterion("zomore_commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdEqualTo(String value) {
            addCriterion("zomore_commodity_id =", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_id <>", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdGreaterThan(String value) {
            addCriterion("zomore_commodity_id >", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_id >=", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdLessThan(String value) {
            addCriterion("zomore_commodity_id <", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_id <=", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdLike(String value) {
            addCriterion("zomore_commodity_id like", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdNotLike(String value) {
            addCriterion("zomore_commodity_id not like", value, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdIn(List<String> values) {
            addCriterion("zomore_commodity_id in", values, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_id not in", values, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_id between", value1, value2, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_id not between", value1, value2, "zomoreCommodityId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameIsNull() {
            addCriterion("zomore_commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameIsNotNull() {
            addCriterion("zomore_commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameEqualTo(String value) {
            addCriterion("zomore_commodity_name =", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_name <>", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameGreaterThan(String value) {
            addCriterion("zomore_commodity_name >", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_name >=", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameLessThan(String value) {
            addCriterion("zomore_commodity_name <", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_name <=", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameLike(String value) {
            addCriterion("zomore_commodity_name like", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameNotLike(String value) {
            addCriterion("zomore_commodity_name not like", value, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameIn(List<String> values) {
            addCriterion("zomore_commodity_name in", values, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_name not in", values, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_name between", value1, value2, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_name not between", value1, value2, "zomoreCommodityName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageIsNull() {
            addCriterion("zomore_commodity_image is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageIsNotNull() {
            addCriterion("zomore_commodity_image is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageEqualTo(String value) {
            addCriterion("zomore_commodity_image =", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageNotEqualTo(String value) {
            addCriterion("zomore_commodity_image <>", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageGreaterThan(String value) {
            addCriterion("zomore_commodity_image >", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_image >=", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageLessThan(String value) {
            addCriterion("zomore_commodity_image <", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_image <=", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageLike(String value) {
            addCriterion("zomore_commodity_image like", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageNotLike(String value) {
            addCriterion("zomore_commodity_image not like", value, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageIn(List<String> values) {
            addCriterion("zomore_commodity_image in", values, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageNotIn(List<String> values) {
            addCriterion("zomore_commodity_image not in", values, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageBetween(String value1, String value2) {
            addCriterion("zomore_commodity_image between", value1, value2, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityImageNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_image not between", value1, value2, "zomoreCommodityImage");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeIsNull() {
            addCriterion("zomore_commodity_code is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeIsNotNull() {
            addCriterion("zomore_commodity_code is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeEqualTo(String value) {
            addCriterion("zomore_commodity_code =", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeNotEqualTo(String value) {
            addCriterion("zomore_commodity_code <>", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeGreaterThan(String value) {
            addCriterion("zomore_commodity_code >", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_code >=", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeLessThan(String value) {
            addCriterion("zomore_commodity_code <", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_code <=", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeLike(String value) {
            addCriterion("zomore_commodity_code like", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeNotLike(String value) {
            addCriterion("zomore_commodity_code not like", value, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeIn(List<String> values) {
            addCriterion("zomore_commodity_code in", values, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeNotIn(List<String> values) {
            addCriterion("zomore_commodity_code not in", values, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_code between", value1, value2, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_code not between", value1, value2, "zomoreCommodityCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumIsNull() {
            addCriterion("zomore_commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumIsNotNull() {
            addCriterion("zomore_commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumEqualTo(String value) {
            addCriterion("zomore_commodity_num =", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotEqualTo(String value) {
            addCriterion("zomore_commodity_num <>", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumGreaterThan(String value) {
            addCriterion("zomore_commodity_num >", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_num >=", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumLessThan(String value) {
            addCriterion("zomore_commodity_num <", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_num <=", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumLike(String value) {
            addCriterion("zomore_commodity_num like", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotLike(String value) {
            addCriterion("zomore_commodity_num not like", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumIn(List<String> values) {
            addCriterion("zomore_commodity_num in", values, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotIn(List<String> values) {
            addCriterion("zomore_commodity_num not in", values, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumBetween(String value1, String value2) {
            addCriterion("zomore_commodity_num between", value1, value2, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_num not between", value1, value2, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsIsNull() {
            addCriterion("zomore_commodity_specifications is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsIsNotNull() {
            addCriterion("zomore_commodity_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsEqualTo(String value) {
            addCriterion("zomore_commodity_specifications =", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsNotEqualTo(String value) {
            addCriterion("zomore_commodity_specifications <>", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsGreaterThan(String value) {
            addCriterion("zomore_commodity_specifications >", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_specifications >=", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsLessThan(String value) {
            addCriterion("zomore_commodity_specifications <", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_specifications <=", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsLike(String value) {
            addCriterion("zomore_commodity_specifications like", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsNotLike(String value) {
            addCriterion("zomore_commodity_specifications not like", value, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsIn(List<String> values) {
            addCriterion("zomore_commodity_specifications in", values, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsNotIn(List<String> values) {
            addCriterion("zomore_commodity_specifications not in", values, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsBetween(String value1, String value2) {
            addCriterion("zomore_commodity_specifications between", value1, value2, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySpecificationsNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_specifications not between", value1, value2, "zomoreCommoditySpecifications");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinIsNull() {
            addCriterion("zomore_commodity_pingyin is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinIsNotNull() {
            addCriterion("zomore_commodity_pingyin is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinEqualTo(String value) {
            addCriterion("zomore_commodity_pingyin =", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinNotEqualTo(String value) {
            addCriterion("zomore_commodity_pingyin <>", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinGreaterThan(String value) {
            addCriterion("zomore_commodity_pingyin >", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_pingyin >=", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinLessThan(String value) {
            addCriterion("zomore_commodity_pingyin <", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_pingyin <=", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinLike(String value) {
            addCriterion("zomore_commodity_pingyin like", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinNotLike(String value) {
            addCriterion("zomore_commodity_pingyin not like", value, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinIn(List<String> values) {
            addCriterion("zomore_commodity_pingyin in", values, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinNotIn(List<String> values) {
            addCriterion("zomore_commodity_pingyin not in", values, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinBetween(String value1, String value2) {
            addCriterion("zomore_commodity_pingyin between", value1, value2, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityPingyinNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_pingyin not between", value1, value2, "zomoreCommodityPingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeIsNull() {
            addCriterion("zomore_commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeIsNotNull() {
            addCriterion("zomore_commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeEqualTo(String value) {
            addCriterion("zomore_commodity_type =", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeNotEqualTo(String value) {
            addCriterion("zomore_commodity_type <>", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeGreaterThan(String value) {
            addCriterion("zomore_commodity_type >", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_type >=", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeLessThan(String value) {
            addCriterion("zomore_commodity_type <", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_type <=", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeLike(String value) {
            addCriterion("zomore_commodity_type like", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeNotLike(String value) {
            addCriterion("zomore_commodity_type not like", value, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeIn(List<String> values) {
            addCriterion("zomore_commodity_type in", values, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeNotIn(List<String> values) {
            addCriterion("zomore_commodity_type not in", values, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_type between", value1, value2, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_type not between", value1, value2, "zomoreCommodityType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainIsNull() {
            addCriterion("zomore_commodity_main is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainIsNotNull() {
            addCriterion("zomore_commodity_main is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainEqualTo(String value) {
            addCriterion("zomore_commodity_main =", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainNotEqualTo(String value) {
            addCriterion("zomore_commodity_main <>", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainGreaterThan(String value) {
            addCriterion("zomore_commodity_main >", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_main >=", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainLessThan(String value) {
            addCriterion("zomore_commodity_main <", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_main <=", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainLike(String value) {
            addCriterion("zomore_commodity_main like", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainNotLike(String value) {
            addCriterion("zomore_commodity_main not like", value, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainIn(List<String> values) {
            addCriterion("zomore_commodity_main in", values, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainNotIn(List<String> values) {
            addCriterion("zomore_commodity_main not in", values, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainBetween(String value1, String value2) {
            addCriterion("zomore_commodity_main between", value1, value2, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMainNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_main not between", value1, value2, "zomoreCommodityMain");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInIsNull() {
            addCriterion("zomore_commodity_in is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInIsNotNull() {
            addCriterion("zomore_commodity_in is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInEqualTo(String value) {
            addCriterion("zomore_commodity_in =", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInNotEqualTo(String value) {
            addCriterion("zomore_commodity_in <>", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInGreaterThan(String value) {
            addCriterion("zomore_commodity_in >", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_in >=", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInLessThan(String value) {
            addCriterion("zomore_commodity_in <", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_in <=", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInLike(String value) {
            addCriterion("zomore_commodity_in like", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInNotLike(String value) {
            addCriterion("zomore_commodity_in not like", value, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInIn(List<String> values) {
            addCriterion("zomore_commodity_in in", values, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInNotIn(List<String> values) {
            addCriterion("zomore_commodity_in not in", values, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInBetween(String value1, String value2) {
            addCriterion("zomore_commodity_in between", value1, value2, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_in not between", value1, value2, "zomoreCommodityIn");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutIsNull() {
            addCriterion("zomore_commodity_out is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutIsNotNull() {
            addCriterion("zomore_commodity_out is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutEqualTo(String value) {
            addCriterion("zomore_commodity_out =", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutNotEqualTo(String value) {
            addCriterion("zomore_commodity_out <>", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutGreaterThan(String value) {
            addCriterion("zomore_commodity_out >", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_out >=", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutLessThan(String value) {
            addCriterion("zomore_commodity_out <", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_out <=", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutLike(String value) {
            addCriterion("zomore_commodity_out like", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutNotLike(String value) {
            addCriterion("zomore_commodity_out not like", value, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutIn(List<String> values) {
            addCriterion("zomore_commodity_out in", values, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutNotIn(List<String> values) {
            addCriterion("zomore_commodity_out not in", values, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutBetween(String value1, String value2) {
            addCriterion("zomore_commodity_out between", value1, value2, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_out not between", value1, value2, "zomoreCommodityOut");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallIsNull() {
            addCriterion("zomore_commodity_outall is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallIsNotNull() {
            addCriterion("zomore_commodity_outall is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallEqualTo(String value) {
            addCriterion("zomore_commodity_outall =", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallNotEqualTo(String value) {
            addCriterion("zomore_commodity_outall <>", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallGreaterThan(String value) {
            addCriterion("zomore_commodity_outall >", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_outall >=", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallLessThan(String value) {
            addCriterion("zomore_commodity_outall <", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_outall <=", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallLike(String value) {
            addCriterion("zomore_commodity_outall like", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallNotLike(String value) {
            addCriterion("zomore_commodity_outall not like", value, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallIn(List<String> values) {
            addCriterion("zomore_commodity_outall in", values, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallNotIn(List<String> values) {
            addCriterion("zomore_commodity_outall not in", values, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallBetween(String value1, String value2) {
            addCriterion("zomore_commodity_outall between", value1, value2, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityOutallNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_outall not between", value1, value2, "zomoreCommodityOutall");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountIsNull() {
            addCriterion("zomore_commodity_isdiscount is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountIsNotNull() {
            addCriterion("zomore_commodity_isdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountEqualTo(Integer value) {
            addCriterion("zomore_commodity_isdiscount =", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isdiscount <>", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isdiscount >", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isdiscount >=", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountLessThan(Integer value) {
            addCriterion("zomore_commodity_isdiscount <", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isdiscount <=", value, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountIn(List<Integer> values) {
            addCriterion("zomore_commodity_isdiscount in", values, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isdiscount not in", values, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isdiscount between", value1, value2, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isdiscount not between", value1, value2, "zomoreCommodityIsdiscount");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideIsNull() {
            addCriterion("zomore_commodity_provide is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideIsNotNull() {
            addCriterion("zomore_commodity_provide is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideEqualTo(String value) {
            addCriterion("zomore_commodity_provide =", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideNotEqualTo(String value) {
            addCriterion("zomore_commodity_provide <>", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideGreaterThan(String value) {
            addCriterion("zomore_commodity_provide >", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_provide >=", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideLessThan(String value) {
            addCriterion("zomore_commodity_provide <", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_provide <=", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideLike(String value) {
            addCriterion("zomore_commodity_provide like", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideNotLike(String value) {
            addCriterion("zomore_commodity_provide not like", value, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideIn(List<String> values) {
            addCriterion("zomore_commodity_provide in", values, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideNotIn(List<String> values) {
            addCriterion("zomore_commodity_provide not in", values, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideBetween(String value1, String value2) {
            addCriterion("zomore_commodity_provide between", value1, value2, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProvideNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_provide not between", value1, value2, "zomoreCommodityProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateIsNull() {
            addCriterion("zomore_commodity_productdate is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateIsNotNull() {
            addCriterion("zomore_commodity_productdate is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateEqualTo(Date value) {
            addCriterion("zomore_commodity_productdate =", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateNotEqualTo(Date value) {
            addCriterion("zomore_commodity_productdate <>", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateGreaterThan(Date value) {
            addCriterion("zomore_commodity_productdate >", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_productdate >=", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateLessThan(Date value) {
            addCriterion("zomore_commodity_productdate <", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_productdate <=", value, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateIn(List<Date> values) {
            addCriterion("zomore_commodity_productdate in", values, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateNotIn(List<Date> values) {
            addCriterion("zomore_commodity_productdate not in", values, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_productdate between", value1, value2, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityProductdateNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_productdate not between", value1, value2, "zomoreCommodityProductdate");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeIsNull() {
            addCriterion("zomore_commodity_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeIsNotNull() {
            addCriterion("zomore_commodity_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeEqualTo(Integer value) {
            addCriterion("zomore_commodity_time =", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_time <>", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeGreaterThan(Integer value) {
            addCriterion("zomore_commodity_time >", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_time >=", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeLessThan(Integer value) {
            addCriterion("zomore_commodity_time <", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_time <=", value, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeIn(List<Integer> values) {
            addCriterion("zomore_commodity_time in", values, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_time not in", values, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_time between", value1, value2, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_time not between", value1, value2, "zomoreCommodityTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIsNull() {
            addCriterion("zomore_commodity_createtime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIsNotNull() {
            addCriterion("zomore_commodity_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime =", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime <>", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_createtime >", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime >=", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeLessThan(Date value) {
            addCriterion("zomore_commodity_createtime <", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime <=", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIn(List<Date> values) {
            addCriterion("zomore_commodity_createtime in", values, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_createtime not in", values, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_createtime between", value1, value2, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_createtime not between", value1, value2, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserIsNull() {
            addCriterion("zomore_commodity_isuser is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserIsNotNull() {
            addCriterion("zomore_commodity_isuser is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserEqualTo(Integer value) {
            addCriterion("zomore_commodity_isuser =", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isuser <>", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isuser >", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isuser >=", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserLessThan(Integer value) {
            addCriterion("zomore_commodity_isuser <", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isuser <=", value, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserIn(List<Integer> values) {
            addCriterion("zomore_commodity_isuser in", values, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isuser not in", values, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isuser between", value1, value2, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsuserNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isuser not between", value1, value2, "zomoreCommodityIsuser");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceIsNull() {
            addCriterion("zomore_commodity_isservice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceIsNotNull() {
            addCriterion("zomore_commodity_isservice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceEqualTo(Integer value) {
            addCriterion("zomore_commodity_isservice =", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isservice <>", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isservice >", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isservice >=", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceLessThan(Integer value) {
            addCriterion("zomore_commodity_isservice <", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isservice <=", value, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceIn(List<Integer> values) {
            addCriterion("zomore_commodity_isservice in", values, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isservice not in", values, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isservice between", value1, value2, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsserviceNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isservice not between", value1, value2, "zomoreCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1IsNull() {
            addCriterion("zomore_commodity_laber1 is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1IsNotNull() {
            addCriterion("zomore_commodity_laber1 is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1EqualTo(String value) {
            addCriterion("zomore_commodity_laber1 =", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1NotEqualTo(String value) {
            addCriterion("zomore_commodity_laber1 <>", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1GreaterThan(String value) {
            addCriterion("zomore_commodity_laber1 >", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1GreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber1 >=", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1LessThan(String value) {
            addCriterion("zomore_commodity_laber1 <", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1LessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber1 <=", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1Like(String value) {
            addCriterion("zomore_commodity_laber1 like", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1NotLike(String value) {
            addCriterion("zomore_commodity_laber1 not like", value, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1In(List<String> values) {
            addCriterion("zomore_commodity_laber1 in", values, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1NotIn(List<String> values) {
            addCriterion("zomore_commodity_laber1 not in", values, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1Between(String value1, String value2) {
            addCriterion("zomore_commodity_laber1 between", value1, value2, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber1NotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_laber1 not between", value1, value2, "zomoreCommodityLaber1");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2IsNull() {
            addCriterion("zomore_commodity_laber2 is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2IsNotNull() {
            addCriterion("zomore_commodity_laber2 is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2EqualTo(String value) {
            addCriterion("zomore_commodity_laber2 =", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2NotEqualTo(String value) {
            addCriterion("zomore_commodity_laber2 <>", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2GreaterThan(String value) {
            addCriterion("zomore_commodity_laber2 >", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2GreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber2 >=", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2LessThan(String value) {
            addCriterion("zomore_commodity_laber2 <", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2LessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber2 <=", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2Like(String value) {
            addCriterion("zomore_commodity_laber2 like", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2NotLike(String value) {
            addCriterion("zomore_commodity_laber2 not like", value, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2In(List<String> values) {
            addCriterion("zomore_commodity_laber2 in", values, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2NotIn(List<String> values) {
            addCriterion("zomore_commodity_laber2 not in", values, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2Between(String value1, String value2) {
            addCriterion("zomore_commodity_laber2 between", value1, value2, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber2NotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_laber2 not between", value1, value2, "zomoreCommodityLaber2");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3IsNull() {
            addCriterion("zomore_commodity_laber3 is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3IsNotNull() {
            addCriterion("zomore_commodity_laber3 is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3EqualTo(String value) {
            addCriterion("zomore_commodity_laber3 =", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3NotEqualTo(String value) {
            addCriterion("zomore_commodity_laber3 <>", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3GreaterThan(String value) {
            addCriterion("zomore_commodity_laber3 >", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3GreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber3 >=", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3LessThan(String value) {
            addCriterion("zomore_commodity_laber3 <", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3LessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laber3 <=", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3Like(String value) {
            addCriterion("zomore_commodity_laber3 like", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3NotLike(String value) {
            addCriterion("zomore_commodity_laber3 not like", value, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3In(List<String> values) {
            addCriterion("zomore_commodity_laber3 in", values, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3NotIn(List<String> values) {
            addCriterion("zomore_commodity_laber3 not in", values, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3Between(String value1, String value2) {
            addCriterion("zomore_commodity_laber3 between", value1, value2, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaber3NotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_laber3 not between", value1, value2, "zomoreCommodityLaber3");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductIsNull() {
            addCriterion("zomore_commodity_laberproduct is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductIsNotNull() {
            addCriterion("zomore_commodity_laberproduct is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductEqualTo(String value) {
            addCriterion("zomore_commodity_laberproduct =", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductNotEqualTo(String value) {
            addCriterion("zomore_commodity_laberproduct <>", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductGreaterThan(String value) {
            addCriterion("zomore_commodity_laberproduct >", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laberproduct >=", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductLessThan(String value) {
            addCriterion("zomore_commodity_laberproduct <", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_laberproduct <=", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductLike(String value) {
            addCriterion("zomore_commodity_laberproduct like", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductNotLike(String value) {
            addCriterion("zomore_commodity_laberproduct not like", value, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductIn(List<String> values) {
            addCriterion("zomore_commodity_laberproduct in", values, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductNotIn(List<String> values) {
            addCriterion("zomore_commodity_laberproduct not in", values, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductBetween(String value1, String value2) {
            addCriterion("zomore_commodity_laberproduct between", value1, value2, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLaberproductNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_laberproduct not between", value1, value2, "zomoreCommodityLaberproduct");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralIsNull() {
            addCriterion("zomore_commodity_isintegral is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralIsNotNull() {
            addCriterion("zomore_commodity_isintegral is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralEqualTo(Integer value) {
            addCriterion("zomore_commodity_isintegral =", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isintegral <>", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isintegral >", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isintegral >=", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralLessThan(Integer value) {
            addCriterion("zomore_commodity_isintegral <", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isintegral <=", value, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralIn(List<Integer> values) {
            addCriterion("zomore_commodity_isintegral in", values, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isintegral not in", values, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isintegral between", value1, value2, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isintegral not between", value1, value2, "zomoreCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandIsNull() {
            addCriterion("zomore_commodity_brand is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandIsNotNull() {
            addCriterion("zomore_commodity_brand is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandEqualTo(String value) {
            addCriterion("zomore_commodity_brand =", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandNotEqualTo(String value) {
            addCriterion("zomore_commodity_brand <>", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandGreaterThan(String value) {
            addCriterion("zomore_commodity_brand >", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_brand >=", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandLessThan(String value) {
            addCriterion("zomore_commodity_brand <", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_brand <=", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandLike(String value) {
            addCriterion("zomore_commodity_brand like", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandNotLike(String value) {
            addCriterion("zomore_commodity_brand not like", value, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandIn(List<String> values) {
            addCriterion("zomore_commodity_brand in", values, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandNotIn(List<String> values) {
            addCriterion("zomore_commodity_brand not in", values, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandBetween(String value1, String value2) {
            addCriterion("zomore_commodity_brand between", value1, value2, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityBrandNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_brand not between", value1, value2, "zomoreCommodityBrand");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceIsNull() {
            addCriterion("zomore_commodity_memberprice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceIsNotNull() {
            addCriterion("zomore_commodity_memberprice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceEqualTo(String value) {
            addCriterion("zomore_commodity_memberprice =", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceNotEqualTo(String value) {
            addCriterion("zomore_commodity_memberprice <>", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceGreaterThan(String value) {
            addCriterion("zomore_commodity_memberprice >", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_memberprice >=", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceLessThan(String value) {
            addCriterion("zomore_commodity_memberprice <", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_memberprice <=", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceLike(String value) {
            addCriterion("zomore_commodity_memberprice like", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceNotLike(String value) {
            addCriterion("zomore_commodity_memberprice not like", value, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceIn(List<String> values) {
            addCriterion("zomore_commodity_memberprice in", values, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceNotIn(List<String> values) {
            addCriterion("zomore_commodity_memberprice not in", values, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceBetween(String value1, String value2) {
            addCriterion("zomore_commodity_memberprice between", value1, value2, "zomoreCommodityMemberprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMemberpriceNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_memberprice not between", value1, value2, "zomoreCommodityMemberprice");
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

        public Criteria andZomoreCommodityIsroyaltyIsNull() {
            addCriterion("zomore_commodity_isroyalty is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyIsNotNull() {
            addCriterion("zomore_commodity_isroyalty is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyEqualTo(Integer value) {
            addCriterion("zomore_commodity_isroyalty =", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isroyalty <>", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isroyalty >", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isroyalty >=", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyLessThan(Integer value) {
            addCriterion("zomore_commodity_isroyalty <", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isroyalty <=", value, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyIn(List<Integer> values) {
            addCriterion("zomore_commodity_isroyalty in", values, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isroyalty not in", values, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isroyalty between", value1, value2, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsroyaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isroyalty not between", value1, value2, "zomoreCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeIsNull() {
            addCriterion("zomore_commodity_royaltytype is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeIsNotNull() {
            addCriterion("zomore_commodity_royaltytype is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeEqualTo(Integer value) {
            addCriterion("zomore_commodity_royaltytype =", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_royaltytype <>", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeGreaterThan(Integer value) {
            addCriterion("zomore_commodity_royaltytype >", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_royaltytype >=", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeLessThan(Integer value) {
            addCriterion("zomore_commodity_royaltytype <", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_royaltytype <=", value, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeIn(List<Integer> values) {
            addCriterion("zomore_commodity_royaltytype in", values, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_royaltytype not in", values, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_royaltytype between", value1, value2, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_royaltytype not between", value1, value2, "zomoreCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueIsNull() {
            addCriterion("zomore_commodity_royaltyvalue is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueIsNotNull() {
            addCriterion("zomore_commodity_royaltyvalue is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueEqualTo(String value) {
            addCriterion("zomore_commodity_royaltyvalue =", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueNotEqualTo(String value) {
            addCriterion("zomore_commodity_royaltyvalue <>", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueGreaterThan(String value) {
            addCriterion("zomore_commodity_royaltyvalue >", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_royaltyvalue >=", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueLessThan(String value) {
            addCriterion("zomore_commodity_royaltyvalue <", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_royaltyvalue <=", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueLike(String value) {
            addCriterion("zomore_commodity_royaltyvalue like", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueNotLike(String value) {
            addCriterion("zomore_commodity_royaltyvalue not like", value, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueIn(List<String> values) {
            addCriterion("zomore_commodity_royaltyvalue in", values, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueNotIn(List<String> values) {
            addCriterion("zomore_commodity_royaltyvalue not in", values, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueBetween(String value1, String value2) {
            addCriterion("zomore_commodity_royaltyvalue between", value1, value2, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityRoyaltyvalueNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_royaltyvalue not between", value1, value2, "zomoreCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownIsNull() {
            addCriterion("zomore_commodity_updown is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownIsNotNull() {
            addCriterion("zomore_commodity_updown is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownEqualTo(Integer value) {
            addCriterion("zomore_commodity_updown =", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_updown <>", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownGreaterThan(Integer value) {
            addCriterion("zomore_commodity_updown >", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_updown >=", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownLessThan(Integer value) {
            addCriterion("zomore_commodity_updown <", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_updown <=", value, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownIn(List<Integer> values) {
            addCriterion("zomore_commodity_updown in", values, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_updown not in", values, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_updown between", value1, value2, "zomoreCommodityUpdown");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdownNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_updown not between", value1, value2, "zomoreCommodityUpdown");
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