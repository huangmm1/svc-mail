package com.sunshine.boot.controller;

import com.sunshine.facade.commons.dto.RequestDTO;
import com.sunshine.facade.commons.dto.ResponseDTO;
import com.sunshine.facade.dto.TestReqDTO;
import com.sunshine.facade.dto.TestResOutDTO;
import com.sunshine.facade.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("/hello")
    public String helloSpringBoot(){
        return "hello springboot";
    }

    @PostMapping("/test")
    public ResponseDTO<TestResOutDTO> getTest(@RequestBody RequestDTO<TestReqDTO> request){
        return testService.getTest(request);
    }
}
