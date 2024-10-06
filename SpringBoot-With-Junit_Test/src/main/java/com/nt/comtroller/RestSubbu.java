package com.nt.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSubbu {
	@Autowired
	private WelcomeService service;

	@GetMapping("/welcome") //this method depended on service
	public ResponseEntity<String> welcome() {
		String reponse = service.getWelcomemsg();
		return new ResponseEntity<>(reponse, HttpStatus.OK);
	}

}
