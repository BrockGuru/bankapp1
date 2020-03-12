package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
