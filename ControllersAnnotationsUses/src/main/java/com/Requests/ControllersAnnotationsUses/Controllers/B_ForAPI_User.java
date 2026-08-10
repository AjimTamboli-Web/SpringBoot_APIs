package com.Requests.ControllersAnnotationsUses.Controllers;

import org.springframework.stereotype.Component;

@Component
public class B_ForAPI_User {

	private int id;
	private String name;
	
	B_ForAPI_User(){
		System.out.println("Constructor created in User..");
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public B_ForAPI_User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
}

