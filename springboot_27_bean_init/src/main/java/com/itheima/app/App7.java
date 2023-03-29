package com.itheima.app;

import com.itheima.bean.domain.Cat;
import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App7 {
    public static void main(String[] args) {
        // 上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
