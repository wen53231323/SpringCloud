package com.wen.springcloud.service.impl;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.wen.springcloud.service.FlowLimitService;
import org.springframework.stereotype.Service;

@Service
public class FlowLimitServiceImpl implements FlowLimitService {
    @Override
    @SentinelResource("testC")
    public String testC() {
        return "testC被调用";
    }
}
