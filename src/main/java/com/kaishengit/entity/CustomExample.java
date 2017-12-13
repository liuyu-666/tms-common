package com.kaishengit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
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

        public Criteria andCustomNameIsNull() {
            addCriterion("custom_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("custom_name =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("custom_name <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("custom_name >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("custom_name >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("custom_name <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("custom_name <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("custom_name like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("custom_name not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("custom_name in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("custom_name not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("custom_name between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("custom_name not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomTelIsNull() {
            addCriterion("custom_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomTelIsNotNull() {
            addCriterion("custom_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTelEqualTo(String value) {
            addCriterion("custom_tel =", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelNotEqualTo(String value) {
            addCriterion("custom_tel <>", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelGreaterThan(String value) {
            addCriterion("custom_tel >", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelGreaterThanOrEqualTo(String value) {
            addCriterion("custom_tel >=", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelLessThan(String value) {
            addCriterion("custom_tel <", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelLessThanOrEqualTo(String value) {
            addCriterion("custom_tel <=", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelLike(String value) {
            addCriterion("custom_tel like", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelNotLike(String value) {
            addCriterion("custom_tel not like", value, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelIn(List<String> values) {
            addCriterion("custom_tel in", values, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelNotIn(List<String> values) {
            addCriterion("custom_tel not in", values, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelBetween(String value1, String value2) {
            addCriterion("custom_tel between", value1, value2, "customTel");
            return (Criteria) this;
        }

        public Criteria andCustomTelNotBetween(String value1, String value2) {
            addCriterion("custom_tel not between", value1, value2, "customTel");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCustomImageIsNull() {
            addCriterion("custom_image is null");
            return (Criteria) this;
        }

        public Criteria andCustomImageIsNotNull() {
            addCriterion("custom_image is not null");
            return (Criteria) this;
        }

        public Criteria andCustomImageEqualTo(String value) {
            addCriterion("custom_image =", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageNotEqualTo(String value) {
            addCriterion("custom_image <>", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageGreaterThan(String value) {
            addCriterion("custom_image >", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageGreaterThanOrEqualTo(String value) {
            addCriterion("custom_image >=", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageLessThan(String value) {
            addCriterion("custom_image <", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageLessThanOrEqualTo(String value) {
            addCriterion("custom_image <=", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageLike(String value) {
            addCriterion("custom_image like", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageNotLike(String value) {
            addCriterion("custom_image not like", value, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageIn(List<String> values) {
            addCriterion("custom_image in", values, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageNotIn(List<String> values) {
            addCriterion("custom_image not in", values, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageBetween(String value1, String value2) {
            addCriterion("custom_image between", value1, value2, "customImage");
            return (Criteria) this;
        }

        public Criteria andCustomImageNotBetween(String value1, String value2) {
            addCriterion("custom_image not between", value1, value2, "customImage");
            return (Criteria) this;
        }

        public Criteria andCardImageIsNull() {
            addCriterion("card_image is null");
            return (Criteria) this;
        }

        public Criteria andCardImageIsNotNull() {
            addCriterion("card_image is not null");
            return (Criteria) this;
        }

        public Criteria andCardImageEqualTo(String value) {
            addCriterion("card_image =", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageNotEqualTo(String value) {
            addCriterion("card_image <>", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageGreaterThan(String value) {
            addCriterion("card_image >", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageGreaterThanOrEqualTo(String value) {
            addCriterion("card_image >=", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageLessThan(String value) {
            addCriterion("card_image <", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageLessThanOrEqualTo(String value) {
            addCriterion("card_image <=", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageLike(String value) {
            addCriterion("card_image like", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageNotLike(String value) {
            addCriterion("card_image not like", value, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageIn(List<String> values) {
            addCriterion("card_image in", values, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageNotIn(List<String> values) {
            addCriterion("card_image not in", values, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageBetween(String value1, String value2) {
            addCriterion("card_image between", value1, value2, "cardImage");
            return (Criteria) this;
        }

        public Criteria andCardImageNotBetween(String value1, String value2) {
            addCriterion("card_image not between", value1, value2, "cardImage");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSixIsNull() {
            addCriterion("six is null");
            return (Criteria) this;
        }

        public Criteria andSixIsNotNull() {
            addCriterion("six is not null");
            return (Criteria) this;
        }

        public Criteria andSixEqualTo(String value) {
            addCriterion("six =", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotEqualTo(String value) {
            addCriterion("six <>", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThan(String value) {
            addCriterion("six >", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThanOrEqualTo(String value) {
            addCriterion("six >=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThan(String value) {
            addCriterion("six <", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThanOrEqualTo(String value) {
            addCriterion("six <=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLike(String value) {
            addCriterion("six like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotLike(String value) {
            addCriterion("six not like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixIn(List<String> values) {
            addCriterion("six in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotIn(List<String> values) {
            addCriterion("six not in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixBetween(String value1, String value2) {
            addCriterion("six between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotBetween(String value1, String value2) {
            addCriterion("six not between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andCardImageBackIsNull() {
            addCriterion("card_image_back is null");
            return (Criteria) this;
        }

        public Criteria andCardImageBackIsNotNull() {
            addCriterion("card_image_back is not null");
            return (Criteria) this;
        }

        public Criteria andCardImageBackEqualTo(String value) {
            addCriterion("card_image_back =", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackNotEqualTo(String value) {
            addCriterion("card_image_back <>", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackGreaterThan(String value) {
            addCriterion("card_image_back >", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackGreaterThanOrEqualTo(String value) {
            addCriterion("card_image_back >=", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackLessThan(String value) {
            addCriterion("card_image_back <", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackLessThanOrEqualTo(String value) {
            addCriterion("card_image_back <=", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackLike(String value) {
            addCriterion("card_image_back like", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackNotLike(String value) {
            addCriterion("card_image_back not like", value, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackIn(List<String> values) {
            addCriterion("card_image_back in", values, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackNotIn(List<String> values) {
            addCriterion("card_image_back not in", values, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackBetween(String value1, String value2) {
            addCriterion("card_image_back between", value1, value2, "cardImageBack");
            return (Criteria) this;
        }

        public Criteria andCardImageBackNotBetween(String value1, String value2) {
            addCriterion("card_image_back not between", value1, value2, "cardImageBack");
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