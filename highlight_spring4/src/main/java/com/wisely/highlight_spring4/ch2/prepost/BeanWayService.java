package com.wisely.highlight_spring4.ch2.prepost;

public class BeanWayService {
    // 构造函数执行完后调用
    public void init(){
        System.out.println("@Bean-init-method -- BeanWayService构造函数执行完毕");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    // Bean 销毁之前调用用
    public void destroy(){
        System.out.println("@Bean-destory-method -- BeanWayService的Bean准备销毁");
    }
}
