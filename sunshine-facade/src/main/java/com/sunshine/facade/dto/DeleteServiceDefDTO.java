package com.sunshine.facade.dto;

import java.io.Serializable;

public class DeleteServiceDefDTO implements Serializable {

    private String servCd;

    public String getServCd() {
        return servCd;
    }

    public void setServCd(String servCd) {
        this.servCd = servCd;
    }
}
