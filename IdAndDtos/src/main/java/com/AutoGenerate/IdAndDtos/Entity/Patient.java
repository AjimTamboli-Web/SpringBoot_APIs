package com.AutoGenerate.IdAndDtos.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private String phone;
	private String address;
	private int age;
	private double bill;
	
	@JoinColumn(name="docid")
	@ManyToOne
	private Doctor doctor;
	
	public Doctor getDoc() {
		return doctor;
	}
	public void setDoc(Doctor doc) {
		this.doctor = doc;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	
	
	
}
