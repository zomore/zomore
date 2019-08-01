package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreServiceCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreServiceCommodityExample() {
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

        public Criteria andServiceCommodityIdIsNull() {
            addCriterion("service_commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdIsNotNull() {
            addCriterion("service_commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdEqualTo(String value) {
            addCriterion("service_commodity_id =", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdNotEqualTo(String value) {
            addCriterion("service_commodity_id <>", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdGreaterThan(String value) {
            addCriterion("service_commodity_id >", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_id >=", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdLessThan(String value) {
            addCriterion("service_commodity_id <", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_id <=", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdLike(String value) {
            addCriterion("service_commodity_id like", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdNotLike(String value) {
            addCriterion("service_commodity_id not like", value, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdIn(List<String> values) {
            addCriterion("service_commodity_id in", values, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdNotIn(List<String> values) {
            addCriterion("service_commodity_id not in", values, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdBetween(String value1, String value2) {
            addCriterion("service_commodity_id between", value1, value2, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIdNotBetween(String value1, String value2) {
            addCriterion("service_commodity_id not between", value1, value2, "serviceCommodityId");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameIsNull() {
            addCriterion("service_commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameIsNotNull() {
            addCriterion("service_commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameEqualTo(String value) {
            addCriterion("service_commodity_name =", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameNotEqualTo(String value) {
            addCriterion("service_commodity_name <>", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameGreaterThan(String value) {
            addCriterion("service_commodity_name >", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_name >=", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameLessThan(String value) {
            addCriterion("service_commodity_name <", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_name <=", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameLike(String value) {
            addCriterion("service_commodity_name like", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameNotLike(String value) {
            addCriterion("service_commodity_name not like", value, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameIn(List<String> values) {
            addCriterion("service_commodity_name in", values, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameNotIn(List<String> values) {
            addCriterion("service_commodity_name not in", values, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameBetween(String value1, String value2) {
            addCriterion("service_commodity_name between", value1, value2, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityNameNotBetween(String value1, String value2) {
            addCriterion("service_commodity_name not between", value1, value2, "serviceCommodityName");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceIsNull() {
            addCriterion("service_commodity_isservice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceIsNotNull() {
            addCriterion("service_commodity_isservice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceEqualTo(Integer value) {
            addCriterion("service_commodity_isservice =", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceNotEqualTo(Integer value) {
            addCriterion("service_commodity_isservice <>", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceGreaterThan(Integer value) {
            addCriterion("service_commodity_isservice >", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isservice >=", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceLessThan(Integer value) {
            addCriterion("service_commodity_isservice <", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isservice <=", value, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceIn(List<Integer> values) {
            addCriterion("service_commodity_isservice in", values, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceNotIn(List<Integer> values) {
            addCriterion("service_commodity_isservice not in", values, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isservice between", value1, value2, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsserviceNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isservice not between", value1, value2, "serviceCommodityIsservice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainIsNull() {
            addCriterion("service_commodity_main is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainIsNotNull() {
            addCriterion("service_commodity_main is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainEqualTo(String value) {
            addCriterion("service_commodity_main =", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainNotEqualTo(String value) {
            addCriterion("service_commodity_main <>", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainGreaterThan(String value) {
            addCriterion("service_commodity_main >", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_main >=", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainLessThan(String value) {
            addCriterion("service_commodity_main <", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_main <=", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainLike(String value) {
            addCriterion("service_commodity_main like", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainNotLike(String value) {
            addCriterion("service_commodity_main not like", value, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainIn(List<String> values) {
            addCriterion("service_commodity_main in", values, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainNotIn(List<String> values) {
            addCriterion("service_commodity_main not in", values, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainBetween(String value1, String value2) {
            addCriterion("service_commodity_main between", value1, value2, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMainNotBetween(String value1, String value2) {
            addCriterion("service_commodity_main not between", value1, value2, "serviceCommodityMain");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceIsNull() {
            addCriterion("service_commodity_inprice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceIsNotNull() {
            addCriterion("service_commodity_inprice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceEqualTo(Double value) {
            addCriterion("service_commodity_inprice =", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceNotEqualTo(Double value) {
            addCriterion("service_commodity_inprice <>", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceGreaterThan(Double value) {
            addCriterion("service_commodity_inprice >", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("service_commodity_inprice >=", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceLessThan(Double value) {
            addCriterion("service_commodity_inprice <", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceLessThanOrEqualTo(Double value) {
            addCriterion("service_commodity_inprice <=", value, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceIn(List<Double> values) {
            addCriterion("service_commodity_inprice in", values, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceNotIn(List<Double> values) {
            addCriterion("service_commodity_inprice not in", values, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceBetween(Double value1, Double value2) {
            addCriterion("service_commodity_inprice between", value1, value2, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityInpriceNotBetween(Double value1, Double value2) {
            addCriterion("service_commodity_inprice not between", value1, value2, "serviceCommodityInprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceIsNull() {
            addCriterion("service_commodity_outprice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceIsNotNull() {
            addCriterion("service_commodity_outprice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceEqualTo(Double value) {
            addCriterion("service_commodity_outprice =", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceNotEqualTo(Double value) {
            addCriterion("service_commodity_outprice <>", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceGreaterThan(Double value) {
            addCriterion("service_commodity_outprice >", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("service_commodity_outprice >=", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceLessThan(Double value) {
            addCriterion("service_commodity_outprice <", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceLessThanOrEqualTo(Double value) {
            addCriterion("service_commodity_outprice <=", value, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceIn(List<Double> values) {
            addCriterion("service_commodity_outprice in", values, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceNotIn(List<Double> values) {
            addCriterion("service_commodity_outprice not in", values, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceBetween(Double value1, Double value2) {
            addCriterion("service_commodity_outprice between", value1, value2, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityOutpriceNotBetween(Double value1, Double value2) {
            addCriterion("service_commodity_outprice not between", value1, value2, "serviceCommodityOutprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountIsNull() {
            addCriterion("service_commodity_ismemberdiscount is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountIsNotNull() {
            addCriterion("service_commodity_ismemberdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountEqualTo(Integer value) {
            addCriterion("service_commodity_ismemberdiscount =", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountNotEqualTo(Integer value) {
            addCriterion("service_commodity_ismemberdiscount <>", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountGreaterThan(Integer value) {
            addCriterion("service_commodity_ismemberdiscount >", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_ismemberdiscount >=", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountLessThan(Integer value) {
            addCriterion("service_commodity_ismemberdiscount <", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_ismemberdiscount <=", value, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountIn(List<Integer> values) {
            addCriterion("service_commodity_ismemberdiscount in", values, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountNotIn(List<Integer> values) {
            addCriterion("service_commodity_ismemberdiscount not in", values, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_ismemberdiscount between", value1, value2, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsmemberdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_ismemberdiscount not between", value1, value2, "serviceCommodityIsmemberdiscount");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceIsNull() {
            addCriterion("service_commodity_membershipprice is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceIsNotNull() {
            addCriterion("service_commodity_membershipprice is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceEqualTo(Double value) {
            addCriterion("service_commodity_membershipprice =", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceNotEqualTo(Double value) {
            addCriterion("service_commodity_membershipprice <>", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceGreaterThan(Double value) {
            addCriterion("service_commodity_membershipprice >", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("service_commodity_membershipprice >=", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceLessThan(Double value) {
            addCriterion("service_commodity_membershipprice <", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceLessThanOrEqualTo(Double value) {
            addCriterion("service_commodity_membershipprice <=", value, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceIn(List<Double> values) {
            addCriterion("service_commodity_membershipprice in", values, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceNotIn(List<Double> values) {
            addCriterion("service_commodity_membershipprice not in", values, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceBetween(Double value1, Double value2) {
            addCriterion("service_commodity_membershipprice between", value1, value2, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityMembershippriceNotBetween(Double value1, Double value2) {
            addCriterion("service_commodity_membershipprice not between", value1, value2, "serviceCommodityMembershipprice");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeIsNull() {
            addCriterion("service_commodity_pinyincode is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeIsNotNull() {
            addCriterion("service_commodity_pinyincode is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeEqualTo(String value) {
            addCriterion("service_commodity_pinyincode =", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeNotEqualTo(String value) {
            addCriterion("service_commodity_pinyincode <>", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeGreaterThan(String value) {
            addCriterion("service_commodity_pinyincode >", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_pinyincode >=", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeLessThan(String value) {
            addCriterion("service_commodity_pinyincode <", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_pinyincode <=", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeLike(String value) {
            addCriterion("service_commodity_pinyincode like", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeNotLike(String value) {
            addCriterion("service_commodity_pinyincode not like", value, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeIn(List<String> values) {
            addCriterion("service_commodity_pinyincode in", values, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeNotIn(List<String> values) {
            addCriterion("service_commodity_pinyincode not in", values, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeBetween(String value1, String value2) {
            addCriterion("service_commodity_pinyincode between", value1, value2, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityPinyincodeNotBetween(String value1, String value2) {
            addCriterion("service_commodity_pinyincode not between", value1, value2, "serviceCommodityPinyincode");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeIsNull() {
            addCriterion("service_commodity_createtime is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeIsNotNull() {
            addCriterion("service_commodity_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeEqualTo(Date value) {
            addCriterion("service_commodity_createtime =", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeNotEqualTo(Date value) {
            addCriterion("service_commodity_createtime <>", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeGreaterThan(Date value) {
            addCriterion("service_commodity_createtime >", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_commodity_createtime >=", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeLessThan(Date value) {
            addCriterion("service_commodity_createtime <", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("service_commodity_createtime <=", value, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeIn(List<Date> values) {
            addCriterion("service_commodity_createtime in", values, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeNotIn(List<Date> values) {
            addCriterion("service_commodity_createtime not in", values, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeBetween(Date value1, Date value2) {
            addCriterion("service_commodity_createtime between", value1, value2, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("service_commodity_createtime not between", value1, value2, "serviceCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateIsNull() {
            addCriterion("service_commodity_state is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateIsNotNull() {
            addCriterion("service_commodity_state is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateEqualTo(Integer value) {
            addCriterion("service_commodity_state =", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateNotEqualTo(Integer value) {
            addCriterion("service_commodity_state <>", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateGreaterThan(Integer value) {
            addCriterion("service_commodity_state >", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_state >=", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateLessThan(Integer value) {
            addCriterion("service_commodity_state <", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_state <=", value, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateIn(List<Integer> values) {
            addCriterion("service_commodity_state in", values, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateNotIn(List<Integer> values) {
            addCriterion("service_commodity_state not in", values, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_state between", value1, value2, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_state not between", value1, value2, "serviceCommodityState");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopIsNull() {
            addCriterion("service_commodity_shop is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopIsNotNull() {
            addCriterion("service_commodity_shop is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopEqualTo(String value) {
            addCriterion("service_commodity_shop =", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopNotEqualTo(String value) {
            addCriterion("service_commodity_shop <>", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopGreaterThan(String value) {
            addCriterion("service_commodity_shop >", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_shop >=", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopLessThan(String value) {
            addCriterion("service_commodity_shop <", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_shop <=", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopLike(String value) {
            addCriterion("service_commodity_shop like", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopNotLike(String value) {
            addCriterion("service_commodity_shop not like", value, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopIn(List<String> values) {
            addCriterion("service_commodity_shop in", values, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopNotIn(List<String> values) {
            addCriterion("service_commodity_shop not in", values, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopBetween(String value1, String value2) {
            addCriterion("service_commodity_shop between", value1, value2, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityShopNotBetween(String value1, String value2) {
            addCriterion("service_commodity_shop not between", value1, value2, "serviceCommodityShop");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeIsNull() {
            addCriterion("service_commodity_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeIsNotNull() {
            addCriterion("service_commodity_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeEqualTo(String value) {
            addCriterion("service_commodity_type =", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeNotEqualTo(String value) {
            addCriterion("service_commodity_type <>", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeGreaterThan(String value) {
            addCriterion("service_commodity_type >", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_type >=", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeLessThan(String value) {
            addCriterion("service_commodity_type <", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_type <=", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeLike(String value) {
            addCriterion("service_commodity_type like", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeNotLike(String value) {
            addCriterion("service_commodity_type not like", value, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeIn(List<String> values) {
            addCriterion("service_commodity_type in", values, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeNotIn(List<String> values) {
            addCriterion("service_commodity_type not in", values, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeBetween(String value1, String value2) {
            addCriterion("service_commodity_type between", value1, value2, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityTypeNotBetween(String value1, String value2) {
            addCriterion("service_commodity_type not between", value1, value2, "serviceCommodityType");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberIsNull() {
            addCriterion("service_commodity_labber is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberIsNotNull() {
            addCriterion("service_commodity_labber is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberEqualTo(String value) {
            addCriterion("service_commodity_labber =", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberNotEqualTo(String value) {
            addCriterion("service_commodity_labber <>", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberGreaterThan(String value) {
            addCriterion("service_commodity_labber >", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_labber >=", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberLessThan(String value) {
            addCriterion("service_commodity_labber <", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_labber <=", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberLike(String value) {
            addCriterion("service_commodity_labber like", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberNotLike(String value) {
            addCriterion("service_commodity_labber not like", value, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberIn(List<String> values) {
            addCriterion("service_commodity_labber in", values, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberNotIn(List<String> values) {
            addCriterion("service_commodity_labber not in", values, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberBetween(String value1, String value2) {
            addCriterion("service_commodity_labber between", value1, value2, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityLabberNotBetween(String value1, String value2) {
            addCriterion("service_commodity_labber not between", value1, value2, "serviceCommodityLabber");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralIsNull() {
            addCriterion("service_commodity_isintegral is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralIsNotNull() {
            addCriterion("service_commodity_isintegral is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralEqualTo(Integer value) {
            addCriterion("service_commodity_isintegral =", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralNotEqualTo(Integer value) {
            addCriterion("service_commodity_isintegral <>", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralGreaterThan(Integer value) {
            addCriterion("service_commodity_isintegral >", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isintegral >=", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralLessThan(Integer value) {
            addCriterion("service_commodity_isintegral <", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isintegral <=", value, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralIn(List<Integer> values) {
            addCriterion("service_commodity_isintegral in", values, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralNotIn(List<Integer> values) {
            addCriterion("service_commodity_isintegral not in", values, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isintegral between", value1, value2, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isintegral not between", value1, value2, "serviceCommodityIsintegral");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeIsNull() {
            addCriterion("service_commodity_integraltype is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeIsNotNull() {
            addCriterion("service_commodity_integraltype is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeEqualTo(Integer value) {
            addCriterion("service_commodity_integraltype =", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeNotEqualTo(Integer value) {
            addCriterion("service_commodity_integraltype <>", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeGreaterThan(Integer value) {
            addCriterion("service_commodity_integraltype >", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_integraltype >=", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeLessThan(Integer value) {
            addCriterion("service_commodity_integraltype <", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_integraltype <=", value, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeIn(List<Integer> values) {
            addCriterion("service_commodity_integraltype in", values, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeNotIn(List<Integer> values) {
            addCriterion("service_commodity_integraltype not in", values, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_integraltype between", value1, value2, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegraltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_integraltype not between", value1, value2, "serviceCommodityIntegraltype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueIsNull() {
            addCriterion("service_commodity_integralvalue is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueIsNotNull() {
            addCriterion("service_commodity_integralvalue is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueEqualTo(String value) {
            addCriterion("service_commodity_integralvalue =", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueNotEqualTo(String value) {
            addCriterion("service_commodity_integralvalue <>", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueGreaterThan(String value) {
            addCriterion("service_commodity_integralvalue >", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_integralvalue >=", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueLessThan(String value) {
            addCriterion("service_commodity_integralvalue <", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_integralvalue <=", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueLike(String value) {
            addCriterion("service_commodity_integralvalue like", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueNotLike(String value) {
            addCriterion("service_commodity_integralvalue not like", value, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueIn(List<String> values) {
            addCriterion("service_commodity_integralvalue in", values, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueNotIn(List<String> values) {
            addCriterion("service_commodity_integralvalue not in", values, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueBetween(String value1, String value2) {
            addCriterion("service_commodity_integralvalue between", value1, value2, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIntegralvalueNotBetween(String value1, String value2) {
            addCriterion("service_commodity_integralvalue not between", value1, value2, "serviceCommodityIntegralvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyIsNull() {
            addCriterion("service_commodity_isroyalty is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyIsNotNull() {
            addCriterion("service_commodity_isroyalty is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyEqualTo(Integer value) {
            addCriterion("service_commodity_isroyalty =", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyNotEqualTo(Integer value) {
            addCriterion("service_commodity_isroyalty <>", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyGreaterThan(Integer value) {
            addCriterion("service_commodity_isroyalty >", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isroyalty >=", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyLessThan(Integer value) {
            addCriterion("service_commodity_isroyalty <", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_isroyalty <=", value, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyIn(List<Integer> values) {
            addCriterion("service_commodity_isroyalty in", values, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyNotIn(List<Integer> values) {
            addCriterion("service_commodity_isroyalty not in", values, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isroyalty between", value1, value2, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityIsroyaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_isroyalty not between", value1, value2, "serviceCommodityIsroyalty");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeIsNull() {
            addCriterion("service_commodity_royaltytype is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeIsNotNull() {
            addCriterion("service_commodity_royaltytype is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeEqualTo(Integer value) {
            addCriterion("service_commodity_royaltytype =", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeNotEqualTo(Integer value) {
            addCriterion("service_commodity_royaltytype <>", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeGreaterThan(Integer value) {
            addCriterion("service_commodity_royaltytype >", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_royaltytype >=", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeLessThan(Integer value) {
            addCriterion("service_commodity_royaltytype <", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_commodity_royaltytype <=", value, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeIn(List<Integer> values) {
            addCriterion("service_commodity_royaltytype in", values, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeNotIn(List<Integer> values) {
            addCriterion("service_commodity_royaltytype not in", values, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_royaltytype between", value1, value2, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_commodity_royaltytype not between", value1, value2, "serviceCommodityRoyaltytype");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueIsNull() {
            addCriterion("service_commodity_royaltyvalue is null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueIsNotNull() {
            addCriterion("service_commodity_royaltyvalue is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueEqualTo(String value) {
            addCriterion("service_commodity_royaltyvalue =", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueNotEqualTo(String value) {
            addCriterion("service_commodity_royaltyvalue <>", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueGreaterThan(String value) {
            addCriterion("service_commodity_royaltyvalue >", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueGreaterThanOrEqualTo(String value) {
            addCriterion("service_commodity_royaltyvalue >=", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueLessThan(String value) {
            addCriterion("service_commodity_royaltyvalue <", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueLessThanOrEqualTo(String value) {
            addCriterion("service_commodity_royaltyvalue <=", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueLike(String value) {
            addCriterion("service_commodity_royaltyvalue like", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueNotLike(String value) {
            addCriterion("service_commodity_royaltyvalue not like", value, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueIn(List<String> values) {
            addCriterion("service_commodity_royaltyvalue in", values, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueNotIn(List<String> values) {
            addCriterion("service_commodity_royaltyvalue not in", values, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueBetween(String value1, String value2) {
            addCriterion("service_commodity_royaltyvalue between", value1, value2, "serviceCommodityRoyaltyvalue");
            return (Criteria) this;
        }

        public Criteria andServiceCommodityRoyaltyvalueNotBetween(String value1, String value2) {
            addCriterion("service_commodity_royaltyvalue not between", value1, value2, "serviceCommodityRoyaltyvalue");
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