package com.Relation.Bidirectional.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Relation.Bidirectional.Dtos.CustomerDto;
import com.Relation.Bidirectional.Entity.Customer;
import com.Relation.Bidirectional.Service.Customer_service;

@RestController
@RequestMapping("/customer")
public class Customer_controller {

	@Autowired
	private Customer_service service;
	
	@PostMapping("/add")
	public String add(@RequestBody Customer custo) {
		return service.add(custo);
	}
	
	@GetMapping("/showall")
	public List<Customer> showall(){
		return service.showall();
	}
	
	@GetMapping("/show")
	public List<CustomerDto> show(){
		return service.show();
	}
	
}
