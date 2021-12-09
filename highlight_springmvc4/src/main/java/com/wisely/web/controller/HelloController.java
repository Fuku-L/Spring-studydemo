package com.wisely.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}

// 1. @Controller 声明控制器
// 2. @RequestMapping("/index") 配置 URL 和方法之间的映射
// 3. 通过 ViewResoler 的 Bean 配置，返回 index 页面。