package com.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.boot"})
public class applicationboot {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot.class, args);
	}

}
