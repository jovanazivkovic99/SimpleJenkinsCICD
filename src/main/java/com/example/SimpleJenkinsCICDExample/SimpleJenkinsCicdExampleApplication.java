package com.example.SimpleJenkinsCICDExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleJenkinsCicdExampleApplication {

	@GetMapping
	public String message() {
		return "Poruka iz kontrolera";
	}
	public static void main(String[] args) {
		SpringApplication.run(SimpleJenkinsCicdExampleApplication.class, args);
	}

}
