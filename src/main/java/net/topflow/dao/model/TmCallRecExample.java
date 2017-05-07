package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmCallRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmCallRecExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoIsNull() {
            addCriterion("CALL_PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoIsNotNull() {
            addCriterion("CALL_PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoEqualTo(String value) {
            addCriterion("CALL_PHONE_NO =", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoNotEqualTo(String value) {
            addCriterion("CALL_PHONE_NO <>", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoGreaterThan(String value) {
            addCriterion("CALL_PHONE_NO >", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_PHONE_NO >=", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoLessThan(String value) {
            addCriterion("CALL_PHONE_NO <", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("CALL_PHONE_NO <=", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoLike(String value) {
            addCriterion("CALL_PHONE_NO like", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoNotLike(String value) {
            addCriterion("CALL_PHONE_NO not like", value, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoIn(List<String> values) {
            addCriterion("CALL_PHONE_NO in", values, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoNotIn(List<String> values) {
            addCriterion("CALL_PHONE_NO not in", values, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoBetween(String value1, String value2) {
            addCriterion("CALL_PHONE_NO between", value1, value2, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallPhoneNoNotBetween(String value1, String value2) {
            addCriterion("CALL_PHONE_NO not between", value1, value2, "callPhoneNo");
            return (Criteria) this;
        }

        public Criteria andCallStatusIsNull() {
            addCriterion("CALL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCallStatusIsNotNull() {
            addCriterion("CALL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCallStatusEqualTo(String value) {
            addCriterion("CALL_STATUS =", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotEqualTo(String value) {
            addCriterion("CALL_STATUS <>", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusGreaterThan(String value) {
            addCriterion("CALL_STATUS >", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_STATUS >=", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusLessThan(String value) {
            addCriterion("CALL_STATUS <", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusLessThanOrEqualTo(String value) {
            addCriterion("CALL_STATUS <=", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusLike(String value) {
            addCriterion("CALL_STATUS like", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotLike(String value) {
            addCriterion("CALL_STATUS not like", value, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusIn(List<String> values) {
            addCriterion("CALL_STATUS in", values, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotIn(List<String> values) {
            addCriterion("CALL_STATUS not in", values, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusBetween(String value1, String value2) {
            addCriterion("CALL_STATUS between", value1, value2, "callStatus");
            return (Criteria) this;
        }

        public Criteria andCallStatusNotBetween(String value1, String value2) {
            addCriterion("CALL_STATUS not between", value1, value2, "callStatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeIsNull() {
            addCriterion("SUBMIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeIsNotNull() {
            addCriterion("SUBMIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeEqualTo(String value) {
            addCriterion("SUBMIT_TYPE =", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeNotEqualTo(String value) {
            addCriterion("SUBMIT_TYPE <>", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeGreaterThan(String value) {
            addCriterion("SUBMIT_TYPE >", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMIT_TYPE >=", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeLessThan(String value) {
            addCriterion("SUBMIT_TYPE <", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeLessThanOrEqualTo(String value) {
            addCriterion("SUBMIT_TYPE <=", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeLike(String value) {
            addCriterion("SUBMIT_TYPE like", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeNotLike(String value) {
            addCriterion("SUBMIT_TYPE not like", value, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeIn(List<String> values) {
            addCriterion("SUBMIT_TYPE in", values, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeNotIn(List<String> values) {
            addCriterion("SUBMIT_TYPE not in", values, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeBetween(String value1, String value2) {
            addCriterion("SUBMIT_TYPE between", value1, value2, "submitType");
            return (Criteria) this;
        }

        public Criteria andSubmitTypeNotBetween(String value1, String value2) {
            addCriterion("SUBMIT_TYPE not between", value1, value2, "submitType");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("CREATOR_ID like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("CREATOR_ID not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNull() {
            addCriterion("CREATED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIsNotNull() {
            addCriterion("CREATED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeEqualTo(Date value) {
            addCriterion("CREATED_DATETIME =", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotEqualTo(Date value) {
            addCriterion("CREATED_DATETIME <>", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThan(Date value) {
            addCriterion("CREATED_DATETIME >", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATETIME >=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThan(Date value) {
            addCriterion("CREATED_DATETIME <", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATETIME <=", value, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeIn(List<Date> values) {
            addCriterion("CREATED_DATETIME in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotIn(List<Date> values) {
            addCriterion("CREATED_DATETIME not in", values, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATETIME between", value1, value2, "createdDatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATETIME not between", value1, value2, "createdDatetime");
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