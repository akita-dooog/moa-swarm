package com.akita.moa.govern.service.impl;

import cn.hutool.core.date.DateUtil;
import com.akita.moa.govern.domain.GmsUserDetails;
import com.akita.moa.govern.service.UserService;
import com.akita.moa.govern.util.AuthorityUtil;
import com.akita.moa.mapper.GmsUserMapper;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private GmsUserMapper userMapper;

    public List<GmsUser> incList(String datetime) {
        GmsUserDetails userDetails = (GmsUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        GmsUserExample example = new GmsUserExample();
        GmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andCompanyIdIn(AuthorityUtil.getCompanyId(userDetails));

        if (!StringUtils.isEmpty(datetime)) {
            criteria.andUpdatedTimeGreaterThan(DateUtil.parseDateTime(datetime));
        }

        criteria.andIsAvailableEqualTo(1);
        return userMapper.selectByExample(example);
    }
}
