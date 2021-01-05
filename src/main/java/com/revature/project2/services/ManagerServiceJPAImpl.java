package com.revature.project2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.revature.project2.entities.Reimbursement;
import com.revature.project2.repositories.ReimbursementJPARepository;

@Service
public class ManagerServiceJPAImpl implements ManagerService {

	private ReimbursementJPARepository reimbursementJPARepository;

	public ManagerServiceJPAImpl(ReimbursementJPARepository reimbursementJPARepository) {
		this.reimbursementJPARepository = reimbursementJPARepository;
	}

	@Override
	public List<Reimbursement> findAll() {
		// TODO Auto-generated method stub
		return reimbursementJPARepository.findAll();
	}

	@Override
	public Reimbursement findById(int id) {

		Optional<Reimbursement> result = reimbursementJPARepository.findById(id);

		Reimbursement reimbursement = null;

		if (result.isPresent()) {
			reimbursement = result.get();
		}
		return reimbursement;
	}

	@Override
	public void save(Reimbursement reimbursement) {

		reimbursementJPARepository.save(reimbursement);

	}

	@Override
	public void deleteById(int id) {

		reimbursementJPARepository.deleteById(id);
	}

}
