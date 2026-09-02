package com.JPA.Relationships.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true)
	private String name;
	private int depart;
	private String services;
	private double turnover;
	private int workers;
	
	@OneToMany
	@JoinColumn(name="de_id")
	public List<Department> depa;
	

	
	public List<Department> getDepa() {
		return depa;
	}
	public void setDepa(List<Department> depa) {
		this.depa = depa;
	}
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
	public int getDepart() {
		return depart;
	}
	public void setDepart(int depart) {
		this.depart = depart;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public double getTurnover() {
		return turnover;
	}
	
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public int getWorkers() {
		return workers;
	}
	public void setWorkers(int workers) {
		this.workers = workers;
	}
	
	
	
	
	
}
