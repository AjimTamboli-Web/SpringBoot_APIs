package com.JPA.ConnectDBTable.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student") // for give your custom name to the table in DB
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // used to auto increment
	private int id;
	
	private String name;
	
	@Column(unique=true) // make field unique it check by hibernate
	private String no;
	
	private double cgpa;
	
	
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
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	
	
}
