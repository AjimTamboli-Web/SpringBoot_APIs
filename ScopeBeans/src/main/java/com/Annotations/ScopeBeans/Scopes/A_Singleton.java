package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class A_Singleton {

	/**
	 * 
	 * Bean = object managed by spring container
	 * Scope = how long that object lives + how many instances are created
	 * 
	 * 1>> Singleton => one object for entire application. it is default scope
	 *                 memory efficient, fast (no repeated creation)
	 *         Adv.- Less memory uses, High performance, Default (no config needed)
	 *         Dis.- Not safe for mutable data (multi thread issues), Shared state can cause bugs.
	 * 
	 */
	
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
