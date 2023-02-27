package com.wen.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
    /**
     * 这里的值是从github读取
     */
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String test() {
        return configInfo;
    }
}

