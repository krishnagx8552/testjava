package com.example.jenkins.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleJavaApi {
	
	
	@GetMapping("/api/test")
	public String helloWorld() {
		return "Hello world";
	}

}
