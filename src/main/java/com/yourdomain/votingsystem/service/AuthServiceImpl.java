package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.LoginRequest;
import com.yourdomain.votingsystem.dto.LoginResponse;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        // Implement your login logic here and return a LoginResponse
        return new LoginResponse("dummy-token-for-now");
    }

    private List<String> blacklistedTokens = new ArrayList<>();

    @Override
    public void logout(String token) {
        // Add the token to the blacklist
        blacklistedTokens.add(token);
    }

    public boolean isTokenBlacklisted(String token) {
        return blacklistedTokens.contains(token);
    }

    // ... other methods ...
}
