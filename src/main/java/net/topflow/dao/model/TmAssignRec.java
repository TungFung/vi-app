package net.topflow.dao.model;

import java.util.Date;

public class TmAssignRec {
    private Long id;

    private String caseNo;

    private String assignType;

    private String originWorker;

    private String designatedWorker;

    private String creatorId;

    private Date createdDatetime;

    private String lastModifierId;

    private Date lastModifiedDatetime;

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

    public String getAssignType() {
        return assignType;
    }

    public void setAssignType(String assignType) {
        this.assignType = assignType == null ? null : assignType.trim();
    }

    public String getOriginWorker() {
        return originWorker;
    }

    public void setOriginWorker(String originWorker) {
        this.originWorker = originWorker == null ? null : originWorker.trim();
    }

    public String getDesignatedWorker() {
        return designatedWorker;
    }

    public void setDesignatedWorker(String designatedWorker) {
        this.designatedWorker = designatedWorker == null ? null : designatedWorker.trim();
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