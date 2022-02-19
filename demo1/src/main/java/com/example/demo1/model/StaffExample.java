package com.example.demo1.model;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
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

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(String value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(String value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(String value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(String value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(String value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(String value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLike(String value) {
            addCriterion("staff_sex like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotLike(String value) {
            addCriterion("staff_sex not like", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<String> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<String> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(String value1, String value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(String value1, String value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNull() {
            addCriterion("staff_age is null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNotNull() {
            addCriterion("staff_age is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeEqualTo(String value) {
            addCriterion("staff_age =", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotEqualTo(String value) {
            addCriterion("staff_age <>", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThan(String value) {
            addCriterion("staff_age >", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThanOrEqualTo(String value) {
            addCriterion("staff_age >=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThan(String value) {
            addCriterion("staff_age <", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThanOrEqualTo(String value) {
            addCriterion("staff_age <=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLike(String value) {
            addCriterion("staff_age like", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotLike(String value) {
            addCriterion("staff_age not like", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIn(List<String> values) {
            addCriterion("staff_age in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotIn(List<String> values) {
            addCriterion("staff_age not in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeBetween(String value1, String value2) {
            addCriterion("staff_age between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotBetween(String value1, String value2) {
            addCriterion("staff_age not between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffBranchIsNull() {
            addCriterion("staff_branch is null");
            return (Criteria) this;
        }

        public Criteria andStaffBranchIsNotNull() {
            addCriterion("staff_branch is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBranchEqualTo(String value) {
            addCriterion("staff_branch =", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchNotEqualTo(String value) {
            addCriterion("staff_branch <>", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchGreaterThan(String value) {
            addCriterion("staff_branch >", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchGreaterThanOrEqualTo(String value) {
            addCriterion("staff_branch >=", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchLessThan(String value) {
            addCriterion("staff_branch <", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchLessThanOrEqualTo(String value) {
            addCriterion("staff_branch <=", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchLike(String value) {
            addCriterion("staff_branch like", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchNotLike(String value) {
            addCriterion("staff_branch not like", value, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchIn(List<String> values) {
            addCriterion("staff_branch in", values, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchNotIn(List<String> values) {
            addCriterion("staff_branch not in", values, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchBetween(String value1, String value2) {
            addCriterion("staff_branch between", value1, value2, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffBranchNotBetween(String value1, String value2) {
            addCriterion("staff_branch not between", value1, value2, "staffBranch");
            return (Criteria) this;
        }

        public Criteria andStaffStationIsNull() {
            addCriterion("staff_station is null");
            return (Criteria) this;
        }

        public Criteria andStaffStationIsNotNull() {
            addCriterion("staff_station is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStationEqualTo(String value) {
            addCriterion("staff_station =", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationNotEqualTo(String value) {
            addCriterion("staff_station <>", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationGreaterThan(String value) {
            addCriterion("staff_station >", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationGreaterThanOrEqualTo(String value) {
            addCriterion("staff_station >=", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationLessThan(String value) {
            addCriterion("staff_station <", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationLessThanOrEqualTo(String value) {
            addCriterion("staff_station <=", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationLike(String value) {
            addCriterion("staff_station like", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationNotLike(String value) {
            addCriterion("staff_station not like", value, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationIn(List<String> values) {
            addCriterion("staff_station in", values, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationNotIn(List<String> values) {
            addCriterion("staff_station not in", values, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationBetween(String value1, String value2) {
            addCriterion("staff_station between", value1, value2, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffStationNotBetween(String value1, String value2) {
            addCriterion("staff_station not between", value1, value2, "staffStation");
            return (Criteria) this;
        }

        public Criteria andStaffWageIsNull() {
            addCriterion("staff_wage is null");
            return (Criteria) this;
        }

        public Criteria andStaffWageIsNotNull() {
            addCriterion("staff_wage is not null");
            return (Criteria) this;
        }

        public Criteria andStaffWageEqualTo(String value) {
            addCriterion("staff_wage =", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageNotEqualTo(String value) {
            addCriterion("staff_wage <>", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageGreaterThan(String value) {
            addCriterion("staff_wage >", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageGreaterThanOrEqualTo(String value) {
            addCriterion("staff_wage >=", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageLessThan(String value) {
            addCriterion("staff_wage <", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageLessThanOrEqualTo(String value) {
            addCriterion("staff_wage <=", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageLike(String value) {
            addCriterion("staff_wage like", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageNotLike(String value) {
            addCriterion("staff_wage not like", value, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageIn(List<String> values) {
            addCriterion("staff_wage in", values, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageNotIn(List<String> values) {
            addCriterion("staff_wage not in", values, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageBetween(String value1, String value2) {
            addCriterion("staff_wage between", value1, value2, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffWageNotBetween(String value1, String value2) {
            addCriterion("staff_wage not between", value1, value2, "staffWage");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNull() {
            addCriterion("staff_tel is null");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNotNull() {
            addCriterion("staff_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTelEqualTo(String value) {
            addCriterion("staff_tel =", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotEqualTo(String value) {
            addCriterion("staff_tel <>", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThan(String value) {
            addCriterion("staff_tel >", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_tel >=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThan(String value) {
            addCriterion("staff_tel <", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThanOrEqualTo(String value) {
            addCriterion("staff_tel <=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLike(String value) {
            addCriterion("staff_tel like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotLike(String value) {
            addCriterion("staff_tel not like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelIn(List<String> values) {
            addCriterion("staff_tel in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotIn(List<String> values) {
            addCriterion("staff_tel not in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelBetween(String value1, String value2) {
            addCriterion("staff_tel between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotBetween(String value1, String value2) {
            addCriterion("staff_tel not between", value1, value2, "staffTel");
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