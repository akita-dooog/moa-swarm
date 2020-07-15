package com.akita.moa.security.util;

import com.akita.moa.security.MoaUserDetails;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsUtil {
    public static void authentication(UserDetails userDetails) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }

    public static MoaUserDetails getUserDetails() {
        return (MoaUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
