package com.wen.springcloud.service.impl;

import com.wen.springcloud.entity.Order;
import com.wen.springcloud.entity.Result;
import com.wen.springcloud.mapper.OrderMapper;
import com.wen.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    // private static final String URL = "http://localhost:1001";
    public static final String URL = "http://CLOUD-USER";

    // @Value注解用于读取配置文件
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    public Result queryOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);

        // 根据订单信息获取用户id
        Long userId = order.getUserId();

        // 发起get请求获取用户信息
        // getForObject(REST请求地址、HTTP响应转换被转换成的对象类型)
        Result result = restTemplate.getForObject(URL + "/user/" + userId, Result.class);

        if (order != null) {
            return new Result(200, "获取成功" + serverPort, order + result.toString());
        } else {
            return new Result(444, "获取失败");
        }
    }
}
