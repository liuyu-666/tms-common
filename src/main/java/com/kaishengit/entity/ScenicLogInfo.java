package com.kaishengit.entity;

import java.util.Date;

public class ScenicLogInfo {
    private Integer id;

    private Integer scenicAccountId;

    private String scenicIp;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScenicAccountId() {
        return scenicAccountId;
    }

    public void setScenicAccountId(Integer scenicAccountId) {
        this.scenicAccountId = scenicAccountId;
    }

    public String getScenicIp() {
        return scenicIp;
    }

    public void setScenicIp(String scenicIp) {
        this.scenicIp = scenicIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}