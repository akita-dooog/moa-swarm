package com.akita.moa.govern.service.impl;

import cn.hutool.core.date.DateUtil;
import com.akita.moa.govern.service.UserService;
import com.akita.moa.mapper.GmsUserMapper;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserExample;
import com.akita.moa.security.MoaAuthKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private GmsUserMapper userMapper;

    public List<GmsUser> incList(String datetime) {
        GmsUserExample example = new GmsUserExample();
        GmsUserExample.Criteria criteria = example.createCriteria();

        criteria.andCompanyIdIn((List<Long>) userDetails().getSourcesByAuthKey(MoaAuthKey.MY_COMPANY_ID));

        if (!StringUtils.isEmpty(datetime)) {
            criteria.andUpdatedTimeGreaterThan(DateUtil.parseDateTime(datetime));
        }

        criteria.andIsAvailableEqualTo(1);
        return userMapper.selectByExample(example);
    }
}
