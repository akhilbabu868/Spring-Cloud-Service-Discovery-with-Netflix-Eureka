package com.employeeservice.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.model.addressmaster;
import com.employeeservice.model.employees;
import com.employeeservice.services.addressservice;
import com.employeeservice.services.employeeservice;

@RestController
public class EmployeeController {

	@Autowired
	private employeeservice service;

	@Autowired
	private addressservice addressservice;

	@GetMapping("/")
	public List<employees> employeeList() {

		List<employees> emp = service.employeelistAll();
		return emp;
	}

	@PostMapping("/employeeadd")
	public void add(employees objEmployee, addressmaster objaddress,
			@RequestParam(value = "first_name", required = false) String firstName,
			@RequestParam(value = "last_name", required = false) String lastName,
			@RequestParam(value = "email", required = false) String Email,
			@RequestParam(value = "employee_code", required = false) String Code,
			@RequestParam(value = "mobile", required = false) String Mobile,
			@RequestParam(value = "position", required = false) String Position,
			@RequestParam(value = "salary", required = false) Integer Salary,
			@RequestParam(value = "permanent_address", required = false) String Address,
			@RequestParam(value = "correspondence_address", required = false) String tempAddress

	) {
		objEmployee.setFirst_name(firstName);
		objEmployee.setLast_name(lastName);
		objEmployee.setEmail(Email);
		objEmployee.setEmployee_code(Code);
		objEmployee.setPosition(Position);
		objEmployee.setMobile(Mobile);
		objEmployee.setSalary(Salary);
		if (service.add(objEmployee) == 1)
		{
			objaddress.setPermanent_address(Address);
			objaddress.setCorrespondence_address(tempAddress);
			objaddress.setEmployee_id(objEmployee.getId());
			addressservice.SaveAddress(objaddress);
		}

	}
	
	
	
	
	@PutMapping("/employeeupdate")
	public void update(employees objEmployee, addressmaster objaddress,
			@RequestParam(value = "first_name", required = false) String firstName,
			@RequestParam(value = "last_name", required = false) String lastName,
			@RequestParam(value = "email", required = false) String Email,
			@RequestParam(value = "employee_code", required = false) String Code,
			@RequestParam(value = "mobile", required = false) String Mobile,
			@RequestParam(value = "position", required = false) String Position,
			@RequestParam(value = "salary", required = false) Integer Salary,
			@RequestParam(value = "permanent_address", required = false) String Address,
			@RequestParam(value = "correspondence_address", required = false) String tempAddress

	) {
		
		objEmployee.setFirst_name(firstName);
		objEmployee.setLast_name(lastName);
		objEmployee.setEmail(Email);
		objEmployee.setEmployee_code(Code);
		objEmployee.setPosition(Position);
		objEmployee.setMobile(Mobile);
		objEmployee.setSalary(Salary);
		if (service.add(objEmployee) == 1)
		{
			objaddress.setPermanent_address(Address);
			objaddress.setCorrespondence_address(tempAddress);
			objaddress.setEmployee_id(objEmployee.getId());
			addressservice.SaveAddress(objaddress);
		}

	}
	
	
	
	
	
	@DeleteMapping("/employeedelete/{id}")  
	private void deleteEmployee(@PathVariable("id") int employeeID)   
	{  
		service.delete(employeeID);
	}  
	
	
	
	
	

}
