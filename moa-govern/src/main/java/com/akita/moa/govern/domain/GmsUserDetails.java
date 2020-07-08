package com.akita.moa.govern.domain;

import com.akita.moa.govern.util.AuthorityUtil;
import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserAccount;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class GmsUserDetails implements UserDetails {
    private final GmsUserAccount account;
    private final GmsUser user;
    private List<UserAuthority> authorities;

    public GmsUserDetails(GmsUserAccount account, GmsUser user) {
        this.account = account;
        this.user = user;

        // 初始化一个公司ID权限，查询该公司的部门和用户
        authorities = AuthorityUtil.initAuth(user);
    }

    public GmsUserDetails(GmsUserAccount account, GmsUser user, List<UserAuthority> authorities) {
        this.account = account;
        this.user = user;
        this.authorities = authorities;
    }

    @Override
    public Collection<UserAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getIsAvailable() == 1;
    }
}
