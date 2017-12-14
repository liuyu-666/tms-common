package com.kaishengit.entity;

import java.io.Serializable;
import java.util.Date;

public class TicketScenic implements Serializable {
    private Integer id;

    private Integer scenicId;

    private Integer piaoId;

    private Date createTime;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getPiaoId() {
        return piaoId;
    }

    public void setPiaoId(Integer piaoId) {
        this.piaoId = piaoId;
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
}