package com.spring.real;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RealApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealApplication.class, args);
	}
}
