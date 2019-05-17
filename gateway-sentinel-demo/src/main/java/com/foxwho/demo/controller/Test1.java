package com.foxwho.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test1 {

    @RequestMapping("/test1")
    public String test() {

        return "这是使用控制台方式";
    }
}
