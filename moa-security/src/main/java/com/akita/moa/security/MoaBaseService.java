package com.akita.moa.security;

import com.akita.moa.security.util.UserDetailsUtil;

public interface MoaBaseService {
    default MoaUserDetails userDetails() {
        return UserDetailsUtil.getUserDetails();
    }
}
