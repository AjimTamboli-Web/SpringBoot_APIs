package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
public class E_Prototype {

	/**
	 * 
	 * 5>> Prototype Scope =>create new object every time you ask. spring create new object on each request.
	 *                       Doesn't manage life-cycle fully (no destroy)
	 *             You use when object has state/data, when you need independent instances.
	 *     Adv.- No shared data issues, Good for dynamic objects.
	 *     Dis.- More memory usage, Slower(object creation each time), Spring doesn't manage destruction.
	 *   
	 */
	
	private UUID uuid = UUID.randomUUID();
	
	E_Prototype(){
		System.out.println("class object/Bean created....");
	}
	
	public UUID getpro() {
		return uuid;
	}
	
}
