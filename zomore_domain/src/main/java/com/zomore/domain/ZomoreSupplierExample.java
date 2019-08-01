package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreSupplierExample() {
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

        public Criteria andZomoreSupplierIdIsNull() {
            addCriterion("zomore_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdIsNotNull() {
            addCriterion("zomore_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdEqualTo(String value) {
            addCriterion("zomore_supplier_id =", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdNotEqualTo(String value) {
            addCriterion("zomore_supplier_id <>", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdGreaterThan(String value) {
            addCriterion("zomore_supplier_id >", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_id >=", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdLessThan(String value) {
            addCriterion("zomore_supplier_id <", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_id <=", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdLike(String value) {
            addCriterion("zomore_supplier_id like", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdNotLike(String value) {
            addCriterion("zomore_supplier_id not like", value, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdIn(List<String> values) {
            addCriterion("zomore_supplier_id in", values, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdNotIn(List<String> values) {
            addCriterion("zomore_supplier_id not in", values, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdBetween(String value1, String value2) {
            addCriterion("zomore_supplier_id between", value1, value2, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierIdNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_id not between", value1, value2, "zomoreSupplierId");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameIsNull() {
            addCriterion("zomore_supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameIsNotNull() {
            addCriterion("zomore_supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameEqualTo(String value) {
            addCriterion("zomore_supplier_name =", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameNotEqualTo(String value) {
            addCriterion("zomore_supplier_name <>", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameGreaterThan(String value) {
            addCriterion("zomore_supplier_name >", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_name >=", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameLessThan(String value) {
            addCriterion("zomore_supplier_name <", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_name <=", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameLike(String value) {
            addCriterion("zomore_supplier_name like", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameNotLike(String value) {
            addCriterion("zomore_supplier_name not like", value, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameIn(List<String> values) {
            addCriterion("zomore_supplier_name in", values, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameNotIn(List<String> values) {
            addCriterion("zomore_supplier_name not in", values, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameBetween(String value1, String value2) {
            addCriterion("zomore_supplier_name between", value1, value2, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNameNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_name not between", value1, value2, "zomoreSupplierName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinIsNull() {
            addCriterion("zomore_supplier_namepingyin is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinIsNotNull() {
            addCriterion("zomore_supplier_namepingyin is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinEqualTo(String value) {
            addCriterion("zomore_supplier_namepingyin =", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinNotEqualTo(String value) {
            addCriterion("zomore_supplier_namepingyin <>", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinGreaterThan(String value) {
            addCriterion("zomore_supplier_namepingyin >", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_namepingyin >=", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinLessThan(String value) {
            addCriterion("zomore_supplier_namepingyin <", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_namepingyin <=", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinLike(String value) {
            addCriterion("zomore_supplier_namepingyin like", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinNotLike(String value) {
            addCriterion("zomore_supplier_namepingyin not like", value, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinIn(List<String> values) {
            addCriterion("zomore_supplier_namepingyin in", values, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinNotIn(List<String> values) {
            addCriterion("zomore_supplier_namepingyin not in", values, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinBetween(String value1, String value2) {
            addCriterion("zomore_supplier_namepingyin between", value1, value2, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierNamepingyinNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_namepingyin not between", value1, value2, "zomoreSupplierNamepingyin");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameIsNull() {
            addCriterion("zomore_supplier_connect_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameIsNotNull() {
            addCriterion("zomore_supplier_connect_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameEqualTo(String value) {
            addCriterion("zomore_supplier_connect_name =", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameNotEqualTo(String value) {
            addCriterion("zomore_supplier_connect_name <>", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameGreaterThan(String value) {
            addCriterion("zomore_supplier_connect_name >", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_name >=", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameLessThan(String value) {
            addCriterion("zomore_supplier_connect_name <", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_name <=", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameLike(String value) {
            addCriterion("zomore_supplier_connect_name like", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameNotLike(String value) {
            addCriterion("zomore_supplier_connect_name not like", value, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameIn(List<String> values) {
            addCriterion("zomore_supplier_connect_name in", values, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameNotIn(List<String> values) {
            addCriterion("zomore_supplier_connect_name not in", values, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_name between", value1, value2, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectNameNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_name not between", value1, value2, "zomoreSupplierConnectName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneIsNull() {
            addCriterion("zomore_supplier_connect_phone is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneIsNotNull() {
            addCriterion("zomore_supplier_connect_phone is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneEqualTo(String value) {
            addCriterion("zomore_supplier_connect_phone =", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneNotEqualTo(String value) {
            addCriterion("zomore_supplier_connect_phone <>", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneGreaterThan(String value) {
            addCriterion("zomore_supplier_connect_phone >", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_phone >=", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneLessThan(String value) {
            addCriterion("zomore_supplier_connect_phone <", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_phone <=", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneLike(String value) {
            addCriterion("zomore_supplier_connect_phone like", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneNotLike(String value) {
            addCriterion("zomore_supplier_connect_phone not like", value, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneIn(List<String> values) {
            addCriterion("zomore_supplier_connect_phone in", values, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneNotIn(List<String> values) {
            addCriterion("zomore_supplier_connect_phone not in", values, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_phone between", value1, value2, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectPhoneNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_phone not between", value1, value2, "zomoreSupplierConnectPhone");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailIsNull() {
            addCriterion("zomore_supplier_connect_email is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailIsNotNull() {
            addCriterion("zomore_supplier_connect_email is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailEqualTo(String value) {
            addCriterion("zomore_supplier_connect_email =", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailNotEqualTo(String value) {
            addCriterion("zomore_supplier_connect_email <>", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailGreaterThan(String value) {
            addCriterion("zomore_supplier_connect_email >", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_email >=", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailLessThan(String value) {
            addCriterion("zomore_supplier_connect_email <", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_connect_email <=", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailLike(String value) {
            addCriterion("zomore_supplier_connect_email like", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailNotLike(String value) {
            addCriterion("zomore_supplier_connect_email not like", value, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailIn(List<String> values) {
            addCriterion("zomore_supplier_connect_email in", values, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailNotIn(List<String> values) {
            addCriterion("zomore_supplier_connect_email not in", values, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_email between", value1, value2, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierConnectEmailNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_connect_email not between", value1, value2, "zomoreSupplierConnectEmail");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankIsNull() {
            addCriterion("zomore_supplier_bank is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankIsNotNull() {
            addCriterion("zomore_supplier_bank is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankEqualTo(String value) {
            addCriterion("zomore_supplier_bank =", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNotEqualTo(String value) {
            addCriterion("zomore_supplier_bank <>", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankGreaterThan(String value) {
            addCriterion("zomore_supplier_bank >", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank >=", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankLessThan(String value) {
            addCriterion("zomore_supplier_bank <", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank <=", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankLike(String value) {
            addCriterion("zomore_supplier_bank like", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNotLike(String value) {
            addCriterion("zomore_supplier_bank not like", value, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankIn(List<String> values) {
            addCriterion("zomore_supplier_bank in", values, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNotIn(List<String> values) {
            addCriterion("zomore_supplier_bank not in", values, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank between", value1, value2, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank not between", value1, value2, "zomoreSupplierBank");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameIsNull() {
            addCriterion("zomore_supplier_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameIsNotNull() {
            addCriterion("zomore_supplier_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameEqualTo(String value) {
            addCriterion("zomore_supplier_bank_name =", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameNotEqualTo(String value) {
            addCriterion("zomore_supplier_bank_name <>", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameGreaterThan(String value) {
            addCriterion("zomore_supplier_bank_name >", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank_name >=", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameLessThan(String value) {
            addCriterion("zomore_supplier_bank_name <", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank_name <=", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameLike(String value) {
            addCriterion("zomore_supplier_bank_name like", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameNotLike(String value) {
            addCriterion("zomore_supplier_bank_name not like", value, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameIn(List<String> values) {
            addCriterion("zomore_supplier_bank_name in", values, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameNotIn(List<String> values) {
            addCriterion("zomore_supplier_bank_name not in", values, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank_name between", value1, value2, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNameNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank_name not between", value1, value2, "zomoreSupplierBankName");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumIsNull() {
            addCriterion("zomore_supplier_bank_num is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumIsNotNull() {
            addCriterion("zomore_supplier_bank_num is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumEqualTo(String value) {
            addCriterion("zomore_supplier_bank_num =", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumNotEqualTo(String value) {
            addCriterion("zomore_supplier_bank_num <>", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumGreaterThan(String value) {
            addCriterion("zomore_supplier_bank_num >", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank_num >=", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumLessThan(String value) {
            addCriterion("zomore_supplier_bank_num <", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_bank_num <=", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumLike(String value) {
            addCriterion("zomore_supplier_bank_num like", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumNotLike(String value) {
            addCriterion("zomore_supplier_bank_num not like", value, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumIn(List<String> values) {
            addCriterion("zomore_supplier_bank_num in", values, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumNotIn(List<String> values) {
            addCriterion("zomore_supplier_bank_num not in", values, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank_num between", value1, value2, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierBankNumNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_bank_num not between", value1, value2, "zomoreSupplierBankNum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumIsNull() {
            addCriterion("zomore_supplier_ratepaying_namenum is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumIsNotNull() {
            addCriterion("zomore_supplier_ratepaying_namenum is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumEqualTo(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum =", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumNotEqualTo(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum <>", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumGreaterThan(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum >", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum >=", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumLessThan(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum <", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum <=", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumLike(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum like", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumNotLike(String value) {
            addCriterion("zomore_supplier_ratepaying_namenum not like", value, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumIn(List<String> values) {
            addCriterion("zomore_supplier_ratepaying_namenum in", values, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumNotIn(List<String> values) {
            addCriterion("zomore_supplier_ratepaying_namenum not in", values, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumBetween(String value1, String value2) {
            addCriterion("zomore_supplier_ratepaying_namenum between", value1, value2, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierRatepayingNamenumNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_ratepaying_namenum not between", value1, value2, "zomoreSupplierRatepayingNamenum");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceIsNull() {
            addCriterion("zomore_supplier_invoice is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceIsNotNull() {
            addCriterion("zomore_supplier_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceEqualTo(String value) {
            addCriterion("zomore_supplier_invoice =", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceNotEqualTo(String value) {
            addCriterion("zomore_supplier_invoice <>", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceGreaterThan(String value) {
            addCriterion("zomore_supplier_invoice >", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_invoice >=", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceLessThan(String value) {
            addCriterion("zomore_supplier_invoice <", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_invoice <=", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceLike(String value) {
            addCriterion("zomore_supplier_invoice like", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceNotLike(String value) {
            addCriterion("zomore_supplier_invoice not like", value, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceIn(List<String> values) {
            addCriterion("zomore_supplier_invoice in", values, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceNotIn(List<String> values) {
            addCriterion("zomore_supplier_invoice not in", values, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceBetween(String value1, String value2) {
            addCriterion("zomore_supplier_invoice between", value1, value2, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierInvoiceNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_invoice not between", value1, value2, "zomoreSupplierInvoice");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeIsNull() {
            addCriterion("zomore_supplier_settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeIsNotNull() {
            addCriterion("zomore_supplier_settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_type =", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeNotEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_type <>", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeGreaterThan(String value) {
            addCriterion("zomore_supplier_settlement_type >", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_type >=", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeLessThan(String value) {
            addCriterion("zomore_supplier_settlement_type <", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_type <=", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeLike(String value) {
            addCriterion("zomore_supplier_settlement_type like", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeNotLike(String value) {
            addCriterion("zomore_supplier_settlement_type not like", value, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeIn(List<String> values) {
            addCriterion("zomore_supplier_settlement_type in", values, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeNotIn(List<String> values) {
            addCriterion("zomore_supplier_settlement_type not in", values, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeBetween(String value1, String value2) {
            addCriterion("zomore_supplier_settlement_type between", value1, value2, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_settlement_type not between", value1, value2, "zomoreSupplierSettlementType");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedIsNull() {
            addCriterion("zomore_supplier_settlement_detailed is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedIsNotNull() {
            addCriterion("zomore_supplier_settlement_detailed is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_detailed =", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedNotEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_detailed <>", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedGreaterThan(String value) {
            addCriterion("zomore_supplier_settlement_detailed >", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_detailed >=", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedLessThan(String value) {
            addCriterion("zomore_supplier_settlement_detailed <", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_settlement_detailed <=", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedLike(String value) {
            addCriterion("zomore_supplier_settlement_detailed like", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedNotLike(String value) {
            addCriterion("zomore_supplier_settlement_detailed not like", value, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedIn(List<String> values) {
            addCriterion("zomore_supplier_settlement_detailed in", values, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedNotIn(List<String> values) {
            addCriterion("zomore_supplier_settlement_detailed not in", values, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedBetween(String value1, String value2) {
            addCriterion("zomore_supplier_settlement_detailed between", value1, value2, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierSettlementDetailedNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_settlement_detailed not between", value1, value2, "zomoreSupplierSettlementDetailed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryIsNull() {
            addCriterion("zomore_supplier_returnpoint_delivery is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryIsNotNull() {
            addCriterion("zomore_supplier_returnpoint_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery =", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryNotEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery <>", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryGreaterThan(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery >", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery >=", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryLessThan(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery <", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery <=", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryLike(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery like", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryNotLike(String value) {
            addCriterion("zomore_supplier_returnpoint_delivery not like", value, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryIn(List<String> values) {
            addCriterion("zomore_supplier_returnpoint_delivery in", values, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryNotIn(List<String> values) {
            addCriterion("zomore_supplier_returnpoint_delivery not in", values, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryBetween(String value1, String value2) {
            addCriterion("zomore_supplier_returnpoint_delivery between", value1, value2, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointDeliveryNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_returnpoint_delivery not between", value1, value2, "zomoreSupplierReturnpointDelivery");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedIsNull() {
            addCriterion("zomore_supplier_returnpoint_fixed is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedIsNotNull() {
            addCriterion("zomore_supplier_returnpoint_fixed is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed =", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedNotEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed <>", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedGreaterThan(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed >", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed >=", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedLessThan(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed <", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed <=", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedLike(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed like", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedNotLike(String value) {
            addCriterion("zomore_supplier_returnpoint_fixed not like", value, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedIn(List<String> values) {
            addCriterion("zomore_supplier_returnpoint_fixed in", values, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedNotIn(List<String> values) {
            addCriterion("zomore_supplier_returnpoint_fixed not in", values, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedBetween(String value1, String value2) {
            addCriterion("zomore_supplier_returnpoint_fixed between", value1, value2, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierReturnpointFixedNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_returnpoint_fixed not between", value1, value2, "zomoreSupplierReturnpointFixed");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressIsNull() {
            addCriterion("zomore_supplier_address is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressIsNotNull() {
            addCriterion("zomore_supplier_address is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressEqualTo(String value) {
            addCriterion("zomore_supplier_address =", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressNotEqualTo(String value) {
            addCriterion("zomore_supplier_address <>", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressGreaterThan(String value) {
            addCriterion("zomore_supplier_address >", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressGreaterThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_address >=", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressLessThan(String value) {
            addCriterion("zomore_supplier_address <", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressLessThanOrEqualTo(String value) {
            addCriterion("zomore_supplier_address <=", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressLike(String value) {
            addCriterion("zomore_supplier_address like", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressNotLike(String value) {
            addCriterion("zomore_supplier_address not like", value, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressIn(List<String> values) {
            addCriterion("zomore_supplier_address in", values, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressNotIn(List<String> values) {
            addCriterion("zomore_supplier_address not in", values, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressBetween(String value1, String value2) {
            addCriterion("zomore_supplier_address between", value1, value2, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierAddressNotBetween(String value1, String value2) {
            addCriterion("zomore_supplier_address not between", value1, value2, "zomoreSupplierAddress");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeIsNull() {
            addCriterion("zomore_supplier_privilegetype is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeIsNotNull() {
            addCriterion("zomore_supplier_privilegetype is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeEqualTo(Integer value) {
            addCriterion("zomore_supplier_privilegetype =", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeNotEqualTo(Integer value) {
            addCriterion("zomore_supplier_privilegetype <>", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeGreaterThan(Integer value) {
            addCriterion("zomore_supplier_privilegetype >", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_supplier_privilegetype >=", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeLessThan(Integer value) {
            addCriterion("zomore_supplier_privilegetype <", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_supplier_privilegetype <=", value, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeIn(List<Integer> values) {
            addCriterion("zomore_supplier_privilegetype in", values, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeNotIn(List<Integer> values) {
            addCriterion("zomore_supplier_privilegetype not in", values, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_supplier_privilegetype between", value1, value2, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierPrivilegetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_supplier_privilegetype not between", value1, value2, "zomoreSupplierPrivilegetype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeIsNull() {
            addCriterion("zomore_supplier_usertype is null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeIsNotNull() {
            addCriterion("zomore_supplier_usertype is not null");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeEqualTo(Integer value) {
            addCriterion("zomore_supplier_usertype =", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeNotEqualTo(Integer value) {
            addCriterion("zomore_supplier_usertype <>", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeGreaterThan(Integer value) {
            addCriterion("zomore_supplier_usertype >", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("zomore_supplier_usertype >=", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeLessThan(Integer value) {
            addCriterion("zomore_supplier_usertype <", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("zomore_supplier_usertype <=", value, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeIn(List<Integer> values) {
            addCriterion("zomore_supplier_usertype in", values, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeNotIn(List<Integer> values) {
            addCriterion("zomore_supplier_usertype not in", values, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("zomore_supplier_usertype between", value1, value2, "zomoreSupplierUsertype");
            return (Criteria) this;
        }

        public Criteria andZomoreSupplierUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("zomore_supplier_usertype not between", value1, value2, "zomoreSupplierUsertype");
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