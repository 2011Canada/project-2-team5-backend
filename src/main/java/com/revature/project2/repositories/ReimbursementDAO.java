package com.revature.project2.repositories;

import java.util.List;

import com.revature.project2.entities.Reimbursement;

public interface ReimbursementDAO {

	public List<Reimbursement> findAll();

	public Reimbursement findById(int id);

	public void save(Reimbursement reimbursement);

	public void deleteById(int id);
}
