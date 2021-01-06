package com.revature.project2.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.project2.entities.User;
import com.revature.project2.repositories.UserDAO;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	UserDAO userD;

	public UserServiceImpl(UserDAO userD) {
		this.userD = userD;
	}

	@Override
	public User login(String username, String password) {

		User user = userD.findUserByName(username);
		if (user != null) {

			boolean passwordMatch = password.equals(user.getUserPassword());
			if (passwordMatch)
				return user;
		}
		return null;
	}

}
