package com.revature.project2.repositories;

import com.revature.project2.entities.User;

public interface UserDAO {

	public User findUserByName(String userName);
}
