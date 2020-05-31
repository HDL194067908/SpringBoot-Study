package com.boot.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.boot.controller","com.boot.service"})
@MapperScan("com.boot.dao")
public class applicationboot {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot.class, args);

	}

}
