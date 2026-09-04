package com.Relation.Bidirectional.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bank_Id;
	
	private String bank_Name;
	
	@Column(unique=true)
	private String ifsc_Code;
	private String location;
	
	
	@OneToMany(mappedBy = "bank")
	private List<Customer> customer;
	
	
	
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	public int getBank_Id() {
		return bank_Id;
	}
	public void setBank_Id(int bank_Id) {
		this.bank_Id = bank_Id;
	}
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getIfsc_Code() {
		return ifsc_Code;
	}
	public void setIfsc_Code(String ifsc_Code) {
		this.ifsc_Code = ifsc_Code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
