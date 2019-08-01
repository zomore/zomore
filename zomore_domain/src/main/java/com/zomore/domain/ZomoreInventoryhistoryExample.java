package com.zomore.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZomoreInventoryhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreInventoryhistoryExample() {
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

        public Criteria andInventoryhistoryIdIsNull() {
            addCriterion("InventoryHistory_id is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdIsNotNull() {
            addCriterion("InventoryHistory_id is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdEqualTo(String value) {
            addCriterion("InventoryHistory_id =", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdNotEqualTo(String value) {
            addCriterion("InventoryHistory_id <>", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdGreaterThan(String value) {
            addCriterion("InventoryHistory_id >", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_id >=", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdLessThan(String value) {
            addCriterion("InventoryHistory_id <", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_id <=", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdLike(String value) {
            addCriterion("InventoryHistory_id like", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdNotLike(String value) {
            addCriterion("InventoryHistory_id not like", value, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdIn(List<String> values) {
            addCriterion("InventoryHistory_id in", values, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdNotIn(List<String> values) {
            addCriterion("InventoryHistory_id not in", values, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdBetween(String value1, String value2) {
            addCriterion("InventoryHistory_id between", value1, value2, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryIdNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_id not between", value1, value2, "inventoryhistoryId");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandIsNull() {
            addCriterion("InventoryHistory_brand is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandIsNotNull() {
            addCriterion("InventoryHistory_brand is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandEqualTo(String value) {
            addCriterion("InventoryHistory_brand =", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandNotEqualTo(String value) {
            addCriterion("InventoryHistory_brand <>", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandGreaterThan(String value) {
            addCriterion("InventoryHistory_brand >", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_brand >=", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandLessThan(String value) {
            addCriterion("InventoryHistory_brand <", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_brand <=", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandLike(String value) {
            addCriterion("InventoryHistory_brand like", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandNotLike(String value) {
            addCriterion("InventoryHistory_brand not like", value, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandIn(List<String> values) {
            addCriterion("InventoryHistory_brand in", values, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandNotIn(List<String> values) {
            addCriterion("InventoryHistory_brand not in", values, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandBetween(String value1, String value2) {
            addCriterion("InventoryHistory_brand between", value1, value2, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryBrandNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_brand not between", value1, value2, "inventoryhistoryBrand");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateIsNull() {
            addCriterion("InventoryHistory_date is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateIsNotNull() {
            addCriterion("InventoryHistory_date is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateEqualTo(Date value) {
            addCriterion("InventoryHistory_date =", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateNotEqualTo(Date value) {
            addCriterion("InventoryHistory_date <>", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateGreaterThan(Date value) {
            addCriterion("InventoryHistory_date >", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("InventoryHistory_date >=", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateLessThan(Date value) {
            addCriterion("InventoryHistory_date <", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateLessThanOrEqualTo(Date value) {
            addCriterion("InventoryHistory_date <=", value, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateIn(List<Date> values) {
            addCriterion("InventoryHistory_date in", values, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateNotIn(List<Date> values) {
            addCriterion("InventoryHistory_date not in", values, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateBetween(Date value1, Date value2) {
            addCriterion("InventoryHistory_date between", value1, value2, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDateNotBetween(Date value1, Date value2) {
            addCriterion("InventoryHistory_date not between", value1, value2, "inventoryhistoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationIsNull() {
            addCriterion("InventoryHistory_classification is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationIsNotNull() {
            addCriterion("InventoryHistory_classification is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationEqualTo(String value) {
            addCriterion("InventoryHistory_classification =", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationNotEqualTo(String value) {
            addCriterion("InventoryHistory_classification <>", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationGreaterThan(String value) {
            addCriterion("InventoryHistory_classification >", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_classification >=", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationLessThan(String value) {
            addCriterion("InventoryHistory_classification <", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_classification <=", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationLike(String value) {
            addCriterion("InventoryHistory_classification like", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationNotLike(String value) {
            addCriterion("InventoryHistory_classification not like", value, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationIn(List<String> values) {
            addCriterion("InventoryHistory_classification in", values, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationNotIn(List<String> values) {
            addCriterion("InventoryHistory_classification not in", values, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationBetween(String value1, String value2) {
            addCriterion("InventoryHistory_classification between", value1, value2, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryClassificationNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_classification not between", value1, value2, "inventoryhistoryClassification");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopIsNull() {
            addCriterion("InventoryHistory_shop is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopIsNotNull() {
            addCriterion("InventoryHistory_shop is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopEqualTo(String value) {
            addCriterion("InventoryHistory_shop =", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopNotEqualTo(String value) {
            addCriterion("InventoryHistory_shop <>", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopGreaterThan(String value) {
            addCriterion("InventoryHistory_shop >", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_shop >=", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopLessThan(String value) {
            addCriterion("InventoryHistory_shop <", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_shop <=", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopLike(String value) {
            addCriterion("InventoryHistory_shop like", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopNotLike(String value) {
            addCriterion("InventoryHistory_shop not like", value, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopIn(List<String> values) {
            addCriterion("InventoryHistory_shop in", values, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopNotIn(List<String> values) {
            addCriterion("InventoryHistory_shop not in", values, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopBetween(String value1, String value2) {
            addCriterion("InventoryHistory_shop between", value1, value2, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryShopNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_shop not between", value1, value2, "inventoryhistoryShop");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelIsNull() {
            addCriterion("InventoryHistory_personnel is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelIsNotNull() {
            addCriterion("InventoryHistory_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelEqualTo(String value) {
            addCriterion("InventoryHistory_personnel =", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelNotEqualTo(String value) {
            addCriterion("InventoryHistory_personnel <>", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelGreaterThan(String value) {
            addCriterion("InventoryHistory_personnel >", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_personnel >=", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelLessThan(String value) {
            addCriterion("InventoryHistory_personnel <", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_personnel <=", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelLike(String value) {
            addCriterion("InventoryHistory_personnel like", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelNotLike(String value) {
            addCriterion("InventoryHistory_personnel not like", value, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelIn(List<String> values) {
            addCriterion("InventoryHistory_personnel in", values, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelNotIn(List<String> values) {
            addCriterion("InventoryHistory_personnel not in", values, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelBetween(String value1, String value2) {
            addCriterion("InventoryHistory_personnel between", value1, value2, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryPersonnelNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_personnel not between", value1, value2, "inventoryhistoryPersonnel");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeIsNull() {
            addCriterion("InventoryHistory_mode is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeIsNotNull() {
            addCriterion("InventoryHistory_mode is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeEqualTo(String value) {
            addCriterion("InventoryHistory_mode =", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeNotEqualTo(String value) {
            addCriterion("InventoryHistory_mode <>", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeGreaterThan(String value) {
            addCriterion("InventoryHistory_mode >", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_mode >=", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeLessThan(String value) {
            addCriterion("InventoryHistory_mode <", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_mode <=", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeLike(String value) {
            addCriterion("InventoryHistory_mode like", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeNotLike(String value) {
            addCriterion("InventoryHistory_mode not like", value, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeIn(List<String> values) {
            addCriterion("InventoryHistory_mode in", values, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeNotIn(List<String> values) {
            addCriterion("InventoryHistory_mode not in", values, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeBetween(String value1, String value2) {
            addCriterion("InventoryHistory_mode between", value1, value2, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryModeNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_mode not between", value1, value2, "inventoryhistoryMode");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectIsNull() {
            addCriterion("InventoryHistory_Defect is null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectIsNotNull() {
            addCriterion("InventoryHistory_Defect is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectEqualTo(String value) {
            addCriterion("InventoryHistory_Defect =", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectNotEqualTo(String value) {
            addCriterion("InventoryHistory_Defect <>", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectGreaterThan(String value) {
            addCriterion("InventoryHistory_Defect >", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectGreaterThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_Defect >=", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectLessThan(String value) {
            addCriterion("InventoryHistory_Defect <", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectLessThanOrEqualTo(String value) {
            addCriterion("InventoryHistory_Defect <=", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectLike(String value) {
            addCriterion("InventoryHistory_Defect like", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectNotLike(String value) {
            addCriterion("InventoryHistory_Defect not like", value, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectIn(List<String> values) {
            addCriterion("InventoryHistory_Defect in", values, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectNotIn(List<String> values) {
            addCriterion("InventoryHistory_Defect not in", values, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectBetween(String value1, String value2) {
            addCriterion("InventoryHistory_Defect between", value1, value2, "inventoryhistoryDefect");
            return (Criteria) this;
        }

        public Criteria andInventoryhistoryDefectNotBetween(String value1, String value2) {
            addCriterion("InventoryHistory_Defect not between", value1, value2, "inventoryhistoryDefect");
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