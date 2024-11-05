package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final MicroserviceClient microserviceClient;

	@Autowired
	public HelloController(MicroserviceClient microserviceClient) {
		this.microserviceClient = microserviceClient;
	}

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/testEndpoint")
	public String testEndpoint() {
		return microserviceClient.getMicroserviceData();
	}
}
