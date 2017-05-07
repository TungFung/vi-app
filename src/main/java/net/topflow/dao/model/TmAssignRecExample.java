package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmAssignRecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmAssignRecExample() {
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

        public Criteria andAssignTypeIsNull() {
            addCriterion("ASSIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIsNotNull() {
            addCriterion("ASSIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeEqualTo(String value) {
            addCriterion("ASSIGN_TYPE =", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotEqualTo(String value) {
            addCriterion("ASSIGN_TYPE <>", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThan(String value) {
            addCriterion("ASSIGN_TYPE >", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TYPE >=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThan(String value) {
            addCriterion("ASSIGN_TYPE <", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_TYPE <=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLike(String value) {
            addCriterion("ASSIGN_TYPE like", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotLike(String value) {
            addCriterion("ASSIGN_TYPE not like", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIn(List<String> values) {
            addCriterion("ASSIGN_TYPE in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotIn(List<String> values) {
            addCriterion("ASSIGN_TYPE not in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeBetween(String value1, String value2) {
            addCriterion("ASSIGN_TYPE between", value1, value2, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_TYPE not between", value1, value2, "assignType");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerIsNull() {
            addCriterion("ORIGIN_WORKER is null");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerIsNotNull() {
            addCriterion("ORIGIN_WORKER is not null");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerEqualTo(String value) {
            addCriterion("ORIGIN_WORKER =", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerNotEqualTo(String value) {
            addCriterion("ORIGIN_WORKER <>", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerGreaterThan(String value) {
            addCriterion("ORIGIN_WORKER >", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_WORKER >=", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerLessThan(String value) {
            addCriterion("ORIGIN_WORKER <", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_WORKER <=", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerLike(String value) {
            addCriterion("ORIGIN_WORKER like", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerNotLike(String value) {
            addCriterion("ORIGIN_WORKER not like", value, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerIn(List<String> values) {
            addCriterion("ORIGIN_WORKER in", values, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerNotIn(List<String> values) {
            addCriterion("ORIGIN_WORKER not in", values, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerBetween(String value1, String value2) {
            addCriterion("ORIGIN_WORKER between", value1, value2, "originWorker");
            return (Criteria) this;
        }

        public Criteria andOriginWorkerNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_WORKER not between", value1, value2, "originWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerIsNull() {
            addCriterion("DESIGNATED_WORKER is null");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerIsNotNull() {
            addCriterion("DESIGNATED_WORKER is not null");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerEqualTo(String value) {
            addCriterion("DESIGNATED_WORKER =", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerNotEqualTo(String value) {
            addCriterion("DESIGNATED_WORKER <>", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerGreaterThan(String value) {
            addCriterion("DESIGNATED_WORKER >", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_WORKER >=", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerLessThan(String value) {
            addCriterion("DESIGNATED_WORKER <", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerLessThanOrEqualTo(String value) {
            addCriterion("DESIGNATED_WORKER <=", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerLike(String value) {
            addCriterion("DESIGNATED_WORKER like", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerNotLike(String value) {
            addCriterion("DESIGNATED_WORKER not like", value, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerIn(List<String> values) {
            addCriterion("DESIGNATED_WORKER in", values, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerNotIn(List<String> values) {
            addCriterion("DESIGNATED_WORKER not in", values, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerBetween(String value1, String value2) {
            addCriterion("DESIGNATED_WORKER between", value1, value2, "designatedWorker");
            return (Criteria) this;
        }

        public Criteria andDesignatedWorkerNotBetween(String value1, String value2) {
            addCriterion("DESIGNATED_WORKER not between", value1, value2, "designatedWorker");
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

        public Criteria andLastModifierIdIsNull() {
            addCriterion("LAST_MODIFIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdIsNotNull() {
            addCriterion("LAST_MODIFIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdEqualTo(String value) {
            addCriterion("LAST_MODIFIER_ID =", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdNotEqualTo(String value) {
            addCriterion("LAST_MODIFIER_ID <>", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdGreaterThan(String value) {
            addCriterion("LAST_MODIFIER_ID >", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIER_ID >=", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdLessThan(String value) {
            addCriterion("LAST_MODIFIER_ID <", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIER_ID <=", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdLike(String value) {
            addCriterion("LAST_MODIFIER_ID like", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdNotLike(String value) {
            addCriterion("LAST_MODIFIER_ID not like", value, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdIn(List<String> values) {
            addCriterion("LAST_MODIFIER_ID in", values, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdNotIn(List<String> values) {
            addCriterion("LAST_MODIFIER_ID not in", values, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIER_ID between", value1, value2, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifierIdNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIER_ID not between", value1, value2, "lastModifierId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIsNull() {
            addCriterion("LAST_MODIFIED_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIsNotNull() {
            addCriterion("LAST_MODIFIED_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME =", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME <>", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME >", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME >=", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME <", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATETIME <=", value, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATETIME in", values, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATETIME not in", values, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATETIME between", value1, value2, "lastModifiedDatetime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATETIME not between", value1, value2, "lastModifiedDatetime");
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