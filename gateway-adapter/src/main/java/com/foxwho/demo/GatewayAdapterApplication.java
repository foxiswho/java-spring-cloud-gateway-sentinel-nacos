package com.foxwho.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GatewayAdapterApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayAdapterApplication.class).run(args);
    }
}
