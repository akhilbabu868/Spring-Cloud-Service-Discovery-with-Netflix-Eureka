package com.employeeservice.services;

import java.util.List;

import com.employeeservice.model.addressmaster;
import com.employeeservice.model.employees;




public interface employeeservice {


	List<getAllList> employeelistAll();
	
	int add(employees emp);

	void delete(int id);

	employees getEmployeesById(int id);
	
	

		
} 
