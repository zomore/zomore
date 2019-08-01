package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class CardClassificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardClassificationExample() {
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

        public Criteria andClassificationidIsNull() {
            addCriterion("classificationId is null");
            return (Criteria) this;
        }

        public Criteria andClassificationidIsNotNull() {
            addCriterion("classificationId is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationidEqualTo(Long value) {
            addCriterion("classificationId =", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotEqualTo(Long value) {
            addCriterion("classificationId <>", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidGreaterThan(Long value) {
            addCriterion("classificationId >", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidGreaterThanOrEqualTo(Long value) {
            addCriterion("classificationId >=", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidLessThan(Long value) {
            addCriterion("classificationId <", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidLessThanOrEqualTo(Long value) {
            addCriterion("classificationId <=", value, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidIn(List<Long> values) {
            addCriterion("classificationId in", values, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotIn(List<Long> values) {
            addCriterion("classificationId not in", values, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidBetween(Long value1, Long value2) {
            addCriterion("classificationId between", value1, value2, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationidNotBetween(Long value1, Long value2) {
            addCriterion("classificationId not between", value1, value2, "classificationid");
            return (Criteria) this;
        }

        public Criteria andClassificationnameIsNull() {
            addCriterion("classificationName is null");
            return (Criteria) this;
        }

        public Criteria andClassificationnameIsNotNull() {
            addCriterion("classificationName is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationnameEqualTo(String value) {
            addCriterion("classificationName =", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameNotEqualTo(String value) {
            addCriterion("classificationName <>", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameGreaterThan(String value) {
            addCriterion("classificationName >", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("classificationName >=", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameLessThan(String value) {
            addCriterion("classificationName <", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameLessThanOrEqualTo(String value) {
            addCriterion("classificationName <=", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameLike(String value) {
            addCriterion("classificationName like", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameNotLike(String value) {
            addCriterion("classificationName not like", value, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameIn(List<String> values) {
            addCriterion("classificationName in", values, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameNotIn(List<String> values) {
            addCriterion("classificationName not in", values, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameBetween(String value1, String value2) {
            addCriterion("classificationName between", value1, value2, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationnameNotBetween(String value1, String value2) {
            addCriterion("classificationName not between", value1, value2, "classificationname");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkIsNull() {
            addCriterion("classificationRemark is null");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkIsNotNull() {
            addCriterion("classificationRemark is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkEqualTo(String value) {
            addCriterion("classificationRemark =", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkNotEqualTo(String value) {
            addCriterion("classificationRemark <>", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkGreaterThan(String value) {
            addCriterion("classificationRemark >", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkGreaterThanOrEqualTo(String value) {
            addCriterion("classificationRemark >=", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkLessThan(String value) {
            addCriterion("classificationRemark <", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkLessThanOrEqualTo(String value) {
            addCriterion("classificationRemark <=", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkLike(String value) {
            addCriterion("classificationRemark like", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkNotLike(String value) {
            addCriterion("classificationRemark not like", value, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkIn(List<String> values) {
            addCriterion("classificationRemark in", values, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkNotIn(List<String> values) {
            addCriterion("classificationRemark not in", values, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkBetween(String value1, String value2) {
            addCriterion("classificationRemark between", value1, value2, "classificationremark");
            return (Criteria) this;
        }

        public Criteria andClassificationremarkNotBetween(String value1, String value2) {
            addCriterion("classificationRemark not between", value1, value2, "classificationremark");
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