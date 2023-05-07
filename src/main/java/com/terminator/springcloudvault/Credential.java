package com.terminator.springcloudvault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("terminator")
public class Credential {

    private String username;
    private String password;
}
