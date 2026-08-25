package com.JPA.ConnectDBTable.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.ConnectDBTable.Entity.Teacher;
import com.JPA.ConnectDBTable.Entity.TeacherDTOs;
import com.JPA.ConnectDBTable.Service.Teacher_Service;

@RestController
public class Teacher_Controller {

	@Autowired
	private Teacher_Service service;
	
	@PostMapping("/add-teacher")
	public String add(@RequestBody Teacher teach) {
		return  service.creat(teach);
		
	}
	
	@GetMapping("/show-teacher")
	public List<Teacher> sho(){
		return service.show();
	}
	
	@GetMapping("/show-dto")
	public List<TeacherDTOs> show(){
		return service.show2();
	}
	
	@GetMapping("/byName-teacher")
	public List<Teacher> byNaming(@RequestParam(value="citee") String name){
		
		return service.byNameGet(name);
	}
	
	@DeleteMapping("/delete/{no}")
	public String deleteById(@PathVariable(value="no") int i) {
		return service.byId(i);
	}
	
	@PutMapping("/update/{no}/{email}")
	public int updateEmails(@PathVariable(value = "no") int i,@PathVariable(value="email") String email) {
		return service.updateById(i	, email);
	}
	
}
