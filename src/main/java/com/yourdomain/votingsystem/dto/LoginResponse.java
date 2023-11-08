package com.yourdomain.votingsystem.dto;

public class LoginResponse {
    private String token;
    private String type = "Bearer";

    public LoginResponse(String token) {
        this.token = token;
    }

    // Getters and setters
}
