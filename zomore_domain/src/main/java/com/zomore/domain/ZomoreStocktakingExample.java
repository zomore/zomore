package com.zomore.domain;

import java.util.ArrayList;
import java.util.List;

public class ZomoreStocktakingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZomoreStocktakingExample() {
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

        public Criteria andStocktakingIdIsNull() {
            addCriterion("stockTaking_id is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdIsNotNull() {
            addCriterion("stockTaking_id is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdEqualTo(Integer value) {
            addCriterion("stockTaking_id =", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdNotEqualTo(Integer value) {
            addCriterion("stockTaking_id <>", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdGreaterThan(Integer value) {
            addCriterion("stockTaking_id >", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_id >=", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdLessThan(Integer value) {
            addCriterion("stockTaking_id <", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdLessThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_id <=", value, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdIn(List<Integer> values) {
            addCriterion("stockTaking_id in", values, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdNotIn(List<Integer> values) {
            addCriterion("stockTaking_id not in", values, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_id between", value1, value2, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_id not between", value1, value2, "stocktakingId");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidIsNull() {
            addCriterion("stockTaking_historyid is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidIsNotNull() {
            addCriterion("stockTaking_historyid is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidEqualTo(String value) {
            addCriterion("stockTaking_historyid =", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidNotEqualTo(String value) {
            addCriterion("stockTaking_historyid <>", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidGreaterThan(String value) {
            addCriterion("stockTaking_historyid >", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidGreaterThanOrEqualTo(String value) {
            addCriterion("stockTaking_historyid >=", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidLessThan(String value) {
            addCriterion("stockTaking_historyid <", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidLessThanOrEqualTo(String value) {
            addCriterion("stockTaking_historyid <=", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidLike(String value) {
            addCriterion("stockTaking_historyid like", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidNotLike(String value) {
            addCriterion("stockTaking_historyid not like", value, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidIn(List<String> values) {
            addCriterion("stockTaking_historyid in", values, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidNotIn(List<String> values) {
            addCriterion("stockTaking_historyid not in", values, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidBetween(String value1, String value2) {
            addCriterion("stockTaking_historyid between", value1, value2, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingHistoryidNotBetween(String value1, String value2) {
            addCriterion("stockTaking_historyid not between", value1, value2, "stocktakingHistoryid");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeIsNull() {
            addCriterion("stockTaking_code is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeIsNotNull() {
            addCriterion("stockTaking_code is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeEqualTo(String value) {
            addCriterion("stockTaking_code =", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeNotEqualTo(String value) {
            addCriterion("stockTaking_code <>", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeGreaterThan(String value) {
            addCriterion("stockTaking_code >", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stockTaking_code >=", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeLessThan(String value) {
            addCriterion("stockTaking_code <", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeLessThanOrEqualTo(String value) {
            addCriterion("stockTaking_code <=", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeLike(String value) {
            addCriterion("stockTaking_code like", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeNotLike(String value) {
            addCriterion("stockTaking_code not like", value, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeIn(List<String> values) {
            addCriterion("stockTaking_code in", values, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeNotIn(List<String> values) {
            addCriterion("stockTaking_code not in", values, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeBetween(String value1, String value2) {
            addCriterion("stockTaking_code between", value1, value2, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCodeNotBetween(String value1, String value2) {
            addCriterion("stockTaking_code not between", value1, value2, "stocktakingCode");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameIsNull() {
            addCriterion("stockTaking_commodityName is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameIsNotNull() {
            addCriterion("stockTaking_commodityName is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameEqualTo(String value) {
            addCriterion("stockTaking_commodityName =", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameNotEqualTo(String value) {
            addCriterion("stockTaking_commodityName <>", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameGreaterThan(String value) {
            addCriterion("stockTaking_commodityName >", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("stockTaking_commodityName >=", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameLessThan(String value) {
            addCriterion("stockTaking_commodityName <", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("stockTaking_commodityName <=", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameLike(String value) {
            addCriterion("stockTaking_commodityName like", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameNotLike(String value) {
            addCriterion("stockTaking_commodityName not like", value, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameIn(List<String> values) {
            addCriterion("stockTaking_commodityName in", values, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameNotIn(List<String> values) {
            addCriterion("stockTaking_commodityName not in", values, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameBetween(String value1, String value2) {
            addCriterion("stockTaking_commodityName between", value1, value2, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingCommoditynameNotBetween(String value1, String value2) {
            addCriterion("stockTaking_commodityName not between", value1, value2, "stocktakingCommodityname");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceIsNull() {
            addCriterion("stockTaking_sellingPrice is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceIsNotNull() {
            addCriterion("stockTaking_sellingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceEqualTo(Double value) {
            addCriterion("stockTaking_sellingPrice =", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceNotEqualTo(Double value) {
            addCriterion("stockTaking_sellingPrice <>", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceGreaterThan(Double value) {
            addCriterion("stockTaking_sellingPrice >", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("stockTaking_sellingPrice >=", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceLessThan(Double value) {
            addCriterion("stockTaking_sellingPrice <", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceLessThanOrEqualTo(Double value) {
            addCriterion("stockTaking_sellingPrice <=", value, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceIn(List<Double> values) {
            addCriterion("stockTaking_sellingPrice in", values, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceNotIn(List<Double> values) {
            addCriterion("stockTaking_sellingPrice not in", values, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceBetween(Double value1, Double value2) {
            addCriterion("stockTaking_sellingPrice between", value1, value2, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingSellingpriceNotBetween(Double value1, Double value2) {
            addCriterion("stockTaking_sellingPrice not between", value1, value2, "stocktakingSellingprice");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberIsNull() {
            addCriterion("stockTaking_number is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberIsNotNull() {
            addCriterion("stockTaking_number is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberEqualTo(String value) {
            addCriterion("stockTaking_number =", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberNotEqualTo(String value) {
            addCriterion("stockTaking_number <>", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberGreaterThan(String value) {
            addCriterion("stockTaking_number >", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberGreaterThanOrEqualTo(String value) {
            addCriterion("stockTaking_number >=", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberLessThan(String value) {
            addCriterion("stockTaking_number <", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberLessThanOrEqualTo(String value) {
            addCriterion("stockTaking_number <=", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberLike(String value) {
            addCriterion("stockTaking_number like", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberNotLike(String value) {
            addCriterion("stockTaking_number not like", value, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberIn(List<String> values) {
            addCriterion("stockTaking_number in", values, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberNotIn(List<String> values) {
            addCriterion("stockTaking_number not in", values, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberBetween(String value1, String value2) {
            addCriterion("stockTaking_number between", value1, value2, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingNumberNotBetween(String value1, String value2) {
            addCriterion("stockTaking_number not between", value1, value2, "stocktakingNumber");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityIsNull() {
            addCriterion("stockTaking_quantity is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityIsNotNull() {
            addCriterion("stockTaking_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityEqualTo(Integer value) {
            addCriterion("stockTaking_quantity =", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityNotEqualTo(Integer value) {
            addCriterion("stockTaking_quantity <>", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityGreaterThan(Integer value) {
            addCriterion("stockTaking_quantity >", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_quantity >=", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityLessThan(Integer value) {
            addCriterion("stockTaking_quantity <", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_quantity <=", value, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityIn(List<Integer> values) {
            addCriterion("stockTaking_quantity in", values, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityNotIn(List<Integer> values) {
            addCriterion("stockTaking_quantity not in", values, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_quantity between", value1, value2, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_quantity not between", value1, value2, "stocktakingQuantity");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryIsNull() {
            addCriterion("stockTaking_existingInventory is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryIsNotNull() {
            addCriterion("stockTaking_existingInventory is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryEqualTo(Integer value) {
            addCriterion("stockTaking_existingInventory =", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryNotEqualTo(Integer value) {
            addCriterion("stockTaking_existingInventory <>", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryGreaterThan(Integer value) {
            addCriterion("stockTaking_existingInventory >", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_existingInventory >=", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryLessThan(Integer value) {
            addCriterion("stockTaking_existingInventory <", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryLessThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_existingInventory <=", value, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryIn(List<Integer> values) {
            addCriterion("stockTaking_existingInventory in", values, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryNotIn(List<Integer> values) {
            addCriterion("stockTaking_existingInventory not in", values, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_existingInventory between", value1, value2, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingExistinginventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_existingInventory not between", value1, value2, "stocktakingExistinginventory");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsIsNull() {
            addCriterion("stockTaking_netReceipts is null");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsIsNotNull() {
            addCriterion("stockTaking_netReceipts is not null");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsEqualTo(Integer value) {
            addCriterion("stockTaking_netReceipts =", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsNotEqualTo(Integer value) {
            addCriterion("stockTaking_netReceipts <>", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsGreaterThan(Integer value) {
            addCriterion("stockTaking_netReceipts >", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_netReceipts >=", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsLessThan(Integer value) {
            addCriterion("stockTaking_netReceipts <", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsLessThanOrEqualTo(Integer value) {
            addCriterion("stockTaking_netReceipts <=", value, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsIn(List<Integer> values) {
            addCriterion("stockTaking_netReceipts in", values, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsNotIn(List<Integer> values) {
            addCriterion("stockTaking_netReceipts not in", values, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_netReceipts between", value1, value2, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andStocktakingNetreceiptsNotBetween(Integer value1, Integer value2) {
            addCriterion("stockTaking_netReceipts not between", value1, value2, "stocktakingNetreceipts");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossIsNull() {
            addCriterion("inventoryDetails_profitAndLoss is null");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossIsNotNull() {
            addCriterion("inventoryDetails_profitAndLoss is not null");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossEqualTo(Double value) {
            addCriterion("inventoryDetails_profitAndLoss =", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossNotEqualTo(Double value) {
            addCriterion("inventoryDetails_profitAndLoss <>", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossGreaterThan(Double value) {
            addCriterion("inventoryDetails_profitAndLoss >", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossGreaterThanOrEqualTo(Double value) {
            addCriterion("inventoryDetails_profitAndLoss >=", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossLessThan(Double value) {
            addCriterion("inventoryDetails_profitAndLoss <", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossLessThanOrEqualTo(Double value) {
            addCriterion("inventoryDetails_profitAndLoss <=", value, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossIn(List<Double> values) {
            addCriterion("inventoryDetails_profitAndLoss in", values, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossNotIn(List<Double> values) {
            addCriterion("inventoryDetails_profitAndLoss not in", values, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossBetween(Double value1, Double value2) {
            addCriterion("inventoryDetails_profitAndLoss between", value1, value2, "inventorydetailsProfitandloss");
            return (Criteria) this;
        }

        public Criteria andInventorydetailsProfitandlossNotBetween(Double value1, Double value2) {
            addCriterion("inventoryDetails_profitAndLoss not between", value1, value2, "inventorydetailsProfitandloss");
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