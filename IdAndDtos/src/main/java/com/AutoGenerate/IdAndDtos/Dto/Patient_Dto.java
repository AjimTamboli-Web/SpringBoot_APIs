package com.AutoGenerate.IdAndDtos.Dto;

import com.AutoGenerate.IdAndDtos.Entity.Doctor;
import com.AutoGenerate.IdAndDtos.Entity.Patient;

public class Patient_Dto {

	private int id;
	private String name;
	private double bill;
	
	private String doctorName;
	
	
	
//public DoctorDto getDoctor() {
//		return doctor;
//	}
//	public void setDoctor(DoctorDto doctor) {
//		this.doctor = doctor;
//	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	//	public Doctor getDoc() {
//		return doctor;
//	}
//	public void setDoc(Doctor doc) {
//		this.doctor = doc;
//	}
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
	
	public static Patient_Dto convert(Patient pati) {
		Patient_Dto dto = new Patient_Dto();
		dto.setId(pati.getId());
		dto.setName(pati.getName());
		dto.setBill(pati.getBill());
		dto.setDoctorName(pati.getDoc().getName());
		return dto;
	}
	
}
