package com.akita.moa.govern.util;

import com.akita.moa.govern.constant.MoaAuthKey;
import com.akita.moa.govern.domain.GmsUserDetails;
import com.akita.moa.govern.domain.UserAuthority;
import com.akita.moa.model.GmsUser;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorityUtil {
    public static List<Long> getCompanyId(GmsUserDetails userDetails) {
        return userDetails.getAuthorities().stream()
                .filter(userAuthority -> MoaAuthKey.COMPANY.equals(userAuthority.getAuthority()))
                .flatMap(userAuthority -> ((List<Long>)userAuthority.getSources()).stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<UserAuthority> initAuth(GmsUser user) {
        // 初始化拉取组织架构的权限
        return Collections.singletonList(new UserAuthority(MoaAuthKey.COMPANY, Arrays.asList(user.getCompanyId())));
    }
}
