package com.example.demo1.model;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
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

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdIsNull() {
            addCriterion("house_h_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseHIdIsNotNull() {
            addCriterion("house_h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseHIdEqualTo(String value) {
            addCriterion("house_h_id =", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdNotEqualTo(String value) {
            addCriterion("house_h_id <>", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdGreaterThan(String value) {
            addCriterion("house_h_id >", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_h_id >=", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdLessThan(String value) {
            addCriterion("house_h_id <", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdLessThanOrEqualTo(String value) {
            addCriterion("house_h_id <=", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdLike(String value) {
            addCriterion("house_h_id like", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdNotLike(String value) {
            addCriterion("house_h_id not like", value, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdIn(List<String> values) {
            addCriterion("house_h_id in", values, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdNotIn(List<String> values) {
            addCriterion("house_h_id not in", values, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdBetween(String value1, String value2) {
            addCriterion("house_h_id between", value1, value2, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseHIdNotBetween(String value1, String value2) {
            addCriterion("house_h_id not between", value1, value2, "houseHId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdIsNull() {
            addCriterion("house_r_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseRIdIsNotNull() {
            addCriterion("house_r_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRIdEqualTo(String value) {
            addCriterion("house_r_id =", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdNotEqualTo(String value) {
            addCriterion("house_r_id <>", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdGreaterThan(String value) {
            addCriterion("house_r_id >", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_r_id >=", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdLessThan(String value) {
            addCriterion("house_r_id <", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdLessThanOrEqualTo(String value) {
            addCriterion("house_r_id <=", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdLike(String value) {
            addCriterion("house_r_id like", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdNotLike(String value) {
            addCriterion("house_r_id not like", value, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdIn(List<String> values) {
            addCriterion("house_r_id in", values, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdNotIn(List<String> values) {
            addCriterion("house_r_id not in", values, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdBetween(String value1, String value2) {
            addCriterion("house_r_id between", value1, value2, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseRIdNotBetween(String value1, String value2) {
            addCriterion("house_r_id not between", value1, value2, "houseRId");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(String value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(String value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(String value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(String value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(String value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLike(String value) {
            addCriterion("house_area like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotLike(String value) {
            addCriterion("house_area not like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<String> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<String> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(String value1, String value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(String value1, String value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseUNameIsNull() {
            addCriterion("house_u_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseUNameIsNotNull() {
            addCriterion("house_u_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUNameEqualTo(String value) {
            addCriterion("house_u_name =", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameNotEqualTo(String value) {
            addCriterion("house_u_name <>", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameGreaterThan(String value) {
            addCriterion("house_u_name >", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_u_name >=", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameLessThan(String value) {
            addCriterion("house_u_name <", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameLessThanOrEqualTo(String value) {
            addCriterion("house_u_name <=", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameLike(String value) {
            addCriterion("house_u_name like", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameNotLike(String value) {
            addCriterion("house_u_name not like", value, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameIn(List<String> values) {
            addCriterion("house_u_name in", values, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameNotIn(List<String> values) {
            addCriterion("house_u_name not in", values, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameBetween(String value1, String value2) {
            addCriterion("house_u_name between", value1, value2, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUNameNotBetween(String value1, String value2) {
            addCriterion("house_u_name not between", value1, value2, "houseUName");
            return (Criteria) this;
        }

        public Criteria andHouseUTelIsNull() {
            addCriterion("house_u_tel is null");
            return (Criteria) this;
        }

        public Criteria andHouseUTelIsNotNull() {
            addCriterion("house_u_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUTelEqualTo(String value) {
            addCriterion("house_u_tel =", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelNotEqualTo(String value) {
            addCriterion("house_u_tel <>", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelGreaterThan(String value) {
            addCriterion("house_u_tel >", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelGreaterThanOrEqualTo(String value) {
            addCriterion("house_u_tel >=", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelLessThan(String value) {
            addCriterion("house_u_tel <", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelLessThanOrEqualTo(String value) {
            addCriterion("house_u_tel <=", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelLike(String value) {
            addCriterion("house_u_tel like", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelNotLike(String value) {
            addCriterion("house_u_tel not like", value, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelIn(List<String> values) {
            addCriterion("house_u_tel in", values, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelNotIn(List<String> values) {
            addCriterion("house_u_tel not in", values, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelBetween(String value1, String value2) {
            addCriterion("house_u_tel between", value1, value2, "houseUTel");
            return (Criteria) this;
        }

        public Criteria andHouseUTelNotBetween(String value1, String value2) {
            addCriterion("house_u_tel not between", value1, value2, "houseUTel");
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