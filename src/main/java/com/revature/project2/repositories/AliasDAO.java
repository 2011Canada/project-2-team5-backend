package com.revature.project2.repositories;

import com.revature.project2.entities.Alias;

public interface AliasDAO{
	
	public Alias findAliasByName(int userId, String name);
	
	public Alias createOne(int userId, String name);

}
