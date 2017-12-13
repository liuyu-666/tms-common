package com.kaishengit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIsNull() {
            addCriterion("store_license is null");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIsNotNull() {
            addCriterion("store_license is not null");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseEqualTo(String value) {
            addCriterion("store_license =", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotEqualTo(String value) {
            addCriterion("store_license <>", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseGreaterThan(String value) {
            addCriterion("store_license >", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("store_license >=", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLessThan(String value) {
            addCriterion("store_license <", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLessThanOrEqualTo(String value) {
            addCriterion("store_license <=", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseLike(String value) {
            addCriterion("store_license like", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotLike(String value) {
            addCriterion("store_license not like", value, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseIn(List<String> values) {
            addCriterion("store_license in", values, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotIn(List<String> values) {
            addCriterion("store_license not in", values, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseBetween(String value1, String value2) {
            addCriterion("store_license between", value1, value2, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andStoreLicenseNotBetween(String value1, String value2) {
            addCriterion("store_license not between", value1, value2, "storeLicense");
            return (Criteria) this;
        }

        public Criteria andManagerCardIsNull() {
            addCriterion("manager_card is null");
            return (Criteria) this;
        }

        public Criteria andManagerCardIsNotNull() {
            addCriterion("manager_card is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCardEqualTo(String value) {
            addCriterion("manager_card =", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardNotEqualTo(String value) {
            addCriterion("manager_card <>", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardGreaterThan(String value) {
            addCriterion("manager_card >", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardGreaterThanOrEqualTo(String value) {
            addCriterion("manager_card >=", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardLessThan(String value) {
            addCriterion("manager_card <", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardLessThanOrEqualTo(String value) {
            addCriterion("manager_card <=", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardLike(String value) {
            addCriterion("manager_card like", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardNotLike(String value) {
            addCriterion("manager_card not like", value, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardIn(List<String> values) {
            addCriterion("manager_card in", values, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardNotIn(List<String> values) {
            addCriterion("manager_card not in", values, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardBetween(String value1, String value2) {
            addCriterion("manager_card between", value1, value2, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardNotBetween(String value1, String value2) {
            addCriterion("manager_card not between", value1, value2, "managerCard");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageIsNull() {
            addCriterion("manager_card_image is null");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageIsNotNull() {
            addCriterion("manager_card_image is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageEqualTo(String value) {
            addCriterion("manager_card_image =", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageNotEqualTo(String value) {
            addCriterion("manager_card_image <>", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageGreaterThan(String value) {
            addCriterion("manager_card_image >", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageGreaterThanOrEqualTo(String value) {
            addCriterion("manager_card_image >=", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageLessThan(String value) {
            addCriterion("manager_card_image <", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageLessThanOrEqualTo(String value) {
            addCriterion("manager_card_image <=", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageLike(String value) {
            addCriterion("manager_card_image like", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageNotLike(String value) {
            addCriterion("manager_card_image not like", value, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageIn(List<String> values) {
            addCriterion("manager_card_image in", values, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageNotIn(List<String> values) {
            addCriterion("manager_card_image not in", values, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBetween(String value1, String value2) {
            addCriterion("manager_card_image between", value1, value2, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageNotBetween(String value1, String value2) {
            addCriterion("manager_card_image not between", value1, value2, "managerCardImage");
            return (Criteria) this;
        }

        public Criteria andManagerTelIsNull() {
            addCriterion("manager_tel is null");
            return (Criteria) this;
        }

        public Criteria andManagerTelIsNotNull() {
            addCriterion("manager_tel is not null");
            return (Criteria) this;
        }

        public Criteria andManagerTelEqualTo(String value) {
            addCriterion("manager_tel =", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelNotEqualTo(String value) {
            addCriterion("manager_tel <>", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelGreaterThan(String value) {
            addCriterion("manager_tel >", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelGreaterThanOrEqualTo(String value) {
            addCriterion("manager_tel >=", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelLessThan(String value) {
            addCriterion("manager_tel <", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelLessThanOrEqualTo(String value) {
            addCriterion("manager_tel <=", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelLike(String value) {
            addCriterion("manager_tel like", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelNotLike(String value) {
            addCriterion("manager_tel not like", value, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelIn(List<String> values) {
            addCriterion("manager_tel in", values, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelNotIn(List<String> values) {
            addCriterion("manager_tel not in", values, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelBetween(String value1, String value2) {
            addCriterion("manager_tel between", value1, value2, "managerTel");
            return (Criteria) this;
        }

        public Criteria andManagerTelNotBetween(String value1, String value2) {
            addCriterion("manager_tel not between", value1, value2, "managerTel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeIsNull() {
            addCriterion("gem_latitude is null");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeIsNotNull() {
            addCriterion("gem_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeEqualTo(String value) {
            addCriterion("gem_latitude =", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeNotEqualTo(String value) {
            addCriterion("gem_latitude <>", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeGreaterThan(String value) {
            addCriterion("gem_latitude >", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("gem_latitude >=", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeLessThan(String value) {
            addCriterion("gem_latitude <", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeLessThanOrEqualTo(String value) {
            addCriterion("gem_latitude <=", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeLike(String value) {
            addCriterion("gem_latitude like", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeNotLike(String value) {
            addCriterion("gem_latitude not like", value, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeIn(List<String> values) {
            addCriterion("gem_latitude in", values, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeNotIn(List<String> values) {
            addCriterion("gem_latitude not in", values, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeBetween(String value1, String value2) {
            addCriterion("gem_latitude between", value1, value2, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLatitudeNotBetween(String value1, String value2) {
            addCriterion("gem_latitude not between", value1, value2, "gemLatitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeIsNull() {
            addCriterion("gem_longitude is null");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeIsNotNull() {
            addCriterion("gem_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeEqualTo(String value) {
            addCriterion("gem_longitude =", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeNotEqualTo(String value) {
            addCriterion("gem_longitude <>", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeGreaterThan(String value) {
            addCriterion("gem_longitude >", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("gem_longitude >=", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeLessThan(String value) {
            addCriterion("gem_longitude <", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeLessThanOrEqualTo(String value) {
            addCriterion("gem_longitude <=", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeLike(String value) {
            addCriterion("gem_longitude like", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeNotLike(String value) {
            addCriterion("gem_longitude not like", value, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeIn(List<String> values) {
            addCriterion("gem_longitude in", values, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeNotIn(List<String> values) {
            addCriterion("gem_longitude not in", values, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeBetween(String value1, String value2) {
            addCriterion("gem_longitude between", value1, value2, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andGemLongitudeNotBetween(String value1, String value2) {
            addCriterion("gem_longitude not between", value1, value2, "gemLongitude");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackIsNull() {
            addCriterion("manager_card_image_back is null");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackIsNotNull() {
            addCriterion("manager_card_image_back is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackEqualTo(String value) {
            addCriterion("manager_card_image_back =", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackNotEqualTo(String value) {
            addCriterion("manager_card_image_back <>", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackGreaterThan(String value) {
            addCriterion("manager_card_image_back >", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackGreaterThanOrEqualTo(String value) {
            addCriterion("manager_card_image_back >=", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackLessThan(String value) {
            addCriterion("manager_card_image_back <", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackLessThanOrEqualTo(String value) {
            addCriterion("manager_card_image_back <=", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackLike(String value) {
            addCriterion("manager_card_image_back like", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackNotLike(String value) {
            addCriterion("manager_card_image_back not like", value, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackIn(List<String> values) {
            addCriterion("manager_card_image_back in", values, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackNotIn(List<String> values) {
            addCriterion("manager_card_image_back not in", values, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackBetween(String value1, String value2) {
            addCriterion("manager_card_image_back between", value1, value2, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardImageBackNotBetween(String value1, String value2) {
            addCriterion("manager_card_image_back not between", value1, value2, "managerCardImageBack");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeIsNull() {
            addCriterion("manager_card_type is null");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeIsNotNull() {
            addCriterion("manager_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeEqualTo(String value) {
            addCriterion("manager_card_type =", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeNotEqualTo(String value) {
            addCriterion("manager_card_type <>", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeGreaterThan(String value) {
            addCriterion("manager_card_type >", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("manager_card_type >=", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeLessThan(String value) {
            addCriterion("manager_card_type <", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeLessThanOrEqualTo(String value) {
            addCriterion("manager_card_type <=", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeLike(String value) {
            addCriterion("manager_card_type like", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeNotLike(String value) {
            addCriterion("manager_card_type not like", value, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeIn(List<String> values) {
            addCriterion("manager_card_type in", values, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeNotIn(List<String> values) {
            addCriterion("manager_card_type not in", values, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeBetween(String value1, String value2) {
            addCriterion("manager_card_type between", value1, value2, "managerCardType");
            return (Criteria) this;
        }

        public Criteria andManagerCardTypeNotBetween(String value1, String value2) {
            addCriterion("manager_card_type not between", value1, value2, "managerCardType");
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