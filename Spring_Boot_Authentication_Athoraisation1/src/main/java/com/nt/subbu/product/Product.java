package com.nt.subbu.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
	@GetMapping("/hello")
	public String gerMessage () {
		return "Welcome to Subbarayudu Institute";
	}
}
