package com.wisely.highlight_springboot.controller;

import com.wisely.highlight_springboot.Inject.Author;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 使用指定 source 路径的方式 注入属性。
     * */
    @Autowired
    Author author;

    @RequestMapping("/author")
    String author(){
        return author.getName() + " -- " + author.getAge();
    }

    /**
     * 新建 application-animal.yml 文件，然后在 application.yml 中开启该属性文件
    @Autowired
    Animal animal;

    @RequestMapping("/animal")
    String animal(){
        return animal.getType() + " -- " + animal.getFood();
    }
     * */
}
