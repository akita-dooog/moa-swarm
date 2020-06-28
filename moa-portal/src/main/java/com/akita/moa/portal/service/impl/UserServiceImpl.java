package com.akita.moa.portal.service.impl;

import com.akita.moa.mapper.UmsUserMapper;
import com.akita.moa.model.UmsUser;
import com.akita.moa.model.UmsUserExample;
import com.akita.moa.portal.domain.UmsUserDetails;
import com.akita.moa.portal.service.UserService;
import com.akita.moa.security.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UmsUserMapper umsUserMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenUtil tokenUtil;

    public String login(String username, String password) {
        UserDetails userDetails = loadUserByUsername(username);

        if (!userDetails.getPassword().equals(password)) {
            throw new BadCredentialsException("密码错误");
        }

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        return tokenUtil.generateToken(userDetails);
    }

    public UmsUser getByUsername(String username) {
        UmsUserExample example = new UmsUserExample();
        UmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andUserNameEqualTo(username);

        List<UmsUser> users = umsUserMapper.selectByExample(example);
        if (users.size() > 0) {
            return users.get(0);
        }

        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsUser user = getByUsername(username);
        if (null != user) return new UmsUserDetails(user);
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
