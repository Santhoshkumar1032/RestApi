package com.skcet.day1.Controller.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
	@Value("Santhoshkumar")
	public String name;
	
	@GetMapping("/display")
	public String displayhi()
	{
		return "Welcome "+name;
	}

}