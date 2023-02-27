package com.wen.springcloud.controller;

import com.wen.springcloud.entity.Payment;
import com.wen.springcloud.entity.Result;
import com.wen.springcloud.entity.User;
import com.wen.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController()
public class OrderController {
    // @Value注解用于读取配置文件
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public Result<User> getPayment(@PathVariable("id") Long id) {
        Result result = orderService.queryOrderById(id);
        return result;
    }

}
