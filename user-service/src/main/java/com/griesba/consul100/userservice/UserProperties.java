package com.griesba.consul100.userservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("capitelar-user")
public class UserProperties {
    private String name = "Pat";
    private String surname = "Vill Capitelar";
}
