package com.santhosh.restapi.day2;


	

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	
	@Value("${var}")
	private String name;
	@GetMapping("/disp")
	public String getName() {
		return "Welcome "+name;
	}


}
