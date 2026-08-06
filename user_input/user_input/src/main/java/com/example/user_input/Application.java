package com.example.user_input;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.user_input.userInput.CallingAutoWired;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(Application.class, args);
		
		CallingAutoWired cals =con.getBean(CallingAutoWired.class);
		cals.calls();
		
		
	}
}
