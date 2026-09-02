package com.JPA.Relationships.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Relationships.Entity.Company;
import com.JPA.Relationships.Service.Company_service;

@RestController   
@RequestMapping("/company")
public class Company_controller {

	@Autowired
	private Company_service service;
	
	@PostMapping("/add")
	public String create(@RequestBody Company comp) {
		return service.create(comp);
	}
	 
	@GetMapping("/show")
	public List<Company> show(){
		return service.show();
	}
	
}
