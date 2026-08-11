package com.Annotations.ScopeBeans.Scopes;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
//@RequestScope   // this is same as   @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
                // @Scope(value="request")  this give you error because yor restController class is singleton by default
				// if you want work use upper mention @Scope method using proxyMode
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS) // now this will work

public class B_Request {

	
	
	UUID uuid = UUID.randomUUID();
	
	B_Request(){
		System.out.println("Constructor called for bean....");
	}
	
	public UUID getidd() {
		return uuid;
	}
	
}
