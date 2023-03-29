package com.itheima.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class TestRedis {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    void doSet(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("age",41);
    }

    @Test
    void doGet(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object age = valueOperations.get("age");
        System.out.println(age);
    }
}
