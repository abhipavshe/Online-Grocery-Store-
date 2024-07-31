package com.abhi.OnlineGroceryStore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class welcomControlar {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to springboot project";
		
	} 

}
