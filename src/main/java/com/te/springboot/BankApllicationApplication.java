package com.te.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.te.springboot")
@EnableSwagger2
public class BankApllicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApllicationApplication.class, args);
	}

}
