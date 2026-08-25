package com.JPA.ConnectDBTable.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JPA.ConnectDBTable.Entity.Teacher;
import com.JPA.ConnectDBTable.Entity.TeacherDTOs;
import com.JPA.ConnectDBTable.Repository.Teacher_Repo;

@Service
public class Teacher_Service {

	@Autowired
	private Teacher_Repo repo;
	
	public String creat(Teacher teach){
		repo.save(teach);
		return teach.getName() + " added.";
	}
	
	// it's exposing all data does not provide hiding methods that's why we use DTOs
	public List<Teacher> show(){
		return  repo.findAll();
	}
	
	// it provide hiding technique using DTO
	public List<TeacherDTOs> show2() {
		
		List<Teacher	> list = repo.findAll();
		List<TeacherDTOs> dto =
				// this logic it convert the List<Teacher> to List<TeacherDTOs>
		list.stream().map((teacher) -> { return TeacherDTOs.converter(teacher);})
					.collect(Collectors.toList());  	
		return dto;
	}
	
	public List<Teacher> byNameGet(String name){
		return repo.byCity(name);
	}
	
	public String byId(int i) {
		 repo.deleteById(i);
		 return "deleted";
	}
	
	public int updateById(int id,String email) {
		return repo.updateEmail(id,email);
	}
	
	
}
