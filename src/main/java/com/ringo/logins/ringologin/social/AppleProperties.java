package com.ringo.logins.ringologin.social;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "social-login.provider.apple")
@Getter
@Setter
public class AppleProperties {

    private String grantType;
    private String clientId;
    private String teamId;
    private String keyId;
    private String audience;
    private String privateKey;
}
