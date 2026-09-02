package com.JPA.Relationships.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Relationships.Entity.Company;
import com.JPA.Relationships.Repository.Company_repo;

@Service
public class Company_service {

	@Autowired
	private Company_repo repo;
	
	public String create(Company comp) {
		repo.save(comp);
		return comp.getName()+" added.";
	}
	
	public List<Company> show(){
		return repo.findAll();
	}
	
	
}
