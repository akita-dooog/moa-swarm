package com.akita.moa.govern.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.akita.moa.govern.dto.LoginReq;
import com.akita.moa.govern.service.LoginService;
import com.akita.moa.mapper.GmsUserAccountMapper;
import com.akita.moa.mapper.GmsUserMapper;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserAccount;
import com.akita.moa.model.GmsUserAccountExample;
import com.akita.moa.model.GmsUserExample;
import com.akita.moa.security.MoaAuthKey;
import com.akita.moa.security.MoaUserAuthority;
import com.akita.moa.security.MoaUserDetails;
import com.akita.moa.security.util.JwtTokenUtil;
import com.akita.moa.security.util.MoaUserDetailsUtil;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
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
        GmsUserAccount account = getAccount(req.getUsername());

        if (!account.getPassword().equals(req.getPassword()))
            throw new BadCredentialsException("用户名密码错误");

        MoaUserDetails userDetails = (MoaUserDetails) loadUserByUsername(req.getUsername());

        MoaUserDetailsUtil.authentication(userDetails);

        return jwtTokenUtil.generateToken(userDetails);
    }

    @Override
    public String logout() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        GmsUser user = getUser(username);

        return MoaUserDetails.builder()
                .username(username)
                .isAvailable(user.getIsAvailable().equals(1))
                .authorities(Sets.newHashSet(new MoaUserAuthority(MoaAuthKey.MY_COMPANY_ID, user.getCompanyId()))).build();
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
