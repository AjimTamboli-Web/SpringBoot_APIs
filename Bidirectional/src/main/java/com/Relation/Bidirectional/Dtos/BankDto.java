package com.Relation.Bidirectional.Dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.Relation.Bidirectional.Entity.Bank;
import com.Relation.Bidirectional.Entity.Customer;

public class BankDto {

	private String bank_Name;
	private String ifsc_Code;
	private String location;
	
	private List<CustomerDto2> customer;
	
	
	
	public List<CustomerDto2> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerDto2> customer) {
		this.customer = customer;
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
	
	public static BankDto convert(Bank bank) {
		BankDto dto = new BankDto();
		dto.setBank_Name(bank.getBank_Name());
		dto.setIfsc_Code(bank.getIfsc_Code());
		dto.setLocation(bank.getLocation());
		List<Customer> list = bank.getCustomer();
		dto.setCustomer(list.stream().map(CustomerDto2::convert).collect(Collectors.toList()));
//						(bank.getCustomer());
		return dto;
	}
	
}
