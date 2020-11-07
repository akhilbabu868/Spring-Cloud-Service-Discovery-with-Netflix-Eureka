package com.employeeservice.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;

import com.employeeservice.model.addressmaster;
import com.employeeservice.model.employees;
import com.employeeservice.repository.employeeRepository;
import com.employeeservice.services.employeeservice;
import com.employeeservice.services.getAllList;


@SuppressWarnings("unused")
@Service
@Transactional
public class employeeserviceImpl implements  employeeservice{

	
private final employeeRepository repo;
	
    public employeeserviceImpl(employeeRepository repo) {
    	this.repo=repo;
    }

	@Override
	public List<getAllList> employeelistAll() {
		// TODO Auto-generated method stub
		return repo.getEmployee();
	}

	@Override
	public int add(employees emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
		return 1;
	}
	
	@Override
	public void delete(int id)   
	{  
		repo.deleteById(id);  
	}  
	
	@Override
	public employees getEmployeesById(int id)   
	{  
	return repo.findById(id).get();  
	} 


	
		  
	
    
   



}
