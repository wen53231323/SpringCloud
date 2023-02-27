package com.wen.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// Nacos服务注册发现
@EnableDiscoveryClient
// @MapperScan注解：扫描 指定 文件夹
@MapperScan("com.wen.springcloud.mapper")
@SpringBootApplication
public class UserApplication1004 {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication1004.class, args);
    }
}
