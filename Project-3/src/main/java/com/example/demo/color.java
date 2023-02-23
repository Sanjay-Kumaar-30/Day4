package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class color {
	private String yourFavColor="Bluish yellow";
	@GetMapping("/color")
	public String color() {
		return "My favorite color is"+yourFavColor;
	}

}
