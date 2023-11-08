package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.LoginRequest;
import com.yourdomain.votingsystem.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    void logout(String token);
}

