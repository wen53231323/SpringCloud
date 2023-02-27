package com.wen.springcloud.clients;

import com.wen.springcloud.entity.Result;
import com.wen.springcloud.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * OpenFeign在Feign的基础上支持了SpringMVC的注解，如@RequesMapping等等。
 * 注解@Feignclient可以解析SpringMVC的@RequestMapping注解下的接口，
 * 并通过动态代理的方式产生实现类，实现类中做负载均衡并调用其他服务。
 */
//Feign远程调用：@FeignClient("provider微服务名字")
@FeignClient("cloud-user")
public interface UserClient {
    /**
     * 这里声明的方法签名，必须和服务提供者微服务中的controller中方法的签名一致
     * 如果需要传递参数，例如@RequestParam、@RequestBody、@PathVariable 不能省 必加
     */
    @GetMapping("/user/{id}")
    Result getUserById(@PathVariable("id") Long id);
}
