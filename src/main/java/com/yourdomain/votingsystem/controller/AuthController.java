package com.yourdomain.votingsystem.controller;

import com.yourdomain.votingsystem.dto.LoginRequest;
import com.yourdomain.votingsystem.dto.LoginResponse;
import com.yourdomain.votingsystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticateUser(@RequestBody LoginRequest loginRequest) {
        // Implement login logic and return JWT or any other auth token
        LoginResponse loginResponse = authService.login(loginRequest);
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logoutUser(@RequestHeader(value = "Authorization") String token) {
        String actualToken = token.substring(7);

        authService.logout(actualToken);
        return ResponseEntity.ok().build();
    }

}
