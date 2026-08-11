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

	/**
	 * 
	 * 3>> Session Scope =>One bean per user session.Created when session start destroyed when end.
	 *  					Use for store user-specific data (login, cart)
	 *  			Adv.- Maintains user state, Easy session handling
	 *  			Dis.- Memory heavy (many users), Not scalable in large systems
	 *  
	 */
	
	private UUID uuid = UUID.randomUUID();
	
	public UUID getuu() {
		return uuid;
	}
	
}
