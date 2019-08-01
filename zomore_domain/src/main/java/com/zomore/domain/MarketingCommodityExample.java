package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketingCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketingCommodityExample() {
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

        public Criteria andMarketingCommodityIdIsNull() {
            addCriterion("marketing_commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdIsNotNull() {
            addCriterion("marketing_commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdEqualTo(String value) {
            addCriterion("marketing_commodity_id =", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdNotEqualTo(String value) {
            addCriterion("marketing_commodity_id <>", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdGreaterThan(String value) {
            addCriterion("marketing_commodity_id >", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_id >=", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdLessThan(String value) {
            addCriterion("marketing_commodity_id <", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_id <=", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdLike(String value) {
            addCriterion("marketing_commodity_id like", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdNotLike(String value) {
            addCriterion("marketing_commodity_id not like", value, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdIn(List<String> values) {
            addCriterion("marketing_commodity_id in", values, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdNotIn(List<String> values) {
            addCriterion("marketing_commodity_id not in", values, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdBetween(String value1, String value2) {
            addCriterion("marketing_commodity_id between", value1, value2, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityIdNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_id not between", value1, value2, "marketingCommodityId");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeIsNull() {
            addCriterion("marketing_commodity_code is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeIsNotNull() {
            addCriterion("marketing_commodity_code is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeEqualTo(String value) {
            addCriterion("marketing_commodity_code =", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeNotEqualTo(String value) {
            addCriterion("marketing_commodity_code <>", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeGreaterThan(String value) {
            addCriterion("marketing_commodity_code >", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_code >=", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeLessThan(String value) {
            addCriterion("marketing_commodity_code <", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_code <=", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeLike(String value) {
            addCriterion("marketing_commodity_code like", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeNotLike(String value) {
            addCriterion("marketing_commodity_code not like", value, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeIn(List<String> values) {
            addCriterion("marketing_commodity_code in", values, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeNotIn(List<String> values) {
            addCriterion("marketing_commodity_code not in", values, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeBetween(String value1, String value2) {
            addCriterion("marketing_commodity_code between", value1, value2, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_code not between", value1, value2, "marketingCommodityCode");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameIsNull() {
            addCriterion("marketing_commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameIsNotNull() {
            addCriterion("marketing_commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameEqualTo(String value) {
            addCriterion("marketing_commodity_name =", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameNotEqualTo(String value) {
            addCriterion("marketing_commodity_name <>", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameGreaterThan(String value) {
            addCriterion("marketing_commodity_name >", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_name >=", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameLessThan(String value) {
            addCriterion("marketing_commodity_name <", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_name <=", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameLike(String value) {
            addCriterion("marketing_commodity_name like", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameNotLike(String value) {
            addCriterion("marketing_commodity_name not like", value, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameIn(List<String> values) {
            addCriterion("marketing_commodity_name in", values, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameNotIn(List<String> values) {
            addCriterion("marketing_commodity_name not in", values, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameBetween(String value1, String value2) {
            addCriterion("marketing_commodity_name between", value1, value2, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityNameNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_name not between", value1, value2, "marketingCommodityName");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeIsNull() {
            addCriterion("marketing_commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeIsNotNull() {
            addCriterion("marketing_commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeEqualTo(String value) {
            addCriterion("marketing_commodity_type =", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeNotEqualTo(String value) {
            addCriterion("marketing_commodity_type <>", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeGreaterThan(String value) {
            addCriterion("marketing_commodity_type >", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_type >=", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeLessThan(String value) {
            addCriterion("marketing_commodity_type <", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_type <=", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeLike(String value) {
            addCriterion("marketing_commodity_type like", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeNotLike(String value) {
            addCriterion("marketing_commodity_type not like", value, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeIn(List<String> values) {
            addCriterion("marketing_commodity_type in", values, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeNotIn(List<String> values) {
            addCriterion("marketing_commodity_type not in", values, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeBetween(String value1, String value2) {
            addCriterion("marketing_commodity_type between", value1, value2, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityTypeNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_type not between", value1, value2, "marketingCommodityType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceIsNull() {
            addCriterion("marketing_commodity_oldprice is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceIsNotNull() {
            addCriterion("marketing_commodity_oldprice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceEqualTo(String value) {
            addCriterion("marketing_commodity_oldprice =", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceNotEqualTo(String value) {
            addCriterion("marketing_commodity_oldprice <>", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceGreaterThan(String value) {
            addCriterion("marketing_commodity_oldprice >", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_oldprice >=", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceLessThan(String value) {
            addCriterion("marketing_commodity_oldprice <", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_oldprice <=", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceLike(String value) {
            addCriterion("marketing_commodity_oldprice like", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceNotLike(String value) {
            addCriterion("marketing_commodity_oldprice not like", value, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceIn(List<String> values) {
            addCriterion("marketing_commodity_oldprice in", values, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceNotIn(List<String> values) {
            addCriterion("marketing_commodity_oldprice not in", values, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceBetween(String value1, String value2) {
            addCriterion("marketing_commodity_oldprice between", value1, value2, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityOldpriceNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_oldprice not between", value1, value2, "marketingCommodityOldprice");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeIsNull() {
            addCriterion("marketing_type is null");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeIsNotNull() {
            addCriterion("marketing_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeEqualTo(Integer value) {
            addCriterion("marketing_type =", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeNotEqualTo(Integer value) {
            addCriterion("marketing_type <>", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeGreaterThan(Integer value) {
            addCriterion("marketing_type >", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketing_type >=", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeLessThan(Integer value) {
            addCriterion("marketing_type <", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("marketing_type <=", value, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeIn(List<Integer> values) {
            addCriterion("marketing_type in", values, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeNotIn(List<Integer> values) {
            addCriterion("marketing_type not in", values, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeBetween(Integer value1, Integer value2) {
            addCriterion("marketing_type between", value1, value2, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("marketing_type not between", value1, value2, "marketingType");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountIsNull() {
            addCriterion("marketing_commodity_discount is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountIsNotNull() {
            addCriterion("marketing_commodity_discount is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountEqualTo(Integer value) {
            addCriterion("marketing_commodity_discount =", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountNotEqualTo(Integer value) {
            addCriterion("marketing_commodity_discount <>", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountGreaterThan(Integer value) {
            addCriterion("marketing_commodity_discount >", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketing_commodity_discount >=", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountLessThan(Integer value) {
            addCriterion("marketing_commodity_discount <", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("marketing_commodity_discount <=", value, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountIn(List<Integer> values) {
            addCriterion("marketing_commodity_discount in", values, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountNotIn(List<Integer> values) {
            addCriterion("marketing_commodity_discount not in", values, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountBetween(Integer value1, Integer value2) {
            addCriterion("marketing_commodity_discount between", value1, value2, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("marketing_commodity_discount not between", value1, value2, "marketingCommodityDiscount");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceIsNull() {
            addCriterion("marketing_commodity_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceIsNotNull() {
            addCriterion("marketing_commodity_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceEqualTo(String value) {
            addCriterion("marketing_commodity_price =", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceNotEqualTo(String value) {
            addCriterion("marketing_commodity_price <>", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceGreaterThan(String value) {
            addCriterion("marketing_commodity_price >", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_price >=", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceLessThan(String value) {
            addCriterion("marketing_commodity_price <", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceLessThanOrEqualTo(String value) {
            addCriterion("marketing_commodity_price <=", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceLike(String value) {
            addCriterion("marketing_commodity_price like", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceNotLike(String value) {
            addCriterion("marketing_commodity_price not like", value, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceIn(List<String> values) {
            addCriterion("marketing_commodity_price in", values, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceNotIn(List<String> values) {
            addCriterion("marketing_commodity_price not in", values, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceBetween(String value1, String value2) {
            addCriterion("marketing_commodity_price between", value1, value2, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingCommodityPriceNotBetween(String value1, String value2) {
            addCriterion("marketing_commodity_price not between", value1, value2, "marketingCommodityPrice");
            return (Criteria) this;
        }

        public Criteria andMarketingShopIsNull() {
            addCriterion("marketing_shop is null");
            return (Criteria) this;
        }

        public Criteria andMarketingShopIsNotNull() {
            addCriterion("marketing_shop is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingShopEqualTo(String value) {
            addCriterion("marketing_shop =", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopNotEqualTo(String value) {
            addCriterion("marketing_shop <>", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopGreaterThan(String value) {
            addCriterion("marketing_shop >", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopGreaterThanOrEqualTo(String value) {
            addCriterion("marketing_shop >=", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopLessThan(String value) {
            addCriterion("marketing_shop <", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopLessThanOrEqualTo(String value) {
            addCriterion("marketing_shop <=", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopLike(String value) {
            addCriterion("marketing_shop like", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopNotLike(String value) {
            addCriterion("marketing_shop not like", value, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopIn(List<String> values) {
            addCriterion("marketing_shop in", values, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopNotIn(List<String> values) {
            addCriterion("marketing_shop not in", values, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopBetween(String value1, String value2) {
            addCriterion("marketing_shop between", value1, value2, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andMarketingShopNotBetween(String value1, String value2) {
            addCriterion("marketing_shop not between", value1, value2, "marketingShop");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNull() {
            addCriterion("startime is null");
            return (Criteria) this;
        }

        public Criteria andStartimeIsNotNull() {
            addCriterion("startime is not null");
            return (Criteria) this;
        }

        public Criteria andStartimeEqualTo(Date value) {
            addCriterion("startime =", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotEqualTo(Date value) {
            addCriterion("startime <>", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThan(Date value) {
            addCriterion("startime >", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startime >=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThan(Date value) {
            addCriterion("startime <", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeLessThanOrEqualTo(Date value) {
            addCriterion("startime <=", value, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeIn(List<Date> values) {
            addCriterion("startime in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotIn(List<Date> values) {
            addCriterion("startime not in", values, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeBetween(Date value1, Date value2) {
            addCriterion("startime between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andStartimeNotBetween(Date value1, Date value2) {
            addCriterion("startime not between", value1, value2, "startime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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