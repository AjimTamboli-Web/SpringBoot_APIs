package com.Relation.Bidirectional.Dtos;

import com.Relation.Bidirectional.Entity.Customer;

public class CustomerDto {

	private String cust_name;
	private String cust_acc;
	private double cust_balance;
	
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_acc() {
		return cust_acc;
	}
	public void setCust_acc(String cust_acc) {
		this.cust_acc = cust_acc;
	}
	public double getCust_balance() {
		return cust_balance;
	}
	public void setCust_balance(double cust_balance) {
		this.cust_balance = cust_balance;
	}
	
	public static CustomerDto convert(Customer cuto) {
		CustomerDto dto = new CustomerDto();
		dto.setCust_name(cuto.getCust_name());
		dto.setCust_acc(cuto.getCust_acc());
		dto.setCust_balance(cuto.getCust_balance());
		return dto;
	}
	
}
