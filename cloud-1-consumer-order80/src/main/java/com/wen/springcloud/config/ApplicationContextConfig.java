package com.wen.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    /**
     * RestTemplate是Spring提供的用于访问Rest服务的客户端模板工具集
     * 提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类
     */
    @Bean
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
     @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
