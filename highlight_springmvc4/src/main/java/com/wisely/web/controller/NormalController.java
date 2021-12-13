package com.wisely.web.controller;

import com.wisely.web.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {
    @Autowired
    TestDemoService testDemoService;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg", testDemoService.saySomething());
        return "page";
    }
}
