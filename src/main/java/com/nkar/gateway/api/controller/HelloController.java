package com.nkar.gateway.api.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
