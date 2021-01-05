package com.revature.project2.services;

import java.util.List;

import com.revature.project2.entities.Reimbursement;

public interface ManagerService {

	public List<Reimbursement> findAll();

	public Reimbursement findById(int id);

	public void save(Reimbursement reimbursement);

	public void deleteById(int id);
}
