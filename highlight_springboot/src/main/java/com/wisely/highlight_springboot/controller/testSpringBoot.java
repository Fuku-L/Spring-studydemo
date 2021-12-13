package com.wisely.highlight_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试项目部署是否正确
 * */
@RestController
public class testSpringBoot {
    @RequestMapping("/")
    String index(){
        return "Spring Boot";
    }
}
