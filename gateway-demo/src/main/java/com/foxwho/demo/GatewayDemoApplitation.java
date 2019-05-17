package com.foxwho.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GatewayDemoApplitation {




    public static void main(String[] args) {

        new SpringApplicationBuilder(GatewayDemoApplitation.class).run(args);
    }
}
