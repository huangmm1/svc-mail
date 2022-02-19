package com.sunshine.infrastructure.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("serviceDef")
public class ServiceDefDO implements Serializable {


    private String sysId;
    private String servId;
    private String sysShortNm;
    private String sysNm;
    private String origilServNm;
    @TableId("SERV_CD")
    private String servCd;
    private String servUrl;
    private String servBigCgyCd;
    private String servSmlCgyCd;
    private String servEngNm;
    private String vsonNo;
    private String origilServCd;
    private String servChiNm;
    private String servTpCd;
    private String servStsCd;
    private String crterNo;
    private String crtTm;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getServId() {
        return servId;
    }

    public void setServId(String servId) {
        this.servId = servId;
    }

    public String getSysShortNm() {
        return sysShortNm;
    }

    public void setSysShortNm(String sysShortNm) {
        this.sysShortNm = sysShortNm;
    }

    public String getSysNm() {
        return sysNm;
    }

    public void setSysNm(String sysNm) {
        this.sysNm = sysNm;
    }

    public String getOrigilServNm() {
        return origilServNm;
    }

    public void setOrigilServNm(String origilServNm) {
        this.origilServNm = origilServNm;
    }

    public String getServCd() {
        return servCd;
    }

    public void setServCd(String servCd) {
        this.servCd = servCd;
    }

    public String getServUrl() {
        return servUrl;
    }

    public void setServUrl(String servUrl) {
        this.servUrl = servUrl;
    }

    public String getServBigCgyCd() {
        return servBigCgyCd;
    }

    public void setServBigCgyCd(String servBigCgyCd) {
        this.servBigCgyCd = servBigCgyCd;
    }

    public String getServSmlCgyCd() {
        return servSmlCgyCd;
    }

    public void setServSmlCgyCd(String servSmlCgyCd) {
        this.servSmlCgyCd = servSmlCgyCd;
    }

    public String getServEngNm() {
        return servEngNm;
    }

    public void setServEngNm(String servEngNm) {
        this.servEngNm = servEngNm;
    }

    public String getVsonNo() {
        return vsonNo;
    }

    public void setVsonNo(String vsonNo) {
        this.vsonNo = vsonNo;
    }

    public String getOrigilServCd() {
        return origilServCd;
    }

    public void setOrigilServCd(String origilServCd) {
        this.origilServCd = origilServCd;
    }

    public String getServChiNm() {
        return servChiNm;
    }

    public void setServChiNm(String servChiNm) {
        this.servChiNm = servChiNm;
    }

    public String getServTpCd() {
        return servTpCd;
    }

    public void setServTpCd(String servTpCd) {
        this.servTpCd = servTpCd;
    }

    public String getServStsCd() {
        return servStsCd;
    }

    public void setServStsCd(String servStsCd) {
        this.servStsCd = servStsCd;
    }

    public String getCrterNo() {
        return crterNo;
    }

    public void setCrterNo(String crterNo) {
        this.crterNo = crterNo;
    }

    public String getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(String crtTm) {
        this.crtTm = crtTm;
    }
}
