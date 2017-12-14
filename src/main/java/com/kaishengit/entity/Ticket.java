package com.kaishengit.entity;

import java.io.Serializable;
import java.util.Date;

public class Ticket implements Serializable {
    private Integer id;

    private Integer customId;

    private Integer storeId;

    private Date createTime;

    private String status;

    private Date endTime;

    private Date inTime;

    private String piaoNum;

    private String piaoType;

    private Date outTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getPiaoNum() {
        return piaoNum;
    }

    public void setPiaoNum(String piaoNum) {
        this.piaoNum = piaoNum;
    }

    public String getPiaoType() {
        return piaoType;
    }

    public void setPiaoType(String piaoType) {
        this.piaoType = piaoType;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
}