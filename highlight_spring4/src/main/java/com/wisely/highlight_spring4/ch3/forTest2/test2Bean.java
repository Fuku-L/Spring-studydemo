package com.wisely.highlight_spring4.ch3.forTest2;

import org.springframework.stereotype.Service;

@Service
public class test2Bean {
    public String content;

    public test2Bean(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
