package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreShoppingGuideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreShoppingGuideExample() {
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

        public Criteria andShoppingGuideIdIsNull() {
            addCriterion("shopping_guide_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdIsNotNull() {
            addCriterion("shopping_guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdEqualTo(String value) {
            addCriterion("shopping_guide_id =", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdNotEqualTo(String value) {
            addCriterion("shopping_guide_id <>", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdGreaterThan(String value) {
            addCriterion("shopping_guide_id >", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_id >=", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdLessThan(String value) {
            addCriterion("shopping_guide_id <", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_id <=", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdLike(String value) {
            addCriterion("shopping_guide_id like", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdNotLike(String value) {
            addCriterion("shopping_guide_id not like", value, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdIn(List<String> values) {
            addCriterion("shopping_guide_id in", values, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdNotIn(List<String> values) {
            addCriterion("shopping_guide_id not in", values, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdBetween(String value1, String value2) {
            addCriterion("shopping_guide_id between", value1, value2, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIdNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_id not between", value1, value2, "shoppingGuideId");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameIsNull() {
            addCriterion("shopping_guide_name is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameIsNotNull() {
            addCriterion("shopping_guide_name is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameEqualTo(String value) {
            addCriterion("shopping_guide_name =", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameNotEqualTo(String value) {
            addCriterion("shopping_guide_name <>", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameGreaterThan(String value) {
            addCriterion("shopping_guide_name >", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_name >=", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameLessThan(String value) {
            addCriterion("shopping_guide_name <", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_name <=", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameLike(String value) {
            addCriterion("shopping_guide_name like", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameNotLike(String value) {
            addCriterion("shopping_guide_name not like", value, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameIn(List<String> values) {
            addCriterion("shopping_guide_name in", values, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameNotIn(List<String> values) {
            addCriterion("shopping_guide_name not in", values, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameBetween(String value1, String value2) {
            addCriterion("shopping_guide_name between", value1, value2, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideNameNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_name not between", value1, value2, "shoppingGuideName");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneIsNull() {
            addCriterion("shopping_guide_phone is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneIsNotNull() {
            addCriterion("shopping_guide_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneEqualTo(String value) {
            addCriterion("shopping_guide_phone =", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneNotEqualTo(String value) {
            addCriterion("shopping_guide_phone <>", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneGreaterThan(String value) {
            addCriterion("shopping_guide_phone >", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_phone >=", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneLessThan(String value) {
            addCriterion("shopping_guide_phone <", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_phone <=", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneLike(String value) {
            addCriterion("shopping_guide_phone like", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneNotLike(String value) {
            addCriterion("shopping_guide_phone not like", value, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneIn(List<String> values) {
            addCriterion("shopping_guide_phone in", values, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneNotIn(List<String> values) {
            addCriterion("shopping_guide_phone not in", values, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneBetween(String value1, String value2) {
            addCriterion("shopping_guide_phone between", value1, value2, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePhoneNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_phone not between", value1, value2, "shoppingGuidePhone");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageIsNull() {
            addCriterion("shopping_guide_image is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageIsNotNull() {
            addCriterion("shopping_guide_image is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageEqualTo(String value) {
            addCriterion("shopping_guide_image =", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageNotEqualTo(String value) {
            addCriterion("shopping_guide_image <>", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageGreaterThan(String value) {
            addCriterion("shopping_guide_image >", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_image >=", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageLessThan(String value) {
            addCriterion("shopping_guide_image <", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_image <=", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageLike(String value) {
            addCriterion("shopping_guide_image like", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageNotLike(String value) {
            addCriterion("shopping_guide_image not like", value, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageIn(List<String> values) {
            addCriterion("shopping_guide_image in", values, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageNotIn(List<String> values) {
            addCriterion("shopping_guide_image not in", values, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageBetween(String value1, String value2) {
            addCriterion("shopping_guide_image between", value1, value2, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideImageNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_image not between", value1, value2, "shoppingGuideImage");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleIsNull() {
            addCriterion("shopping_guide_sale is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleIsNotNull() {
            addCriterion("shopping_guide_sale is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleEqualTo(String value) {
            addCriterion("shopping_guide_sale =", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleNotEqualTo(String value) {
            addCriterion("shopping_guide_sale <>", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleGreaterThan(String value) {
            addCriterion("shopping_guide_sale >", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_sale >=", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleLessThan(String value) {
            addCriterion("shopping_guide_sale <", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_sale <=", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleLike(String value) {
            addCriterion("shopping_guide_sale like", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleNotLike(String value) {
            addCriterion("shopping_guide_sale not like", value, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleIn(List<String> values) {
            addCriterion("shopping_guide_sale in", values, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleNotIn(List<String> values) {
            addCriterion("shopping_guide_sale not in", values, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleBetween(String value1, String value2) {
            addCriterion("shopping_guide_sale between", value1, value2, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSaleNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_sale not between", value1, value2, "shoppingGuideSale");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointIsNull() {
            addCriterion("shopping_guide_appoint is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointIsNotNull() {
            addCriterion("shopping_guide_appoint is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointEqualTo(String value) {
            addCriterion("shopping_guide_appoint =", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointNotEqualTo(String value) {
            addCriterion("shopping_guide_appoint <>", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointGreaterThan(String value) {
            addCriterion("shopping_guide_appoint >", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_appoint >=", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointLessThan(String value) {
            addCriterion("shopping_guide_appoint <", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_appoint <=", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointLike(String value) {
            addCriterion("shopping_guide_appoint like", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointNotLike(String value) {
            addCriterion("shopping_guide_appoint not like", value, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointIn(List<String> values) {
            addCriterion("shopping_guide_appoint in", values, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointNotIn(List<String> values) {
            addCriterion("shopping_guide_appoint not in", values, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointBetween(String value1, String value2) {
            addCriterion("shopping_guide_appoint between", value1, value2, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideAppointNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_appoint not between", value1, value2, "shoppingGuideAppoint");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeIsNull() {
            addCriterion("shopping_guide_recharge is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeIsNotNull() {
            addCriterion("shopping_guide_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeEqualTo(String value) {
            addCriterion("shopping_guide_recharge =", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeNotEqualTo(String value) {
            addCriterion("shopping_guide_recharge <>", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeGreaterThan(String value) {
            addCriterion("shopping_guide_recharge >", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_recharge >=", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeLessThan(String value) {
            addCriterion("shopping_guide_recharge <", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_recharge <=", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeLike(String value) {
            addCriterion("shopping_guide_recharge like", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeNotLike(String value) {
            addCriterion("shopping_guide_recharge not like", value, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeIn(List<String> values) {
            addCriterion("shopping_guide_recharge in", values, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeNotIn(List<String> values) {
            addCriterion("shopping_guide_recharge not in", values, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeBetween(String value1, String value2) {
            addCriterion("shopping_guide_recharge between", value1, value2, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRechargeNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_recharge not between", value1, value2, "shoppingGuideRecharge");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardIsNull() {
            addCriterion("shopping_guide_subcard is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardIsNotNull() {
            addCriterion("shopping_guide_subcard is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardEqualTo(String value) {
            addCriterion("shopping_guide_subcard =", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardNotEqualTo(String value) {
            addCriterion("shopping_guide_subcard <>", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardGreaterThan(String value) {
            addCriterion("shopping_guide_subcard >", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_subcard >=", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardLessThan(String value) {
            addCriterion("shopping_guide_subcard <", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_subcard <=", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardLike(String value) {
            addCriterion("shopping_guide_subcard like", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardNotLike(String value) {
            addCriterion("shopping_guide_subcard not like", value, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardIn(List<String> values) {
            addCriterion("shopping_guide_subcard in", values, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardNotIn(List<String> values) {
            addCriterion("shopping_guide_subcard not in", values, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardBetween(String value1, String value2) {
            addCriterion("shopping_guide_subcard between", value1, value2, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideSubcardNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_subcard not between", value1, value2, "shoppingGuideSubcard");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarIsNull() {
            addCriterion("shopping_guide_shoppingcar is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarIsNotNull() {
            addCriterion("shopping_guide_shoppingcar is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarEqualTo(String value) {
            addCriterion("shopping_guide_shoppingcar =", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarNotEqualTo(String value) {
            addCriterion("shopping_guide_shoppingcar <>", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarGreaterThan(String value) {
            addCriterion("shopping_guide_shoppingcar >", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_shoppingcar >=", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarLessThan(String value) {
            addCriterion("shopping_guide_shoppingcar <", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_shoppingcar <=", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarLike(String value) {
            addCriterion("shopping_guide_shoppingcar like", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarNotLike(String value) {
            addCriterion("shopping_guide_shoppingcar not like", value, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarIn(List<String> values) {
            addCriterion("shopping_guide_shoppingcar in", values, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarNotIn(List<String> values) {
            addCriterion("shopping_guide_shoppingcar not in", values, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarBetween(String value1, String value2) {
            addCriterion("shopping_guide_shoppingcar between", value1, value2, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideShoppingcarNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_shoppingcar not between", value1, value2, "shoppingGuideShoppingcar");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabIsNull() {
            addCriterion("shopping_guide_lab is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabIsNotNull() {
            addCriterion("shopping_guide_lab is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabEqualTo(String value) {
            addCriterion("shopping_guide_lab =", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabNotEqualTo(String value) {
            addCriterion("shopping_guide_lab <>", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabGreaterThan(String value) {
            addCriterion("shopping_guide_lab >", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_lab >=", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabLessThan(String value) {
            addCriterion("shopping_guide_lab <", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_lab <=", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabLike(String value) {
            addCriterion("shopping_guide_lab like", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabNotLike(String value) {
            addCriterion("shopping_guide_lab not like", value, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabIn(List<String> values) {
            addCriterion("shopping_guide_lab in", values, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabNotIn(List<String> values) {
            addCriterion("shopping_guide_lab not in", values, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabBetween(String value1, String value2) {
            addCriterion("shopping_guide_lab between", value1, value2, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideLabNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_lab not between", value1, value2, "shoppingGuideLab");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberIsNull() {
            addCriterion("shopping_guide_ismember is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberIsNotNull() {
            addCriterion("shopping_guide_ismember is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberEqualTo(Integer value) {
            addCriterion("shopping_guide_ismember =", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberNotEqualTo(Integer value) {
            addCriterion("shopping_guide_ismember <>", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberGreaterThan(Integer value) {
            addCriterion("shopping_guide_ismember >", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_guide_ismember >=", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberLessThan(Integer value) {
            addCriterion("shopping_guide_ismember <", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_guide_ismember <=", value, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberIn(List<Integer> values) {
            addCriterion("shopping_guide_ismember in", values, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberNotIn(List<Integer> values) {
            addCriterion("shopping_guide_ismember not in", values, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberBetween(Integer value1, Integer value2) {
            addCriterion("shopping_guide_ismember between", value1, value2, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideIsmemberNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_guide_ismember not between", value1, value2, "shoppingGuideIsmember");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreIsNull() {
            addCriterion("shopping_guide_cashier_store is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreIsNotNull() {
            addCriterion("shopping_guide_cashier_store is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreEqualTo(String value) {
            addCriterion("shopping_guide_cashier_store =", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreNotEqualTo(String value) {
            addCriterion("shopping_guide_cashier_store <>", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreGreaterThan(String value) {
            addCriterion("shopping_guide_cashier_store >", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_cashier_store >=", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreLessThan(String value) {
            addCriterion("shopping_guide_cashier_store <", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_cashier_store <=", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreLike(String value) {
            addCriterion("shopping_guide_cashier_store like", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreNotLike(String value) {
            addCriterion("shopping_guide_cashier_store not like", value, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreIn(List<String> values) {
            addCriterion("shopping_guide_cashier_store in", values, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreNotIn(List<String> values) {
            addCriterion("shopping_guide_cashier_store not in", values, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreBetween(String value1, String value2) {
            addCriterion("shopping_guide_cashier_store between", value1, value2, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideCashierStoreNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_cashier_store not between", value1, value2, "shoppingGuideCashierStore");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleIsNull() {
            addCriterion("shopping_guide_role is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleIsNotNull() {
            addCriterion("shopping_guide_role is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleEqualTo(String value) {
            addCriterion("shopping_guide_role =", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleNotEqualTo(String value) {
            addCriterion("shopping_guide_role <>", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleGreaterThan(String value) {
            addCriterion("shopping_guide_role >", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_role >=", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleLessThan(String value) {
            addCriterion("shopping_guide_role <", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_role <=", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleLike(String value) {
            addCriterion("shopping_guide_role like", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleNotLike(String value) {
            addCriterion("shopping_guide_role not like", value, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleIn(List<String> values) {
            addCriterion("shopping_guide_role in", values, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleNotIn(List<String> values) {
            addCriterion("shopping_guide_role not in", values, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleBetween(String value1, String value2) {
            addCriterion("shopping_guide_role between", value1, value2, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideRoleNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_role not between", value1, value2, "shoppingGuideRole");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordIsNull() {
            addCriterion("shopping_guide_password is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordIsNotNull() {
            addCriterion("shopping_guide_password is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordEqualTo(String value) {
            addCriterion("shopping_guide_password =", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordNotEqualTo(String value) {
            addCriterion("shopping_guide_password <>", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordGreaterThan(String value) {
            addCriterion("shopping_guide_password >", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("shopping_guide_password >=", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordLessThan(String value) {
            addCriterion("shopping_guide_password <", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordLessThanOrEqualTo(String value) {
            addCriterion("shopping_guide_password <=", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordLike(String value) {
            addCriterion("shopping_guide_password like", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordNotLike(String value) {
            addCriterion("shopping_guide_password not like", value, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordIn(List<String> values) {
            addCriterion("shopping_guide_password in", values, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordNotIn(List<String> values) {
            addCriterion("shopping_guide_password not in", values, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordBetween(String value1, String value2) {
            addCriterion("shopping_guide_password between", value1, value2, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuidePasswordNotBetween(String value1, String value2) {
            addCriterion("shopping_guide_password not between", value1, value2, "shoppingGuidePassword");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateIsNull() {
            addCriterion("shopping_guide_state is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateIsNotNull() {
            addCriterion("shopping_guide_state is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateEqualTo(Integer value) {
            addCriterion("shopping_guide_state =", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateNotEqualTo(Integer value) {
            addCriterion("shopping_guide_state <>", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateGreaterThan(Integer value) {
            addCriterion("shopping_guide_state >", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_guide_state >=", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateLessThan(Integer value) {
            addCriterion("shopping_guide_state <", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_guide_state <=", value, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateIn(List<Integer> values) {
            addCriterion("shopping_guide_state in", values, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateNotIn(List<Integer> values) {
            addCriterion("shopping_guide_state not in", values, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateBetween(Integer value1, Integer value2) {
            addCriterion("shopping_guide_state between", value1, value2, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andShoppingGuideStateNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_guide_state not between", value1, value2, "shoppingGuideState");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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