package com.itheima.app;

import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        //上下文对象
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
