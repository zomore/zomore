package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreCommodityLossCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityLossCommodityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameIsNull() {
            addCriterion("zomore_commodity_loss_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameIsNotNull() {
            addCriterion("zomore_commodity_loss_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameEqualTo(String value) {
            addCriterion("zomore_commodity_loss_name =", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_loss_name <>", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameGreaterThan(String value) {
            addCriterion("zomore_commodity_loss_name >", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_name >=", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameLessThan(String value) {
            addCriterion("zomore_commodity_loss_name <", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_name <=", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameLike(String value) {
            addCriterion("zomore_commodity_loss_name like", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameNotLike(String value) {
            addCriterion("zomore_commodity_loss_name not like", value, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameIn(List<String> values) {
            addCriterion("zomore_commodity_loss_name in", values, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_loss_name not in", values, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_name between", value1, value2, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_name not between", value1, value2, "zomoreCommodityLossName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeIsNull() {
            addCriterion("zomore_commodity_loss_code is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeIsNotNull() {
            addCriterion("zomore_commodity_loss_code is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeEqualTo(String value) {
            addCriterion("zomore_commodity_loss_code =", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeNotEqualTo(String value) {
            addCriterion("zomore_commodity_loss_code <>", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeGreaterThan(String value) {
            addCriterion("zomore_commodity_loss_code >", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_code >=", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeLessThan(String value) {
            addCriterion("zomore_commodity_loss_code <", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_code <=", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeLike(String value) {
            addCriterion("zomore_commodity_loss_code like", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeNotLike(String value) {
            addCriterion("zomore_commodity_loss_code not like", value, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeIn(List<String> values) {
            addCriterion("zomore_commodity_loss_code in", values, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeNotIn(List<String> values) {
            addCriterion("zomore_commodity_loss_code not in", values, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_code between", value1, value2, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossCodeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_code not between", value1, value2, "zomoreCommodityLossCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumIsNull() {
            addCriterion("zomore_commodity_loss_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumIsNotNull() {
            addCriterion("zomore_commodity_loss_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_loss_num =", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_loss_num <>", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_loss_num >", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_loss_num >=", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumLessThan(Integer value) {
            addCriterion("zomore_commodity_loss_num <", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_loss_num <=", value, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_loss_num in", values, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_loss_num not in", values, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_loss_num between", value1, value2, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_loss_num not between", value1, value2, "zomoreCommodityLossNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceIsNull() {
            addCriterion("zomore_commodity_loss_price is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceIsNotNull() {
            addCriterion("zomore_commodity_loss_price is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceEqualTo(String value) {
            addCriterion("zomore_commodity_loss_price =", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceNotEqualTo(String value) {
            addCriterion("zomore_commodity_loss_price <>", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceGreaterThan(String value) {
            addCriterion("zomore_commodity_loss_price >", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_price >=", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceLessThan(String value) {
            addCriterion("zomore_commodity_loss_price <", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_price <=", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceLike(String value) {
            addCriterion("zomore_commodity_loss_price like", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceNotLike(String value) {
            addCriterion("zomore_commodity_loss_price not like", value, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceIn(List<String> values) {
            addCriterion("zomore_commodity_loss_price in", values, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceNotIn(List<String> values) {
            addCriterion("zomore_commodity_loss_price not in", values, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_price between", value1, value2, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossPriceNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_price not between", value1, value2, "zomoreCommodityLossPrice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdIsNull() {
            addCriterion("zomore_commodity_loss_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdIsNotNull() {
            addCriterion("zomore_commodity_loss_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdEqualTo(String value) {
            addCriterion("zomore_commodity_loss_id =", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_loss_id <>", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdGreaterThan(String value) {
            addCriterion("zomore_commodity_loss_id >", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_id >=", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdLessThan(String value) {
            addCriterion("zomore_commodity_loss_id <", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_id <=", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdLike(String value) {
            addCriterion("zomore_commodity_loss_id like", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdNotLike(String value) {
            addCriterion("zomore_commodity_loss_id not like", value, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdIn(List<String> values) {
            addCriterion("zomore_commodity_loss_id in", values, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_loss_id not in", values, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_id between", value1, value2, "zomoreCommodityLossId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_id not between", value1, value2, "zomoreCommodityLossId");
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