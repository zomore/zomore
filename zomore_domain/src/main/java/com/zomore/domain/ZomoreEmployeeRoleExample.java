package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreEmployeeRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreEmployeeRoleExample() {
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

        public Criteria andEmployeeRoleRoleidIsNull() {
            addCriterion("employee_role_roleid is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidIsNotNull() {
            addCriterion("employee_role_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidEqualTo(String value) {
            addCriterion("employee_role_roleid =", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidNotEqualTo(String value) {
            addCriterion("employee_role_roleid <>", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidGreaterThan(String value) {
            addCriterion("employee_role_roleid >", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("employee_role_roleid >=", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidLessThan(String value) {
            addCriterion("employee_role_roleid <", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidLessThanOrEqualTo(String value) {
            addCriterion("employee_role_roleid <=", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidLike(String value) {
            addCriterion("employee_role_roleid like", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidNotLike(String value) {
            addCriterion("employee_role_roleid not like", value, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidIn(List<String> values) {
            addCriterion("employee_role_roleid in", values, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidNotIn(List<String> values) {
            addCriterion("employee_role_roleid not in", values, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidBetween(String value1, String value2) {
            addCriterion("employee_role_roleid between", value1, value2, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRoleidNotBetween(String value1, String value2) {
            addCriterion("employee_role_roleid not between", value1, value2, "employeeRoleRoleid");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameIsNull() {
            addCriterion("employee_role_rolename is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameIsNotNull() {
            addCriterion("employee_role_rolename is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameEqualTo(String value) {
            addCriterion("employee_role_rolename =", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameNotEqualTo(String value) {
            addCriterion("employee_role_rolename <>", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameGreaterThan(String value) {
            addCriterion("employee_role_rolename >", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_role_rolename >=", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameLessThan(String value) {
            addCriterion("employee_role_rolename <", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameLessThanOrEqualTo(String value) {
            addCriterion("employee_role_rolename <=", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameLike(String value) {
            addCriterion("employee_role_rolename like", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameNotLike(String value) {
            addCriterion("employee_role_rolename not like", value, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameIn(List<String> values) {
            addCriterion("employee_role_rolename in", values, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameNotIn(List<String> values) {
            addCriterion("employee_role_rolename not in", values, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameBetween(String value1, String value2) {
            addCriterion("employee_role_rolename between", value1, value2, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleRolenameNotBetween(String value1, String value2) {
            addCriterion("employee_role_rolename not between", value1, value2, "employeeRoleRolename");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateIsNull() {
            addCriterion("employee_role_state is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateIsNotNull() {
            addCriterion("employee_role_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateEqualTo(Integer value) {
            addCriterion("employee_role_state =", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateNotEqualTo(Integer value) {
            addCriterion("employee_role_state <>", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateGreaterThan(Integer value) {
            addCriterion("employee_role_state >", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_role_state >=", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateLessThan(Integer value) {
            addCriterion("employee_role_state <", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateLessThanOrEqualTo(Integer value) {
            addCriterion("employee_role_state <=", value, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateIn(List<Integer> values) {
            addCriterion("employee_role_state in", values, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateNotIn(List<Integer> values) {
            addCriterion("employee_role_state not in", values, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateBetween(Integer value1, Integer value2) {
            addCriterion("employee_role_state between", value1, value2, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_role_state not between", value1, value2, "employeeRoleState");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreIsNull() {
            addCriterion("employee_role_cashier_store is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreIsNotNull() {
            addCriterion("employee_role_cashier_store is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreEqualTo(String value) {
            addCriterion("employee_role_cashier_store =", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreNotEqualTo(String value) {
            addCriterion("employee_role_cashier_store <>", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreGreaterThan(String value) {
            addCriterion("employee_role_cashier_store >", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreGreaterThanOrEqualTo(String value) {
            addCriterion("employee_role_cashier_store >=", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreLessThan(String value) {
            addCriterion("employee_role_cashier_store <", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreLessThanOrEqualTo(String value) {
            addCriterion("employee_role_cashier_store <=", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreLike(String value) {
            addCriterion("employee_role_cashier_store like", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreNotLike(String value) {
            addCriterion("employee_role_cashier_store not like", value, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreIn(List<String> values) {
            addCriterion("employee_role_cashier_store in", values, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreNotIn(List<String> values) {
            addCriterion("employee_role_cashier_store not in", values, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreBetween(String value1, String value2) {
            addCriterion("employee_role_cashier_store between", value1, value2, "employeeRoleCashierStore");
            return (Criteria) this;
        }

        public Criteria andEmployeeRoleCashierStoreNotBetween(String value1, String value2) {
            addCriterion("employee_role_cashier_store not between", value1, value2, "employeeRoleCashierStore");
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