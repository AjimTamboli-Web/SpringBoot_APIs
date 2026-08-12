package com.Annotation.Services.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Annotation.Services.Model.Students;
import com.Annotation.Services.Service.Student_Service;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service service;
	
	@PostMapping("/add")
	public String addStud(@RequestBody Students stud) {
		return service.addStudent(stud);
	}
	
	@GetMapping("/getall")
	public List<Students> getStud(){
		return service.getall();
	}
	
	@PostMapping("/adding")
	public String add(@RequestParam int i,@RequestParam String n,@RequestParam String c, @RequestParam List<Integer> m) {
		return service.addStude(i, n, c, m);
	}
	
	@GetMapping("/get")
	public Students getstu() {
		return service.get();
	}
	
	@GetMapping("/gethigh")
	public int getHi() {
		return service.getHighest();
	}
	
}
