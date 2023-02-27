package com.wen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 标识为Eureka的服务组件
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication2002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication2002.class, args);
    }
}
