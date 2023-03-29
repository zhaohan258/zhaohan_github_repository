package com.itheima.app;

import com.itheima.bean.domain.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //上下文对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
