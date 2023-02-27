package com.wen.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

// 激活Hystrix服务降级
@EnableCircuitBreaker
@EnableDiscoveryClient
// 标识为Eureka的客户组件
@EnableEurekaClient
@SpringBootApplication
public class SpringbootApplication_Hystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication_Hystrix8001.class, args);
    }
}
