package com.wen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootApplication_zk80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication_zk80.class, args);
    }
}
