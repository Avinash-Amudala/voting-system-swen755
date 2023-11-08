package com.yourdomain.votingsystem.controller;

import com.yourdomain.votingsystem.dto.UserRegistrationDto;
import com.yourdomain.votingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDto registrationDto) {
		userService.registerUser(registrationDto);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/{userId}")
	public ResponseEntity<?> getUserProfile(@PathVariable Long userId) {
		Object userProfile = userService.getUserProfile(userId);
		return ResponseEntity.ok(userProfile);
	}
}
