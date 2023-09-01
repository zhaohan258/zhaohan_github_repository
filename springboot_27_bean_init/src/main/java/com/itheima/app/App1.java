package com.itheima.app;

import com.itheima.bean.domain.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        //上下文对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //
//        ctx.getBean("cat");
        Cat catBean = ctx.getBean(Cat.class);
        System.out.println(ctx);
    }
}
