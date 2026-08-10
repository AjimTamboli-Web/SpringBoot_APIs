package com.Requests.ControllersAnnotationsUses.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A_InputTypes {

	// 1> @RequestParam =>> Used to get data from query parameters (key-value pairs)
	
	@GetMapping("/one")
	public String first(@RequestParam String name) {
		return name;
	}
	
	
	// Advanced..
	// using inside attributes of RequestParam 
	@GetMapping("/oneone")
	public String onepro(@RequestParam(required=false, defaultValue="OneOne") String name) {
		return name;
	}
	
	
	// 2> @PathVariable =>> Used to get data from URL path
	
	@GetMapping("/secon/{id}")
	public String second(@PathVariable int id) {
		return "Id is " + id ;
	}
	
	
	@GetMapping("/secondpro/{jm}")
	public String secondpro(@PathVariable(name = "jm") int id) {
		return "Id have: " + id;
	}
	
	
	// 3> @RequestBody => Used to get data from HTTP request body (JSON)	
	
	@PostMapping("/thirds")
	public String third(@RequestBody String names) {
		return names;
	}
	
}
