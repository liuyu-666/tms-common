package com.kaishengit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TicketOrder {
    private Integer id;

    private String piaoNum;

    private BigDecimal piaoOrderPrice;

    private Date creatrTime;

    private Date updateTime;

    private Integer piaoId;

    private Integer customId;

    private Integer storeAccountId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPiaoNum() {
        return piaoNum;
    }

    public void setPiaoNum(String piaoNum) {
        this.piaoNum = piaoNum;
    }

    public BigDecimal getPiaoOrderPrice() {
        return piaoOrderPrice;
    }

    public void setPiaoOrderPrice(BigDecimal piaoOrderPrice) {
        this.piaoOrderPrice = piaoOrderPrice;
    }

    public Date getCreatrTime() {
        return creatrTime;
    }

    public void setCreatrTime(Date creatrTime) {
        this.creatrTime = creatrTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPiaoId() {
        return piaoId;
    }

    public void setPiaoId(Integer piaoId) {
        this.piaoId = piaoId;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
    }
}