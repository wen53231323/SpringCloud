package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
// 标识为Eureka的客户组件
@EnableEurekaClient
@SpringBootApplication
public class SpringbootApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication80.class, args);
    }
}
