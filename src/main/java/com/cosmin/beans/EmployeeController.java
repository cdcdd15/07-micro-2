package com.cosmin.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello world updated 2 (server)", HttpStatus.OK);
	}
	
}