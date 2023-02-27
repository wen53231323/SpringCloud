package com.wen.springcloud.fallback;

import com.wen.springcloud.clients.UserClient;
import com.wen.springcloud.entity.Result;
import com.wen.springcloud.entity.User;
import feign.hystrix.FallbackFactory;


/**
 * 编写远程调用失败后的降级逻辑
 */
public class UserClientFallbackFactory implements FallbackFactory<UserClient> {
    @Override
    public UserClient create(Throwable throwable) {
        // 创建UserClient接口实现类，实现其中的方法，编写失败降级的处理逻辑
        return new UserClient() {
            @Override
            public Result getUserById(Long id) {
                // 记录异常信息
                System.err.println("查询用户失败");
                // 根据业务需求返回默认的数据，这里是空用户
                return new Result(401, "查询用户失败");
            }
        };
    }
}

