package com.example.demo0731.controller;

import com.example.demo0731.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/demo")
    public String demoMethod() {
        demoService.demoServiceMethod();
        return "wangqing";
    }
}
