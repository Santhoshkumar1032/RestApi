package com.skcet.day1.FavColor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavColor {
	@Value("Green")
	public String name;
	
	@GetMapping("/Fav")
	public String displayhi()
	{
		return "My favorite color is "+name;
	}

}