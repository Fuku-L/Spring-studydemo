package com.wisely.web.controller;

import com.wisely.web.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Autowired
    TestDemoService testDemoService;

    @RequestMapping(value = "/testRest", produces = "text/plain; charset=UTF-8")
    public @ResponseBody String testRest(){
        return testDemoService.saySomething();
    }
}
