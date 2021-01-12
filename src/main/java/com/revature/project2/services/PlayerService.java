package com.revature.project2.services;

import com.revature.project2.entities.Alias;
import com.revature.project2.entities.User;

public interface PlayerService {
	
	public User findProfileById(int id);
	
	public Alias findAliasByName(int userId, String name);
	
	public Alias createAlias(int userId, String name);
	
}
