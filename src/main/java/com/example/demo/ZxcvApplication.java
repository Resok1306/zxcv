package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZxcvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZxcvApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "spring boot";
	}
}
