package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 开启Feign的功能
@EnableFeignClients
@SpringBootApplication
public class FeignApplication81 {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication81.class, args);
    }
}
