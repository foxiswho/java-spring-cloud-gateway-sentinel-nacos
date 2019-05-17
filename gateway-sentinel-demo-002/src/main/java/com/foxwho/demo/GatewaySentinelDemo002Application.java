package com.foxwho.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class GatewaySentinelDemo002Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewaySentinelDemo002Application.class).run(args);
    }

}
