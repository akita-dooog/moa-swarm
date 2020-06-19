package com.akita.moa.portal.config;

import com.akita.moa.portal.service.UserService;
import com.akita.moa.security.component.JwtAuthenticationTokenFilter;
import com.akita.moa.security.component.RestAuthenticationEntryPoint;
import com.akita.moa.security.component.RestfulAccessDeniedHandler;
import com.akita.moa.security.config.AbstractWebSecurityConfig;
import com.akita.moa.security.config.SecureWhitelistConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.filter.OncePerRequestFilter;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends AbstractWebSecurityConfig {
    @Autowired
    UserService userService;

    @Override
    @Bean
    protected SecureWhitelistConfig secureWhitelistConfig() {
        return new SecureWhitelistConfig();
    }

    @Override
    @Bean
    protected AccessDeniedHandler accessDeniedHandler() {
        return new RestfulAccessDeniedHandler();
    }

    @Override
    @Bean
    protected AuthenticationEntryPoint authenticationEntryPoint() {
        return new RestAuthenticationEntryPoint();
    }

    @Override
    @Bean
    protected OncePerRequestFilter oncePerRequestFilter() {
        return new JwtAuthenticationTokenFilter();
    }

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> userService.loadUserByUsername(username);
    }

    @Override
    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
