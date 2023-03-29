package com.itheima.app;

import com.itheima.bean.service.BookService;
import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App8 {
    public static void main(String[] args) {
        // 上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.check();
    }
}
