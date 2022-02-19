package com.example.demo1.model;

import java.util.ArrayList;
import java.util.List;

public class DenizenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DenizenExample() {
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

        public Criteria andDenizenIdIsNull() {
            addCriterion("denizen_id is null");
            return (Criteria) this;
        }

        public Criteria andDenizenIdIsNotNull() {
            addCriterion("denizen_id is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenIdEqualTo(String value) {
            addCriterion("denizen_id =", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdNotEqualTo(String value) {
            addCriterion("denizen_id <>", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdGreaterThan(String value) {
            addCriterion("denizen_id >", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_id >=", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdLessThan(String value) {
            addCriterion("denizen_id <", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdLessThanOrEqualTo(String value) {
            addCriterion("denizen_id <=", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdLike(String value) {
            addCriterion("denizen_id like", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdNotLike(String value) {
            addCriterion("denizen_id not like", value, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdIn(List<String> values) {
            addCriterion("denizen_id in", values, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdNotIn(List<String> values) {
            addCriterion("denizen_id not in", values, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdBetween(String value1, String value2) {
            addCriterion("denizen_id between", value1, value2, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenIdNotBetween(String value1, String value2) {
            addCriterion("denizen_id not between", value1, value2, "denizenId");
            return (Criteria) this;
        }

        public Criteria andDenizenNameIsNull() {
            addCriterion("denizen_name is null");
            return (Criteria) this;
        }

        public Criteria andDenizenNameIsNotNull() {
            addCriterion("denizen_name is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenNameEqualTo(String value) {
            addCriterion("denizen_name =", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameNotEqualTo(String value) {
            addCriterion("denizen_name <>", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameGreaterThan(String value) {
            addCriterion("denizen_name >", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_name >=", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameLessThan(String value) {
            addCriterion("denizen_name <", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameLessThanOrEqualTo(String value) {
            addCriterion("denizen_name <=", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameLike(String value) {
            addCriterion("denizen_name like", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameNotLike(String value) {
            addCriterion("denizen_name not like", value, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameIn(List<String> values) {
            addCriterion("denizen_name in", values, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameNotIn(List<String> values) {
            addCriterion("denizen_name not in", values, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameBetween(String value1, String value2) {
            addCriterion("denizen_name between", value1, value2, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenNameNotBetween(String value1, String value2) {
            addCriterion("denizen_name not between", value1, value2, "denizenName");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidIsNull() {
            addCriterion("denizen_hhouseid is null");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidIsNotNull() {
            addCriterion("denizen_hhouseid is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidEqualTo(String value) {
            addCriterion("denizen_hhouseid =", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidNotEqualTo(String value) {
            addCriterion("denizen_hhouseid <>", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidGreaterThan(String value) {
            addCriterion("denizen_hhouseid >", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_hhouseid >=", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidLessThan(String value) {
            addCriterion("denizen_hhouseid <", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidLessThanOrEqualTo(String value) {
            addCriterion("denizen_hhouseid <=", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidLike(String value) {
            addCriterion("denizen_hhouseid like", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidNotLike(String value) {
            addCriterion("denizen_hhouseid not like", value, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidIn(List<String> values) {
            addCriterion("denizen_hhouseid in", values, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidNotIn(List<String> values) {
            addCriterion("denizen_hhouseid not in", values, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidBetween(String value1, String value2) {
            addCriterion("denizen_hhouseid between", value1, value2, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHhouseidNotBetween(String value1, String value2) {
            addCriterion("denizen_hhouseid not between", value1, value2, "denizenHhouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidIsNull() {
            addCriterion("denizen_houseid is null");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidIsNotNull() {
            addCriterion("denizen_houseid is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidEqualTo(String value) {
            addCriterion("denizen_houseid =", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidNotEqualTo(String value) {
            addCriterion("denizen_houseid <>", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidGreaterThan(String value) {
            addCriterion("denizen_houseid >", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_houseid >=", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidLessThan(String value) {
            addCriterion("denizen_houseid <", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidLessThanOrEqualTo(String value) {
            addCriterion("denizen_houseid <=", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidLike(String value) {
            addCriterion("denizen_houseid like", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidNotLike(String value) {
            addCriterion("denizen_houseid not like", value, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidIn(List<String> values) {
            addCriterion("denizen_houseid in", values, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidNotIn(List<String> values) {
            addCriterion("denizen_houseid not in", values, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidBetween(String value1, String value2) {
            addCriterion("denizen_houseid between", value1, value2, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenHouseidNotBetween(String value1, String value2) {
            addCriterion("denizen_houseid not between", value1, value2, "denizenHouseid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidIsNull() {
            addCriterion("denizen_roomid is null");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidIsNotNull() {
            addCriterion("denizen_roomid is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidEqualTo(String value) {
            addCriterion("denizen_roomid =", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidNotEqualTo(String value) {
            addCriterion("denizen_roomid <>", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidGreaterThan(String value) {
            addCriterion("denizen_roomid >", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_roomid >=", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidLessThan(String value) {
            addCriterion("denizen_roomid <", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidLessThanOrEqualTo(String value) {
            addCriterion("denizen_roomid <=", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidLike(String value) {
            addCriterion("denizen_roomid like", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidNotLike(String value) {
            addCriterion("denizen_roomid not like", value, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidIn(List<String> values) {
            addCriterion("denizen_roomid in", values, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidNotIn(List<String> values) {
            addCriterion("denizen_roomid not in", values, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidBetween(String value1, String value2) {
            addCriterion("denizen_roomid between", value1, value2, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenRoomidNotBetween(String value1, String value2) {
            addCriterion("denizen_roomid not between", value1, value2, "denizenRoomid");
            return (Criteria) this;
        }

        public Criteria andDenizenTelIsNull() {
            addCriterion("denizen_tel is null");
            return (Criteria) this;
        }

        public Criteria andDenizenTelIsNotNull() {
            addCriterion("denizen_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenTelEqualTo(String value) {
            addCriterion("denizen_tel =", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelNotEqualTo(String value) {
            addCriterion("denizen_tel <>", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelGreaterThan(String value) {
            addCriterion("denizen_tel >", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_tel >=", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelLessThan(String value) {
            addCriterion("denizen_tel <", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelLessThanOrEqualTo(String value) {
            addCriterion("denizen_tel <=", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelLike(String value) {
            addCriterion("denizen_tel like", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelNotLike(String value) {
            addCriterion("denizen_tel not like", value, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelIn(List<String> values) {
            addCriterion("denizen_tel in", values, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelNotIn(List<String> values) {
            addCriterion("denizen_tel not in", values, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelBetween(String value1, String value2) {
            addCriterion("denizen_tel between", value1, value2, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenTelNotBetween(String value1, String value2) {
            addCriterion("denizen_tel not between", value1, value2, "denizenTel");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingIsNull() {
            addCriterion("denizen_parking is null");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingIsNotNull() {
            addCriterion("denizen_parking is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingEqualTo(String value) {
            addCriterion("denizen_parking =", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingNotEqualTo(String value) {
            addCriterion("denizen_parking <>", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingGreaterThan(String value) {
            addCriterion("denizen_parking >", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_parking >=", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingLessThan(String value) {
            addCriterion("denizen_parking <", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingLessThanOrEqualTo(String value) {
            addCriterion("denizen_parking <=", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingLike(String value) {
            addCriterion("denizen_parking like", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingNotLike(String value) {
            addCriterion("denizen_parking not like", value, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingIn(List<String> values) {
            addCriterion("denizen_parking in", values, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingNotIn(List<String> values) {
            addCriterion("denizen_parking not in", values, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingBetween(String value1, String value2) {
            addCriterion("denizen_parking between", value1, value2, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenParkingNotBetween(String value1, String value2) {
            addCriterion("denizen_parking not between", value1, value2, "denizenParking");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusIsNull() {
            addCriterion("denizen_moneystatus is null");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusIsNotNull() {
            addCriterion("denizen_moneystatus is not null");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusEqualTo(String value) {
            addCriterion("denizen_moneystatus =", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusNotEqualTo(String value) {
            addCriterion("denizen_moneystatus <>", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusGreaterThan(String value) {
            addCriterion("denizen_moneystatus >", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusGreaterThanOrEqualTo(String value) {
            addCriterion("denizen_moneystatus >=", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusLessThan(String value) {
            addCriterion("denizen_moneystatus <", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusLessThanOrEqualTo(String value) {
            addCriterion("denizen_moneystatus <=", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusLike(String value) {
            addCriterion("denizen_moneystatus like", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusNotLike(String value) {
            addCriterion("denizen_moneystatus not like", value, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusIn(List<String> values) {
            addCriterion("denizen_moneystatus in", values, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusNotIn(List<String> values) {
            addCriterion("denizen_moneystatus not in", values, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusBetween(String value1, String value2) {
            addCriterion("denizen_moneystatus between", value1, value2, "denizenMoneystatus");
            return (Criteria) this;
        }

        public Criteria andDenizenMoneystatusNotBetween(String value1, String value2) {
            addCriterion("denizen_moneystatus not between", value1, value2, "denizenMoneystatus");
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