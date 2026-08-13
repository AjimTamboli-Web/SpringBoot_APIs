package com.Annotation.Services.Model;

import java.util.List;

//  This is just a POJO class  (Plane Old Java Object)

public class Students {

	private int id;
	private String name;
	private String city;
	private List<Integer> marks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	
	
	
}
