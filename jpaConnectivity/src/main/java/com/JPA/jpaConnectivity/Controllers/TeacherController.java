package com.JPA.jpaConnectivity.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.jpaConnectivity.Entity.Teacher;
import com.JPA.jpaConnectivity.Service.Teacher_service;

@RestController
public class TeacherController {

	@Autowired
	Teacher_service service;
	
	@PostMapping("/add-teacher")
	public String add(@RequestBody Teacher teach) {
		return service.add1(teach);
	}
	 
	@GetMapping("/getAll")
	public List<Teacher> get(){
		return service.show();
	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Teacher> getbyid(@PathVariable(value = "id") int id){
		return service.getById(id);
	}
	
}
