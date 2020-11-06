package com.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeservice.model.employees;


public interface employeeRepository extends JpaRepository<employees, Integer> {

	

}
