package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmHangupRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmHangupRecExample() {
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

        public Criteria andHangupReasonIsNull() {
            addCriterion("HANGUP_REASON is null");
            return (Criteria) this;
        }

        public Criteria andHangupReasonIsNotNull() {
            addCriterion("HANGUP_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andHangupReasonEqualTo(String value) {
            addCriterion("HANGUP_REASON =", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonNotEqualTo(String value) {
            addCriterion("HANGUP_REASON <>", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonGreaterThan(String value) {
            addCriterion("HANGUP_REASON >", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonGreaterThanOrEqualTo(String value) {
            addCriterion("HANGUP_REASON >=", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonLessThan(String value) {
            addCriterion("HANGUP_REASON <", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonLessThanOrEqualTo(String value) {
            addCriterion("HANGUP_REASON <=", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonLike(String value) {
            addCriterion("HANGUP_REASON like", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonNotLike(String value) {
            addCriterion("HANGUP_REASON not like", value, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonIn(List<String> values) {
            addCriterion("HANGUP_REASON in", values, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonNotIn(List<String> values) {
            addCriterion("HANGUP_REASON not in", values, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonBetween(String value1, String value2) {
            addCriterion("HANGUP_REASON between", value1, value2, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupReasonNotBetween(String value1, String value2) {
            addCriterion("HANGUP_REASON not between", value1, value2, "hangupReason");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeIsNull() {
            addCriterion("HANGUP_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeIsNotNull() {
            addCriterion("HANGUP_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeEqualTo(Date value) {
            addCriterion("HANGUP_DATETIME =", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeNotEqualTo(Date value) {
            addCriterion("HANGUP_DATETIME <>", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeGreaterThan(Date value) {
            addCriterion("HANGUP_DATETIME >", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HANGUP_DATETIME >=", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeLessThan(Date value) {
            addCriterion("HANGUP_DATETIME <", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("HANGUP_DATETIME <=", value, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeIn(List<Date> values) {
            addCriterion("HANGUP_DATETIME in", values, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeNotIn(List<Date> values) {
            addCriterion("HANGUP_DATETIME not in", values, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeBetween(Date value1, Date value2) {
            addCriterion("HANGUP_DATETIME between", value1, value2, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("HANGUP_DATETIME not between", value1, value2, "hangupDatetime");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkIsNull() {
            addCriterion("HANGUP_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkIsNotNull() {
            addCriterion("HANGUP_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkEqualTo(String value) {
            addCriterion("HANGUP_REMARK =", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkNotEqualTo(String value) {
            addCriterion("HANGUP_REMARK <>", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkGreaterThan(String value) {
            addCriterion("HANGUP_REMARK >", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("HANGUP_REMARK >=", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkLessThan(String value) {
            addCriterion("HANGUP_REMARK <", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkLessThanOrEqualTo(String value) {
            addCriterion("HANGUP_REMARK <=", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkLike(String value) {
            addCriterion("HANGUP_REMARK like", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkNotLike(String value) {
            addCriterion("HANGUP_REMARK not like", value, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkIn(List<String> values) {
            addCriterion("HANGUP_REMARK in", values, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkNotIn(List<String> values) {
            addCriterion("HANGUP_REMARK not in", values, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkBetween(String value1, String value2) {
            addCriterion("HANGUP_REMARK between", value1, value2, "hangupRemark");
            return (Criteria) this;
        }

        public Criteria andHangupRemarkNotBetween(String value1, String value2) {
            addCriterion("HANGUP_REMARK not between", value1, value2, "hangupRemark");
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