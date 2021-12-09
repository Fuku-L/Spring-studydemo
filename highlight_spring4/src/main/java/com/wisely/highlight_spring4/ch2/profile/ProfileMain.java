package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileMain {
    public static void main(String[] args) {
        // 创建一个空容器：new AnnotationConfigApplicationContext(); 不传 xxxConfig.class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 将活动的 Profile 设置为 ProfileConfig 中配置的参数 ‘prod’ 或者 ‘dev’...， 然后注册 Bean 配置类。
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        // 刷新容器
        context.refresh();

        // 获取的内容就可以看到相应的环境下的内容了
        ContentBean contextBean = context.getBean(ContentBean.class);
        System.out.println(contextBean.getContent());
        context.close();
    }
}
