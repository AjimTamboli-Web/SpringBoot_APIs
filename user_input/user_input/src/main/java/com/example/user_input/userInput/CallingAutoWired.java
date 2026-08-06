package com.example.user_input.userInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CallingAutoWired{

	@Autowired
	Demo d;
	
//	public CallingAutoWired(Demo d)
//	{
//		this.d=d;
//	}
	
	public void calls() {
		d.greet();
	}
	
}
