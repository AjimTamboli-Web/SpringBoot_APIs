package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
//@ApplicationScope
@Scope(value ="application", proxyMode = ScopedProxyMode.TARGET_CLASS ) 

public class D_Application {

	private UUID uuid = UUID.randomUUID();
	
	public UUID getapp() {
		
		return uuid;
	}
	
}
