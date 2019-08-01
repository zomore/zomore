package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreCommodityIntogoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCommodityIntogoodsExample() {
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

        public Criteria andZomoreCommodityIntogoodsIdIsNull() {
            addCriterion("zomore_commodity_intogoods_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdIsNotNull() {
            addCriterion("zomore_commodity_intogoods_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_id =", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_id <>", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_id >", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_id >=", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_id <", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_id <=", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdLike(String value) {
            addCriterion("zomore_commodity_intogoods_id like", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_id not like", value, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_id in", values, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_id not in", values, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_id between", value1, value2, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_id not between", value1, value2, "zomoreCommodityIntogoodsId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameIsNull() {
            addCriterion("zomore_commodity_intogoods_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameIsNotNull() {
            addCriterion("zomore_commodity_intogoods_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_name =", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_name <>", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_name >", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_name >=", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_name <", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_name <=", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameLike(String value) {
            addCriterion("zomore_commodity_intogoods_name like", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_name not like", value, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_name in", values, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_name not in", values, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_name between", value1, value2, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_name not between", value1, value2, "zomoreCommodityIntogoodsName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeIsNull() {
            addCriterion("zomore_commodity_intogoods_code is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeIsNotNull() {
            addCriterion("zomore_commodity_intogoods_code is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_code =", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_code <>", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_code >", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_code >=", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_code <", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_code <=", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeLike(String value) {
            addCriterion("zomore_commodity_intogoods_code like", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_code not like", value, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_code in", values, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_code not in", values, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_code between", value1, value2, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsCodeNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_code not between", value1, value2, "zomoreCommodityIntogoodsCode");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeIsNull() {
            addCriterion("zomore_commodity_intogoods_size is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeIsNotNull() {
            addCriterion("zomore_commodity_intogoods_size is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_size =", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_size <>", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeGreaterThan(Integer value) {
            addCriterion("zomore_commodity_intogoods_size >", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_size >=", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeLessThan(Integer value) {
            addCriterion("zomore_commodity_intogoods_size <", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_size <=", value, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeIn(List<Integer> values) {
            addCriterion("zomore_commodity_intogoods_size in", values, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_intogoods_size not in", values, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_intogoods_size between", value1, value2, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_intogoods_size not between", value1, value2, "zomoreCommodityIntogoodsSize");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumIsNull() {
            addCriterion("zomore_commodity_intogoods_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumIsNotNull() {
            addCriterion("zomore_commodity_intogoods_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_num =", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_num <>", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumGreaterThan(Integer value) {
            addCriterion("zomore_commodity_intogoods_num >", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_num >=", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumLessThan(Integer value) {
            addCriterion("zomore_commodity_intogoods_num <", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_intogoods_num <=", value, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumIn(List<Integer> values) {
            addCriterion("zomore_commodity_intogoods_num in", values, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_intogoods_num not in", values, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_intogoods_num between", value1, value2, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_intogoods_num not between", value1, value2, "zomoreCommodityIntogoodsNum");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceIsNull() {
            addCriterion("zomore_commodity_intogoods_avgprivice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceIsNotNull() {
            addCriterion("zomore_commodity_intogoods_avgprivice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice =", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice <>", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice >", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice >=", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice <", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice <=", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceLike(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice like", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_avgprivice not like", value, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_avgprivice in", values, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_avgprivice not in", values, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_avgprivice between", value1, value2, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsAvgpriviceNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_avgprivice not between", value1, value2, "zomoreCommodityIntogoodsAvgprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceIsNull() {
            addCriterion("zomore_commodity_intogoods_hightprivice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceIsNotNull() {
            addCriterion("zomore_commodity_intogoods_hightprivice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice =", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice <>", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice >", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice >=", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice <", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice <=", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceLike(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice like", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_hightprivice not like", value, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_hightprivice in", values, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_hightprivice not in", values, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_hightprivice between", value1, value2, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsHightpriviceNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_hightprivice not between", value1, value2, "zomoreCommodityIntogoodsHightprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceIsNull() {
            addCriterion("zomore_commodity_intogoods_lowprivice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceIsNotNull() {
            addCriterion("zomore_commodity_intogoods_lowprivice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice =", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice <>", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice >", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice >=", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice <", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice <=", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceLike(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice like", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_lowprivice not like", value, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_lowprivice in", values, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_lowprivice not in", values, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_lowprivice between", value1, value2, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsLowpriviceNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_lowprivice not between", value1, value2, "zomoreCommodityIntogoodsLowprivice");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideIsNull() {
            addCriterion("zomore_commodity_intogoods_provide is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideIsNotNull() {
            addCriterion("zomore_commodity_intogoods_provide is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_provide =", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideNotEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_provide <>", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideGreaterThan(String value) {
            addCriterion("zomore_commodity_intogoods_provide >", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_provide >=", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideLessThan(String value) {
            addCriterion("zomore_commodity_intogoods_provide <", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_intogoods_provide <=", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideLike(String value) {
            addCriterion("zomore_commodity_intogoods_provide like", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideNotLike(String value) {
            addCriterion("zomore_commodity_intogoods_provide not like", value, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_provide in", values, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideNotIn(List<String> values) {
            addCriterion("zomore_commodity_intogoods_provide not in", values, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_provide between", value1, value2, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsProvideNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_intogoods_provide not between", value1, value2, "zomoreCommodityIntogoodsProvide");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeIsNull() {
            addCriterion("zomore_commodity_intogoods_time is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeIsNotNull() {
            addCriterion("zomore_commodity_intogoods_time is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeEqualTo(Date value) {
            addCriterion("zomore_commodity_intogoods_time =", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_intogoods_time <>", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_intogoods_time >", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_intogoods_time >=", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeLessThan(Date value) {
            addCriterion("zomore_commodity_intogoods_time <", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_intogoods_time <=", value, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeIn(List<Date> values) {
            addCriterion("zomore_commodity_intogoods_time in", values, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_intogoods_time not in", values, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_intogoods_time between", value1, value2, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIntogoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_intogoods_time not between", value1, value2, "zomoreCommodityIntogoodsTime");
            return (Criteria) this;
        }

        public Criteria andShopIsNull() {
            addCriterion("shop is null");
            return (Criteria) this;
        }

        public Criteria andShopIsNotNull() {
            addCriterion("shop is not null");
            return (Criteria) this;
        }

        public Criteria andShopEqualTo(String value) {
            addCriterion("shop =", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotEqualTo(String value) {
            addCriterion("shop <>", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThan(String value) {
            addCriterion("shop >", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThanOrEqualTo(String value) {
            addCriterion("shop >=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThan(String value) {
            addCriterion("shop <", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThanOrEqualTo(String value) {
            addCriterion("shop <=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLike(String value) {
            addCriterion("shop like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotLike(String value) {
            addCriterion("shop not like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopIn(List<String> values) {
            addCriterion("shop in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotIn(List<String> values) {
            addCriterion("shop not in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopBetween(String value1, String value2) {
            addCriterion("shop between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotBetween(String value1, String value2) {
            addCriterion("shop not between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andMainidIsNull() {
            addCriterion("mainid is null");
            return (Criteria) this;
        }

        public Criteria andMainidIsNotNull() {
            addCriterion("mainid is not null");
            return (Criteria) this;
        }

        public Criteria andMainidEqualTo(String value) {
            addCriterion("mainid =", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotEqualTo(String value) {
            addCriterion("mainid <>", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThan(String value) {
            addCriterion("mainid >", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidGreaterThanOrEqualTo(String value) {
            addCriterion("mainid >=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThan(String value) {
            addCriterion("mainid <", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLessThanOrEqualTo(String value) {
            addCriterion("mainid <=", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidLike(String value) {
            addCriterion("mainid like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotLike(String value) {
            addCriterion("mainid not like", value, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidIn(List<String> values) {
            addCriterion("mainid in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotIn(List<String> values) {
            addCriterion("mainid not in", values, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidBetween(String value1, String value2) {
            addCriterion("mainid between", value1, value2, "mainid");
            return (Criteria) this;
        }

        public Criteria andMainidNotBetween(String value1, String value2) {
            addCriterion("mainid not between", value1, value2, "mainid");
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