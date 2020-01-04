package com.nkar.gateway.api.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ANONYMOUS, // Used internally
    ADMIN,
    USER;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}
