package com.sunshine.business.db;

import com.sunshine.business.entity.ServiceDefEntity;

import java.util.List;

public interface IServiceDefDBInterface {

    public boolean insertOneServiceDef(ServiceDefEntity serviceDefEntity);

    public boolean insertListServiceDef(List<ServiceDefEntity> serviceDefEntitys);

    public boolean removeOneServiceDefById(String id);

    public boolean updateOneServiceDef(ServiceDefEntity serviceDefEntity);

    public List<ServiceDefEntity> getListServiceDef(ServiceDefEntity serviceDefEntity);

}
