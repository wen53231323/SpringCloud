package com.wen.springcloud.service.impl;

import com.wen.springcloud.service.MessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageProviderImpl implements MessageProvider {

    // 消息发送管道
    @Resource
    private MessageChannel output;

    @Override
    public void send() {
        // 创建消息
        Message<String> message = MessageBuilder.withPayload("生产者8001发送的消息").build();
        // 通过管道向消息中间件发消息
        output.send(message);
        // 创建并发送消息
        this.output.send(MessageBuilder.withPayload("生产者8001发送的消息").build());
    }
}
