package com.Annotations.ScopeBeans.Scopes;

import java.lang.module.Configuration;
import java.util.UUID;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scope_Controller {

	@Autowired
	A_Singleton single;
	
	@Autowired
	B_Request requestt;
	
	@Autowired
	private ConfigurableApplicationContext context;
	
	@Autowired
	C_Session seso;
	
	@Autowired
	D_Application appWeb;
	
	@Autowired
	E_Prototype pro;
	
	@GetMapping("/first")
	public int gethashcode() {
		return single.hashCode();
	}
	
	@GetMapping("/single")
	public UUID getids() {   // Same object used everywhere
		
		System.out.println("Controller called  singleton scope");
		
		 return single.uuid;
	}
	//********************************************************************
	
	@GetMapping("/reques")
	public UUID getFromRequest() {
		
		System.out.println("Controller called request scope");
		
		return requestt.getidd();
		
//		return context.getBean(B_Request.class).getidd();   // getBean means every time you inject new dependency
	}
	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	
	@GetMapping("/sesso")
	public UUID getFromSession() {
		
		System.out.println("Controller called Session scope");
		
		return seso.getuu();
	}
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	@GetMapping("/appl")
	public UUID getFromApplication() {
		System.out.println("Controller called Application scope.");
		
		return appWeb.getapp();
	}
	//  /////////////////////////////////////////////////////////////////
	
	@GetMapping("/proto")
	public UUID getFromPrototype() {
		System.out.println("Controller called prototype scope");
		
		return pro.getpro();
	}
	
}
