package com.nkar.gateway.api.controller;

import com.nkar.gateway.api.model.UserModel;
import com.nkar.gateway.api.repository.UserRepository;
import com.nkar.gateway.api.service.UserDetailsService;
import com.nkar.gateway.api.viewmodel.Responses;
import com.nkar.gateway.api.viewmodel.SimpleResponse;
import com.nkar.gateway.api.viewmodel.user.LoginRequest;
import com.nkar.gateway.api.viewmodel.user.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public SimpleResponse login(@RequestBody LoginRequest loginRequest) {
        UserModel user = userDetailsService.loadUserByEmail(loginRequest.getEmail());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            Authentication authenticationToken = new PreAuthenticatedAuthenticationToken(user, "", user.getRoles());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            return Responses.SUCCESSFUL;
        } else {
            return Responses.FAILED;
        }
    }

    @PostMapping("/register")
    public SimpleResponse register(@RequestBody RegisterRequest request) {
        boolean status = userRepository.saveUser(request);

        return status ? Responses.SUCCESSFUL : Responses.FAILED;
    }

}
