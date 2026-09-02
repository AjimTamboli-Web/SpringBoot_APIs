package com.JPA.Relationships.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.Relationships.Dtos.Department_dto;
import com.JPA.Relationships.Entity.Department;
import com.JPA.Relationships.Repository.Department_repo;

@Service
public class Department_service {

	@Autowired
	private Department_repo repo;
	
	public String add(Department depa) {
		repo.save(depa);
		return depa.getName() + " saved.";
	}
	
	public List<Department> showall(){
		return repo.findAll();
	}
	
	public List<Department_dto> show(){
		List<Department> list = repo.findAll();
	return	list.stream().map((depart) -> {return Department_dto.convert(depart);}).collect(Collectors.toList());
	}
	
	public int updateCategory(char c, int i){
		return repo.updatecategory(c, i);
	}
}
