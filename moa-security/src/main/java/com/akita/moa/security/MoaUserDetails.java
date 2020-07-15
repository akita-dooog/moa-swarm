package com.akita.moa.security;

import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Builder
public class MoaUserDetails implements UserDetails {
    private String username;

    private boolean isAvailable;

    private Set<MoaUserAuthority> authorities;

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return null;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return isAvailable;
    }

    public boolean isAccountNonLocked() {
        return isAvailable;
    }

    public boolean isCredentialsNonExpired() {
        return isAvailable;
    }

    public boolean isEnabled() {
        return isAvailable;
    }
}
