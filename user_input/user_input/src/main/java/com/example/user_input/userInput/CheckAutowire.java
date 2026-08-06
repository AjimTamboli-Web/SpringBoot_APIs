package com.example.user_input.userInput;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CheckAutowire extends Demo{

	public void greet() {
		System.out.println("Autowired greeet...");
	}
	
}
