package com.itheima.bean.loader;

import com.itheima.bean.Mouse;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 1.使用元数据做判定

        // 2
        BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Mouse.class).getBeanDefinition();
        registry.registerBeanDefinition("jerry",beanDefinition);
    }
}
