package com.itheima.bean.loader;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 各种条件的判定，判定完毕后决定是否装载指定的bean
        try {
            Class<?> cluzz = Class.forName("com.itheima.bean.Mouse");
            if(cluzz!=null){
                return new String[]{"com.itheima.bean.Cat"};
            }
        } catch (ClassNotFoundException e) {
            return new String[0];
        }
        return null;
    }
}
