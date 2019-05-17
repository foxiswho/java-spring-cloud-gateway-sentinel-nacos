package com.foxwho.demo;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.foxwho.demo.config.JsonFlowRuleListConverter;
import com.foxwho.demo.exception.ExceptionUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.alibaba.sentinel.annotation.SentinelRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SentinelDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SentinelDemoApplication.class).run(args);
    }


    @Bean
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestTemplate restTemplate2() {
        return new RestTemplate();
    }

    @Bean
    public Converter myConverter() {
        return new JsonFlowRuleListConverter();
    }
}
