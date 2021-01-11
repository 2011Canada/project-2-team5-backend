package com.revature.project2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2.entities.Credentials;
import com.revature.project2.entities.Player;
import com.revature.project2.services.PlayerService;
import com.revature.project2.utils.PasswordUtils;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

	private PlayerService ps;

	@Autowired
	public PlayerController(PlayerService ps) {
		this.ps = ps;
	}

	@GetMapping
	public ResponseEntity<List<Player>> findAllPlayers() {

		return new ResponseEntity<List<Player>>(ps.findAllPlayers(), HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Player> findPlayerById(@PathVariable int id) {

		Player p = ps.findPlayerById(id);
		if (p == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@PostMapping("/signup")
	public ResponseEntity<Player> saveNewPlayer(@RequestBody Player player) {

		// encrypt password
		String salt = PasswordUtils.getSalt(25);
		String securePassword = PasswordUtils.generateSecurePassword(player.getPassword(), salt);
		player.setPlayerId(0);
		player.setPassword(securePassword);
		player.setSalt(salt);
		player.setLeadboard(0);
		player.setPhoto(null);

		// ps.savePlayer(player);
		return new ResponseEntity<>(player, HttpStatus.CREATED);

	}

	@PostMapping("/login")
	public ResponseEntity<Player> login(@RequestBody Credentials cred) {

		Player p = ps.findPlayerByEmail(cred.getEmail());
		if (p == null) {
			return new ResponseEntity<Player>(HttpStatus.NOT_FOUND);
		}

		boolean passwordMatch = PasswordUtils.verifyUserPassword(cred.getPassword(), p.getPassword(), p.getSalt());

		if (passwordMatch) {
			return new ResponseEntity<>(p, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

}
