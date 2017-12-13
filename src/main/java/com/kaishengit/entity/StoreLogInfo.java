package com.kaishengit.entity;

import java.util.Date;

public class StoreLogInfo {
    private Long id;

    private Integer storeAccountId;

    private String storeIp;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
    }

    public String getStoreIp() {
        return storeIp;
    }

    public void setStoreIp(String storeIp) {
        this.storeIp = storeIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}