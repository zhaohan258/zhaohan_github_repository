package com.itheima.bean.factory;

import com.itheima.bean.domain.Dog;
import org.springframework.beans.factory.FactoryBean;

public class DogFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        // 使用工厂模式加载bean，可以对bean对象进行一系列的初始化操作
        Dog dog = new Dog();
        // 前置初始化操作
        return dog;
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
