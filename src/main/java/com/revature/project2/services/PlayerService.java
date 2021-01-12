package com.revature.project2.services;

import java.util.List;

import com.revature.project2.entities.Alias;
import com.revature.project2.entities.Player;

public interface PlayerService {

	public List<Player> findAllPlayers();

	public Player findPlayerById(int id);

	public Player findPlayerByEmail(String email);

	public Player savePlayer(Player player);
	
	public Alias findAliasByName(int userId, String name);
	
	public Alias createAlias(int userId, String name);

}
