package com.revature.project2.services;

import java.util.List;

import com.revature.project2.entities.Location;

public interface LocationService {

	public List<Location> findAllLocations();
	
	public Location findLocationById(int id);
	
	public Location saveLocation(Location location);
	
}
