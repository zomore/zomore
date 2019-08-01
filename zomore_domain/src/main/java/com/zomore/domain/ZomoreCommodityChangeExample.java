package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityChangeExample() {
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

        public Criteria andZomoreCommodityChangeIdIsNull() {
            addCriterion("zomore_commodity_change_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdIsNotNull() {
            addCriterion("zomore_commodity_change_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdEqualTo(String value) {
            addCriterion("zomore_commodity_change_id =", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_change_id <>", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdGreaterThan(String value) {
            addCriterion("zomore_commodity_change_id >", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_change_id >=", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdLessThan(String value) {
            addCriterion("zomore_commodity_change_id <", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_change_id <=", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdLike(String value) {
            addCriterion("zomore_commodity_change_id like", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdNotLike(String value) {
            addCriterion("zomore_commodity_change_id not like", value, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdIn(List<String> values) {
            addCriterion("zomore_commodity_change_id in", values, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_change_id not in", values, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_change_id between", value1, value2, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_change_id not between", value1, value2, "zomoreCommodityChangeId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeIsNull() {
            addCriterion("zomore_commodity_change_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeIsNotNull() {
            addCriterion("zomore_commodity_change_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeEqualTo(String value) {
            addCriterion("zomore_commodity_change_type =", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeNotEqualTo(String value) {
            addCriterion("zomore_commodity_change_type <>", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeGreaterThan(String value) {
            addCriterion("zomore_commodity_change_type >", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_change_type >=", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeLessThan(String value) {
            addCriterion("zomore_commodity_change_type <", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_change_type <=", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeLike(String value) {
            addCriterion("zomore_commodity_change_type like", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeNotLike(String value) {
            addCriterion("zomore_commodity_change_type not like", value, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeIn(List<String> values) {
            addCriterion("zomore_commodity_change_type in", values, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeNotIn(List<String> values) {
            addCriterion("zomore_commodity_change_type not in", values, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_change_type between", value1, value2, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_change_type not between", value1, value2, "zomoreCommodityChangeType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumIsNull() {
            addCriterion("zomore_commodity_change_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumIsNotNull() {
            addCriterion("zomore_commodity_change_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_change_num =", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_change_num <>", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_change_num >", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_change_num >=", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumLessThan(Integer value) {
            addCriterion("zomore_commodity_change_num <", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_change_num <=", value, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_change_num in", values, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_change_num not in", values, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_change_num between", value1, value2, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_change_num not between", value1, value2, "zomoreCommodityChangeNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeIsNull() {
            addCriterion("zomore_commodity_change_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeIsNotNull() {
            addCriterion("zomore_commodity_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_change_time =", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_change_time <>", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_change_time >", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_change_time >=", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeLessThan(Date value) {
            addCriterion("zomore_commodity_change_time <", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_change_time <=", value, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_change_time in", values, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_change_time not in", values, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_change_time between", value1, value2, "zomoreCommodityChangeTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_change_time not between", value1, value2, "zomoreCommodityChangeTime");
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

        public Criteria andZomoreOrderIdIsNull() {
            addCriterion("zomore_order_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdIsNotNull() {
            addCriterion("zomore_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdEqualTo(String value) {
            addCriterion("zomore_order_id =", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdNotEqualTo(String value) {
            addCriterion("zomore_order_id <>", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdGreaterThan(String value) {
            addCriterion("zomore_order_id >", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_order_id >=", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdLessThan(String value) {
            addCriterion("zomore_order_id <", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_order_id <=", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdLike(String value) {
            addCriterion("zomore_order_id like", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdNotLike(String value) {
            addCriterion("zomore_order_id not like", value, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdIn(List<String> values) {
            addCriterion("zomore_order_id in", values, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdNotIn(List<String> values) {
            addCriterion("zomore_order_id not in", values, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdBetween(String value1, String value2) {
            addCriterion("zomore_order_id between", value1, value2, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreOrderIdNotBetween(String value1, String value2) {
            addCriterion("zomore_order_id not between", value1, value2, "zomoreOrderId");
            return (Criteria) this;
        }

        public Criteria andZomoreNumIsNull() {
            addCriterion("zomore_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreNumIsNotNull() {
            addCriterion("zomore_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreNumEqualTo(Integer value) {
            addCriterion("zomore_num =", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumNotEqualTo(Integer value) {
            addCriterion("zomore_num <>", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumGreaterThan(Integer value) {
            addCriterion("zomore_num >", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_num >=", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumLessThan(Integer value) {
            addCriterion("zomore_num <", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_num <=", value, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumIn(List<Integer> values) {
            addCriterion("zomore_num in", values, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumNotIn(List<Integer> values) {
            addCriterion("zomore_num not in", values, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_num between", value1, value2, "zomoreNum");
            return (Criteria) this;
        }

        public Criteria andZomoreNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_num not between", value1, value2, "zomoreNum");
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