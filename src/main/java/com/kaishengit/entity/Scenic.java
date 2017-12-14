package com.kaishengit.entity;

import java.io.Serializable;
import java.util.Date;

public class Scenic implements Serializable {
    private Integer id;

    private String scenicName;

    private String level;

    private String managerName;

    private String address;

    private String status;

    private Date createTime;

    private String managerTel;

    private String gemLongitude;

    private String gemLatitude;

    private String scenicLicense;

    private String managerCard;

    private String managerCardType;

    private String managerCardImage;

    private String managerCardImageBack;

    private Integer scenicAccountId;

    private String simpleContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getManagerTel() {
        return managerTel;
    }

    public void setManagerTel(String managerTel) {
        this.managerTel = managerTel;
    }

    public String getGemLongitude() {
        return gemLongitude;
    }

    public void setGemLongitude(String gemLongitude) {
        this.gemLongitude = gemLongitude;
    }

    public String getGemLatitude() {
        return gemLatitude;
    }

    public void setGemLatitude(String gemLatitude) {
        this.gemLatitude = gemLatitude;
    }

    public String getScenicLicense() {
        return scenicLicense;
    }

    public void setScenicLicense(String scenicLicense) {
        this.scenicLicense = scenicLicense;
    }

    public String getManagerCard() {
        return managerCard;
    }

    public void setManagerCard(String managerCard) {
        this.managerCard = managerCard;
    }

    public String getManagerCardType() {
        return managerCardType;
    }

    public void setManagerCardType(String managerCardType) {
        this.managerCardType = managerCardType;
    }

    public String getManagerCardImage() {
        return managerCardImage;
    }

    public void setManagerCardImage(String managerCardImage) {
        this.managerCardImage = managerCardImage;
    }

    public String getManagerCardImageBack() {
        return managerCardImageBack;
    }

    public void setManagerCardImageBack(String managerCardImageBack) {
        this.managerCardImageBack = managerCardImageBack;
    }

    public Integer getScenicAccountId() {
        return scenicAccountId;
    }

    public void setScenicAccountId(Integer scenicAccountId) {
        this.scenicAccountId = scenicAccountId;
    }

    public String getSimpleContent() {
        return simpleContent;
    }

    public void setSimpleContent(String simpleContent) {
        this.simpleContent = simpleContent;
    }
}