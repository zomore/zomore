package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class MarketingCommodityHgcxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketingCommodityHgcxExample() {
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

        public Criteria andMarketingPromotionIdIsNull() {
            addCriterion("marketing_promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdIsNotNull() {
            addCriterion("marketing_promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdEqualTo(String value) {
            addCriterion("marketing_promotion_id =", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdNotEqualTo(String value) {
            addCriterion("marketing_promotion_id <>", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdGreaterThan(String value) {
            addCriterion("marketing_promotion_id >", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_promotion_id >=", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdLessThan(String value) {
            addCriterion("marketing_promotion_id <", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdLessThanOrEqualTo(String value) {
            addCriterion("marketing_promotion_id <=", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdLike(String value) {
            addCriterion("marketing_promotion_id like", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdNotLike(String value) {
            addCriterion("marketing_promotion_id not like", value, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdIn(List<String> values) {
            addCriterion("marketing_promotion_id in", values, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdNotIn(List<String> values) {
            addCriterion("marketing_promotion_id not in", values, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdBetween(String value1, String value2) {
            addCriterion("marketing_promotion_id between", value1, value2, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andMarketingPromotionIdNotBetween(String value1, String value2) {
            addCriterion("marketing_promotion_id not between", value1, value2, "marketingPromotionId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(String value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(String value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(String value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(String value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLike(String value) {
            addCriterion("commodity_id like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotLike(String value) {
            addCriterion("commodity_id not like", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<String> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<String> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(String value1, String value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(String value1, String value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNull() {
            addCriterion("commodity_code is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNotNull() {
            addCriterion("commodity_code is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeEqualTo(String value) {
            addCriterion("commodity_code =", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotEqualTo(String value) {
            addCriterion("commodity_code <>", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThan(String value) {
            addCriterion("commodity_code >", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_code >=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThan(String value) {
            addCriterion("commodity_code <", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("commodity_code <=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLike(String value) {
            addCriterion("commodity_code like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotLike(String value) {
            addCriterion("commodity_code not like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIn(List<String> values) {
            addCriterion("commodity_code in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotIn(List<String> values) {
            addCriterion("commodity_code not in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeBetween(String value1, String value2) {
            addCriterion("commodity_code between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("commodity_code not between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIsNull() {
            addCriterion("commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIsNotNull() {
            addCriterion("commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeEqualTo(String value) {
            addCriterion("commodity_type =", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotEqualTo(String value) {
            addCriterion("commodity_type <>", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeGreaterThan(String value) {
            addCriterion("commodity_type >", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type >=", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeLessThan(String value) {
            addCriterion("commodity_type <", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeLessThanOrEqualTo(String value) {
            addCriterion("commodity_type <=", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeLike(String value) {
            addCriterion("commodity_type like", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotLike(String value) {
            addCriterion("commodity_type not like", value, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIn(List<String> values) {
            addCriterion("commodity_type in", values, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotIn(List<String> values) {
            addCriterion("commodity_type not in", values, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeBetween(String value1, String value2) {
            addCriterion("commodity_type between", value1, value2, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNotBetween(String value1, String value2) {
            addCriterion("commodity_type not between", value1, value2, "commodityType");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNull() {
            addCriterion("commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIsNotNull() {
            addCriterion("commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceEqualTo(Double value) {
            addCriterion("commodity_price =", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotEqualTo(Double value) {
            addCriterion("commodity_price <>", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThan(Double value) {
            addCriterion("commodity_price >", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("commodity_price >=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThan(Double value) {
            addCriterion("commodity_price <", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceLessThanOrEqualTo(Double value) {
            addCriterion("commodity_price <=", value, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceIn(List<Double> values) {
            addCriterion("commodity_price in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotIn(List<Double> values) {
            addCriterion("commodity_price not in", values, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceBetween(Double value1, Double value2) {
            addCriterion("commodity_price between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityPriceNotBetween(Double value1, Double value2) {
            addCriterion("commodity_price not between", value1, value2, "commodityPrice");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainIsNull() {
            addCriterion("commodity_ismain is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainIsNotNull() {
            addCriterion("commodity_ismain is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainEqualTo(Integer value) {
            addCriterion("commodity_ismain =", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainNotEqualTo(Integer value) {
            addCriterion("commodity_ismain <>", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainGreaterThan(Integer value) {
            addCriterion("commodity_ismain >", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_ismain >=", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainLessThan(Integer value) {
            addCriterion("commodity_ismain <", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_ismain <=", value, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainIn(List<Integer> values) {
            addCriterion("commodity_ismain in", values, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainNotIn(List<Integer> values) {
            addCriterion("commodity_ismain not in", values, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainBetween(Integer value1, Integer value2) {
            addCriterion("commodity_ismain between", value1, value2, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andCommodityIsmainNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_ismain not between", value1, value2, "commodityIsmain");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andSubmoneyIsNull() {
            addCriterion("submoney is null");
            return (Criteria) this;
        }

        public Criteria andSubmoneyIsNotNull() {
            addCriterion("submoney is not null");
            return (Criteria) this;
        }

        public Criteria andSubmoneyEqualTo(Double value) {
            addCriterion("submoney =", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyNotEqualTo(Double value) {
            addCriterion("submoney <>", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyGreaterThan(Double value) {
            addCriterion("submoney >", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("submoney >=", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyLessThan(Double value) {
            addCriterion("submoney <", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyLessThanOrEqualTo(Double value) {
            addCriterion("submoney <=", value, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyIn(List<Double> values) {
            addCriterion("submoney in", values, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyNotIn(List<Double> values) {
            addCriterion("submoney not in", values, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyBetween(Double value1, Double value2) {
            addCriterion("submoney between", value1, value2, "submoney");
            return (Criteria) this;
        }

        public Criteria andSubmoneyNotBetween(Double value1, Double value2) {
            addCriterion("submoney not between", value1, value2, "submoney");
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