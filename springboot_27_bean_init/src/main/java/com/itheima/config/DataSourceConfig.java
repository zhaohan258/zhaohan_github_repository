package com.itheima.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration  //将配置类配置到spring容器中，spring才会解析类中配置的bean
public class DataSourceConfig {

    //配置第三方的类到spring容器中
    @Bean
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }
}
