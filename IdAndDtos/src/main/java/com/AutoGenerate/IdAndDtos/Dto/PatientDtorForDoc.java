package com.AutoGenerate.IdAndDtos.Dto;

import com.AutoGenerate.IdAndDtos.Entity.Patient;

public class PatientDtorForDoc {

	private int id;
	private String name;
	private double bill;
	
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
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	
	public static PatientDtorForDoc convert(Patient patient) {
		PatientDtorForDoc dto = new PatientDtorForDoc();
		dto.setId(patient.getId());
		dto.setName(patient.getName());
		dto.setBill(patient.getBill());
		return dto;
	}
	
}
