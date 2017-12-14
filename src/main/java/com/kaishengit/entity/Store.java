package com.kaishengit.entity;

import java.io.Serializable;
import java.util.Date;

public class Store implements Serializable {
    private Integer id;

    private String managerName;

    private String address;

    private String storeLicense;

    private String managerCard;

    private String managerCardImage;

    private String managerTel;

    private Date createTime;

    private Date updateTime;

    private String status;

    private String storeName;

    private String gemLatitude;

    private String gemLongitude;

    private String managerCardImageBack;

    private String managerCardType;

    private Integer storeAccountId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreLicense() {
        return storeLicense;
    }

    public void setStoreLicense(String storeLicense) {
        this.storeLicense = storeLicense;
    }

    public String getManagerCard() {
        return managerCard;
    }

    public void setManagerCard(String managerCard) {
        this.managerCard = managerCard;
    }

    public String getManagerCardImage() {
        return managerCardImage;
    }

    public void setManagerCardImage(String managerCardImage) {
        this.managerCardImage = managerCardImage;
    }

    public String getManagerTel() {
        return managerTel;
    }

    public void setManagerTel(String managerTel) {
        this.managerTel = managerTel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGemLatitude() {
        return gemLatitude;
    }

    public void setGemLatitude(String gemLatitude) {
        this.gemLatitude = gemLatitude;
    }

    public String getGemLongitude() {
        return gemLongitude;
    }

    public void setGemLongitude(String gemLongitude) {
        this.gemLongitude = gemLongitude;
    }

    public String getManagerCardImageBack() {
        return managerCardImageBack;
    }

    public void setManagerCardImageBack(String managerCardImageBack) {
        this.managerCardImageBack = managerCardImageBack;
    }

    public String getManagerCardType() {
        return managerCardType;
    }

    public void setManagerCardType(String managerCardType) {
        this.managerCardType = managerCardType;
    }

    public Integer getStoreAccountId() {
        return storeAccountId;
    }

    public void setStoreAccountId(Integer storeAccountId) {
        this.storeAccountId = storeAccountId;
    }
}