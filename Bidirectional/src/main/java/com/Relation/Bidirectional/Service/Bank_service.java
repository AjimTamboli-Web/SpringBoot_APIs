package com.Relation.Bidirectional.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Relation.Bidirectional.Dtos.BankDto;
import com.Relation.Bidirectional.Entity.Bank;
import com.Relation.Bidirectional.Repository.Bank_repo;

@Service
public class Bank_service {

	@Autowired
	private Bank_repo repo;
	
	public String add(Bank bank) {
		repo.save(bank);
		return bank.getBank_Name() + " saved..";
	}
	
	public List<Bank> showall(){
		return repo.findAll();
	}
	
	public List<BankDto> show(){
		
		return repo.findAll().stream().map(BankDto::convert).collect(Collectors.toList());
	}
	
}
