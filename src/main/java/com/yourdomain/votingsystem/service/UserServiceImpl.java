package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.UserProfileDto;
import com.yourdomain.votingsystem.dto.UserRegistrationDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void registerUser(UserRegistrationDto registrationDto) {

    }

    @Override
    public UserProfileDto getUserProfile(Long userId) {

        UserProfileDto userProfile = new UserProfileDto();
        userProfile.setId(userId);
        userProfile.setUsername("dummyUser");
        userProfile.setEmail("dummyUser@example.com");
        return userProfile;
    }
}
