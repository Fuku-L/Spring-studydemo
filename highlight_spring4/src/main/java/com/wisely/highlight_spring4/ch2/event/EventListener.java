package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<BeanEvent> {
    @Override
    public void onApplicationEvent(BeanEvent beanEvent) {
        String msg = beanEvent.getMsg();
        System.out.println("我 （bean-EventListener） 接收到了 bean-demoPublisher 发布的消息："+msg);
    }
}
