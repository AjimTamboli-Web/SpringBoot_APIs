package com.JPA.ConnectDBTable.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.ConnectDBTable.Entity.Student;
import com.JPA.ConnectDBTable.Service.Student_Service;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service service;
	
	@PostMapping("/creat")
	public String create(@RequestBody Student stud) {
		return service.add(stud);
	}
	
	@GetMapping("/show")
	public List<Student> show(){
		return service.show();
	}
	
	@GetMapping("/byName/{name}") // giving a place holder
	public List<Student> byname(@PathVariable(value="name") String name){
		return service.findByName(name);
	}
	
}
