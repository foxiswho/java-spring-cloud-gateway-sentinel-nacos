package com.foxwho.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test1 {

    @RequestMapping("/test1")
    public String test() {
        return "这是使用控制台方式";
    }

    @RequestMapping("/oms/api/order/create")
    public String create() {
        return "GET:/oms/api/order/create";
    }

    @PostMapping("/oms/api/order/create")
    public String postOrder() {
        return "POST:/oms/api/order/create";
    }
}
