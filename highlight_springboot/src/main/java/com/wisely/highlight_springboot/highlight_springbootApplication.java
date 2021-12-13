package com.wisely.highlight_springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot入口类
 * */
@SpringBootApplication
public class highlight_springbootApplication {
    public static void main(String[] args) {
        // 关闭 banner
        // SpringApplication.run(highlight_springbootApplication.class, args);
        SpringApplication app = new SpringApplication(highlight_springbootApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
