package com.foxwho.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class GatewaySentinelDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewaySentinelDemoApplication.class).run(args);
    }

}
