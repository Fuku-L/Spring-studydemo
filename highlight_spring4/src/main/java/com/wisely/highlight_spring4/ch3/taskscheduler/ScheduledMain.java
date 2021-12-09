package com.wisely.highlight_spring4.ch3.taskscheduler;

import com.wisely.highlight_spring4.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduledMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
    }
}
