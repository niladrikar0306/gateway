package com.nkar.gateway.api.controller;

import com.nkar.gateway.api.model.UserModel;
import com.nkar.gateway.api.service.UserDetailsService;
import com.nkar.gateway.api.viewmodel.LoginViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/login")
    public String login(@RequestBody LoginViewModel loginViewModel) {
        UserModel user = userDetailsService.loadUserByEmail(loginViewModel.getEmail());
        if (user != null && user.getPassword().equals(loginViewModel.getPassword())) {
            Authentication authenticationToken = new PreAuthenticatedAuthenticationToken(user, "", user.getRoles());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            return "login successful";
        } else {
            return "login unsuccessful";
        }
    }

}
