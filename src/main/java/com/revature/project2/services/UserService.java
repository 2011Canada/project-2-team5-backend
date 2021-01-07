package com.revature.project2.services;

import com.revature.project2.entities.User;

public interface UserService {

	public User login(String username, String password);

	public void save(User user);

}
