package com.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcutatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcutatorApplication.class, args);
		System.out.println("Actuator up and running");
	}

}
