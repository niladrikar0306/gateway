package com.nkar.gateway.api.model;

import java.util.List;

public class UserModel {

    private int userId;
    private String emailId;
    private String password;
    private List<Role> roles;

    public UserModel(int userId, String emailId, String password, List<Role> roles) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.roles = roles;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
