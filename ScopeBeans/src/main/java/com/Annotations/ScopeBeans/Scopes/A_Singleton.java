package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class A_Singleton {

	UUID uuid = UUID.randomUUID();
	
	// Default scope of every bean is Singleton
	// Only ONE object is created for entire Spring container.
	
	A_Singleton(){
		System.out.println("Object called from singleton....");
	}
	
	public UUID getid() {
		return uuid;
	}
	
	
}
