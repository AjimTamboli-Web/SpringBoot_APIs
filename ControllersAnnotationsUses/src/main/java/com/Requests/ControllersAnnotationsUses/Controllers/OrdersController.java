package com.Requests.ControllersAnnotationsUses.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

	// get output without inputs
	@GetMapping("/getorder")
	public String getOrder() {
		return "orders";
	}
	
	// get output with inputs passing in URL
	@GetMapping("/getoname")
	public String getOrderName(@RequestParam String name) {
		return name;
	}
	
	
}
