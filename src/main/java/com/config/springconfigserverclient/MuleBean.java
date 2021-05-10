package com.config.springconfigserverclient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mule-server")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MuleBean {
    private int port;
    private  String host;
}
