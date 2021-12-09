package com.wisely.highlight_spring4.ch3.forTest2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class test2Config {
    @Bean
    @Profile("dev")
    public test2Bean devTest2Bean(){
        return new test2Bean("from dev Test2Bean");
    }


    @Bean
    @Profile("prod")
    public test2Bean prodTest2Bean(){
        return new test2Bean("from production Test2Bean");
    }
}
