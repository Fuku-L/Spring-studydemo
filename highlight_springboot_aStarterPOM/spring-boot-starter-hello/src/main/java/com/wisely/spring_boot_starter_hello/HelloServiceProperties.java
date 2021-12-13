package com.wisely.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
