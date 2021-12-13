package com.wisely.highlight_springboot.Inject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value = "animal")
public class Animal {
    private String type;

    private String food;

    public String getFood() {
        return food;
    }

    public String getType() {
        return type;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setType(String type) {
        this.type = type;
    }
}
