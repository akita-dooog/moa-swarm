package com.akita.moa.govern.service.impl;

import com.akita.moa.govern.service.UserService;
import com.akita.moa.mapper.GmsUserMapper;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private GmsUserMapper userMapper;

    public List<GmsUser> incList(String datetime) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        GmsUserExample example = new GmsUserExample();
        GmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andUsernameEqualTo(userDetails.getUsername());

        if (StringUtils.isEmpty(datetime)) {

        }
        return null;
    }
}
