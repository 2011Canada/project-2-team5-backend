package com.revature.project2.services;

import java.util.List;

import com.revature.project2.entities.Alias;

public interface AliasService {
	
	public List<Alias> findByUserID(int userID);
	
	public Alias makeNewAlias(int userID, String name);
	
	public Alias findActiveAlias(int userID);
	
	public Alias setActiveAlias(int userID);

}
