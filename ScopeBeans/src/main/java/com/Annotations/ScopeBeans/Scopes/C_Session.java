package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
//@Scope(value="session")   same problem as request generate proxyMode to use in controller 
//@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)   this will work now
public class C_Session {

	private UUID uuid = UUID.randomUUID();
	
	public UUID getuu() {
		return uuid;
	}
	
}
