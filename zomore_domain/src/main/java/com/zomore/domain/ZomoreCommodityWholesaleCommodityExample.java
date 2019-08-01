package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreCommodityWholesaleCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityWholesaleCommodityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andZomoreCommodityWholesaleCommoditycodeIsNull() {
            addCriterion("zomore_commodity_wholesale_commoditycode is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commoditycode is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode =", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeNotEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode <>", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeGreaterThan(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode >", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode >=", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeLessThan(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode <", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode <=", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeLike(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode like", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeNotLike(String value) {
            addCriterion("zomore_commodity_wholesale_commoditycode not like", value, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_commoditycode in", values, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeNotIn(List<String> values) {
            addCriterion("zomore_commodity_wholesale_commoditycode not in", values, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_commoditycode between", value1, value2, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommoditycodeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_wholesale_commoditycode not between", value1, value2, "zomoreCommodityWholesaleCommoditycode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num =", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num <>", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num >", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num >=", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num <", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_num <=", value, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_num in", values, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_num not in", values, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_num between", value1, value2, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_num not between", value1, value2, "zomoreCommodityWholesaleCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_givenum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_givenum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum =", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum <>", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum >", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum >=", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumLessThan(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum <", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum <=", value, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum in", values, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum not in", values, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum between", value1, value2, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityGivenumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_wholesale_commodity_givenum not between", value1, value2, "zomoreCommodityWholesaleCommodityGivenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice =", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceNotEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice <>", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceGreaterThan(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice >", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice >=", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceLessThan(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice <", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceLessThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice <=", value, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice in", values, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceNotIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice not in", values, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice between", value1, value2, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityOnepriceNotBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_commodity_oneprice not between", value1, value2, "zomoreCommodityWholesaleCommodityOneprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceIsNull() {
            addCriterion("zomore_commodity_wholesale_commodity_allprice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceIsNotNull() {
            addCriterion("zomore_commodity_wholesale_commodity_allprice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice =", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceNotEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice <>", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceGreaterThan(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice >", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice >=", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceLessThan(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice <", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceLessThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice <=", value, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice in", values, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceNotIn(List<Double> values) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice not in", values, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice between", value1, value2, "zomoreCommodityWholesaleCommodityAllprice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityWholesaleCommodityAllpriceNotBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_wholesale_commodity_allprice not between", value1, value2, "zomoreCommodityWholesaleCommodityAllprice");
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