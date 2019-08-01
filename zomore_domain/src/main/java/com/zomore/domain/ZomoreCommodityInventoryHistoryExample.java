package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityInventoryHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityInventoryHistoryExample() {
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

        public Criteria andZomoreCommodityInventoryHistoryIdIsNull() {
            addCriterion("zomore_commodity_Inventory_history_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdIsNotNull() {
            addCriterion("zomore_commodity_Inventory_history_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdEqualTo(String value) {
            addCriterion("zomore_commodity_Inventory_history_id =", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_Inventory_history_id <>", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdGreaterThan(String value) {
            addCriterion("zomore_commodity_Inventory_history_id >", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_Inventory_history_id >=", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdLessThan(String value) {
            addCriterion("zomore_commodity_Inventory_history_id <", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_Inventory_history_id <=", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdLike(String value) {
            addCriterion("zomore_commodity_Inventory_history_id like", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdNotLike(String value) {
            addCriterion("zomore_commodity_Inventory_history_id not like", value, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdIn(List<String> values) {
            addCriterion("zomore_commodity_Inventory_history_id in", values, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_Inventory_history_id not in", values, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_Inventory_history_id between", value1, value2, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_Inventory_history_id not between", value1, value2, "zomoreCommodityInventoryHistoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumIsNull() {
            addCriterion("zomore_commodity_Inventory_history_storenum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumIsNotNull() {
            addCriterion("zomore_commodity_Inventory_history_storenum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum =", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum <>", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum >", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum >=", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumLessThan(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum <", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_storenum <=", value, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumIn(List<Integer> values) {
            addCriterion("zomore_commodity_Inventory_history_storenum in", values, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_Inventory_history_storenum not in", values, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_Inventory_history_storenum between", value1, value2, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryStorenumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_Inventory_history_storenum not between", value1, value2, "zomoreCommodityInventoryHistoryStorenum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumIsNull() {
            addCriterion("zomore_commodity_Inventory_history_factnum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumIsNotNull() {
            addCriterion("zomore_commodity_Inventory_history_factnum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum =", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum <>", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum >", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum >=", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumLessThan(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum <", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_Inventory_history_factnum <=", value, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumIn(List<Integer> values) {
            addCriterion("zomore_commodity_Inventory_history_factnum in", values, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_Inventory_history_factnum not in", values, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_Inventory_history_factnum between", value1, value2, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryFactnumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_Inventory_history_factnum not between", value1, value2, "zomoreCommodityInventoryHistoryFactnum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeIsNull() {
            addCriterion("zomore_commodity_Inventory_history_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeIsNotNull() {
            addCriterion("zomore_commodity_Inventory_history_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time =", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time <>", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time >", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time >=", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeLessThan(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time <", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_Inventory_history_time <=", value, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_Inventory_history_time in", values, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_Inventory_history_time not in", values, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_Inventory_history_time between", value1, value2, "zomoreCommodityInventoryHistoryTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryHistoryTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_Inventory_history_time not between", value1, value2, "zomoreCommodityInventoryHistoryTime");
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