package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

// 使用方法规则被拦截的类
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法规则执行....");
    }
}
