package com.Annotations.ScopeBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Annotations.ScopeBeans.Scopes.E_Prototype;

@SpringBootApplication
public class ScopeBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopeBeansApplication.class, args);
		
		
		
	}

}
