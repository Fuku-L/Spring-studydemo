package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiMain {
    public static void main(String[] args) {
        // Spring 容器类选用 AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        // 从容器中获取自定义类 A
        // 通过接收一个配置类的class，来获取容器中的"Bean实例"
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        // 调用类 A 中通过注入类 B 所获得的功能
        System.out.println(useFunctionService.sayHello("di"));
        // 关闭容器
        context.close();
    }
}
