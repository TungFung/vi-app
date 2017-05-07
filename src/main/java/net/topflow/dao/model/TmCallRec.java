package net.topflow.dao.model;

import java.util.Date;

public class TmCallRec {
    private Long id;

    private String caseNo;

    private String callPhoneNo;

    private String callStatus;

    private String remark;

    private String submitType;

    private String creatorId;

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

    public String getCallPhoneNo() {
        return callPhoneNo;
    }

    public void setCallPhoneNo(String callPhoneNo) {
        this.callPhoneNo = callPhoneNo == null ? null : callPhoneNo.trim();
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus == null ? null : callStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType == null ? null : submitType.trim();
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
}