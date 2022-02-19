package com.sunshine.facade.dto;

import com.sunshine.facade.dto.bean.ServiceDefBean;

import java.util.List;

public class QueryServiceDefListOutDTO {

    private List<ServiceDefBean> serviceDefs;

    public List<ServiceDefBean> getServiceDefs() {
        return serviceDefs;
    }

    public void setServiceDefs(List<ServiceDefBean> serviceDefs) {
        this.serviceDefs = serviceDefs;
    }
}
