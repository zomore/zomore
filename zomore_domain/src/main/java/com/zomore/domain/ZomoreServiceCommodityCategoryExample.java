package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreServiceCommodityCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreServiceCommodityCategoryExample() {
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

        public Criteria andZomoreCommodityCategoryIdIsNull() {
            addCriterion("zomore_commodity_category_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdIsNotNull() {
            addCriterion("zomore_commodity_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdEqualTo(String value) {
            addCriterion("zomore_commodity_category_id =", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdNotEqualTo(String value) {
            addCriterion("zomore_commodity_category_id <>", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdGreaterThan(String value) {
            addCriterion("zomore_commodity_category_id >", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_id >=", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdLessThan(String value) {
            addCriterion("zomore_commodity_category_id <", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_id <=", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdLike(String value) {
            addCriterion("zomore_commodity_category_id like", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdNotLike(String value) {
            addCriterion("zomore_commodity_category_id not like", value, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdIn(List<String> values) {
            addCriterion("zomore_commodity_category_id in", values, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdNotIn(List<String> values) {
            addCriterion("zomore_commodity_category_id not in", values, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_id between", value1, value2, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryIdNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_id not between", value1, value2, "zomoreCommodityCategoryId");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidIsNull() {
            addCriterion("zomore_commodity_category_parentid is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidIsNotNull() {
            addCriterion("zomore_commodity_category_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidEqualTo(String value) {
            addCriterion("zomore_commodity_category_parentid =", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidNotEqualTo(String value) {
            addCriterion("zomore_commodity_category_parentid <>", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidGreaterThan(String value) {
            addCriterion("zomore_commodity_category_parentid >", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_parentid >=", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidLessThan(String value) {
            addCriterion("zomore_commodity_category_parentid <", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_parentid <=", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidLike(String value) {
            addCriterion("zomore_commodity_category_parentid like", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidNotLike(String value) {
            addCriterion("zomore_commodity_category_parentid not like", value, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidIn(List<String> values) {
            addCriterion("zomore_commodity_category_parentid in", values, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidNotIn(List<String> values) {
            addCriterion("zomore_commodity_category_parentid not in", values, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_parentid between", value1, value2, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryParentidNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_parentid not between", value1, value2, "zomoreCommodityCategoryParentid");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameIsNull() {
            addCriterion("zomore_commodity_category_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameIsNotNull() {
            addCriterion("zomore_commodity_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameEqualTo(String value) {
            addCriterion("zomore_commodity_category_name =", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameNotEqualTo(String value) {
            addCriterion("zomore_commodity_category_name <>", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameGreaterThan(String value) {
            addCriterion("zomore_commodity_category_name >", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_name >=", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameLessThan(String value) {
            addCriterion("zomore_commodity_category_name <", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_commodity_category_name <=", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameLike(String value) {
            addCriterion("zomore_commodity_category_name like", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameNotLike(String value) {
            addCriterion("zomore_commodity_category_name not like", value, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameIn(List<String> values) {
            addCriterion("zomore_commodity_category_name in", values, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameNotIn(List<String> values) {
            addCriterion("zomore_commodity_category_name not in", values, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_name between", value1, value2, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryNameNotBetween(String value1, String value2) {
            addCriterion("zomore_commodity_category_name not between", value1, value2, "zomoreCommodityCategoryName");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityIsNull() {
            addCriterion("zomore_commodity_category_priority is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityIsNotNull() {
            addCriterion("zomore_commodity_category_priority is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityEqualTo(Integer value) {
            addCriterion("zomore_commodity_category_priority =", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_category_priority <>", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityGreaterThan(Integer value) {
            addCriterion("zomore_commodity_category_priority >", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_category_priority >=", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityLessThan(Integer value) {
            addCriterion("zomore_commodity_category_priority <", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_category_priority <=", value, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityIn(List<Integer> values) {
            addCriterion("zomore_commodity_category_priority in", values, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_category_priority not in", values, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_category_priority between", value1, value2, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCategoryPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_category_priority not between", value1, value2, "zomoreCommodityCategoryPriority");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentIsNull() {
            addCriterion("zomore_commodity_isparent is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentIsNotNull() {
            addCriterion("zomore_commodity_isparent is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentEqualTo(Integer value) {
            addCriterion("zomore_commodity_isparent =", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentNotEqualTo(Integer value) {
            addCriterion("zomore_commodity_isparent <>", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentGreaterThan(Integer value) {
            addCriterion("zomore_commodity_isparent >", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isparent >=", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentLessThan(Integer value) {
            addCriterion("zomore_commodity_isparent <", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_commodity_isparent <=", value, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentIn(List<Integer> values) {
            addCriterion("zomore_commodity_isparent in", values, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentNotIn(List<Integer> values) {
            addCriterion("zomore_commodity_isparent not in", values, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isparent between", value1, value2, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityIsparentNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_commodity_isparent not between", value1, value2, "zomoreCommodityIsparent");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIsNull() {
            addCriterion("zomore_commodity_createtime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIsNotNull() {
            addCriterion("zomore_commodity_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime =", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime <>", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_createtime >", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime >=", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeLessThan(Date value) {
            addCriterion("zomore_commodity_createtime <", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_createtime <=", value, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeIn(List<Date> values) {
            addCriterion("zomore_commodity_createtime in", values, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_createtime not in", values, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_createtime between", value1, value2, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_createtime not between", value1, value2, "zomoreCommodityCreatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeIsNull() {
            addCriterion("zomore_commodity_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeIsNotNull() {
            addCriterion("zomore_commodity_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeEqualTo(Date value) {
            addCriterion("zomore_commodity_updatetime =", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeNotEqualTo(Date value) {
            addCriterion("zomore_commodity_updatetime <>", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeGreaterThan(Date value) {
            addCriterion("zomore_commodity_updatetime >", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_updatetime >=", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeLessThan(Date value) {
            addCriterion("zomore_commodity_updatetime <", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("zomore_commodity_updatetime <=", value, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeIn(List<Date> values) {
            addCriterion("zomore_commodity_updatetime in", values, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeNotIn(List<Date> values) {
            addCriterion("zomore_commodity_updatetime not in", values, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_updatetime between", value1, value2, "zomoreCommodityUpdatetime");
            return (Criteria) this;
        }

        public Criteria andZomoreCommodityUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("zomore_commodity_updatetime not between", value1, value2, "zomoreCommodityUpdatetime");
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