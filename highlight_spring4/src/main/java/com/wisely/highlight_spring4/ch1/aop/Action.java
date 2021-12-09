package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

// 编写拦截规则的注解
// 注解本身是没有功能的，与 xml 一样，是一种元数据配置。
// 注解的功能来自使用这个注解的地方。
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
