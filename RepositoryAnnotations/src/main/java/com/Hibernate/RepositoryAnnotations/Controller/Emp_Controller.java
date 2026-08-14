package com.Hibernate.RepositoryAnnotations.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hibernate.RepositoryAnnotations.Classes.Employee;
import com.Hibernate.RepositoryAnnotations.Repository.Emp_Repo;

@RestController
public class Emp_Controller {

	private Emp_Repo repo;
	
	Emp_Controller(Emp_Repo repo){
		this.repo = repo;
	}
	
	@PostMapping("/add-emp")
	public String add(@RequestBody Employee emp) {
		repo.save(emp);
		return emp.getName() +  " saved Successfully.";
	}
	
	@GetMapping("/get-all")
	public List<Employee> get(){
		return repo.findAll();
	}
	
	@DeleteMapping("/delete-id/{id}")
	public String dele(@PathVariable(value= "id") int i) {
		repo.deleteById(i);
		return "Deleted";
	}
	
} 
