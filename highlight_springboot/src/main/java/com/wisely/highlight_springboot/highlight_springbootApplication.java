package com.wisely.highlight_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot入口类
 * */
@SpringBootApplication
public class highlight_springbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(highlight_springbootApplication.class, args);
    }
}
