package com.itheima.app;

import com.itheima.bean.domain.Cat;
import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        // 上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 加载容器上下文对象后，手动注册bean
        ctx.registerBean("tom", Cat.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
