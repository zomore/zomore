package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreCommodityStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityStoreExample() {
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

        public Criteria andZomoreCommodityStoreidIsNull() {
            addCriterion("zomore_commodity_storeid is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidIsNotNull() {
            addCriterion("zomore_commodity_storeid is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidEqualTo(String value) {
            addCriterion("zomore_commodity_storeid =", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidNotEqualTo(String value) {
            addCriterion("zomore_commodity_storeid <>", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidGreaterThan(String value) {
            addCriterion("zomore_commodity_storeid >", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_storeid >=", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidLessThan(String value) {
            addCriterion("zomore_commodity_storeid <", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_storeid <=", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidLike(String value) {
            addCriterion("zomore_commodity_storeid like", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidNotLike(String value) {
            addCriterion("zomore_commodity_storeid not like", value, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidIn(List<String> values) {
            addCriterion("zomore_commodity_storeid in", values, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidNotIn(List<String> values) {
            addCriterion("zomore_commodity_storeid not in", values, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidBetween(String value1, String value2) {
            addCriterion("zomore_commodity_storeid between", value1, value2, "zomoreCommodityStoreid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreidNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_storeid not between", value1, value2, "zomoreCommodityStoreid");
            return (Criteria) this;
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

        public Criteria andZomoreCommodityStoreIsNull() {
            addCriterion("zomore_commodity_store is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreIsNotNull() {
            addCriterion("zomore_commodity_store is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreEqualTo(Integer value) {
            addCriterion("zomore_commodity_store =", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_store <>", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreGreaterThan(Integer value) {
            addCriterion("zomore_commodity_store >", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_store >=", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreLessThan(Integer value) {
            addCriterion("zomore_commodity_store <", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_store <=", value, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreIn(List<Integer> values) {
            addCriterion("zomore_commodity_store in", values, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_store not in", values, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_store between", value1, value2, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityStoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_store not between", value1, value2, "zomoreCommodityStore");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitIsNull() {
            addCriterion("zomore_commodity_uplimit is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitIsNotNull() {
            addCriterion("zomore_commodity_uplimit is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitEqualTo(Integer value) {
            addCriterion("zomore_commodity_uplimit =", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_uplimit <>", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitGreaterThan(Integer value) {
            addCriterion("zomore_commodity_uplimit >", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_uplimit >=", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitLessThan(Integer value) {
            addCriterion("zomore_commodity_uplimit <", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_uplimit <=", value, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitIn(List<Integer> values) {
            addCriterion("zomore_commodity_uplimit in", values, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_uplimit not in", values, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_uplimit between", value1, value2, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUplimitNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_uplimit not between", value1, value2, "zomoreCommodityUplimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitIsNull() {
            addCriterion("zomore_commodity_downlimit is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitIsNotNull() {
            addCriterion("zomore_commodity_downlimit is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitEqualTo(Integer value) {
            addCriterion("zomore_commodity_downlimit =", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_downlimit <>", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitGreaterThan(Integer value) {
            addCriterion("zomore_commodity_downlimit >", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_downlimit >=", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitLessThan(Integer value) {
            addCriterion("zomore_commodity_downlimit <", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_downlimit <=", value, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitIn(List<Integer> values) {
            addCriterion("zomore_commodity_downlimit in", values, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_downlimit not in", values, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_downlimit between", value1, value2, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityDownlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_downlimit not between", value1, value2, "zomoreCommodityDownlimit");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionIsNull() {
            addCriterion("zomore_commodity_inventory_position is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionIsNotNull() {
            addCriterion("zomore_commodity_inventory_position is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionEqualTo(String value) {
            addCriterion("zomore_commodity_inventory_position =", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionNotEqualTo(String value) {
            addCriterion("zomore_commodity_inventory_position <>", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionGreaterThan(String value) {
            addCriterion("zomore_commodity_inventory_position >", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_inventory_position >=", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionLessThan(String value) {
            addCriterion("zomore_commodity_inventory_position <", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_inventory_position <=", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionLike(String value) {
            addCriterion("zomore_commodity_inventory_position like", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionNotLike(String value) {
            addCriterion("zomore_commodity_inventory_position not like", value, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionIn(List<String> values) {
            addCriterion("zomore_commodity_inventory_position in", values, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionNotIn(List<String> values) {
            addCriterion("zomore_commodity_inventory_position not in", values, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionBetween(String value1, String value2) {
            addCriterion("zomore_commodity_inventory_position between", value1, value2, "zomoreCommodityInventoryPosition");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityInventoryPositionNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_inventory_position not between", value1, value2, "zomoreCommodityInventoryPosition");
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