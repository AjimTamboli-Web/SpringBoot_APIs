package com.AutoGenerate.IdAndDtos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoGenerate.IdAndDtos.Dto.Patient_Dto;
import com.AutoGenerate.IdAndDtos.Entity.Patient;
import com.AutoGenerate.IdAndDtos.Service.Patient_Service;

@RestController
@RequestMapping("/patient")
public class Patient_Controller {

	@Autowired
	private Patient_Service service;
	
	@PostMapping("/add")
	public String add(@RequestBody Patient pati) {
		return service.addP(pati);
	}
	
	@GetMapping("/show")
	public List<Patient_Dto> show(){
		return service.show();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delById(@PathVariable(value="id") int i) {
		return service.byId(i);
	}
	
	@PutMapping("/update/{id}/{mail}")
	public int updatByid(@PathVariable(value="id") int id, @PathVariable(value="mail")String email) {
		return service.updateMail(id, email);
	}
	
}
