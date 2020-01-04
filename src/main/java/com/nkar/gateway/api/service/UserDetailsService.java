package com.nkar.gateway.api.service;

import com.nkar.gateway.api.model.UserModel;

public interface UserDetailsService {
    UserModel loadUserByEmail(String email);
}
