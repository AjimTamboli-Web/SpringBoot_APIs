package com.example.user_input.userInput;

import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	public Demo(){
		System.out.println("Constructor Created...");
	}
	
	public void greet() {
		System.out.println("Good day genetlement...");
	}
}
