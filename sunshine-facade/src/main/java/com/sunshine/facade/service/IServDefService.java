package com.sunshine.facade.service;

import com.sunshine.facade.commons.dto.EmptResponseOutDTO;
import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.*;

public interface IServDefService {

    ResponseDTO<Void> insertServiceDef(RequestDTO<InsertServiceDefDTO> request);

    ResponseDTO<Void> deleteServiceDef(RequestDTO<DeleteServiceDefDTO> request);

    ResponseDTO<Void> updateServiceDef(RequestDTO<UpdateServiceDefDTO> request);

    ResponseDTO<QueryServiceDefListOutDTO> queryServiceDefList(RequestDTO<QueryServiceDefListDTO> request);
}
