package com.akita.moa.govern.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.akita.moa.govern.domain.GmsUserDetails;
import com.akita.moa.govern.dto.LoginReq;
import com.akita.moa.govern.service.LoginService;
import com.akita.moa.mapper.GmsUserAccountMapper;
import com.akita.moa.mapper.GmsUserMapper;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserAccount;
import com.akita.moa.model.GmsUserAccountExample;
import com.akita.moa.model.GmsUserExample;
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
public class LoginServiceImpl implements LoginService {
    @Autowired
    private GmsUserAccountMapper userAccountMapper;

    @Autowired
    private GmsUserMapper userMapper;

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
        return new GmsUserDetails(getAccount(username), getUser(username));
    }

    private GmsUser getUser(String username) {
        GmsUserExample example = new GmsUserExample();
        GmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(username);

        List<GmsUser> users = userMapper.selectByExample(example);

        if (CollUtil.isEmpty(users)) {
            throw new UsernameNotFoundException("查找不到该用户");
        }

        return users.get(0);
    }

    private GmsUserAccount getAccount(String username) {
        GmsUserAccountExample example = new GmsUserAccountExample();
        GmsUserAccountExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(username);

        List<GmsUserAccount> accounts = userAccountMapper.selectByExample(example);

        if (CollUtil.isEmpty(accounts)) {
            throw new UsernameNotFoundException("查找不到该用户");
        }

        return accounts.get(0);
    }
}
