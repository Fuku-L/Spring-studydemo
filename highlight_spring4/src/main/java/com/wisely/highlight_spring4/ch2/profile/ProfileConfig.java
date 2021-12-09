package com.wisely.highlight_spring4.ch2.profile;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ContentBean devContentBean(){
        return new ContentBean("from development profile");
    }


    @Bean
    @Profile("prod")
    public ContentBean prodContentBean(){
        return new ContentBean("from production profile");
    }


}
