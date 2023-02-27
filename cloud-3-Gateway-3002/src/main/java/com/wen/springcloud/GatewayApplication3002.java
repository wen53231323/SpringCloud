package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 使用nacos
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication3002 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication3002.class, args);
    }
}
