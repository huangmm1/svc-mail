package com.sunshine.business.conver;


import com.sunshine.business.entity.ServiceDefEntity;
import com.sunshine.facade.dto.InsertServiceDefDTO;
import com.sunshine.facade.dto.QueryServiceDefListDTO;
import com.sunshine.facade.dto.UpdateServiceDefDTO;
import com.sunshine.facade.dto.bean.ServiceDefBean;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BusinessCommonConverter {

    ServiceDefEntity toServiceDefEntity(InsertServiceDefDTO insertServiceDefDTO);

    ServiceDefEntity toServiceDefEntity2(UpdateServiceDefDTO updateServiceDefDTO);

    ServiceDefEntity toServiceDefEntity3(QueryServiceDefListDTO queryServiceDefListDTO);

    List<ServiceDefBean> toListServiceDefBean(List<ServiceDefEntity> serviceDefEntities);

}
