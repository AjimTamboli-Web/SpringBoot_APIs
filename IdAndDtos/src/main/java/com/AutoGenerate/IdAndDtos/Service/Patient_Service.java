package com.AutoGenerate.IdAndDtos.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AutoGenerate.IdAndDtos.Dto.Patient_Dto;
import com.AutoGenerate.IdAndDtos.Entity.Patient;
import com.AutoGenerate.IdAndDtos.Repository.Patient_Repo;

@Service
public class Patient_Service {

	@Autowired
	private Patient_Repo repo;
	
	public String addP(Patient pati) {
		repo.save(pati);
		return pati.getName() + " added.";
	}
	
	public List<Patient_Dto> show(){	
	List<Patient> list = repo.findAll();
	return list.stream().map((patient) -> {return Patient_Dto.convert(patient);})
					.collect(Collectors.toList());
	}
	
	public String byId(int i){
		  repo.deleteById(i);
		  return "Deleted";
	}
	
	public int updateMail(int id,String email) {
		return repo.updateByName(id, email);
	}
	
	
	
}
