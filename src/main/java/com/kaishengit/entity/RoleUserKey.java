package com.kaishengit.entity;

import java.io.Serializable;

public class RoleUserKey implements Serializable {
    private Integer roleId;

    private Integer userId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}