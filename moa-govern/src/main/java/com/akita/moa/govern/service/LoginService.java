package com.akita.moa.govern.service;

import com.akita.moa.govern.dto.LoginReq;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface LoginService extends UserDetailsService {

    /**
     * 登录接口
     * @param req
     * @return
     */
    String login(LoginReq req);

    String logout();
}
