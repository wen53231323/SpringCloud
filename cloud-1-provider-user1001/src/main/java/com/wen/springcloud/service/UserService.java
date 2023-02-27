package com.wen.springcloud.service;

import com.wen.springcloud.entity.Result;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    // 根据id获取数据
    Result getUserById(@Param("id") Long id);
}

