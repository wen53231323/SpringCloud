package com.wen.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

// jse提供的注解，屏蔽无关紧要的警告。
@SuppressWarnings("serial")
// Lombok提供的注解，代表get、set、toString、equals、hashCode等操作
@Data
// Lombok提供的注解，代表对应字段的 setter 方法调用后，会返回当前对象，代替返回的void
@Accessors(chain=true)
// Lombok提供的注解，代表无参构造
@NoArgsConstructor
// Lombok提供的注解，代表全参构造
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(Integer code, String message){
        this(code, message, null);
    }

}
