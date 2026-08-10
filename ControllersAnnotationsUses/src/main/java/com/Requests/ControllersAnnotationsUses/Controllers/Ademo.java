package com.Requests.ControllersAnnotationsUses.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userdemo")
public class Ademo {

	@Autowired
	User user;
	 
	List<User> list = new ArrayList<>();
	
	
	@PostMapping("/add")
//	public String insert(@PathVariable(name= "id") int id,@PathVariable String name) {
	public String insert(@RequestBody User user) {
		System.out.println("Id " + user.id + " name " + user.name);
		 
		list.add(user);
		return "ID: " + user.id;
	}
	 
	@GetMapping("/get")
	public List<User> getall() {
		return list;
	}
	
}
