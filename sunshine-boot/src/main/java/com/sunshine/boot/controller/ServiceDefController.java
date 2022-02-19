package com.sunshine.boot.controller;

import com.sunshine.facade.commons.dto.EmptResponseOutDTO;
import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.*;
import com.sunshine.facade.service.IServDefService;
import com.sunshine.facade.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("serv")
public class ServiceDefController {

    @Autowired
    private IServDefService service;

    @PostMapping("/insertServiceDef")
    ResponseDTO<Void> insertServiceDef(@RequestBody RequestDTO<InsertServiceDefDTO> request){
        return service.insertServiceDef(request);
    }
    @PostMapping("/deleteServiceDef")
    ResponseDTO<Void> deleteServiceDef(RequestDTO<DeleteServiceDefDTO> request){
        return service.deleteServiceDef(request);
    }
    @PostMapping("/updateServiceDef")
    ResponseDTO<Void> updateServiceDef(RequestDTO<UpdateServiceDefDTO> request){
        return service.updateServiceDef(request);
    }
    @PostMapping("/queryServiceDefList")
    ResponseDTO<QueryServiceDefListOutDTO> queryServiceDefList(RequestDTO<QueryServiceDefListDTO> request){
        return service.queryServiceDefList(request);
    }
}
