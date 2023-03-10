package com.wen.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Order(-1)
@Component
public class AuthorizeFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // （1）获取请求参数
        MultiValueMap<String, String> params = exchange.getRequest().getQueryParams();

        // （2）获取authorization参数
        String auth = params.getFirst("authorization");

        // （3）校验，判断参数值是否等于admin
        if ("admin".equals(auth)) {
            // 等于则放行
            return chain.filter(exchange);
        }

        // （4）不等于则拦截，禁止访问，并给出响应401
        exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);

        // （5）结束处理
        return exchange.getResponse().setComplete();
    }
}


