package com.wisely.highlight_spring4.ch3.fortest;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class forTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

    }
}
