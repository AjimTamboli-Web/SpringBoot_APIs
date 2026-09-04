package com.Relation.Bidirectional.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Relation.Bidirectional.Dtos.BankDto;
import com.Relation.Bidirectional.Entity.Bank;
import com.Relation.Bidirectional.Service.Bank_service;

@RestController
@RequestMapping("/bank")
public class Bank_controller {

	@Autowired
	private Bank_service service;
	
	@PostMapping("/add")
	public String add(@RequestBody Bank bank) {
		return service.add(bank);
	}
	
	@GetMapping("/showall")
	public List<Bank> showall(){
		return service.showall();
	}
	
	@GetMapping("/show")
	public List<BankDto> show(){
		return service.show();
	}
	
	
}
