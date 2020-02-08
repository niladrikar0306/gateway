package com.nkar.gateway.api.repository;

import com.nkar.gateway.api.viewmodel.user.RegisterRequest;

public interface UserRepository {

    boolean saveUser(RegisterRequest request);

}

