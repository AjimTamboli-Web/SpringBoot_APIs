package com.Annotations.ScopeBeans.Scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scope2_Controller {

	@Autowired
	E_Prototype pro2;
	
	@Autowired
	E_Prototype pro3;
	
	
	// for prototype and only called or inject in @RestController class annotation
}
