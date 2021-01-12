package com.revature.project2.repositories;

import org.springframework.stereotype.Repository;

import com.revature.project2.entities.Alias;

@Repository
public class AliasHibernateDAO implements AliasDAO {

	@Override
	public Alias findAliasByName(int userId, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alias createOne(int userId, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
