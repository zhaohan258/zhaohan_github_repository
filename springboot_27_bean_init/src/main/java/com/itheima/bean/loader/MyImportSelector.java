package com.itheima.bean.loader;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 各种条件的判定，判定完毕后决定是否装载指定的bean
        boolean flag = annotationMetadata.hasAnnotation("dataSourceConfig");
        if(flag){
            return new String[]{"com.itheima.bean.service.impl.BookServiceImpl2"};// 要加载成为bean的全路径类名
        }
        return new String[0];
    }
}
