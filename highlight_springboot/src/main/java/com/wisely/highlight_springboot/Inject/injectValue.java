package com.wisely.highlight_springboot.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class injectValue {

    @Value("${book.author}")
    private String author;

    @Value("${book.name}")
    private String name;

    @RequestMapping("/injectValue")
    String injectValue(){
        return "book name is " + name + "and book author is " + author;
    }

}
