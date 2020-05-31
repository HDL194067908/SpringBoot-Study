package com.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.boot"})
//扫描实体类
@EntityScan("com.boot.pojo")
//扫描dao
@EnableJpaRepositories("com.boot.dao")
public class applicationboot {

	public static void main(String[] args) {
		SpringApplication.run(applicationboot.class, args);
	}

}
