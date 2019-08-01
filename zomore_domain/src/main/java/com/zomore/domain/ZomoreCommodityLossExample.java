package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityLossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityLossExample() {
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

        public Criteria andZomoreCashierNameIsNull() {
            addCriterion("zomore_cashier_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameIsNotNull() {
            addCriterion("zomore_cashier_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameEqualTo(String value) {
            addCriterion("zomore_cashier_name =", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameNotEqualTo(String value) {
            addCriterion("zomore_cashier_name <>", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameGreaterThan(String value) {
            addCriterion("zomore_cashier_name >", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_name >=", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameLessThan(String value) {
            addCriterion("zomore_cashier_name <", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_name <=", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameLike(String value) {
            addCriterion("zomore_cashier_name like", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameNotLike(String value) {
            addCriterion("zomore_cashier_name not like", value, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameIn(List<String> values) {
            addCriterion("zomore_cashier_name in", values, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameNotIn(List<String> values) {
            addCriterion("zomore_cashier_name not in", values, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameBetween(String value1, String value2) {
            addCriterion("zomore_cashier_name between", value1, value2, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNameNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_name not between", value1, value2, "zomoreCashierName");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberIsNull() {
            addCriterion("zomore_cashier_number is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberIsNotNull() {
            addCriterion("zomore_cashier_number is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberEqualTo(String value) {
            addCriterion("zomore_cashier_number =", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberNotEqualTo(String value) {
            addCriterion("zomore_cashier_number <>", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberGreaterThan(String value) {
            addCriterion("zomore_cashier_number >", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_number >=", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberLessThan(String value) {
            addCriterion("zomore_cashier_number <", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberLessThanOrEqualTo(String value) {
            addCriterion("zomore_cashier_number <=", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberLike(String value) {
            addCriterion("zomore_cashier_number like", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberNotLike(String value) {
            addCriterion("zomore_cashier_number not like", value, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberIn(List<String> values) {
            addCriterion("zomore_cashier_number in", values, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberNotIn(List<String> values) {
            addCriterion("zomore_cashier_number not in", values, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberBetween(String value1, String value2) {
            addCriterion("zomore_cashier_number between", value1, value2, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCashierNumberNotBetween(String value1, String value2) {
            addCriterion("zomore_cashier_number not between", value1, value2, "zomoreCashierNumber");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameIsNull() {
            addCriterion("zomore_commodity_shopname is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameIsNotNull() {
            addCriterion("zomore_commodity_shopname is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameEqualTo(String value) {
            addCriterion("zomore_commodity_shopname =", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameNotEqualTo(String value) {
            addCriterion("zomore_commodity_shopname <>", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameGreaterThan(String value) {
            addCriterion("zomore_commodity_shopname >", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shopname >=", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameLessThan(String value) {
            addCriterion("zomore_commodity_shopname <", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shopname <=", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameLike(String value) {
            addCriterion("zomore_commodity_shopname like", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameNotLike(String value) {
            addCriterion("zomore_commodity_shopname not like", value, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameIn(List<String> values) {
            addCriterion("zomore_commodity_shopname in", values, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameNotIn(List<String> values) {
            addCriterion("zomore_commodity_shopname not in", values, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shopname between", value1, value2, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopnameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shopname not between", value1, value2, "zomoreCommodityShopname");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidIsNull() {
            addCriterion("zomore_commodity_shopid is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidIsNotNull() {
            addCriterion("zomore_commodity_shopid is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidEqualTo(String value) {
            addCriterion("zomore_commodity_shopid =", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidNotEqualTo(String value) {
            addCriterion("zomore_commodity_shopid <>", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidGreaterThan(String value) {
            addCriterion("zomore_commodity_shopid >", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shopid >=", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidLessThan(String value) {
            addCriterion("zomore_commodity_shopid <", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_shopid <=", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidLike(String value) {
            addCriterion("zomore_commodity_shopid like", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidNotLike(String value) {
            addCriterion("zomore_commodity_shopid not like", value, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidIn(List<String> values) {
            addCriterion("zomore_commodity_shopid in", values, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidNotIn(List<String> values) {
            addCriterion("zomore_commodity_shopid not in", values, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shopid between", value1, value2, "zomoreCommodityShopid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityShopidNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_shopid not between", value1, value2, "zomoreCommodityShopid");
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

        public Criteria andZomoreCommodityLossTimeIsNull() {
            addCriterion("zomore_commodity_loss_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeIsNotNull() {
            addCriterion("zomore_commodity_loss_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_loss_time =", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_loss_time <>", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_loss_time >", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_loss_time >=", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeLessThan(Date value) {
            addCriterion("zomore_commodity_loss_time <", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_loss_time <=", value, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_loss_time in", values, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_loss_time not in", values, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_loss_time between", value1, value2, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_loss_time not between", value1, value2, "zomoreCommodityLossTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeIsNull() {
            addCriterion("zomore_commodity_loss_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeIsNotNull() {
            addCriterion("zomore_commodity_loss_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeEqualTo(String value) {
            addCriterion("zomore_commodity_loss_type =", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeNotEqualTo(String value) {
            addCriterion("zomore_commodity_loss_type <>", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeGreaterThan(String value) {
            addCriterion("zomore_commodity_loss_type >", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_type >=", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeLessThan(String value) {
            addCriterion("zomore_commodity_loss_type <", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_loss_type <=", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeLike(String value) {
            addCriterion("zomore_commodity_loss_type like", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeNotLike(String value) {
            addCriterion("zomore_commodity_loss_type not like", value, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeIn(List<String> values) {
            addCriterion("zomore_commodity_loss_type in", values, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeNotIn(List<String> values) {
            addCriterion("zomore_commodity_loss_type not in", values, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_type between", value1, value2, "zomoreCommodityLossType");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityLossTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_loss_type not between", value1, value2, "zomoreCommodityLossType");
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