package com.sunshine.business.service;

import com.sunshine.business.conver.BusinessCommonConverter;
import com.sunshine.business.db.IServiceDefDBInterface;
import com.sunshine.business.entity.ServiceDefEntity;
import com.sunshine.facade.commons.dto.EmptResponseOutDTO;
import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.*;
import com.sunshine.facade.dto.bean.ServiceDefBean;
import com.sunshine.facade.service.IServDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServService implements IServDefService {

    @Autowired
    private IServiceDefDBInterface dbInterface;

    @Autowired
    private BusinessCommonConverter businessCommonConverter;


    @Override
    public ResponseDTO<Void> insertServiceDef(RequestDTO<InsertServiceDefDTO> request) {

        ResponseDTO<Void> response = new ResponseDTO<>();
        response.setHead(request.getHead());

        ServiceDefEntity serviceDefEntity = businessCommonConverter.toServiceDefEntity(request.getBody());
        boolean flg = dbInterface.insertOneServiceDef(serviceDefEntity);
        if (flg) {
            response.getHead().setReturnCode("0");
            response.getHead().setReturnMsg("交易成功");
        } else {
            response.getHead().setReturnCode("-1");
            response.getHead().setReturnMsg("交易失败");
        }


        return response;
    }

    @Override
    public ResponseDTO<Void> deleteServiceDef(RequestDTO<DeleteServiceDefDTO> request) {

        ResponseDTO<Void> response = new ResponseDTO<>();
        response.setHead(request.getHead());
        boolean flg = dbInterface.removeOneServiceDefById(request.getBody().getServCd());
        if (flg) {
            response.getHead().setReturnCode("0");
            response.getHead().setReturnMsg("交易成功");
        } else {
            response.getHead().setReturnCode("-1");
            response.getHead().setReturnMsg("交易失败");
        }

        return response;
    }

    @Override
    public ResponseDTO<Void> updateServiceDef(RequestDTO<UpdateServiceDefDTO> request) {

        ResponseDTO<Void> response = new ResponseDTO<>();
        response.setHead(request.getHead());

        ServiceDefEntity serviceDefEntity = businessCommonConverter.toServiceDefEntity2(request.getBody());
        boolean flg = dbInterface.updateOneServiceDef(serviceDefEntity);
        if (flg) {
            response.getHead().setReturnCode("0");
            response.getHead().setReturnMsg("交易成功");
        } else {
            response.getHead().setReturnCode("-1");
            response.getHead().setReturnMsg("交易失败");
        }

        return response;
    }

    @Override
    public ResponseDTO<QueryServiceDefListOutDTO> queryServiceDefList(RequestDTO<QueryServiceDefListDTO> request) {

        ResponseDTO<QueryServiceDefListOutDTO> response = new ResponseDTO<>();
        QueryServiceDefListOutDTO queryServiceDefListOutDTO = new QueryServiceDefListOutDTO();
        response.setHead(request.getHead());
        response.setBody(queryServiceDefListOutDTO);

        ServiceDefEntity serviceDefEntity = businessCommonConverter.toServiceDefEntity3(request.getBody());
        List<ServiceDefEntity> listServiceDef = dbInterface.getListServiceDef(serviceDefEntity);
        List<ServiceDefBean> serviceDefBeans = businessCommonConverter.toListServiceDefBean(listServiceDef);
        queryServiceDefListOutDTO.setServiceDefs(serviceDefBeans);
        response.getHead().setReturnCode("0");
        response.getHead().setReturnMsg("交易成功");


        return response;
    }
}
