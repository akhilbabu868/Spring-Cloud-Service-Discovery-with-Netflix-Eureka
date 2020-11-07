package com.employeeservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employeeservice.model.employees;
import com.employeeservice.services.getAllList;


public interface employeeRepository extends JpaRepository<employees, Integer> {

	@Query(value = "select  e.id as id ,e.first_name as firstName,e.last_name  as lastName,e.email  as email,e.employee_code as code ,e.mobile  as mobile,e.position as position,e.salary  as salary,a.permanent_address as address ,a.correspondence_address as tempAddress from employees e inner join addressmaster a on e.id = a.employee_id ",nativeQuery = true)
     public List<getAllList> getEmployee();

}
