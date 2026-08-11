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

	/**
	 * 
	 * 4>> Application Scope => One bean per ServletContext(whole app).Shared across entire web app.
	 * 						  Similar to singleton but web-specific.
	 * 							It uses for Global shared data.
	 * 			Adv.- Shared across app, Good for configs
	 * 			Dis.- same problems as singleton (shared state)
	 * 
	 */
	
	private UUID uuid = UUID.randomUUID();
	
	public UUID getapp() {
		
		return uuid;
	}
	
}
