package com.Relation.Bidirectional.Service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Relation.Bidirectional.Dtos.CustomerDto;

import com.Relation.Bidirectional.Entity.Customer;

import com.Relation.Bidirectional.Repository.Customer_repo;

@Service
public class Customer_service {

	@Autowired
	private Customer_repo repo;

	
	public String add(Customer custo) {
		
		repo.save(custo);
		return custo.getCust_name() +" added.";
	}
	
	public List<Customer> showall(){
		return repo.findAll();
	}
	
	public List<CustomerDto> show(){
		List<Customer> list = repo.findAll();
		return list.stream().map(CustomerDto::convert).collect(Collectors.toList());
	}
	
}
