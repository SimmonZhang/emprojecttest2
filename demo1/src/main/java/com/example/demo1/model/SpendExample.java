package com.example.demo1.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpendExample() {
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

        public Criteria andSpendIdIsNull() {
            addCriterion("spend_id is null");
            return (Criteria) this;
        }

        public Criteria andSpendIdIsNotNull() {
            addCriterion("spend_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpendIdEqualTo(String value) {
            addCriterion("spend_id =", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdNotEqualTo(String value) {
            addCriterion("spend_id <>", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdGreaterThan(String value) {
            addCriterion("spend_id >", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdGreaterThanOrEqualTo(String value) {
            addCriterion("spend_id >=", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdLessThan(String value) {
            addCriterion("spend_id <", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdLessThanOrEqualTo(String value) {
            addCriterion("spend_id <=", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdLike(String value) {
            addCriterion("spend_id like", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdNotLike(String value) {
            addCriterion("spend_id not like", value, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdIn(List<String> values) {
            addCriterion("spend_id in", values, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdNotIn(List<String> values) {
            addCriterion("spend_id not in", values, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdBetween(String value1, String value2) {
            addCriterion("spend_id between", value1, value2, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendIdNotBetween(String value1, String value2) {
            addCriterion("spend_id not between", value1, value2, "spendId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdIsNull() {
            addCriterion("spend_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdIsNotNull() {
            addCriterion("spend_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdEqualTo(String value) {
            addCriterion("spend_user_id =", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdNotEqualTo(String value) {
            addCriterion("spend_user_id <>", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdGreaterThan(String value) {
            addCriterion("spend_user_id >", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("spend_user_id >=", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdLessThan(String value) {
            addCriterion("spend_user_id <", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdLessThanOrEqualTo(String value) {
            addCriterion("spend_user_id <=", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdLike(String value) {
            addCriterion("spend_user_id like", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdNotLike(String value) {
            addCriterion("spend_user_id not like", value, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdIn(List<String> values) {
            addCriterion("spend_user_id in", values, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdNotIn(List<String> values) {
            addCriterion("spend_user_id not in", values, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdBetween(String value1, String value2) {
            addCriterion("spend_user_id between", value1, value2, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserIdNotBetween(String value1, String value2) {
            addCriterion("spend_user_id not between", value1, value2, "spendUserId");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameIsNull() {
            addCriterion("spend_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameIsNotNull() {
            addCriterion("spend_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameEqualTo(String value) {
            addCriterion("spend_user_name =", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameNotEqualTo(String value) {
            addCriterion("spend_user_name <>", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameGreaterThan(String value) {
            addCriterion("spend_user_name >", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("spend_user_name >=", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameLessThan(String value) {
            addCriterion("spend_user_name <", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameLessThanOrEqualTo(String value) {
            addCriterion("spend_user_name <=", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameLike(String value) {
            addCriterion("spend_user_name like", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameNotLike(String value) {
            addCriterion("spend_user_name not like", value, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameIn(List<String> values) {
            addCriterion("spend_user_name in", values, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameNotIn(List<String> values) {
            addCriterion("spend_user_name not in", values, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameBetween(String value1, String value2) {
            addCriterion("spend_user_name between", value1, value2, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendUserNameNotBetween(String value1, String value2) {
            addCriterion("spend_user_name not between", value1, value2, "spendUserName");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidIsNull() {
            addCriterion("spend_houseid is null");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidIsNotNull() {
            addCriterion("spend_houseid is not null");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidEqualTo(String value) {
            addCriterion("spend_houseid =", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidNotEqualTo(String value) {
            addCriterion("spend_houseid <>", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidGreaterThan(String value) {
            addCriterion("spend_houseid >", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidGreaterThanOrEqualTo(String value) {
            addCriterion("spend_houseid >=", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidLessThan(String value) {
            addCriterion("spend_houseid <", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidLessThanOrEqualTo(String value) {
            addCriterion("spend_houseid <=", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidLike(String value) {
            addCriterion("spend_houseid like", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidNotLike(String value) {
            addCriterion("spend_houseid not like", value, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidIn(List<String> values) {
            addCriterion("spend_houseid in", values, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidNotIn(List<String> values) {
            addCriterion("spend_houseid not in", values, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidBetween(String value1, String value2) {
            addCriterion("spend_houseid between", value1, value2, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendHouseidNotBetween(String value1, String value2) {
            addCriterion("spend_houseid not between", value1, value2, "spendHouseid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidIsNull() {
            addCriterion("spend_roomid is null");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidIsNotNull() {
            addCriterion("spend_roomid is not null");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidEqualTo(String value) {
            addCriterion("spend_roomid =", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidNotEqualTo(String value) {
            addCriterion("spend_roomid <>", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidGreaterThan(String value) {
            addCriterion("spend_roomid >", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("spend_roomid >=", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidLessThan(String value) {
            addCriterion("spend_roomid <", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidLessThanOrEqualTo(String value) {
            addCriterion("spend_roomid <=", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidLike(String value) {
            addCriterion("spend_roomid like", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidNotLike(String value) {
            addCriterion("spend_roomid not like", value, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidIn(List<String> values) {
            addCriterion("spend_roomid in", values, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidNotIn(List<String> values) {
            addCriterion("spend_roomid not in", values, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidBetween(String value1, String value2) {
            addCriterion("spend_roomid between", value1, value2, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendRoomidNotBetween(String value1, String value2) {
            addCriterion("spend_roomid not between", value1, value2, "spendRoomid");
            return (Criteria) this;
        }

        public Criteria andSpendModelIsNull() {
            addCriterion("spend_model is null");
            return (Criteria) this;
        }

        public Criteria andSpendModelIsNotNull() {
            addCriterion("spend_model is not null");
            return (Criteria) this;
        }

        public Criteria andSpendModelEqualTo(String value) {
            addCriterion("spend_model =", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelNotEqualTo(String value) {
            addCriterion("spend_model <>", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelGreaterThan(String value) {
            addCriterion("spend_model >", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelGreaterThanOrEqualTo(String value) {
            addCriterion("spend_model >=", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelLessThan(String value) {
            addCriterion("spend_model <", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelLessThanOrEqualTo(String value) {
            addCriterion("spend_model <=", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelLike(String value) {
            addCriterion("spend_model like", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelNotLike(String value) {
            addCriterion("spend_model not like", value, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelIn(List<String> values) {
            addCriterion("spend_model in", values, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelNotIn(List<String> values) {
            addCriterion("spend_model not in", values, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelBetween(String value1, String value2) {
            addCriterion("spend_model between", value1, value2, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendModelNotBetween(String value1, String value2) {
            addCriterion("spend_model not between", value1, value2, "spendModel");
            return (Criteria) this;
        }

        public Criteria andSpendYearIsNull() {
            addCriterion("spend_year is null");
            return (Criteria) this;
        }

        public Criteria andSpendYearIsNotNull() {
            addCriterion("spend_year is not null");
            return (Criteria) this;
        }

        public Criteria andSpendYearEqualTo(String value) {
            addCriterion("spend_year =", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearNotEqualTo(String value) {
            addCriterion("spend_year <>", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearGreaterThan(String value) {
            addCriterion("spend_year >", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearGreaterThanOrEqualTo(String value) {
            addCriterion("spend_year >=", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearLessThan(String value) {
            addCriterion("spend_year <", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearLessThanOrEqualTo(String value) {
            addCriterion("spend_year <=", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearLike(String value) {
            addCriterion("spend_year like", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearNotLike(String value) {
            addCriterion("spend_year not like", value, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearIn(List<String> values) {
            addCriterion("spend_year in", values, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearNotIn(List<String> values) {
            addCriterion("spend_year not in", values, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearBetween(String value1, String value2) {
            addCriterion("spend_year between", value1, value2, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendYearNotBetween(String value1, String value2) {
            addCriterion("spend_year not between", value1, value2, "spendYear");
            return (Criteria) this;
        }

        public Criteria andSpendNumIsNull() {
            addCriterion("spend_num is null");
            return (Criteria) this;
        }

        public Criteria andSpendNumIsNotNull() {
            addCriterion("spend_num is not null");
            return (Criteria) this;
        }

        public Criteria andSpendNumEqualTo(BigDecimal value) {
            addCriterion("spend_num =", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumNotEqualTo(BigDecimal value) {
            addCriterion("spend_num <>", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumGreaterThan(BigDecimal value) {
            addCriterion("spend_num >", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spend_num >=", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumLessThan(BigDecimal value) {
            addCriterion("spend_num <", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spend_num <=", value, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumIn(List<BigDecimal> values) {
            addCriterion("spend_num in", values, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumNotIn(List<BigDecimal> values) {
            addCriterion("spend_num not in", values, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spend_num between", value1, value2, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spend_num not between", value1, value2, "spendNum");
            return (Criteria) this;
        }

        public Criteria andSpendNoteIsNull() {
            addCriterion("spend_note is null");
            return (Criteria) this;
        }

        public Criteria andSpendNoteIsNotNull() {
            addCriterion("spend_note is not null");
            return (Criteria) this;
        }

        public Criteria andSpendNoteEqualTo(String value) {
            addCriterion("spend_note =", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteNotEqualTo(String value) {
            addCriterion("spend_note <>", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteGreaterThan(String value) {
            addCriterion("spend_note >", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteGreaterThanOrEqualTo(String value) {
            addCriterion("spend_note >=", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteLessThan(String value) {
            addCriterion("spend_note <", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteLessThanOrEqualTo(String value) {
            addCriterion("spend_note <=", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteLike(String value) {
            addCriterion("spend_note like", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteNotLike(String value) {
            addCriterion("spend_note not like", value, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteIn(List<String> values) {
            addCriterion("spend_note in", values, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteNotIn(List<String> values) {
            addCriterion("spend_note not in", values, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteBetween(String value1, String value2) {
            addCriterion("spend_note between", value1, value2, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendNoteNotBetween(String value1, String value2) {
            addCriterion("spend_note not between", value1, value2, "spendNote");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNull() {
            addCriterion("spend_time is null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIsNotNull() {
            addCriterion("spend_time is not null");
            return (Criteria) this;
        }

        public Criteria andSpendTimeEqualTo(Date value) {
            addCriterion("spend_time =", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotEqualTo(Date value) {
            addCriterion("spend_time <>", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThan(Date value) {
            addCriterion("spend_time >", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spend_time >=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThan(Date value) {
            addCriterion("spend_time <", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeLessThanOrEqualTo(Date value) {
            addCriterion("spend_time <=", value, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeIn(List<Date> values) {
            addCriterion("spend_time in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotIn(List<Date> values) {
            addCriterion("spend_time not in", values, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeBetween(Date value1, Date value2) {
            addCriterion("spend_time between", value1, value2, "spendTime");
            return (Criteria) this;
        }

        public Criteria andSpendTimeNotBetween(Date value1, Date value2) {
            addCriterion("spend_time not between", value1, value2, "spendTime");
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