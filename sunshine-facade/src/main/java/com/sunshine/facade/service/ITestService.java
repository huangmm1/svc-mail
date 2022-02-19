package com.sunshine.facade.service;

import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.TestReqDTO;
import com.sunshine.facade.dto.TestResOutDTO;

public interface ITestService {

    ResponseDTO<TestResOutDTO> getTest(RequestDTO<TestReqDTO> request);
}
