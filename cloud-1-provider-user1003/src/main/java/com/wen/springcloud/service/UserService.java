package com.wen.springcloud.service;

import com.wen.springcloud.entity.Result;
import org.apache.ibatis.annotations.Param;

/**
 * (Payment)表服务接口
 *
 * @author makejava
 * @since 2023-02-14 16:58:50
 */
public interface UserService {
    // 根据id获取数据
    Result getUserById(@Param("id") Long id);
}

