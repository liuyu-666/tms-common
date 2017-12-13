package com.kaishengit.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketOrderExample() {
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

        public Criteria andPiaoNumIsNull() {
            addCriterion("piao_num is null");
            return (Criteria) this;
        }

        public Criteria andPiaoNumIsNotNull() {
            addCriterion("piao_num is not null");
            return (Criteria) this;
        }

        public Criteria andPiaoNumEqualTo(String value) {
            addCriterion("piao_num =", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumNotEqualTo(String value) {
            addCriterion("piao_num <>", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumGreaterThan(String value) {
            addCriterion("piao_num >", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumGreaterThanOrEqualTo(String value) {
            addCriterion("piao_num >=", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumLessThan(String value) {
            addCriterion("piao_num <", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumLessThanOrEqualTo(String value) {
            addCriterion("piao_num <=", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumLike(String value) {
            addCriterion("piao_num like", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumNotLike(String value) {
            addCriterion("piao_num not like", value, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumIn(List<String> values) {
            addCriterion("piao_num in", values, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumNotIn(List<String> values) {
            addCriterion("piao_num not in", values, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumBetween(String value1, String value2) {
            addCriterion("piao_num between", value1, value2, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoNumNotBetween(String value1, String value2) {
            addCriterion("piao_num not between", value1, value2, "piaoNum");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceIsNull() {
            addCriterion("piao_order_price is null");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceIsNotNull() {
            addCriterion("piao_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceEqualTo(BigDecimal value) {
            addCriterion("piao_order_price =", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("piao_order_price <>", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("piao_order_price >", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("piao_order_price >=", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceLessThan(BigDecimal value) {
            addCriterion("piao_order_price <", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("piao_order_price <=", value, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceIn(List<BigDecimal> values) {
            addCriterion("piao_order_price in", values, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("piao_order_price not in", values, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piao_order_price between", value1, value2, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andPiaoOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("piao_order_price not between", value1, value2, "piaoOrderPrice");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeIsNull() {
            addCriterion("creatr_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeIsNotNull() {
            addCriterion("creatr_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeEqualTo(Date value) {
            addCriterion("creatr_time =", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeNotEqualTo(Date value) {
            addCriterion("creatr_time <>", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeGreaterThan(Date value) {
            addCriterion("creatr_time >", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatr_time >=", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeLessThan(Date value) {
            addCriterion("creatr_time <", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeLessThanOrEqualTo(Date value) {
            addCriterion("creatr_time <=", value, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeIn(List<Date> values) {
            addCriterion("creatr_time in", values, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeNotIn(List<Date> values) {
            addCriterion("creatr_time not in", values, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeBetween(Date value1, Date value2) {
            addCriterion("creatr_time between", value1, value2, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andCreatrTimeNotBetween(Date value1, Date value2) {
            addCriterion("creatr_time not between", value1, value2, "creatrTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPiaoIdIsNull() {
            addCriterion("piao_id is null");
            return (Criteria) this;
        }

        public Criteria andPiaoIdIsNotNull() {
            addCriterion("piao_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiaoIdEqualTo(Integer value) {
            addCriterion("piao_id =", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdNotEqualTo(Integer value) {
            addCriterion("piao_id <>", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdGreaterThan(Integer value) {
            addCriterion("piao_id >", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("piao_id >=", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdLessThan(Integer value) {
            addCriterion("piao_id <", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("piao_id <=", value, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdIn(List<Integer> values) {
            addCriterion("piao_id in", values, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdNotIn(List<Integer> values) {
            addCriterion("piao_id not in", values, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdBetween(Integer value1, Integer value2) {
            addCriterion("piao_id between", value1, value2, "piaoId");
            return (Criteria) this;
        }

        public Criteria andPiaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("piao_id not between", value1, value2, "piaoId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("custom_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("custom_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(Integer value) {
            addCriterion("custom_id =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(Integer value) {
            addCriterion("custom_id <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(Integer value) {
            addCriterion("custom_id >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_id >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(Integer value) {
            addCriterion("custom_id <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(Integer value) {
            addCriterion("custom_id <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<Integer> values) {
            addCriterion("custom_id in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<Integer> values) {
            addCriterion("custom_id not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(Integer value1, Integer value2) {
            addCriterion("custom_id between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_id not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIsNull() {
            addCriterion("store_account_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIsNotNull() {
            addCriterion("store_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdEqualTo(Integer value) {
            addCriterion("store_account_id =", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotEqualTo(Integer value) {
            addCriterion("store_account_id <>", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdGreaterThan(Integer value) {
            addCriterion("store_account_id >", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_account_id >=", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdLessThan(Integer value) {
            addCriterion("store_account_id <", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_account_id <=", value, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdIn(List<Integer> values) {
            addCriterion("store_account_id in", values, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotIn(List<Integer> values) {
            addCriterion("store_account_id not in", values, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("store_account_id between", value1, value2, "storeAccountId");
            return (Criteria) this;
        }

        public Criteria andStoreAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_account_id not between", value1, value2, "storeAccountId");
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