package com.JPA.Relationships.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.Relationships.Dtos.Department_dto;
import com.JPA.Relationships.Entity.Department;
import com.JPA.Relationships.Service.Department_service;

@RestController
@RequestMapping("/department")
public class Department_Controller {

	@Autowired
	private Department_service service;
	
	@PostMapping("/add")
	public String add(@RequestBody Department depo) {
		return service.add(depo);
	}
	
	@GetMapping("/showall")
	public List<Department> getall(){
		return service.showall();
	}
	
	@GetMapping("/show")
	public List<Department_dto> get(){
		return service.show();
	}
	
	@PutMapping("/update/{cat}/{id}")
	public int updatecat(@PathVariable(value="cat") char cat,@PathVariable(value="id") int id){
		return service.updateCategory(cat, id);
	}
}
