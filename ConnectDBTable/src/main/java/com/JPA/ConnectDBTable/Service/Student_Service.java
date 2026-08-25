package com.JPA.ConnectDBTable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.ConnectDBTable.Entity.Student;
import com.JPA.ConnectDBTable.Repository.Student_Repo;

@Service
public class Student_Service {

	@Autowired
	private Student_Repo repo;
	
	public String add(Student stud) {
		repo.save(stud);
		return stud.getName() + " Added Successfully...";
	}
	
	public List<Student> show(){
		 return repo.findAll();
	}
	
	public List<Student> findByName(String name){
		return repo.findByName(name);
	}
}
