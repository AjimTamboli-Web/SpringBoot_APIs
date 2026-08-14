package com.Hibernate.RepositoryAnnotations.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actors {

	@Id
	private int id;
	private int boxCollections;
	private String name;
	private int salary;
	private String hitMovie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoxCollections() {
		return boxCollections;
	}
	public void setBoxCollections(int boxCollections) {
		this.boxCollections = boxCollections;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHitMovie() {
		return hitMovie;
	}
	public void setHitMovie(String hitMovie) {
		this.hitMovie = hitMovie;
	}
	
	
	
}
