package net.topflow.dao.model;

import java.util.Date;

public class TmQuestion {
    private Long id;

    private String caseNo;

    private String question;

    private String questionRightAns;

    private String questionType;

    private String usageFlag;

    private Date createdDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getQuestionRightAns() {
        return questionRightAns;
    }

    public void setQuestionRightAns(String questionRightAns) {
        this.questionRightAns = questionRightAns == null ? null : questionRightAns.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getUsageFlag() {
        return usageFlag;
    }

    public void setUsageFlag(String usageFlag) {
        this.usageFlag = usageFlag == null ? null : usageFlag.trim();
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
}