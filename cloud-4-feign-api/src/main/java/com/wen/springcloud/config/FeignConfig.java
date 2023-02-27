package com.wen.springcloud.config;

import com.wen.springcloud.fallback.UserClientFallbackFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public UserClientFallbackFactory userClientFallback() {
        return new UserClientFallbackFactory();
    }
}
