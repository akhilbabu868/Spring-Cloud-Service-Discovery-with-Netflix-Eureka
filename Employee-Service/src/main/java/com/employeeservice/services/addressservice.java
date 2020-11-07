package com.employeeservice.services;

import com.employeeservice.model.addressmaster;

public interface addressservice {

	
	void SaveAddress(addressmaster address);
	
	 int updateAddress(int employeId,String address,String tempaddress);
}
