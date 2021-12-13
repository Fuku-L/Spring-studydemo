package com.wisely.highlight_springboot.Inject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author")
@PropertySource(value = {"classpath:author.properties"})
public class Author {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
