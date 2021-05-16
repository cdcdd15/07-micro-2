package com.cosmin.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmin.logs.StaticLogs;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MicroTwoController {

	@GetMapping("/hello-world")
	public ResponseEntity<String> hello() {
//		System.out.println("In 07-micro-2");
		StaticLogs.staticLogs(log, "from REST endpoint");
		return new ResponseEntity<String>("Hello world updated 2 (server)", HttpStatus.OK);
	}
	
}