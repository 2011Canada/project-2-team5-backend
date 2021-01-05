package com.revature.project2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project2.entities.Reimbursement;
import com.revature.project2.services.ManagerService;

@RestController
@RequestMapping("/api")
public class HibernateRestController {

	// private ManagerService managerService;
//	public HibernateRestController(ManagerService managerService) {
//		this.managerService = managerService;
//	}

	private ManagerService managerService;

	public HibernateRestController(@Qualifier("managerServiceJPAImpl") ManagerService managerService) {
		this.managerService = managerService;
	}

	@GetMapping("/reimbursements")
	public List<Reimbursement> findAll() {
		return managerService.findAll();
	}

	@GetMapping("/reimbursements/{reimbursementId}")
	public Reimbursement getReimbursement(@PathVariable int reimbursementId) {

		Reimbursement reimbursement = managerService.findById(reimbursementId);

		if (reimbursement == null) {
			throw new RuntimeException("Reimbursement id not fround - " + reimbursementId);
		}

		return reimbursement;
	}

	@PostMapping("/reimbursements")
	public Reimbursement addReimbursement(@RequestBody Reimbursement reimbursement) {

		reimbursement.setReimbursementId(0);

		managerService.save(reimbursement);

		return reimbursement;

	}

	@PutMapping("/reimbursements")
	public Reimbursement updateReimbursement(@RequestBody Reimbursement reimbursement) {

		managerService.save(reimbursement);
		return reimbursement;
	}

	@DeleteMapping("/reimbursements/{reimbursementId}")
	public String deleteReimbursement(@PathVariable int reimbursementId) {

		Reimbursement reimbursement = managerService.findById(reimbursementId);

		if (reimbursement == null) {
			throw new RuntimeException("Reimbursement id not fround - " + reimbursementId);
		}

		managerService.deleteById(reimbursementId);

		return "Delete reimbursement id - " + reimbursementId;
	}

}
