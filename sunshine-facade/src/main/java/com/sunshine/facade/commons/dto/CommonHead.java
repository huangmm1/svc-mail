package com.sunshine.facade.commons.dto;

import java.io.Serializable;

public class CommonHead implements Serializable {

    public String userId;

    public String roleId;

    public String bizTp;

    public String sysfollwNo;

    public String returnCode;

    public String returnMsg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getBizTp() {
        return bizTp;
    }

    public void setBizTp(String bizTp) {
        this.bizTp = bizTp;
    }

    public String getSysfollwNo() {
        return sysfollwNo;
    }

    public void setSysfollwNo(String sysfollwNo) {
        this.sysfollwNo = sysfollwNo;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
