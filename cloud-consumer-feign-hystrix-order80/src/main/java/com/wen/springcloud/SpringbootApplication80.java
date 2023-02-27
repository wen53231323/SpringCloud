package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 激活Hystrix服务降级
@EnableHystrix
@EnableFeignClients
// 标识为Eureka的客户组件
@EnableEurekaClient
@SpringBootApplication
public class SpringbootApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication80.class, args);
    }
}
