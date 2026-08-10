package com.Requests.ControllersAnnotationsUses.Controllers;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public int id;
	public String name;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
