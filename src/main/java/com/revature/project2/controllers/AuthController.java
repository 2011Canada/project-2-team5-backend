package com.revature.project2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<User> login(@RequestBody Credentials cred) {

		User user = userService.login(cred.getUsername(), cred.getPassword());

		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody User user) {

		// System.out.println(user.getUserName());
		user.setUserId(0);
		user.setPhoto("");
		user.setLeadboard(0);

		// DISABLE FOR NOW
		// userService.save(user);

		return new ResponseEntity<User>(user, HttpStatus.CREATED);

	}

}
