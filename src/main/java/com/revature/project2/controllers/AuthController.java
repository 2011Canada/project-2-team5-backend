package com.revature.project2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2.entities.Credentials;
import com.revature.project2.entities.User;
import com.revature.project2.services.UserService;

@RestController
@RequestMapping("/api")
public class AuthController {

	private UserService userService;

	public AuthController(UserService userService) {

		this.userService = userService;
	}

	@PostMapping("/login")
	public User login(@RequestBody Credentials cred) {

		User user = userService.login(cred.getUsername(), cred.getPassword());

		if (user == null) {
			throw new RuntimeException("User name not fround - " + cred.getUsername());
		}

		return user;

	}

	@PostMapping("/signup")
	public User signup(@RequestBody User user) {

		// System.out.println(user.getUserName());
		user.setUserId(0);
		user.setPhoto("");
		user.setLeadboard(0);

		// DISABLE FOR NOW
		// userService.save(user);

		return user;

	}

}
