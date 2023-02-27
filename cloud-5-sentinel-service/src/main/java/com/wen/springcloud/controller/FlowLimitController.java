package com.wen.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wen.springcloud.service.FlowLimitService;
import com.wen.springcloud.service.impl.FlowLimitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @Autowired
    private FlowLimitService flowLimitService;

    @SentinelResource("hot")
    @GetMapping("/testA")
    public String testA() {
        String str = flowLimitService.testC();
        return "------testA------" + str;
    }

    @GetMapping("/testB")
    public String testB() {
        String str = flowLimitService.testC();
        return "------testB------" + str;
    }

}