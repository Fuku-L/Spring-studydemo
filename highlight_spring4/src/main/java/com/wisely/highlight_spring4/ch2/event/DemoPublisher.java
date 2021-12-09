package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    // 注入 ApplicationContext 用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    // 使用 ApplicationContext 中的 publicEvent 来发布
    public void publish(String msg){
        applicationContext.publishEvent(new BeanEvent(this, msg));
    }

}
