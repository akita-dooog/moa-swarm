package com.akita.moa.govern.config;

import com.akita.moa.govern.service.LoginService;
import com.akita.moa.security.config.AbstractWebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends AbstractWebSecurityConfig {
    @Autowired
    private LoginService loginService;

    @Override
    public UserDetailsService userDetailsService() {
        return username -> loginService.loadUserByUsername(username);
    }
}
