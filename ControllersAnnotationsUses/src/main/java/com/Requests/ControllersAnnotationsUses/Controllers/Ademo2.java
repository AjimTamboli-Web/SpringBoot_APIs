package com.Requests.ControllersAnnotationsUses.Controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ademo2 {

	
	
	@PostMapping("/addings")
	public String adding(@RequestParam(name= "id") int id, @RequestParam(name="name") String name) {
		System.out.println("Hellooo");
		return id + " " + name.toUpperCase() + " " + " Created.....";
	}
	
	@GetMapping("/getall")
	public String getting() {
		return "Displaying...";
	}
	
	@PostMapping("/addpro/{id}/{nm}/{salary}")
	public String addingpro(@PathVariable(name="nm") String name, @PathVariable(name="id") int id, @PathVariable(name="salary") double sal) {
		System.out.println("Adding called");
		return id + " : " + name + " : " + sal;
	}
	
	
	
}
