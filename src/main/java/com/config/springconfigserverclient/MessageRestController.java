package com.config.springconfigserverclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Autowired
    Configuration limitConfiguration;

    @GetMapping("/msg")
    public Configuration getMsg() {
        return limitConfiguration;
    }
}