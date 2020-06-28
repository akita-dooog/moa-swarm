package com.akita.moa.portal.service;

import com.akita.moa.model.UmsUser;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    String login(String username, String password);

    UmsUser getByUsername(String username);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

}
