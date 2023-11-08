package com.yourdomain.votingsystem.service;

import com.yourdomain.votingsystem.dto.UserRegistrationDto;
import com.yourdomain.votingsystem.dto.UserProfileDto; // You will need to create this DTO class as well.

public interface UserService {
    void registerUser(UserRegistrationDto registrationDto);
    UserProfileDto getUserProfile(Long userId);
}
