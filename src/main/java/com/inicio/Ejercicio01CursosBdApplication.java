package com.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.model")
@EnableJpaRepositories(basePackages = "com.repository")
@SpringBootApplication(scanBasePackages = { "com.controller", "com.service" })
public class Ejercicio01CursosBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio01CursosBdApplication.class, args);
	}

}
