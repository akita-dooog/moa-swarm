package com.akita.moa.govern.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.akita.moa.govern.domain.UmsUserDetails;
import com.akita.moa.govern.dto.LoginReq;
import com.akita.moa.govern.service.UserService;
import com.akita.moa.mapper.UmsUserMapper;
import com.akita.moa.model.UmsUser;
import com.akita.moa.model.UmsUserExample;
import com.akita.moa.security.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UmsUserMapper umsUserMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public String login(LoginReq req) {
        UserDetails userDetails = loadUserByUsername(req.getUsername());

        if (!userDetails.getPassword().equals(req.getPassword()))
            throw new BadCredentialsException("用户名密码错误");

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        return jwtTokenUtil.generateToken(userDetails);
    }

    @Override
    public String logout() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UmsUserExample example = new UmsUserExample();
        UmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andUserNameEqualTo(username);
        List<UmsUser> users = umsUserMapper.selectByExample(example);

        if (CollUtil.isEmpty(users)) {
            throw new UsernameNotFoundException("查找不到该用户");
        }
        return new UmsUserDetails(users.get(0));
    }
}
