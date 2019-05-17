package com.foxwho.demo.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.foxwho.demo.handel.CustomUrlBlockHandler;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MySentinelConfiguration {
    @PostConstruct
    public void doInit() {
        WebCallbackManager.setUrlBlockHandler(new CustomUrlBlockHandler());
    }
}
