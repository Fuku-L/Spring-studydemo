package com.wisely.highlight_spring4.ch2.AtoB_Event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class B implements ApplicationListener<oneEvent> {
    @Override
    public void onApplicationEvent(oneEvent oneEvent) {
        String msg = oneEvent.getMsg();
        System.out.println("我（B） 收到了消息发布者（A）发布的消息："+msg);
    }
}
