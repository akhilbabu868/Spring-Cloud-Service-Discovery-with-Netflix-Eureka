package com.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeservice.model.addressmaster;

public interface addressRepository extends JpaRepository<addressmaster, Integer> {

}
