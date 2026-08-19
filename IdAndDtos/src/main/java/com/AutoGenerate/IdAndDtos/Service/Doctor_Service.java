package com.AutoGenerate.IdAndDtos.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AutoGenerate.IdAndDtos.Dto.DoctorDto;
import com.AutoGenerate.IdAndDtos.Entity.Doctor;
import com.AutoGenerate.IdAndDtos.Repository.Doctor_Repo;

@Service
public class Doctor_Service {

	@Autowired
	private Doctor_Repo repo;
	
	public String create(Doctor doc) {
		repo.save(doc);
		return doc.getName()+" added";
	}
	
	public List<Doctor> showall(){
		return repo.findAll();
	}
	
	public List<DoctorDto> show(){
		List<Doctor> list = repo.findAll();
		return list.stream().map(DoctorDto::convert).collect(Collectors.toList());	
	}
	
}
