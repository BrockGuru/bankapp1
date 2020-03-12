package com.employee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
	List<Account> findByIfsc(String ifsc);

}