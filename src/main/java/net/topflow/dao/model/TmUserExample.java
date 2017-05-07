package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmUserExample() {
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

        public Criteria andWorkerCodeIsNull() {
            addCriterion("WORKER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeIsNotNull() {
            addCriterion("WORKER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeEqualTo(String value) {
            addCriterion("WORKER_CODE =", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeNotEqualTo(String value) {
            addCriterion("WORKER_CODE <>", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeGreaterThan(String value) {
            addCriterion("WORKER_CODE >", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_CODE >=", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeLessThan(String value) {
            addCriterion("WORKER_CODE <", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeLessThanOrEqualTo(String value) {
            addCriterion("WORKER_CODE <=", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeLike(String value) {
            addCriterion("WORKER_CODE like", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeNotLike(String value) {
            addCriterion("WORKER_CODE not like", value, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeIn(List<String> values) {
            addCriterion("WORKER_CODE in", values, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeNotIn(List<String> values) {
            addCriterion("WORKER_CODE not in", values, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeBetween(String value1, String value2) {
            addCriterion("WORKER_CODE between", value1, value2, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerCodeNotBetween(String value1, String value2) {
            addCriterion("WORKER_CODE not between", value1, value2, "workerCode");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNull() {
            addCriterion("WORKER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("WORKER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("WORKER_NAME =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("WORKER_NAME <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("WORKER_NAME >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("WORKER_NAME <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("WORKER_NAME <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("WORKER_NAME like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("WORKER_NAME not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("WORKER_NAME in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("WORKER_NAME not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("WORKER_NAME between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("WORKER_NAME not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIsNull() {
            addCriterion("E_MAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIsNotNull() {
            addCriterion("E_MAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEMailAddressEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS =", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS <>", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressGreaterThan(String value) {
            addCriterion("E_MAIL_ADDRESS >", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS >=", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLessThan(String value) {
            addCriterion("E_MAIL_ADDRESS <", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL_ADDRESS <=", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressLike(String value) {
            addCriterion("E_MAIL_ADDRESS like", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotLike(String value) {
            addCriterion("E_MAIL_ADDRESS not like", value, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressIn(List<String> values) {
            addCriterion("E_MAIL_ADDRESS in", values, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotIn(List<String> values) {
            addCriterion("E_MAIL_ADDRESS not in", values, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressBetween(String value1, String value2) {
            addCriterion("E_MAIL_ADDRESS between", value1, value2, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andEMailAddressNotBetween(String value1, String value2) {
            addCriterion("E_MAIL_ADDRESS not between", value1, value2, "eMailAddress");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNull() {
            addCriterion("SIGN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSignStatusIsNotNull() {
            addCriterion("SIGN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSignStatusEqualTo(String value) {
            addCriterion("SIGN_STATUS =", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotEqualTo(String value) {
            addCriterion("SIGN_STATUS <>", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThan(String value) {
            addCriterion("SIGN_STATUS >", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_STATUS >=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThan(String value) {
            addCriterion("SIGN_STATUS <", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLessThanOrEqualTo(String value) {
            addCriterion("SIGN_STATUS <=", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusLike(String value) {
            addCriterion("SIGN_STATUS like", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotLike(String value) {
            addCriterion("SIGN_STATUS not like", value, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusIn(List<String> values) {
            addCriterion("SIGN_STATUS in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotIn(List<String> values) {
            addCriterion("SIGN_STATUS not in", values, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusBetween(String value1, String value2) {
            addCriterion("SIGN_STATUS between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andSignStatusNotBetween(String value1, String value2) {
            addCriterion("SIGN_STATUS not between", value1, value2, "signStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusIsNull() {
            addCriterion("BUSY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBusyStatusIsNotNull() {
            addCriterion("BUSY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBusyStatusEqualTo(String value) {
            addCriterion("BUSY_STATUS =", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusNotEqualTo(String value) {
            addCriterion("BUSY_STATUS <>", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusGreaterThan(String value) {
            addCriterion("BUSY_STATUS >", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BUSY_STATUS >=", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusLessThan(String value) {
            addCriterion("BUSY_STATUS <", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusLessThanOrEqualTo(String value) {
            addCriterion("BUSY_STATUS <=", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusLike(String value) {
            addCriterion("BUSY_STATUS like", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusNotLike(String value) {
            addCriterion("BUSY_STATUS not like", value, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusIn(List<String> values) {
            addCriterion("BUSY_STATUS in", values, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusNotIn(List<String> values) {
            addCriterion("BUSY_STATUS not in", values, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusBetween(String value1, String value2) {
            addCriterion("BUSY_STATUS between", value1, value2, "busyStatus");
            return (Criteria) this;
        }

        public Criteria andBusyStatusNotBetween(String value1, String value2) {
            addCriterion("BUSY_STATUS not between", value1, value2, "busyStatus");
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