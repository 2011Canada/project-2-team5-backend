package com.revature.project2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project2.entities.Alias;
import com.revature.project2.entities.User;
import com.revature.project2.repositories.AliasDAO;
import com.revature.project2.repositories.PlayerDAO;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	private PlayerDAO cd;
	
	private AliasDAO ad;
	
	@Autowired
	public PlayerServiceImpl(PlayerDAO cd, AliasDAO ad) {
		super();
		this.cd = cd;
		this.ad = ad;
	}

	@Override
	public User findProfileById(int id) {
		
		return cd.getOne(id);
	}

	@Override
	public Alias findAliasByName(int userId, String name) {
		
		return ad.findAliasByName(userId, name);
	}

	@Override
	public Alias createAlias(int userId, String name) {
		
		return ad.createOne(userId, name);
	}

}
