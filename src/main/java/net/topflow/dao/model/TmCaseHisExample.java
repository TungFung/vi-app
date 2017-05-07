package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmCaseHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmCaseHisExample() {
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

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(Long value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(Long value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(Long value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(Long value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(Long value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<Long> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<Long> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(Long value1, Long value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(Long value1, Long value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNull() {
            addCriterion("CASE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("CASE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("CASE_STATUS =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("CASE_STATUS <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("CASE_STATUS >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_STATUS >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("CASE_STATUS <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("CASE_STATUS <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("CASE_STATUS like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("CASE_STATUS not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("CASE_STATUS in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("CASE_STATUS not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("CASE_STATUS between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("CASE_STATUS not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("CASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("CASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(String value) {
            addCriterion("CASE_TYPE =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(String value) {
            addCriterion("CASE_TYPE <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(String value) {
            addCriterion("CASE_TYPE >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(String value) {
            addCriterion("CASE_TYPE <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLike(String value) {
            addCriterion("CASE_TYPE like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotLike(String value) {
            addCriterion("CASE_TYPE not like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<String> values) {
            addCriterion("CASE_TYPE in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<String> values) {
            addCriterion("CASE_TYPE not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(String value1, String value2) {
            addCriterion("CASE_TYPE between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(String value1, String value2) {
            addCriterion("CASE_TYPE not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNull() {
            addCriterion("CASE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNotNull() {
            addCriterion("CASE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelEqualTo(Integer value) {
            addCriterion("CASE_LEVEL =", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotEqualTo(Integer value) {
            addCriterion("CASE_LEVEL <>", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThan(Integer value) {
            addCriterion("CASE_LEVEL >", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_LEVEL >=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThan(Integer value) {
            addCriterion("CASE_LEVEL <", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_LEVEL <=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIn(List<Integer> values) {
            addCriterion("CASE_LEVEL in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotIn(List<Integer> values) {
            addCriterion("CASE_LEVEL not in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelBetween(Integer value1, Integer value2) {
            addCriterion("CASE_LEVEL between", value1, value2, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_LEVEL not between", value1, value2, "caseLevel");
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

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("LOAN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("LOAN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(Double value) {
            addCriterion("LOAN_AMOUNT =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(Double value) {
            addCriterion("LOAN_AMOUNT <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(Double value) {
            addCriterion("LOAN_AMOUNT >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("LOAN_AMOUNT >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(Double value) {
            addCriterion("LOAN_AMOUNT <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(Double value) {
            addCriterion("LOAN_AMOUNT <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<Double> values) {
            addCriterion("LOAN_AMOUNT in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<Double> values) {
            addCriterion("LOAN_AMOUNT not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(Double value1, Double value2) {
            addCriterion("LOAN_AMOUNT between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(Double value1, Double value2) {
            addCriterion("LOAN_AMOUNT not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeIsNull() {
            addCriterion("APPLY_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeIsNotNull() {
            addCriterion("APPLY_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeEqualTo(Date value) {
            addCriterion("APPLY_DATETIME =", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeNotEqualTo(Date value) {
            addCriterion("APPLY_DATETIME <>", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeGreaterThan(Date value) {
            addCriterion("APPLY_DATETIME >", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATETIME >=", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeLessThan(Date value) {
            addCriterion("APPLY_DATETIME <", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATETIME <=", value, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeIn(List<Date> values) {
            addCriterion("APPLY_DATETIME in", values, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeNotIn(List<Date> values) {
            addCriterion("APPLY_DATETIME not in", values, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATETIME between", value1, value2, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATETIME not between", value1, value2, "applyDatetime");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoIsNull() {
            addCriterion("APPLY_PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoIsNotNull() {
            addCriterion("APPLY_PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoEqualTo(String value) {
            addCriterion("APPLY_PHONE_NO =", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoNotEqualTo(String value) {
            addCriterion("APPLY_PHONE_NO <>", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoGreaterThan(String value) {
            addCriterion("APPLY_PHONE_NO >", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_PHONE_NO >=", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoLessThan(String value) {
            addCriterion("APPLY_PHONE_NO <", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("APPLY_PHONE_NO <=", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoLike(String value) {
            addCriterion("APPLY_PHONE_NO like", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoNotLike(String value) {
            addCriterion("APPLY_PHONE_NO not like", value, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoIn(List<String> values) {
            addCriterion("APPLY_PHONE_NO in", values, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoNotIn(List<String> values) {
            addCriterion("APPLY_PHONE_NO not in", values, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoBetween(String value1, String value2) {
            addCriterion("APPLY_PHONE_NO between", value1, value2, "applyPhoneNo");
            return (Criteria) this;
        }

        public Criteria andApplyPhoneNoNotBetween(String value1, String value2) {
            addCriterion("APPLY_PHONE_NO not between", value1, value2, "applyPhoneNo");
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