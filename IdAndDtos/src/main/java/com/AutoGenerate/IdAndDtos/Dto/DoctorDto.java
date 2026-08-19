package com.AutoGenerate.IdAndDtos.Dto;

import java.util.List;
import java.util.stream.Collectors;

import com.AutoGenerate.IdAndDtos.Entity.Doctor;
import com.AutoGenerate.IdAndDtos.Entity.Patient;

public class DoctorDto {

	private int id;
	private String name;
	private String mail;
	
	private List<PatientDtorForDoc> patient;

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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<PatientDtorForDoc> getPatient() {
		return patient;
	}

	public void setPatient(List<PatientDtorForDoc> patient) {
		this.patient = patient;
	}
	
	public static DoctorDto convert(Doctor doc) {
		DoctorDto dto = new DoctorDto();
		dto.setId(doc.getId());
		dto.setName(doc.getName());
		dto.setMail(doc.getMail());
		List<Patient> patient = doc.getPatient();
		dto.setPatient(patient.stream().map(PatientDtorForDoc::convert).collect(Collectors.toList()));
		return dto;
	}
	
	
}
