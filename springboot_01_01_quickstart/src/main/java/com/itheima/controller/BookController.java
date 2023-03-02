package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//这是一个IDEA联网创建的springboot项目

//Rest模式
@RestController
@RequestMapping("/books")//通用访问前缀
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("SpringBoot is running...");
        return "SpringBoot is running...";
    }
}
