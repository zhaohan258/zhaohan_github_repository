package com.itheima.bean.loader;

import com.itheima.bean.domain.Dog;
import com.itheima.bean.domain.Mouse;
import com.itheima.bean.service.impl.BookServiceImpl3;
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
