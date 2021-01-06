package com.revature.project2.repositories;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.revature.project2.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private EntityManager entityManager;

	public UserDAOImpl(EntityManager entityManager) {

		this.entityManager = entityManager;
	}

	@Override
	public User findUserByName(String username) {

		String query = "SELECT c FROM User c WHERE c.userName = :username";

		TypedQuery<User> tq = entityManager.createQuery(query, User.class);
		tq.setParameter("username", username);

		User user = tq.getSingleResult();

		return user;

	}

}
