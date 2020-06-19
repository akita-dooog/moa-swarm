package com.akita.moa.security.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "secure.whitelist")
public class SecureWhitelistConfig {

    List<String> urls;
}
