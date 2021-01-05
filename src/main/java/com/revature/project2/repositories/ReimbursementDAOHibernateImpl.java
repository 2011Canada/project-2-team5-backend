package com.revature.project2.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.project2.entities.Reimbursement;

@Repository
public class ReimbursementDAOHibernateImpl implements ReimbursementDAO {

	private EntityManager entityManager;

	@Autowired
	public ReimbursementDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Reimbursement> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);

		TypedQuery<Reimbursement> theQuery = currentSession.createQuery("from Reimbursement", Reimbursement.class);

		List<Reimbursement> reimbursements = theQuery.getResultList();

		return reimbursements;
	}

	@Override
	public Reimbursement findById(int id) {

		Session currentSession = entityManager.unwrap(Session.class);

		Reimbursement reimbursement = currentSession.get(Reimbursement.class, id);

		return reimbursement;
	}

	@Override
	public void save(Reimbursement reimbursement) {

		Session currentSession = entityManager.unwrap(Session.class);

		try {
			currentSession.saveOrUpdate(reimbursement);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void deleteById(int id) {

		Session currentSession = entityManager.unwrap(Session.class);

		try {

			TypedQuery<Reimbursement> theQuery = currentSession
					.createQuery("delete from Reimbursement where id=:reimbursementId", Reimbursement.class);

			theQuery.setParameter("reimbursementId", id);

			theQuery.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
