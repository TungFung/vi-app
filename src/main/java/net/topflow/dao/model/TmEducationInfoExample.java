package net.topflow.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmEducationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmEducationInfoExample() {
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

        public Criteria andEducationBackgroundIsNull() {
            addCriterion("EDUCATION_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIsNotNull() {
            addCriterion("EDUCATION_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND =", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND <>", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThan(String value) {
            addCriterion("EDUCATION_BACKGROUND >", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND >=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThan(String value) {
            addCriterion("EDUCATION_BACKGROUND <", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION_BACKGROUND <=", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundLike(String value) {
            addCriterion("EDUCATION_BACKGROUND like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotLike(String value) {
            addCriterion("EDUCATION_BACKGROUND not like", value, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundIn(List<String> values) {
            addCriterion("EDUCATION_BACKGROUND in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotIn(List<String> values) {
            addCriterion("EDUCATION_BACKGROUND not in", values, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundBetween(String value1, String value2) {
            addCriterion("EDUCATION_BACKGROUND between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andEducationBackgroundNotBetween(String value1, String value2) {
            addCriterion("EDUCATION_BACKGROUND not between", value1, value2, "educationBackground");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionIsNull() {
            addCriterion("GRADUATE_INSTITUTION is null");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionIsNotNull() {
            addCriterion("GRADUATE_INSTITUTION is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionEqualTo(String value) {
            addCriterion("GRADUATE_INSTITUTION =", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionNotEqualTo(String value) {
            addCriterion("GRADUATE_INSTITUTION <>", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionGreaterThan(String value) {
            addCriterion("GRADUATE_INSTITUTION >", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATE_INSTITUTION >=", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionLessThan(String value) {
            addCriterion("GRADUATE_INSTITUTION <", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionLessThanOrEqualTo(String value) {
            addCriterion("GRADUATE_INSTITUTION <=", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionLike(String value) {
            addCriterion("GRADUATE_INSTITUTION like", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionNotLike(String value) {
            addCriterion("GRADUATE_INSTITUTION not like", value, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionIn(List<String> values) {
            addCriterion("GRADUATE_INSTITUTION in", values, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionNotIn(List<String> values) {
            addCriterion("GRADUATE_INSTITUTION not in", values, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionBetween(String value1, String value2) {
            addCriterion("GRADUATE_INSTITUTION between", value1, value2, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andGraduateInstitutionNotBetween(String value1, String value2) {
            addCriterion("GRADUATE_INSTITUTION not between", value1, value2, "graduateInstitution");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeIsNull() {
            addCriterion("ENROLLMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeIsNotNull() {
            addCriterion("ENROLLMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeEqualTo(String value) {
            addCriterion("ENROLLMENT_TIME =", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeNotEqualTo(String value) {
            addCriterion("ENROLLMENT_TIME <>", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeGreaterThan(String value) {
            addCriterion("ENROLLMENT_TIME >", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ENROLLMENT_TIME >=", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeLessThan(String value) {
            addCriterion("ENROLLMENT_TIME <", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeLessThanOrEqualTo(String value) {
            addCriterion("ENROLLMENT_TIME <=", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeLike(String value) {
            addCriterion("ENROLLMENT_TIME like", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeNotLike(String value) {
            addCriterion("ENROLLMENT_TIME not like", value, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeIn(List<String> values) {
            addCriterion("ENROLLMENT_TIME in", values, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeNotIn(List<String> values) {
            addCriterion("ENROLLMENT_TIME not in", values, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeBetween(String value1, String value2) {
            addCriterion("ENROLLMENT_TIME between", value1, value2, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andEnrollmentTimeNotBetween(String value1, String value2) {
            addCriterion("ENROLLMENT_TIME not between", value1, value2, "enrollmentTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNull() {
            addCriterion("GRADUATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIsNotNull() {
            addCriterion("GRADUATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeEqualTo(String value) {
            addCriterion("GRADUATION_TIME =", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotEqualTo(String value) {
            addCriterion("GRADUATION_TIME <>", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThan(String value) {
            addCriterion("GRADUATION_TIME >", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATION_TIME >=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThan(String value) {
            addCriterion("GRADUATION_TIME <", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLessThanOrEqualTo(String value) {
            addCriterion("GRADUATION_TIME <=", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeLike(String value) {
            addCriterion("GRADUATION_TIME like", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotLike(String value) {
            addCriterion("GRADUATION_TIME not like", value, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeIn(List<String> values) {
            addCriterion("GRADUATION_TIME in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotIn(List<String> values) {
            addCriterion("GRADUATION_TIME not in", values, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeBetween(String value1, String value2) {
            addCriterion("GRADUATION_TIME between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andGraduationTimeNotBetween(String value1, String value2) {
            addCriterion("GRADUATION_TIME not between", value1, value2, "graduationTime");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
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