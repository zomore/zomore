package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreServiceCommoditySalecommoditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreServiceCommoditySalecommoditExample() {
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

        public Criteria andZomoreCommoditySaleCommoditIdIsNull() {
            addCriterion("zomore_commodity_sale_commodit_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdIsNotNull() {
            addCriterion("zomore_commodity_sale_commodit_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id =", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id <>", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdGreaterThan(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id >", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id >=", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdLessThan(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id <", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_sale_commodit_id <=", value, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdIn(List<Integer> values) {
            addCriterion("zomore_commodity_sale_commodit_id in", values, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_sale_commodit_id not in", values, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_sale_commodit_id between", value1, value2, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommoditySaleCommoditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_sale_commodit_id not between", value1, value2, "zomoreCommoditySaleCommoditId");
            return (Criteria) this;
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

        public Criteria andZomoreCommodityNumIsNull() {
            addCriterion("zomore_commodity_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumIsNotNull() {
            addCriterion("zomore_commodity_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_num =", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_num <>", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_num >", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_num >=", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumLessThan(Integer value) {
            addCriterion("zomore_commodity_num <", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_num <=", value, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_num in", values, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_num not in", values, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_num between", value1, value2, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_num not between", value1, value2, "zomoreCommodityNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyIsNull() {
            addCriterion("zomore_commodity_money is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyIsNotNull() {
            addCriterion("zomore_commodity_money is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyEqualTo(Double value) {
            addCriterion("zomore_commodity_money =", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyNotEqualTo(Double value) {
            addCriterion("zomore_commodity_money <>", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyGreaterThan(Double value) {
            addCriterion("zomore_commodity_money >", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_money >=", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyLessThan(Double value) {
            addCriterion("zomore_commodity_money <", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyLessThanOrEqualTo(Double value) {
            addCriterion("zomore_commodity_money <=", value, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyIn(List<Double> values) {
            addCriterion("zomore_commodity_money in", values, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyNotIn(List<Double> values) {
            addCriterion("zomore_commodity_money not in", values, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_money between", value1, value2, "zomoreCommodityMoney");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityMoneyNotBetween(Double value1, Double value2) {
            addCriterion("zomore_commodity_money not between", value1, value2, "zomoreCommodityMoney");
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