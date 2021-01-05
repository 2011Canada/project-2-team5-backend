package com.revature.project2.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.project2.entities.Reimbursement;

@Repository
public class ReimbursementDAOJpaImpl implements ReimbursementDAO {

	private EntityManager entityManager;

	@Autowired
	public ReimbursementDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Reimbursement> findAll() {

		TypedQuery<Reimbursement> theQuery = entityManager.createQuery("from Reimbursement", Reimbursement.class);

		List<Reimbursement> reimbursements = theQuery.getResultList();

		return reimbursements;
	}

	@Override
	public Reimbursement findById(int id) {

		Reimbursement reimbursement = entityManager.find(Reimbursement.class, id);

		return reimbursement;
	}

	@Override
	public void save(Reimbursement reimbursement) {

		try {
			Reimbursement dbReimbursement = entityManager.merge(reimbursement);

			reimbursement.setReimbursementId(dbReimbursement.getReimbursementId());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void deleteById(int id) {

		try {

			TypedQuery<Reimbursement> theQuery = entityManager
					.createQuery("delete from Reimbursement where id=:reimbursementId", Reimbursement.class);

			theQuery.setParameter("reimbursementId", id);

			theQuery.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
