package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class JsPtestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsPtestProjectApplication.class, args);
	}

}
