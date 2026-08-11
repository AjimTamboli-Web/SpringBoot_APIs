package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype")
public class E_Prototype {

	private UUID uuid = UUID.randomUUID();
	
	E_Prototype(){
		System.out.println("class object/Bean created....");
	}
	
	public UUID getpro() {
		return uuid;
	}
	
}
