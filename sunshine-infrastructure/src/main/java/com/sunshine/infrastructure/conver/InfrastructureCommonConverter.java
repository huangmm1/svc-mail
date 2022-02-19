package com.sunshine.infrastructure.conver;


import com.sunshine.business.entity.ServiceDefEntity;
import com.sunshine.infrastructure.entity.ServiceDefDO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InfrastructureCommonConverter {

    ServiceDefDO toServiceDefDO(ServiceDefEntity serviceDefEntity);


    List<ServiceDefDO> toListServiceDefDO(List<ServiceDefEntity> serviceDefEntities);

    List<ServiceDefEntity> toListServiceDefEntity(List<ServiceDefDO> serviceDefDOS);

}
