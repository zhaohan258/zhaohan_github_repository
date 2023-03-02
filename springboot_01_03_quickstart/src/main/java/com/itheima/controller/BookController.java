package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这是一个在阿里云spring服务器创建的springboot项目（基于阿里云创建项目：https://start.aliyun.com）

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("SpringBoot is running...3");
        return "SpringBoot is running...3";
    }
}
