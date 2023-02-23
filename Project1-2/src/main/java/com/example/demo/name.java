package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class name {
	private String studentName="Sanjay";
	@GetMapping("/name")
	public String name() {
		return "Welcome"+studentName+"!";
	}

}
