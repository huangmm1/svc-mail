package com.sunshine.business.service;

import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.TestReqDTO;
import com.sunshine.facade.dto.TestResOutDTO;
import com.sunshine.facade.service.ITestService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class TestService implements ITestService {


    @Override
    public ResponseDTO<TestResOutDTO> getTest(RequestDTO<TestReqDTO> request) {
        ResponseDTO<TestResOutDTO> response = new ResponseDTO<>();
        TestResOutDTO resOutDTO = new TestResOutDTO();
        response.setHead(request.getHead());
        response.setBody(resOutDTO);

        if(StringUtils.hasText(request.getBody().getFlg())){
            resOutDTO.setResMsg("hahahahahahah,success!!!!");
            response.getHead().setReturnCode("0");
            response.getHead().setReturnMsg("交易成功");
        }

        return response;
    }
}
