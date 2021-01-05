package com.revature.project2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.project2.entities.Reimbursement;

public interface ReimbursementJPARepository extends JpaRepository<Reimbursement, Integer> {

}
