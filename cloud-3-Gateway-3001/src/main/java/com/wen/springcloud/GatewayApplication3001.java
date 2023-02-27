package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 标识为Eureka的客户组件
@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication3001 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication3001.class, args);
    }
}
