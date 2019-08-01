package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreCashierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreCashierExample() {
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

        public Criteria andCashierNumberIsNull() {
            addCriterion("cashier_number is null");
            return (Criteria) this;
        }

        public Criteria andCashierNumberIsNotNull() {
            addCriterion("cashier_number is not null");
            return (Criteria) this;
        }

        public Criteria andCashierNumberEqualTo(String value) {
            addCriterion("cashier_number =", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberNotEqualTo(String value) {
            addCriterion("cashier_number <>", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberGreaterThan(String value) {
            addCriterion("cashier_number >", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_number >=", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberLessThan(String value) {
            addCriterion("cashier_number <", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberLessThanOrEqualTo(String value) {
            addCriterion("cashier_number <=", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberLike(String value) {
            addCriterion("cashier_number like", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberNotLike(String value) {
            addCriterion("cashier_number not like", value, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberIn(List<String> values) {
            addCriterion("cashier_number in", values, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberNotIn(List<String> values) {
            addCriterion("cashier_number not in", values, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberBetween(String value1, String value2) {
            addCriterion("cashier_number between", value1, value2, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNumberNotBetween(String value1, String value2) {
            addCriterion("cashier_number not between", value1, value2, "cashierNumber");
            return (Criteria) this;
        }

        public Criteria andCashierNameIsNull() {
            addCriterion("cashier_name is null");
            return (Criteria) this;
        }

        public Criteria andCashierNameIsNotNull() {
            addCriterion("cashier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCashierNameEqualTo(String value) {
            addCriterion("cashier_name =", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameNotEqualTo(String value) {
            addCriterion("cashier_name <>", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameGreaterThan(String value) {
            addCriterion("cashier_name >", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_name >=", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameLessThan(String value) {
            addCriterion("cashier_name <", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameLessThanOrEqualTo(String value) {
            addCriterion("cashier_name <=", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameLike(String value) {
            addCriterion("cashier_name like", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameNotLike(String value) {
            addCriterion("cashier_name not like", value, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameIn(List<String> values) {
            addCriterion("cashier_name in", values, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameNotIn(List<String> values) {
            addCriterion("cashier_name not in", values, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameBetween(String value1, String value2) {
            addCriterion("cashier_name between", value1, value2, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierNameNotBetween(String value1, String value2) {
            addCriterion("cashier_name not between", value1, value2, "cashierName");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIsNull() {
            addCriterion("cashier_password is null");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIsNotNull() {
            addCriterion("cashier_password is not null");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordEqualTo(String value) {
            addCriterion("cashier_password =", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotEqualTo(String value) {
            addCriterion("cashier_password <>", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordGreaterThan(String value) {
            addCriterion("cashier_password >", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_password >=", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLessThan(String value) {
            addCriterion("cashier_password <", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLessThanOrEqualTo(String value) {
            addCriterion("cashier_password <=", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordLike(String value) {
            addCriterion("cashier_password like", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotLike(String value) {
            addCriterion("cashier_password not like", value, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordIn(List<String> values) {
            addCriterion("cashier_password in", values, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotIn(List<String> values) {
            addCriterion("cashier_password not in", values, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordBetween(String value1, String value2) {
            addCriterion("cashier_password between", value1, value2, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPasswordNotBetween(String value1, String value2) {
            addCriterion("cashier_password not between", value1, value2, "cashierPassword");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneIsNull() {
            addCriterion("cashier_phone is null");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneIsNotNull() {
            addCriterion("cashier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneEqualTo(String value) {
            addCriterion("cashier_phone =", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneNotEqualTo(String value) {
            addCriterion("cashier_phone <>", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneGreaterThan(String value) {
            addCriterion("cashier_phone >", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_phone >=", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneLessThan(String value) {
            addCriterion("cashier_phone <", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneLessThanOrEqualTo(String value) {
            addCriterion("cashier_phone <=", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneLike(String value) {
            addCriterion("cashier_phone like", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneNotLike(String value) {
            addCriterion("cashier_phone not like", value, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneIn(List<String> values) {
            addCriterion("cashier_phone in", values, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneNotIn(List<String> values) {
            addCriterion("cashier_phone not in", values, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneBetween(String value1, String value2) {
            addCriterion("cashier_phone between", value1, value2, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierPhoneNotBetween(String value1, String value2) {
            addCriterion("cashier_phone not between", value1, value2, "cashierPhone");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameIsNull() {
            addCriterion("cashier_rolename is null");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameIsNotNull() {
            addCriterion("cashier_rolename is not null");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameEqualTo(String value) {
            addCriterion("cashier_rolename =", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameNotEqualTo(String value) {
            addCriterion("cashier_rolename <>", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameGreaterThan(String value) {
            addCriterion("cashier_rolename >", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_rolename >=", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameLessThan(String value) {
            addCriterion("cashier_rolename <", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameLessThanOrEqualTo(String value) {
            addCriterion("cashier_rolename <=", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameLike(String value) {
            addCriterion("cashier_rolename like", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameNotLike(String value) {
            addCriterion("cashier_rolename not like", value, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameIn(List<String> values) {
            addCriterion("cashier_rolename in", values, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameNotIn(List<String> values) {
            addCriterion("cashier_rolename not in", values, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameBetween(String value1, String value2) {
            addCriterion("cashier_rolename between", value1, value2, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierRolenameNotBetween(String value1, String value2) {
            addCriterion("cashier_rolename not between", value1, value2, "cashierRolename");
            return (Criteria) this;
        }

        public Criteria andCashierStateIsNull() {
            addCriterion("cashier_state is null");
            return (Criteria) this;
        }

        public Criteria andCashierStateIsNotNull() {
            addCriterion("cashier_state is not null");
            return (Criteria) this;
        }

        public Criteria andCashierStateEqualTo(Integer value) {
            addCriterion("cashier_state =", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateNotEqualTo(Integer value) {
            addCriterion("cashier_state <>", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateGreaterThan(Integer value) {
            addCriterion("cashier_state >", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier_state >=", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateLessThan(Integer value) {
            addCriterion("cashier_state <", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateLessThanOrEqualTo(Integer value) {
            addCriterion("cashier_state <=", value, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateIn(List<Integer> values) {
            addCriterion("cashier_state in", values, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateNotIn(List<Integer> values) {
            addCriterion("cashier_state not in", values, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateBetween(Integer value1, Integer value2) {
            addCriterion("cashier_state between", value1, value2, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier_state not between", value1, value2, "cashierState");
            return (Criteria) this;
        }

        public Criteria andCashierStoreIsNull() {
            addCriterion("cashier_store is null");
            return (Criteria) this;
        }

        public Criteria andCashierStoreIsNotNull() {
            addCriterion("cashier_store is not null");
            return (Criteria) this;
        }

        public Criteria andCashierStoreEqualTo(String value) {
            addCriterion("cashier_store =", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreNotEqualTo(String value) {
            addCriterion("cashier_store <>", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreGreaterThan(String value) {
            addCriterion("cashier_store >", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_store >=", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreLessThan(String value) {
            addCriterion("cashier_store <", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreLessThanOrEqualTo(String value) {
            addCriterion("cashier_store <=", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreLike(String value) {
            addCriterion("cashier_store like", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreNotLike(String value) {
            addCriterion("cashier_store not like", value, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreIn(List<String> values) {
            addCriterion("cashier_store in", values, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreNotIn(List<String> values) {
            addCriterion("cashier_store not in", values, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreBetween(String value1, String value2) {
            addCriterion("cashier_store between", value1, value2, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierStoreNotBetween(String value1, String value2) {
            addCriterion("cashier_store not between", value1, value2, "cashierStore");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountIsNull() {
            addCriterion("cashier_discount is null");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountIsNotNull() {
            addCriterion("cashier_discount is not null");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountEqualTo(Integer value) {
            addCriterion("cashier_discount =", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountNotEqualTo(Integer value) {
            addCriterion("cashier_discount <>", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountGreaterThan(Integer value) {
            addCriterion("cashier_discount >", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier_discount >=", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountLessThan(Integer value) {
            addCriterion("cashier_discount <", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("cashier_discount <=", value, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountIn(List<Integer> values) {
            addCriterion("cashier_discount in", values, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountNotIn(List<Integer> values) {
            addCriterion("cashier_discount not in", values, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountBetween(Integer value1, Integer value2) {
            addCriterion("cashier_discount between", value1, value2, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier_discount not between", value1, value2, "cashierDiscount");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyIsNull() {
            addCriterion("cashier_money is null");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyIsNotNull() {
            addCriterion("cashier_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyEqualTo(Double value) {
            addCriterion("cashier_money =", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyNotEqualTo(Double value) {
            addCriterion("cashier_money <>", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyGreaterThan(Double value) {
            addCriterion("cashier_money >", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cashier_money >=", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyLessThan(Double value) {
            addCriterion("cashier_money <", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyLessThanOrEqualTo(Double value) {
            addCriterion("cashier_money <=", value, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyIn(List<Double> values) {
            addCriterion("cashier_money in", values, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyNotIn(List<Double> values) {
            addCriterion("cashier_money not in", values, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyBetween(Double value1, Double value2) {
            addCriterion("cashier_money between", value1, value2, "cashierMoney");
            return (Criteria) this;
        }

        public Criteria andCashierMoneyNotBetween(Double value1, Double value2) {
            addCriterion("cashier_money not between", value1, value2, "cashierMoney");
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