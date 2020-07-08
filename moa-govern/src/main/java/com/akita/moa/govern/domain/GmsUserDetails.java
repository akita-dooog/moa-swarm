package com.akita.moa.govern.domain;

import com.akita.moa.model.GmsUser;
import com.akita.moa.model.GmsUserAccount;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class GmsUserDetails implements UserDetails {
    private final GmsUserAccount account;
    private final GmsUser user;

    public GmsUserDetails(GmsUserAccount account, GmsUser user) {
        this.account = account;
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("companyId:" + user.getCompanyId()));
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
