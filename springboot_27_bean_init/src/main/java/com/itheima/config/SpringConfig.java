package com.itheima.config;

import com.itheima.bean.domain.Dog;
import com.itheima.bean.factory.DogFactoryBean;
import com.itheima.bean.loader.MyImportSelector;
import com.itheima.bean.loader.MyPostProcessor;
import com.itheima.bean.loader.MyRegistrar;
import com.itheima.bean.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@ComponentScan({"com.itheima.bean","com.itheima.config"})
@ImportResource({"applicationContext1.xml","applicationContext2.xml"})
@Import({MyRegistrar.class,MyImportSelector.class,BookServiceImpl.class})
public class SpringConfig {

    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }
}
