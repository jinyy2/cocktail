package com.joa.cocktail.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
        
	@GetMapping("/hello")
	public static String hello(){
		return "Hello";
	}
}




