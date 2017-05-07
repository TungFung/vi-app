package net.topflow.dao.model;

import java.util.Date;

public class TmHangupRec {
    private Long id;

    private String caseNo;

    private String hangupReason;

    private Date hangupDatetime;

    private String hangupRemark;

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

    public String getHangupReason() {
        return hangupReason;
    }

    public void setHangupReason(String hangupReason) {
        this.hangupReason = hangupReason == null ? null : hangupReason.trim();
    }

    public Date getHangupDatetime() {
        return hangupDatetime;
    }

    public void setHangupDatetime(Date hangupDatetime) {
        this.hangupDatetime = hangupDatetime;
    }

    public String getHangupRemark() {
        return hangupRemark;
    }

    public void setHangupRemark(String hangupRemark) {
        this.hangupRemark = hangupRemark == null ? null : hangupRemark.trim();
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