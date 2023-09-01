package com.itheima.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("tom")
@Data
public class Cat {
    private String name;
    private  Integer age;
}
