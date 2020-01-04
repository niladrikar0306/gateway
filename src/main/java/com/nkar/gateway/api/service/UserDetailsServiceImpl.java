package com.nkar.gateway.api.service;

import com.nkar.gateway.api.model.Role;
import com.nkar.gateway.api.model.UserModel;
import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private static Map<String, UserModel> users = new HashMap<String, UserModel>() {{
        put("user1@gmail.com", new UserModel(1, "user1@gmail.com", "pass1", new ArrayList<>(List.of(Role.ADMIN))));
        put("user2@gmail.com", new UserModel(1, "user2@gmail.com", "pass2", new ArrayList<>(List.of(Role.USER))));
    }};

    public UserModel loadUserByEmail(String email) {
        return users.get(email);
    }
}
