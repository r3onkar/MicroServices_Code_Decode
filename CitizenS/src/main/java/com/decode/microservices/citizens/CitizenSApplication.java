package com.decode.microservices.citizens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.repository.cdi.Eager;

@SpringBootApplication

public class CitizenSApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenSApplication.class, args);
	}

}
