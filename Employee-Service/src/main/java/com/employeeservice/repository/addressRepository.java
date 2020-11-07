package com.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employeeservice.model.addressmaster;

public interface addressRepository extends JpaRepository<addressmaster, Integer> {

	@Modifying
    @Query("UPDATE addressmaster a SET a.permanent_address = :address  ,a.correspondence_address=:tempaddress WHERE a.employee_id = :employeId")
    int updateAddress(@Param("employeId") int employeId, @Param("address") String address,@Param("tempaddress") String tempaddress);
}
