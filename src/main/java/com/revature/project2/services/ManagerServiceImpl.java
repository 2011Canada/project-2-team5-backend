package com.revature.project2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.project2.entities.Reimbursement;
import com.revature.project2.repositories.ReimbursementDAO;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

	private ReimbursementDAO reimbursementDAO;

	@Autowired
	public ManagerServiceImpl(@Qualifier("reimbursementDAOJpaImpl") ReimbursementDAO reimbursementDAO) {
		this.reimbursementDAO = reimbursementDAO;
	}

	@Override
	public List<Reimbursement> findAll() {
		// TODO Auto-generated method stub
		return reimbursementDAO.findAll();
	}

	@Override
	public Reimbursement findById(int id) {
		// TODO Auto-generated method stub
		return reimbursementDAO.findById(id);
	}

	@Override
	public void save(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		reimbursementDAO.save(reimbursement);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		reimbursementDAO.deleteById(id);
	}

}
