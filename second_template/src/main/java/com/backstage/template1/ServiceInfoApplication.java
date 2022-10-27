package com.backstage.template1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@SpringBootApplication
public class ServiceInfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceInfoApplication.class, args);
	}
	@GetMapping("/day")
	String printDate(){
		return LocalDate.now().toString();
	}
}
