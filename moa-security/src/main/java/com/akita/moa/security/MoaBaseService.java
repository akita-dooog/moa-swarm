package com.akita.moa.security;

import com.akita.moa.security.util.MoaUserDetailsUtil;

public interface MoaBaseService {
    default MoaUserDetails userDetails() {
        return MoaUserDetailsUtil.getUserDetails();
    }
}
