package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
