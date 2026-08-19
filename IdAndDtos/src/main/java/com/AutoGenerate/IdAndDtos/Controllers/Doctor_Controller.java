package com.AutoGenerate.IdAndDtos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoGenerate.IdAndDtos.Dto.DoctorDto;
import com.AutoGenerate.IdAndDtos.Entity.Doctor;
import com.AutoGenerate.IdAndDtos.Service.Doctor_Service;

@RestController
@RequestMapping("/Doctor")
public class Doctor_Controller {

	@Autowired
	private Doctor_Service service;
	
	@PostMapping("/add")
	public String create(@RequestBody Doctor doc) {
		return service.create(doc);
	}
	
	@GetMapping("/get-all")
	public List<Doctor> showall(){
		return service.showall();
	}
	
	@GetMapping("/get")
	public List<DoctorDto> show(){
		return service.show();
	}
	
}
