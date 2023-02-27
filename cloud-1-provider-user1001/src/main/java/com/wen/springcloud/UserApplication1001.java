package com.wen.springcloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


// 标识为Eureka的客户组件
@EnableEurekaClient
// @MapperScan注解：扫描 指定 文件夹
@MapperScan("com.wen.springcloud.mapper")
@SpringBootApplication
public class UserApplication1001 {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication1001.class, args);
    }
}
