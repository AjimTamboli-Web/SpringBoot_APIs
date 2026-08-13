package com.JPA.jpaConnectivity.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.jpaConnectivity.Entity.Teacher;
import com.JPA.jpaConnectivity.Repository.Teacher_Repo;

@Service
public class Teacher_service {
	
	@Autowired
	private Teacher_Repo repo;
	
	public String add1(Teacher teach) {
		if(teach != null) {
			repo.save(teach);
		}else {
			System.out.println("Exceptions......");
		}
		return " Teacher added ";
	}
	
	public List<Teacher> show(){
		return repo.findAll();
	}
	
	public Optional<Teacher> getById(int id) {
		 return repo.findById(id);
	}
}
