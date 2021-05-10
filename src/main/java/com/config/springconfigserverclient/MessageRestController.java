package com.config.springconfigserverclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageRestController {

    @Autowired
    LimitBean limitConfiguration;

    @Autowired
    MuleBean muleBean;

    @GetMapping("/limits")
    public LimitBean getLimits() {
        return limitConfiguration;
    }

    @GetMapping("/mule")
    public MuleBean getMuleConfig() {
        return muleBean;
    }
}