package com.revature.project2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.project2.entities.Contract;

public interface ContractDAO extends JpaRepository<Contract, Integer> {

}
