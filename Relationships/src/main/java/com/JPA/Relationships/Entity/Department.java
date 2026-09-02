package com.JPA.Relationships.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true)
	private String name;

	private char category;
	private int employe;
	private double payments;
	
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
	public char getCategory() {
		return category;
	}
	public void setCategory(char category) {
		this.category = category;
	}
	public int getEmploye() {
		return employe;
	}
	public void setEmploye(int employe) {
		this.employe = employe;
	}
	public double getPayments() {
		return payments;
	}
	public void setPayments(double payments) {
		this.payments = payments;
	}
	
	
	
	
	
}
