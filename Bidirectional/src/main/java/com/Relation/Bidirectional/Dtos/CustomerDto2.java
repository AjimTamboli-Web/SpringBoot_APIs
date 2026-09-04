package com.Relation.Bidirectional.Dtos;

import com.Relation.Bidirectional.Entity.Customer;

public class CustomerDto2 {

	private String cust_name;
	private double cust_balance;
	
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public double getCust_balance() {
		return cust_balance;
	}
	public void setCust_balance(double cust_balance) {
		this.cust_balance = cust_balance;
	}
	
	public static CustomerDto2 convert(Customer cuto) {
		CustomerDto2 dto = new CustomerDto2();
		dto.setCust_name(cuto.getCust_name());
		dto.setCust_balance(cuto.getCust_balance());
		return dto;
	}
	
}
