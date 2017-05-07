package net.topflow.dao.model;

import java.util.Date;

public class TmCase {
    private Long caseNo;

    private String caseStatus;

    private String caseType;

    private Integer caseLevel;

    private String workerCode;

    private String custName;

    private Double loanAmount;

    private Date applyDatetime;

    private String applyPhoneNo;

    private String creatorId;

    private Date createdDatetime;

    private String lastModifierId;

    private Date lastModifiedDatetime;

    public Long getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(Long caseNo) {
        this.caseNo = caseNo;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus == null ? null : caseStatus.trim();
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public Integer getCaseLevel() {
        return caseLevel;
    }

    public void setCaseLevel(Integer caseLevel) {
        this.caseLevel = caseLevel;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode == null ? null : workerCode.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getApplyDatetime() {
        return applyDatetime;
    }

    public void setApplyDatetime(Date applyDatetime) {
        this.applyDatetime = applyDatetime;
    }

    public String getApplyPhoneNo() {
        return applyPhoneNo;
    }

    public void setApplyPhoneNo(String applyPhoneNo) {
        this.applyPhoneNo = applyPhoneNo == null ? null : applyPhoneNo.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public String getLastModifierId() {
        return lastModifierId;
    }

    public void setLastModifierId(String lastModifierId) {
        this.lastModifierId = lastModifierId == null ? null : lastModifierId.trim();
    }

    public Date getLastModifiedDatetime() {
        return lastModifiedDatetime;
    }

    public void setLastModifiedDatetime(Date lastModifiedDatetime) {
        this.lastModifiedDatetime = lastModifiedDatetime;
    }
}