package com.nkar.gateway.api.repository;

import com.nkar.gateway.api.viewmodel.user.RegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements UserRepository {


    @Override
    public boolean saveUser(RegisterRequest request) {
        return false;
    }
}
