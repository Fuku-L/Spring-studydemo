package com.wisely.highlight_spring4.ch2.AtoB_Event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AtoBMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        A a = context.getBean(A.class);
        a.publish("hehe");
        context.close();
    }
}
