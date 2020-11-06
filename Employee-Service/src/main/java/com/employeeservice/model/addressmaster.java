package com.employeeservice.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class addressmaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  permanent_address;
	private String  correspondence_address;
	private Integer employee_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id", nullable = false, insertable = false, updatable = false)
	private employees Emp;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPermanent_address() {
		return permanent_address;
	}
	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}
	public String getCorrespondence_address() {
		return correspondence_address;
	}
	public void setCorrespondence_address(String correspondence_address) {
		this.correspondence_address = correspondence_address;
	}
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	
	
	
	
	
	public addressmaster(int id, String permanent_address, String correspondence_address, Integer employee_id) {
		super();
		this.id = id;
		this.permanent_address = permanent_address;
		this.correspondence_address = correspondence_address;
		this.employee_id = employee_id;
	}
	public addressmaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
}
