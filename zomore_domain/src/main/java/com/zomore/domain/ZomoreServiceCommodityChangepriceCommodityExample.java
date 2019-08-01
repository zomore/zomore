package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreServiceCommodityChangepriceCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreServiceCommodityChangepriceCommodityExample() {
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

        public Criteria andChangepriceidIsNull() {
            addCriterion("changepriceid is null");
            return (Criteria) this;
        }

        public Criteria andChangepriceidIsNotNull() {
            addCriterion("changepriceid is not null");
            return (Criteria) this;
        }

        public Criteria andChangepriceidEqualTo(String value) {
            addCriterion("changepriceid =", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidNotEqualTo(String value) {
            addCriterion("changepriceid <>", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidGreaterThan(String value) {
            addCriterion("changepriceid >", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidGreaterThanOrEqualTo(String value) {
            addCriterion("changepriceid >=", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidLessThan(String value) {
            addCriterion("changepriceid <", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidLessThanOrEqualTo(String value) {
            addCriterion("changepriceid <=", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidLike(String value) {
            addCriterion("changepriceid like", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidNotLike(String value) {
            addCriterion("changepriceid not like", value, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidIn(List<String> values) {
            addCriterion("changepriceid in", values, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidNotIn(List<String> values) {
            addCriterion("changepriceid not in", values, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidBetween(String value1, String value2) {
            addCriterion("changepriceid between", value1, value2, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andChangepriceidNotBetween(String value1, String value2) {
            addCriterion("changepriceid not between", value1, value2, "changepriceid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidIsNull() {
            addCriterion("service_commodityid is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidIsNotNull() {
            addCriterion("service_commodityid is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidEqualTo(String value) {
            addCriterion("service_commodityid =", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidNotEqualTo(String value) {
            addCriterion("service_commodityid <>", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidGreaterThan(String value) {
            addCriterion("service_commodityid >", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodityid >=", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidLessThan(String value) {
            addCriterion("service_commodityid <", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidLessThanOrEqualTo(String value) {
            addCriterion("service_commodityid <=", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidLike(String value) {
            addCriterion("service_commodityid like", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidNotLike(String value) {
            addCriterion("service_commodityid not like", value, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidIn(List<String> values) {
            addCriterion("service_commodityid in", values, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidNotIn(List<String> values) {
            addCriterion("service_commodityid not in", values, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidBetween(String value1, String value2) {
            addCriterion("service_commodityid between", value1, value2, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidNotBetween(String value1, String value2) {
            addCriterion("service_commodityid not between", value1, value2, "serviceCommodityid");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceIsNull() {
            addCriterion("service_commodityprice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceIsNotNull() {
            addCriterion("service_commodityprice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceEqualTo(Double value) {
            addCriterion("service_commodityprice =", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceNotEqualTo(Double value) {
            addCriterion("service_commodityprice <>", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceGreaterThan(Double value) {
            addCriterion("service_commodityprice >", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceGreaterThanOrEqualTo(Double value) {
            addCriterion("service_commodityprice >=", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceLessThan(Double value) {
            addCriterion("service_commodityprice <", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceLessThanOrEqualTo(Double value) {
            addCriterion("service_commodityprice <=", value, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceIn(List<Double> values) {
            addCriterion("service_commodityprice in", values, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceNotIn(List<Double> values) {
            addCriterion("service_commodityprice not in", values, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceBetween(Double value1, Double value2) {
            addCriterion("service_commodityprice between", value1, value2, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommoditypriceNotBetween(Double value1, Double value2) {
            addCriterion("service_commodityprice not between", value1, value2, "serviceCommodityprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceIsNull() {
            addCriterion("service_commodityidmemberprice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceIsNotNull() {
            addCriterion("service_commodityidmemberprice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceEqualTo(Double value) {
            addCriterion("service_commodityidmemberprice =", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceNotEqualTo(Double value) {
            addCriterion("service_commodityidmemberprice <>", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceGreaterThan(Double value) {
            addCriterion("service_commodityidmemberprice >", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("service_commodityidmemberprice >=", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceLessThan(Double value) {
            addCriterion("service_commodityidmemberprice <", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceLessThanOrEqualTo(Double value) {
            addCriterion("service_commodityidmemberprice <=", value, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceIn(List<Double> values) {
            addCriterion("service_commodityidmemberprice in", values, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceNotIn(List<Double> values) {
            addCriterion("service_commodityidmemberprice not in", values, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceBetween(Double value1, Double value2) {
            addCriterion("service_commodityidmemberprice between", value1, value2, "serviceCommodityidmemberprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityidmemberpriceNotBetween(Double value1, Double value2) {
            addCriterion("service_commodityidmemberprice not between", value1, value2, "serviceCommodityidmemberprice");
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