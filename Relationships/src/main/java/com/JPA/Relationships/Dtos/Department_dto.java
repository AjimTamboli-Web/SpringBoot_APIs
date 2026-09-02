package com.JPA.Relationships.Dtos;


import com.JPA.Relationships.Entity.Department;

public class Department_dto {

	private String name;
	private char category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	
	public static Department_dto convert(Department depo){
		Department_dto dto = new Department_dto();
		dto.setName(depo.getName());
		dto.setCategory(depo.getCategory());
		return dto;
	}
	
	
}
