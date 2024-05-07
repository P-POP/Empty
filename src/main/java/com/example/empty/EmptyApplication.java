package com.example.empty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmptyApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Spring Boot!");
		SpringApplication.run(EmptyApplication.class, args);
	}

}
