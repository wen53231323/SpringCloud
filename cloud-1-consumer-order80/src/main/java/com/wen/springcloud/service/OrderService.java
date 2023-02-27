package com.wen.springcloud.service;

import com.wen.springcloud.entity.Order;
import com.wen.springcloud.entity.Result;

public interface OrderService {
    Result queryOrderById(Long orderId);
}
