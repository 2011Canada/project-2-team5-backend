package com.revature.project2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project2.entities.Location;
import com.revature.project2.repositories.LocationDAO;

@Service
public class LocationServiceImpl implements LocationService {

	private LocationDAO ld;
	
	@Autowired
	public LocationServiceImpl(LocationDAO ld) {
		this.ld = ld;
	}
	
	
	@Override
	public List<Location> findAllLocations() {
		return ld.findAll();
	}

	@Override
	public Location findLocationById(int id) {
		return ld.getOne(id);
	}

	@Override
	public Location saveLocation(Location location) {
		return ld.save(location);
	}

}
