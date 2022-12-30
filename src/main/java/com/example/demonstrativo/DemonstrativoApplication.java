package com.example.demonstrativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class DemonstrativoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonstrativoApplication.class, args);
	}

}
