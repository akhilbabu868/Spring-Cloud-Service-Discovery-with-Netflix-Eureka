package com.employeeservice.Impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.employeeservice.model.addressmaster;
import com.employeeservice.repository.addressRepository;
import com.employeeservice.repository.employeeRepository;
import com.employeeservice.services.addressservice;

@SuppressWarnings("unused")
@Service
@Transactional
public class addressserviceImpl implements addressservice {
	
private final addressRepository repo;
	
    public addressserviceImpl(addressRepository repo) {
    	this.repo=repo;
    }


	@Override
	public void SaveAddress(addressmaster address) {
		// TODO Auto-generated method stub
		repo.save(address);
	}


	@Override
	public int updateAddress(int employeId, String address, String tempaddress) {
		// TODO Auto-generated method stub
		int flag;
		if((repo.updateAddress(employeId, address, tempaddress) == 1))
		{
			flag =1;
		}else {
			flag =0;
		}
		return flag;
	}

}
