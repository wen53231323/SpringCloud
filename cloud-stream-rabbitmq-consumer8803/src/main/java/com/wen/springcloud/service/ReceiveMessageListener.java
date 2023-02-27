package com.wen.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

//可以理解为定义一个消息消费者的接收管道
@EnableBinding(Sink.class)
public class ReceiveMessageListener {

    // 输入源：作为一个消息监听者
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        //获取到消息
        String messageStr = message.getPayload();
        System.out.println("消费者8802，------->接收到的消息：" + messageStr);
    }
}
