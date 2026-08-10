package com.Requests.ControllersAnnotationsUses.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class C_API_Ex_Controller {

	
//	
//	@GetMapping("/all")
//	public B_ForAPI_User getUser(@PathVariable int id,@PathVariable String name) {
//		return new B_ForAPI_User(id,name);
//	}
	
	@Autowired
	private B_ForAPI_User user1;
	
	//List <B_ForAPI_User> list = new ArrayList<>();
	
	@PostMapping("/add")
	public String addUser(@RequestBody  B_ForAPI_User user) {
		user1.setId(user.getId());
		user1.setName(user.getName());
		return user.getName() + " " +  user.getId();
	}
	
	@GetMapping("/all")
	public B_ForAPI_User all(){
		
		return user1;
	}
	
	
}
