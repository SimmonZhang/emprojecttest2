package com.example.demo1.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int offset;
    protected int limit;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ParkingExample() {
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

        public Criteria andParkingIdIsNull() {
            addCriterion("parking_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingIdIsNotNull() {
            addCriterion("parking_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingIdEqualTo(String value) {
            addCriterion("parking_id =", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotEqualTo(String value) {
            addCriterion("parking_id <>", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThan(String value) {
            addCriterion("parking_id >", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdGreaterThanOrEqualTo(String value) {
            addCriterion("parking_id >=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThan(String value) {
            addCriterion("parking_id <", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLessThanOrEqualTo(String value) {
            addCriterion("parking_id <=", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdLike(String value) {
            addCriterion("parking_id like", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotLike(String value) {
            addCriterion("parking_id not like", value, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdIn(List<String> values) {
            addCriterion("parking_id in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotIn(List<String> values) {
            addCriterion("parking_id not in", values, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdBetween(String value1, String value2) {
            addCriterion("parking_id between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingIdNotBetween(String value1, String value2) {
            addCriterion("parking_id not between", value1, value2, "parkingId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdIsNull() {
            addCriterion("parking_a_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingAIdIsNotNull() {
            addCriterion("parking_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingAIdEqualTo(String value) {
            addCriterion("parking_a_id =", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdNotEqualTo(String value) {
            addCriterion("parking_a_id <>", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdGreaterThan(String value) {
            addCriterion("parking_a_id >", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdGreaterThanOrEqualTo(String value) {
            addCriterion("parking_a_id >=", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdLessThan(String value) {
            addCriterion("parking_a_id <", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdLessThanOrEqualTo(String value) {
            addCriterion("parking_a_id <=", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdLike(String value) {
            addCriterion("parking_a_id like", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdNotLike(String value) {
            addCriterion("parking_a_id not like", value, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdIn(List<String> values) {
            addCriterion("parking_a_id in", values, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdNotIn(List<String> values) {
            addCriterion("parking_a_id not in", values, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdBetween(String value1, String value2) {
            addCriterion("parking_a_id between", value1, value2, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingAIdNotBetween(String value1, String value2) {
            addCriterion("parking_a_id not between", value1, value2, "parkingAId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdIsNull() {
            addCriterion("parking_c_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingCIdIsNotNull() {
            addCriterion("parking_c_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingCIdEqualTo(String value) {
            addCriterion("parking_c_id =", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdNotEqualTo(String value) {
            addCriterion("parking_c_id <>", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdGreaterThan(String value) {
            addCriterion("parking_c_id >", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdGreaterThanOrEqualTo(String value) {
            addCriterion("parking_c_id >=", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdLessThan(String value) {
            addCriterion("parking_c_id <", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdLessThanOrEqualTo(String value) {
            addCriterion("parking_c_id <=", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdLike(String value) {
            addCriterion("parking_c_id like", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdNotLike(String value) {
            addCriterion("parking_c_id not like", value, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdIn(List<String> values) {
            addCriterion("parking_c_id in", values, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdNotIn(List<String> values) {
            addCriterion("parking_c_id not in", values, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdBetween(String value1, String value2) {
            addCriterion("parking_c_id between", value1, value2, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingCIdNotBetween(String value1, String value2) {
            addCriterion("parking_c_id not between", value1, value2, "parkingCId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdIsNull() {
            addCriterion("parking_u_id is null");
            return (Criteria) this;
        }

        public Criteria andParkingUIdIsNotNull() {
            addCriterion("parking_u_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkingUIdEqualTo(String value) {
            addCriterion("parking_u_id =", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdNotEqualTo(String value) {
            addCriterion("parking_u_id <>", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdGreaterThan(String value) {
            addCriterion("parking_u_id >", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdGreaterThanOrEqualTo(String value) {
            addCriterion("parking_u_id >=", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdLessThan(String value) {
            addCriterion("parking_u_id <", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdLessThanOrEqualTo(String value) {
            addCriterion("parking_u_id <=", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdLike(String value) {
            addCriterion("parking_u_id like", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdNotLike(String value) {
            addCriterion("parking_u_id not like", value, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdIn(List<String> values) {
            addCriterion("parking_u_id in", values, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdNotIn(List<String> values) {
            addCriterion("parking_u_id not in", values, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdBetween(String value1, String value2) {
            addCriterion("parking_u_id between", value1, value2, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUIdNotBetween(String value1, String value2) {
            addCriterion("parking_u_id not between", value1, value2, "parkingUId");
            return (Criteria) this;
        }

        public Criteria andParkingUNameIsNull() {
            addCriterion("parking_u_name is null");
            return (Criteria) this;
        }

        public Criteria andParkingUNameIsNotNull() {
            addCriterion("parking_u_name is not null");
            return (Criteria) this;
        }

        public Criteria andParkingUNameEqualTo(String value) {
            addCriterion("parking_u_name =", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameNotEqualTo(String value) {
            addCriterion("parking_u_name <>", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameGreaterThan(String value) {
            addCriterion("parking_u_name >", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameGreaterThanOrEqualTo(String value) {
            addCriterion("parking_u_name >=", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameLessThan(String value) {
            addCriterion("parking_u_name <", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameLessThanOrEqualTo(String value) {
            addCriterion("parking_u_name <=", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameLike(String value) {
            addCriterion("parking_u_name like", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameNotLike(String value) {
            addCriterion("parking_u_name not like", value, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameIn(List<String> values) {
            addCriterion("parking_u_name in", values, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameNotIn(List<String> values) {
            addCriterion("parking_u_name not in", values, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameBetween(String value1, String value2) {
            addCriterion("parking_u_name between", value1, value2, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUNameNotBetween(String value1, String value2) {
            addCriterion("parking_u_name not between", value1, value2, "parkingUName");
            return (Criteria) this;
        }

        public Criteria andParkingUTelIsNull() {
            addCriterion("parking_u_tel is null");
            return (Criteria) this;
        }

        public Criteria andParkingUTelIsNotNull() {
            addCriterion("parking_u_tel is not null");
            return (Criteria) this;
        }

        public Criteria andParkingUTelEqualTo(String value) {
            addCriterion("parking_u_tel =", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelNotEqualTo(String value) {
            addCriterion("parking_u_tel <>", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelGreaterThan(String value) {
            addCriterion("parking_u_tel >", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelGreaterThanOrEqualTo(String value) {
            addCriterion("parking_u_tel >=", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelLessThan(String value) {
            addCriterion("parking_u_tel <", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelLessThanOrEqualTo(String value) {
            addCriterion("parking_u_tel <=", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelLike(String value) {
            addCriterion("parking_u_tel like", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelNotLike(String value) {
            addCriterion("parking_u_tel not like", value, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelIn(List<String> values) {
            addCriterion("parking_u_tel in", values, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelNotIn(List<String> values) {
            addCriterion("parking_u_tel not in", values, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelBetween(String value1, String value2) {
            addCriterion("parking_u_tel between", value1, value2, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingUTelNotBetween(String value1, String value2) {
            addCriterion("parking_u_tel not between", value1, value2, "parkingUTel");
            return (Criteria) this;
        }

        public Criteria andParkingStatusIsNull() {
            addCriterion("parking_status is null");
            return (Criteria) this;
        }

        public Criteria andParkingStatusIsNotNull() {
            addCriterion("parking_status is not null");
            return (Criteria) this;
        }

        public Criteria andParkingStatusEqualTo(String value) {
            addCriterion("parking_status =", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusNotEqualTo(String value) {
            addCriterion("parking_status <>", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusGreaterThan(String value) {
            addCriterion("parking_status >", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("parking_status >=", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusLessThan(String value) {
            addCriterion("parking_status <", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusLessThanOrEqualTo(String value) {
            addCriterion("parking_status <=", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusLike(String value) {
            addCriterion("parking_status like", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusNotLike(String value) {
            addCriterion("parking_status not like", value, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusIn(List<String> values) {
            addCriterion("parking_status in", values, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusNotIn(List<String> values) {
            addCriterion("parking_status not in", values, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusBetween(String value1, String value2) {
            addCriterion("parking_status between", value1, value2, "parkingStatus");
            return (Criteria) this;
        }

        public Criteria andParkingStatusNotBetween(String value1, String value2) {
            addCriterion("parking_status not between", value1, value2, "parkingStatus");
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