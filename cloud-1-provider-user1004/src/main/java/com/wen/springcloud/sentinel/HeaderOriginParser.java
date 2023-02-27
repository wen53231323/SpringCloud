package com.wen.springcloud.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Component
public class HeaderOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest request) {
        // 拿到请求头
        String origin = request.getHeader("origin");
        // 非空判断，如果为空，则返回错误的字符串，反之返回请求头
        if (StringUtils.isEmpty(origin)) {
            return "blank";
        }
        return origin;
    }
}


