package com.revature.project2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2.entities.User;
import com.revature.project2.repositories.PlayerDAO;
import com.revature.project2.entities.Alias;
import com.revature.project2.services.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	private PlayerService ps;
	
	User player1 = new User(1, "mhammad", "password", ".com", "abcde", 1);
	
	Alias alias1 = new Alias(1, 1, "Ozil", "novice", 3);
	//Alias alias2 = new Alias(2, 1, "Zidane", "expert", 1);


	@Autowired
	public PlayerController(PlayerService ps) {
		super();
		this.ps = ps;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findProfileById(@PathVariable int id) {
		
		System.out.println(id);

		//return new ResponseEntity<User>(ps.findProfileById(id), HttpStatus.NOT_FOUND);
		return new ResponseEntity<User>(player1, HttpStatus.OK);

	}

	@GetMapping("/{id}/alias/{name}")
	public ResponseEntity<Alias> findAliasByName(@PathVariable int id, @PathVariable String name) {
		
		System.out.println(id + " " + name);

		//return new ResponseEntity<Alias>(ps.findAliasByName(id, name), HttpStatus.OK);
		return new ResponseEntity<Alias>(alias1, HttpStatus.OK);

	}
	
	@PostMapping("/{id}/alias")
	public ResponseEntity<Alias> createAlias(@PathVariable int id, @RequestBody String name) {
		
		Alias alias2 = new Alias(3, id, name, "expert", 1);
		
		System.out.println(alias2);
		
		//return new ResponseEntity<Alias>(ps.createAlias(id, name), HttpStatus.OK);
		return new ResponseEntity<Alias>(alias2, HttpStatus.OK);
		
	}
	
}
