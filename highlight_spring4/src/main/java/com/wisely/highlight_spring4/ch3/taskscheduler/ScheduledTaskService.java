package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@EnableScheduling // 开启对计划任务的支持
public class ScheduledTaskService {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // 声明该方法是计划任务，使用 fixedRate 属性定义每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔 5 秒执行一次"+dateFormat.format(new Date()));
    }

    // 使用 cron 属性可以按照指定时间执行，本案例指的是每天 11点28分执行。 cron是UNIX 和类UNIX（Linux）系统下的定时任务
    @Scheduled(cron = "0 15 15 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dateFormat.format(new Date())+"执行");
    }

}
