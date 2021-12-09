package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

// 使用注解的被拦截的类
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的 add 操作")
    public void add(){
        System.out.println("注解拦截...");
    }
}
