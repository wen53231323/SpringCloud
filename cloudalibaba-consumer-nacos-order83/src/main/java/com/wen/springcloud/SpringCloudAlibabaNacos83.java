package com.wen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAlibabaNacos83 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaNacos83.class,args);
    }
}
